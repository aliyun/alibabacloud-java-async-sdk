// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dyvmsapi_intl20211015.models;

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
 * {@link SignalCallRequest} extends {@link RequestModel}
 *
 * <p>SignalCallRequest</p>
 */
public class SignalCallRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CalledNumber")
    private String calledNumber;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CallerIdNumber")
    private String callerIdNumber;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CountryId")
    private String countryId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OutId")
    private String outId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PlayTimes")
    private Long playTimes;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SendType")
    private Long sendType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Signature")
    private String signature;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SignatureNonce")
    private String signatureNonce;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Speed")
    private Long speed;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TaskName")
    private String taskName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Timestamp")
    private String timestamp;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TimingStart")
    private String timingStart;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TtsCode")
    private String ttsCode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TtsParam")
    private String ttsParam;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VoiceCode")
    private String voiceCode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Volume")
    private Long volume;

    private SignalCallRequest(Builder builder) {
        super(builder);
        this.calledNumber = builder.calledNumber;
        this.callerIdNumber = builder.callerIdNumber;
        this.countryId = builder.countryId;
        this.outId = builder.outId;
        this.ownerId = builder.ownerId;
        this.playTimes = builder.playTimes;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.sendType = builder.sendType;
        this.signature = builder.signature;
        this.signatureNonce = builder.signatureNonce;
        this.speed = builder.speed;
        this.taskName = builder.taskName;
        this.timestamp = builder.timestamp;
        this.timingStart = builder.timingStart;
        this.ttsCode = builder.ttsCode;
        this.ttsParam = builder.ttsParam;
        this.voiceCode = builder.voiceCode;
        this.volume = builder.volume;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SignalCallRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return calledNumber
     */
    public String getCalledNumber() {
        return this.calledNumber;
    }

    /**
     * @return callerIdNumber
     */
    public String getCallerIdNumber() {
        return this.callerIdNumber;
    }

    /**
     * @return countryId
     */
    public String getCountryId() {
        return this.countryId;
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
     * @return playTimes
     */
    public Long getPlayTimes() {
        return this.playTimes;
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
     * @return sendType
     */
    public Long getSendType() {
        return this.sendType;
    }

    /**
     * @return signature
     */
    public String getSignature() {
        return this.signature;
    }

    /**
     * @return signatureNonce
     */
    public String getSignatureNonce() {
        return this.signatureNonce;
    }

    /**
     * @return speed
     */
    public Long getSpeed() {
        return this.speed;
    }

    /**
     * @return taskName
     */
    public String getTaskName() {
        return this.taskName;
    }

    /**
     * @return timestamp
     */
    public String getTimestamp() {
        return this.timestamp;
    }

    /**
     * @return timingStart
     */
    public String getTimingStart() {
        return this.timingStart;
    }

    /**
     * @return ttsCode
     */
    public String getTtsCode() {
        return this.ttsCode;
    }

    /**
     * @return ttsParam
     */
    public String getTtsParam() {
        return this.ttsParam;
    }

    /**
     * @return voiceCode
     */
    public String getVoiceCode() {
        return this.voiceCode;
    }

    /**
     * @return volume
     */
    public Long getVolume() {
        return this.volume;
    }

    public static final class Builder extends Request.Builder<SignalCallRequest, Builder> {
        private String calledNumber; 
        private String callerIdNumber; 
        private String countryId; 
        private String outId; 
        private Long ownerId; 
        private Long playTimes; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private Long sendType; 
        private String signature; 
        private String signatureNonce; 
        private Long speed; 
        private String taskName; 
        private String timestamp; 
        private String timingStart; 
        private String ttsCode; 
        private String ttsParam; 
        private String voiceCode; 
        private Long volume; 

        private Builder() {
            super();
        } 

        private Builder(SignalCallRequest request) {
            super(request);
            this.calledNumber = request.calledNumber;
            this.callerIdNumber = request.callerIdNumber;
            this.countryId = request.countryId;
            this.outId = request.outId;
            this.ownerId = request.ownerId;
            this.playTimes = request.playTimes;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
            this.sendType = request.sendType;
            this.signature = request.signature;
            this.signatureNonce = request.signatureNonce;
            this.speed = request.speed;
            this.taskName = request.taskName;
            this.timestamp = request.timestamp;
            this.timingStart = request.timingStart;
            this.ttsCode = request.ttsCode;
            this.ttsParam = request.ttsParam;
            this.voiceCode = request.voiceCode;
            this.volume = request.volume;
        } 

        /**
         * <p>接收语音通知的手机号码。  号码格式：国际码+号码： 示例：85200****00。</p>
         * 
         * <strong>example:</strong>
         * <p>852****0000</p>
         */
        public Builder calledNumber(String calledNumber) {
            this.putQueryParameter("CalledNumber", calledNumber);
            this.calledNumber = calledNumber;
            return this;
        }

        /**
         * <p>主叫号码。  若您不填该参数，系统将会使用当地随机号码作为外显号码。 若您专属号码外呼，则必须传入已购买的号码，仅支持一个号码。您可以登录国际语音服务控制台，选择&quot;号码管理&quot;查看已购买的号码。</p>
         * 
         * <strong>example:</strong>
         * <p>852****0001</p>
         */
        public Builder callerIdNumber(String callerIdNumber) {
            this.putQueryParameter("CallerIdNumber", callerIdNumber);
            this.callerIdNumber = callerIdNumber;
            return this;
        }

        /**
         * <p>国家/地区二字码，ISO2。</p>
         * 
         * <strong>example:</strong>
         * <p>HK</p>
         */
        public Builder countryId(String countryId) {
            this.putQueryParameter("CountryId", countryId);
            this.countryId = countryId;
            return this;
        }

        /**
         * <p>预留给调用方使用的ID，最终会通过在回执消息中将此ID带回给调用方。  字符串类型，长度为1~15个字节。</p>
         * 
         * <strong>example:</strong>
         * <p>22522****</p>
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
         * <p>一通电话内语音通知内容的播放次数。取值范围：1~3，默认取值3。</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        public Builder playTimes(Long playTimes) {
            this.putQueryParameter("PlayTimes", playTimes);
            this.playTimes = playTimes;
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
         * <p>发送类型：取值[1,2]。  1： 立即开始发送任务，不等待。  2： 定时开始发送任务。如果传该类型，TimingStart为必选字段。</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder sendType(Long sendType) {
            this.putQueryParameter("SendType", sendType);
            this.sendType = sendType;
            return this;
        }

        /**
         * Signature.
         */
        public Builder signature(String signature) {
            this.putQueryParameter("Signature", signature);
            this.signature = signature;
            return this;
        }

        /**
         * SignatureNonce.
         */
        public Builder signatureNonce(String signatureNonce) {
            this.putQueryParameter("SignatureNonce", signatureNonce);
            this.signatureNonce = signatureNonce;
            return this;
        }

        /**
         * <p>语速控制。取值范围为：-500~500。</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder speed(Long speed) {
            this.putQueryParameter("Speed", speed);
            this.speed = speed;
            return this;
        }

        /**
         * <p>任务名称。</p>
         * 
         * <strong>example:</strong>
         * <p>单呼任务名</p>
         */
        public Builder taskName(String taskName) {
            this.putQueryParameter("TaskName", taskName);
            this.taskName = taskName;
            return this;
        }

        /**
         * Timestamp.
         */
        public Builder timestamp(String timestamp) {
            this.putQueryParameter("Timestamp", timestamp);
            this.timestamp = timestamp;
            return this;
        }

        /**
         * <p>定时发送的时间。</p>
         * 
         * <strong>example:</strong>
         * <p>2022-05-01T08:00:00+08:00</p>
         */
        public Builder timingStart(String timingStart) {
            this.putQueryParameter("TimingStart", timingStart);
            this.timingStart = timingStart;
            return this;
        }

        /**
         * <p>文本转语音模板的语音ID。  您可以登录国际语音服务控制台，选择&quot;语音模板管理&quot;-&quot;文本转语音模板&quot;，查看模板ID。  此参数与VoiceCode二选一必填。分别代表使用语音文件作为呼叫内容呼叫或者使用固定模板文字作为呼叫内容。</p>
         * 
         * <strong>example:</strong>
         * <p>1001</p>
         */
        public Builder ttsCode(String ttsCode) {
            this.putQueryParameter("TtsCode", ttsCode);
            this.ttsCode = ttsCode;
            return this;
        }

        /**
         * <p>模板中的变量参数，JSON格式。</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;code&quot;:&quot;1234&quot;}</p>
         */
        public Builder ttsParam(String ttsParam) {
            this.putQueryParameter("TtsParam", ttsParam);
            this.ttsParam = ttsParam;
            return this;
        }

        /**
         * <p>语音文件的模板ID。  您可以登录国际语音服务控制台，选择&quot;语音模板管理&quot;-&quot;语音文件&quot;，查看模板ID。  此参数与TtsCode二选一必填。分别代表使用语音文件作为呼叫内容呼叫或者使用固定模板文字作为呼叫内容。</p>
         * 
         * <strong>example:</strong>
         * <p>1002</p>
         */
        public Builder voiceCode(String voiceCode) {
            this.putQueryParameter("VoiceCode", voiceCode);
            this.voiceCode = voiceCode;
            return this;
        }

        /**
         * <p>语音通知的播放音量。取值范围：0~100，默认取值100。</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        public Builder volume(Long volume) {
            this.putQueryParameter("Volume", volume);
            this.volume = volume;
            return this;
        }

        @Override
        public SignalCallRequest build() {
            return new SignalCallRequest(this);
        } 

    } 

}
