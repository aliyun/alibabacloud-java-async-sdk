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
         * <p><strong><strong><strong>11-DB8D-4A9A-875B-275798</strong></strong></strong></p>
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
             * <p>The media asset ID of the sample audio file.</p>
             * 
             * <strong>example:</strong>
             * <p><strong><strong>4d5e829d498aaf966b119348</strong></strong></p>
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
             * <p>male</p>
             */
            public Builder gender(String gender) {
                this.gender = gender;
                return this;
            }

            /**
             * <p>The scenario. Valid values:</p>
             * <ul>
             * <li>story</li>
             * <li>interaction</li>
             * <li>navigation</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>story</p>
             */
            public Builder scenario(String scenario) {
                this.scenario = scenario;
                return this;
            }

            /**
             * <ul>
             * <li><p>The voice type. Valid values:</p>
             * <ul>
             * <li>Basic</li>
             * <li>Standard</li>
             * </ul>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Standard</p>
             */
            public Builder type(String type) {
                this.type = type;
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
        private java.util.List<CustomizedVoiceList> customizedVoiceList;

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
        public java.util.List<CustomizedVoiceList> getCustomizedVoiceList() {
            return this.customizedVoiceList;
        }

        /**
         * @return totalCount
         */
        public Integer getTotalCount() {
            return this.totalCount;
        }

        public static final class Builder {
            private java.util.List<CustomizedVoiceList> customizedVoiceList; 
            private Integer totalCount; 

            /**
             * <p>The queried personalized human voices.</p>
             */
            public Builder customizedVoiceList(java.util.List<CustomizedVoiceList> customizedVoiceList) {
                this.customizedVoiceList = customizedVoiceList;
                return this;
            }

            /**
             * <p>The total number of entries returned.</p>
             * 
             * <strong>example:</strong>
             * <p>41</p>
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
