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
 * {@link BindAxb700Request} extends {@link RequestModel}
 *
 * <p>BindAxb700Request</p>
 */
public class BindAxb700Request extends Request {
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
    @com.aliyun.core.annotation.NameInMap("CallTimeout")
    private Long callTimeout;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DtmfConfig")
    private String dtmfConfig;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Expiration")
    @com.aliyun.core.annotation.Validation(required = true)
    private String expiration;

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
    @com.aliyun.core.annotation.NameInMap("OrderId")
    private String orderId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OutId")
    private String outId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OutOrderId")
    private String outOrderId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PoolKey")
    @com.aliyun.core.annotation.Validation(required = true)
    private String poolKey;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RecType")
    private String recType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TelA")
    @com.aliyun.core.annotation.Validation(required = true)
    private String telA;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TelB")
    @com.aliyun.core.annotation.Validation(required = true)
    private String telB;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TelX")
    private String telX;

    private BindAxb700Request(Builder builder) {
        super(builder);
        this.asrModelId = builder.asrModelId;
        this.audio = builder.audio;
        this.callRestrict = builder.callRestrict;
        this.callTimeout = builder.callTimeout;
        this.dtmfConfig = builder.dtmfConfig;
        this.expiration = builder.expiration;
        this.industrialId = builder.industrialId;
        this.needAsr = builder.needAsr;
        this.needRecord = builder.needRecord;
        this.orderId = builder.orderId;
        this.outId = builder.outId;
        this.outOrderId = builder.outOrderId;
        this.ownerId = builder.ownerId;
        this.poolKey = builder.poolKey;
        this.recType = builder.recType;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.telA = builder.telA;
        this.telB = builder.telB;
        this.telX = builder.telX;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static BindAxb700Request create() {
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
     * @return callTimeout
     */
    public Long getCallTimeout() {
        return this.callTimeout;
    }

    /**
     * @return dtmfConfig
     */
    public String getDtmfConfig() {
        return this.dtmfConfig;
    }

    /**
     * @return expiration
     */
    public String getExpiration() {
        return this.expiration;
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
     * @return outOrderId
     */
    public String getOutOrderId() {
        return this.outOrderId;
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
     * @return recType
     */
    public String getRecType() {
        return this.recType;
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

    public static final class Builder extends Request.Builder<BindAxb700Request, Builder> {
        private String asrModelId; 
        private String audio; 
        private String callRestrict; 
        private Long callTimeout; 
        private String dtmfConfig; 
        private String expiration; 
        private String industrialId; 
        private Boolean needAsr; 
        private Boolean needRecord; 
        private String orderId; 
        private String outId; 
        private String outOrderId; 
        private Long ownerId; 
        private String poolKey; 
        private String recType; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private String telA; 
        private String telB; 
        private String telX; 

        private Builder() {
            super();
        } 

        private Builder(BindAxb700Request request) {
            super(request);
            this.asrModelId = request.asrModelId;
            this.audio = request.audio;
            this.callRestrict = request.callRestrict;
            this.callTimeout = request.callTimeout;
            this.dtmfConfig = request.dtmfConfig;
            this.expiration = request.expiration;
            this.industrialId = request.industrialId;
            this.needAsr = request.needAsr;
            this.needRecord = request.needRecord;
            this.orderId = request.orderId;
            this.outId = request.outId;
            this.outOrderId = request.outOrderId;
            this.ownerId = request.ownerId;
            this.poolKey = request.poolKey;
            this.recType = request.recType;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
            this.telA = request.telA;
            this.telB = request.telB;
            this.telX = request.telX;
        } 

        /**
         * AsrModelId.
         */
        public Builder asrModelId(String asrModelId) {
            this.putQueryParameter("AsrModelId", asrModelId);
            this.asrModelId = asrModelId;
            return this;
        }

        /**
         * Audio.
         */
        public Builder audio(String audio) {
            this.putQueryParameter("Audio", audio);
            this.audio = audio;
            return this;
        }

        /**
         * CallRestrict.
         */
        public Builder callRestrict(String callRestrict) {
            this.putQueryParameter("CallRestrict", callRestrict);
            this.callRestrict = callRestrict;
            return this;
        }

        /**
         * CallTimeout.
         */
        public Builder callTimeout(Long callTimeout) {
            this.putQueryParameter("CallTimeout", callTimeout);
            this.callTimeout = callTimeout;
            return this;
        }

        /**
         * DtmfConfig.
         */
        public Builder dtmfConfig(String dtmfConfig) {
            this.putQueryParameter("DtmfConfig", dtmfConfig);
            this.dtmfConfig = dtmfConfig;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
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
         * IndustrialId.
         */
        public Builder industrialId(String industrialId) {
            this.putQueryParameter("IndustrialId", industrialId);
            this.industrialId = industrialId;
            return this;
        }

        /**
         * NeedAsr.
         */
        public Builder needAsr(Boolean needAsr) {
            this.putQueryParameter("NeedAsr", needAsr);
            this.needAsr = needAsr;
            return this;
        }

        /**
         * NeedRecord.
         */
        public Builder needRecord(Boolean needRecord) {
            this.putQueryParameter("NeedRecord", needRecord);
            this.needRecord = needRecord;
            return this;
        }

        /**
         * OrderId.
         */
        public Builder orderId(String orderId) {
            this.putQueryParameter("OrderId", orderId);
            this.orderId = orderId;
            return this;
        }

        /**
         * OutId.
         */
        public Builder outId(String outId) {
            this.putQueryParameter("OutId", outId);
            this.outId = outId;
            return this;
        }

        /**
         * OutOrderId.
         */
        public Builder outOrderId(String outOrderId) {
            this.putQueryParameter("OutOrderId", outOrderId);
            this.outOrderId = outOrderId;
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
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>FC2258****</p>
         */
        public Builder poolKey(String poolKey) {
            this.putQueryParameter("PoolKey", poolKey);
            this.poolKey = poolKey;
            return this;
        }

        /**
         * RecType.
         */
        public Builder recType(String recType) {
            this.putQueryParameter("RecType", recType);
            this.recType = recType;
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
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>139****0000</p>
         */
        public Builder telA(String telA) {
            this.putQueryParameter("TelA", telA);
            this.telA = telA;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
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
         * TelX.
         */
        public Builder telX(String telX) {
            this.putQueryParameter("TelX", telX);
            this.telX = telX;
            return this;
        }

        @Override
        public BindAxb700Request build() {
            return new BindAxb700Request(this);
        } 

    } 

}
