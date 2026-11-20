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
         * <p>Optional. The ASR model ID. Valid values:</p>
         * <ul>
         * <li>General-Phone-Mandarin model ID: 7ee372834d2f4cc7ac0d0ab2d0ae1aac</li>
         * <li>General-Phone-Cantonese model ID: 9b4afe3d224e4fa3bf963697113e2f77</li>
         * <li>General-Phone-Regional Accent model ID: 3655a6cb94764145a1f9a38a3c3b3b4b.</li>
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
         * <p>The audio prompt encoding.</p>
         * <ul>
         * <li>ACallX_Apre: The audio prompt encoding played to A before the call is connected when A calls X.</li>
         * <li>ACallX_Ain: The audio prompt encoding played to A after the call is connected when A calls X.</li>
         * <li>ACallX_Bin: The audio prompt encoding played to B after the call is connected when A calls X.</li>
         * <li>BCallX_Bpre: The audio prompt encoding played to B before the call is connected when B calls X.</li>
         * <li>BCallX_Ain: The audio prompt encoding played to A after the call is connected when B calls X.</li>
         * <li>BCallX_Bin: The audio prompt encoding played to B after the call is connected when B calls X.</li>
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
         * <p>The one-way call restriction logic. Valid values:</p>
         * <ul>
         * <li><p>CONTROL_AX_DISABLE: Number A cannot call number X.</p>
         * </li>
         * <li><p>CONTROL_BX_DISABLE: Number B cannot call number X.</p>
         * </li>
         * </ul>
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
         * <p>The sequential ringing duration. Unit: seconds. Valid values: 5 to 20.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder callTimeout(Long callTimeout) {
            this.putQueryParameter("CallTimeout", callTimeout);
            this.callTimeout = callTimeout;
            return this;
        }

        /**
         * <p>Optional. The DTMF key configuration for 700AXB number binding. The following items can be configured:</p>
         * <ul>
         * <li>endCallIvrPhoneNo: The audio playback target, A or B.</li>
         * <li>waitingDtmfTime: The maximum wait time after the first audio file is played. Maximum value: 30 seconds.</li>
         * <li>maxLoop dtmf: The maximum number of times the first audio file is replayed when a key press does not match. Maximum value: 5.</li>
         * <li>step1File: The name of the first audio file.</li>
         * <li>step2File: The name of the second audio file.</li>
         * <li>validKey: The valid key values, such as 1,2. Only two valid key values can be configured, separated by commas (,).</li>
         * <li>waitingEndCall: The carrier hang-up wait time. Maximum value: 10 seconds.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>{
         *     &quot;endCallIvrPhoneNo&quot;:&quot;A&quot;,
         *     &quot;waitingDtmfTime&quot;:10,
         *     &quot;maxLoop&quot;:3,
         *     &quot;step1File&quot;:&quot;62ab72f8-4750-4234-859e-e8d678c0cad3-flow_tts_test_1.wav&quot;,
         *     &quot;step2File&quot;:&quot;62ab72f8-4750-4234-859e-e8d678c0cad3-flow_tts_test_2.wav&quot;,
         *     &quot;validKey&quot;:&quot;1,2&quot;,
         *     &quot;waitingEndCall&quot;:2
         * }</p>
         */
        public Builder dtmfConfig(String dtmfConfig) {
            this.putQueryParameter("DtmfConfig", dtmfConfig);
            this.dtmfConfig = dtmfConfig;
            return this;
        }

        /**
         * <p>The expiration time of the number binding.</p>
         * <blockquote>
         * <ul>
         * <li>The expiration time must be at least 1 minute later than the current binding time, accurate to the second.</li>
         * <li>You can manually unbind the number at any time before the binding expires.</li>
         * <li>If you unbind a number that is in an active call, the current call is not affected.</li>
         * </ul>
         * </blockquote>
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
         * <p>The industrial Internet identifier code, which has a one-to-one mapping with OrderId.</p>
         * <p>The code supports characters such as &quot;.&quot; and &quot;/&quot; as domain separators. The code must not contain non-printable characters such as spaces or line breaks.</p>
         * <p>This field is required when the caller generates the industrial Internet identifier code independently.</p>
         * <blockquote>
         * <ul>
         * <li>Either OrderId or IndustrialId is required depending on the business scenario.</li>
         * </ul>
         * </blockquote>
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
         * <p>Specifies whether to enable the ASR service. Valid values:</p>
         * <ul>
         * <li><p>false: Disable (default).</p>
         * </li>
         * <li><p>true: Enable.</p>
         * </li>
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
         * <p>Specifies whether call recording files are required for all calls made through this number binding. Valid values:</p>
         * <ul>
         * <li><p>true: Enable recording.</p>
         * </li>
         * <li><p>false: Disable recording (default).</p>
         * </li>
         * </ul>
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
         * <p>The business order code.</p>
         * <ul>
         * <li><p>This code has a one-to-one mapping with the actual business order and must be unique.</p>
         * </li>
         * <li><p>The code supports characters such as &quot;.&quot; and &quot;/&quot; as domain separators. The code must not contain non-printable characters such as spaces or line breaks.</p>
         * </li>
         * <li><p>This field is required when the caller submits a business order code and the platform generates an industrial Internet identifier code.</p>
         * <blockquote>
         * <ul>
         * <li>Either OrderId or IndustrialId is required depending on the business scenario.</li>
         * </ul>
         * </blockquote>
         * </li>
         * </ul>
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
         * <p>The external business ID.</p>
         * 
         * <strong>example:</strong>
         * <p>abcdefgh</p>
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
         * <p>The key of the China 700 number pool.</p>
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
         * <p>The recording file format. Valid values: mp3 and wav.</p>
         * 
         * <strong>example:</strong>
         * <p>mp3</p>
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
         * <p>The phone number of user A.</p>
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
         * <p>The phone number of user B.</p>
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
         * <p>Optional. The intermediate number X.</p>
         * <blockquote>
         * <ul>
         * <li>If the caller does not specify an X number,</li>
         * <li>the platform assigns a number from the number pool as the X number.</li>
         * </ul>
         * </blockquote>
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
        public BindAxb700Request build() {
            return new BindAxb700Request(this);
        } 

    } 

}
