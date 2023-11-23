// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dypls20170830.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link TestTtsRingToneRequest} extends {@link RequestModel}
 *
 * <p>TestTtsRingToneRequest</p>
 */
public class TestTtsRingToneRequest extends Request {
    @Query
    @NameInMap("BillId")
    private String billId;

    @Query
    @NameInMap("OwnerId")
    private Long ownerId;

    @Query
    @NameInMap("ProdCode")
    private String prodCode;

    @Query
    @NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @Query
    @NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @Query
    @NameInMap("Tts")
    private String tts;

    @Query
    @NameInMap("VoiceSpeed")
    private String voiceSpeed;

    @Query
    @NameInMap("VoiceStyle")
    private String voiceStyle;

    @Query
    @NameInMap("VoiceType")
    private String voiceType;

    @Query
    @NameInMap("VoiceVolume")
    private String voiceVolume;

    private TestTtsRingToneRequest(Builder builder) {
        super(builder);
        this.billId = builder.billId;
        this.ownerId = builder.ownerId;
        this.prodCode = builder.prodCode;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.tts = builder.tts;
        this.voiceSpeed = builder.voiceSpeed;
        this.voiceStyle = builder.voiceStyle;
        this.voiceType = builder.voiceType;
        this.voiceVolume = builder.voiceVolume;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static TestTtsRingToneRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return billId
     */
    public String getBillId() {
        return this.billId;
    }

    /**
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
    }

    /**
     * @return prodCode
     */
    public String getProdCode() {
        return this.prodCode;
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
     * @return tts
     */
    public String getTts() {
        return this.tts;
    }

    /**
     * @return voiceSpeed
     */
    public String getVoiceSpeed() {
        return this.voiceSpeed;
    }

    /**
     * @return voiceStyle
     */
    public String getVoiceStyle() {
        return this.voiceStyle;
    }

    /**
     * @return voiceType
     */
    public String getVoiceType() {
        return this.voiceType;
    }

    /**
     * @return voiceVolume
     */
    public String getVoiceVolume() {
        return this.voiceVolume;
    }

    public static final class Builder extends Request.Builder<TestTtsRingToneRequest, Builder> {
        private String billId; 
        private Long ownerId; 
        private String prodCode; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private String tts; 
        private String voiceSpeed; 
        private String voiceStyle; 
        private String voiceType; 
        private String voiceVolume; 

        private Builder() {
            super();
        } 

        private Builder(TestTtsRingToneRequest request) {
            super(request);
            this.billId = request.billId;
            this.ownerId = request.ownerId;
            this.prodCode = request.prodCode;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
            this.tts = request.tts;
            this.voiceSpeed = request.voiceSpeed;
            this.voiceStyle = request.voiceStyle;
            this.voiceType = request.voiceType;
            this.voiceVolume = request.voiceVolume;
        } 

        /**
         * BillId.
         */
        public Builder billId(String billId) {
            this.putQueryParameter("BillId", billId);
            this.billId = billId;
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
         * ProdCode.
         */
        public Builder prodCode(String prodCode) {
            this.putQueryParameter("ProdCode", prodCode);
            this.prodCode = prodCode;
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
         * Tts.
         */
        public Builder tts(String tts) {
            this.putQueryParameter("Tts", tts);
            this.tts = tts;
            return this;
        }

        /**
         * VoiceSpeed.
         */
        public Builder voiceSpeed(String voiceSpeed) {
            this.putQueryParameter("VoiceSpeed", voiceSpeed);
            this.voiceSpeed = voiceSpeed;
            return this;
        }

        /**
         * VoiceStyle.
         */
        public Builder voiceStyle(String voiceStyle) {
            this.putQueryParameter("VoiceStyle", voiceStyle);
            this.voiceStyle = voiceStyle;
            return this;
        }

        /**
         * VoiceType.
         */
        public Builder voiceType(String voiceType) {
            this.putQueryParameter("VoiceType", voiceType);
            this.voiceType = voiceType;
            return this;
        }

        /**
         * VoiceVolume.
         */
        public Builder voiceVolume(String voiceVolume) {
            this.putQueryParameter("VoiceVolume", voiceVolume);
            this.voiceVolume = voiceVolume;
            return this;
        }

        @Override
        public TestTtsRingToneRequest build() {
            return new TestTtsRingToneRequest(this);
        } 

    } 

}
