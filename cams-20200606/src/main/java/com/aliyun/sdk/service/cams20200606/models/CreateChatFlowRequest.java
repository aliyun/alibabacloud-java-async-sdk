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
 * {@link CreateChatFlowRequest} extends {@link RequestModel}
 *
 * <p>CreateChatFlowRequest</p>
 */
public class CreateChatFlowRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BizCode")
    private String bizCode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BizExtend")
    private java.util.Map<String, ?> bizExtend;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CreateFromFlowCode")
    private String createFromFlowCode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CreateFromFlowVersion")
    private String createFromFlowVersion;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FlowTriggerType")
    private String flowTriggerType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("LifeCycleExtendData")
    private java.util.Map<String, String> lifeCycleExtendData;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Remark")
    private String remark;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Title")
    private String title;

    private CreateChatFlowRequest(Builder builder) {
        super(builder);
        this.bizCode = builder.bizCode;
        this.bizExtend = builder.bizExtend;
        this.createFromFlowCode = builder.createFromFlowCode;
        this.createFromFlowVersion = builder.createFromFlowVersion;
        this.flowTriggerType = builder.flowTriggerType;
        this.lifeCycleExtendData = builder.lifeCycleExtendData;
        this.ownerId = builder.ownerId;
        this.remark = builder.remark;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.title = builder.title;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateChatFlowRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
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
     * @return createFromFlowCode
     */
    public String getCreateFromFlowCode() {
        return this.createFromFlowCode;
    }

    /**
     * @return createFromFlowVersion
     */
    public String getCreateFromFlowVersion() {
        return this.createFromFlowVersion;
    }

    /**
     * @return flowTriggerType
     */
    public String getFlowTriggerType() {
        return this.flowTriggerType;
    }

    /**
     * @return lifeCycleExtendData
     */
    public java.util.Map<String, String> getLifeCycleExtendData() {
        return this.lifeCycleExtendData;
    }

    /**
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
    }

    /**
     * @return remark
     */
    public String getRemark() {
        return this.remark;
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
     * @return title
     */
    public String getTitle() {
        return this.title;
    }

    public static final class Builder extends Request.Builder<CreateChatFlowRequest, Builder> {
        private String bizCode; 
        private java.util.Map<String, ?> bizExtend; 
        private String createFromFlowCode; 
        private String createFromFlowVersion; 
        private String flowTriggerType; 
        private java.util.Map<String, String> lifeCycleExtendData; 
        private Long ownerId; 
        private String remark; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private String title; 

        private Builder() {
            super();
        } 

        private Builder(CreateChatFlowRequest request) {
            super(request);
            this.bizCode = request.bizCode;
            this.bizExtend = request.bizExtend;
            this.createFromFlowCode = request.createFromFlowCode;
            this.createFromFlowVersion = request.createFromFlowVersion;
            this.flowTriggerType = request.flowTriggerType;
            this.lifeCycleExtendData = request.lifeCycleExtendData;
            this.ownerId = request.ownerId;
            this.remark = request.remark;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
            this.title = request.title;
        } 

        /**
         * <p>Business tenant code, default is “ALICOM_OPAAS”.</p>
         * 
         * <strong>example:</strong>
         * <p>ALICOM_OPAAS</p>
         */
        public Builder bizCode(String bizCode) {
            this.putQueryParameter("BizCode", bizCode);
            this.bizCode = bizCode;
            return this;
        }

        /**
         * <p>Business extension information, default is “{}”.</p>
         * 
         * <strong>example:</strong>
         * <p>{}</p>
         */
        public Builder bizExtend(java.util.Map<String, ?> bizExtend) {
            String bizExtendShrink = shrink(bizExtend, "BizExtend", "json");
            this.putQueryParameter("BizExtend", bizExtendShrink);
            this.bizExtend = bizExtend;
            return this;
        }

        /**
         * CreateFromFlowCode.
         */
        public Builder createFromFlowCode(String createFromFlowCode) {
            this.putQueryParameter("CreateFromFlowCode", createFromFlowCode);
            this.createFromFlowCode = createFromFlowCode;
            return this;
        }

        /**
         * CreateFromFlowVersion.
         */
        public Builder createFromFlowVersion(String createFromFlowVersion) {
            this.putQueryParameter("CreateFromFlowVersion", createFromFlowVersion);
            this.createFromFlowVersion = createFromFlowVersion;
            return this;
        }

        /**
         * <p>Flow trigger type</p>
         * 
         * <strong>example:</strong>
         * <p>TriggeredByWhatsApp</p>
         */
        public Builder flowTriggerType(String flowTriggerType) {
            this.putQueryParameter("FlowTriggerType", flowTriggerType);
            this.flowTriggerType = flowTriggerType;
            return this;
        }

        /**
         * LifeCycleExtendData.
         */
        public Builder lifeCycleExtendData(java.util.Map<String, String> lifeCycleExtendData) {
            String lifeCycleExtendDataShrink = shrink(lifeCycleExtendData, "LifeCycleExtendData", "json");
            this.putQueryParameter("LifeCycleExtendData", lifeCycleExtendDataShrink);
            this.lifeCycleExtendData = lifeCycleExtendData;
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
         * <p>Flow remarks</p>
         * 
         * <strong>example:</strong>
         * <p>ChatFlow for WhatsApp Customer Service Auto-Reply.</p>
         */
        public Builder remark(String remark) {
            this.putQueryParameter("Remark", remark);
            this.remark = remark;
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
         * <p>Flow title</p>
         * 
         * <strong>example:</strong>
         * <p>Auto Reply</p>
         */
        public Builder title(String title) {
            this.putQueryParameter("Title", title);
            this.title = title;
            return this;
        }

        @Override
        public CreateChatFlowRequest build() {
            return new CreateChatFlowRequest(this);
        } 

    } 

}
