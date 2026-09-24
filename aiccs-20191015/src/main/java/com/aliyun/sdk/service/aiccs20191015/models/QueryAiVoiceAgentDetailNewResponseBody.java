// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aiccs20191015.models;

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
 * {@link QueryAiVoiceAgentDetailNewResponseBody} extends {@link TeaModel}
 *
 * <p>QueryAiVoiceAgentDetailNewResponseBody</p>
 */
public class QueryAiVoiceAgentDetailNewResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AccessDeniedDetail")
    private String accessDeniedDetail;

    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private QueryAiVoiceAgentDetailNewResponseBody(Builder builder) {
        this.accessDeniedDetail = builder.accessDeniedDetail;
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryAiVoiceAgentDetailNewResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return accessDeniedDetail
     */
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String accessDeniedDetail; 
        private String code; 
        private Data data; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(QueryAiVoiceAgentDetailNewResponseBody model) {
            this.accessDeniedDetail = model.accessDeniedDetail;
            this.code = model.code;
            this.data = model.data;
            this.message = model.message;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * <p>The detailed reason why access was denied.</p>
         * 
         * <strong>example:</strong>
         * <p>None</p>
         */
        public Builder accessDeniedDetail(String accessDeniedDetail) {
            this.accessDeniedDetail = accessDeniedDetail;
            return this;
        }

        /**
         * <p>The status code.</p>
         * 
         * <strong>example:</strong>
         * <p>OK</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The agent details.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The status code description.</p>
         * 
         * <strong>example:</strong>
         * <p>Success</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>742C9243-2870-B8D6-0C68-C12345AABBCC0</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the call was successful. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: Successful.</li>
         * <li><strong>false</strong>: Failed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public QueryAiVoiceAgentDetailNewResponseBody build() {
            return new QueryAiVoiceAgentDetailNewResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link QueryAiVoiceAgentDetailNewResponseBody} extends {@link TeaModel}
     *
     * <p>QueryAiVoiceAgentDetailNewResponseBody</p>
     */
    public static class EventConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CallAssistantHangup")
        private Boolean callAssistantHangup;

        @com.aliyun.core.annotation.NameInMap("CallAssistantRecognize")
        private Boolean callAssistantRecognize;

        @com.aliyun.core.annotation.NameInMap("MuteActive")
        private Boolean muteActive;

        @com.aliyun.core.annotation.NameInMap("MuteDuration")
        private Long muteDuration;

        @com.aliyun.core.annotation.NameInMap("MuteHangupNum")
        private Long muteHangupNum;

        @com.aliyun.core.annotation.NameInMap("SessionTimeout")
        private Long sessionTimeout;

        private EventConfig(Builder builder) {
            this.callAssistantHangup = builder.callAssistantHangup;
            this.callAssistantRecognize = builder.callAssistantRecognize;
            this.muteActive = builder.muteActive;
            this.muteDuration = builder.muteDuration;
            this.muteHangupNum = builder.muteHangupNum;
            this.sessionTimeout = builder.sessionTimeout;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static EventConfig create() {
            return builder().build();
        }

        /**
         * @return callAssistantHangup
         */
        public Boolean getCallAssistantHangup() {
            return this.callAssistantHangup;
        }

        /**
         * @return callAssistantRecognize
         */
        public Boolean getCallAssistantRecognize() {
            return this.callAssistantRecognize;
        }

        /**
         * @return muteActive
         */
        public Boolean getMuteActive() {
            return this.muteActive;
        }

        /**
         * @return muteDuration
         */
        public Long getMuteDuration() {
            return this.muteDuration;
        }

        /**
         * @return muteHangupNum
         */
        public Long getMuteHangupNum() {
            return this.muteHangupNum;
        }

        /**
         * @return sessionTimeout
         */
        public Long getSessionTimeout() {
            return this.sessionTimeout;
        }

        public static final class Builder {
            private Boolean callAssistantHangup; 
            private Boolean callAssistantRecognize; 
            private Boolean muteActive; 
            private Long muteDuration; 
            private Long muteHangupNum; 
            private Long sessionTimeout; 

            private Builder() {
            } 

            private Builder(EventConfig model) {
                this.callAssistantHangup = model.callAssistantHangup;
                this.callAssistantRecognize = model.callAssistantRecognize;
                this.muteActive = model.muteActive;
                this.muteDuration = model.muteDuration;
                this.muteHangupNum = model.muteHangupNum;
                this.sessionTimeout = model.sessionTimeout;
            } 

            /**
             * <p>Specifies whether to hang up when intelligent answering is detected.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder callAssistantHangup(Boolean callAssistantHangup) {
                this.callAssistantHangup = callAssistantHangup;
                return this;
            }

            /**
             * <p>Specifies whether intelligent answering recognition is enabled.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder callAssistantRecognize(Boolean callAssistantRecognize) {
                this.callAssistantRecognize = callAssistantRecognize;
                return this;
            }

            /**
             * <p>Specifies whether the first silence event triggers the model.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder muteActive(Boolean muteActive) {
                this.muteActive = muteActive;
                return this;
            }

            /**
             * <p>The silence duration in seconds. Minimum: 3s. Maximum: 15s.</p>
             * 
             * <strong>example:</strong>
             * <p>5</p>
             */
            public Builder muteDuration(Long muteDuration) {
                this.muteDuration = muteDuration;
                return this;
            }

            /**
             * <p>The number of consecutive silence events before the call is automatically hung up. Minimum: 1. Maximum: 5.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder muteHangupNum(Long muteHangupNum) {
                this.muteHangupNum = muteHangupNum;
                return this;
            }

            /**
             * <p>The maximum call duration in seconds. Minimum: 600s. Maximum: 3600s. The call is automatically hung up after the timeout.</p>
             * 
             * <strong>example:</strong>
             * <p>1000</p>
             */
            public Builder sessionTimeout(Long sessionTimeout) {
                this.sessionTimeout = sessionTimeout;
                return this;
            }

            public EventConfig build() {
                return new EventConfig(this);
            } 

        } 

    }
    /**
     * 
     * {@link QueryAiVoiceAgentDetailNewResponseBody} extends {@link TeaModel}
     *
     * <p>QueryAiVoiceAgentDetailNewResponseBody</p>
     */
    public static class TransferConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CalledNumber")
        private String calledNumber;

        @com.aliyun.core.annotation.NameInMap("CallerNumber")
        private String callerNumber;

        @com.aliyun.core.annotation.NameInMap("CallerNumberType")
        private Long callerNumberType;

        @com.aliyun.core.annotation.NameInMap("CallingNumber")
        private String callingNumber;

        @com.aliyun.core.annotation.NameInMap("CallingNumberType")
        private Long callingNumberType;

        @com.aliyun.core.annotation.NameInMap("CustomerRouteCode")
        private String customerRouteCode;

        @com.aliyun.core.annotation.NameInMap("Enabled")
        private Boolean enabled;

        @com.aliyun.core.annotation.NameInMap("ExtraInfo")
        private String extraInfo;

        @com.aliyun.core.annotation.NameInMap("FailureContent")
        private String failureContent;

        @com.aliyun.core.annotation.NameInMap("SeatRouteCode")
        private String seatRouteCode;

        @com.aliyun.core.annotation.NameInMap("SeatRouteName")
        private String seatRouteName;

        @com.aliyun.core.annotation.NameInMap("TransferBizId")
        private String transferBizId;

        @com.aliyun.core.annotation.NameInMap("TransferContent")
        private String transferContent;

        @com.aliyun.core.annotation.NameInMap("TransferType")
        private Long transferType;

        private TransferConfig(Builder builder) {
            this.calledNumber = builder.calledNumber;
            this.callerNumber = builder.callerNumber;
            this.callerNumberType = builder.callerNumberType;
            this.callingNumber = builder.callingNumber;
            this.callingNumberType = builder.callingNumberType;
            this.customerRouteCode = builder.customerRouteCode;
            this.enabled = builder.enabled;
            this.extraInfo = builder.extraInfo;
            this.failureContent = builder.failureContent;
            this.seatRouteCode = builder.seatRouteCode;
            this.seatRouteName = builder.seatRouteName;
            this.transferBizId = builder.transferBizId;
            this.transferContent = builder.transferContent;
            this.transferType = builder.transferType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TransferConfig create() {
            return builder().build();
        }

        /**
         * @return calledNumber
         */
        public String getCalledNumber() {
            return this.calledNumber;
        }

        /**
         * @return callerNumber
         */
        public String getCallerNumber() {
            return this.callerNumber;
        }

        /**
         * @return callerNumberType
         */
        public Long getCallerNumberType() {
            return this.callerNumberType;
        }

        /**
         * @return callingNumber
         */
        public String getCallingNumber() {
            return this.callingNumber;
        }

        /**
         * @return callingNumberType
         */
        public Long getCallingNumberType() {
            return this.callingNumberType;
        }

        /**
         * @return customerRouteCode
         */
        public String getCustomerRouteCode() {
            return this.customerRouteCode;
        }

        /**
         * @return enabled
         */
        public Boolean getEnabled() {
            return this.enabled;
        }

        /**
         * @return extraInfo
         */
        public String getExtraInfo() {
            return this.extraInfo;
        }

        /**
         * @return failureContent
         */
        public String getFailureContent() {
            return this.failureContent;
        }

        /**
         * @return seatRouteCode
         */
        public String getSeatRouteCode() {
            return this.seatRouteCode;
        }

        /**
         * @return seatRouteName
         */
        public String getSeatRouteName() {
            return this.seatRouteName;
        }

        /**
         * @return transferBizId
         */
        public String getTransferBizId() {
            return this.transferBizId;
        }

        /**
         * @return transferContent
         */
        public String getTransferContent() {
            return this.transferContent;
        }

        /**
         * @return transferType
         */
        public Long getTransferType() {
            return this.transferType;
        }

        public static final class Builder {
            private String calledNumber; 
            private String callerNumber; 
            private Long callerNumberType; 
            private String callingNumber; 
            private Long callingNumberType; 
            private String customerRouteCode; 
            private Boolean enabled; 
            private String extraInfo; 
            private String failureContent; 
            private String seatRouteCode; 
            private String seatRouteName; 
            private String transferBizId; 
            private String transferContent; 
            private Long transferType; 

            private Builder() {
            } 

            private Builder(TransferConfig model) {
                this.calledNumber = model.calledNumber;
                this.callerNumber = model.callerNumber;
                this.callerNumberType = model.callerNumberType;
                this.callingNumber = model.callingNumber;
                this.callingNumberType = model.callingNumberType;
                this.customerRouteCode = model.customerRouteCode;
                this.enabled = model.enabled;
                this.extraInfo = model.extraInfo;
                this.failureContent = model.failureContent;
                this.seatRouteCode = model.seatRouteCode;
                this.seatRouteName = model.seatRouteName;
                this.transferBizId = model.transferBizId;
                this.transferContent = model.transferContent;
                this.transferType = model.transferType;
            } 

            /**
             * <p>The called number.</p>
             * 
             * <strong>example:</strong>
             * <p>123111122222</p>
             */
            public Builder calledNumber(String calledNumber) {
                this.calledNumber = calledNumber;
                return this;
            }

            /**
             * <p>The caller number.</p>
             * 
             * <strong>example:</strong>
             * <p>123111122222</p>
             */
            public Builder callerNumber(String callerNumber) {
                this.callerNumber = callerNumber;
                return this;
            }

            /**
             * <p>The caller number type.</p>
             * 
             * <strong>example:</strong>
             * <p>48</p>
             */
            public Builder callerNumberType(Long callerNumberType) {
                this.callerNumberType = callerNumberType;
                return this;
            }

            /**
             * <p>The answering party number, such as a user mobile number, customer service agent number, or robot number.</p>
             * 
             * <strong>example:</strong>
             * <p>123111122222</p>
             */
            public Builder callingNumber(String callingNumber) {
                this.callingNumber = callingNumber;
                return this;
            }

            /**
             * <p>The called number type.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder callingNumberType(Long callingNumberType) {
                this.callingNumberType = callingNumberType;
                return this;
            }

            /**
             * <p>The customer line code.</p>
             * 
             * <strong>example:</strong>
             * <p>123</p>
             */
            public Builder customerRouteCode(String customerRouteCode) {
                this.customerRouteCode = customerRouteCode;
                return this;
            }

            /**
             * <p>Specifies whether the feature is enabled.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder enabled(Boolean enabled) {
                this.enabled = enabled;
                return this;
            }

            /**
             * <p>The supplementary information.</p>
             * 
             * <strong>example:</strong>
             * <p>Additional information for the agent</p>
             */
            public Builder extraInfo(String extraInfo) {
                this.extraInfo = extraInfo;
                return this;
            }

            /**
             * <p>The prompt displayed when the transfer to a human agent fails.</p>
             * 
             * <strong>example:</strong>
             * <p>Failure description</p>
             */
            public Builder failureContent(String failureContent) {
                this.failureContent = failureContent;
                return this;
            }

            /**
             * <p>The agent line code.</p>
             * 
             * <strong>example:</strong>
             * <p>SEAT_CTI_A_NET</p>
             */
            public Builder seatRouteCode(String seatRouteCode) {
                this.seatRouteCode = seatRouteCode;
                return this;
            }

            /**
             * <p>The agent line name.</p>
             * 
             * <strong>example:</strong>
             * <p>Human agent</p>
             */
            public Builder seatRouteName(String seatRouteName) {
                this.seatRouteName = seatRouteName;
                return this;
            }

            /**
             * <p>The business ID.</p>
             * 
             * <strong>example:</strong>
             * <p>123</p>
             */
            public Builder transferBizId(String transferBizId) {
                this.transferBizId = transferBizId;
                return this;
            }

            /**
             * <p>The prompt displayed when the call is transferred to a human agent.</p>
             * 
             * <strong>example:</strong>
             * <p>Prompt message</p>
             */
            public Builder transferContent(String transferContent) {
                this.transferContent = transferContent;
                return this;
            }

            /**
             * <p>The transfer-to-agent type.</p>
             * 
             * <strong>example:</strong>
             * <p>73</p>
             */
            public Builder transferType(Long transferType) {
                this.transferType = transferType;
                return this;
            }

            public TransferConfig build() {
                return new TransferConfig(this);
            } 

        } 

    }
    /**
     * 
     * {@link QueryAiVoiceAgentDetailNewResponseBody} extends {@link TeaModel}
     *
     * <p>QueryAiVoiceAgentDetailNewResponseBody</p>
     */
    public static class TtsConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BackgroundEnabled")
        private Boolean backgroundEnabled;

        @com.aliyun.core.annotation.NameInMap("BackgroundSound")
        private Long backgroundSound;

        @com.aliyun.core.annotation.NameInMap("BackgroundVolume")
        private Long backgroundVolume;

        @com.aliyun.core.annotation.NameInMap("CustomerAccountId")
        private Long customerAccountId;

        @com.aliyun.core.annotation.NameInMap("MixingEnabled")
        private Boolean mixingEnabled;

        @com.aliyun.core.annotation.NameInMap("MixingTemplate")
        private Long mixingTemplate;

        @com.aliyun.core.annotation.NameInMap("ResourceId")
        private String resourceId;

        @com.aliyun.core.annotation.NameInMap("TtsSpeed")
        private Long ttsSpeed;

        @com.aliyun.core.annotation.NameInMap("TtsStyle")
        private String ttsStyle;

        @com.aliyun.core.annotation.NameInMap("TtsVolume")
        private Long ttsVolume;

        @com.aliyun.core.annotation.NameInMap("VoiceCode")
        private String voiceCode;

        @com.aliyun.core.annotation.NameInMap("VoiceType")
        private Boolean voiceType;

        private TtsConfig(Builder builder) {
            this.backgroundEnabled = builder.backgroundEnabled;
            this.backgroundSound = builder.backgroundSound;
            this.backgroundVolume = builder.backgroundVolume;
            this.customerAccountId = builder.customerAccountId;
            this.mixingEnabled = builder.mixingEnabled;
            this.mixingTemplate = builder.mixingTemplate;
            this.resourceId = builder.resourceId;
            this.ttsSpeed = builder.ttsSpeed;
            this.ttsStyle = builder.ttsStyle;
            this.ttsVolume = builder.ttsVolume;
            this.voiceCode = builder.voiceCode;
            this.voiceType = builder.voiceType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TtsConfig create() {
            return builder().build();
        }

        /**
         * @return backgroundEnabled
         */
        public Boolean getBackgroundEnabled() {
            return this.backgroundEnabled;
        }

        /**
         * @return backgroundSound
         */
        public Long getBackgroundSound() {
            return this.backgroundSound;
        }

        /**
         * @return backgroundVolume
         */
        public Long getBackgroundVolume() {
            return this.backgroundVolume;
        }

        /**
         * @return customerAccountId
         */
        public Long getCustomerAccountId() {
            return this.customerAccountId;
        }

        /**
         * @return mixingEnabled
         */
        public Boolean getMixingEnabled() {
            return this.mixingEnabled;
        }

        /**
         * @return mixingTemplate
         */
        public Long getMixingTemplate() {
            return this.mixingTemplate;
        }

        /**
         * @return resourceId
         */
        public String getResourceId() {
            return this.resourceId;
        }

        /**
         * @return ttsSpeed
         */
        public Long getTtsSpeed() {
            return this.ttsSpeed;
        }

        /**
         * @return ttsStyle
         */
        public String getTtsStyle() {
            return this.ttsStyle;
        }

        /**
         * @return ttsVolume
         */
        public Long getTtsVolume() {
            return this.ttsVolume;
        }

        /**
         * @return voiceCode
         */
        public String getVoiceCode() {
            return this.voiceCode;
        }

        /**
         * @return voiceType
         */
        public Boolean getVoiceType() {
            return this.voiceType;
        }

        public static final class Builder {
            private Boolean backgroundEnabled; 
            private Long backgroundSound; 
            private Long backgroundVolume; 
            private Long customerAccountId; 
            private Boolean mixingEnabled; 
            private Long mixingTemplate; 
            private String resourceId; 
            private Long ttsSpeed; 
            private String ttsStyle; 
            private Long ttsVolume; 
            private String voiceCode; 
            private Boolean voiceType; 

            private Builder() {
            } 

            private Builder(TtsConfig model) {
                this.backgroundEnabled = model.backgroundEnabled;
                this.backgroundSound = model.backgroundSound;
                this.backgroundVolume = model.backgroundVolume;
                this.customerAccountId = model.customerAccountId;
                this.mixingEnabled = model.mixingEnabled;
                this.mixingTemplate = model.mixingTemplate;
                this.resourceId = model.resourceId;
                this.ttsSpeed = model.ttsSpeed;
                this.ttsStyle = model.ttsStyle;
                this.ttsVolume = model.ttsVolume;
                this.voiceCode = model.voiceCode;
                this.voiceType = model.voiceType;
            } 

            /**
             * <p>Specifies whether background sound is enabled.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder backgroundEnabled(Boolean backgroundEnabled) {
                this.backgroundEnabled = backgroundEnabled;
                return this;
            }

            /**
             * <p>The background sound ID.</p>
             * 
             * <strong>example:</strong>
             * <p>17</p>
             */
            public Builder backgroundSound(Long backgroundSound) {
                this.backgroundSound = backgroundSound;
                return this;
            }

            /**
             * <p>The background sound volume. Valid values: 0: low. 1: medium. 2: high.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder backgroundVolume(Long backgroundVolume) {
                this.backgroundVolume = backgroundVolume;
                return this;
            }

            /**
             * <p>The third-party voice platform account.</p>
             * 
             * <strong>example:</strong>
             * <p>75</p>
             */
            public Builder customerAccountId(Long customerAccountId) {
                this.customerAccountId = customerAccountId;
                return this;
            }

            /**
             * <p>Specifies whether audio mixing is enabled.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder mixingEnabled(Boolean mixingEnabled) {
                this.mixingEnabled = mixingEnabled;
                return this;
            }

            /**
             * <p>The audio mixing template ID.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder mixingTemplate(Long mixingTemplate) {
                this.mixingTemplate = mixingTemplate;
                return this;
            }

            /**
             * <p>The resource ID. This parameter is required only for third-party voices.</p>
             * 
             * <strong>example:</strong>
             * <p>voice-12345</p>
             */
            public Builder resourceId(String resourceId) {
                this.resourceId = resourceId;
                return this;
            }

            /**
             * <p>The voice speed for TTS playback. Valid values: -200 to 200. Default value: 0.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder ttsSpeed(Long ttsSpeed) {
                this.ttsSpeed = ttsSpeed;
                return this;
            }

            /**
             * <p>The voice style.</p>
             * 
             * <strong>example:</strong>
             * <p>longxiaoxia_v2p1</p>
             */
            public Builder ttsStyle(String ttsStyle) {
                this.ttsStyle = ttsStyle;
                return this;
            }

            /**
             * <p>The volume for TTS playback. Valid values: 0 to 100.</p>
             * 
             * <strong>example:</strong>
             * <p>88</p>
             */
            public Builder ttsVolume(Long ttsVolume) {
                this.ttsVolume = ttsVolume;
                return this;
            }

            /**
             * <p>The voice code.</p>
             * 
             * <strong>example:</strong>
             * <p>V123ABC00</p>
             */
            public Builder voiceCode(String voiceCode) {
                this.voiceCode = voiceCode;
                return this;
            }

            /**
             * <p>The TTS voice type. Valid values:</p>
             * <p><code>VOICE_TYPE_SYSTEM</code>: system voice.</p>
             * <p><code>VOICE_TYPE_CLONE</code>: cloned voice.</p>
             * <p><code>VOICE_TYPE_DOUBAO</code>: Doubao voice.</p>
             * <p><code>VOICE_TYPE_MINIMAX</code>: Minimax voice.</p>
             * <p><code>VOICE_TYPE_OPENTTS</code>: open voice.</p>
             * <p><code>VOICE_TYPE_BL_CUSTOM</code>: custom premium cloned voice.</p>
             * 
             * <strong>example:</strong>
             * <p>VOICE_TYPE_SYSTEM</p>
             */
            public Builder voiceType(Boolean voiceType) {
                this.voiceType = voiceType;
                return this;
            }

            public TtsConfig build() {
                return new TtsConfig(this);
            } 

        } 

    }
    /**
     * 
     * {@link QueryAiVoiceAgentDetailNewResponseBody} extends {@link TeaModel}
     *
     * <p>QueryAiVoiceAgentDetailNewResponseBody</p>
     */
    public static class AgentCallConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("EventConfig")
        private EventConfig eventConfig;

        @com.aliyun.core.annotation.NameInMap("Prologue")
        private String prologue;

        @com.aliyun.core.annotation.NameInMap("RecordingFile")
        private String recordingFile;

        @com.aliyun.core.annotation.NameInMap("StartWordType")
        private Long startWordType;

        @com.aliyun.core.annotation.NameInMap("TransferConfig")
        private TransferConfig transferConfig;

        @com.aliyun.core.annotation.NameInMap("TtsConfig")
        private TtsConfig ttsConfig;

        @com.aliyun.core.annotation.NameInMap("VocabId")
        private String vocabId;

        private AgentCallConfig(Builder builder) {
            this.eventConfig = builder.eventConfig;
            this.prologue = builder.prologue;
            this.recordingFile = builder.recordingFile;
            this.startWordType = builder.startWordType;
            this.transferConfig = builder.transferConfig;
            this.ttsConfig = builder.ttsConfig;
            this.vocabId = builder.vocabId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AgentCallConfig create() {
            return builder().build();
        }

        /**
         * @return eventConfig
         */
        public EventConfig getEventConfig() {
            return this.eventConfig;
        }

        /**
         * @return prologue
         */
        public String getPrologue() {
            return this.prologue;
        }

        /**
         * @return recordingFile
         */
        public String getRecordingFile() {
            return this.recordingFile;
        }

        /**
         * @return startWordType
         */
        public Long getStartWordType() {
            return this.startWordType;
        }

        /**
         * @return transferConfig
         */
        public TransferConfig getTransferConfig() {
            return this.transferConfig;
        }

        /**
         * @return ttsConfig
         */
        public TtsConfig getTtsConfig() {
            return this.ttsConfig;
        }

        /**
         * @return vocabId
         */
        public String getVocabId() {
            return this.vocabId;
        }

        public static final class Builder {
            private EventConfig eventConfig; 
            private String prologue; 
            private String recordingFile; 
            private Long startWordType; 
            private TransferConfig transferConfig; 
            private TtsConfig ttsConfig; 
            private String vocabId; 

            private Builder() {
            } 

            private Builder(AgentCallConfig model) {
                this.eventConfig = model.eventConfig;
                this.prologue = model.prologue;
                this.recordingFile = model.recordingFile;
                this.startWordType = model.startWordType;
                this.transferConfig = model.transferConfig;
                this.ttsConfig = model.ttsConfig;
                this.vocabId = model.vocabId;
            } 

            /**
             * <p>The event configuration.</p>
             */
            public Builder eventConfig(EventConfig eventConfig) {
                this.eventConfig = eventConfig;
                return this;
            }

            /**
             * <p>The opening statement.</p>
             * 
             * <strong>example:</strong>
             * <p>Hello, this is ******</p>
             */
            public Builder prologue(String prologue) {
                this.prologue = prologue;
                return this;
            }

            /**
             * <p>The URL of the opening statement recording audio file. This parameter has a value only when StartWordType is set to 1.</p>
             * 
             * <strong>example:</strong>
             * <p>/oss-file-key</p>
             */
            public Builder recordingFile(String recordingFile) {
                this.recordingFile = recordingFile;
                return this;
            }

            /**
             * <p>The opening statement type. 0: text. 1: recording.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder startWordType(Long startWordType) {
                this.startWordType = startWordType;
                return this;
            }

            /**
             * <p>The transfer-to-agent configuration.</p>
             */
            public Builder transferConfig(TransferConfig transferConfig) {
                this.transferConfig = transferConfig;
                return this;
            }

            /**
             * <p>The TTS configuration.</p>
             */
            public Builder ttsConfig(TtsConfig ttsConfig) {
                this.ttsConfig = ttsConfig;
                return this;
            }

            /**
             * <p>The hot word library ID.</p>
             * 
             * <strong>example:</strong>
             * <p>afb2c43**********83e6df30551c11f7</p>
             */
            public Builder vocabId(String vocabId) {
                this.vocabId = vocabId;
                return this;
            }

            public AgentCallConfig build() {
                return new AgentCallConfig(this);
            } 

        } 

    }
    /**
     * 
     * {@link QueryAiVoiceAgentDetailNewResponseBody} extends {@link TeaModel}
     *
     * <p>QueryAiVoiceAgentDetailNewResponseBody</p>
     */
    public static class AgentDemandConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AiGenerate")
        private Boolean aiGenerate;

        @com.aliyun.core.annotation.NameInMap("BasicTaskDescription")
        private String basicTaskDescription;

        @com.aliyun.core.annotation.NameInMap("BusinessType")
        private Long businessType;

        @com.aliyun.core.annotation.NameInMap("CoreTarget")
        private String coreTarget;

        @com.aliyun.core.annotation.NameInMap("SysRole")
        private String sysRole;

        @com.aliyun.core.annotation.NameInMap("UserRole")
        private String userRole;

        private AgentDemandConfig(Builder builder) {
            this.aiGenerate = builder.aiGenerate;
            this.basicTaskDescription = builder.basicTaskDescription;
            this.businessType = builder.businessType;
            this.coreTarget = builder.coreTarget;
            this.sysRole = builder.sysRole;
            this.userRole = builder.userRole;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AgentDemandConfig create() {
            return builder().build();
        }

        /**
         * @return aiGenerate
         */
        public Boolean getAiGenerate() {
            return this.aiGenerate;
        }

        /**
         * @return basicTaskDescription
         */
        public String getBasicTaskDescription() {
            return this.basicTaskDescription;
        }

        /**
         * @return businessType
         */
        public Long getBusinessType() {
            return this.businessType;
        }

        /**
         * @return coreTarget
         */
        public String getCoreTarget() {
            return this.coreTarget;
        }

        /**
         * @return sysRole
         */
        public String getSysRole() {
            return this.sysRole;
        }

        /**
         * @return userRole
         */
        public String getUserRole() {
            return this.userRole;
        }

        public static final class Builder {
            private Boolean aiGenerate; 
            private String basicTaskDescription; 
            private Long businessType; 
            private String coreTarget; 
            private String sysRole; 
            private String userRole; 

            private Builder() {
            } 

            private Builder(AgentDemandConfig model) {
                this.aiGenerate = model.aiGenerate;
                this.basicTaskDescription = model.basicTaskDescription;
                this.businessType = model.businessType;
                this.coreTarget = model.coreTarget;
                this.sysRole = model.sysRole;
                this.userRole = model.userRole;
            } 

            /**
             * <p>Specifies whether AI-assisted building is enabled.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder aiGenerate(Boolean aiGenerate) {
                this.aiGenerate = aiGenerate;
                return this;
            }

            /**
             * <p>The basic task configuration.</p>
             * 
             * <strong>example:</strong>
             * <p>Conduct product marketing and introduce advantages and features</p>
             */
            public Builder basicTaskDescription(String basicTaskDescription) {
                this.basicTaskDescription = basicTaskDescription;
                return this;
            }

            /**
             * <p>The business scenario.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder businessType(Long businessType) {
                this.businessType = businessType;
                return this;
            }

            /**
             * <p>The core objective.</p>
             * 
             * <strong>example:</strong>
             * <p>Sales lead conversion</p>
             */
            public Builder coreTarget(String coreTarget) {
                this.coreTarget = coreTarget;
                return this;
            }

            /**
             * <p>The system role.</p>
             * 
             * <strong>example:</strong>
             * <p>Sales</p>
             */
            public Builder sysRole(String sysRole) {
                this.sysRole = sysRole;
                return this;
            }

            /**
             * <p>The user role.</p>
             * 
             * <strong>example:</strong>
             * <p>Potential customer</p>
             */
            public Builder userRole(String userRole) {
                this.userRole = userRole;
                return this;
            }

            public AgentDemandConfig build() {
                return new AgentDemandConfig(this);
            } 

        } 

    }
    /**
     * 
     * {@link QueryAiVoiceAgentDetailNewResponseBody} extends {@link TeaModel}
     *
     * <p>QueryAiVoiceAgentDetailNewResponseBody</p>
     */
    public static class KnowledgeIds extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("KnowledgeId")
        private Long knowledgeId;

        @com.aliyun.core.annotation.NameInMap("KnowledgeName")
        private String knowledgeName;

        private KnowledgeIds(Builder builder) {
            this.knowledgeId = builder.knowledgeId;
            this.knowledgeName = builder.knowledgeName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static KnowledgeIds create() {
            return builder().build();
        }

        /**
         * @return knowledgeId
         */
        public Long getKnowledgeId() {
            return this.knowledgeId;
        }

        /**
         * @return knowledgeName
         */
        public String getKnowledgeName() {
            return this.knowledgeName;
        }

        public static final class Builder {
            private Long knowledgeId; 
            private String knowledgeName; 

            private Builder() {
            } 

            private Builder(KnowledgeIds model) {
                this.knowledgeId = model.knowledgeId;
                this.knowledgeName = model.knowledgeName;
            } 

            /**
             * <p>The knowledge base ID.</p>
             * 
             * <strong>example:</strong>
             * <p>68</p>
             */
            public Builder knowledgeId(Long knowledgeId) {
                this.knowledgeId = knowledgeId;
                return this;
            }

            /**
             * <p>The knowledge base name.</p>
             * 
             * <strong>example:</strong>
             * <p>Product knowledge base</p>
             */
            public Builder knowledgeName(String knowledgeName) {
                this.knowledgeName = knowledgeName;
                return this;
            }

            public KnowledgeIds build() {
                return new KnowledgeIds(this);
            } 

        } 

    }
    /**
     * 
     * {@link QueryAiVoiceAgentDetailNewResponseBody} extends {@link TeaModel}
     *
     * <p>QueryAiVoiceAgentDetailNewResponseBody</p>
     */
    public static class RagConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("Enabled")
        private Boolean enabled;

        private RagConfig(Builder builder) {
            this.description = builder.description;
            this.enabled = builder.enabled;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RagConfig create() {
            return builder().build();
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return enabled
         */
        public Boolean getEnabled() {
            return this.enabled;
        }

        public static final class Builder {
            private String description; 
            private Boolean enabled; 

            private Builder() {
            } 

            private Builder(RagConfig model) {
                this.description = model.description;
                this.enabled = model.enabled;
            } 

            /**
             * <p>The RAG retrieval description.</p>
             * 
             * <strong>example:</strong>
             * <p>Knowledge base retrieval</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>Indicates whether RAG retrieval is enabled.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder enabled(Boolean enabled) {
                this.enabled = enabled;
                return this;
            }

            public RagConfig build() {
                return new RagConfig(this);
            } 

        } 

    }
    /**
     * 
     * {@link QueryAiVoiceAgentDetailNewResponseBody} extends {@link TeaModel}
     *
     * <p>QueryAiVoiceAgentDetailNewResponseBody</p>
     */
    public static class KnowledgeConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("KnowledgeIds")
        private java.util.List<KnowledgeIds> knowledgeIds;

        @com.aliyun.core.annotation.NameInMap("RagConfig")
        private RagConfig ragConfig;

        private KnowledgeConfig(Builder builder) {
            this.knowledgeIds = builder.knowledgeIds;
            this.ragConfig = builder.ragConfig;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static KnowledgeConfig create() {
            return builder().build();
        }

        /**
         * @return knowledgeIds
         */
        public java.util.List<KnowledgeIds> getKnowledgeIds() {
            return this.knowledgeIds;
        }

        /**
         * @return ragConfig
         */
        public RagConfig getRagConfig() {
            return this.ragConfig;
        }

        public static final class Builder {
            private java.util.List<KnowledgeIds> knowledgeIds; 
            private RagConfig ragConfig; 

            private Builder() {
            } 

            private Builder(KnowledgeConfig model) {
                this.knowledgeIds = model.knowledgeIds;
                this.ragConfig = model.ragConfig;
            } 

            /**
             * <p>The collection of knowledge bases.</p>
             */
            public Builder knowledgeIds(java.util.List<KnowledgeIds> knowledgeIds) {
                this.knowledgeIds = knowledgeIds;
                return this;
            }

            /**
             * <p>The RAG configuration.</p>
             */
            public Builder ragConfig(RagConfig ragConfig) {
                this.ragConfig = ragConfig;
                return this;
            }

            public KnowledgeConfig build() {
                return new KnowledgeConfig(this);
            } 

        } 

    }
    /**
     * 
     * {@link QueryAiVoiceAgentDetailNewResponseBody} extends {@link TeaModel}
     *
     * <p>QueryAiVoiceAgentDetailNewResponseBody</p>
     */
    public static class PhoneTagEnum extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("Id")
        private String id;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private PhoneTagEnum(Builder builder) {
            this.description = builder.description;
            this.id = builder.id;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PhoneTagEnum create() {
            return builder().build();
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String description; 
            private String id; 
            private String value; 

            private Builder() {
            } 

            private Builder(PhoneTagEnum model) {
                this.description = model.description;
                this.id = model.id;
                this.value = model.value;
            } 

            /**
             * <p>The description.</p>
             * 
             * <strong>example:</strong>
             * <p>gender</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The label ID.</p>
             * 
             * <strong>example:</strong>
             * <p>123</p>
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * <p>The label value.</p>
             * 
             * <strong>example:</strong>
             * <p>male</p>
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public PhoneTagEnum build() {
                return new PhoneTagEnum(this);
            } 

        } 

    }
    /**
     * 
     * {@link QueryAiVoiceAgentDetailNewResponseBody} extends {@link TeaModel}
     *
     * <p>QueryAiVoiceAgentDetailNewResponseBody</p>
     */
    public static class PhoneTagConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Id")
        private String id;

        @com.aliyun.core.annotation.NameInMap("PhoneTagEnum")
        private java.util.List<PhoneTagEnum> phoneTagEnum;

        @com.aliyun.core.annotation.NameInMap("PhoneTagKey")
        private String phoneTagKey;

        @com.aliyun.core.annotation.NameInMap("PhoneTagName")
        private String phoneTagName;

        @com.aliyun.core.annotation.NameInMap("PhoneTagRequired")
        private Boolean phoneTagRequired;

        @com.aliyun.core.annotation.NameInMap("PhoneTagSource")
        private String phoneTagSource;

        @com.aliyun.core.annotation.NameInMap("PhoneTagType")
        private String phoneTagType;

        private PhoneTagConfig(Builder builder) {
            this.id = builder.id;
            this.phoneTagEnum = builder.phoneTagEnum;
            this.phoneTagKey = builder.phoneTagKey;
            this.phoneTagName = builder.phoneTagName;
            this.phoneTagRequired = builder.phoneTagRequired;
            this.phoneTagSource = builder.phoneTagSource;
            this.phoneTagType = builder.phoneTagType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PhoneTagConfig create() {
            return builder().build();
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
        }

        /**
         * @return phoneTagEnum
         */
        public java.util.List<PhoneTagEnum> getPhoneTagEnum() {
            return this.phoneTagEnum;
        }

        /**
         * @return phoneTagKey
         */
        public String getPhoneTagKey() {
            return this.phoneTagKey;
        }

        /**
         * @return phoneTagName
         */
        public String getPhoneTagName() {
            return this.phoneTagName;
        }

        /**
         * @return phoneTagRequired
         */
        public Boolean getPhoneTagRequired() {
            return this.phoneTagRequired;
        }

        /**
         * @return phoneTagSource
         */
        public String getPhoneTagSource() {
            return this.phoneTagSource;
        }

        /**
         * @return phoneTagType
         */
        public String getPhoneTagType() {
            return this.phoneTagType;
        }

        public static final class Builder {
            private String id; 
            private java.util.List<PhoneTagEnum> phoneTagEnum; 
            private String phoneTagKey; 
            private String phoneTagName; 
            private Boolean phoneTagRequired; 
            private String phoneTagSource; 
            private String phoneTagType; 

            private Builder() {
            } 

            private Builder(PhoneTagConfig model) {
                this.id = model.id;
                this.phoneTagEnum = model.phoneTagEnum;
                this.phoneTagKey = model.phoneTagKey;
                this.phoneTagName = model.phoneTagName;
                this.phoneTagRequired = model.phoneTagRequired;
                this.phoneTagSource = model.phoneTagSource;
                this.phoneTagType = model.phoneTagType;
            } 

            /**
             * <p>The call variable ID.</p>
             * 
             * <strong>example:</strong>
             * <p>123</p>
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * <p>The available values for the call variable label.</p>
             */
            public Builder phoneTagEnum(java.util.List<PhoneTagEnum> phoneTagEnum) {
                this.phoneTagEnum = phoneTagEnum;
                return this;
            }

            /**
             * <p>The key name of the call variable.</p>
             * 
             * <strong>example:</strong>
             * <p>gender</p>
             */
            public Builder phoneTagKey(String phoneTagKey) {
                this.phoneTagKey = phoneTagKey;
                return this;
            }

            /**
             * <p>The description of the call variable.</p>
             * 
             * <strong>example:</strong>
             * <p>User gender</p>
             */
            public Builder phoneTagName(String phoneTagName) {
                this.phoneTagName = phoneTagName;
                return this;
            }

            /**
             * <p>Indicates whether the call variable is required.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder phoneTagRequired(Boolean phoneTagRequired) {
                this.phoneTagRequired = phoneTagRequired;
                return this;
            }

            /**
             * <p>The source of the call variable.</p>
             * 
             * <strong>example:</strong>
             * <p>MANUAL_CREATE</p>
             */
            public Builder phoneTagSource(String phoneTagSource) {
                this.phoneTagSource = phoneTagSource;
                return this;
            }

            /**
             * <p>The type of the call variable. Valid values: TEXT (text type) and ENUM (enumeration type).</p>
             * 
             * <strong>example:</strong>
             * <p>ENUM</p>
             */
            public Builder phoneTagType(String phoneTagType) {
                this.phoneTagType = phoneTagType;
                return this;
            }

            public PhoneTagConfig build() {
                return new PhoneTagConfig(this);
            } 

        } 

    }
    /**
     * 
     * {@link QueryAiVoiceAgentDetailNewResponseBody} extends {@link TeaModel}
     *
     * <p>QueryAiVoiceAgentDetailNewResponseBody</p>
     */
    public static class DefaultTag extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Desc")
        private String desc;

        @com.aliyun.core.annotation.NameInMap("Tag")
        private String tag;

        private DefaultTag(Builder builder) {
            this.desc = builder.desc;
            this.tag = builder.tag;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DefaultTag create() {
            return builder().build();
        }

        /**
         * @return desc
         */
        public String getDesc() {
            return this.desc;
        }

        /**
         * @return tag
         */
        public String getTag() {
            return this.tag;
        }

        public static final class Builder {
            private String desc; 
            private String tag; 

            private Builder() {
            } 

            private Builder(DefaultTag model) {
                this.desc = model.desc;
                this.tag = model.tag;
            } 

            /**
             * <p>The description.</p>
             * 
             * <strong>example:</strong>
             * <p>Tag description</p>
             */
            public Builder desc(String desc) {
                this.desc = desc;
                return this;
            }

            /**
             * <p>The tag.</p>
             * 
             * <strong>example:</strong>
             * <p>Tag1</p>
             */
            public Builder tag(String tag) {
                this.tag = tag;
                return this;
            }

            public DefaultTag build() {
                return new DefaultTag(this);
            } 

        } 

    }
    /**
     * 
     * {@link QueryAiVoiceAgentDetailNewResponseBody} extends {@link TeaModel}
     *
     * <p>QueryAiVoiceAgentDetailNewResponseBody</p>
     */
    public static class CallResultTagConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DefaultTag")
        private DefaultTag defaultTag;

        @com.aliyun.core.annotation.NameInMap("MappingTag")
        private java.util.Map<String, String> mappingTag;

        private CallResultTagConfig(Builder builder) {
            this.defaultTag = builder.defaultTag;
            this.mappingTag = builder.mappingTag;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CallResultTagConfig create() {
            return builder().build();
        }

        /**
         * @return defaultTag
         */
        public DefaultTag getDefaultTag() {
            return this.defaultTag;
        }

        /**
         * @return mappingTag
         */
        public java.util.Map<String, String> getMappingTag() {
            return this.mappingTag;
        }

        public static final class Builder {
            private DefaultTag defaultTag; 
            private java.util.Map<String, String> mappingTag; 

            private Builder() {
            } 

            private Builder(CallResultTagConfig model) {
                this.defaultTag = model.defaultTag;
                this.mappingTag = model.mappingTag;
            } 

            /**
             * <p>The default fallback tag information.</p>
             */
            public Builder defaultTag(DefaultTag defaultTag) {
                this.defaultTag = defaultTag;
                return this;
            }

            /**
             * <p>The mapping between call results and tags.</p>
             */
            public Builder mappingTag(java.util.Map<String, String> mappingTag) {
                this.mappingTag = mappingTag;
                return this;
            }

            public CallResultTagConfig build() {
                return new CallResultTagConfig(this);
            } 

        } 

    }
    /**
     * 
     * {@link QueryAiVoiceAgentDetailNewResponseBody} extends {@link TeaModel}
     *
     * <p>QueryAiVoiceAgentDetailNewResponseBody</p>
     */
    public static class MainPurposeEnum extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("Id")
        private String id;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private MainPurposeEnum(Builder builder) {
            this.description = builder.description;
            this.id = builder.id;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static MainPurposeEnum create() {
            return builder().build();
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String description; 
            private String id; 
            private String value; 

            private Builder() {
            } 

            private Builder(MainPurposeEnum model) {
                this.description = model.description;
                this.id = model.id;
                this.value = model.value;
            } 

            /**
             * <p>The description of the available value.</p>
             * 
             * <strong>example:</strong>
             * <p>Description of the tag value</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The unique ID of the label.</p>
             * 
             * <strong>example:</strong>
             * <p>tag_12345</p>
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * <p>The available value.</p>
             * 
             * <strong>example:</strong>
             * <p>Tag value example</p>
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public MainPurposeEnum build() {
                return new MainPurposeEnum(this);
            } 

        } 

    }
    /**
     * 
     * {@link QueryAiVoiceAgentDetailNewResponseBody} extends {@link TeaModel}
     *
     * <p>QueryAiVoiceAgentDetailNewResponseBody</p>
     */
    public static class MainPurpose extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Id")
        private String id;

        @com.aliyun.core.annotation.NameInMap("MainPurposeDescription")
        private String mainPurposeDescription;

        @com.aliyun.core.annotation.NameInMap("MainPurposeEnum")
        private java.util.List<MainPurposeEnum> mainPurposeEnum;

        @com.aliyun.core.annotation.NameInMap("MainPurposeName")
        private String mainPurposeName;

        @com.aliyun.core.annotation.NameInMap("MainPurposeType")
        private String mainPurposeType;

        private MainPurpose(Builder builder) {
            this.id = builder.id;
            this.mainPurposeDescription = builder.mainPurposeDescription;
            this.mainPurposeEnum = builder.mainPurposeEnum;
            this.mainPurposeName = builder.mainPurposeName;
            this.mainPurposeType = builder.mainPurposeType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static MainPurpose create() {
            return builder().build();
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
        }

        /**
         * @return mainPurposeDescription
         */
        public String getMainPurposeDescription() {
            return this.mainPurposeDescription;
        }

        /**
         * @return mainPurposeEnum
         */
        public java.util.List<MainPurposeEnum> getMainPurposeEnum() {
            return this.mainPurposeEnum;
        }

        /**
         * @return mainPurposeName
         */
        public String getMainPurposeName() {
            return this.mainPurposeName;
        }

        /**
         * @return mainPurposeType
         */
        public String getMainPurposeType() {
            return this.mainPurposeType;
        }

        public static final class Builder {
            private String id; 
            private String mainPurposeDescription; 
            private java.util.List<MainPurposeEnum> mainPurposeEnum; 
            private String mainPurposeName; 
            private String mainPurposeType; 

            private Builder() {
            } 

            private Builder(MainPurpose model) {
                this.id = model.id;
                this.mainPurposeDescription = model.mainPurposeDescription;
                this.mainPurposeEnum = model.mainPurposeEnum;
                this.mainPurposeName = model.mainPurposeName;
                this.mainPurposeType = model.mainPurposeType;
            } 

            /**
             * <p>The main intent ID.</p>
             * 
             * <strong>example:</strong>
             * <p>123</p>
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * <p>The description of the main intent.</p>
             * 
             * <strong>example:</strong>
             * <p>Description of the main intent</p>
             */
            public Builder mainPurposeDescription(String mainPurposeDescription) {
                this.mainPurposeDescription = mainPurposeDescription;
                return this;
            }

            /**
             * <p>The available values for the main intent.</p>
             */
            public Builder mainPurposeEnum(java.util.List<MainPurposeEnum> mainPurposeEnum) {
                this.mainPurposeEnum = mainPurposeEnum;
                return this;
            }

            /**
             * <p>The name of the main intent.</p>
             * 
             * <strong>example:</strong>
             * <p>Customer inquiry handling</p>
             */
            public Builder mainPurposeName(String mainPurposeName) {
                this.mainPurposeName = mainPurposeName;
                return this;
            }

            /**
             * <p>The value type of the main intent. Valid values: TEXT (text type) and ENUM (enumeration type).</p>
             * 
             * <strong>example:</strong>
             * <p>ENUM</p>
             */
            public Builder mainPurposeType(String mainPurposeType) {
                this.mainPurposeType = mainPurposeType;
                return this;
            }

            public MainPurpose build() {
                return new MainPurpose(this);
            } 

        } 

    }
    /**
     * 
     * {@link QueryAiVoiceAgentDetailNewResponseBody} extends {@link TeaModel}
     *
     * <p>QueryAiVoiceAgentDetailNewResponseBody</p>
     */
    public static class OutputTagEnum extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("Id")
        private String id;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private OutputTagEnum(Builder builder) {
            this.description = builder.description;
            this.id = builder.id;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static OutputTagEnum create() {
            return builder().build();
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String description; 
            private String id; 
            private String value; 

            private Builder() {
            } 

            private Builder(OutputTagEnum model) {
                this.description = model.description;
                this.id = model.id;
                this.value = model.value;
            } 

            /**
             * <p>The tag description.</p>
             * 
             * <strong>example:</strong>
             * <p>The user has a high willingness to purchase</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The tag ID.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * <p>The tag enumeration value.</p>
             * 
             * <strong>example:</strong>
             * <p>High willingness</p>
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public OutputTagEnum build() {
                return new OutputTagEnum(this);
            } 

        } 

    }
    /**
     * 
     * {@link QueryAiVoiceAgentDetailNewResponseBody} extends {@link TeaModel}
     *
     * <p>QueryAiVoiceAgentDetailNewResponseBody</p>
     */
    public static class OutputTagConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Id")
        private String id;

        @com.aliyun.core.annotation.NameInMap("OutputTagDescription")
        private String outputTagDescription;

        @com.aliyun.core.annotation.NameInMap("OutputTagEnum")
        private java.util.List<OutputTagEnum> outputTagEnum;

        @com.aliyun.core.annotation.NameInMap("OutputTagName")
        private String outputTagName;

        @com.aliyun.core.annotation.NameInMap("OutputTagType")
        private String outputTagType;

        private OutputTagConfig(Builder builder) {
            this.id = builder.id;
            this.outputTagDescription = builder.outputTagDescription;
            this.outputTagEnum = builder.outputTagEnum;
            this.outputTagName = builder.outputTagName;
            this.outputTagType = builder.outputTagType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static OutputTagConfig create() {
            return builder().build();
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
        }

        /**
         * @return outputTagDescription
         */
        public String getOutputTagDescription() {
            return this.outputTagDescription;
        }

        /**
         * @return outputTagEnum
         */
        public java.util.List<OutputTagEnum> getOutputTagEnum() {
            return this.outputTagEnum;
        }

        /**
         * @return outputTagName
         */
        public String getOutputTagName() {
            return this.outputTagName;
        }

        /**
         * @return outputTagType
         */
        public String getOutputTagType() {
            return this.outputTagType;
        }

        public static final class Builder {
            private String id; 
            private String outputTagDescription; 
            private java.util.List<OutputTagEnum> outputTagEnum; 
            private String outputTagName; 
            private String outputTagType; 

            private Builder() {
            } 

            private Builder(OutputTagConfig model) {
                this.id = model.id;
                this.outputTagDescription = model.outputTagDescription;
                this.outputTagEnum = model.outputTagEnum;
                this.outputTagName = model.outputTagName;
                this.outputTagType = model.outputTagType;
            } 

            /**
             * <p>The output tag ID.</p>
             * 
             * <strong>example:</strong>
             * <p>123</p>
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * <p>The description of the output tag.</p>
             * 
             * <strong>example:</strong>
             * <p>The user\&quot;s willingness to purchase the product</p>
             */
            public Builder outputTagDescription(String outputTagDescription) {
                this.outputTagDescription = outputTagDescription;
                return this;
            }

            /**
             * <p>The available options for the output tag.</p>
             */
            public Builder outputTagEnum(java.util.List<OutputTagEnum> outputTagEnum) {
                this.outputTagEnum = outputTagEnum;
                return this;
            }

            /**
             * <p>The name of the output tag.</p>
             * 
             * <strong>example:</strong>
             * <p>Purchase willingness</p>
             */
            public Builder outputTagName(String outputTagName) {
                this.outputTagName = outputTagName;
                return this;
            }

            /**
             * <p>The value type of the output tag. Valid values: TEXT (text type) and ENUM (enumeration type).</p>
             * 
             * <strong>example:</strong>
             * <p>ENUM</p>
             */
            public Builder outputTagType(String outputTagType) {
                this.outputTagType = outputTagType;
                return this;
            }

            public OutputTagConfig build() {
                return new OutputTagConfig(this);
            } 

        } 

    }
    /**
     * 
     * {@link QueryAiVoiceAgentDetailNewResponseBody} extends {@link TeaModel}
     *
     * <p>QueryAiVoiceAgentDetailNewResponseBody</p>
     */
    public static class SummaryConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CallResultTagConfig")
        private CallResultTagConfig callResultTagConfig;

        @com.aliyun.core.annotation.NameInMap("MainPurpose")
        private MainPurpose mainPurpose;

        @com.aliyun.core.annotation.NameInMap("OutputTagConfig")
        private java.util.List<OutputTagConfig> outputTagConfig;

        private SummaryConfig(Builder builder) {
            this.callResultTagConfig = builder.callResultTagConfig;
            this.mainPurpose = builder.mainPurpose;
            this.outputTagConfig = builder.outputTagConfig;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SummaryConfig create() {
            return builder().build();
        }

        /**
         * @return callResultTagConfig
         */
        public CallResultTagConfig getCallResultTagConfig() {
            return this.callResultTagConfig;
        }

        /**
         * @return mainPurpose
         */
        public MainPurpose getMainPurpose() {
            return this.mainPurpose;
        }

        /**
         * @return outputTagConfig
         */
        public java.util.List<OutputTagConfig> getOutputTagConfig() {
            return this.outputTagConfig;
        }

        public static final class Builder {
            private CallResultTagConfig callResultTagConfig; 
            private MainPurpose mainPurpose; 
            private java.util.List<OutputTagConfig> outputTagConfig; 

            private Builder() {
            } 

            private Builder(SummaryConfig model) {
                this.callResultTagConfig = model.callResultTagConfig;
                this.mainPurpose = model.mainPurpose;
                this.outputTagConfig = model.outputTagConfig;
            } 

            /**
             * <p>The call result tag mapping configuration.</p>
             */
            public Builder callResultTagConfig(CallResultTagConfig callResultTagConfig) {
                this.callResultTagConfig = callResultTagConfig;
                return this;
            }

            /**
             * <p>The main intent.</p>
             */
            public Builder mainPurpose(MainPurpose mainPurpose) {
                this.mainPurpose = mainPurpose;
                return this;
            }

            /**
             * <p>The output tag configurations.</p>
             */
            public Builder outputTagConfig(java.util.List<OutputTagConfig> outputTagConfig) {
                this.outputTagConfig = outputTagConfig;
                return this;
            }

            public SummaryConfig build() {
                return new SummaryConfig(this);
            } 

        } 

    }
    /**
     * 
     * {@link QueryAiVoiceAgentDetailNewResponseBody} extends {@link TeaModel}
     *
     * <p>QueryAiVoiceAgentDetailNewResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AgentCallConfig")
        private AgentCallConfig agentCallConfig;

        @com.aliyun.core.annotation.NameInMap("AgentDemandConfig")
        private AgentDemandConfig agentDemandConfig;

        @com.aliyun.core.annotation.NameInMap("AgentDesc")
        private String agentDesc;

        @com.aliyun.core.annotation.NameInMap("AgentId")
        private Long agentId;

        @com.aliyun.core.annotation.NameInMap("AgentMode")
        private Long agentMode;

        @com.aliyun.core.annotation.NameInMap("AgentName")
        private String agentName;

        @com.aliyun.core.annotation.NameInMap("BranchDeployStatus")
        private Long branchDeployStatus;

        @com.aliyun.core.annotation.NameInMap("BranchDesc")
        private String branchDesc;

        @com.aliyun.core.annotation.NameInMap("BranchId")
        private Long branchId;

        @com.aliyun.core.annotation.NameInMap("BranchName")
        private String branchName;

        @com.aliyun.core.annotation.NameInMap("KnowledgeConfig")
        private KnowledgeConfig knowledgeConfig;

        @com.aliyun.core.annotation.NameInMap("PhoneTagConfig")
        private java.util.List<PhoneTagConfig> phoneTagConfig;

        @com.aliyun.core.annotation.NameInMap("Scene")
        private String scene;

        @com.aliyun.core.annotation.NameInMap("ServiceDirection")
        private String serviceDirection;

        @com.aliyun.core.annotation.NameInMap("SummaryConfig")
        private SummaryConfig summaryConfig;

        @com.aliyun.core.annotation.NameInMap("VersionDesc")
        private String versionDesc;

        @com.aliyun.core.annotation.NameInMap("VersionId")
        private Long versionId;

        @com.aliyun.core.annotation.NameInMap("VersionName")
        private String versionName;

        @com.aliyun.core.annotation.NameInMap("VersionPublishStatus")
        private Long versionPublishStatus;

        @com.aliyun.core.annotation.NameInMap("VersionPublishTime")
        private String versionPublishTime;

        private Data(Builder builder) {
            this.agentCallConfig = builder.agentCallConfig;
            this.agentDemandConfig = builder.agentDemandConfig;
            this.agentDesc = builder.agentDesc;
            this.agentId = builder.agentId;
            this.agentMode = builder.agentMode;
            this.agentName = builder.agentName;
            this.branchDeployStatus = builder.branchDeployStatus;
            this.branchDesc = builder.branchDesc;
            this.branchId = builder.branchId;
            this.branchName = builder.branchName;
            this.knowledgeConfig = builder.knowledgeConfig;
            this.phoneTagConfig = builder.phoneTagConfig;
            this.scene = builder.scene;
            this.serviceDirection = builder.serviceDirection;
            this.summaryConfig = builder.summaryConfig;
            this.versionDesc = builder.versionDesc;
            this.versionId = builder.versionId;
            this.versionName = builder.versionName;
            this.versionPublishStatus = builder.versionPublishStatus;
            this.versionPublishTime = builder.versionPublishTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return agentCallConfig
         */
        public AgentCallConfig getAgentCallConfig() {
            return this.agentCallConfig;
        }

        /**
         * @return agentDemandConfig
         */
        public AgentDemandConfig getAgentDemandConfig() {
            return this.agentDemandConfig;
        }

        /**
         * @return agentDesc
         */
        public String getAgentDesc() {
            return this.agentDesc;
        }

        /**
         * @return agentId
         */
        public Long getAgentId() {
            return this.agentId;
        }

        /**
         * @return agentMode
         */
        public Long getAgentMode() {
            return this.agentMode;
        }

        /**
         * @return agentName
         */
        public String getAgentName() {
            return this.agentName;
        }

        /**
         * @return branchDeployStatus
         */
        public Long getBranchDeployStatus() {
            return this.branchDeployStatus;
        }

        /**
         * @return branchDesc
         */
        public String getBranchDesc() {
            return this.branchDesc;
        }

        /**
         * @return branchId
         */
        public Long getBranchId() {
            return this.branchId;
        }

        /**
         * @return branchName
         */
        public String getBranchName() {
            return this.branchName;
        }

        /**
         * @return knowledgeConfig
         */
        public KnowledgeConfig getKnowledgeConfig() {
            return this.knowledgeConfig;
        }

        /**
         * @return phoneTagConfig
         */
        public java.util.List<PhoneTagConfig> getPhoneTagConfig() {
            return this.phoneTagConfig;
        }

        /**
         * @return scene
         */
        public String getScene() {
            return this.scene;
        }

        /**
         * @return serviceDirection
         */
        public String getServiceDirection() {
            return this.serviceDirection;
        }

        /**
         * @return summaryConfig
         */
        public SummaryConfig getSummaryConfig() {
            return this.summaryConfig;
        }

        /**
         * @return versionDesc
         */
        public String getVersionDesc() {
            return this.versionDesc;
        }

        /**
         * @return versionId
         */
        public Long getVersionId() {
            return this.versionId;
        }

        /**
         * @return versionName
         */
        public String getVersionName() {
            return this.versionName;
        }

        /**
         * @return versionPublishStatus
         */
        public Long getVersionPublishStatus() {
            return this.versionPublishStatus;
        }

        /**
         * @return versionPublishTime
         */
        public String getVersionPublishTime() {
            return this.versionPublishTime;
        }

        public static final class Builder {
            private AgentCallConfig agentCallConfig; 
            private AgentDemandConfig agentDemandConfig; 
            private String agentDesc; 
            private Long agentId; 
            private Long agentMode; 
            private String agentName; 
            private Long branchDeployStatus; 
            private String branchDesc; 
            private Long branchId; 
            private String branchName; 
            private KnowledgeConfig knowledgeConfig; 
            private java.util.List<PhoneTagConfig> phoneTagConfig; 
            private String scene; 
            private String serviceDirection; 
            private SummaryConfig summaryConfig; 
            private String versionDesc; 
            private Long versionId; 
            private String versionName; 
            private Long versionPublishStatus; 
            private String versionPublishTime; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.agentCallConfig = model.agentCallConfig;
                this.agentDemandConfig = model.agentDemandConfig;
                this.agentDesc = model.agentDesc;
                this.agentId = model.agentId;
                this.agentMode = model.agentMode;
                this.agentName = model.agentName;
                this.branchDeployStatus = model.branchDeployStatus;
                this.branchDesc = model.branchDesc;
                this.branchId = model.branchId;
                this.branchName = model.branchName;
                this.knowledgeConfig = model.knowledgeConfig;
                this.phoneTagConfig = model.phoneTagConfig;
                this.scene = model.scene;
                this.serviceDirection = model.serviceDirection;
                this.summaryConfig = model.summaryConfig;
                this.versionDesc = model.versionDesc;
                this.versionId = model.versionId;
                this.versionName = model.versionName;
                this.versionPublishStatus = model.versionPublishStatus;
                this.versionPublishTime = model.versionPublishTime;
            } 

            /**
             * <p>The intelligent outbound voice call configuration.</p>
             */
            public Builder agentCallConfig(AgentCallConfig agentCallConfig) {
                this.agentCallConfig = agentCallConfig;
                return this;
            }

            /**
             * <p>The agent business requirement configuration.</p>
             */
            public Builder agentDemandConfig(AgentDemandConfig agentDemandConfig) {
                this.agentDemandConfig = agentDemandConfig;
                return this;
            }

            /**
             * <p>The agent description.</p>
             * 
             * <strong>example:</strong>
             * <p>Used for daily testing</p>
             */
            public Builder agentDesc(String agentDesc) {
                this.agentDesc = agentDesc;
                return this;
            }

            /**
             * <p>The agent ID.</p>
             * 
             * <strong>example:</strong>
             * <p>3021893791</p>
             */
            public Builder agentId(Long agentId) {
                this.agentId = agentId;
                return this;
            }

            /**
             * <p>The building method. Valid values:</p>
             * <ul>
             * <li>0: prompt mode.</li>
             * <li>1: dialog flow mode.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder agentMode(Long agentMode) {
                this.agentMode = agentMode;
                return this;
            }

            /**
             * <p>The agent name.</p>
             * 
             * <strong>example:</strong>
             * <p>Test agent</p>
             */
            public Builder agentName(String agentName) {
                this.agentName = agentName;
                return this;
            }

            /**
             * <p>The deployment status. Valid values:</p>
             * <ul>
             * <li>0: not effective (NOT_EFFECT).</li>
             * <li>1: effective (EFFECT).</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder branchDeployStatus(Long branchDeployStatus) {
                this.branchDeployStatus = branchDeployStatus;
                return this;
            }

            /**
             * <p>The branch description.</p>
             * 
             * <strong>example:</strong>
             * <p>Default branch</p>
             */
            public Builder branchDesc(String branchDesc) {
                this.branchDesc = branchDesc;
                return this;
            }

            /**
             * <p>The branch ID.</p>
             * 
             * <strong>example:</strong>
             * <p>18</p>
             */
            public Builder branchId(Long branchId) {
                this.branchId = branchId;
                return this;
            }

            /**
             * <p>The branch name.</p>
             * 
             * <strong>example:</strong>
             * <p>Default version</p>
             */
            public Builder branchName(String branchName) {
                this.branchName = branchName;
                return this;
            }

            /**
             * <p>The knowledge base configuration.</p>
             */
            public Builder knowledgeConfig(KnowledgeConfig knowledgeConfig) {
                this.knowledgeConfig = knowledgeConfig;
                return this;
            }

            /**
             * <p>The call variable configurations.</p>
             */
            public Builder phoneTagConfig(java.util.List<PhoneTagConfig> phoneTagConfig) {
                this.phoneTagConfig = phoneTagConfig;
                return this;
            }

            /**
             * <p>The scenario.</p>
             * 
             * <strong>example:</strong>
             * <p>Personal customer lead conversion</p>
             */
            public Builder scene(String scene) {
                this.scene = scene;
                return this;
            }

            /**
             * <p>The service direction.</p>
             * 
             * <strong>example:</strong>
             * <p>示例值示例值</p>
             */
            public Builder serviceDirection(String serviceDirection) {
                this.serviceDirection = serviceDirection;
                return this;
            }

            /**
             * <p>The call summary configuration.</p>
             */
            public Builder summaryConfig(SummaryConfig summaryConfig) {
                this.summaryConfig = summaryConfig;
                return this;
            }

            /**
             * <p>The version description.</p>
             * 
             * <strong>example:</strong>
             * <p>Test first version</p>
             */
            public Builder versionDesc(String versionDesc) {
                this.versionDesc = versionDesc;
                return this;
            }

            /**
             * <p>The version ID.</p>
             * 
             * <strong>example:</strong>
             * <p>89</p>
             */
            public Builder versionId(Long versionId) {
                this.versionId = versionId;
                return this;
            }

            /**
             * <p>The version name.</p>
             * 
             * <strong>example:</strong>
             * <p>Test version 1</p>
             */
            public Builder versionName(String versionName) {
                this.versionName = versionName;
                return this;
            }

            /**
             * <p>The version publish status. Valid values:</p>
             * <ul>
             * <li>0: Not published.</li>
             * <li>1: Published.</li>
             * <li>2: Draft.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder versionPublishStatus(Long versionPublishStatus) {
                this.versionPublishStatus = versionPublishStatus;
                return this;
            }

            /**
             * <p>The most recent publish time of the version. Format: YYYY-MM-DD HH:mm:ss.</p>
             * 
             * <strong>example:</strong>
             * <p>2024-01-15 10:30:00</p>
             */
            public Builder versionPublishTime(String versionPublishTime) {
                this.versionPublishTime = versionPublishTime;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
