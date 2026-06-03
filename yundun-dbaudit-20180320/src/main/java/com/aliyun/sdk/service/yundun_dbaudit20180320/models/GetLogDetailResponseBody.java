// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.yundun_dbaudit20180320.models;

import com.aliyun.sdk.gateway.pop.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link GetLogDetailResponseBody} extends {@link TeaModel}
 *
 * <p>GetLogDetailResponseBody</p>
 */
public class GetLogDetailResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AffectRows")
    private Integer affectRows;

    @com.aliyun.core.annotation.NameInMap("AppClientIp")
    private String appClientIp;

    @com.aliyun.core.annotation.NameInMap("AppUsername")
    private String appUsername;

    @com.aliyun.core.annotation.NameInMap("CaptureTime")
    private String captureTime;

    @com.aliyun.core.annotation.NameInMap("ClientIp")
    private String clientIp;

    @com.aliyun.core.annotation.NameInMap("ClientMac")
    private String clientMac;

    @com.aliyun.core.annotation.NameInMap("ClientOsUser")
    private String clientOsUser;

    @com.aliyun.core.annotation.NameInMap("ClientPort")
    private Integer clientPort;

    @com.aliyun.core.annotation.NameInMap("ClientProgram")
    private String clientProgram;

    @com.aliyun.core.annotation.NameInMap("DbId")
    private Integer dbId;

    @com.aliyun.core.annotation.NameInMap("DbServer")
    private String dbServer;

    @com.aliyun.core.annotation.NameInMap("DbUser")
    private String dbUser;

    @com.aliyun.core.annotation.NameInMap("ExecCostUS")
    private Integer execCostUS;

    @com.aliyun.core.annotation.NameInMap("FetchCostUS")
    private Integer fetchCostUS;

    @com.aliyun.core.annotation.NameInMap("InstName")
    private String instName;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("ResponseCode")
    private String responseCode;

    @com.aliyun.core.annotation.NameInMap("ResponseText")
    private String responseText;

    @com.aliyun.core.annotation.NameInMap("RiskLevel")
    private Integer riskLevel;

    @com.aliyun.core.annotation.NameInMap("RuleId")
    private Integer ruleId;

    @com.aliyun.core.annotation.NameInMap("RuleKeyId")
    private Integer ruleKeyId;

    @com.aliyun.core.annotation.NameInMap("RuleName")
    private String ruleName;

    @com.aliyun.core.annotation.NameInMap("RuleType")
    private Integer ruleType;

    @com.aliyun.core.annotation.NameInMap("Schema")
    private String schema;

    @com.aliyun.core.annotation.NameInMap("SecondarySqlType")
    private String secondarySqlType;

    @com.aliyun.core.annotation.NameInMap("ServerMac")
    private String serverMac;

    @com.aliyun.core.annotation.NameInMap("SessionId")
    private String sessionId;

    @com.aliyun.core.annotation.NameInMap("SessionLoginTime")
    private String sessionLoginTime;

    @com.aliyun.core.annotation.NameInMap("SessionLogoutTime")
    private String sessionLogoutTime;

    @com.aliyun.core.annotation.NameInMap("SqlContent")
    private String sqlContent;

    @com.aliyun.core.annotation.NameInMap("SqlId")
    private String sqlId;

    @com.aliyun.core.annotation.NameInMap("SqlResult")
    private String sqlResult;

    @com.aliyun.core.annotation.NameInMap("SqlType")
    private String sqlType;

    @com.aliyun.core.annotation.NameInMap("SqlTypeName")
    private String sqlTypeName;

    @com.aliyun.core.annotation.NameInMap("TemplateContent")
    private String templateContent;

    @com.aliyun.core.annotation.NameInMap("TemplateId")
    private String templateId;

    @com.aliyun.core.annotation.NameInMap("TemplateRules")
    private java.util.List<String> templateRules;

    private GetLogDetailResponseBody(Builder builder) {
        this.affectRows = builder.affectRows;
        this.appClientIp = builder.appClientIp;
        this.appUsername = builder.appUsername;
        this.captureTime = builder.captureTime;
        this.clientIp = builder.clientIp;
        this.clientMac = builder.clientMac;
        this.clientOsUser = builder.clientOsUser;
        this.clientPort = builder.clientPort;
        this.clientProgram = builder.clientProgram;
        this.dbId = builder.dbId;
        this.dbServer = builder.dbServer;
        this.dbUser = builder.dbUser;
        this.execCostUS = builder.execCostUS;
        this.fetchCostUS = builder.fetchCostUS;
        this.instName = builder.instName;
        this.requestId = builder.requestId;
        this.responseCode = builder.responseCode;
        this.responseText = builder.responseText;
        this.riskLevel = builder.riskLevel;
        this.ruleId = builder.ruleId;
        this.ruleKeyId = builder.ruleKeyId;
        this.ruleName = builder.ruleName;
        this.ruleType = builder.ruleType;
        this.schema = builder.schema;
        this.secondarySqlType = builder.secondarySqlType;
        this.serverMac = builder.serverMac;
        this.sessionId = builder.sessionId;
        this.sessionLoginTime = builder.sessionLoginTime;
        this.sessionLogoutTime = builder.sessionLogoutTime;
        this.sqlContent = builder.sqlContent;
        this.sqlId = builder.sqlId;
        this.sqlResult = builder.sqlResult;
        this.sqlType = builder.sqlType;
        this.sqlTypeName = builder.sqlTypeName;
        this.templateContent = builder.templateContent;
        this.templateId = builder.templateId;
        this.templateRules = builder.templateRules;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetLogDetailResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return affectRows
     */
    public Integer getAffectRows() {
        return this.affectRows;
    }

    /**
     * @return appClientIp
     */
    public String getAppClientIp() {
        return this.appClientIp;
    }

    /**
     * @return appUsername
     */
    public String getAppUsername() {
        return this.appUsername;
    }

    /**
     * @return captureTime
     */
    public String getCaptureTime() {
        return this.captureTime;
    }

    /**
     * @return clientIp
     */
    public String getClientIp() {
        return this.clientIp;
    }

    /**
     * @return clientMac
     */
    public String getClientMac() {
        return this.clientMac;
    }

    /**
     * @return clientOsUser
     */
    public String getClientOsUser() {
        return this.clientOsUser;
    }

    /**
     * @return clientPort
     */
    public Integer getClientPort() {
        return this.clientPort;
    }

    /**
     * @return clientProgram
     */
    public String getClientProgram() {
        return this.clientProgram;
    }

    /**
     * @return dbId
     */
    public Integer getDbId() {
        return this.dbId;
    }

    /**
     * @return dbServer
     */
    public String getDbServer() {
        return this.dbServer;
    }

    /**
     * @return dbUser
     */
    public String getDbUser() {
        return this.dbUser;
    }

    /**
     * @return execCostUS
     */
    public Integer getExecCostUS() {
        return this.execCostUS;
    }

    /**
     * @return fetchCostUS
     */
    public Integer getFetchCostUS() {
        return this.fetchCostUS;
    }

    /**
     * @return instName
     */
    public String getInstName() {
        return this.instName;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return responseCode
     */
    public String getResponseCode() {
        return this.responseCode;
    }

    /**
     * @return responseText
     */
    public String getResponseText() {
        return this.responseText;
    }

    /**
     * @return riskLevel
     */
    public Integer getRiskLevel() {
        return this.riskLevel;
    }

    /**
     * @return ruleId
     */
    public Integer getRuleId() {
        return this.ruleId;
    }

    /**
     * @return ruleKeyId
     */
    public Integer getRuleKeyId() {
        return this.ruleKeyId;
    }

    /**
     * @return ruleName
     */
    public String getRuleName() {
        return this.ruleName;
    }

    /**
     * @return ruleType
     */
    public Integer getRuleType() {
        return this.ruleType;
    }

    /**
     * @return schema
     */
    public String getSchema() {
        return this.schema;
    }

    /**
     * @return secondarySqlType
     */
    public String getSecondarySqlType() {
        return this.secondarySqlType;
    }

    /**
     * @return serverMac
     */
    public String getServerMac() {
        return this.serverMac;
    }

    /**
     * @return sessionId
     */
    public String getSessionId() {
        return this.sessionId;
    }

    /**
     * @return sessionLoginTime
     */
    public String getSessionLoginTime() {
        return this.sessionLoginTime;
    }

    /**
     * @return sessionLogoutTime
     */
    public String getSessionLogoutTime() {
        return this.sessionLogoutTime;
    }

    /**
     * @return sqlContent
     */
    public String getSqlContent() {
        return this.sqlContent;
    }

    /**
     * @return sqlId
     */
    public String getSqlId() {
        return this.sqlId;
    }

    /**
     * @return sqlResult
     */
    public String getSqlResult() {
        return this.sqlResult;
    }

    /**
     * @return sqlType
     */
    public String getSqlType() {
        return this.sqlType;
    }

    /**
     * @return sqlTypeName
     */
    public String getSqlTypeName() {
        return this.sqlTypeName;
    }

    /**
     * @return templateContent
     */
    public String getTemplateContent() {
        return this.templateContent;
    }

    /**
     * @return templateId
     */
    public String getTemplateId() {
        return this.templateId;
    }

    /**
     * @return templateRules
     */
    public java.util.List<String> getTemplateRules() {
        return this.templateRules;
    }

    public static final class Builder {
        private Integer affectRows; 
        private String appClientIp; 
        private String appUsername; 
        private String captureTime; 
        private String clientIp; 
        private String clientMac; 
        private String clientOsUser; 
        private Integer clientPort; 
        private String clientProgram; 
        private Integer dbId; 
        private String dbServer; 
        private String dbUser; 
        private Integer execCostUS; 
        private Integer fetchCostUS; 
        private String instName; 
        private String requestId; 
        private String responseCode; 
        private String responseText; 
        private Integer riskLevel; 
        private Integer ruleId; 
        private Integer ruleKeyId; 
        private String ruleName; 
        private Integer ruleType; 
        private String schema; 
        private String secondarySqlType; 
        private String serverMac; 
        private String sessionId; 
        private String sessionLoginTime; 
        private String sessionLogoutTime; 
        private String sqlContent; 
        private String sqlId; 
        private String sqlResult; 
        private String sqlType; 
        private String sqlTypeName; 
        private String templateContent; 
        private String templateId; 
        private java.util.List<String> templateRules; 

        private Builder() {
        } 

        private Builder(GetLogDetailResponseBody model) {
            this.affectRows = model.affectRows;
            this.appClientIp = model.appClientIp;
            this.appUsername = model.appUsername;
            this.captureTime = model.captureTime;
            this.clientIp = model.clientIp;
            this.clientMac = model.clientMac;
            this.clientOsUser = model.clientOsUser;
            this.clientPort = model.clientPort;
            this.clientProgram = model.clientProgram;
            this.dbId = model.dbId;
            this.dbServer = model.dbServer;
            this.dbUser = model.dbUser;
            this.execCostUS = model.execCostUS;
            this.fetchCostUS = model.fetchCostUS;
            this.instName = model.instName;
            this.requestId = model.requestId;
            this.responseCode = model.responseCode;
            this.responseText = model.responseText;
            this.riskLevel = model.riskLevel;
            this.ruleId = model.ruleId;
            this.ruleKeyId = model.ruleKeyId;
            this.ruleName = model.ruleName;
            this.ruleType = model.ruleType;
            this.schema = model.schema;
            this.secondarySqlType = model.secondarySqlType;
            this.serverMac = model.serverMac;
            this.sessionId = model.sessionId;
            this.sessionLoginTime = model.sessionLoginTime;
            this.sessionLogoutTime = model.sessionLogoutTime;
            this.sqlContent = model.sqlContent;
            this.sqlId = model.sqlId;
            this.sqlResult = model.sqlResult;
            this.sqlType = model.sqlType;
            this.sqlTypeName = model.sqlTypeName;
            this.templateContent = model.templateContent;
            this.templateId = model.templateId;
            this.templateRules = model.templateRules;
        } 

        /**
         * AffectRows.
         */
        public Builder affectRows(Integer affectRows) {
            this.affectRows = affectRows;
            return this;
        }

        /**
         * AppClientIp.
         */
        public Builder appClientIp(String appClientIp) {
            this.appClientIp = appClientIp;
            return this;
        }

        /**
         * AppUsername.
         */
        public Builder appUsername(String appUsername) {
            this.appUsername = appUsername;
            return this;
        }

        /**
         * CaptureTime.
         */
        public Builder captureTime(String captureTime) {
            this.captureTime = captureTime;
            return this;
        }

        /**
         * ClientIp.
         */
        public Builder clientIp(String clientIp) {
            this.clientIp = clientIp;
            return this;
        }

        /**
         * ClientMac.
         */
        public Builder clientMac(String clientMac) {
            this.clientMac = clientMac;
            return this;
        }

        /**
         * ClientOsUser.
         */
        public Builder clientOsUser(String clientOsUser) {
            this.clientOsUser = clientOsUser;
            return this;
        }

        /**
         * ClientPort.
         */
        public Builder clientPort(Integer clientPort) {
            this.clientPort = clientPort;
            return this;
        }

        /**
         * ClientProgram.
         */
        public Builder clientProgram(String clientProgram) {
            this.clientProgram = clientProgram;
            return this;
        }

        /**
         * DbId.
         */
        public Builder dbId(Integer dbId) {
            this.dbId = dbId;
            return this;
        }

        /**
         * DbServer.
         */
        public Builder dbServer(String dbServer) {
            this.dbServer = dbServer;
            return this;
        }

        /**
         * DbUser.
         */
        public Builder dbUser(String dbUser) {
            this.dbUser = dbUser;
            return this;
        }

        /**
         * ExecCostUS.
         */
        public Builder execCostUS(Integer execCostUS) {
            this.execCostUS = execCostUS;
            return this;
        }

        /**
         * FetchCostUS.
         */
        public Builder fetchCostUS(Integer fetchCostUS) {
            this.fetchCostUS = fetchCostUS;
            return this;
        }

        /**
         * InstName.
         */
        public Builder instName(String instName) {
            this.instName = instName;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * ResponseCode.
         */
        public Builder responseCode(String responseCode) {
            this.responseCode = responseCode;
            return this;
        }

        /**
         * ResponseText.
         */
        public Builder responseText(String responseText) {
            this.responseText = responseText;
            return this;
        }

        /**
         * RiskLevel.
         */
        public Builder riskLevel(Integer riskLevel) {
            this.riskLevel = riskLevel;
            return this;
        }

        /**
         * RuleId.
         */
        public Builder ruleId(Integer ruleId) {
            this.ruleId = ruleId;
            return this;
        }

        /**
         * RuleKeyId.
         */
        public Builder ruleKeyId(Integer ruleKeyId) {
            this.ruleKeyId = ruleKeyId;
            return this;
        }

        /**
         * RuleName.
         */
        public Builder ruleName(String ruleName) {
            this.ruleName = ruleName;
            return this;
        }

        /**
         * RuleType.
         */
        public Builder ruleType(Integer ruleType) {
            this.ruleType = ruleType;
            return this;
        }

        /**
         * Schema.
         */
        public Builder schema(String schema) {
            this.schema = schema;
            return this;
        }

        /**
         * SecondarySqlType.
         */
        public Builder secondarySqlType(String secondarySqlType) {
            this.secondarySqlType = secondarySqlType;
            return this;
        }

        /**
         * ServerMac.
         */
        public Builder serverMac(String serverMac) {
            this.serverMac = serverMac;
            return this;
        }

        /**
         * SessionId.
         */
        public Builder sessionId(String sessionId) {
            this.sessionId = sessionId;
            return this;
        }

        /**
         * SessionLoginTime.
         */
        public Builder sessionLoginTime(String sessionLoginTime) {
            this.sessionLoginTime = sessionLoginTime;
            return this;
        }

        /**
         * SessionLogoutTime.
         */
        public Builder sessionLogoutTime(String sessionLogoutTime) {
            this.sessionLogoutTime = sessionLogoutTime;
            return this;
        }

        /**
         * SqlContent.
         */
        public Builder sqlContent(String sqlContent) {
            this.sqlContent = sqlContent;
            return this;
        }

        /**
         * SqlId.
         */
        public Builder sqlId(String sqlId) {
            this.sqlId = sqlId;
            return this;
        }

        /**
         * SqlResult.
         */
        public Builder sqlResult(String sqlResult) {
            this.sqlResult = sqlResult;
            return this;
        }

        /**
         * SqlType.
         */
        public Builder sqlType(String sqlType) {
            this.sqlType = sqlType;
            return this;
        }

        /**
         * SqlTypeName.
         */
        public Builder sqlTypeName(String sqlTypeName) {
            this.sqlTypeName = sqlTypeName;
            return this;
        }

        /**
         * TemplateContent.
         */
        public Builder templateContent(String templateContent) {
            this.templateContent = templateContent;
            return this;
        }

        /**
         * TemplateId.
         */
        public Builder templateId(String templateId) {
            this.templateId = templateId;
            return this;
        }

        /**
         * TemplateRules.
         */
        public Builder templateRules(java.util.List<String> templateRules) {
            this.templateRules = templateRules;
            return this;
        }

        public GetLogDetailResponseBody build() {
            return new GetLogDetailResponseBody(this);
        } 

    } 

}
