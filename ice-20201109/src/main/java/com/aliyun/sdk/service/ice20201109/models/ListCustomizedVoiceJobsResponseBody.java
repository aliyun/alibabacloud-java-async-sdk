// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ice20201109.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListCustomizedVoiceJobsResponseBody} extends {@link TeaModel}
 *
 * <p>ListCustomizedVoiceJobsResponseBody</p>
 */
public class ListCustomizedVoiceJobsResponseBody extends TeaModel {
    @NameInMap("Data")
    private Data data;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
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

        public ListCustomizedVoiceJobsResponseBody build() {
            return new ListCustomizedVoiceJobsResponseBody(this);
        } 

    } 

    public static class CustomizedVoiceJobList extends TeaModel {
        @NameInMap("Gender")
        private String gender;

        @NameInMap("GmtCreate")
        private String gmtCreate;

        @NameInMap("JobId")
        private String jobId;

        @NameInMap("Message")
        private String message;

        @NameInMap("Scenario")
        private String scenario;

        @NameInMap("Status")
        private String status;

        @NameInMap("VoiceDesc")
        private String voiceDesc;

        @NameInMap("VoiceId")
        private String voiceId;

        @NameInMap("VoiceName")
        private String voiceName;

        private CustomizedVoiceJobList(Builder builder) {
            this.gender = builder.gender;
            this.gmtCreate = builder.gmtCreate;
            this.jobId = builder.jobId;
            this.message = builder.message;
            this.scenario = builder.scenario;
            this.status = builder.status;
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
            private String gender; 
            private String gmtCreate; 
            private String jobId; 
            private String message; 
            private String scenario; 
            private String status; 
            private String voiceDesc; 
            private String voiceId; 
            private String voiceName; 

            /**
             * Gender.
             */
            public Builder gender(String gender) {
                this.gender = gender;
                return this;
            }

            /**
             * GmtCreate.
             */
            public Builder gmtCreate(String gmtCreate) {
                this.gmtCreate = gmtCreate;
                return this;
            }

            /**
             * JobId.
             */
            public Builder jobId(String jobId) {
                this.jobId = jobId;
                return this;
            }

            /**
             * Message.
             */
            public Builder message(String message) {
                this.message = message;
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
             * Status.
             */
            public Builder status(String status) {
                this.status = status;
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

            public CustomizedVoiceJobList build() {
                return new CustomizedVoiceJobList(this);
            } 

        } 

    }
    public static class Data extends TeaModel {
        @NameInMap("CustomizedVoiceJobList")
        private java.util.List < CustomizedVoiceJobList> customizedVoiceJobList;

        @NameInMap("TotalCount")
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
             * CustomizedVoiceJobList.
             */
            public Builder customizedVoiceJobList(java.util.List < CustomizedVoiceJobList> customizedVoiceJobList) {
                this.customizedVoiceJobList = customizedVoiceJobList;
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
