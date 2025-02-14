// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dyplsapi20170525.models;

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
         * <p>The ID of the ASR model.</p>
         * 
         * <strong>example:</strong>
         * <p>980abddb908f48e8b987cb2cd303****</p>
         */
        public Builder ASRModelId(String ASRModelId) {
            this.putQueryParameter("ASRModelId", ASRModelId);
            this.ASRModelId = ASRModelId;
            return this;
        }

        /**
         * <p>Specifies whether to enable automatic speech recognition (ASR). Valid values:</p>
         * <ul>
         * <li><strong>false</strong> (default): disables ASR.</li>
         * <li><strong>true</strong>: enables ASR.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder ASRStatus(Boolean ASRStatus) {
            this.putQueryParameter("ASRStatus", ASRStatus);
            this.ASRStatus = ASRStatus;
            return this;
        }

        /**
         * <p>Re-sets the phone number display logic in the phone number binding. Fixed value: <strong>1</strong>, indicating that phone number X is displayed on both the calling phone and the called phone.</p>
         * <blockquote>
         * <p> Due to the regulatory restrictions imposed by carriers, the setting to display real phone numbers during calls does not take effect.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder callDisplayType(Integer callDisplayType) {
            this.putQueryParameter("CallDisplayType", callDisplayType);
            this.callDisplayType = callDisplayType;
            return this;
        }

        /**
         * <p>One-way call restrictions. Valid values:</p>
         * <ul>
         * <li><strong>CONTROL_AX_DISABLE</strong>: Phone number A cannot be used to call phone number X.</li>
         * <li><strong>CONTROL_BX_DISABLE</strong>: Phone number B cannot be used to call phone number X.</li>
         * <li><strong>CONTROL_CLEAR_DISABLE</strong>: The call restrictions are cleared.</li>
         * </ul>
         * <blockquote>
         * <p> This parameter is required when <strong>OperateType</strong> is set to <strong>updateCallRestrict</strong>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>CONTROL_BX_DISABLE</p>
         */
        public Builder callRestrict(String callRestrict) {
            this.putQueryParameter("CallRestrict", callRestrict);
            this.callRestrict = callRestrict;
            return this;
        }

        /**
         * <p>Re-sets the expiration time of the phone number binding.</p>
         * <blockquote>
         * </blockquote>
         * <ul>
         * <li><p>This parameter is required when <strong>OperateType</strong> is set to <strong>updateExpire</strong>.</p>
         * </li>
         * <li><p>The expiration time must be more than 1 minute later than the time when you call this API operation.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>2019-09-05 12:00:00</p>
         */
        public Builder expiration(String expiration) {
            this.putQueryParameter("Expiration", expiration);
            this.expiration = expiration;
            return this;
        }

        /**
         * <p>The ID of number group G in the phone number binding.</p>
         * <blockquote>
         * <p> This parameter is required when <strong>OperateType</strong> is set to <strong>updateAxgGroup</strong>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>1234</p>
         */
        public Builder groupId(String groupId) {
            this.putQueryParameter("GroupId", groupId);
            this.groupId = groupId;
            return this;
        }

        /**
         * <p>Re-sets the recording status in the phone number binding.</p>
         * <blockquote>
         * <p> This parameter does not have a default value. If you do not specify this parameter, the value of the corresponding field is not updated.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder isRecordingEnabled(Boolean isRecordingEnabled) {
            this.putQueryParameter("IsRecordingEnabled", isRecordingEnabled);
            this.isRecordingEnabled = isRecordingEnabled;
            return this;
        }

        /**
         * <p>The operation to modify the phone number binding. Valid values:</p>
         * <ul>
         * <li><strong>updateNoA</strong>: modifies phone number A.</li>
         * <li><strong>updateNoB</strong>: modifies phone number B.</li>
         * <li><strong>updateExpire</strong>: modifies the validity period of the binding.</li>
         * <li><strong>updateAxgGroup</strong>: modifies number group G.</li>
         * <li><strong>updateCallRestrict</strong>: modifies one-way call restrictions.</li>
         * <li><strong>updateCallDisplayType</strong>: updates the number display logic for calls.</li>
         * <li><strong>updateOutId</strong>: updates the value of the OutId parameter.</li>
         * <li><strong>updateIsRecordingEnabled</strong>: updates the status of the recording feature in the binding.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>updateNoA</p>
         */
        public Builder operateType(String operateType) {
            this.putQueryParameter("OperateType", operateType);
            this.operateType = operateType;
            return this;
        }

        /**
         * <p>Re-sets the value of the OutId parameter in the phone number binding.</p>
         * 
         * <strong>example:</strong>
         * <p>abcdef</p>
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
         * <p>Phone number A in the phone number binding.</p>
         * <blockquote>
         * <p> This parameter is required when <strong>OperateType</strong> is set to <strong>updateNoA</strong>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>1390000****</p>
         */
        public Builder phoneNoA(String phoneNoA) {
            this.putQueryParameter("PhoneNoA", phoneNoA);
            this.phoneNoA = phoneNoA;
            return this;
        }

        /**
         * <p>Phone number B in the phone number binding.</p>
         * <blockquote>
         * <p> This parameter is required when <strong>OperateType</strong> is set to <strong>updateNoB</strong>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>1390000****</p>
         */
        public Builder phoneNoB(String phoneNoB) {
            this.putQueryParameter("PhoneNoB", phoneNoB);
            this.phoneNoB = phoneNoB;
            return this;
        }

        /**
         * <p>Phone number X in the phone number binding.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1390000****</p>
         */
        public Builder phoneNoX(String phoneNoX) {
            this.putQueryParameter("PhoneNoX", phoneNoX);
            this.phoneNoX = phoneNoX;
            return this;
        }

        /**
         * <p>The key of the phone number pool.</p>
         * <p>Log on to the <a href="https://dypls.console.aliyun.com/dypls.htm#/account">Phone Number Protection console</a> and view the key of the phone number pool on the <strong>Number Pool Management</strong> page.</p>
         * <blockquote>
         * <p> This parameter is required when <strong>ProductType</strong> is left empty.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>FC122356****</p>
         */
        public Builder poolKey(String poolKey) {
            this.putQueryParameter("PoolKey", poolKey);
            this.poolKey = poolKey;
            return this;
        }

        /**
         * <p>The product type. Valid values:</p>
         * <ul>
         * <li><strong>AXB_170</strong></li>
         * <li><strong>AXN_170</strong></li>
         * <li><strong>AXN_95</strong></li>
         * <li><strong>AXN_EXTENSION_REUSE</strong></li>
         * </ul>
         * <blockquote>
         * </blockquote>
         * <ul>
         * <li><p>This parameter is applicable to the original key accounts of Alibaba Cloud. This parameter can be ignored for Alibaba Cloud users.</p>
         * </li>
         * <li><p>This parameter is required when <strong>PoolKey</strong> is left empty.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>AXB_170</p>
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
         * <p>Updates the ringtone code for enterprise Color Ring Back Tone (CRBT) in the phone number binding.</p>
         * <p>AXB product:</p>
         * <ul>
         * <li>Ringtone setting when phone number A is used to call phone number X in the AXB binding: AXBRing_A</li>
         * <li>Ringtone setting when phone number B is used to call phone number X in the AXB binding: AXBRing_B</li>
         * </ul>
         * <p>AXN product:</p>
         * <ul>
         * <li>Ringtone setting (with a callback number) when phone number A is used to call phone number X in the AXN extension binding: AXNRing_AB</li>
         * <li>Ringtone setting (without a callback number) when phone number A is used to call phone number X in the AXN extension binding: AXNRing_A</li>
         * <li>Ringtone setting when phone number N is used to call phone number X in the AXN extension binding: AXNRing_N</li>
         * </ul>
         * <p>AXG product:</p>
         * <ul>
         * <li>Ringtone setting (with a callback number) when phone number A is used to call phone number X in the AXG binding: AXGRing_AB</li>
         * <li>Ringtone setting (without a callback number) when phone number A is used to call phone number X in the AXG binding: AXGRing_A</li>
         * <li>Ringtone setting when a phone number in number group G is used to call phone number X in the AXG binding: AXGRing_G</li>
         * </ul>
         * <p>Enterprise CRBT codes: Enterprise CRBT codes can be queried in the <a href="https://dypls.console.aliyun.com/dypls.htm#/account">Phone Number Protection console</a>. You can choose <strong>Number Pool Management</strong> &gt; <strong>Enterprise CRBT Management</strong> to view and manage enterprise CRBT codes. You can also upload, delete, or perform other operations on enterprise CRBT codes.</p>
         * <blockquote>
         * <p> The bound enterprise CRBTs are preferentially used. If no enterprise CRBT is set or the setting does not take effect, the enterprise CRBTs at the phone number pool level are used.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>{&quot;AXBRing_B&quot;:&quot;100000001&quot;,&quot;AXBRing_A&quot;:&quot;100000001&quot;}</p>
         */
        public Builder ringConfig(String ringConfig) {
            this.putQueryParameter("RingConfig", ringConfig);
            this.ringConfig = ringConfig;
            return this;
        }

        /**
         * <p>The binding ID.</p>
         * <p>Log on to the <a href="https://dypls.console.aliyun.com/dypls.htm#/account">Phone Number Protection console</a>, choose <strong>Number and Number Pool</strong> &gt; <strong>Number Management</strong>. On the Number Management page, select the desired record and click Details to view the binding ID. Alternatively, you can view the value of the <strong>SubsId</strong> parameter returned by an API operation for a phone number binding such as BindAxb. The value of this parameter indicates a binding ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>100000076879****</p>
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
