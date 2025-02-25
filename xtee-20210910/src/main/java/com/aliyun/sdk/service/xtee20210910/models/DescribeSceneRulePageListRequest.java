// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.xtee20210910.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeSceneRulePageListRequest} extends {@link RequestModel}
 *
 * <p>DescribeSceneRulePageListRequest</p>
 */
public class DescribeSceneRulePageListRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("createType")
    private String createType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("currentPage")
    private String currentPage;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("eventCode")
    private String eventCode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("pageSize")
    private String pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("regId")
    private String regId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ruleAuthType")
    private String ruleAuthType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ruleName")
    private String ruleName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ruleStatus")
    private String ruleStatus;

    private DescribeSceneRulePageListRequest(Builder builder) {
        super(builder);
        this.lang = builder.lang;
        this.createType = builder.createType;
        this.currentPage = builder.currentPage;
        this.eventCode = builder.eventCode;
        this.pageSize = builder.pageSize;
        this.regId = builder.regId;
        this.ruleAuthType = builder.ruleAuthType;
        this.ruleName = builder.ruleName;
        this.ruleStatus = builder.ruleStatus;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeSceneRulePageListRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return lang
     */
    public String getLang() {
        return this.lang;
    }

    /**
     * @return createType
     */
    public String getCreateType() {
        return this.createType;
    }

    /**
     * @return currentPage
     */
    public String getCurrentPage() {
        return this.currentPage;
    }

    /**
     * @return eventCode
     */
    public String getEventCode() {
        return this.eventCode;
    }

    /**
     * @return pageSize
     */
    public String getPageSize() {
        return this.pageSize;
    }

    /**
     * @return regId
     */
    public String getRegId() {
        return this.regId;
    }

    /**
     * @return ruleAuthType
     */
    public String getRuleAuthType() {
        return this.ruleAuthType;
    }

    /**
     * @return ruleName
     */
    public String getRuleName() {
        return this.ruleName;
    }

    /**
     * @return ruleStatus
     */
    public String getRuleStatus() {
        return this.ruleStatus;
    }

    public static final class Builder extends Request.Builder<DescribeSceneRulePageListRequest, Builder> {
        private String lang; 
        private String createType; 
        private String currentPage; 
        private String eventCode; 
        private String pageSize; 
        private String regId; 
        private String ruleAuthType; 
        private String ruleName; 
        private String ruleStatus; 

        private Builder() {
            super();
        } 

        private Builder(DescribeSceneRulePageListRequest request) {
            super(request);
            this.lang = request.lang;
            this.createType = request.createType;
            this.currentPage = request.currentPage;
            this.eventCode = request.eventCode;
            this.pageSize = request.pageSize;
            this.regId = request.regId;
            this.ruleAuthType = request.ruleAuthType;
            this.ruleName = request.ruleName;
            this.ruleStatus = request.ruleStatus;
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
         * createType.
         */
        public Builder createType(String createType) {
            this.putQueryParameter("createType", createType);
            this.createType = createType;
            return this;
        }

        /**
         * currentPage.
         */
        public Builder currentPage(String currentPage) {
            this.putQueryParameter("currentPage", currentPage);
            this.currentPage = currentPage;
            return this;
        }

        /**
         * eventCode.
         */
        public Builder eventCode(String eventCode) {
            this.putQueryParameter("eventCode", eventCode);
            this.eventCode = eventCode;
            return this;
        }

        /**
         * pageSize.
         */
        public Builder pageSize(String pageSize) {
            this.putQueryParameter("pageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * regId.
         */
        public Builder regId(String regId) {
            this.putQueryParameter("regId", regId);
            this.regId = regId;
            return this;
        }

        /**
         * ruleAuthType.
         */
        public Builder ruleAuthType(String ruleAuthType) {
            this.putQueryParameter("ruleAuthType", ruleAuthType);
            this.ruleAuthType = ruleAuthType;
            return this;
        }

        /**
         * ruleName.
         */
        public Builder ruleName(String ruleName) {
            this.putQueryParameter("ruleName", ruleName);
            this.ruleName = ruleName;
            return this;
        }

        /**
         * ruleStatus.
         */
        public Builder ruleStatus(String ruleStatus) {
            this.putQueryParameter("ruleStatus", ruleStatus);
            this.ruleStatus = ruleStatus;
            return this;
        }

        @Override
        public DescribeSceneRulePageListRequest build() {
            return new DescribeSceneRulePageListRequest(this);
        } 

    } 

}
