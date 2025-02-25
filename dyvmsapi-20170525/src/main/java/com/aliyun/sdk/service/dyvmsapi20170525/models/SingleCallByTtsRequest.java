// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dyvmsapi20170525.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link SingleCallByTtsRequest} extends {@link RequestModel}
 *
 * <p>SingleCallByTtsRequest</p>
 */
public class SingleCallByTtsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CalledNumber")
    @com.aliyun.core.annotation.Validation(required = true)
    private String calledNumber;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CalledShowNumber")
    private String calledShowNumber;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OutId")
    private String outId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PlayTimes")
    private Integer playTimes;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Speed")
    private Integer speed;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TtsCode")
    @com.aliyun.core.annotation.Validation(required = true)
    private String ttsCode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TtsParam")
    private String ttsParam;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Volume")
    private Integer volume;

    private SingleCallByTtsRequest(Builder builder) {
        super(builder);
        this.calledNumber = builder.calledNumber;
        this.calledShowNumber = builder.calledShowNumber;
        this.outId = builder.outId;
        this.ownerId = builder.ownerId;
        this.playTimes = builder.playTimes;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.speed = builder.speed;
        this.ttsCode = builder.ttsCode;
        this.ttsParam = builder.ttsParam;
        this.volume = builder.volume;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SingleCallByTtsRequest create() {
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
     * @return calledShowNumber
     */
    public String getCalledShowNumber() {
        return this.calledShowNumber;
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
    public Integer getPlayTimes() {
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
     * @return speed
     */
    public Integer getSpeed() {
        return this.speed;
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
     * @return volume
     */
    public Integer getVolume() {
        return this.volume;
    }

    public static final class Builder extends Request.Builder<SingleCallByTtsRequest, Builder> {
        private String calledNumber; 
        private String calledShowNumber; 
        private String outId; 
        private Long ownerId; 
        private Integer playTimes; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private Integer speed; 
        private String ttsCode; 
        private String ttsParam; 
        private Integer volume; 

        private Builder() {
            super();
        } 

        private Builder(SingleCallByTtsRequest request) {
            super(request);
            this.calledNumber = request.calledNumber;
            this.calledShowNumber = request.calledShowNumber;
            this.outId = request.outId;
            this.ownerId = request.ownerId;
            this.playTimes = request.playTimes;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
            this.speed = request.speed;
            this.ttsCode = request.ttsCode;
            this.ttsParam = request.ttsParam;
            this.volume = request.volume;
        } 

        /**
         * <p>The mobile phone number that receives voice notifications.</p>
         * <ul>
         * <li><p>Number format in the Chinese mainland:</p>
         * <ul>
         * <li>Mobile phone number, for example, 159****0000.</li>
         * <li>Landline number, for example, 0571****5678.</li>
         * </ul>
         * </li>
         * <li><p>Number format outside the Chinese mainland: country code + phone number, for example, 85200****00.</p>
         * </li>
         * </ul>
         * <blockquote>
         * </blockquote>
         * <ul>
         * <li><p>Each request supports only one called number. For more information, see <a href="https://help.aliyun.com/document_detail/150016.html">How to use voice notifications in the Chinese mainland</a> or <a href="https://help.aliyun.com/document_detail/270044.html">How to use voice verification codes in regions outside the Chinese mainland</a>.</p>
         * </li>
         * <li><p>Voice verification codes are sent to a called number at the following frequency: one time per minute, five times per hour, and 20 times per 24 hours.</p>
         * </li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1590****000</p>
         */
        public Builder calledNumber(String calledNumber) {
            this.putQueryParameter("CalledNumber", calledNumber);
            this.calledNumber = calledNumber;
            return this;
        }

        /**
         * <p>The number displayed to the called party.</p>
         * <ul>
         * <li>You do not need to specify this parameter if you use the text-to-speech (TTS) notification template or voice verification code template for outbound calls in the common mode. For more information, see <a href="https://help.aliyun.com/document_detail/172104.html">FAQ about the common outbound call mode</a>.</li>
         * <li>If you use the TTS notification template or voice verification code template for outbound calls in the dedicated mode, you must specify a number you purchased and only one number can be specified. You can log on to the <a href="https://dyvms.console.aliyun.com/overview/home">Voice Messaging Service console</a> and choose <strong>Voice Numbers</strong> &gt; <strong>Real Number Management</strong> to view the number you purchased.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0571****5678</p>
         */
        public Builder calledShowNumber(String calledShowNumber) {
            this.putQueryParameter("CalledShowNumber", calledShowNumber);
            this.calledShowNumber = calledShowNumber;
            return this;
        }

        /**
         * <p>The custom ID that is reserved for the caller of the operation when the request is initiated. This ID is returned to the caller in a receipt message.</p>
         * <p>The value is of the STRING type and must be 1 to 15 bytes in length.</p>
         * 
         * <strong>example:</strong>
         * <p>225869*****</p>
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
         * <p>The number of times a voice notification is played back in a call. Valid values: 1 to 3. Default value: 3.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        public Builder playTimes(Integer playTimes) {
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
         * <p>The playback speed. Valid value: -500 to 500.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        public Builder speed(Integer speed) {
            this.putQueryParameter("Speed", speed);
            this.speed = speed;
            return this;
        }

        /**
         * <p>The ID of the approved TTS notification template or voice verification code template.</p>
         * <p>You can log on to the <a href="https://dyvms.console.aliyun.com/overview/home">Voice Messaging Service console</a>, and choose <strong>Voice Messages</strong> &gt; <strong>Voice Verification Codes</strong> or choose <strong>Voice Messages</strong> &gt; <strong>Voice Notifications</strong> to view the <strong>template ID</strong>.</p>
         * <blockquote>
         * <p>The account to which the TTS template belongs must be the same as the account that is used to call the SingleCallByTts operation.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>TTS_100****</p>
         */
        public Builder ttsCode(String ttsCode) {
            this.putQueryParameter("TtsCode", ttsCode);
            this.ttsCode = ttsCode;
            return this;
        }

        /**
         * <p>The variables in the template, in the JSON format.</p>
         * <blockquote>
         * <p>The variables in the template must be less than 250 characters in length. The length of each single variable is not limited. These variables do not support URLs. The variables in the verification code template support only digits and letters.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>{&quot;AckNum&quot;:&quot;123456&quot;}</p>
         */
        public Builder ttsParam(String ttsParam) {
            this.putQueryParameter("TtsParam", ttsParam);
            this.ttsParam = ttsParam;
            return this;
        }

        /**
         * <p>The playback volume of the voice notification. Valid values: 0 to 100. Default value: 100.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        public Builder volume(Integer volume) {
            this.putQueryParameter("Volume", volume);
            this.volume = volume;
            return this;
        }

        @Override
        public SingleCallByTtsRequest build() {
            return new SingleCallByTtsRequest(this);
        } 

    } 

}
