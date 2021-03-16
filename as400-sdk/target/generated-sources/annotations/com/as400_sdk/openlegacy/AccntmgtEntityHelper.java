package com.as400_sdk.openlegacy;

import io.vertx.core.json.JsonObject;
import java.lang.String;
import java.math.BigDecimal;
import java.util.Objects;
import org.jetbrains.annotations.NotNull;
import org.openlegacy.core.model.entity.RpcEntityDefinition;

final class AccntmgtEntityHelper {
    public static final RpcEntityDefinition entityDefinition;

    public static final RpcEntityDefinition inputEntityDefinition;

    public static final RpcEntityDefinition outputEntityDefinition;

    static {
        entityDefinition = new org.openlegacy.core.model.entity.RpcEntityDefinitionImpl(
                "ad256420-68ca-4edd-9c0b-5c0ee7aa0229",
                "Accntmgt",
                "com.as400_sdk.openlegacy.Accntmgt",
                "Accntmgt",
                new java.util.LinkedHashMap<String, org.openlegacy.core.model.field.RpcFieldDefinition>() {{
                put("wsAccount", new org.openlegacy.core.model.field.RpcClassFieldDefinition(
                "wsAccount",
                "com.as400_sdk.openlegacy.AccntmgtWsAccount",
                "",
                "org.openlegacy.core.model.field.RpcFieldType.General",
                false,
                314,
                false,
                new java.util.HashMap<String, String>() {{}},
                "WS-ACCOUNT",
                org.openlegacy.core.annotations.rpc.Direction.INPUT_OUTPUT,
                null,
                null,
                "org.openlegacy.core.model.legacy.type.NoneLegacyType",
                null,
                null,
                new java.util.LinkedHashMap<String, org.openlegacy.core.model.field.RpcFieldDefinition>() {{
                put("wsAcctNbr", new org.openlegacy.core.model.field.RpcStringFieldDefinition(
                "wsAcctNbr",
                "java.lang.String",
                "",
                "",
                false,
                null,
                "org.openlegacy.core.model.field.RpcFieldType.General",
                false,
                12,
                false,
                "WS-ACCT-NBR",
                org.openlegacy.core.annotations.rpc.Direction.INPUT_OUTPUT,
                null,
                "org.openlegacy.core.model.legacy.type.Jt400LegacyTypes.Char",
                new java.util.HashMap<String, String>() {{}},
                null,
                org.openlegacy.core.annotations.PaddingType.NONE,
                ""
                ));
                put("wsFirstName", new org.openlegacy.core.model.field.RpcStringFieldDefinition(
                "wsFirstName",
                "java.lang.String",
                "",
                "",
                false,
                null,
                "org.openlegacy.core.model.field.RpcFieldType.General",
                false,
                10,
                false,
                "WS-FIRST-NAME",
                org.openlegacy.core.annotations.rpc.Direction.INPUT_OUTPUT,
                null,
                "org.openlegacy.core.model.legacy.type.Jt400LegacyTypes.Char",
                new java.util.HashMap<String, String>() {{}},
                null,
                org.openlegacy.core.annotations.PaddingType.NONE,
                ""
                ));
                put("wsLastName", new org.openlegacy.core.model.field.RpcStringFieldDefinition(
                "wsLastName",
                "java.lang.String",
                "",
                "",
                false,
                null,
                "org.openlegacy.core.model.field.RpcFieldType.General",
                false,
                10,
                false,
                "WS-LAST-NAME",
                org.openlegacy.core.annotations.rpc.Direction.INPUT_OUTPUT,
                null,
                "org.openlegacy.core.model.legacy.type.Jt400LegacyTypes.Char",
                new java.util.HashMap<String, String>() {{}},
                null,
                org.openlegacy.core.annotations.PaddingType.NONE,
                ""
                ));
                put("wsAge", new org.openlegacy.core.model.field.RpcNumberFieldDefinition(
                "wsAge",
                "java.lang.Integer",
                0.0,
                99.0,
                "",
                null,
                "org.openlegacy.core.model.field.RpcFieldType.General",
                null,
                false,
                2,
                false,
                org.openlegacy.core.annotations.rpc.Direction.INPUT_OUTPUT,
                "WS-AGE",
                "org.openlegacy.core.model.legacy.type.Jt400LegacyTypes.Zoned",
                new java.util.HashMap<String, String>() {{}},
                null,
                0,
                0
                ));
                put("wsAccountId", new org.openlegacy.core.model.field.RpcNumberFieldDefinition(
                "wsAccountId",
                "java.lang.Long",
                0.0,
                9.999999999E9,
                "",
                null,
                "org.openlegacy.core.model.field.RpcFieldType.General",
                null,
                false,
                10,
                false,
                org.openlegacy.core.annotations.rpc.Direction.INPUT_OUTPUT,
                "WS-ACCOUNT-ID",
                "org.openlegacy.core.model.legacy.type.Jt400LegacyTypes.Zoned",
                new java.util.HashMap<String, String>() {{}},
                null,
                0,
                0
                ));
                put("wsBirthDate", new org.openlegacy.core.model.field.RpcClassFieldDefinition(
                "wsBirthDate",
                "com.as400_sdk.openlegacy.AccntmgtWsBirthDate",
                "",
                "org.openlegacy.core.model.field.RpcFieldType.General",
                false,
                8,
                false,
                new java.util.HashMap<String, String>() {{}},
                "WS-BIRTH-DATE",
                org.openlegacy.core.annotations.rpc.Direction.INPUT_OUTPUT,
                null,
                null,
                "org.openlegacy.core.model.legacy.type.NoneLegacyType",
                null,
                null,
                new java.util.LinkedHashMap<String, org.openlegacy.core.model.field.RpcFieldDefinition>() {{
                put("wsYear", new org.openlegacy.core.model.field.RpcNumberFieldDefinition(
                "wsYear",
                "java.lang.Integer",
                0.0,
                9999.0,
                "",
                null,
                "org.openlegacy.core.model.field.RpcFieldType.General",
                null,
                false,
                4,
                false,
                org.openlegacy.core.annotations.rpc.Direction.INPUT_OUTPUT,
                "WS-YEAR",
                "org.openlegacy.core.model.legacy.type.Jt400LegacyTypes.Zoned",
                new java.util.HashMap<String, String>() {{}},
                null,
                0,
                0
                ));
                put("wsMonth", new org.openlegacy.core.model.field.RpcNumberFieldDefinition(
                "wsMonth",
                "java.lang.Integer",
                0.0,
                99.0,
                "",
                null,
                "org.openlegacy.core.model.field.RpcFieldType.General",
                null,
                false,
                2,
                false,
                org.openlegacy.core.annotations.rpc.Direction.INPUT_OUTPUT,
                "WS-MONTH",
                "org.openlegacy.core.model.legacy.type.Jt400LegacyTypes.Zoned",
                new java.util.HashMap<String, String>() {{}},
                null,
                0,
                0
                ));
                put("wsDay", new org.openlegacy.core.model.field.RpcNumberFieldDefinition(
                "wsDay",
                "java.lang.Integer",
                0.0,
                99.0,
                "",
                null,
                "org.openlegacy.core.model.field.RpcFieldType.General",
                null,
                false,
                2,
                false,
                org.openlegacy.core.annotations.rpc.Direction.INPUT_OUTPUT,
                "WS-DAY",
                "org.openlegacy.core.model.legacy.type.Jt400LegacyTypes.Zoned",
                new java.util.HashMap<String, String>() {{}},
                null,
                0,
                0
                ));
                }}
                ));
                put("wsTitle", new org.openlegacy.core.model.field.RpcNumberFieldDefinition(
                "wsTitle",
                "java.lang.Integer",
                0.0,
                9.0,
                "",
                null,
                "org.openlegacy.core.model.field.RpcFieldType.General",
                null,
                false,
                1,
                false,
                org.openlegacy.core.annotations.rpc.Direction.INPUT_OUTPUT,
                "WS-TITLE",
                "org.openlegacy.core.model.legacy.type.Jt400LegacyTypes.Zoned",
                new java.util.HashMap<String, String>() {{}},
                null,
                0,
                0
                ));
                put("wsAddress", new org.openlegacy.core.model.field.RpcClassFieldDefinition(
                "wsAddress",
                "com.as400_sdk.openlegacy.AccntmgtWsAddress",
                "",
                "org.openlegacy.core.model.field.RpcFieldType.General",
                false,
                88,
                false,
                new java.util.HashMap<String, String>() {{}},
                "WS-ADDRESS",
                org.openlegacy.core.annotations.rpc.Direction.INPUT_OUTPUT,
                null,
                null,
                "org.openlegacy.core.model.legacy.type.NoneLegacyType",
                null,
                null,
                new java.util.LinkedHashMap<String, org.openlegacy.core.model.field.RpcFieldDefinition>() {{
                put("wsAddressName", new org.openlegacy.core.model.field.RpcStringFieldDefinition(
                "wsAddressName",
                "java.lang.String",
                "",
                "",
                false,
                null,
                "org.openlegacy.core.model.field.RpcFieldType.General",
                false,
                30,
                false,
                "WS-ADDRESS-NAME",
                org.openlegacy.core.annotations.rpc.Direction.INPUT_OUTPUT,
                null,
                "org.openlegacy.core.model.legacy.type.Jt400LegacyTypes.Char",
                new java.util.HashMap<String, String>() {{}},
                null,
                org.openlegacy.core.annotations.PaddingType.NONE,
                ""
                ));
                put("wsAddressNumber", new org.openlegacy.core.model.field.RpcNumberFieldDefinition(
                "wsAddressNumber",
                "java.lang.Integer",
                0.0,
                9999.0,
                "",
                null,
                "org.openlegacy.core.model.field.RpcFieldType.General",
                null,
                false,
                4,
                false,
                org.openlegacy.core.annotations.rpc.Direction.INPUT_OUTPUT,
                "WS-ADDRESS-NUMBER",
                "org.openlegacy.core.model.legacy.type.Jt400LegacyTypes.Zoned",
                new java.util.HashMap<String, String>() {{}},
                null,
                0,
                0
                ));
                put("wsAppartmentNumber", new org.openlegacy.core.model.field.RpcNumberFieldDefinition(
                "wsAppartmentNumber",
                "java.lang.Integer",
                0.0,
                9999.0,
                "",
                null,
                "org.openlegacy.core.model.field.RpcFieldType.General",
                null,
                false,
                4,
                false,
                org.openlegacy.core.annotations.rpc.Direction.INPUT_OUTPUT,
                "WS-APPARTMENT-NUMBER",
                "org.openlegacy.core.model.legacy.type.Jt400LegacyTypes.Zoned",
                new java.util.HashMap<String, String>() {{}},
                null,
                0,
                0
                ));
                put("wsCity", new org.openlegacy.core.model.field.RpcStringFieldDefinition(
                "wsCity",
                "java.lang.String",
                "",
                "",
                false,
                null,
                "org.openlegacy.core.model.field.RpcFieldType.General",
                false,
                20,
                false,
                "WS-CITY",
                org.openlegacy.core.annotations.rpc.Direction.INPUT_OUTPUT,
                null,
                "org.openlegacy.core.model.legacy.type.Jt400LegacyTypes.Char",
                new java.util.HashMap<String, String>() {{}},
                null,
                org.openlegacy.core.annotations.PaddingType.NONE,
                ""
                ));
                put("wsPostalCode", new org.openlegacy.core.model.field.RpcNumberFieldDefinition(
                "wsPostalCode",
                "java.lang.Long",
                0.0,
                9.999999999E9,
                "",
                null,
                "org.openlegacy.core.model.field.RpcFieldType.General",
                null,
                false,
                10,
                false,
                org.openlegacy.core.annotations.rpc.Direction.INPUT_OUTPUT,
                "WS-POSTAL-CODE",
                "org.openlegacy.core.model.legacy.type.Jt400LegacyTypes.Zoned",
                new java.util.HashMap<String, String>() {{}},
                null,
                0,
                0
                ));
                put("wsCountry", new org.openlegacy.core.model.field.RpcStringFieldDefinition(
                "wsCountry",
                "java.lang.String",
                "",
                "",
                false,
                null,
                "org.openlegacy.core.model.field.RpcFieldType.General",
                false,
                20,
                false,
                "WS-COUNTRY",
                org.openlegacy.core.annotations.rpc.Direction.INPUT_OUTPUT,
                null,
                "org.openlegacy.core.model.legacy.type.Jt400LegacyTypes.Char",
                new java.util.HashMap<String, String>() {{}},
                null,
                org.openlegacy.core.annotations.PaddingType.NONE,
                ""
                ));
                }}
                ));
                put("wsLoc", new org.openlegacy.core.model.field.RpcClassFieldDefinition(
                "wsLoc",
                "com.as400_sdk.openlegacy.AccntmgtWsLoc",
                "",
                "org.openlegacy.core.model.field.RpcFieldType.General",
                false,
                36,
                false,
                new java.util.HashMap<String, String>() {{}},
                "WS-LOC",
                org.openlegacy.core.annotations.rpc.Direction.INPUT_OUTPUT,
                null,
                null,
                "org.openlegacy.core.model.legacy.type.NoneLegacyType",
                null,
                null,
                new java.util.LinkedHashMap<String, org.openlegacy.core.model.field.RpcFieldDefinition>() {{
                put("wsFees", new org.openlegacy.core.model.field.RpcNumberFieldDefinition(
                "wsFees",
                "java.lang.Long",
                0.0,
                9.99999999999E11,
                "",
                null,
                "org.openlegacy.core.model.field.RpcFieldType.General",
                null,
                false,
                12,
                false,
                org.openlegacy.core.annotations.rpc.Direction.INPUT_OUTPUT,
                "WS-FEES",
                "org.openlegacy.core.model.legacy.type.Jt400LegacyTypes.Zoned",
                new java.util.HashMap<String, String>() {{}},
                null,
                0,
                0
                ));
                put("wsCharges", new org.openlegacy.core.model.field.RpcNumberFieldDefinition(
                "wsCharges",
                "java.lang.Long",
                0.0,
                9.99999999999E11,
                "",
                null,
                "org.openlegacy.core.model.field.RpcFieldType.General",
                null,
                false,
                12,
                false,
                org.openlegacy.core.annotations.rpc.Direction.INPUT_OUTPUT,
                "WS-CHARGES",
                "org.openlegacy.core.model.legacy.type.Jt400LegacyTypes.Zoned",
                new java.util.HashMap<String, String>() {{}},
                null,
                0,
                0
                ));
                put("wsWithdrawls", new org.openlegacy.core.model.field.RpcNumberFieldDefinition(
                "wsWithdrawls",
                "java.lang.Long",
                0.0,
                9.99999999999E11,
                "",
                null,
                "org.openlegacy.core.model.field.RpcFieldType.General",
                null,
                false,
                12,
                false,
                org.openlegacy.core.annotations.rpc.Direction.INPUT_OUTPUT,
                "WS-WITHDRAWLS",
                "org.openlegacy.core.model.legacy.type.Jt400LegacyTypes.Zoned",
                new java.util.HashMap<String, String>() {{}},
                null,
                0,
                0
                ));
                }}
                ));
                put("wsBankDet", new org.openlegacy.core.model.field.RpcClassFieldDefinition(
                "wsBankDet",
                "com.as400_sdk.openlegacy.AccntmgtWsBankDet",
                "",
                "org.openlegacy.core.model.field.RpcFieldType.General",
                false,
                9,
                false,
                new java.util.HashMap<String, String>() {{}},
                "WS-BANK-DET",
                org.openlegacy.core.annotations.rpc.Direction.INPUT_OUTPUT,
                null,
                null,
                "org.openlegacy.core.model.legacy.type.NoneLegacyType",
                null,
                null,
                new java.util.LinkedHashMap<String, org.openlegacy.core.model.field.RpcFieldDefinition>() {{
                put("wsBankId", new org.openlegacy.core.model.field.RpcNumberFieldDefinition(
                "wsBankId",
                "java.lang.Integer",
                0.0,
                999.0,
                "",
                null,
                "org.openlegacy.core.model.field.RpcFieldType.General",
                null,
                false,
                3,
                false,
                org.openlegacy.core.annotations.rpc.Direction.INPUT_OUTPUT,
                "WS-BANK-ID",
                "org.openlegacy.core.model.legacy.type.Jt400LegacyTypes.Zoned",
                new java.util.HashMap<String, String>() {{}},
                null,
                0,
                0
                ));
                put("wsBranchId", new org.openlegacy.core.model.field.RpcNumberFieldDefinition(
                "wsBranchId",
                "java.lang.Integer",
                0.0,
                9999.0,
                "",
                null,
                "org.openlegacy.core.model.field.RpcFieldType.General",
                null,
                false,
                4,
                false,
                org.openlegacy.core.annotations.rpc.Direction.INPUT_OUTPUT,
                "WS-BRANCH-ID",
                "org.openlegacy.core.model.legacy.type.Jt400LegacyTypes.Zoned",
                new java.util.HashMap<String, String>() {{}},
                null,
                0,
                0
                ));
                put("wsIsoCntryCd", new org.openlegacy.core.model.field.RpcStringFieldDefinition(
                "wsIsoCntryCd",
                "java.lang.String",
                "",
                "",
                false,
                null,
                "org.openlegacy.core.model.field.RpcFieldType.General",
                false,
                2,
                false,
                "WS-ISO-CNTRY-CD",
                org.openlegacy.core.annotations.rpc.Direction.INPUT_OUTPUT,
                null,
                "org.openlegacy.core.model.legacy.type.Jt400LegacyTypes.Char",
                new java.util.HashMap<String, String>() {{}},
                null,
                org.openlegacy.core.annotations.PaddingType.NONE,
                ""
                ));
                }}
                ));
                put("wsIban", new org.openlegacy.core.model.field.RpcStringFieldDefinition(
                "wsIban",
                "java.lang.String",
                "",
                "",
                false,
                null,
                "org.openlegacy.core.model.field.RpcFieldType.General",
                false,
                50,
                false,
                "WS-IBAN",
                org.openlegacy.core.annotations.rpc.Direction.INPUT_OUTPUT,
                null,
                "org.openlegacy.core.model.legacy.type.Jt400LegacyTypes.Char",
                new java.util.HashMap<String, String>() {{}},
                null,
                org.openlegacy.core.annotations.PaddingType.NONE,
                ""
                ));
                put("wsCur", new org.openlegacy.core.model.field.RpcStringFieldDefinition(
                "wsCur",
                "java.lang.String",
                "",
                "",
                false,
                null,
                "org.openlegacy.core.model.field.RpcFieldType.General",
                false,
                3,
                false,
                "WS-CUR",
                org.openlegacy.core.annotations.rpc.Direction.INPUT_OUTPUT,
                null,
                "org.openlegacy.core.model.legacy.type.Jt400LegacyTypes.Char",
                new java.util.HashMap<String, String>() {{}},
                null,
                org.openlegacy.core.annotations.PaddingType.NONE,
                ""
                ));
                put("wsBal", new org.openlegacy.core.model.field.RpcNumberFieldDefinition(
                "wsBal",
                "java.math.BigDecimal",
                -1.7976931348623157E308,
                1.7976931348623157E308,
                "",
                null,
                "org.openlegacy.core.model.field.RpcFieldType.General",
                null,
                false,
                18,
                false,
                org.openlegacy.core.annotations.rpc.Direction.INPUT_OUTPUT,
                "WS-BAL",
                "org.openlegacy.core.model.legacy.type.Jt400LegacyTypes.Zoned",
                new java.util.HashMap<String, String>() {{}},
                null,
                2,
                0
                ));
                put("action_", new org.openlegacy.core.model.field.RpcStringFieldDefinition(
                "action_",
                "java.lang.String",
                "",
                "",
                false,
                null,
                "org.openlegacy.core.model.field.RpcFieldType.General",
                false,
                3,
                false,
                "ACTION",
                org.openlegacy.core.annotations.rpc.Direction.INPUT_OUTPUT,
                null,
                "org.openlegacy.core.model.legacy.type.Jt400LegacyTypes.Char",
                new java.util.HashMap<String, String>() {{}},
                null,
                org.openlegacy.core.annotations.PaddingType.NONE,
                ""
                ));
                put("erCod", new org.openlegacy.core.model.field.RpcStringFieldDefinition(
                "erCod",
                "java.lang.String",
                "",
                "",
                false,
                null,
                "org.openlegacy.core.model.field.RpcFieldType.General",
                false,
                4,
                false,
                "ER-COD",
                org.openlegacy.core.annotations.rpc.Direction.INPUT_OUTPUT,
                null,
                "org.openlegacy.core.model.legacy.type.Jt400LegacyTypes.Char",
                new java.util.HashMap<String, String>() {{}},
                null,
                org.openlegacy.core.annotations.PaddingType.NONE,
                ""
                ));
                put("erMsg", new org.openlegacy.core.model.field.RpcStringFieldDefinition(
                "erMsg",
                "java.lang.String",
                "",
                "",
                false,
                null,
                "org.openlegacy.core.model.field.RpcFieldType.General",
                false,
                50,
                false,
                "ER-MSG",
                org.openlegacy.core.annotations.rpc.Direction.INPUT_OUTPUT,
                null,
                "org.openlegacy.core.model.legacy.type.Jt400LegacyTypes.Char",
                new java.util.HashMap<String, String>() {{}},
                null,
                org.openlegacy.core.annotations.PaddingType.NONE,
                ""
                ));
                }}
                ));
                }},
                null,
                new java.util.HashMap<String, String>() {{}},
                java.util.Arrays.asList(new org.openlegacy.core.model.entity.RpcActionDefinition[]{
                new org.openlegacy.core.model.entity.RpcActionDefinition(
                new org.openlegacy.core.rpc.actions.RpcActions.EXECUTE(),
                "execute",
                "Execute",
                "/QSYS.LIB/OPENLEGA11.LIB/ACCNTMGT.PGM",
                new java.util.HashMap<String, String>() {{}}
                )
                }),
                java.util.Arrays.asList(new java.lang.String[]{}),
                "",
                org.openlegacy.core.definitions.BackendSolution.OTHER
                );
        inputEntityDefinition = new org.openlegacy.core.model.entity.RpcEntityDefinitionImpl(
                "ad256420-68ca-4edd-9c0b-5c0ee7aa0229",
                "Accntmgt",
                "com.as400_sdk.openlegacy.Accntmgt",
                "Accntmgt",
                new java.util.LinkedHashMap<String, org.openlegacy.core.model.field.RpcFieldDefinition>() {{
                put("wsAccount", new org.openlegacy.core.model.field.RpcClassFieldDefinition(
                "wsAccount",
                "com.as400_sdk.openlegacy.AccntmgtWsAccount",
                "",
                "org.openlegacy.core.model.field.RpcFieldType.General",
                false,
                314,
                false,
                new java.util.HashMap<String, String>() {{}},
                "WS-ACCOUNT",
                org.openlegacy.core.annotations.rpc.Direction.INPUT_OUTPUT,
                null,
                null,
                "org.openlegacy.core.model.legacy.type.NoneLegacyType",
                null,
                null,
                new java.util.LinkedHashMap<String, org.openlegacy.core.model.field.RpcFieldDefinition>() {{
                put("wsAcctNbr", new org.openlegacy.core.model.field.RpcStringFieldDefinition(
                "wsAcctNbr",
                "java.lang.String",
                "",
                "",
                false,
                null,
                "org.openlegacy.core.model.field.RpcFieldType.General",
                false,
                12,
                false,
                "WS-ACCT-NBR",
                org.openlegacy.core.annotations.rpc.Direction.INPUT_OUTPUT,
                null,
                "org.openlegacy.core.model.legacy.type.Jt400LegacyTypes.Char",
                new java.util.HashMap<String, String>() {{}},
                null,
                org.openlegacy.core.annotations.PaddingType.NONE,
                ""
                ));
                put("wsFirstName", new org.openlegacy.core.model.field.RpcStringFieldDefinition(
                "wsFirstName",
                "java.lang.String",
                "",
                "",
                false,
                null,
                "org.openlegacy.core.model.field.RpcFieldType.General",
                false,
                10,
                false,
                "WS-FIRST-NAME",
                org.openlegacy.core.annotations.rpc.Direction.INPUT_OUTPUT,
                null,
                "org.openlegacy.core.model.legacy.type.Jt400LegacyTypes.Char",
                new java.util.HashMap<String, String>() {{}},
                null,
                org.openlegacy.core.annotations.PaddingType.NONE,
                ""
                ));
                put("wsLastName", new org.openlegacy.core.model.field.RpcStringFieldDefinition(
                "wsLastName",
                "java.lang.String",
                "",
                "",
                false,
                null,
                "org.openlegacy.core.model.field.RpcFieldType.General",
                false,
                10,
                false,
                "WS-LAST-NAME",
                org.openlegacy.core.annotations.rpc.Direction.INPUT_OUTPUT,
                null,
                "org.openlegacy.core.model.legacy.type.Jt400LegacyTypes.Char",
                new java.util.HashMap<String, String>() {{}},
                null,
                org.openlegacy.core.annotations.PaddingType.NONE,
                ""
                ));
                put("wsAge", new org.openlegacy.core.model.field.RpcNumberFieldDefinition(
                "wsAge",
                "java.lang.Integer",
                0.0,
                99.0,
                "",
                null,
                "org.openlegacy.core.model.field.RpcFieldType.General",
                null,
                false,
                2,
                false,
                org.openlegacy.core.annotations.rpc.Direction.INPUT_OUTPUT,
                "WS-AGE",
                "org.openlegacy.core.model.legacy.type.Jt400LegacyTypes.Zoned",
                new java.util.HashMap<String, String>() {{}},
                null,
                0,
                0
                ));
                put("wsAccountId", new org.openlegacy.core.model.field.RpcNumberFieldDefinition(
                "wsAccountId",
                "java.lang.Long",
                0.0,
                9.999999999E9,
                "",
                null,
                "org.openlegacy.core.model.field.RpcFieldType.General",
                null,
                false,
                10,
                false,
                org.openlegacy.core.annotations.rpc.Direction.INPUT_OUTPUT,
                "WS-ACCOUNT-ID",
                "org.openlegacy.core.model.legacy.type.Jt400LegacyTypes.Zoned",
                new java.util.HashMap<String, String>() {{}},
                null,
                0,
                0
                ));
                put("wsBirthDate", new org.openlegacy.core.model.field.RpcClassFieldDefinition(
                "wsBirthDate",
                "com.as400_sdk.openlegacy.AccntmgtWsBirthDate",
                "",
                "org.openlegacy.core.model.field.RpcFieldType.General",
                false,
                8,
                false,
                new java.util.HashMap<String, String>() {{}},
                "WS-BIRTH-DATE",
                org.openlegacy.core.annotations.rpc.Direction.INPUT_OUTPUT,
                null,
                null,
                "org.openlegacy.core.model.legacy.type.NoneLegacyType",
                null,
                null,
                new java.util.LinkedHashMap<String, org.openlegacy.core.model.field.RpcFieldDefinition>() {{
                put("wsYear", new org.openlegacy.core.model.field.RpcNumberFieldDefinition(
                "wsYear",
                "java.lang.Integer",
                0.0,
                9999.0,
                "",
                null,
                "org.openlegacy.core.model.field.RpcFieldType.General",
                null,
                false,
                4,
                false,
                org.openlegacy.core.annotations.rpc.Direction.INPUT_OUTPUT,
                "WS-YEAR",
                "org.openlegacy.core.model.legacy.type.Jt400LegacyTypes.Zoned",
                new java.util.HashMap<String, String>() {{}},
                null,
                0,
                0
                ));
                put("wsMonth", new org.openlegacy.core.model.field.RpcNumberFieldDefinition(
                "wsMonth",
                "java.lang.Integer",
                0.0,
                99.0,
                "",
                null,
                "org.openlegacy.core.model.field.RpcFieldType.General",
                null,
                false,
                2,
                false,
                org.openlegacy.core.annotations.rpc.Direction.INPUT_OUTPUT,
                "WS-MONTH",
                "org.openlegacy.core.model.legacy.type.Jt400LegacyTypes.Zoned",
                new java.util.HashMap<String, String>() {{}},
                null,
                0,
                0
                ));
                put("wsDay", new org.openlegacy.core.model.field.RpcNumberFieldDefinition(
                "wsDay",
                "java.lang.Integer",
                0.0,
                99.0,
                "",
                null,
                "org.openlegacy.core.model.field.RpcFieldType.General",
                null,
                false,
                2,
                false,
                org.openlegacy.core.annotations.rpc.Direction.INPUT_OUTPUT,
                "WS-DAY",
                "org.openlegacy.core.model.legacy.type.Jt400LegacyTypes.Zoned",
                new java.util.HashMap<String, String>() {{}},
                null,
                0,
                0
                ));
                }}
                ));
                put("wsTitle", new org.openlegacy.core.model.field.RpcNumberFieldDefinition(
                "wsTitle",
                "java.lang.Integer",
                0.0,
                9.0,
                "",
                null,
                "org.openlegacy.core.model.field.RpcFieldType.General",
                null,
                false,
                1,
                false,
                org.openlegacy.core.annotations.rpc.Direction.INPUT_OUTPUT,
                "WS-TITLE",
                "org.openlegacy.core.model.legacy.type.Jt400LegacyTypes.Zoned",
                new java.util.HashMap<String, String>() {{}},
                null,
                0,
                0
                ));
                put("wsAddress", new org.openlegacy.core.model.field.RpcClassFieldDefinition(
                "wsAddress",
                "com.as400_sdk.openlegacy.AccntmgtWsAddress",
                "",
                "org.openlegacy.core.model.field.RpcFieldType.General",
                false,
                88,
                false,
                new java.util.HashMap<String, String>() {{}},
                "WS-ADDRESS",
                org.openlegacy.core.annotations.rpc.Direction.INPUT_OUTPUT,
                null,
                null,
                "org.openlegacy.core.model.legacy.type.NoneLegacyType",
                null,
                null,
                new java.util.LinkedHashMap<String, org.openlegacy.core.model.field.RpcFieldDefinition>() {{
                put("wsAddressName", new org.openlegacy.core.model.field.RpcStringFieldDefinition(
                "wsAddressName",
                "java.lang.String",
                "",
                "",
                false,
                null,
                "org.openlegacy.core.model.field.RpcFieldType.General",
                false,
                30,
                false,
                "WS-ADDRESS-NAME",
                org.openlegacy.core.annotations.rpc.Direction.INPUT_OUTPUT,
                null,
                "org.openlegacy.core.model.legacy.type.Jt400LegacyTypes.Char",
                new java.util.HashMap<String, String>() {{}},
                null,
                org.openlegacy.core.annotations.PaddingType.NONE,
                ""
                ));
                put("wsAddressNumber", new org.openlegacy.core.model.field.RpcNumberFieldDefinition(
                "wsAddressNumber",
                "java.lang.Integer",
                0.0,
                9999.0,
                "",
                null,
                "org.openlegacy.core.model.field.RpcFieldType.General",
                null,
                false,
                4,
                false,
                org.openlegacy.core.annotations.rpc.Direction.INPUT_OUTPUT,
                "WS-ADDRESS-NUMBER",
                "org.openlegacy.core.model.legacy.type.Jt400LegacyTypes.Zoned",
                new java.util.HashMap<String, String>() {{}},
                null,
                0,
                0
                ));
                put("wsAppartmentNumber", new org.openlegacy.core.model.field.RpcNumberFieldDefinition(
                "wsAppartmentNumber",
                "java.lang.Integer",
                0.0,
                9999.0,
                "",
                null,
                "org.openlegacy.core.model.field.RpcFieldType.General",
                null,
                false,
                4,
                false,
                org.openlegacy.core.annotations.rpc.Direction.INPUT_OUTPUT,
                "WS-APPARTMENT-NUMBER",
                "org.openlegacy.core.model.legacy.type.Jt400LegacyTypes.Zoned",
                new java.util.HashMap<String, String>() {{}},
                null,
                0,
                0
                ));
                put("wsCity", new org.openlegacy.core.model.field.RpcStringFieldDefinition(
                "wsCity",
                "java.lang.String",
                "",
                "",
                false,
                null,
                "org.openlegacy.core.model.field.RpcFieldType.General",
                false,
                20,
                false,
                "WS-CITY",
                org.openlegacy.core.annotations.rpc.Direction.INPUT_OUTPUT,
                null,
                "org.openlegacy.core.model.legacy.type.Jt400LegacyTypes.Char",
                new java.util.HashMap<String, String>() {{}},
                null,
                org.openlegacy.core.annotations.PaddingType.NONE,
                ""
                ));
                put("wsPostalCode", new org.openlegacy.core.model.field.RpcNumberFieldDefinition(
                "wsPostalCode",
                "java.lang.Long",
                0.0,
                9.999999999E9,
                "",
                null,
                "org.openlegacy.core.model.field.RpcFieldType.General",
                null,
                false,
                10,
                false,
                org.openlegacy.core.annotations.rpc.Direction.INPUT_OUTPUT,
                "WS-POSTAL-CODE",
                "org.openlegacy.core.model.legacy.type.Jt400LegacyTypes.Zoned",
                new java.util.HashMap<String, String>() {{}},
                null,
                0,
                0
                ));
                put("wsCountry", new org.openlegacy.core.model.field.RpcStringFieldDefinition(
                "wsCountry",
                "java.lang.String",
                "",
                "",
                false,
                null,
                "org.openlegacy.core.model.field.RpcFieldType.General",
                false,
                20,
                false,
                "WS-COUNTRY",
                org.openlegacy.core.annotations.rpc.Direction.INPUT_OUTPUT,
                null,
                "org.openlegacy.core.model.legacy.type.Jt400LegacyTypes.Char",
                new java.util.HashMap<String, String>() {{}},
                null,
                org.openlegacy.core.annotations.PaddingType.NONE,
                ""
                ));
                }}
                ));
                put("wsLoc", new org.openlegacy.core.model.field.RpcClassFieldDefinition(
                "wsLoc",
                "com.as400_sdk.openlegacy.AccntmgtWsLoc",
                "",
                "org.openlegacy.core.model.field.RpcFieldType.General",
                false,
                36,
                false,
                new java.util.HashMap<String, String>() {{}},
                "WS-LOC",
                org.openlegacy.core.annotations.rpc.Direction.INPUT_OUTPUT,
                null,
                null,
                "org.openlegacy.core.model.legacy.type.NoneLegacyType",
                null,
                null,
                new java.util.LinkedHashMap<String, org.openlegacy.core.model.field.RpcFieldDefinition>() {{
                put("wsFees", new org.openlegacy.core.model.field.RpcNumberFieldDefinition(
                "wsFees",
                "java.lang.Long",
                0.0,
                9.99999999999E11,
                "",
                null,
                "org.openlegacy.core.model.field.RpcFieldType.General",
                null,
                false,
                12,
                false,
                org.openlegacy.core.annotations.rpc.Direction.INPUT_OUTPUT,
                "WS-FEES",
                "org.openlegacy.core.model.legacy.type.Jt400LegacyTypes.Zoned",
                new java.util.HashMap<String, String>() {{}},
                null,
                0,
                0
                ));
                put("wsCharges", new org.openlegacy.core.model.field.RpcNumberFieldDefinition(
                "wsCharges",
                "java.lang.Long",
                0.0,
                9.99999999999E11,
                "",
                null,
                "org.openlegacy.core.model.field.RpcFieldType.General",
                null,
                false,
                12,
                false,
                org.openlegacy.core.annotations.rpc.Direction.INPUT_OUTPUT,
                "WS-CHARGES",
                "org.openlegacy.core.model.legacy.type.Jt400LegacyTypes.Zoned",
                new java.util.HashMap<String, String>() {{}},
                null,
                0,
                0
                ));
                put("wsWithdrawls", new org.openlegacy.core.model.field.RpcNumberFieldDefinition(
                "wsWithdrawls",
                "java.lang.Long",
                0.0,
                9.99999999999E11,
                "",
                null,
                "org.openlegacy.core.model.field.RpcFieldType.General",
                null,
                false,
                12,
                false,
                org.openlegacy.core.annotations.rpc.Direction.INPUT_OUTPUT,
                "WS-WITHDRAWLS",
                "org.openlegacy.core.model.legacy.type.Jt400LegacyTypes.Zoned",
                new java.util.HashMap<String, String>() {{}},
                null,
                0,
                0
                ));
                }}
                ));
                put("wsBankDet", new org.openlegacy.core.model.field.RpcClassFieldDefinition(
                "wsBankDet",
                "com.as400_sdk.openlegacy.AccntmgtWsBankDet",
                "",
                "org.openlegacy.core.model.field.RpcFieldType.General",
                false,
                9,
                false,
                new java.util.HashMap<String, String>() {{}},
                "WS-BANK-DET",
                org.openlegacy.core.annotations.rpc.Direction.INPUT_OUTPUT,
                null,
                null,
                "org.openlegacy.core.model.legacy.type.NoneLegacyType",
                null,
                null,
                new java.util.LinkedHashMap<String, org.openlegacy.core.model.field.RpcFieldDefinition>() {{
                put("wsBankId", new org.openlegacy.core.model.field.RpcNumberFieldDefinition(
                "wsBankId",
                "java.lang.Integer",
                0.0,
                999.0,
                "",
                null,
                "org.openlegacy.core.model.field.RpcFieldType.General",
                null,
                false,
                3,
                false,
                org.openlegacy.core.annotations.rpc.Direction.INPUT_OUTPUT,
                "WS-BANK-ID",
                "org.openlegacy.core.model.legacy.type.Jt400LegacyTypes.Zoned",
                new java.util.HashMap<String, String>() {{}},
                null,
                0,
                0
                ));
                put("wsBranchId", new org.openlegacy.core.model.field.RpcNumberFieldDefinition(
                "wsBranchId",
                "java.lang.Integer",
                0.0,
                9999.0,
                "",
                null,
                "org.openlegacy.core.model.field.RpcFieldType.General",
                null,
                false,
                4,
                false,
                org.openlegacy.core.annotations.rpc.Direction.INPUT_OUTPUT,
                "WS-BRANCH-ID",
                "org.openlegacy.core.model.legacy.type.Jt400LegacyTypes.Zoned",
                new java.util.HashMap<String, String>() {{}},
                null,
                0,
                0
                ));
                put("wsIsoCntryCd", new org.openlegacy.core.model.field.RpcStringFieldDefinition(
                "wsIsoCntryCd",
                "java.lang.String",
                "",
                "",
                false,
                null,
                "org.openlegacy.core.model.field.RpcFieldType.General",
                false,
                2,
                false,
                "WS-ISO-CNTRY-CD",
                org.openlegacy.core.annotations.rpc.Direction.INPUT_OUTPUT,
                null,
                "org.openlegacy.core.model.legacy.type.Jt400LegacyTypes.Char",
                new java.util.HashMap<String, String>() {{}},
                null,
                org.openlegacy.core.annotations.PaddingType.NONE,
                ""
                ));
                }}
                ));
                put("wsIban", new org.openlegacy.core.model.field.RpcStringFieldDefinition(
                "wsIban",
                "java.lang.String",
                "",
                "",
                false,
                null,
                "org.openlegacy.core.model.field.RpcFieldType.General",
                false,
                50,
                false,
                "WS-IBAN",
                org.openlegacy.core.annotations.rpc.Direction.INPUT_OUTPUT,
                null,
                "org.openlegacy.core.model.legacy.type.Jt400LegacyTypes.Char",
                new java.util.HashMap<String, String>() {{}},
                null,
                org.openlegacy.core.annotations.PaddingType.NONE,
                ""
                ));
                put("wsCur", new org.openlegacy.core.model.field.RpcStringFieldDefinition(
                "wsCur",
                "java.lang.String",
                "",
                "",
                false,
                null,
                "org.openlegacy.core.model.field.RpcFieldType.General",
                false,
                3,
                false,
                "WS-CUR",
                org.openlegacy.core.annotations.rpc.Direction.INPUT_OUTPUT,
                null,
                "org.openlegacy.core.model.legacy.type.Jt400LegacyTypes.Char",
                new java.util.HashMap<String, String>() {{}},
                null,
                org.openlegacy.core.annotations.PaddingType.NONE,
                ""
                ));
                put("wsBal", new org.openlegacy.core.model.field.RpcNumberFieldDefinition(
                "wsBal",
                "java.math.BigDecimal",
                -1.7976931348623157E308,
                1.7976931348623157E308,
                "",
                null,
                "org.openlegacy.core.model.field.RpcFieldType.General",
                null,
                false,
                18,
                false,
                org.openlegacy.core.annotations.rpc.Direction.INPUT_OUTPUT,
                "WS-BAL",
                "org.openlegacy.core.model.legacy.type.Jt400LegacyTypes.Zoned",
                new java.util.HashMap<String, String>() {{}},
                null,
                2,
                0
                ));
                put("action_", new org.openlegacy.core.model.field.RpcStringFieldDefinition(
                "action_",
                "java.lang.String",
                "",
                "",
                false,
                null,
                "org.openlegacy.core.model.field.RpcFieldType.General",
                false,
                3,
                false,
                "ACTION",
                org.openlegacy.core.annotations.rpc.Direction.INPUT_OUTPUT,
                null,
                "org.openlegacy.core.model.legacy.type.Jt400LegacyTypes.Char",
                new java.util.HashMap<String, String>() {{}},
                null,
                org.openlegacy.core.annotations.PaddingType.NONE,
                ""
                ));
                put("erCod", new org.openlegacy.core.model.field.RpcStringFieldDefinition(
                "erCod",
                "java.lang.String",
                "",
                "",
                false,
                null,
                "org.openlegacy.core.model.field.RpcFieldType.General",
                false,
                4,
                false,
                "ER-COD",
                org.openlegacy.core.annotations.rpc.Direction.INPUT_OUTPUT,
                null,
                "org.openlegacy.core.model.legacy.type.Jt400LegacyTypes.Char",
                new java.util.HashMap<String, String>() {{}},
                null,
                org.openlegacy.core.annotations.PaddingType.NONE,
                ""
                ));
                put("erMsg", new org.openlegacy.core.model.field.RpcStringFieldDefinition(
                "erMsg",
                "java.lang.String",
                "",
                "",
                false,
                null,
                "org.openlegacy.core.model.field.RpcFieldType.General",
                false,
                50,
                false,
                "ER-MSG",
                org.openlegacy.core.annotations.rpc.Direction.INPUT_OUTPUT,
                null,
                "org.openlegacy.core.model.legacy.type.Jt400LegacyTypes.Char",
                new java.util.HashMap<String, String>() {{}},
                null,
                org.openlegacy.core.annotations.PaddingType.NONE,
                ""
                ));
                }}
                ));
                }},
                null,
                new java.util.HashMap<String, String>() {{}},
                java.util.Arrays.asList(new org.openlegacy.core.model.entity.RpcActionDefinition[]{
                new org.openlegacy.core.model.entity.RpcActionDefinition(
                new org.openlegacy.core.rpc.actions.RpcActions.EXECUTE(),
                "execute",
                "Execute",
                "/QSYS.LIB/OPENLEGA11.LIB/ACCNTMGT.PGM",
                new java.util.HashMap<String, String>() {{}}
                )
                }),
                java.util.Arrays.asList(new java.lang.String[]{}),
                "",
                org.openlegacy.core.definitions.BackendSolution.OTHER
                );
        outputEntityDefinition = new org.openlegacy.core.model.entity.RpcEntityDefinitionImpl(
                "ad256420-68ca-4edd-9c0b-5c0ee7aa0229",
                "Accntmgt",
                "com.as400_sdk.openlegacy.Accntmgt",
                "Accntmgt",
                new java.util.LinkedHashMap<String, org.openlegacy.core.model.field.RpcFieldDefinition>() {{
                put("wsAccount", new org.openlegacy.core.model.field.RpcClassFieldDefinition(
                "wsAccount",
                "com.as400_sdk.openlegacy.AccntmgtWsAccount",
                "",
                "org.openlegacy.core.model.field.RpcFieldType.General",
                false,
                314,
                false,
                new java.util.HashMap<String, String>() {{}},
                "WS-ACCOUNT",
                org.openlegacy.core.annotations.rpc.Direction.INPUT_OUTPUT,
                null,
                null,
                "org.openlegacy.core.model.legacy.type.NoneLegacyType",
                null,
                null,
                new java.util.LinkedHashMap<String, org.openlegacy.core.model.field.RpcFieldDefinition>() {{
                put("wsAcctNbr", new org.openlegacy.core.model.field.RpcStringFieldDefinition(
                "wsAcctNbr",
                "java.lang.String",
                "",
                "",
                false,
                null,
                "org.openlegacy.core.model.field.RpcFieldType.General",
                false,
                12,
                false,
                "WS-ACCT-NBR",
                org.openlegacy.core.annotations.rpc.Direction.INPUT_OUTPUT,
                null,
                "org.openlegacy.core.model.legacy.type.Jt400LegacyTypes.Char",
                new java.util.HashMap<String, String>() {{}},
                null,
                org.openlegacy.core.annotations.PaddingType.NONE,
                ""
                ));
                put("wsFirstName", new org.openlegacy.core.model.field.RpcStringFieldDefinition(
                "wsFirstName",
                "java.lang.String",
                "",
                "",
                false,
                null,
                "org.openlegacy.core.model.field.RpcFieldType.General",
                false,
                10,
                false,
                "WS-FIRST-NAME",
                org.openlegacy.core.annotations.rpc.Direction.INPUT_OUTPUT,
                null,
                "org.openlegacy.core.model.legacy.type.Jt400LegacyTypes.Char",
                new java.util.HashMap<String, String>() {{}},
                null,
                org.openlegacy.core.annotations.PaddingType.NONE,
                ""
                ));
                put("wsLastName", new org.openlegacy.core.model.field.RpcStringFieldDefinition(
                "wsLastName",
                "java.lang.String",
                "",
                "",
                false,
                null,
                "org.openlegacy.core.model.field.RpcFieldType.General",
                false,
                10,
                false,
                "WS-LAST-NAME",
                org.openlegacy.core.annotations.rpc.Direction.INPUT_OUTPUT,
                null,
                "org.openlegacy.core.model.legacy.type.Jt400LegacyTypes.Char",
                new java.util.HashMap<String, String>() {{}},
                null,
                org.openlegacy.core.annotations.PaddingType.NONE,
                ""
                ));
                put("wsAge", new org.openlegacy.core.model.field.RpcNumberFieldDefinition(
                "wsAge",
                "java.lang.Integer",
                0.0,
                99.0,
                "",
                null,
                "org.openlegacy.core.model.field.RpcFieldType.General",
                null,
                false,
                2,
                false,
                org.openlegacy.core.annotations.rpc.Direction.INPUT_OUTPUT,
                "WS-AGE",
                "org.openlegacy.core.model.legacy.type.Jt400LegacyTypes.Zoned",
                new java.util.HashMap<String, String>() {{}},
                null,
                0,
                0
                ));
                put("wsAccountId", new org.openlegacy.core.model.field.RpcNumberFieldDefinition(
                "wsAccountId",
                "java.lang.Long",
                0.0,
                9.999999999E9,
                "",
                null,
                "org.openlegacy.core.model.field.RpcFieldType.General",
                null,
                false,
                10,
                false,
                org.openlegacy.core.annotations.rpc.Direction.INPUT_OUTPUT,
                "WS-ACCOUNT-ID",
                "org.openlegacy.core.model.legacy.type.Jt400LegacyTypes.Zoned",
                new java.util.HashMap<String, String>() {{}},
                null,
                0,
                0
                ));
                put("wsBirthDate", new org.openlegacy.core.model.field.RpcClassFieldDefinition(
                "wsBirthDate",
                "com.as400_sdk.openlegacy.AccntmgtWsBirthDate",
                "",
                "org.openlegacy.core.model.field.RpcFieldType.General",
                false,
                8,
                false,
                new java.util.HashMap<String, String>() {{}},
                "WS-BIRTH-DATE",
                org.openlegacy.core.annotations.rpc.Direction.INPUT_OUTPUT,
                null,
                null,
                "org.openlegacy.core.model.legacy.type.NoneLegacyType",
                null,
                null,
                new java.util.LinkedHashMap<String, org.openlegacy.core.model.field.RpcFieldDefinition>() {{
                put("wsYear", new org.openlegacy.core.model.field.RpcNumberFieldDefinition(
                "wsYear",
                "java.lang.Integer",
                0.0,
                9999.0,
                "",
                null,
                "org.openlegacy.core.model.field.RpcFieldType.General",
                null,
                false,
                4,
                false,
                org.openlegacy.core.annotations.rpc.Direction.INPUT_OUTPUT,
                "WS-YEAR",
                "org.openlegacy.core.model.legacy.type.Jt400LegacyTypes.Zoned",
                new java.util.HashMap<String, String>() {{}},
                null,
                0,
                0
                ));
                put("wsMonth", new org.openlegacy.core.model.field.RpcNumberFieldDefinition(
                "wsMonth",
                "java.lang.Integer",
                0.0,
                99.0,
                "",
                null,
                "org.openlegacy.core.model.field.RpcFieldType.General",
                null,
                false,
                2,
                false,
                org.openlegacy.core.annotations.rpc.Direction.INPUT_OUTPUT,
                "WS-MONTH",
                "org.openlegacy.core.model.legacy.type.Jt400LegacyTypes.Zoned",
                new java.util.HashMap<String, String>() {{}},
                null,
                0,
                0
                ));
                put("wsDay", new org.openlegacy.core.model.field.RpcNumberFieldDefinition(
                "wsDay",
                "java.lang.Integer",
                0.0,
                99.0,
                "",
                null,
                "org.openlegacy.core.model.field.RpcFieldType.General",
                null,
                false,
                2,
                false,
                org.openlegacy.core.annotations.rpc.Direction.INPUT_OUTPUT,
                "WS-DAY",
                "org.openlegacy.core.model.legacy.type.Jt400LegacyTypes.Zoned",
                new java.util.HashMap<String, String>() {{}},
                null,
                0,
                0
                ));
                }}
                ));
                put("wsTitle", new org.openlegacy.core.model.field.RpcNumberFieldDefinition(
                "wsTitle",
                "java.lang.Integer",
                0.0,
                9.0,
                "",
                null,
                "org.openlegacy.core.model.field.RpcFieldType.General",
                null,
                false,
                1,
                false,
                org.openlegacy.core.annotations.rpc.Direction.INPUT_OUTPUT,
                "WS-TITLE",
                "org.openlegacy.core.model.legacy.type.Jt400LegacyTypes.Zoned",
                new java.util.HashMap<String, String>() {{}},
                null,
                0,
                0
                ));
                put("wsAddress", new org.openlegacy.core.model.field.RpcClassFieldDefinition(
                "wsAddress",
                "com.as400_sdk.openlegacy.AccntmgtWsAddress",
                "",
                "org.openlegacy.core.model.field.RpcFieldType.General",
                false,
                88,
                false,
                new java.util.HashMap<String, String>() {{}},
                "WS-ADDRESS",
                org.openlegacy.core.annotations.rpc.Direction.INPUT_OUTPUT,
                null,
                null,
                "org.openlegacy.core.model.legacy.type.NoneLegacyType",
                null,
                null,
                new java.util.LinkedHashMap<String, org.openlegacy.core.model.field.RpcFieldDefinition>() {{
                put("wsAddressName", new org.openlegacy.core.model.field.RpcStringFieldDefinition(
                "wsAddressName",
                "java.lang.String",
                "",
                "",
                false,
                null,
                "org.openlegacy.core.model.field.RpcFieldType.General",
                false,
                30,
                false,
                "WS-ADDRESS-NAME",
                org.openlegacy.core.annotations.rpc.Direction.INPUT_OUTPUT,
                null,
                "org.openlegacy.core.model.legacy.type.Jt400LegacyTypes.Char",
                new java.util.HashMap<String, String>() {{}},
                null,
                org.openlegacy.core.annotations.PaddingType.NONE,
                ""
                ));
                put("wsAddressNumber", new org.openlegacy.core.model.field.RpcNumberFieldDefinition(
                "wsAddressNumber",
                "java.lang.Integer",
                0.0,
                9999.0,
                "",
                null,
                "org.openlegacy.core.model.field.RpcFieldType.General",
                null,
                false,
                4,
                false,
                org.openlegacy.core.annotations.rpc.Direction.INPUT_OUTPUT,
                "WS-ADDRESS-NUMBER",
                "org.openlegacy.core.model.legacy.type.Jt400LegacyTypes.Zoned",
                new java.util.HashMap<String, String>() {{}},
                null,
                0,
                0
                ));
                put("wsAppartmentNumber", new org.openlegacy.core.model.field.RpcNumberFieldDefinition(
                "wsAppartmentNumber",
                "java.lang.Integer",
                0.0,
                9999.0,
                "",
                null,
                "org.openlegacy.core.model.field.RpcFieldType.General",
                null,
                false,
                4,
                false,
                org.openlegacy.core.annotations.rpc.Direction.INPUT_OUTPUT,
                "WS-APPARTMENT-NUMBER",
                "org.openlegacy.core.model.legacy.type.Jt400LegacyTypes.Zoned",
                new java.util.HashMap<String, String>() {{}},
                null,
                0,
                0
                ));
                put("wsCity", new org.openlegacy.core.model.field.RpcStringFieldDefinition(
                "wsCity",
                "java.lang.String",
                "",
                "",
                false,
                null,
                "org.openlegacy.core.model.field.RpcFieldType.General",
                false,
                20,
                false,
                "WS-CITY",
                org.openlegacy.core.annotations.rpc.Direction.INPUT_OUTPUT,
                null,
                "org.openlegacy.core.model.legacy.type.Jt400LegacyTypes.Char",
                new java.util.HashMap<String, String>() {{}},
                null,
                org.openlegacy.core.annotations.PaddingType.NONE,
                ""
                ));
                put("wsPostalCode", new org.openlegacy.core.model.field.RpcNumberFieldDefinition(
                "wsPostalCode",
                "java.lang.Long",
                0.0,
                9.999999999E9,
                "",
                null,
                "org.openlegacy.core.model.field.RpcFieldType.General",
                null,
                false,
                10,
                false,
                org.openlegacy.core.annotations.rpc.Direction.INPUT_OUTPUT,
                "WS-POSTAL-CODE",
                "org.openlegacy.core.model.legacy.type.Jt400LegacyTypes.Zoned",
                new java.util.HashMap<String, String>() {{}},
                null,
                0,
                0
                ));
                put("wsCountry", new org.openlegacy.core.model.field.RpcStringFieldDefinition(
                "wsCountry",
                "java.lang.String",
                "",
                "",
                false,
                null,
                "org.openlegacy.core.model.field.RpcFieldType.General",
                false,
                20,
                false,
                "WS-COUNTRY",
                org.openlegacy.core.annotations.rpc.Direction.INPUT_OUTPUT,
                null,
                "org.openlegacy.core.model.legacy.type.Jt400LegacyTypes.Char",
                new java.util.HashMap<String, String>() {{}},
                null,
                org.openlegacy.core.annotations.PaddingType.NONE,
                ""
                ));
                }}
                ));
                put("wsLoc", new org.openlegacy.core.model.field.RpcClassFieldDefinition(
                "wsLoc",
                "com.as400_sdk.openlegacy.AccntmgtWsLoc",
                "",
                "org.openlegacy.core.model.field.RpcFieldType.General",
                false,
                36,
                false,
                new java.util.HashMap<String, String>() {{}},
                "WS-LOC",
                org.openlegacy.core.annotations.rpc.Direction.INPUT_OUTPUT,
                null,
                null,
                "org.openlegacy.core.model.legacy.type.NoneLegacyType",
                null,
                null,
                new java.util.LinkedHashMap<String, org.openlegacy.core.model.field.RpcFieldDefinition>() {{
                put("wsFees", new org.openlegacy.core.model.field.RpcNumberFieldDefinition(
                "wsFees",
                "java.lang.Long",
                0.0,
                9.99999999999E11,
                "",
                null,
                "org.openlegacy.core.model.field.RpcFieldType.General",
                null,
                false,
                12,
                false,
                org.openlegacy.core.annotations.rpc.Direction.INPUT_OUTPUT,
                "WS-FEES",
                "org.openlegacy.core.model.legacy.type.Jt400LegacyTypes.Zoned",
                new java.util.HashMap<String, String>() {{}},
                null,
                0,
                0
                ));
                put("wsCharges", new org.openlegacy.core.model.field.RpcNumberFieldDefinition(
                "wsCharges",
                "java.lang.Long",
                0.0,
                9.99999999999E11,
                "",
                null,
                "org.openlegacy.core.model.field.RpcFieldType.General",
                null,
                false,
                12,
                false,
                org.openlegacy.core.annotations.rpc.Direction.INPUT_OUTPUT,
                "WS-CHARGES",
                "org.openlegacy.core.model.legacy.type.Jt400LegacyTypes.Zoned",
                new java.util.HashMap<String, String>() {{}},
                null,
                0,
                0
                ));
                put("wsWithdrawls", new org.openlegacy.core.model.field.RpcNumberFieldDefinition(
                "wsWithdrawls",
                "java.lang.Long",
                0.0,
                9.99999999999E11,
                "",
                null,
                "org.openlegacy.core.model.field.RpcFieldType.General",
                null,
                false,
                12,
                false,
                org.openlegacy.core.annotations.rpc.Direction.INPUT_OUTPUT,
                "WS-WITHDRAWLS",
                "org.openlegacy.core.model.legacy.type.Jt400LegacyTypes.Zoned",
                new java.util.HashMap<String, String>() {{}},
                null,
                0,
                0
                ));
                }}
                ));
                put("wsBankDet", new org.openlegacy.core.model.field.RpcClassFieldDefinition(
                "wsBankDet",
                "com.as400_sdk.openlegacy.AccntmgtWsBankDet",
                "",
                "org.openlegacy.core.model.field.RpcFieldType.General",
                false,
                9,
                false,
                new java.util.HashMap<String, String>() {{}},
                "WS-BANK-DET",
                org.openlegacy.core.annotations.rpc.Direction.INPUT_OUTPUT,
                null,
                null,
                "org.openlegacy.core.model.legacy.type.NoneLegacyType",
                null,
                null,
                new java.util.LinkedHashMap<String, org.openlegacy.core.model.field.RpcFieldDefinition>() {{
                put("wsBankId", new org.openlegacy.core.model.field.RpcNumberFieldDefinition(
                "wsBankId",
                "java.lang.Integer",
                0.0,
                999.0,
                "",
                null,
                "org.openlegacy.core.model.field.RpcFieldType.General",
                null,
                false,
                3,
                false,
                org.openlegacy.core.annotations.rpc.Direction.INPUT_OUTPUT,
                "WS-BANK-ID",
                "org.openlegacy.core.model.legacy.type.Jt400LegacyTypes.Zoned",
                new java.util.HashMap<String, String>() {{}},
                null,
                0,
                0
                ));
                put("wsBranchId", new org.openlegacy.core.model.field.RpcNumberFieldDefinition(
                "wsBranchId",
                "java.lang.Integer",
                0.0,
                9999.0,
                "",
                null,
                "org.openlegacy.core.model.field.RpcFieldType.General",
                null,
                false,
                4,
                false,
                org.openlegacy.core.annotations.rpc.Direction.INPUT_OUTPUT,
                "WS-BRANCH-ID",
                "org.openlegacy.core.model.legacy.type.Jt400LegacyTypes.Zoned",
                new java.util.HashMap<String, String>() {{}},
                null,
                0,
                0
                ));
                put("wsIsoCntryCd", new org.openlegacy.core.model.field.RpcStringFieldDefinition(
                "wsIsoCntryCd",
                "java.lang.String",
                "",
                "",
                false,
                null,
                "org.openlegacy.core.model.field.RpcFieldType.General",
                false,
                2,
                false,
                "WS-ISO-CNTRY-CD",
                org.openlegacy.core.annotations.rpc.Direction.INPUT_OUTPUT,
                null,
                "org.openlegacy.core.model.legacy.type.Jt400LegacyTypes.Char",
                new java.util.HashMap<String, String>() {{}},
                null,
                org.openlegacy.core.annotations.PaddingType.NONE,
                ""
                ));
                }}
                ));
                put("wsIban", new org.openlegacy.core.model.field.RpcStringFieldDefinition(
                "wsIban",
                "java.lang.String",
                "",
                "",
                false,
                null,
                "org.openlegacy.core.model.field.RpcFieldType.General",
                false,
                50,
                false,
                "WS-IBAN",
                org.openlegacy.core.annotations.rpc.Direction.INPUT_OUTPUT,
                null,
                "org.openlegacy.core.model.legacy.type.Jt400LegacyTypes.Char",
                new java.util.HashMap<String, String>() {{}},
                null,
                org.openlegacy.core.annotations.PaddingType.NONE,
                ""
                ));
                put("wsCur", new org.openlegacy.core.model.field.RpcStringFieldDefinition(
                "wsCur",
                "java.lang.String",
                "",
                "",
                false,
                null,
                "org.openlegacy.core.model.field.RpcFieldType.General",
                false,
                3,
                false,
                "WS-CUR",
                org.openlegacy.core.annotations.rpc.Direction.INPUT_OUTPUT,
                null,
                "org.openlegacy.core.model.legacy.type.Jt400LegacyTypes.Char",
                new java.util.HashMap<String, String>() {{}},
                null,
                org.openlegacy.core.annotations.PaddingType.NONE,
                ""
                ));
                put("wsBal", new org.openlegacy.core.model.field.RpcNumberFieldDefinition(
                "wsBal",
                "java.math.BigDecimal",
                -1.7976931348623157E308,
                1.7976931348623157E308,
                "",
                null,
                "org.openlegacy.core.model.field.RpcFieldType.General",
                null,
                false,
                18,
                false,
                org.openlegacy.core.annotations.rpc.Direction.INPUT_OUTPUT,
                "WS-BAL",
                "org.openlegacy.core.model.legacy.type.Jt400LegacyTypes.Zoned",
                new java.util.HashMap<String, String>() {{}},
                null,
                2,
                0
                ));
                put("action_", new org.openlegacy.core.model.field.RpcStringFieldDefinition(
                "action_",
                "java.lang.String",
                "",
                "",
                false,
                null,
                "org.openlegacy.core.model.field.RpcFieldType.General",
                false,
                3,
                false,
                "ACTION",
                org.openlegacy.core.annotations.rpc.Direction.INPUT_OUTPUT,
                null,
                "org.openlegacy.core.model.legacy.type.Jt400LegacyTypes.Char",
                new java.util.HashMap<String, String>() {{}},
                null,
                org.openlegacy.core.annotations.PaddingType.NONE,
                ""
                ));
                put("erCod", new org.openlegacy.core.model.field.RpcStringFieldDefinition(
                "erCod",
                "java.lang.String",
                "",
                "",
                false,
                null,
                "org.openlegacy.core.model.field.RpcFieldType.General",
                false,
                4,
                false,
                "ER-COD",
                org.openlegacy.core.annotations.rpc.Direction.INPUT_OUTPUT,
                null,
                "org.openlegacy.core.model.legacy.type.Jt400LegacyTypes.Char",
                new java.util.HashMap<String, String>() {{}},
                null,
                org.openlegacy.core.annotations.PaddingType.NONE,
                ""
                ));
                put("erMsg", new org.openlegacy.core.model.field.RpcStringFieldDefinition(
                "erMsg",
                "java.lang.String",
                "",
                "",
                false,
                null,
                "org.openlegacy.core.model.field.RpcFieldType.General",
                false,
                50,
                false,
                "ER-MSG",
                org.openlegacy.core.annotations.rpc.Direction.INPUT_OUTPUT,
                null,
                "org.openlegacy.core.model.legacy.type.Jt400LegacyTypes.Char",
                new java.util.HashMap<String, String>() {{}},
                null,
                org.openlegacy.core.annotations.PaddingType.NONE,
                ""
                ));
                }}
                ));
                }},
                null,
                new java.util.HashMap<String, String>() {{}},
                java.util.Arrays.asList(new org.openlegacy.core.model.entity.RpcActionDefinition[]{
                new org.openlegacy.core.model.entity.RpcActionDefinition(
                new org.openlegacy.core.rpc.actions.RpcActions.EXECUTE(),
                "execute",
                "Execute",
                "/QSYS.LIB/OPENLEGA11.LIB/ACCNTMGT.PGM",
                new java.util.HashMap<String, String>() {{}}
                )
                }),
                java.util.Arrays.asList(new java.lang.String[]{}),
                "",
                org.openlegacy.core.definitions.BackendSolution.OTHER
                );
    }

    private static AccntmgtWsBirthDate fromAccntmgtWsBirthDateJsonObject(JsonObject jsonObject,
            AccntmgtWsBirthDate wsBirthDate) {
        wsBirthDate.setWsYear(jsonObject.getInteger("wsYear"));
        wsBirthDate.setWsMonth(jsonObject.getInteger("wsMonth"));
        wsBirthDate.setWsDay(jsonObject.getInteger("wsDay"));
        return wsBirthDate;
    }

    private static AccntmgtWsAddress fromAccntmgtWsAddressJsonObject(JsonObject jsonObject,
            AccntmgtWsAddress wsAddress) {
        wsAddress.setWsAddressName(jsonObject.getString("wsAddressName"));
        wsAddress.setWsAddressNumber(jsonObject.getInteger("wsAddressNumber"));
        wsAddress.setWsAppartmentNumber(jsonObject.getInteger("wsAppartmentNumber"));
        wsAddress.setWsCity(jsonObject.getString("wsCity"));
        wsAddress.setWsPostalCode(jsonObject.getLong("wsPostalCode"));
        wsAddress.setWsCountry(jsonObject.getString("wsCountry"));
        return wsAddress;
    }

    private static AccntmgtWsLoc fromAccntmgtWsLocJsonObject(JsonObject jsonObject,
            AccntmgtWsLoc wsLoc) {
        wsLoc.setWsFees(jsonObject.getLong("wsFees"));
        wsLoc.setWsCharges(jsonObject.getLong("wsCharges"));
        wsLoc.setWsWithdrawls(jsonObject.getLong("wsWithdrawls"));
        return wsLoc;
    }

    private static AccntmgtWsBankDet fromAccntmgtWsBankDetJsonObject(JsonObject jsonObject,
            AccntmgtWsBankDet wsBankDet) {
        wsBankDet.setWsBankId(jsonObject.getInteger("wsBankId"));
        wsBankDet.setWsBranchId(jsonObject.getInteger("wsBranchId"));
        wsBankDet.setWsIsoCntryCd(jsonObject.getString("wsIsoCntryCd"));
        return wsBankDet;
    }

    private static AccntmgtWsAccount fromAccntmgtWsAccountJsonObject(JsonObject jsonObject,
            AccntmgtWsAccount wsAccount) {
        wsAccount.setWsAcctNbr(jsonObject.getString("wsAcctNbr"));
        wsAccount.setWsFirstName(jsonObject.getString("wsFirstName"));
        wsAccount.setWsLastName(jsonObject.getString("wsLastName"));
        wsAccount.setWsAge(jsonObject.getInteger("wsAge"));
        wsAccount.setWsAccountId(jsonObject.getLong("wsAccountId"));
        JsonObject wsBirthDateObject = jsonObject.getJsonObject("wsBirthDate");
        if (wsBirthDateObject != null) {
            wsAccount.setWsBirthDate(fromAccntmgtWsBirthDateJsonObject(wsBirthDateObject, new AccntmgtWsBirthDate()));
        }
        wsAccount.setWsTitle(jsonObject.getInteger("wsTitle"));
        JsonObject wsAddressObject = jsonObject.getJsonObject("wsAddress");
        if (wsAddressObject != null) {
            wsAccount.setWsAddress(fromAccntmgtWsAddressJsonObject(wsAddressObject, new AccntmgtWsAddress()));
        }
        JsonObject wsLocObject = jsonObject.getJsonObject("wsLoc");
        if (wsLocObject != null) {
            wsAccount.setWsLoc(fromAccntmgtWsLocJsonObject(wsLocObject, new AccntmgtWsLoc()));
        }
        JsonObject wsBankDetObject = jsonObject.getJsonObject("wsBankDet");
        if (wsBankDetObject != null) {
            wsAccount.setWsBankDet(fromAccntmgtWsBankDetJsonObject(wsBankDetObject, new AccntmgtWsBankDet()));
        }
        wsAccount.setWsIban(jsonObject.getString("wsIban"));
        wsAccount.setWsCur(jsonObject.getString("wsCur"));
        String wsBalStringValue = jsonObject.getString("wsBal");
        if (wsBalStringValue != null) {
            wsAccount.setWsBal(new BigDecimal(wsBalStringValue));
        }
        wsAccount.setAction_(jsonObject.getString("action_"));
        wsAccount.setErCod(jsonObject.getString("erCod"));
        wsAccount.setErMsg(jsonObject.getString("erMsg"));
        return wsAccount;
    }

    public static void populateFromJson(@NotNull JsonObject jsonObject, @NotNull Accntmgt entity) {
        Objects.requireNonNull(entity, "provided entity should not be null");
        if (jsonObject != null) {
            JsonObject wsAccountObject = jsonObject.getJsonObject("wsAccount");
            if (wsAccountObject != null) {
                entity.setWsAccount(fromAccntmgtWsAccountJsonObject(wsAccountObject, new AccntmgtWsAccount()));
            }
        }
    }

    private static JsonObject initAccntmgtWsBirthDate(AccntmgtWsBirthDate object) {
        JsonObject jsonObject = new JsonObject();
        jsonObject.put("wsYear", object.getWsYear());
        jsonObject.put("wsMonth", object.getWsMonth());
        jsonObject.put("wsDay", object.getWsDay());
        return jsonObject;
    }

    private static JsonObject initAccntmgtWsAddress(AccntmgtWsAddress object) {
        JsonObject jsonObject = new JsonObject();
        jsonObject.put("wsAddressName", object.getWsAddressName());
        jsonObject.put("wsAddressNumber", object.getWsAddressNumber());
        jsonObject.put("wsAppartmentNumber", object.getWsAppartmentNumber());
        jsonObject.put("wsCity", object.getWsCity());
        jsonObject.put("wsPostalCode", object.getWsPostalCode());
        jsonObject.put("wsCountry", object.getWsCountry());
        return jsonObject;
    }

    private static JsonObject initAccntmgtWsLoc(AccntmgtWsLoc object) {
        JsonObject jsonObject = new JsonObject();
        jsonObject.put("wsFees", object.getWsFees());
        jsonObject.put("wsCharges", object.getWsCharges());
        jsonObject.put("wsWithdrawls", object.getWsWithdrawls());
        return jsonObject;
    }

    private static JsonObject initAccntmgtWsBankDet(AccntmgtWsBankDet object) {
        JsonObject jsonObject = new JsonObject();
        jsonObject.put("wsBankId", object.getWsBankId());
        jsonObject.put("wsBranchId", object.getWsBranchId());
        jsonObject.put("wsIsoCntryCd", object.getWsIsoCntryCd());
        return jsonObject;
    }

    private static JsonObject initAccntmgtWsAccount(AccntmgtWsAccount object) {
        JsonObject jsonObject = new JsonObject();
        jsonObject.put("wsAcctNbr", object.getWsAcctNbr());
        jsonObject.put("wsFirstName", object.getWsFirstName());
        jsonObject.put("wsLastName", object.getWsLastName());
        jsonObject.put("wsAge", object.getWsAge());
        jsonObject.put("wsAccountId", object.getWsAccountId());
        AccntmgtWsBirthDate wsBirthDate = object.getWsBirthDate();
        if (wsBirthDate != null) {
            jsonObject.put("wsBirthDate", initAccntmgtWsBirthDate(wsBirthDate));
        } else {
            jsonObject.put("wsBirthDate", (Object) null);
        }
        jsonObject.put("wsTitle", object.getWsTitle());
        AccntmgtWsAddress wsAddress = object.getWsAddress();
        if (wsAddress != null) {
            jsonObject.put("wsAddress", initAccntmgtWsAddress(wsAddress));
        } else {
            jsonObject.put("wsAddress", (Object) null);
        }
        AccntmgtWsLoc wsLoc = object.getWsLoc();
        if (wsLoc != null) {
            jsonObject.put("wsLoc", initAccntmgtWsLoc(wsLoc));
        } else {
            jsonObject.put("wsLoc", (Object) null);
        }
        AccntmgtWsBankDet wsBankDet = object.getWsBankDet();
        if (wsBankDet != null) {
            jsonObject.put("wsBankDet", initAccntmgtWsBankDet(wsBankDet));
        } else {
            jsonObject.put("wsBankDet", (Object) null);
        }
        jsonObject.put("wsIban", object.getWsIban());
        jsonObject.put("wsCur", object.getWsCur());
        BigDecimal wsBal = object.getWsBal();
        jsonObject.put("wsBal", (wsBal != null) ?  wsBal.toString() : (Object) null );
        jsonObject.put("action_", object.getAction_());
        jsonObject.put("erCod", object.getErCod());
        jsonObject.put("erMsg", object.getErMsg());
        return jsonObject;
    }

    public static JsonObject toJson(Accntmgt entity) {
        JsonObject jsonObject = new JsonObject();
        if (entity != null) {
            AccntmgtWsAccount wsAccount = entity.getWsAccount();
            if (wsAccount != null) {
                jsonObject.put("wsAccount", initAccntmgtWsAccount(wsAccount));
            } else {
                jsonObject.put("wsAccount", (Object) null);
            }
        }
        return jsonObject;
    }
}
