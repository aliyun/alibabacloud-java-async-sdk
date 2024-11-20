// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ice20201109.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link GetCustomizedVoiceJobResponseBody} extends {@link TeaModel}
 *
 * <p>GetCustomizedVoiceJobResponseBody</p>
 */
public class GetCustomizedVoiceJobResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private GetCustomizedVoiceJobResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetCustomizedVoiceJobResponseBody create() {
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
         * <p>The data returned if the request was successful.</p>
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

        public GetCustomizedVoiceJobResponseBody build() {
            return new GetCustomizedVoiceJobResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetCustomizedVoiceJobResponseBody} extends {@link TeaModel}
     *
     * <p>GetCustomizedVoiceJobResponseBody</p>
     */
    public static class CustomizedVoiceJob extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("Gender")
        private String gender;

        @com.aliyun.core.annotation.NameInMap("JobId")
        private String jobId;

        @com.aliyun.core.annotation.NameInMap("Message")
        private String message;

        @com.aliyun.core.annotation.NameInMap("Scenario")
        private String scenario;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        @com.aliyun.core.annotation.NameInMap("VoiceDesc")
        private String voiceDesc;

        @com.aliyun.core.annotation.NameInMap("VoiceId")
        private String voiceId;

        @com.aliyun.core.annotation.NameInMap("VoiceName")
        private String voiceName;

        private CustomizedVoiceJob(Builder builder) {
            this.createTime = builder.createTime;
            this.gender = builder.gender;
            this.jobId = builder.jobId;
            this.message = builder.message;
            this.scenario = builder.scenario;
            this.status = builder.status;
            this.type = builder.type;
            this.voiceDesc = builder.voiceDesc;
            this.voiceId = builder.voiceId;
            this.voiceName = builder.voiceName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CustomizedVoiceJob create() {
            return builder().build();
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return gender
         */
        public String getGender() {
            return this.gender;
        }

        /**
         * @return jobId
         */
        public String getJobId() {
            return this.jobId;
        }

        /**
         * @return message
         */
        public String getMessage() {
            return this.message;
        }

        /**
         * @return scenario
         */
        public String getScenario() {
            return this.scenario;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
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
            private String createTime; 
            private String gender; 
            private String jobId; 
            private String message; 
            private String scenario; 
            private String status; 
            private String type; 
            private String voiceDesc; 
            private String voiceId; 
            private String voiceName; 

            /**
             * <p>The time when the job was created. The time follows the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time is displayed in UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>2023-06-07T02:27:08Z</p>
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
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
             * <p>The ID of the human voice cloning job.</p>
             * 
             * <strong>example:</strong>
             * <p><strong><strong>571c704445f9a0ee011406c2</strong></strong></p>
             */
            public Builder jobId(String jobId) {
                this.jobId = jobId;
                return this;
            }

            /**
             * <p>The status description.</p>
             */
            public Builder message(String message) {
                this.message = message;
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
             * <p>The job state. Valid values:</p>
             * <ul>
             * <li>Initialization</li>
             * <li>AudioDetecting</li>
             * <li>PreTraining</li>
             * <li>Training</li>
             * <li>Success</li>
             * <li>Fail</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Fail</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The type of the human voice cloning job. Valid values:</p>
             * <ul>
             * <li>Basic</li>
             * <li>Standard</li>
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
             * 
             * <strong>example:</strong>
             * <p>This is an exclusive voice</p>
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
             * 
             * <strong>example:</strong>
             * <p>Xiaozhuan</p>
             */
            public Builder voiceName(String voiceName) {
                this.voiceName = voiceName;
                return this;
            }

            public CustomizedVoiceJob build() {
                return new CustomizedVoiceJob(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetCustomizedVoiceJobResponseBody} extends {@link TeaModel}
     *
     * <p>GetCustomizedVoiceJobResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CustomizedVoiceJob")
        private CustomizedVoiceJob customizedVoiceJob;

        private Data(Builder builder) {
            this.customizedVoiceJob = builder.customizedVoiceJob;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return customizedVoiceJob
         */
        public CustomizedVoiceJob getCustomizedVoiceJob() {
            return this.customizedVoiceJob;
        }

        public static final class Builder {
            private CustomizedVoiceJob customizedVoiceJob; 

            /**
             * <p>The information about the human voice cloning job.</p>
             */
            public Builder customizedVoiceJob(CustomizedVoiceJob customizedVoiceJob) {
                this.customizedVoiceJob = customizedVoiceJob;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
