// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dyvmsapi20170525.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link IvrCallRequest} extends {@link RequestModel}
 *
 * <p>IvrCallRequest</p>
 */
public class IvrCallRequest extends Request {
    @Query
    @NameInMap("ByeCode")
    private String byeCode;

    @Query
    @NameInMap("ByeTtsParams")
    private String byeTtsParams;

    @Query
    @NameInMap("CalledNumber")
    @Validation(required = true)
    private String calledNumber;

    @Query
    @NameInMap("CalledShowNumber")
    @Validation(required = true)
    private String calledShowNumber;

    @Query
    @NameInMap("MenuKeyMap")
    private java.util.List < MenuKeyMap> menuKeyMap;

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
    @NameInMap("StartCode")
    @Validation(required = true)
    private String startCode;

    @Query
    @NameInMap("StartTtsParams")
    private String startTtsParams;

    @Query
    @NameInMap("Timeout")
    private Integer timeout;

    private IvrCallRequest(Builder builder) {
        super(builder);
        this.byeCode = builder.byeCode;
        this.byeTtsParams = builder.byeTtsParams;
        this.calledNumber = builder.calledNumber;
        this.calledShowNumber = builder.calledShowNumber;
        this.menuKeyMap = builder.menuKeyMap;
        this.outId = builder.outId;
        this.ownerId = builder.ownerId;
        this.playTimes = builder.playTimes;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.startCode = builder.startCode;
        this.startTtsParams = builder.startTtsParams;
        this.timeout = builder.timeout;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static IvrCallRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return byeCode
     */
    public String getByeCode() {
        return this.byeCode;
    }

    /**
     * @return byeTtsParams
     */
    public String getByeTtsParams() {
        return this.byeTtsParams;
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
     * @return menuKeyMap
     */
    public java.util.List < MenuKeyMap> getMenuKeyMap() {
        return this.menuKeyMap;
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
     * @return startCode
     */
    public String getStartCode() {
        return this.startCode;
    }

    /**
     * @return startTtsParams
     */
    public String getStartTtsParams() {
        return this.startTtsParams;
    }

    /**
     * @return timeout
     */
    public Integer getTimeout() {
        return this.timeout;
    }

    public static final class Builder extends Request.Builder<IvrCallRequest, Builder> {
        private String byeCode; 
        private String byeTtsParams; 
        private String calledNumber; 
        private String calledShowNumber; 
        private java.util.List < MenuKeyMap> menuKeyMap; 
        private String outId; 
        private Long ownerId; 
        private Long playTimes; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private String startCode; 
        private String startTtsParams; 
        private Integer timeout; 

        private Builder() {
            super();
        } 

        private Builder(IvrCallRequest request) {
            super(request);
            this.byeCode = request.byeCode;
            this.byeTtsParams = request.byeTtsParams;
            this.calledNumber = request.calledNumber;
            this.calledShowNumber = request.calledShowNumber;
            this.menuKeyMap = request.menuKeyMap;
            this.outId = request.outId;
            this.ownerId = request.ownerId;
            this.playTimes = request.playTimes;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
            this.startCode = request.startCode;
            this.startTtsParams = request.startTtsParams;
            this.timeout = request.timeout;
        } 

        /**
         * The end voice.
         * <p>
         * 
         * *   If you use a voice notification file, this parameter specifies the voice ID. You can log on to the [Voice Messaging Service console](https://dyvms.console.aliyun.com/overview/home), choose **Voice Messages** > **Voice Notifications**, and then click the **Voice Notification Files** tab to view the voice ID.
         * *   If you use a TTS template, this parameter specifies the template ID. You can log on to the [Voice Messaging Service console](https://dyvms.console.aliyun.com/overview/home), choose **Voice Messages** > **Voice Notifications**, and then click the **TTS Template** tab to view the template ID.
         * 
         * > The value of the ByeCode parameter must be of the same type as the value of the StartCode parameter. This means that both parameters must specify voice IDs or TTS template IDs.
         */
        public Builder byeCode(String byeCode) {
            this.putQueryParameter("ByeCode", byeCode);
            this.byeCode = byeCode;
            return this;
        }

        /**
         * The variables in the TTS template, in the JSON format.
         * <p>
         * 
         * > This parameter is required when the ByeCode parameter is set to the ID of a TTS template that contains variables.
         */
        public Builder byeTtsParams(String byeTtsParams) {
            this.putQueryParameter("ByeTtsParams", byeTtsParams);
            this.byeTtsParams = byeTtsParams;
            return this;
        }

        /**
         * The called number.
         * <p>
         * 
         * Only phone numbers in the Chinese mainland are supported. Each request supports only one called number.
         */
        public Builder calledNumber(String calledNumber) {
            this.putQueryParameter("CalledNumber", calledNumber);
            this.calledNumber = calledNumber;
            return this;
        }

        /**
         * The calling number.
         * <p>
         * 
         * The value must be a number you purchased. Each request supports only one calling number. In most cases, a calling number is configured with the maximum number of concurrent requests. New requests fail if the maximum number of concurrent requests is reached. You can log on to the [Voice Messaging Service console](https://dyvms.console.aliyun.com/overview/home) and choose **Real Number Service > Real Number Management** to view the number you purchased.
         */
        public Builder calledShowNumber(String calledShowNumber) {
            this.putQueryParameter("CalledShowNumber", calledShowNumber);
            this.calledShowNumber = calledShowNumber;
            return this;
        }

        /**
         * The information about the key pressed by the subscriber.
         */
        public Builder menuKeyMap(java.util.List < MenuKeyMap> menuKeyMap) {
            this.putQueryParameter("MenuKeyMap", menuKeyMap);
            this.menuKeyMap = menuKeyMap;
            return this;
        }

        /**
         * The ID that is reserved for the caller of the operation. This ID is returned to the caller in a receipt message.
         * <p>
         * 
         * The value is of the STRING type and must be 1 to 15 bytes in length.
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
         * The number of replay times. Valid values: 1 to 3.
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
         * The voice that is played when the call begins.
         * <p>
         * 
         * *   If you use a voice notification file, this parameter specifies the voice ID. You can log on to the [Voice Messaging Service console](https://dyvms.console.aliyun.com/overview/home), choose **Voice Messages** > Voice Notifications, and then click the **Voice Notification Files** tab to view the voice ID.
         * *   If you use a text-to-speech (TTS) template, this parameter specifies the template ID. You can log on to the [Voice Messaging Service console](https://dyvms.console.aliyun.com/overview/home), choose **Voice Messages** > **Voice Notifications**, and then click the **TTS Template** tab to view the template ID.
         */
        public Builder startCode(String startCode) {
            this.putQueryParameter("StartCode", startCode);
            this.startCode = startCode;
            return this;
        }

        /**
         * The variables in the TTS template, in the JSON format.
         * <p>
         * 
         * > This parameter is required when the StartCode parameter is set to the ID of a TTS template that contains variables.
         */
        public Builder startTtsParams(String startTtsParams) {
            this.putQueryParameter("StartTtsParams", startTtsParams);
            this.startTtsParams = startTtsParams;
            return this;
        }

        /**
         * The timeout period for the subscriber to press a key. Unit: milliseconds.
         */
        public Builder timeout(Integer timeout) {
            this.putQueryParameter("Timeout", timeout);
            this.timeout = timeout;
            return this;
        }

        @Override
        public IvrCallRequest build() {
            return new IvrCallRequest(this);
        } 

    } 

    public static class MenuKeyMap extends TeaModel {
        @NameInMap("Code")
        private String code;

        @NameInMap("Key")
        private String key;

        @NameInMap("TtsParams")
        private String ttsParams;

        private MenuKeyMap(Builder builder) {
            this.code = builder.code;
            this.key = builder.key;
            this.ttsParams = builder.ttsParams;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static MenuKeyMap create() {
            return builder().build();
        }

        /**
         * @return code
         */
        public String getCode() {
            return this.code;
        }

        /**
         * @return key
         */
        public String getKey() {
            return this.key;
        }

        /**
         * @return ttsParams
         */
        public String getTtsParams() {
            return this.ttsParams;
        }

        public static final class Builder {
            private String code; 
            private String key; 
            private String ttsParams; 

            /**
             * The voice that corresponds to the key specified by the **MenuKeyMap.N.Key** parameter.
             * <p>
             * 
             * *   If you use a voice notification file, this parameter specifies the voice ID. You can log on to the [Voice Messaging Service console](https://dyvms.console.aliyun.com/overview/home), choose **Voice Messages** > **Voice Notifications**, and then click the **Voice Notification Files** tab to view the voice ID.
             * *   If you use a TTS template, this parameter specifies the template ID. You can log on to the [Voice Messaging Service console](https://dyvms.console.aliyun.com/overview/home), choose **Voice Messages** > **Voice Notifications**, and then click the **TTS Template** tab to view the template ID.
             */
            public Builder code(String code) {
                this.code = code;
                return this;
            }

            /**
             * The key that can be pressed by the subscriber.
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * The variables in the TTS template, in the JSON format.
             * <p>
             * 
             * > 
             * 
             * *   This parameter specifies the substitution relationship of the variables in the TTS template if the value of the **MenuKeyMap.N.Code** parameter is set to the ID of the TTS template.
             * 
             * *   This parameter is required if the value of the **MenuKeyMap.N.Code** parameter is set to the ID of a TTS template that contains variables.
             */
            public Builder ttsParams(String ttsParams) {
                this.ttsParams = ttsParams;
                return this;
            }

            public MenuKeyMap build() {
                return new MenuKeyMap(this);
            } 

        } 

    }
}
