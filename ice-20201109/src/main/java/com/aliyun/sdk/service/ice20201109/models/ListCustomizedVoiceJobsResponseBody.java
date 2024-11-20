// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ice20201109.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ListCustomizedVoiceJobsResponseBody} extends {@link TeaModel}
 *
 * <p>ListCustomizedVoiceJobsResponseBody</p>
 */
public class ListCustomizedVoiceJobsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private ListCustomizedVoiceJobsResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListCustomizedVoiceJobsResponseBody create() {
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
         * <p><strong><strong><strong>3B-0E1A-586A-AC29-742247</strong></strong></strong></p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the request was successful. Valid values: true false</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public ListCustomizedVoiceJobsResponseBody build() {
            return new ListCustomizedVoiceJobsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListCustomizedVoiceJobsResponseBody} extends {@link TeaModel}
     *
     * <p>ListCustomizedVoiceJobsResponseBody</p>
     */
    public static class CustomizedVoiceJobList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("Gender")
        private String gender;

        @com.aliyun.core.annotation.NameInMap("GmtCreate")
        private String gmtCreate;

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

        private CustomizedVoiceJobList(Builder builder) {
            this.createTime = builder.createTime;
            this.gender = builder.gender;
            this.gmtCreate = builder.gmtCreate;
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

        public static CustomizedVoiceJobList create() {
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
         * @return gmtCreate
         */
        public String getGmtCreate() {
            return this.gmtCreate;
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
            private String gmtCreate; 
            private String jobId; 
            private String message; 
            private String scenario; 
            private String status; 
            private String type; 
            private String voiceDesc; 
            private String voiceId; 
            private String voiceName; 

            /**
             * <ul>
             * <li>The time when the job was created.</li>
             * <li>The time follows the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time is displayed in UTC.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>2023-04-01T06:23:59Z</p>
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
             * <p>The time when the job was created.</p>
             * 
             * <strong>example:</strong>
             * <p>2022-06-27T02:42:28Z</p>
             */
            public Builder gmtCreate(String gmtCreate) {
                this.gmtCreate = gmtCreate;
                return this;
            }

            /**
             * <p>The ID of the human voice cloning job.</p>
             * 
             * <strong>example:</strong>
             * <p>2245ab99a7fd4116a4fd3f499b7a56c5</p>
             */
            public Builder jobId(String jobId) {
                this.jobId = jobId;
                return this;
            }

            /**
             * <p>The returned message.</p>
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
             * <p>Success</p>
             */
            public Builder status(String status) {
                this.status = status;
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
             * <ul>
             * <li>The description can be up to 256 characters in length.</li>
             * </ul>
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
             * <ul>
             * <li>The name can be up to 32 characters in length.</li>
             * </ul>
             */
            public Builder voiceName(String voiceName) {
                this.voiceName = voiceName;
                return this;
            }

            public CustomizedVoiceJobList build() {
                return new CustomizedVoiceJobList(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListCustomizedVoiceJobsResponseBody} extends {@link TeaModel}
     *
     * <p>ListCustomizedVoiceJobsResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CustomizedVoiceJobList")
        private java.util.List < CustomizedVoiceJobList> customizedVoiceJobList;

        @com.aliyun.core.annotation.NameInMap("TotalCount")
        private Integer totalCount;

        private Data(Builder builder) {
            this.customizedVoiceJobList = builder.customizedVoiceJobList;
            this.totalCount = builder.totalCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return customizedVoiceJobList
         */
        public java.util.List < CustomizedVoiceJobList> getCustomizedVoiceJobList() {
            return this.customizedVoiceJobList;
        }

        /**
         * @return totalCount
         */
        public Integer getTotalCount() {
            return this.totalCount;
        }

        public static final class Builder {
            private java.util.List < CustomizedVoiceJobList> customizedVoiceJobList; 
            private Integer totalCount; 

            /**
             * <p>The queried human voice cloning jobs.</p>
             */
            public Builder customizedVoiceJobList(java.util.List < CustomizedVoiceJobList> customizedVoiceJobList) {
                this.customizedVoiceJobList = customizedVoiceJobList;
                return this;
            }

            /**
             * <p>The total number of entries returned.</p>
             * 
             * <strong>example:</strong>
             * <p>271</p>
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
