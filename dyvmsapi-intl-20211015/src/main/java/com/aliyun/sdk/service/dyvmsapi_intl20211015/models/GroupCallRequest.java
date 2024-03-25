// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dyvmsapi_intl20211015.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GroupCallRequest} extends {@link RequestModel}
 *
 * <p>GroupCallRequest</p>
 */
public class GroupCallRequest extends Request {
    @Query
    @NameInMap("CalledNumber")
    private java.util.List < String > calledNumber;

    @Query
    @NameInMap("CallerIdNumber")
    private String callerIdNumber;

    @Query
    @NameInMap("CountryId")
    private String countryId;

    @Query
    @NameInMap("OutId")
    private String outId;

    @Query
    @NameInMap("OwnerId")
    private Long ownerId;

    @Query
    @NameInMap("PlayTimes")
    private Long playTimes;

    @Query
    @NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @Query
    @NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @Query
    @NameInMap("SendType")
    private Long sendType;

    @Query
    @NameInMap("Signature")
    private String signature;

    @Query
    @NameInMap("SignatureNonce")
    private String signatureNonce;

    @Query
    @NameInMap("Speed")
    private Long speed;

    @Query
    @NameInMap("TaskName")
    private String taskName;

    @Query
    @NameInMap("Timestamp")
    private String timestamp;

    @Query
    @NameInMap("TimingStart")
    private String timingStart;

    @Query
    @NameInMap("TtsCode")
    private String ttsCode;

    @Query
    @NameInMap("TtsParam")
    private String ttsParam;

    @Query
    @NameInMap("VoiceCode")
    private String voiceCode;

    @Query
    @NameInMap("Volume")
    private Long volume;

    private GroupCallRequest(Builder builder) {
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

    public static GroupCallRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return calledNumber
     */
    public java.util.List < String > getCalledNumber() {
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

    public static final class Builder extends Request.Builder<GroupCallRequest, Builder> {
        private java.util.List < String > calledNumber; 
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

        private Builder(GroupCallRequest request) {
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
         * 被叫号码。上限为5万个。
         */
        public Builder calledNumber(java.util.List < String > calledNumber) {
            String calledNumberShrink = shrink(calledNumber, "CalledNumber", "json");
            this.putQueryParameter("CalledNumber", calledNumberShrink);
            this.calledNumber = calledNumber;
            return this;
        }

        /**
         * 主叫号码。  若您不填该参数，系统将会使用当地随机号码作为外显号码。 若您专属号码外呼，则必须传入已购买的号码，仅支持一个号码。您可以登录国际语音服务控制台，选择"号码管理"查看已购买的号码。
         */
        public Builder callerIdNumber(String callerIdNumber) {
            this.putQueryParameter("CallerIdNumber", callerIdNumber);
            this.callerIdNumber = callerIdNumber;
            return this;
        }

        /**
         * 国家/地区二字码，ISO2。
         */
        public Builder countryId(String countryId) {
            this.putQueryParameter("CountryId", countryId);
            this.countryId = countryId;
            return this;
        }

        /**
         * 预留给调用方使用的ID，最终会通过在回执消息中将此ID带回给调用方。  字符串类型，长度为1~15个字节。
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
         * 语音文件的播放次数。取值范围：1~3。
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
         * 发送类型：取值[1,2]。  1： 立即开始发送任务，不等待。  2： 定时开始发送任务。如果传该类型，TimingStart为必选字段。
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
         * 语速控制，取值范围：-500~500。  音频类型为TTS时必传。录音文件可不传。
         */
        public Builder speed(Long speed) {
            this.putQueryParameter("Speed", speed);
            this.speed = speed;
            return this;
        }

        /**
         * 任务名称。
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
         * 2022-05-01T08:00:00+08:00
         */
        public Builder timingStart(String timingStart) {
            this.putQueryParameter("TimingStart", timingStart);
            this.timingStart = timingStart;
            return this;
        }

        /**
         * 文本转语音的模板ID。  您可以登录国际语音服务控制台，选择"语音模板管理"-"文本转语音模板"，查看模板ID。  此参数与VoiceCode二选一必填。分别代表使用语音文件作为呼叫内容呼叫或者使用固定模板文字作为呼叫内容。
         */
        public Builder ttsCode(String ttsCode) {
            this.putQueryParameter("TtsCode", ttsCode);
            this.ttsCode = ttsCode;
            return this;
        }

        /**
         * 模板中的变量参数，JSON格式。
         */
        public Builder ttsParam(String ttsParam) {
            this.putQueryParameter("TtsParam", ttsParam);
            this.ttsParam = ttsParam;
            return this;
        }

        /**
         * 语音文件的模板ID。  您可以登录国际语音服务控制台，选择"语音模板管理"-"语音文件"，查看模板ID。  此参数与TtsCode二选一必填。分别代表使用语音文件作为呼叫内容呼叫或者使用固定模板文字作为呼叫内容。
         */
        public Builder voiceCode(String voiceCode) {
            this.putQueryParameter("VoiceCode", voiceCode);
            this.voiceCode = voiceCode;
            return this;
        }

        /**
         * 语音文件播放的音量。取值范围：0~100，默认取值100。
         */
        public Builder volume(Long volume) {
            this.putQueryParameter("Volume", volume);
            this.volume = volume;
            return this;
        }

        @Override
        public GroupCallRequest build() {
            return new GroupCallRequest(this);
        } 

    } 

}
