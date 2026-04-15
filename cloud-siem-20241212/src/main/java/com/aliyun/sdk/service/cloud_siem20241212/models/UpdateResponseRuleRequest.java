// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloud_siem20241212.models;

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
 * {@link UpdateResponseRuleRequest} extends {@link RequestModel}
 *
 * <p>UpdateResponseRuleRequest</p>
 */
public class UpdateResponseRuleRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("MaxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ResponseActionConfig")
    private String responseActionConfig;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ResponseActionType")
    private String responseActionType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ResponseExecutionCondition")
    private String responseExecutionCondition;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ResponseRuleId")
    private String responseRuleId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ResponseRuleName")
    private String responseRuleName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ResponseRulePriority")
    private Integer responseRulePriority;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ResponseRuleStatus")
    private Integer responseRuleStatus;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ResponseTriggerType")
    private String responseTriggerType;

    private UpdateResponseRuleRequest(Builder builder) {
        super(builder);
        this.lang = builder.lang;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.regionId = builder.regionId;
        this.responseActionConfig = builder.responseActionConfig;
        this.responseActionType = builder.responseActionType;
        this.responseExecutionCondition = builder.responseExecutionCondition;
        this.responseRuleId = builder.responseRuleId;
        this.responseRuleName = builder.responseRuleName;
        this.responseRulePriority = builder.responseRulePriority;
        this.responseRuleStatus = builder.responseRuleStatus;
        this.responseTriggerType = builder.responseTriggerType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateResponseRuleRequest create() {
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
     * @return maxResults
     */
    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return responseActionConfig
     */
    public String getResponseActionConfig() {
        return this.responseActionConfig;
    }

    /**
     * @return responseActionType
     */
    public String getResponseActionType() {
        return this.responseActionType;
    }

    /**
     * @return responseExecutionCondition
     */
    public String getResponseExecutionCondition() {
        return this.responseExecutionCondition;
    }

    /**
     * @return responseRuleId
     */
    public String getResponseRuleId() {
        return this.responseRuleId;
    }

    /**
     * @return responseRuleName
     */
    public String getResponseRuleName() {
        return this.responseRuleName;
    }

    /**
     * @return responseRulePriority
     */
    public Integer getResponseRulePriority() {
        return this.responseRulePriority;
    }

    /**
     * @return responseRuleStatus
     */
    public Integer getResponseRuleStatus() {
        return this.responseRuleStatus;
    }

    /**
     * @return responseTriggerType
     */
    public String getResponseTriggerType() {
        return this.responseTriggerType;
    }

    public static final class Builder extends Request.Builder<UpdateResponseRuleRequest, Builder> {
        private String lang; 
        private Integer maxResults; 
        private String nextToken; 
        private String regionId; 
        private String responseActionConfig; 
        private String responseActionType; 
        private String responseExecutionCondition; 
        private String responseRuleId; 
        private String responseRuleName; 
        private Integer responseRulePriority; 
        private Integer responseRuleStatus; 
        private String responseTriggerType; 

        private Builder() {
            super();
        } 

        private Builder(UpdateResponseRuleRequest request) {
            super(request);
            this.lang = request.lang;
            this.maxResults = request.maxResults;
            this.nextToken = request.nextToken;
            this.regionId = request.regionId;
            this.responseActionConfig = request.responseActionConfig;
            this.responseActionType = request.responseActionType;
            this.responseExecutionCondition = request.responseExecutionCondition;
            this.responseRuleId = request.responseRuleId;
            this.responseRuleName = request.responseRuleName;
            this.responseRulePriority = request.responseRulePriority;
            this.responseRuleStatus = request.responseRuleStatus;
            this.responseTriggerType = request.responseTriggerType;
        } 

        /**
         * Lang.
         */
        public Builder lang(String lang) {
            this.putBodyParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        /**
         * MaxResults.
         */
        public Builder maxResults(Integer maxResults) {
            this.putBodyParameter("MaxResults", maxResults);
            this.maxResults = maxResults;
            return this;
        }

        /**
         * NextToken.
         */
        public Builder nextToken(String nextToken) {
            this.putBodyParameter("NextToken", nextToken);
            this.nextToken = nextToken;
            return this;
        }

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putBodyParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * ResponseActionConfig.
         */
        public Builder responseActionConfig(String responseActionConfig) {
            this.putBodyParameter("ResponseActionConfig", responseActionConfig);
            this.responseActionConfig = responseActionConfig;
            return this;
        }

        /**
         * ResponseActionType.
         */
        public Builder responseActionType(String responseActionType) {
            this.putBodyParameter("ResponseActionType", responseActionType);
            this.responseActionType = responseActionType;
            return this;
        }

        /**
         * ResponseExecutionCondition.
         */
        public Builder responseExecutionCondition(String responseExecutionCondition) {
            this.putBodyParameter("ResponseExecutionCondition", responseExecutionCondition);
            this.responseExecutionCondition = responseExecutionCondition;
            return this;
        }

        /**
         * ResponseRuleId.
         */
        public Builder responseRuleId(String responseRuleId) {
            this.putBodyParameter("ResponseRuleId", responseRuleId);
            this.responseRuleId = responseRuleId;
            return this;
        }

        /**
         * ResponseRuleName.
         */
        public Builder responseRuleName(String responseRuleName) {
            this.putBodyParameter("ResponseRuleName", responseRuleName);
            this.responseRuleName = responseRuleName;
            return this;
        }

        /**
         * ResponseRulePriority.
         */
        public Builder responseRulePriority(Integer responseRulePriority) {
            this.putBodyParameter("ResponseRulePriority", responseRulePriority);
            this.responseRulePriority = responseRulePriority;
            return this;
        }

        /**
         * ResponseRuleStatus.
         */
        public Builder responseRuleStatus(Integer responseRuleStatus) {
            this.putBodyParameter("ResponseRuleStatus", responseRuleStatus);
            this.responseRuleStatus = responseRuleStatus;
            return this;
        }

        /**
         * ResponseTriggerType.
         */
        public Builder responseTriggerType(String responseTriggerType) {
            this.putBodyParameter("ResponseTriggerType", responseTriggerType);
            this.responseTriggerType = responseTriggerType;
            return this;
        }

        @Override
        public UpdateResponseRuleRequest build() {
            return new UpdateResponseRuleRequest(this);
        } 

    } 

}
