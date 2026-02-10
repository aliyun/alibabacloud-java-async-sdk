// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dysmsapi20170525.models;

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
 * {@link CreateDigitalSignOrderRequest} extends {@link RequestModel}
 *
 * <p>CreateDigitalSignOrderRequest</p>
 */
public class CreateDigitalSignOrderRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ExtendMessage")
    private String extendMessage;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OrderContext")
    private java.util.Map<String, ?> orderContext;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OrderType")
    private String orderType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("QualificationId")
    private Long qualificationId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("QualificationVersion")
    private Long qualificationVersion;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SignId")
    private Long signId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SignIndustry")
    private Long signIndustry;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SignName")
    private String signName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SignSource")
    private Long signSource;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Submitter")
    private String submitter;

    private CreateDigitalSignOrderRequest(Builder builder) {
        super(builder);
        this.extendMessage = builder.extendMessage;
        this.orderContext = builder.orderContext;
        this.orderType = builder.orderType;
        this.ownerId = builder.ownerId;
        this.qualificationId = builder.qualificationId;
        this.qualificationVersion = builder.qualificationVersion;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.signId = builder.signId;
        this.signIndustry = builder.signIndustry;
        this.signName = builder.signName;
        this.signSource = builder.signSource;
        this.submitter = builder.submitter;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateDigitalSignOrderRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return extendMessage
     */
    public String getExtendMessage() {
        return this.extendMessage;
    }

    /**
     * @return orderContext
     */
    public java.util.Map<String, ?> getOrderContext() {
        return this.orderContext;
    }

    /**
     * @return orderType
     */
    public String getOrderType() {
        return this.orderType;
    }

    /**
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
    }

    /**
     * @return qualificationId
     */
    public Long getQualificationId() {
        return this.qualificationId;
    }

    /**
     * @return qualificationVersion
     */
    public Long getQualificationVersion() {
        return this.qualificationVersion;
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
     * @return signId
     */
    public Long getSignId() {
        return this.signId;
    }

    /**
     * @return signIndustry
     */
    public Long getSignIndustry() {
        return this.signIndustry;
    }

    /**
     * @return signName
     */
    public String getSignName() {
        return this.signName;
    }

    /**
     * @return signSource
     */
    public Long getSignSource() {
        return this.signSource;
    }

    /**
     * @return submitter
     */
    public String getSubmitter() {
        return this.submitter;
    }

    public static final class Builder extends Request.Builder<CreateDigitalSignOrderRequest, Builder> {
        private String extendMessage; 
        private java.util.Map<String, ?> orderContext; 
        private String orderType; 
        private Long ownerId; 
        private Long qualificationId; 
        private Long qualificationVersion; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private Long signId; 
        private Long signIndustry; 
        private String signName; 
        private Long signSource; 
        private String submitter; 

        private Builder() {
            super();
        } 

        private Builder(CreateDigitalSignOrderRequest request) {
            super(request);
            this.extendMessage = request.extendMessage;
            this.orderContext = request.orderContext;
            this.orderType = request.orderType;
            this.ownerId = request.ownerId;
            this.qualificationId = request.qualificationId;
            this.qualificationVersion = request.qualificationVersion;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
            this.signId = request.signId;
            this.signIndustry = request.signIndustry;
            this.signName = request.signName;
            this.signSource = request.signSource;
            this.submitter = request.submitter;
        } 

        /**
         * ExtendMessage.
         */
        public Builder extendMessage(String extendMessage) {
            this.putQueryParameter("ExtendMessage", extendMessage);
            this.extendMessage = extendMessage;
            return this;
        }

        /**
         * OrderContext.
         */
        public Builder orderContext(java.util.Map<String, ?> orderContext) {
            String orderContextShrink = shrink(orderContext, "OrderContext", "json");
            this.putQueryParameter("OrderContext", orderContextShrink);
            this.orderContext = orderContext;
            return this;
        }

        /**
         * OrderType.
         */
        public Builder orderType(String orderType) {
            this.putQueryParameter("OrderType", orderType);
            this.orderType = orderType;
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
         * QualificationId.
         */
        public Builder qualificationId(Long qualificationId) {
            this.putQueryParameter("QualificationId", qualificationId);
            this.qualificationId = qualificationId;
            return this;
        }

        /**
         * QualificationVersion.
         */
        public Builder qualificationVersion(Long qualificationVersion) {
            this.putQueryParameter("QualificationVersion", qualificationVersion);
            this.qualificationVersion = qualificationVersion;
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
         * SignId.
         */
        public Builder signId(Long signId) {
            this.putQueryParameter("SignId", signId);
            this.signId = signId;
            return this;
        }

        /**
         * SignIndustry.
         */
        public Builder signIndustry(Long signIndustry) {
            this.putQueryParameter("SignIndustry", signIndustry);
            this.signIndustry = signIndustry;
            return this;
        }

        /**
         * SignName.
         */
        public Builder signName(String signName) {
            this.putQueryParameter("SignName", signName);
            this.signName = signName;
            return this;
        }

        /**
         * SignSource.
         */
        public Builder signSource(Long signSource) {
            this.putQueryParameter("SignSource", signSource);
            this.signSource = signSource;
            return this;
        }

        /**
         * Submitter.
         */
        public Builder submitter(String submitter) {
            this.putQueryParameter("Submitter", submitter);
            this.submitter = submitter;
            return this;
        }

        @Override
        public CreateDigitalSignOrderRequest build() {
            return new CreateDigitalSignOrderRequest(this);
        } 

    } 

}
