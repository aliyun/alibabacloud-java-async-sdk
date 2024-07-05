// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mts20140618.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryFpDBDeleteJobListResponseBody} extends {@link TeaModel}
 *
 * <p>QueryFpDBDeleteJobListResponseBody</p>
 */
public class QueryFpDBDeleteJobListResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("FpDBDeleteJobList")
    private FpDBDeleteJobList fpDBDeleteJobList;

    @com.aliyun.core.annotation.NameInMap("NonExistIds")
    private NonExistIds nonExistIds;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private QueryFpDBDeleteJobListResponseBody(Builder builder) {
        this.fpDBDeleteJobList = builder.fpDBDeleteJobList;
        this.nonExistIds = builder.nonExistIds;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryFpDBDeleteJobListResponseBody create() {
        return builder().build();
    }

    /**
     * @return fpDBDeleteJobList
     */
    public FpDBDeleteJobList getFpDBDeleteJobList() {
        return this.fpDBDeleteJobList;
    }

    /**
     * @return nonExistIds
     */
    public NonExistIds getNonExistIds() {
        return this.nonExistIds;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private FpDBDeleteJobList fpDBDeleteJobList; 
        private NonExistIds nonExistIds; 
        private String requestId; 

        /**
         * The jobs of deleting a media fingerprint library. For more information, see the "FpDBDeleteJob" section of the [Data types](https://www.alibabacloud.com/help/en/apsaravideo-for-media-processing/latest/datatypes) topic.
         */
        public Builder fpDBDeleteJobList(FpDBDeleteJobList fpDBDeleteJobList) {
            this.fpDBDeleteJobList = fpDBDeleteJobList;
            return this;
        }

        /**
         * The IDs of the jobs that do not exist.
         */
        public Builder nonExistIds(NonExistIds nonExistIds) {
            this.nonExistIds = nonExistIds;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public QueryFpDBDeleteJobListResponseBody build() {
            return new QueryFpDBDeleteJobListResponseBody(this);
        } 

    } 

    public static class FpDBDeleteJob extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Code")
        private String code;

        @com.aliyun.core.annotation.NameInMap("CreationTime")
        private String creationTime;

        @com.aliyun.core.annotation.NameInMap("DelType")
        private String delType;

        @com.aliyun.core.annotation.NameInMap("FinishTime")
        private String finishTime;

        @com.aliyun.core.annotation.NameInMap("FpDBId")
        private String fpDBId;

        @com.aliyun.core.annotation.NameInMap("Id")
        private String id;

        @com.aliyun.core.annotation.NameInMap("Message")
        private String message;

        @com.aliyun.core.annotation.NameInMap("PipelineId")
        private String pipelineId;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("UserData")
        private String userData;

        private FpDBDeleteJob(Builder builder) {
            this.code = builder.code;
            this.creationTime = builder.creationTime;
            this.delType = builder.delType;
            this.finishTime = builder.finishTime;
            this.fpDBId = builder.fpDBId;
            this.id = builder.id;
            this.message = builder.message;
            this.pipelineId = builder.pipelineId;
            this.status = builder.status;
            this.userData = builder.userData;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static FpDBDeleteJob create() {
            return builder().build();
        }

        /**
         * @return code
         */
        public String getCode() {
            return this.code;
        }

        /**
         * @return creationTime
         */
        public String getCreationTime() {
            return this.creationTime;
        }

        /**
         * @return delType
         */
        public String getDelType() {
            return this.delType;
        }

        /**
         * @return finishTime
         */
        public String getFinishTime() {
            return this.finishTime;
        }

        /**
         * @return fpDBId
         */
        public String getFpDBId() {
            return this.fpDBId;
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
        }

        /**
         * @return message
         */
        public String getMessage() {
            return this.message;
        }

        /**
         * @return pipelineId
         */
        public String getPipelineId() {
            return this.pipelineId;
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
            private String code; 
            private String creationTime; 
            private String delType; 
            private String finishTime; 
            private String fpDBId; 
            private String id; 
            private String message; 
            private String pipelineId; 
            private String status; 
            private String userData; 

            /**
             * The error code returned if the job fails. This parameter is not returned if the job is successful.
             */
            public Builder code(String code) {
                this.code = code;
                return this;
            }

            /**
             * The time when the job was created.
             */
            public Builder creationTime(String creationTime) {
                this.creationTime = creationTime;
                return this;
            }

            /**
             * The type of the operation.
             */
            public Builder delType(String delType) {
                this.delType = delType;
                return this;
            }

            /**
             * The time when the job was complete.
             */
            public Builder finishTime(String finishTime) {
                this.finishTime = finishTime;
                return this;
            }

            /**
             * The ID of the media fingerprint library.
             */
            public Builder fpDBId(String fpDBId) {
                this.fpDBId = fpDBId;
                return this;
            }

            /**
             * The ID of the job.
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * The error message returned if the job fails. This parameter is not returned if the job is successful.
             */
            public Builder message(String message) {
                this.message = message;
                return this;
            }

            /**
             * The ID of the ApsaraVideo Media Processing (MPS) queue to which the job was submitted.
             */
            public Builder pipelineId(String pipelineId) {
                this.pipelineId = pipelineId;
                return this;
            }

            /**
             * The status of the job. Valid values:
             * <p>
             * 
             * *   **Queuing**: The job is waiting in the queue.
             * *   **Analysing**: The job is in progress.
             * *   **Success**: The job is successful.
             * *   **Fail**: The job fails.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * The user-defined data.
             */
            public Builder userData(String userData) {
                this.userData = userData;
                return this;
            }

            public FpDBDeleteJob build() {
                return new FpDBDeleteJob(this);
            } 

        } 

    }
    public static class FpDBDeleteJobList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("FpDBDeleteJob")
        private java.util.List < FpDBDeleteJob> fpDBDeleteJob;

        private FpDBDeleteJobList(Builder builder) {
            this.fpDBDeleteJob = builder.fpDBDeleteJob;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static FpDBDeleteJobList create() {
            return builder().build();
        }

        /**
         * @return fpDBDeleteJob
         */
        public java.util.List < FpDBDeleteJob> getFpDBDeleteJob() {
            return this.fpDBDeleteJob;
        }

        public static final class Builder {
            private java.util.List < FpDBDeleteJob> fpDBDeleteJob; 

            /**
             * FpDBDeleteJob.
             */
            public Builder fpDBDeleteJob(java.util.List < FpDBDeleteJob> fpDBDeleteJob) {
                this.fpDBDeleteJob = fpDBDeleteJob;
                return this;
            }

            public FpDBDeleteJobList build() {
                return new FpDBDeleteJobList(this);
            } 

        } 

    }
    public static class NonExistIds extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("String")
        private java.util.List < String > string;

        private NonExistIds(Builder builder) {
            this.string = builder.string;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static NonExistIds create() {
            return builder().build();
        }

        /**
         * @return string
         */
        public java.util.List < String > getString() {
            return this.string;
        }

        public static final class Builder {
            private java.util.List < String > string; 

            /**
             * String.
             */
            public Builder string(java.util.List < String > string) {
                this.string = string;
                return this;
            }

            public NonExistIds build() {
                return new NonExistIds(this);
            } 

        } 

    }
}
