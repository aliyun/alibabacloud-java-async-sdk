// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ice20201109.models;

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
 * {@link GetCustomizedVoiceResponseBody} extends {@link TeaModel}
 *
 * <p>GetCustomizedVoiceResponseBody</p>
 */
public class GetCustomizedVoiceResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private GetCustomizedVoiceResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetCustomizedVoiceResponseBody create() {
        return builder().build();
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
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
        private Data data; 
        private String requestId; 
        private Boolean success; 

        /**
         * <p>The data returned.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p><strong><strong>63E8B7C7-4812-46AD-0FA56029AC86</strong></strong></p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the request was successful. Valid values:</p>
         * <ul>
         * <li>true</li>
         * <li>false</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public GetCustomizedVoiceResponseBody build() {
            return new GetCustomizedVoiceResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetCustomizedVoiceResponseBody} extends {@link TeaModel}
     *
     * <p>GetCustomizedVoiceResponseBody</p>
     */
    public static class CustomizedVoice extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DemoAudioMediaId")
        private String demoAudioMediaId;

        @com.aliyun.core.annotation.NameInMap("Gender")
        private String gender;

        @com.aliyun.core.annotation.NameInMap("Scenario")
        private String scenario;

        @com.aliyun.core.annotation.NameInMap("VoiceDesc")
        private String voiceDesc;

        @com.aliyun.core.annotation.NameInMap("VoiceId")
        private String voiceId;

        @com.aliyun.core.annotation.NameInMap("VoiceName")
        private String voiceName;

        private CustomizedVoice(Builder builder) {
            this.demoAudioMediaId = builder.demoAudioMediaId;
            this.gender = builder.gender;
            this.scenario = builder.scenario;
            this.voiceDesc = builder.voiceDesc;
            this.voiceId = builder.voiceId;
            this.voiceName = builder.voiceName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CustomizedVoice create() {
            return builder().build();
        }

        /**
         * @return demoAudioMediaId
         */
        public String getDemoAudioMediaId() {
            return this.demoAudioMediaId;
        }

        /**
         * @return gender
         */
        public String getGender() {
            return this.gender;
        }

        /**
         * @return scenario
         */
        public String getScenario() {
            return this.scenario;
        }

        /**
         * @return voiceDesc
         */
        public String getVoiceDesc() {
            return this.voiceDesc;
        }

        /**
         * @return voiceId
         */
        public String getVoiceId() {
            return this.voiceId;
        }

        /**
         * @return voiceName
         */
        public String getVoiceName() {
            return this.voiceName;
        }

        public static final class Builder {
            private String demoAudioMediaId; 
            private String gender; 
            private String scenario; 
            private String voiceDesc; 
            private String voiceId; 
            private String voiceName; 

            /**
             * <p>The media asset ID of the sample audio file.</p>
             * 
             * <strong>example:</strong>
             * <p><strong><strong>42d3c312402982be65975f5b</strong></strong></p>
             */
            public Builder demoAudioMediaId(String demoAudioMediaId) {
                this.demoAudioMediaId = demoAudioMediaId;
                return this;
            }

            /**
             * <p>The gender. Valid values:</p>
             * <ul>
             * <li>female</li>
             * <li>male</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>female</p>
             */
            public Builder gender(String gender) {
                this.gender = gender;
                return this;
            }

            /**
             * <p>The demonstration scenario.</p>
             * <p>Valid values:</p>
             * <ul>
             * <li><strong>story</strong></li>
             * <li><strong>interaction</strong></li>
             * <li><strong>navigation</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>interaction</p>
             */
            public Builder scenario(String scenario) {
                this.scenario = scenario;
                return this;
            }

            /**
             * <p>The voice description.</p>
             */
            public Builder voiceDesc(String voiceDesc) {
                this.voiceDesc = voiceDesc;
                return this;
            }

            /**
             * <p>The voice ID.</p>
             * 
             * <strong>example:</strong>
             * <p>xiaozhuan</p>
             */
            public Builder voiceId(String voiceId) {
                this.voiceId = voiceId;
                return this;
            }

            /**
             * <p>The voice name.</p>
             */
            public Builder voiceName(String voiceName) {
                this.voiceName = voiceName;
                return this;
            }

            public CustomizedVoice build() {
                return new CustomizedVoice(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetCustomizedVoiceResponseBody} extends {@link TeaModel}
     *
     * <p>GetCustomizedVoiceResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CustomizedVoice")
        private CustomizedVoice customizedVoice;

        private Data(Builder builder) {
            this.customizedVoice = builder.customizedVoice;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return customizedVoice
         */
        public CustomizedVoice getCustomizedVoice() {
            return this.customizedVoice;
        }

        public static final class Builder {
            private CustomizedVoice customizedVoice; 

            /**
             * <p>The personalized human voice.</p>
             */
            public Builder customizedVoice(CustomizedVoice customizedVoice) {
                this.customizedVoice = customizedVoice;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
