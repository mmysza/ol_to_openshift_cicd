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
public class AccntmgtWsBankDet {

    @RpcField(length = 3, direction = Direction.INPUT_OUTPUT, originalName = "WS-BANK-ID", legacyType = Jt400LegacyTypes.Zoned.class)
    @RpcNumericField(minimumValue = 0, maximumValue = 999, decimalPlaces = 0)
    private Integer wsBankId;

    @RpcField(length = 4, direction = Direction.INPUT_OUTPUT, originalName = "WS-BRANCH-ID", legacyType = Jt400LegacyTypes.Zoned.class)
    @RpcNumericField(minimumValue = 0, maximumValue = 9999, decimalPlaces = 0)
    private Integer wsBranchId;

    @RpcField(length = 2, direction = Direction.INPUT_OUTPUT, originalName = "WS-ISO-CNTRY-CD", legacyType = Jt400LegacyTypes.Char.class)
    private String wsIsoCntryCd;
}

