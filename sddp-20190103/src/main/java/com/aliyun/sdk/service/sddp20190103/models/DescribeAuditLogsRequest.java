// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sddp20190103.models;

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
 * {@link DescribeAuditLogsRequest} extends {@link RequestModel}
 *
 * <p>DescribeAuditLogsRequest</p>
 */
public class DescribeAuditLogsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AsyncRequestId")
    private String asyncRequestId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientIp")
    private String clientIp;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientUa")
    private String clientUa;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CurrentPage")
    private Integer currentPage;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DatabaseName")
    private String databaseName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EffectRowRange")
    private String effectRowRange;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EndTime")
    private Long endTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ExecuteTimeRange")
    private String executeTimeRange;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceName")
    private String instanceName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IpType")
    private String ipType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("LoadWhiteList")
    private Boolean loadWhiteList;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MemberAccount")
    private String memberAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OperateType")
    private String operateType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OssObjectKey")
    private String ossObjectKey;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ProductCode")
    private String productCode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ProductId")
    private Long productId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RuleCategory")
    private String ruleCategory;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RuleID")
    private String ruleID;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RuleName")
    private String ruleName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SqlText")
    private String sqlText;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StartTime")
    private Long startTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UserName")
    private String userName;

    private DescribeAuditLogsRequest(Builder builder) {
        super(builder);
        this.asyncRequestId = builder.asyncRequestId;
        this.clientIp = builder.clientIp;
        this.clientUa = builder.clientUa;
        this.currentPage = builder.currentPage;
        this.databaseName = builder.databaseName;
        this.effectRowRange = builder.effectRowRange;
        this.endTime = builder.endTime;
        this.executeTimeRange = builder.executeTimeRange;
        this.instanceName = builder.instanceName;
        this.ipType = builder.ipType;
        this.lang = builder.lang;
        this.loadWhiteList = builder.loadWhiteList;
        this.memberAccount = builder.memberAccount;
        this.message = builder.message;
        this.operateType = builder.operateType;
        this.ossObjectKey = builder.ossObjectKey;
        this.pageSize = builder.pageSize;
        this.productCode = builder.productCode;
        this.productId = builder.productId;
        this.ruleCategory = builder.ruleCategory;
        this.ruleID = builder.ruleID;
        this.ruleName = builder.ruleName;
        this.sqlText = builder.sqlText;
        this.startTime = builder.startTime;
        this.userName = builder.userName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeAuditLogsRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return asyncRequestId
     */
    public String getAsyncRequestId() {
        return this.asyncRequestId;
    }

    /**
     * @return clientIp
     */
    public String getClientIp() {
        return this.clientIp;
    }

    /**
     * @return clientUa
     */
    public String getClientUa() {
        return this.clientUa;
    }

    /**
     * @return currentPage
     */
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    /**
     * @return databaseName
     */
    public String getDatabaseName() {
        return this.databaseName;
    }

    /**
     * @return effectRowRange
     */
    public String getEffectRowRange() {
        return this.effectRowRange;
    }

    /**
     * @return endTime
     */
    public Long getEndTime() {
        return this.endTime;
    }

    /**
     * @return executeTimeRange
     */
    public String getExecuteTimeRange() {
        return this.executeTimeRange;
    }

    /**
     * @return instanceName
     */
    public String getInstanceName() {
        return this.instanceName;
    }

    /**
     * @return ipType
     */
    public String getIpType() {
        return this.ipType;
    }

    /**
     * @return lang
     */
    public String getLang() {
        return this.lang;
    }

    /**
     * @return loadWhiteList
     */
    public Boolean getLoadWhiteList() {
        return this.loadWhiteList;
    }

    /**
     * @return memberAccount
     */
    public String getMemberAccount() {
        return this.memberAccount;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return operateType
     */
    public String getOperateType() {
        return this.operateType;
    }

    /**
     * @return ossObjectKey
     */
    public String getOssObjectKey() {
        return this.ossObjectKey;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return productCode
     */
    public String getProductCode() {
        return this.productCode;
    }

    /**
     * @return productId
     */
    public Long getProductId() {
        return this.productId;
    }

    /**
     * @return ruleCategory
     */
    public String getRuleCategory() {
        return this.ruleCategory;
    }

    /**
     * @return ruleID
     */
    public String getRuleID() {
        return this.ruleID;
    }

    /**
     * @return ruleName
     */
    public String getRuleName() {
        return this.ruleName;
    }

    /**
     * @return sqlText
     */
    public String getSqlText() {
        return this.sqlText;
    }

    /**
     * @return startTime
     */
    public Long getStartTime() {
        return this.startTime;
    }

    /**
     * @return userName
     */
    public String getUserName() {
        return this.userName;
    }

    public static final class Builder extends Request.Builder<DescribeAuditLogsRequest, Builder> {
        private String asyncRequestId; 
        private String clientIp; 
        private String clientUa; 
        private Integer currentPage; 
        private String databaseName; 
        private String effectRowRange; 
        private Long endTime; 
        private String executeTimeRange; 
        private String instanceName; 
        private String ipType; 
        private String lang; 
        private Boolean loadWhiteList; 
        private String memberAccount; 
        private String message; 
        private String operateType; 
        private String ossObjectKey; 
        private Integer pageSize; 
        private String productCode; 
        private Long productId; 
        private String ruleCategory; 
        private String ruleID; 
        private String ruleName; 
        private String sqlText; 
        private Long startTime; 
        private String userName; 

        private Builder() {
            super();
        } 

        private Builder(DescribeAuditLogsRequest request) {
            super(request);
            this.asyncRequestId = request.asyncRequestId;
            this.clientIp = request.clientIp;
            this.clientUa = request.clientUa;
            this.currentPage = request.currentPage;
            this.databaseName = request.databaseName;
            this.effectRowRange = request.effectRowRange;
            this.endTime = request.endTime;
            this.executeTimeRange = request.executeTimeRange;
            this.instanceName = request.instanceName;
            this.ipType = request.ipType;
            this.lang = request.lang;
            this.loadWhiteList = request.loadWhiteList;
            this.memberAccount = request.memberAccount;
            this.message = request.message;
            this.operateType = request.operateType;
            this.ossObjectKey = request.ossObjectKey;
            this.pageSize = request.pageSize;
            this.productCode = request.productCode;
            this.productId = request.productId;
            this.ruleCategory = request.ruleCategory;
            this.ruleID = request.ruleID;
            this.ruleName = request.ruleName;
            this.sqlText = request.sqlText;
            this.startTime = request.startTime;
            this.userName = request.userName;
        } 

        /**
         * AsyncRequestId.
         */
        public Builder asyncRequestId(String asyncRequestId) {
            this.putQueryParameter("AsyncRequestId", asyncRequestId);
            this.asyncRequestId = asyncRequestId;
            return this;
        }

        /**
         * ClientIp.
         */
        public Builder clientIp(String clientIp) {
            this.putQueryParameter("ClientIp", clientIp);
            this.clientIp = clientIp;
            return this;
        }

        /**
         * ClientUa.
         */
        public Builder clientUa(String clientUa) {
            this.putQueryParameter("ClientUa", clientUa);
            this.clientUa = clientUa;
            return this;
        }

        /**
         * CurrentPage.
         */
        public Builder currentPage(Integer currentPage) {
            this.putQueryParameter("CurrentPage", currentPage);
            this.currentPage = currentPage;
            return this;
        }

        /**
         * DatabaseName.
         */
        public Builder databaseName(String databaseName) {
            this.putQueryParameter("DatabaseName", databaseName);
            this.databaseName = databaseName;
            return this;
        }

        /**
         * EffectRowRange.
         */
        public Builder effectRowRange(String effectRowRange) {
            this.putQueryParameter("EffectRowRange", effectRowRange);
            this.effectRowRange = effectRowRange;
            return this;
        }

        /**
         * EndTime.
         */
        public Builder endTime(Long endTime) {
            this.putQueryParameter("EndTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * ExecuteTimeRange.
         */
        public Builder executeTimeRange(String executeTimeRange) {
            this.putQueryParameter("ExecuteTimeRange", executeTimeRange);
            this.executeTimeRange = executeTimeRange;
            return this;
        }

        /**
         * InstanceName.
         */
        public Builder instanceName(String instanceName) {
            this.putQueryParameter("InstanceName", instanceName);
            this.instanceName = instanceName;
            return this;
        }

        /**
         * IpType.
         */
        public Builder ipType(String ipType) {
            this.putQueryParameter("IpType", ipType);
            this.ipType = ipType;
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
         * LoadWhiteList.
         */
        public Builder loadWhiteList(Boolean loadWhiteList) {
            this.putQueryParameter("LoadWhiteList", loadWhiteList);
            this.loadWhiteList = loadWhiteList;
            return this;
        }

        /**
         * MemberAccount.
         */
        public Builder memberAccount(String memberAccount) {
            this.putQueryParameter("MemberAccount", memberAccount);
            this.memberAccount = memberAccount;
            return this;
        }

        /**
         * Message.
         */
        public Builder message(String message) {
            this.putQueryParameter("Message", message);
            this.message = message;
            return this;
        }

        /**
         * OperateType.
         */
        public Builder operateType(String operateType) {
            this.putQueryParameter("OperateType", operateType);
            this.operateType = operateType;
            return this;
        }

        /**
         * OssObjectKey.
         */
        public Builder ossObjectKey(String ossObjectKey) {
            this.putQueryParameter("OssObjectKey", ossObjectKey);
            this.ossObjectKey = ossObjectKey;
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
         * ProductCode.
         */
        public Builder productCode(String productCode) {
            this.putQueryParameter("ProductCode", productCode);
            this.productCode = productCode;
            return this;
        }

        /**
         * ProductId.
         */
        public Builder productId(Long productId) {
            this.putQueryParameter("ProductId", productId);
            this.productId = productId;
            return this;
        }

        /**
         * RuleCategory.
         */
        public Builder ruleCategory(String ruleCategory) {
            this.putQueryParameter("RuleCategory", ruleCategory);
            this.ruleCategory = ruleCategory;
            return this;
        }

        /**
         * RuleID.
         */
        public Builder ruleID(String ruleID) {
            this.putQueryParameter("RuleID", ruleID);
            this.ruleID = ruleID;
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
         * SqlText.
         */
        public Builder sqlText(String sqlText) {
            this.putQueryParameter("SqlText", sqlText);
            this.sqlText = sqlText;
            return this;
        }

        /**
         * StartTime.
         */
        public Builder startTime(Long startTime) {
            this.putQueryParameter("StartTime", startTime);
            this.startTime = startTime;
            return this;
        }

        /**
         * UserName.
         */
        public Builder userName(String userName) {
            this.putQueryParameter("UserName", userName);
            this.userName = userName;
            return this;
        }

        @Override
        public DescribeAuditLogsRequest build() {
            return new DescribeAuditLogsRequest(this);
        } 

    } 

}
