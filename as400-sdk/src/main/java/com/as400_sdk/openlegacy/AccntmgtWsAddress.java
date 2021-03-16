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
public class AccntmgtWsAddress {

    @RpcField(length = 30, direction = Direction.INPUT_OUTPUT, originalName = "WS-ADDRESS-NAME", legacyType = Jt400LegacyTypes.Char.class)
    private String wsAddressName;

    @RpcField(length = 4, direction = Direction.INPUT_OUTPUT, originalName = "WS-ADDRESS-NUMBER", legacyType = Jt400LegacyTypes.Zoned.class)
    @RpcNumericField(minimumValue = 0, maximumValue = 9999, decimalPlaces = 0)
    private Integer wsAddressNumber;

    @RpcField(length = 4, direction = Direction.INPUT_OUTPUT, originalName = "WS-APPARTMENT-NUMBER", legacyType = Jt400LegacyTypes.Zoned.class)
    @RpcNumericField(minimumValue = 0, maximumValue = 9999, decimalPlaces = 0)
    private Integer wsAppartmentNumber;

    @RpcField(length = 20, direction = Direction.INPUT_OUTPUT, originalName = "WS-CITY", legacyType = Jt400LegacyTypes.Char.class)
    private String wsCity;

    @RpcField(length = 10, direction = Direction.INPUT_OUTPUT, originalName = "WS-POSTAL-CODE", legacyType = Jt400LegacyTypes.Zoned.class)
    @RpcNumericField(minimumValue = 0L, maximumValue = 9999999999L, decimalPlaces = 0)
    private Long wsPostalCode;

    @RpcField(length = 20, direction = Direction.INPUT_OUTPUT, originalName = "WS-COUNTRY", legacyType = Jt400LegacyTypes.Char.class)
    private String wsCountry;
}

