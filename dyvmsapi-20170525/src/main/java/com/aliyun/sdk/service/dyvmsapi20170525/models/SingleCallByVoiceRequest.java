// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dyvmsapi20170525.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link SingleCallByVoiceRequest} extends {@link RequestModel}
 *
 * <p>SingleCallByVoiceRequest</p>
 */
public class SingleCallByVoiceRequest extends Request {
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
    @com.aliyun.core.annotation.NameInMap("VoiceCode")
    @com.aliyun.core.annotation.Validation(required = true)
    private String voiceCode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Volume")
    private Integer volume;

    private SingleCallByVoiceRequest(Builder builder) {
        super(builder);
        this.calledNumber = builder.calledNumber;
        this.calledShowNumber = builder.calledShowNumber;
        this.outId = builder.outId;
        this.ownerId = builder.ownerId;
        this.playTimes = builder.playTimes;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.speed = builder.speed;
        this.voiceCode = builder.voiceCode;
        this.volume = builder.volume;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SingleCallByVoiceRequest create() {
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
     * @return voiceCode
     */
    public String getVoiceCode() {
        return this.voiceCode;
    }

    /**
     * @return volume
     */
    public Integer getVolume() {
        return this.volume;
    }

    public static final class Builder extends Request.Builder<SingleCallByVoiceRequest, Builder> {
        private String calledNumber; 
        private String calledShowNumber; 
        private String outId; 
        private Long ownerId; 
        private Integer playTimes; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private Integer speed; 
        private String voiceCode; 
        private Integer volume; 

        private Builder() {
            super();
        } 

        private Builder(SingleCallByVoiceRequest request) {
            super(request);
            this.calledNumber = request.calledNumber;
            this.calledShowNumber = request.calledShowNumber;
            this.outId = request.outId;
            this.ownerId = request.ownerId;
            this.playTimes = request.playTimes;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
            this.speed = request.speed;
            this.voiceCode = request.voiceCode;
            this.volume = request.volume;
        } 

        /**
         * <p>The number for receiving voice notifications.</p>
         * <p>Number format:</p>
         * <ul>
         * <li><p>In the Chinese mainland:</p>
         * <ul>
         * <li>Mobile phone number, for example, 159****0000.</li>
         * <li>Landline number, for example, 0571****5678.</li>
         * </ul>
         * </li>
         * <li><p>Outside the Chinese mainland: country code + phone number, for example, 85200****00.</p>
         * </li>
         * </ul>
         * <blockquote>
         * </blockquote>
         * <ul>
         * <li><p>You can specify only one called number for a request. For more information, see <a href="https://help.aliyun.com/document_detail/150016.html">How to use voice notifications in the Chinese mainland</a> or <a href="https://help.aliyun.com/document_detail/268810.html">How to use voice notifications in regions outside the Chinese mainland</a>.</p>
         * </li>
         * <li><p>Voice notifications are sent to a called number at the following frequency: one time per minute, five times per hour, and 20 times per 24 hours.</p>
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
         * <li>You do not need to specify this parameter if you use a voice notification file that uses the common outbound call mode. For more information, see <a href="https://help.aliyun.com/document_detail/172104.html">FAQ about the common outbound call mode</a>.</li>
         * <li>If you use a voice notification file that uses the dedicated outbound call mode, you must specify a number that you purchased. You can specify only one number. You can log on to the <a href="https://dyvms.console.aliyun.com/overview/home">Voice Messaging Service console</a> and choose <strong>Real Number Service</strong> &gt; <strong>Real Number Management</strong> to view the number that you purchased.</li>
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
         * <p>The ID reserved for the caller. This ID is returned to the caller in a receipt message.</p>
         * <p>The value must be of the STRING type and 1 to 15 bytes in length.</p>
         * 
         * <strong>example:</strong>
         * <p>22596****</p>
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
         * <p>The number of times the voice notification file is played. Valid values: 1 to 3.</p>
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
         * <p>The playback speed of the voice notification file. Valid values: -500 to 500.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        public Builder speed(Integer speed) {
            this.putQueryParameter("Speed", speed);
            this.speed = speed;
            return this;
        }

        /**
         * <p>The voice ID of the voice notification file.</p>
         * <p>You can log on to the <a href="https://dyvms.console.aliyun.com/overview/home">Voice Messaging Service console</a>, choose <strong>Voice Messages</strong> &gt; <strong>Voice Notifications</strong> or <strong>Voice File Management</strong>, and then click the <strong>Voice Notification Files</strong> tab to view the <strong>voice ID</strong>.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>2d4c-4e78-8d2a-afbb06cf****.wav</p>
         */
        public Builder voiceCode(String voiceCode) {
            this.putQueryParameter("VoiceCode", voiceCode);
            this.voiceCode = voiceCode;
            return this;
        }

        /**
         * <p>The playback volume of the voice notification file. Valid values: 0 to 100. Default value: 100.</p>
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
        public SingleCallByVoiceRequest build() {
            return new SingleCallByVoiceRequest(this);
        } 

    } 

}
