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
 * {@link UpdateSubs700Request} extends {@link RequestModel}
 *
 * <p>UpdateSubs700Request</p>
 */
public class UpdateSubs700Request extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AsrModelId")
    private String asrModelId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Audio")
    private String audio;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CallRestrict")
    private String callRestrict;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DefaultA")
    private String defaultA;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Expiration")
    private String expiration;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("GroupId")
    private String groupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IndustrialId")
    private String industrialId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NeedAsr")
    private Boolean needAsr;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NeedRecord")
    private Boolean needRecord;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OperateType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String operateType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OrderId")
    private String orderId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OutId")
    private String outId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PoolKey")
    @com.aliyun.core.annotation.Validation(required = true)
    private String poolKey;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SubsId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long subsId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TelA")
    private String telA;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TelB")
    private String telB;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TelX")
    @com.aliyun.core.annotation.Validation(required = true)
    private String telX;

    private UpdateSubs700Request(Builder builder) {
        super(builder);
        this.asrModelId = builder.asrModelId;
        this.audio = builder.audio;
        this.callRestrict = builder.callRestrict;
        this.defaultA = builder.defaultA;
        this.expiration = builder.expiration;
        this.groupId = builder.groupId;
        this.industrialId = builder.industrialId;
        this.needAsr = builder.needAsr;
        this.needRecord = builder.needRecord;
        this.operateType = builder.operateType;
        this.orderId = builder.orderId;
        this.outId = builder.outId;
        this.ownerId = builder.ownerId;
        this.poolKey = builder.poolKey;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.subsId = builder.subsId;
        this.telA = builder.telA;
        this.telB = builder.telB;
        this.telX = builder.telX;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateSubs700Request create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return asrModelId
     */
    public String getAsrModelId() {
        return this.asrModelId;
    }

    /**
     * @return audio
     */
    public String getAudio() {
        return this.audio;
    }

    /**
     * @return callRestrict
     */
    public String getCallRestrict() {
        return this.callRestrict;
    }

    /**
     * @return defaultA
     */
    public String getDefaultA() {
        return this.defaultA;
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
     * @return industrialId
     */
    public String getIndustrialId() {
        return this.industrialId;
    }

    /**
     * @return needAsr
     */
    public Boolean getNeedAsr() {
        return this.needAsr;
    }

    /**
     * @return needRecord
     */
    public Boolean getNeedRecord() {
        return this.needRecord;
    }

    /**
     * @return operateType
     */
    public String getOperateType() {
        return this.operateType;
    }

    /**
     * @return orderId
     */
    public String getOrderId() {
        return this.orderId;
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
     * @return poolKey
     */
    public String getPoolKey() {
        return this.poolKey;
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
     * @return subsId
     */
    public Long getSubsId() {
        return this.subsId;
    }

    /**
     * @return telA
     */
    public String getTelA() {
        return this.telA;
    }

    /**
     * @return telB
     */
    public String getTelB() {
        return this.telB;
    }

    /**
     * @return telX
     */
    public String getTelX() {
        return this.telX;
    }

    public static final class Builder extends Request.Builder<UpdateSubs700Request, Builder> {
        private String asrModelId; 
        private String audio; 
        private String callRestrict; 
        private String defaultA; 
        private String expiration; 
        private String groupId; 
        private String industrialId; 
        private Boolean needAsr; 
        private Boolean needRecord; 
        private String operateType; 
        private String orderId; 
        private String outId; 
        private Long ownerId; 
        private String poolKey; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private Long subsId; 
        private String telA; 
        private String telB; 
        private String telX; 

        private Builder() {
            super();
        } 

        private Builder(UpdateSubs700Request request) {
            super(request);
            this.asrModelId = request.asrModelId;
            this.audio = request.audio;
            this.callRestrict = request.callRestrict;
            this.defaultA = request.defaultA;
            this.expiration = request.expiration;
            this.groupId = request.groupId;
            this.industrialId = request.industrialId;
            this.needAsr = request.needAsr;
            this.needRecord = request.needRecord;
            this.operateType = request.operateType;
            this.orderId = request.orderId;
            this.outId = request.outId;
            this.ownerId = request.ownerId;
            this.poolKey = request.poolKey;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
            this.subsId = request.subsId;
            this.telA = request.telA;
            this.telB = request.telB;
            this.telX = request.telX;
        } 

        /**
         * <p>The ASR model ID. Valid values:</p>
         * <ul>
         * <li>General-telephone-Mandarin Chinese model ID: 7ee372834d2f4cc7ac0d0ab2d0ae1aac.</li>
         * <li>General-telephone-Cantonese model ID: 9b4afe3d224e4fa3bf963697113e2f77.</li>
         * <li>General-telephone-regional accent model ID: 3655a6cb94764145a1f9a38a3c3b3b4b.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>7ee372834d2f4cc7ac0d0ab2d0ae1aac</p>
         */
        public Builder asrModelId(String asrModelId) {
            this.putQueryParameter("AsrModelId", asrModelId);
            this.asrModelId = asrModelId;
            return this;
        }

        /**
         * <p>Optional. The audio playback code.</p>
         * <ul>
         * <li>AXB mode:
         * ACallX_Apre: The audio playback code for the voice prompt played to Number A before the call is connected when Number A calls Number X.
         * ACallX_Ain: The audio playback code for the voice prompt played to Number A after the call is connected when Number A calls Number X.
         * ACallX_Bin: The audio playback code for the voice prompt played to Number B after the call is connected when Number A calls Number X.
         * BCallX_Bpre: The audio playback code for the voice prompt played to Number B before the call is connected when Number B calls Number X.
         * BCallX_Ain: The audio playback code for the voice prompt played to Number A after the call is connected when Number B calls Number X.
         * BCallX_Bin: The audio playback code for the voice prompt played to Number B after the call is connected when Number B calls Number X.</li>
         * <li>GXB mode:
         * GCallX_Gpre: The audio playback code for the voice prompt played to the caller before the call is connected when a number in Group G calls Number X.
         * GCallX_Gin: The audio playback code for the voice prompt played to the caller after the call is connected when a number in Group G calls Number X.
         * GCallX_Bin: The audio playback code for the voice prompt played to Number B after the call is connected when a number in Group G calls Number X.
         * BCallX_Bpre: The audio playback code for the voice prompt played to Number B before the call is connected when Number B calls Number X.
         * BCallX_Gin: The audio playback code for the voice prompt played to the callee after the call is connected when Number B calls Number X.
         * BCallX_Bin: The audio playback code for the voice prompt played to Number B after the call is connected when Number B calls Number X.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>{
         * &quot;ACallX_Apre&quot;:&quot;185&quot;
         * }</p>
         */
        public Builder audio(String audio) {
            this.putQueryParameter("Audio", audio);
            this.audio = audio;
            return this;
        }

        /**
         * <p>The new single-call restriction logic.</p>
         * 
         * <strong>example:</strong>
         * <p>CONTROL_AX_DISABLE</p>
         */
        public Builder callRestrict(String callRestrict) {
            this.putQueryParameter("CallRestrict", callRestrict);
            this.callRestrict = callRestrict;
            return this;
        }

        /**
         * <p>The default Number A for the GXB private number. Note: The callback mode can be set at the number pool level. When the callback mode is set to the default mode, this field takes effect. When Number B calls Number X, the call is forwarded to this Number A by default. If Number A is not set, the call cannot be connected. To update Number A, call the number binding modification API.</p>
         * 
         * <strong>example:</strong>
         * <p>138****0000</p>
         */
        public Builder defaultA(String defaultA) {
            this.putQueryParameter("DefaultA", defaultA);
            this.defaultA = defaultA;
            return this;
        }

        /**
         * <p>The new expiration time of the binding relationship.</p>
         * 
         * <strong>example:</strong>
         * <p>2021-09-05 12:00:00</p>
         */
        public Builder expiration(String expiration) {
            this.putQueryParameter("Expiration", expiration);
            this.expiration = expiration;
            return this;
        }

        /**
         * <p>The new group ID in the binding relationship.</p>
         * 
         * <strong>example:</strong>
         * <p>Sample value</p>
         */
        public Builder groupId(String groupId) {
            this.putQueryParameter("GroupId", groupId);
            this.groupId = groupId;
            return this;
        }

        /**
         * <p>Optional. The Industrial Internet identification code, which has a one-to-one mapping with the OrderId. The code supports characters such as periods (.) and forward slashes (/) to separate code domains. The code must not contain non-printable characters, such as spaces and line breaks. This field is required when the business user generates the Industrial Internet identification code.</p>
         * 
         * <strong>example:</strong>
         * <p>700.100.1/12345678</p>
         */
        public Builder industrialId(String industrialId) {
            this.putQueryParameter("IndustrialId", industrialId);
            this.industrialId = industrialId;
            return this;
        }

        /**
         * <p>Specifies whether to enable the ASR feature. Valid values:</p>
         * <ul>
         * <li>false: Disables the feature. This is the default value.</li>
         * <li>true: Enables the feature.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder needAsr(Boolean needAsr) {
            this.putQueryParameter("NeedAsr", needAsr);
            this.needAsr = needAsr;
            return this;
        }

        /**
         * <p>The new media selection in the binding relationship.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder needRecord(Boolean needRecord) {
            this.putQueryParameter("NeedRecord", needRecord);
            this.needRecord = needRecord;
            return this;
        }

        /**
         * <p>The operation type. Valid values:</p>
         * <ul>
         * <li>updateNoA: Updates Number A.</li>
         * <li>updateNoB: Updates Number B.</li>
         * <li>updateExpire: Updates the validity period of the binding relationship.</li>
         * <li>updateGroup: Updates the Number G group.</li>
         * <li>updateNoDefaultA: Updates the default callback Number A in GXB mode.</li>
         * <li>updateCallRestrict: Sets the single-call restriction.</li>
         * <li>updateOutId: Updates the OutId field.</li>
         * <li>updateIsRecordingEnabled: Updates the recording status in the binding.</li>
         * <li>updateAsr: Updates the ASR status in the binding.</li>
         * <li>updateAudio: Updates the ringtone configuration in the binding.</li>
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
         * <p>The order ID. This parameter is required in practice. Encrypt the order ID for reporting to the regulatory platform.</p>
         * 
         * <strong>example:</strong>
         * <p>12345678</p>
         */
        public Builder orderId(String orderId) {
            this.putQueryParameter("OrderId", orderId);
            this.orderId = orderId;
            return this;
        }

        /**
         * <p>The external business extension field. This parameter is returned in the call record receipt message.</p>
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
         * <p>The key of the number pool.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>FC10000016848****</p>
         */
        public Builder poolKey(String poolKey) {
            this.putQueryParameter("PoolKey", poolKey);
            this.poolKey = poolKey;
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
         * <p>The ID of the binding relationship, which uniquely identifies the number binding relationship.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>10000*****</p>
         */
        public Builder subsId(Long subsId) {
            this.putQueryParameter("SubsId", subsId);
            this.subsId = subsId;
            return this;
        }

        /**
         * <p>The new Number A in the binding relationship.</p>
         * 
         * <strong>example:</strong>
         * <p>138****0000</p>
         */
        public Builder telA(String telA) {
            this.putQueryParameter("TelA", telA);
            this.telA = telA;
            return this;
        }

        /**
         * <p>The new Number B in the binding relationship.</p>
         * 
         * <strong>example:</strong>
         * <p>136****0000</p>
         */
        public Builder telB(String telB) {
            this.putQueryParameter("TelB", telB);
            this.telB = telB;
            return this;
        }

        /**
         * <p>The intermediate Number X. If the business user does not specify Number X, the application platform assigns a number from the number pool as Number X.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>700********0000</p>
         */
        public Builder telX(String telX) {
            this.putQueryParameter("TelX", telX);
            this.telX = telX;
            return this;
        }

        @Override
        public UpdateSubs700Request build() {
            return new UpdateSubs700Request(this);
        } 

    } 

}
