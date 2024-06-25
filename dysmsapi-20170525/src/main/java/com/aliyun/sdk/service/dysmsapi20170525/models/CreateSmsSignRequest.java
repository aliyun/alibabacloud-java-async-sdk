// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dysmsapi20170525.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateSmsSignRequest} extends {@link RequestModel}
 *
 * <p>CreateSmsSignRequest</p>
 */
public class CreateSmsSignRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ApplySceneContent")
    private String applySceneContent;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MoreData")
    private java.util.List < String > moreData;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("QualificationId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long qualificationId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Remark")
    @com.aliyun.core.annotation.Validation(maxLength = 500)
    private String remark;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SignName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String signName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SignSource")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer signSource;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SignType")
    private Integer signType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ThirdParty")
    private Boolean thirdParty;

    private CreateSmsSignRequest(Builder builder) {
        super(builder);
        this.applySceneContent = builder.applySceneContent;
        this.moreData = builder.moreData;
        this.ownerId = builder.ownerId;
        this.qualificationId = builder.qualificationId;
        this.remark = builder.remark;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.signName = builder.signName;
        this.signSource = builder.signSource;
        this.signType = builder.signType;
        this.thirdParty = builder.thirdParty;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateSmsSignRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return applySceneContent
     */
    public String getApplySceneContent() {
        return this.applySceneContent;
    }

    /**
     * @return moreData
     */
    public java.util.List < String > getMoreData() {
        return this.moreData;
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
     * @return signName
     */
    public String getSignName() {
        return this.signName;
    }

    /**
     * @return signSource
     */
    public Integer getSignSource() {
        return this.signSource;
    }

    /**
     * @return signType
     */
    public Integer getSignType() {
        return this.signType;
    }

    /**
     * @return thirdParty
     */
    public Boolean getThirdParty() {
        return this.thirdParty;
    }

    public static final class Builder extends Request.Builder<CreateSmsSignRequest, Builder> {
        private String applySceneContent; 
        private java.util.List < String > moreData; 
        private Long ownerId; 
        private Long qualificationId; 
        private String remark; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private String signName; 
        private Integer signSource; 
        private Integer signType; 
        private Boolean thirdParty; 

        private Builder() {
            super();
        } 

        private Builder(CreateSmsSignRequest request) {
            super(request);
            this.applySceneContent = request.applySceneContent;
            this.moreData = request.moreData;
            this.ownerId = request.ownerId;
            this.qualificationId = request.qualificationId;
            this.remark = request.remark;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
            this.signName = request.signName;
            this.signSource = request.signSource;
            this.signType = request.signType;
            this.thirdParty = request.thirdParty;
        } 

        /**
         * ApplySceneContent.
         */
        public Builder applySceneContent(String applySceneContent) {
            this.putQueryParameter("ApplySceneContent", applySceneContent);
            this.applySceneContent = applySceneContent;
            return this;
        }

        /**
         * MoreData.
         */
        public Builder moreData(java.util.List < String > moreData) {
            String moreDataShrink = shrink(moreData, "MoreData", "json");
            this.putQueryParameter("MoreData", moreDataShrink);
            this.moreData = moreData;
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
         * Remark.
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
        public Builder signSource(Integer signSource) {
            this.putQueryParameter("SignSource", signSource);
            this.signSource = signSource;
            return this;
        }

        /**
         * SignType.
         */
        public Builder signType(Integer signType) {
            this.putQueryParameter("SignType", signType);
            this.signType = signType;
            return this;
        }

        /**
         * ThirdParty.
         */
        public Builder thirdParty(Boolean thirdParty) {
            this.putQueryParameter("ThirdParty", thirdParty);
            this.thirdParty = thirdParty;
            return this;
        }

        @Override
        public CreateSmsSignRequest build() {
            return new CreateSmsSignRequest(this);
        } 

    } 

}
