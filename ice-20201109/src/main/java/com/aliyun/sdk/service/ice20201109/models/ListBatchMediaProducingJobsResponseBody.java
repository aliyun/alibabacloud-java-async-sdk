// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ice20201109.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ListBatchMediaProducingJobsResponseBody} extends {@link TeaModel}
 *
 * <p>ListBatchMediaProducingJobsResponseBody</p>
 */
public class ListBatchMediaProducingJobsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("EditingBatchJobList")
    private java.util.List < EditingBatchJobList> editingBatchJobList;

    @com.aliyun.core.annotation.NameInMap("MaxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private ListBatchMediaProducingJobsResponseBody(Builder builder) {
        this.editingBatchJobList = builder.editingBatchJobList;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListBatchMediaProducingJobsResponseBody create() {
        return builder().build();
    }

    /**
     * @return editingBatchJobList
     */
    public java.util.List < EditingBatchJobList> getEditingBatchJobList() {
        return this.editingBatchJobList;
    }

    /**
     * @return maxResults
     */
    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List < EditingBatchJobList> editingBatchJobList; 
        private Integer maxResults; 
        private String nextToken; 
        private String requestId; 

        /**
         * EditingBatchJobList.
         */
        public Builder editingBatchJobList(java.util.List < EditingBatchJobList> editingBatchJobList) {
            this.editingBatchJobList = editingBatchJobList;
            return this;
        }

        /**
         * MaxResults.
         */
        public Builder maxResults(Integer maxResults) {
            this.maxResults = maxResults;
            return this;
        }

        /**
         * NextToken.
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p><strong><strong><strong>3B-0E1A-586A-AC29-742247</strong></strong></strong></p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListBatchMediaProducingJobsResponseBody build() {
            return new ListBatchMediaProducingJobsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListBatchMediaProducingJobsResponseBody} extends {@link TeaModel}
     *
     * <p>ListBatchMediaProducingJobsResponseBody</p>
     */
    public static class EditingBatchJobList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CompleteTime")
        private String completeTime;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("EditingConfig")
        private String editingConfig;

        @com.aliyun.core.annotation.NameInMap("Extend")
        private String extend;

        @com.aliyun.core.annotation.NameInMap("InputConfig")
        private String inputConfig;

        @com.aliyun.core.annotation.NameInMap("JobId")
        private String jobId;

        @com.aliyun.core.annotation.NameInMap("JobType")
        private String jobType;

        @com.aliyun.core.annotation.NameInMap("ModifiedTime")
        private String modifiedTime;

        @com.aliyun.core.annotation.NameInMap("OutputConfig")
        private String outputConfig;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("UserData")
        private String userData;

        private EditingBatchJobList(Builder builder) {
            this.completeTime = builder.completeTime;
            this.createTime = builder.createTime;
            this.editingConfig = builder.editingConfig;
            this.extend = builder.extend;
            this.inputConfig = builder.inputConfig;
            this.jobId = builder.jobId;
            this.jobType = builder.jobType;
            this.modifiedTime = builder.modifiedTime;
            this.outputConfig = builder.outputConfig;
            this.status = builder.status;
            this.userData = builder.userData;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static EditingBatchJobList create() {
            return builder().build();
        }

        /**
         * @return completeTime
         */
        public String getCompleteTime() {
            return this.completeTime;
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return editingConfig
         */
        public String getEditingConfig() {
            return this.editingConfig;
        }

        /**
         * @return extend
         */
        public String getExtend() {
            return this.extend;
        }

        /**
         * @return inputConfig
         */
        public String getInputConfig() {
            return this.inputConfig;
        }

        /**
         * @return jobId
         */
        public String getJobId() {
            return this.jobId;
        }

        /**
         * @return jobType
         */
        public String getJobType() {
            return this.jobType;
        }

        /**
         * @return modifiedTime
         */
        public String getModifiedTime() {
            return this.modifiedTime;
        }

        /**
         * @return outputConfig
         */
        public String getOutputConfig() {
            return this.outputConfig;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return userData
         */
        public String getUserData() {
            return this.userData;
        }

        public static final class Builder {
            private String completeTime; 
            private String createTime; 
            private String editingConfig; 
            private String extend; 
            private String inputConfig; 
            private String jobId; 
            private String jobType; 
            private String modifiedTime; 
            private String outputConfig; 
            private String status; 
            private String userData; 

            /**
             * CompleteTime.
             */
            public Builder completeTime(String completeTime) {
                this.completeTime = completeTime;
                return this;
            }

            /**
             * CreateTime.
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * EditingConfig.
             */
            public Builder editingConfig(String editingConfig) {
                this.editingConfig = editingConfig;
                return this;
            }

            /**
             * Extend.
             */
            public Builder extend(String extend) {
                this.extend = extend;
                return this;
            }

            /**
             * InputConfig.
             */
            public Builder inputConfig(String inputConfig) {
                this.inputConfig = inputConfig;
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
             * JobType.
             */
            public Builder jobType(String jobType) {
                this.jobType = jobType;
                return this;
            }

            /**
             * ModifiedTime.
             */
            public Builder modifiedTime(String modifiedTime) {
                this.modifiedTime = modifiedTime;
                return this;
            }

            /**
             * OutputConfig.
             */
            public Builder outputConfig(String outputConfig) {
                this.outputConfig = outputConfig;
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
             * UserData.
             */
            public Builder userData(String userData) {
                this.userData = userData;
                return this;
            }

            public EditingBatchJobList build() {
                return new EditingBatchJobList(this);
            } 

        } 

    }
}
