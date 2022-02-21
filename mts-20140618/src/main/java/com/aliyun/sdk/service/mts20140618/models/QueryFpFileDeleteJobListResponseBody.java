// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mts20140618.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryFpFileDeleteJobListResponseBody} extends {@link TeaModel}
 *
 * <p>QueryFpFileDeleteJobListResponseBody</p>
 */
public class QueryFpFileDeleteJobListResponseBody extends TeaModel {
    @NameInMap("FpFileDeleteJobList")
    private FpFileDeleteJobList fpFileDeleteJobList;

    @NameInMap("NonExistIds")
    private NonExistIds nonExistIds;

    @NameInMap("RequestId")
    private String requestId;

    private QueryFpFileDeleteJobListResponseBody(Builder builder) {
        this.fpFileDeleteJobList = builder.fpFileDeleteJobList;
        this.nonExistIds = builder.nonExistIds;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryFpFileDeleteJobListResponseBody create() {
        return builder().build();
    }

    /**
     * @return fpFileDeleteJobList
     */
    public FpFileDeleteJobList getFpFileDeleteJobList() {
        return this.fpFileDeleteJobList;
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
        private FpFileDeleteJobList fpFileDeleteJobList; 
        private NonExistIds nonExistIds; 
        private String requestId; 

        /**
         * FpFileDeleteJobList.
         */
        public Builder fpFileDeleteJobList(FpFileDeleteJobList fpFileDeleteJobList) {
            this.fpFileDeleteJobList = fpFileDeleteJobList;
            return this;
        }

        /**
         * NonExistIds.
         */
        public Builder nonExistIds(NonExistIds nonExistIds) {
            this.nonExistIds = nonExistIds;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public QueryFpFileDeleteJobListResponseBody build() {
            return new QueryFpFileDeleteJobListResponseBody(this);
        } 

    } 

    public static class FpFileDeleteJob extends TeaModel {
        @NameInMap("Code")
        private String code;

        @NameInMap("CreationTime")
        private String creationTime;

        @NameInMap("FileIds")
        private String fileIds;

        @NameInMap("FinishTime")
        private String finishTime;

        @NameInMap("FpDBId")
        private String fpDBId;

        @NameInMap("Id")
        private String id;

        @NameInMap("Message")
        private String message;

        @NameInMap("PipelineId")
        private String pipelineId;

        @NameInMap("Status")
        private String status;

        @NameInMap("UserData")
        private String userData;

        private FpFileDeleteJob(Builder builder) {
            this.code = builder.code;
            this.creationTime = builder.creationTime;
            this.fileIds = builder.fileIds;
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

        public static FpFileDeleteJob create() {
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
         * @return fileIds
         */
        public String getFileIds() {
            return this.fileIds;
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
            private String fileIds; 
            private String finishTime; 
            private String fpDBId; 
            private String id; 
            private String message; 
            private String pipelineId; 
            private String status; 
            private String userData; 

            /**
             * Code.
             */
            public Builder code(String code) {
                this.code = code;
                return this;
            }

            /**
             * CreationTime.
             */
            public Builder creationTime(String creationTime) {
                this.creationTime = creationTime;
                return this;
            }

            /**
             * FileIds.
             */
            public Builder fileIds(String fileIds) {
                this.fileIds = fileIds;
                return this;
            }

            /**
             * FinishTime.
             */
            public Builder finishTime(String finishTime) {
                this.finishTime = finishTime;
                return this;
            }

            /**
             * FpDBId.
             */
            public Builder fpDBId(String fpDBId) {
                this.fpDBId = fpDBId;
                return this;
            }

            /**
             * Id.
             */
            public Builder id(String id) {
                this.id = id;
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
             * PipelineId.
             */
            public Builder pipelineId(String pipelineId) {
                this.pipelineId = pipelineId;
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

            public FpFileDeleteJob build() {
                return new FpFileDeleteJob(this);
            } 

        } 

    }
    public static class FpFileDeleteJobList extends TeaModel {
        @NameInMap("FpFileDeleteJob")
        private java.util.List < FpFileDeleteJob> fpFileDeleteJob;

        private FpFileDeleteJobList(Builder builder) {
            this.fpFileDeleteJob = builder.fpFileDeleteJob;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static FpFileDeleteJobList create() {
            return builder().build();
        }

        /**
         * @return fpFileDeleteJob
         */
        public java.util.List < FpFileDeleteJob> getFpFileDeleteJob() {
            return this.fpFileDeleteJob;
        }

        public static final class Builder {
            private java.util.List < FpFileDeleteJob> fpFileDeleteJob; 

            /**
             * FpFileDeleteJob.
             */
            public Builder fpFileDeleteJob(java.util.List < FpFileDeleteJob> fpFileDeleteJob) {
                this.fpFileDeleteJob = fpFileDeleteJob;
                return this;
            }

            public FpFileDeleteJobList build() {
                return new FpFileDeleteJobList(this);
            } 

        } 

    }
    public static class NonExistIds extends TeaModel {
        @NameInMap("String")
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
