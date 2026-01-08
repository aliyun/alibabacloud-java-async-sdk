// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cams20200606.models;

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
 * {@link AddMarketingFlowRequest} extends {@link RequestModel}
 *
 * <p>AddMarketingFlowRequest</p>
 */
public class AddMarketingFlowRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ActivityDesc")
    private String activityDesc;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ActivityName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String activityName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BizCode")
    private String bizCode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BizExtend")
    private java.util.Map<String, ?> bizExtend;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CronExpression")
    private String cronExpression;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EndDate")
    private String endDate;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ExecutionType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String executionType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ParamFlag")
    private String paramFlag;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Params")
    private java.util.Map<String, ?> params;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RelatedFlowCode")
    private String relatedFlowCode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RelatedFlowName")
    private String relatedFlowName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RelatedGroupId")
    private Long relatedGroupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StartDate")
    private String startDate;

    private AddMarketingFlowRequest(Builder builder) {
        super(builder);
        this.activityDesc = builder.activityDesc;
        this.activityName = builder.activityName;
        this.bizCode = builder.bizCode;
        this.bizExtend = builder.bizExtend;
        this.cronExpression = builder.cronExpression;
        this.endDate = builder.endDate;
        this.executionType = builder.executionType;
        this.ownerId = builder.ownerId;
        this.paramFlag = builder.paramFlag;
        this.params = builder.params;
        this.relatedFlowCode = builder.relatedFlowCode;
        this.relatedFlowName = builder.relatedFlowName;
        this.relatedGroupId = builder.relatedGroupId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.startDate = builder.startDate;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AddMarketingFlowRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return activityDesc
     */
    public String getActivityDesc() {
        return this.activityDesc;
    }

    /**
     * @return activityName
     */
    public String getActivityName() {
        return this.activityName;
    }

    /**
     * @return bizCode
     */
    public String getBizCode() {
        return this.bizCode;
    }

    /**
     * @return bizExtend
     */
    public java.util.Map<String, ?> getBizExtend() {
        return this.bizExtend;
    }

    /**
     * @return cronExpression
     */
    public String getCronExpression() {
        return this.cronExpression;
    }

    /**
     * @return endDate
     */
    public String getEndDate() {
        return this.endDate;
    }

    /**
     * @return executionType
     */
    public String getExecutionType() {
        return this.executionType;
    }

    /**
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
    }

    /**
     * @return paramFlag
     */
    public String getParamFlag() {
        return this.paramFlag;
    }

    /**
     * @return params
     */
    public java.util.Map<String, ?> getParams() {
        return this.params;
    }

    /**
     * @return relatedFlowCode
     */
    public String getRelatedFlowCode() {
        return this.relatedFlowCode;
    }

    /**
     * @return relatedFlowName
     */
    public String getRelatedFlowName() {
        return this.relatedFlowName;
    }

    /**
     * @return relatedGroupId
     */
    public Long getRelatedGroupId() {
        return this.relatedGroupId;
    }

    /**
     * @return resourceOwnerAccount
     */
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    /**
     * @return resourceOwnerId
     */
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    /**
     * @return startDate
     */
    public String getStartDate() {
        return this.startDate;
    }

    public static final class Builder extends Request.Builder<AddMarketingFlowRequest, Builder> {
        private String activityDesc; 
        private String activityName; 
        private String bizCode; 
        private java.util.Map<String, ?> bizExtend; 
        private String cronExpression; 
        private String endDate; 
        private String executionType; 
        private Long ownerId; 
        private String paramFlag; 
        private java.util.Map<String, ?> params; 
        private String relatedFlowCode; 
        private String relatedFlowName; 
        private Long relatedGroupId; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private String startDate; 

        private Builder() {
            super();
        } 

        private Builder(AddMarketingFlowRequest request) {
            super(request);
            this.activityDesc = request.activityDesc;
            this.activityName = request.activityName;
            this.bizCode = request.bizCode;
            this.bizExtend = request.bizExtend;
            this.cronExpression = request.cronExpression;
            this.endDate = request.endDate;
            this.executionType = request.executionType;
            this.ownerId = request.ownerId;
            this.paramFlag = request.paramFlag;
            this.params = request.params;
            this.relatedFlowCode = request.relatedFlowCode;
            this.relatedFlowName = request.relatedFlowName;
            this.relatedGroupId = request.relatedGroupId;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
            this.startDate = request.startDate;
        } 

        /**
         * ActivityDesc.
         */
        public Builder activityDesc(String activityDesc) {
            this.putQueryParameter("ActivityDesc", activityDesc);
            this.activityDesc = activityDesc;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>示例值示例值</p>
         */
        public Builder activityName(String activityName) {
            this.putQueryParameter("ActivityName", activityName);
            this.activityName = activityName;
            return this;
        }

        /**
         * BizCode.
         */
        public Builder bizCode(String bizCode) {
            this.putQueryParameter("BizCode", bizCode);
            this.bizCode = bizCode;
            return this;
        }

        /**
         * BizExtend.
         */
        public Builder bizExtend(java.util.Map<String, ?> bizExtend) {
            String bizExtendShrink = shrink(bizExtend, "BizExtend", "json");
            this.putQueryParameter("BizExtend", bizExtendShrink);
            this.bizExtend = bizExtend;
            return this;
        }

        /**
         * CronExpression.
         */
        public Builder cronExpression(String cronExpression) {
            this.putQueryParameter("CronExpression", cronExpression);
            this.cronExpression = cronExpression;
            return this;
        }

        /**
         * EndDate.
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
         * <p>示例值</p>
         */
        public Builder executionType(String executionType) {
            this.putQueryParameter("ExecutionType", executionType);
            this.executionType = executionType;
            return this;
        }

        /**
         * OwnerId.
         */
        public Builder ownerId(Long ownerId) {
            this.putQueryParameter("OwnerId", ownerId);
            this.ownerId = ownerId;
            return this;
        }

        /**
         * ParamFlag.
         */
        public Builder paramFlag(String paramFlag) {
            this.putQueryParameter("ParamFlag", paramFlag);
            this.paramFlag = paramFlag;
            return this;
        }

        /**
         * Params.
         */
        public Builder params(java.util.Map<String, ?> params) {
            String paramsShrink = shrink(params, "Params", "json");
            this.putQueryParameter("Params", paramsShrink);
            this.params = params;
            return this;
        }

        /**
         * RelatedFlowCode.
         */
        public Builder relatedFlowCode(String relatedFlowCode) {
            this.putQueryParameter("RelatedFlowCode", relatedFlowCode);
            this.relatedFlowCode = relatedFlowCode;
            return this;
        }

        /**
         * RelatedFlowName.
         */
        public Builder relatedFlowName(String relatedFlowName) {
            this.putQueryParameter("RelatedFlowName", relatedFlowName);
            this.relatedFlowName = relatedFlowName;
            return this;
        }

        /**
         * RelatedGroupId.
         */
        public Builder relatedGroupId(Long relatedGroupId) {
            this.putQueryParameter("RelatedGroupId", relatedGroupId);
            this.relatedGroupId = relatedGroupId;
            return this;
        }

        /**
         * ResourceOwnerAccount.
         */
        public Builder resourceOwnerAccount(String resourceOwnerAccount) {
            this.putQueryParameter("ResourceOwnerAccount", resourceOwnerAccount);
            this.resourceOwnerAccount = resourceOwnerAccount;
            return this;
        }

        /**
         * ResourceOwnerId.
         */
        public Builder resourceOwnerId(Long resourceOwnerId) {
            this.putQueryParameter("ResourceOwnerId", resourceOwnerId);
            this.resourceOwnerId = resourceOwnerId;
            return this;
        }

        /**
         * StartDate.
         */
        public Builder startDate(String startDate) {
            this.putQueryParameter("StartDate", startDate);
            this.startDate = startDate;
            return this;
        }

        @Override
        public AddMarketingFlowRequest build() {
            return new AddMarketingFlowRequest(this);
        } 

    } 

}
