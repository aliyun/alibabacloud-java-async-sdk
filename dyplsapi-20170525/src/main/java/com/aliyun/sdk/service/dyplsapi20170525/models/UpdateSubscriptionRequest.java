// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dyplsapi20170525.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateSubscriptionRequest} extends {@link RequestModel}
 *
 * <p>UpdateSubscriptionRequest</p>
 */
public class UpdateSubscriptionRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ASRModelId")
    private String ASRModelId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ASRStatus")
    private Boolean ASRStatus;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CallDisplayType")
    private Integer callDisplayType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CallRestrict")
    private String callRestrict;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Expiration")
    private String expiration;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("GroupId")
    private String groupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IsRecordingEnabled")
    private Boolean isRecordingEnabled;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OperateType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String operateType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OutId")
    private String outId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PhoneNoA")
    private String phoneNoA;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PhoneNoB")
    private String phoneNoB;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PhoneNoX")
    @com.aliyun.core.annotation.Validation(required = true)
    private String phoneNoX;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PoolKey")
    private String poolKey;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ProductType")
    private String productType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RingConfig")
    private String ringConfig;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SubsId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String subsId;

    private UpdateSubscriptionRequest(Builder builder) {
        super(builder);
        this.ASRModelId = builder.ASRModelId;
        this.ASRStatus = builder.ASRStatus;
        this.callDisplayType = builder.callDisplayType;
        this.callRestrict = builder.callRestrict;
        this.expiration = builder.expiration;
        this.groupId = builder.groupId;
        this.isRecordingEnabled = builder.isRecordingEnabled;
        this.operateType = builder.operateType;
        this.outId = builder.outId;
        this.ownerId = builder.ownerId;
        this.phoneNoA = builder.phoneNoA;
        this.phoneNoB = builder.phoneNoB;
        this.phoneNoX = builder.phoneNoX;
        this.poolKey = builder.poolKey;
        this.productType = builder.productType;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.ringConfig = builder.ringConfig;
        this.subsId = builder.subsId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateSubscriptionRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return ASRModelId
     */
    public String getASRModelId() {
        return this.ASRModelId;
    }

    /**
     * @return ASRStatus
     */
    public Boolean getASRStatus() {
        return this.ASRStatus;
    }

    /**
     * @return callDisplayType
     */
    public Integer getCallDisplayType() {
        return this.callDisplayType;
    }

    /**
     * @return callRestrict
     */
    public String getCallRestrict() {
        return this.callRestrict;
    }

    /**
     * @return expiration
     */
    public String getExpiration() {
        return this.expiration;
    }

    /**
     * @return groupId
     */
    public String getGroupId() {
        return this.groupId;
    }

    /**
     * @return isRecordingEnabled
     */
    public Boolean getIsRecordingEnabled() {
        return this.isRecordingEnabled;
    }

    /**
     * @return operateType
     */
    public String getOperateType() {
        return this.operateType;
    }

    /**
     * @return outId
     */
    public String getOutId() {
        return this.outId;
    }

    /**
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
    }

    /**
     * @return phoneNoA
     */
    public String getPhoneNoA() {
        return this.phoneNoA;
    }

    /**
     * @return phoneNoB
     */
    public String getPhoneNoB() {
        return this.phoneNoB;
    }

    /**
     * @return phoneNoX
     */
    public String getPhoneNoX() {
        return this.phoneNoX;
    }

    /**
     * @return poolKey
     */
    public String getPoolKey() {
        return this.poolKey;
    }

    /**
     * @return productType
     */
    public String getProductType() {
        return this.productType;
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
     * @return ringConfig
     */
    public String getRingConfig() {
        return this.ringConfig;
    }

    /**
     * @return subsId
     */
    public String getSubsId() {
        return this.subsId;
    }

    public static final class Builder extends Request.Builder<UpdateSubscriptionRequest, Builder> {
        private String ASRModelId; 
        private Boolean ASRStatus; 
        private Integer callDisplayType; 
        private String callRestrict; 
        private String expiration; 
        private String groupId; 
        private Boolean isRecordingEnabled; 
        private String operateType; 
        private String outId; 
        private Long ownerId; 
        private String phoneNoA; 
        private String phoneNoB; 
        private String phoneNoX; 
        private String poolKey; 
        private String productType; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private String ringConfig; 
        private String subsId; 

        private Builder() {
            super();
        } 

        private Builder(UpdateSubscriptionRequest request) {
            super(request);
            this.ASRModelId = request.ASRModelId;
            this.ASRStatus = request.ASRStatus;
            this.callDisplayType = request.callDisplayType;
            this.callRestrict = request.callRestrict;
            this.expiration = request.expiration;
            this.groupId = request.groupId;
            this.isRecordingEnabled = request.isRecordingEnabled;
            this.operateType = request.operateType;
            this.outId = request.outId;
            this.ownerId = request.ownerId;
            this.phoneNoA = request.phoneNoA;
            this.phoneNoB = request.phoneNoB;
            this.phoneNoX = request.phoneNoX;
            this.poolKey = request.poolKey;
            this.productType = request.productType;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
            this.ringConfig = request.ringConfig;
            this.subsId = request.subsId;
        } 

        /**
         * The ID of the ASR model.
         */
        public Builder ASRModelId(String ASRModelId) {
            this.putQueryParameter("ASRModelId", ASRModelId);
            this.ASRModelId = ASRModelId;
            return this;
        }

        /**
         * Specifies whether to enable automatic speech recognition (ASR). Valid values:
         * <p>
         * 
         * *   **false** (default): disables ASR.
         * *   **true**: enables ASR.
         */
        public Builder ASRStatus(Boolean ASRStatus) {
            this.putQueryParameter("ASRStatus", ASRStatus);
            this.ASRStatus = ASRStatus;
            return this;
        }

        /**
         * Re-sets the phone number display logic in the phone number binding. Fixed value: **1**, indicating that phone number X is displayed on both the calling phone and the called phone.
         * <p>
         * 
         * >  Due to the regulatory restrictions imposed by carriers, the setting to display real phone numbers during calls does not take effect.
         */
        public Builder callDisplayType(Integer callDisplayType) {
            this.putQueryParameter("CallDisplayType", callDisplayType);
            this.callDisplayType = callDisplayType;
            return this;
        }

        /**
         * One-way call restrictions. Valid values:
         * <p>
         * 
         * *   **CONTROL_AX_DISABLE**: Phone number A cannot be used to call phone number X.
         * *   **CONTROL_BX_DISABLE**: Phone number B cannot be used to call phone number X.
         * *   **CONTROL_CLEAR_DISABLE**: The call restrictions are cleared.
         * 
         * >  This parameter is required when **OperateType** is set to **updateCallRestrict**.
         */
        public Builder callRestrict(String callRestrict) {
            this.putQueryParameter("CallRestrict", callRestrict);
            this.callRestrict = callRestrict;
            return this;
        }

        /**
         * Re-sets the expiration time of the phone number binding.
         * <p>
         * 
         * > 
         * 
         * *   This parameter is required when **OperateType** is set to **updateExpire**.
         * 
         * *   The expiration time must be more than 1 minute later than the time when you call this API operation.
         */
        public Builder expiration(String expiration) {
            this.putQueryParameter("Expiration", expiration);
            this.expiration = expiration;
            return this;
        }

        /**
         * The ID of number group G in the phone number binding.
         * <p>
         * 
         * >  This parameter is required when **OperateType** is set to **updateAxgGroup**.
         */
        public Builder groupId(String groupId) {
            this.putQueryParameter("GroupId", groupId);
            this.groupId = groupId;
            return this;
        }

        /**
         * Re-sets the recording status in the phone number binding.
         * <p>
         * 
         * >  This parameter does not have a default value. If you do not specify this parameter, the value of the corresponding field is not updated.
         */
        public Builder isRecordingEnabled(Boolean isRecordingEnabled) {
            this.putQueryParameter("IsRecordingEnabled", isRecordingEnabled);
            this.isRecordingEnabled = isRecordingEnabled;
            return this;
        }

        /**
         * The operation to modify the phone number binding. Valid values:
         * <p>
         * 
         * *   **updateNoA**: modifies phone number A.
         * *   **updateNoB**: modifies phone number B.
         * *   **updateExpire**: modifies the validity period of the binding.
         * *   **updateAxgGroup**: modifies number group G.
         * *   **updateCallRestrict**: modifies one-way call restrictions.
         * *   **updateCallDisplayType**: updates the number display logic for calls.
         * *   **updateOutId**: updates the value of the OutId parameter.
         * *   **updateIsRecordingEnabled**: updates the status of the recording feature in the binding.
         */
        public Builder operateType(String operateType) {
            this.putQueryParameter("OperateType", operateType);
            this.operateType = operateType;
            return this;
        }

        /**
         * Re-sets the value of the OutId parameter in the phone number binding.
         */
        public Builder outId(String outId) {
            this.putQueryParameter("OutId", outId);
            this.outId = outId;
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
         * Phone number A in the phone number binding.
         * <p>
         * 
         * >  This parameter is required when **OperateType** is set to **updateNoA**.
         */
        public Builder phoneNoA(String phoneNoA) {
            this.putQueryParameter("PhoneNoA", phoneNoA);
            this.phoneNoA = phoneNoA;
            return this;
        }

        /**
         * Phone number B in the phone number binding.
         * <p>
         * 
         * >  This parameter is required when **OperateType** is set to **updateNoB**.
         */
        public Builder phoneNoB(String phoneNoB) {
            this.putQueryParameter("PhoneNoB", phoneNoB);
            this.phoneNoB = phoneNoB;
            return this;
        }

        /**
         * Phone number X in the phone number binding.
         */
        public Builder phoneNoX(String phoneNoX) {
            this.putQueryParameter("PhoneNoX", phoneNoX);
            this.phoneNoX = phoneNoX;
            return this;
        }

        /**
         * The key of the phone number pool.
         * <p>
         * 
         * Log on to the [Phone Number Protection console](https://dypls.console.aliyun.com/dypls.htm#/account) and view the key of the phone number pool on the **Number Pool Management** page.
         * 
         * >  This parameter is required when **ProductType** is left empty.
         */
        public Builder poolKey(String poolKey) {
            this.putQueryParameter("PoolKey", poolKey);
            this.poolKey = poolKey;
            return this;
        }

        /**
         * The product type. Valid values:
         * <p>
         * 
         * *   **AXB\_170**
         * *   **AXN\_170**
         * *   **AXN\_95**
         * *   **AXN_EXTENSION_REUSE**
         * 
         * > 
         * 
         * *   This parameter is applicable to the original key accounts of Alibaba Cloud. This parameter can be ignored for Alibaba Cloud users.
         * 
         * *   This parameter is required when **PoolKey** is left empty.
         */
        public Builder productType(String productType) {
            this.putQueryParameter("ProductType", productType);
            this.productType = productType;
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
         * Updates the ringtone code for enterprise Color Ring Back Tone (CRBT) in the phone number binding.
         * <p>
         * 
         * AXB product:
         * 
         * *   Ringtone setting when phone number A is used to call phone number X in the AXB binding: AXBRing_A
         * *   Ringtone setting when phone number B is used to call phone number X in the AXB binding: AXBRing_B
         * 
         * AXN product:
         * 
         * *   Ringtone setting (with a callback number) when phone number A is used to call phone number X in the AXN extension binding: AXNRing_AB
         * *   Ringtone setting (without a callback number) when phone number A is used to call phone number X in the AXN extension binding: AXNRing_A
         * *   Ringtone setting when phone number N is used to call phone number X in the AXN extension binding: AXNRing_N
         * 
         * AXG product:
         * 
         * *   Ringtone setting (with a callback number) when phone number A is used to call phone number X in the AXG binding: AXGRing_AB
         * *   Ringtone setting (without a callback number) when phone number A is used to call phone number X in the AXG binding: AXGRing_A
         * *   Ringtone setting when a phone number in number group G is used to call phone number X in the AXG binding: AXGRing_G
         * 
         * Enterprise CRBT codes: Enterprise CRBT codes can be queried in the [Phone Number Protection console](https://dypls.console.aliyun.com/dypls.htm#/account). You can choose **Number Pool Management** > **Enterprise CRBT Management** to view and manage enterprise CRBT codes. You can also upload, delete, or perform other operations on enterprise CRBT codes.
         * 
         * >  The bound enterprise CRBTs are preferentially used. If no enterprise CRBT is set or the setting does not take effect, the enterprise CRBTs at the phone number pool level are used.
         */
        public Builder ringConfig(String ringConfig) {
            this.putQueryParameter("RingConfig", ringConfig);
            this.ringConfig = ringConfig;
            return this;
        }

        /**
         * The binding ID.
         * <p>
         * 
         * Log on to the [Phone Number Protection console](https://dypls.console.aliyun.com/dypls.htm#/account), choose **Number and Number Pool** > **Number Management**. On the Number Management page, select the desired record and click Details to view the binding ID. Alternatively, you can view the value of the **SubsId** parameter returned by an API operation for a phone number binding such as BindAxb. The value of this parameter indicates a binding ID.
         */
        public Builder subsId(String subsId) {
            this.putQueryParameter("SubsId", subsId);
            this.subsId = subsId;
            return this;
        }

        @Override
        public UpdateSubscriptionRequest build() {
            return new UpdateSubscriptionRequest(this);
        } 

    } 

}
