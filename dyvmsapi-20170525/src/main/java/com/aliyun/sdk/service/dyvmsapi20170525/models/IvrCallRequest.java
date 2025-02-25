// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dyvmsapi20170525.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link IvrCallRequest} extends {@link RequestModel}
 *
 * <p>IvrCallRequest</p>
 */
public class IvrCallRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ByeCode")
    private String byeCode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ByeTtsParams")
    private String byeTtsParams;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CalledNumber")
    @com.aliyun.core.annotation.Validation(required = true)
    private String calledNumber;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CalledShowNumber")
    @com.aliyun.core.annotation.Validation(required = true)
    private String calledShowNumber;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MenuKeyMap")
    private java.util.List < MenuKeyMap> menuKeyMap;

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
    @com.aliyun.core.annotation.NameInMap("StartCode")
    @com.aliyun.core.annotation.Validation(required = true)
    private String startCode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StartTtsParams")
    private String startTtsParams;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Timeout")
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
         * <p>The end voice.</p>
         * <ul>
         * <li>If you use a voice notification file, this parameter specifies the voice ID. You can log on to the <a href="https://dyvms.console.aliyun.com/overview/home">Voice Messaging Service console</a>, choose <strong>Voice Messages</strong> &gt; <strong>Voice Notifications</strong>, and then click the <strong>Voice Notification Files</strong> tab to view the voice ID.</li>
         * <li>If you use a TTS template, this parameter specifies the template ID. You can log on to the <a href="https://dyvms.console.aliyun.com/overview/home">Voice Messaging Service console</a>, choose <strong>Voice Messages</strong> &gt; <strong>Voice Notifications</strong>, and then click the <strong>TTS Template</strong> tab to view the template ID.</li>
         * </ul>
         * <blockquote>
         * <p>The value of the ByeCode parameter must be of the same type as the value of the StartCode parameter. This means that both parameters must specify voice IDs or TTS template IDs.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>TTS_1234****</p>
         */
        public Builder byeCode(String byeCode) {
            this.putQueryParameter("ByeCode", byeCode);
            this.byeCode = byeCode;
            return this;
        }

        /**
         * <p>The variables in the TTS template, in the JSON format.</p>
         * <blockquote>
         * <p>This parameter is required when the ByeCode parameter is set to the ID of a TTS template that contains variables.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>{&quot;name&quot;:&quot;xxx&quot;,&quot;code&quot;:&quot;123&quot;}</p>
         */
        public Builder byeTtsParams(String byeTtsParams) {
            this.putQueryParameter("ByeTtsParams", byeTtsParams);
            this.byeTtsParams = byeTtsParams;
            return this;
        }

        /**
         * <p>The called number.</p>
         * <p>Only phone numbers in the Chinese mainland are supported. Each request supports only one called number.</p>
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
         * <p>The calling number.</p>
         * <p>The value must be a number you purchased. Each request supports only one calling number. In most cases, a calling number is configured with the maximum number of concurrent requests. New requests fail if the maximum number of concurrent requests is reached. You can log on to the <a href="https://dyvms.console.aliyun.com/overview/home">Voice Messaging Service console</a> and choose <strong>Real Number Service &gt; Real Number Management</strong> to view the number you purchased.</p>
         * <p>This parameter is required.</p>
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
         * <p>The information about the key pressed by the subscriber.</p>
         */
        public Builder menuKeyMap(java.util.List < MenuKeyMap> menuKeyMap) {
            this.putQueryParameter("MenuKeyMap", menuKeyMap);
            this.menuKeyMap = menuKeyMap;
            return this;
        }

        /**
         * <p>The ID that is reserved for the caller of the operation. This ID is returned to the caller in a receipt message.</p>
         * <p>The value is of the STRING type and must be 1 to 15 bytes in length.</p>
         * 
         * <strong>example:</strong>
         * <p>PR0210428****</p>
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
         * <p>The number of replay times. Valid values: 1 to 3.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
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
         * <p>The voice that is played when the call begins.</p>
         * <ul>
         * <li>If you use a voice notification file, this parameter specifies the voice ID. You can log on to the <a href="https://dyvms.console.aliyun.com/overview/home">Voice Messaging Service console</a>, choose <strong>Voice Messages</strong> &gt; Voice Notifications, and then click the <strong>Voice Notification Files</strong> tab to view the voice ID.</li>
         * <li>If you use a text-to-speech (TTS) template, this parameter specifies the template ID. You can log on to the <a href="https://dyvms.console.aliyun.com/overview/home">Voice Messaging Service console</a>, choose <strong>Voice Messages</strong> &gt; <strong>Voice Notifications</strong>, and then click the <strong>TTS Template</strong> tab to view the template ID.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>TTS_1234****</p>
         */
        public Builder startCode(String startCode) {
            this.putQueryParameter("StartCode", startCode);
            this.startCode = startCode;
            return this;
        }

        /**
         * <p>The variables in the TTS template, in the JSON format.</p>
         * <blockquote>
         * <p>This parameter is required when the StartCode parameter is set to the ID of a TTS template that contains variables.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>{&quot;name&quot;:&quot;xxx&quot;,&quot;code&quot;:&quot;123&quot;}</p>
         */
        public Builder startTtsParams(String startTtsParams) {
            this.putQueryParameter("StartTtsParams", startTtsParams);
            this.startTtsParams = startTtsParams;
            return this;
        }

        /**
         * <p>The timeout period for the subscriber to press a key. Unit: milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>3000</p>
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

    /**
     * 
     * {@link IvrCallRequest} extends {@link TeaModel}
     *
     * <p>IvrCallRequest</p>
     */
    public static class MenuKeyMap extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Code")
        private String code;

        @com.aliyun.core.annotation.NameInMap("Key")
        private String key;

        @com.aliyun.core.annotation.NameInMap("TtsParams")
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
             * <p>The voice that corresponds to the key specified by the <strong>MenuKeyMap.N.Key</strong> parameter.</p>
             * <ul>
             * <li>If you use a voice notification file, this parameter specifies the voice ID. You can log on to the <a href="https://dyvms.console.aliyun.com/overview/home">Voice Messaging Service console</a>, choose <strong>Voice Messages</strong> &gt; <strong>Voice Notifications</strong>, and then click the <strong>Voice Notification Files</strong> tab to view the voice ID.</li>
             * <li>If you use a TTS template, this parameter specifies the template ID. You can log on to the <a href="https://dyvms.console.aliyun.com/overview/home">Voice Messaging Service console</a>, choose <strong>Voice Messages</strong> &gt; <strong>Voice Notifications</strong>, and then click the <strong>TTS Template</strong> tab to view the template ID.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>TTS_1235****</p>
             */
            public Builder code(String code) {
                this.code = code;
                return this;
            }

            /**
             * <p>The key that can be pressed by the subscriber.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>The variables in the TTS template, in the JSON format.</p>
             * <blockquote>
             * </blockquote>
             * <ul>
             * <li><p>This parameter specifies the substitution relationship of the variables in the TTS template if the value of the <strong>MenuKeyMap.N.Code</strong> parameter is set to the ID of the TTS template.</p>
             * </li>
             * <li><p>This parameter is required if the value of the <strong>MenuKeyMap.N.Code</strong> parameter is set to the ID of a TTS template that contains variables.</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>{&quot;name&quot;:&quot;xxx&quot;,&quot;code&quot;:&quot;123&quot;}</p>
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
