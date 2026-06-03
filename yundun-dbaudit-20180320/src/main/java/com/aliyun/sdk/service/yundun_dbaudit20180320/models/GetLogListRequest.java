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
 * {@link GetLogListRequest} extends {@link RequestModel}
 *
 * <p>GetLogListRequest</p>
 */
public class GetLogListRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BeginDate")
    @com.aliyun.core.annotation.Validation(required = true)
    private String beginDate;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientIpList")
    private java.util.List<String> clientIpList;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientProgramList")
    private java.util.List<String> clientProgramList;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DbHostList")
    private java.util.List<String> dbHostList;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DbId")
    private Integer dbId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DbUserList")
    private java.util.List<String> dbUserList;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EndDate")
    @com.aliyun.core.annotation.Validation(required = true)
    private String endDate;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IsSuccess")
    private String isSuccess;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MaxAffectRows")
    private Integer maxAffectRows;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MaxExecCostUS")
    private Integer maxExecCostUS;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MinAffectRows")
    private Integer minAffectRows;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MinExecCostUS")
    private Integer minExecCostUS;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RiskLevelList")
    private java.util.List<String> riskLevelList;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RuleName")
    private String ruleName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RuleTypeList")
    private java.util.List<String> ruleTypeList;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SessionId")
    private String sessionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SqlId")
    private String sqlId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SqlKey")
    private String sqlKey;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SqlTypeList")
    private java.util.List<String> sqlTypeList;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TemplateId")
    private String templateId;

    private GetLogListRequest(Builder builder) {
        super(builder);
        this.beginDate = builder.beginDate;
        this.clientIpList = builder.clientIpList;
        this.clientProgramList = builder.clientProgramList;
        this.dbHostList = builder.dbHostList;
        this.dbId = builder.dbId;
        this.dbUserList = builder.dbUserList;
        this.endDate = builder.endDate;
        this.instanceId = builder.instanceId;
        this.isSuccess = builder.isSuccess;
        this.lang = builder.lang;
        this.maxAffectRows = builder.maxAffectRows;
        this.maxExecCostUS = builder.maxExecCostUS;
        this.minAffectRows = builder.minAffectRows;
        this.minExecCostUS = builder.minExecCostUS;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.regionId = builder.regionId;
        this.riskLevelList = builder.riskLevelList;
        this.ruleName = builder.ruleName;
        this.ruleTypeList = builder.ruleTypeList;
        this.sessionId = builder.sessionId;
        this.sqlId = builder.sqlId;
        this.sqlKey = builder.sqlKey;
        this.sqlTypeList = builder.sqlTypeList;
        this.templateId = builder.templateId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetLogListRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return beginDate
     */
    public String getBeginDate() {
        return this.beginDate;
    }

    /**
     * @return clientIpList
     */
    public java.util.List<String> getClientIpList() {
        return this.clientIpList;
    }

    /**
     * @return clientProgramList
     */
    public java.util.List<String> getClientProgramList() {
        return this.clientProgramList;
    }

    /**
     * @return dbHostList
     */
    public java.util.List<String> getDbHostList() {
        return this.dbHostList;
    }

    /**
     * @return dbId
     */
    public Integer getDbId() {
        return this.dbId;
    }

    /**
     * @return dbUserList
     */
    public java.util.List<String> getDbUserList() {
        return this.dbUserList;
    }

    /**
     * @return endDate
     */
    public String getEndDate() {
        return this.endDate;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return isSuccess
     */
    public String getIsSuccess() {
        return this.isSuccess;
    }

    /**
     * @return lang
     */
    public String getLang() {
        return this.lang;
    }

    /**
     * @return maxAffectRows
     */
    public Integer getMaxAffectRows() {
        return this.maxAffectRows;
    }

    /**
     * @return maxExecCostUS
     */
    public Integer getMaxExecCostUS() {
        return this.maxExecCostUS;
    }

    /**
     * @return minAffectRows
     */
    public Integer getMinAffectRows() {
        return this.minAffectRows;
    }

    /**
     * @return minExecCostUS
     */
    public Integer getMinExecCostUS() {
        return this.minExecCostUS;
    }

    /**
     * @return pageNumber
     */
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return riskLevelList
     */
    public java.util.List<String> getRiskLevelList() {
        return this.riskLevelList;
    }

    /**
     * @return ruleName
     */
    public String getRuleName() {
        return this.ruleName;
    }

    /**
     * @return ruleTypeList
     */
    public java.util.List<String> getRuleTypeList() {
        return this.ruleTypeList;
    }

    /**
     * @return sessionId
     */
    public String getSessionId() {
        return this.sessionId;
    }

    /**
     * @return sqlId
     */
    public String getSqlId() {
        return this.sqlId;
    }

    /**
     * @return sqlKey
     */
    public String getSqlKey() {
        return this.sqlKey;
    }

    /**
     * @return sqlTypeList
     */
    public java.util.List<String> getSqlTypeList() {
        return this.sqlTypeList;
    }

    /**
     * @return templateId
     */
    public String getTemplateId() {
        return this.templateId;
    }

    public static final class Builder extends Request.Builder<GetLogListRequest, Builder> {
        private String beginDate; 
        private java.util.List<String> clientIpList; 
        private java.util.List<String> clientProgramList; 
        private java.util.List<String> dbHostList; 
        private Integer dbId; 
        private java.util.List<String> dbUserList; 
        private String endDate; 
        private String instanceId; 
        private String isSuccess; 
        private String lang; 
        private Integer maxAffectRows; 
        private Integer maxExecCostUS; 
        private Integer minAffectRows; 
        private Integer minExecCostUS; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String regionId; 
        private java.util.List<String> riskLevelList; 
        private String ruleName; 
        private java.util.List<String> ruleTypeList; 
        private String sessionId; 
        private String sqlId; 
        private String sqlKey; 
        private java.util.List<String> sqlTypeList; 
        private String templateId; 

        private Builder() {
            super();
        } 

        private Builder(GetLogListRequest request) {
            super(request);
            this.beginDate = request.beginDate;
            this.clientIpList = request.clientIpList;
            this.clientProgramList = request.clientProgramList;
            this.dbHostList = request.dbHostList;
            this.dbId = request.dbId;
            this.dbUserList = request.dbUserList;
            this.endDate = request.endDate;
            this.instanceId = request.instanceId;
            this.isSuccess = request.isSuccess;
            this.lang = request.lang;
            this.maxAffectRows = request.maxAffectRows;
            this.maxExecCostUS = request.maxExecCostUS;
            this.minAffectRows = request.minAffectRows;
            this.minExecCostUS = request.minExecCostUS;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.regionId = request.regionId;
            this.riskLevelList = request.riskLevelList;
            this.ruleName = request.ruleName;
            this.ruleTypeList = request.ruleTypeList;
            this.sessionId = request.sessionId;
            this.sqlId = request.sqlId;
            this.sqlKey = request.sqlKey;
            this.sqlTypeList = request.sqlTypeList;
            this.templateId = request.templateId;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>2019-06-06 00:00:00</p>
         */
        public Builder beginDate(String beginDate) {
            this.putQueryParameter("BeginDate", beginDate);
            this.beginDate = beginDate;
            return this;
        }

        /**
         * ClientIpList.
         */
        public Builder clientIpList(java.util.List<String> clientIpList) {
            this.putQueryParameter("ClientIpList", clientIpList);
            this.clientIpList = clientIpList;
            return this;
        }

        /**
         * ClientProgramList.
         */
        public Builder clientProgramList(java.util.List<String> clientProgramList) {
            this.putQueryParameter("ClientProgramList", clientProgramList);
            this.clientProgramList = clientProgramList;
            return this;
        }

        /**
         * DbHostList.
         */
        public Builder dbHostList(java.util.List<String> dbHostList) {
            this.putQueryParameter("DbHostList", dbHostList);
            this.dbHostList = dbHostList;
            return this;
        }

        /**
         * DbId.
         */
        public Builder dbId(Integer dbId) {
            this.putQueryParameter("DbId", dbId);
            this.dbId = dbId;
            return this;
        }

        /**
         * DbUserList.
         */
        public Builder dbUserList(java.util.List<String> dbUserList) {
            this.putQueryParameter("DbUserList", dbUserList);
            this.dbUserList = dbUserList;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>2019-06-06 23:59:59</p>
         */
        public Builder endDate(String endDate) {
            this.putQueryParameter("EndDate", endDate);
            this.endDate = endDate;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>dbaudit-cn-78v1gc****</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * IsSuccess.
         */
        public Builder isSuccess(String isSuccess) {
            this.putQueryParameter("IsSuccess", isSuccess);
            this.isSuccess = isSuccess;
            return this;
        }

        /**
         * Lang.
         */
        public Builder lang(String lang) {
            this.putQueryParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        /**
         * MaxAffectRows.
         */
        public Builder maxAffectRows(Integer maxAffectRows) {
            this.putQueryParameter("MaxAffectRows", maxAffectRows);
            this.maxAffectRows = maxAffectRows;
            return this;
        }

        /**
         * MaxExecCostUS.
         */
        public Builder maxExecCostUS(Integer maxExecCostUS) {
            this.putQueryParameter("MaxExecCostUS", maxExecCostUS);
            this.maxExecCostUS = maxExecCostUS;
            return this;
        }

        /**
         * MinAffectRows.
         */
        public Builder minAffectRows(Integer minAffectRows) {
            this.putQueryParameter("MinAffectRows", minAffectRows);
            this.minAffectRows = minAffectRows;
            return this;
        }

        /**
         * MinExecCostUS.
         */
        public Builder minExecCostUS(Integer minExecCostUS) {
            this.putQueryParameter("MinExecCostUS", minExecCostUS);
            this.minExecCostUS = minExecCostUS;
            return this;
        }

        /**
         * PageNumber.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.putQueryParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * RiskLevelList.
         */
        public Builder riskLevelList(java.util.List<String> riskLevelList) {
            this.putQueryParameter("RiskLevelList", riskLevelList);
            this.riskLevelList = riskLevelList;
            return this;
        }

        /**
         * RuleName.
         */
        public Builder ruleName(String ruleName) {
            this.putQueryParameter("RuleName", ruleName);
            this.ruleName = ruleName;
            return this;
        }

        /**
         * RuleTypeList.
         */
        public Builder ruleTypeList(java.util.List<String> ruleTypeList) {
            this.putQueryParameter("RuleTypeList", ruleTypeList);
            this.ruleTypeList = ruleTypeList;
            return this;
        }

        /**
         * SessionId.
         */
        public Builder sessionId(String sessionId) {
            this.putQueryParameter("SessionId", sessionId);
            this.sessionId = sessionId;
            return this;
        }

        /**
         * SqlId.
         */
        public Builder sqlId(String sqlId) {
            this.putQueryParameter("SqlId", sqlId);
            this.sqlId = sqlId;
            return this;
        }

        /**
         * SqlKey.
         */
        public Builder sqlKey(String sqlKey) {
            this.putQueryParameter("SqlKey", sqlKey);
            this.sqlKey = sqlKey;
            return this;
        }

        /**
         * SqlTypeList.
         */
        public Builder sqlTypeList(java.util.List<String> sqlTypeList) {
            this.putQueryParameter("SqlTypeList", sqlTypeList);
            this.sqlTypeList = sqlTypeList;
            return this;
        }

        /**
         * TemplateId.
         */
        public Builder templateId(String templateId) {
            this.putQueryParameter("TemplateId", templateId);
            this.templateId = templateId;
            return this;
        }

        @Override
        public GetLogListRequest build() {
            return new GetLogListRequest(this);
        } 

    } 

}
