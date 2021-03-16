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
public class AccntmgtWsAccount {

    @RpcField(length = 12, direction = Direction.INPUT_OUTPUT, originalName = "WS-ACCT-NBR", legacyType = Jt400LegacyTypes.Char.class)
    private String wsAcctNbr;

    @RpcField(length = 10, direction = Direction.INPUT_OUTPUT, originalName = "WS-FIRST-NAME", legacyType = Jt400LegacyTypes.Char.class)
    private String wsFirstName;

    @RpcField(length = 10, direction = Direction.INPUT_OUTPUT, originalName = "WS-LAST-NAME", legacyType = Jt400LegacyTypes.Char.class)
    private String wsLastName;

    @RpcField(length = 2, direction = Direction.INPUT_OUTPUT, originalName = "WS-AGE", legacyType = Jt400LegacyTypes.Zoned.class)
    @RpcNumericField(minimumValue = 0, maximumValue = 99, decimalPlaces = 0)
    private Integer wsAge;

    @RpcField(length = 10, direction = Direction.INPUT_OUTPUT, originalName = "WS-ACCOUNT-ID", legacyType = Jt400LegacyTypes.Zoned.class)
    @RpcNumericField(minimumValue = 0L, maximumValue = 9999999999L, decimalPlaces = 0)
    private Long wsAccountId;

    @RpcField(direction = Direction.INPUT_OUTPUT, originalName = "WS-BIRTH-DATE")
    private AccntmgtWsBirthDate wsBirthDate;

    @RpcField(length = 1, direction = Direction.INPUT_OUTPUT, originalName = "WS-TITLE", legacyType = Jt400LegacyTypes.Zoned.class)
    @RpcNumericField(minimumValue = 0, maximumValue = 9, decimalPlaces = 0)
    private Integer wsTitle;

    @RpcField(direction = Direction.INPUT_OUTPUT, originalName = "WS-ADDRESS")
    private AccntmgtWsAddress wsAddress;

    @RpcField(direction = Direction.INPUT_OUTPUT, originalName = "WS-LOC")
    private AccntmgtWsLoc wsLoc;

    @RpcField(direction = Direction.INPUT_OUTPUT, originalName = "WS-BANK-DET")
    private AccntmgtWsBankDet wsBankDet;

    @RpcField(length = 50, direction = Direction.INPUT_OUTPUT, originalName = "WS-IBAN", legacyType = Jt400LegacyTypes.Char.class)
    private String wsIban;

    @RpcField(length = 3, direction = Direction.INPUT_OUTPUT, originalName = "WS-CUR", legacyType = Jt400LegacyTypes.Char.class)
    private String wsCur;

    @RpcField(length = 18, direction = Direction.INPUT_OUTPUT, originalName = "WS-BAL", legacyType = Jt400LegacyTypes.Zoned.class)
    @RpcNumericField(decimalPlaces = 2)
    private BigDecimal wsBal;

    @RpcField(length = 3, direction = Direction.INPUT_OUTPUT, originalName = "ACTION", legacyType = Jt400LegacyTypes.Char.class)
    private String action_;

    @RpcField(length = 4, direction = Direction.INPUT_OUTPUT, originalName = "ER-COD", legacyType = Jt400LegacyTypes.Char.class)
    private String erCod;

    @RpcField(length = 50, direction = Direction.INPUT_OUTPUT, originalName = "ER-MSG", legacyType = Jt400LegacyTypes.Char.class)
    private String erMsg;
}

