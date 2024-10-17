// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ice20201109.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ListCustomizedVoicesResponseBody} extends {@link TeaModel}
 *
 * <p>ListCustomizedVoicesResponseBody</p>
 */
public class ListCustomizedVoicesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private ListCustomizedVoicesResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListCustomizedVoicesResponseBody create() {
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
         * Data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public ListCustomizedVoicesResponseBody build() {
            return new ListCustomizedVoicesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListCustomizedVoicesResponseBody} extends {@link TeaModel}
     *
     * <p>ListCustomizedVoicesResponseBody</p>
     */
    public static class CustomizedVoiceList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DemoAudioMediaId")
        private String demoAudioMediaId;

        @com.aliyun.core.annotation.NameInMap("Gender")
        private String gender;

        @com.aliyun.core.annotation.NameInMap("Scenario")
        private String scenario;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        @com.aliyun.core.annotation.NameInMap("VoiceDesc")
        private String voiceDesc;

        @com.aliyun.core.annotation.NameInMap("VoiceId")
        private String voiceId;

        @com.aliyun.core.annotation.NameInMap("VoiceName")
        private String voiceName;

        private CustomizedVoiceList(Builder builder) {
            this.demoAudioMediaId = builder.demoAudioMediaId;
            this.gender = builder.gender;
            this.scenario = builder.scenario;
            this.type = builder.type;
            this.voiceDesc = builder.voiceDesc;
            this.voiceId = builder.voiceId;
            this.voiceName = builder.voiceName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CustomizedVoiceList create() {
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
         * @return type
         */
        public String getType() {
            return this.type;
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
            private String type; 
            private String voiceDesc; 
            private String voiceId; 
            private String voiceName; 

            /**
             * DemoAudioMediaId.
             */
            public Builder demoAudioMediaId(String demoAudioMediaId) {
                this.demoAudioMediaId = demoAudioMediaId;
                return this;
            }

            /**
             * Gender.
             */
            public Builder gender(String gender) {
                this.gender = gender;
                return this;
            }

            /**
             * Scenario.
             */
            public Builder scenario(String scenario) {
                this.scenario = scenario;
                return this;
            }

            /**
             * Type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * VoiceDesc.
             */
            public Builder voiceDesc(String voiceDesc) {
                this.voiceDesc = voiceDesc;
                return this;
            }

            /**
             * VoiceId.
             */
            public Builder voiceId(String voiceId) {
                this.voiceId = voiceId;
                return this;
            }

            /**
             * VoiceName.
             */
            public Builder voiceName(String voiceName) {
                this.voiceName = voiceName;
                return this;
            }

            public CustomizedVoiceList build() {
                return new CustomizedVoiceList(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListCustomizedVoicesResponseBody} extends {@link TeaModel}
     *
     * <p>ListCustomizedVoicesResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CustomizedVoiceList")
        private java.util.List < CustomizedVoiceList> customizedVoiceList;

        @com.aliyun.core.annotation.NameInMap("TotalCount")
        private Integer totalCount;

        private Data(Builder builder) {
            this.customizedVoiceList = builder.customizedVoiceList;
            this.totalCount = builder.totalCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return customizedVoiceList
         */
        public java.util.List < CustomizedVoiceList> getCustomizedVoiceList() {
            return this.customizedVoiceList;
        }

        /**
         * @return totalCount
         */
        public Integer getTotalCount() {
            return this.totalCount;
        }

        public static final class Builder {
            private java.util.List < CustomizedVoiceList> customizedVoiceList; 
            private Integer totalCount; 

            /**
             * CustomizedVoiceList.
             */
            public Builder customizedVoiceList(java.util.List < CustomizedVoiceList> customizedVoiceList) {
                this.customizedVoiceList = customizedVoiceList;
                return this;
            }

            /**
             * TotalCount.
             */
            public Builder totalCount(Integer totalCount) {
                this.totalCount = totalCount;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
