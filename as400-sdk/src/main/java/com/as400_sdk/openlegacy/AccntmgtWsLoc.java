package com.as400_sdk.openlegacy;

import io.vertx.core.json.JsonObject;
import org.jetbrains.annotations.NotNull;
import org.openlegacy.core.model.entity.RpcEntityDefinition;
import java.math.BigInteger;
import java.math.BigDecimal;
import java.util.List;
import java.util.Date;
import org.openlegacy.core.model.legacy.type.Jt400LegacyTypes;
import org.openlegacy.core.annotations.common.*;
import org.openlegacy.core.model.field.RpcFieldType.*;
import org.openlegacy.core.annotations.rpc.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@RpcPart
public class AccntmgtWsLoc {

    @RpcField(length = 12, direction = Direction.INPUT_OUTPUT, originalName = "WS-FEES", legacyType = Jt400LegacyTypes.Zoned.class)
    @RpcNumericField(minimumValue = 0L, maximumValue = 999999999999L, decimalPlaces = 0)
    private Long wsFees;

    @RpcField(length = 12, direction = Direction.INPUT_OUTPUT, originalName = "WS-CHARGES", legacyType = Jt400LegacyTypes.Zoned.class)
    @RpcNumericField(minimumValue = 0L, maximumValue = 999999999999L, decimalPlaces = 0)
    private Long wsCharges;

    @RpcField(length = 12, direction = Direction.INPUT_OUTPUT, originalName = "WS-WITHDRAWLS", legacyType = Jt400LegacyTypes.Zoned.class)
    @RpcNumericField(minimumValue = 0L, maximumValue = 999999999999L, decimalPlaces = 0)
    private Long wsWithdrawls;
}

