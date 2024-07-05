// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mts20140618.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListFpShotImportJobResponseBody} extends {@link TeaModel}
 *
 * <p>ListFpShotImportJobResponseBody</p>
 */
public class ListFpShotImportJobResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("FpShotImportJobList")
    private java.util.List < FpShotImportJobList> fpShotImportJobList;

    @com.aliyun.core.annotation.NameInMap("NonExistIds")
    private java.util.List < String > nonExistIds;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private ListFpShotImportJobResponseBody(Builder builder) {
        this.fpShotImportJobList = builder.fpShotImportJobList;
        this.nonExistIds = builder.nonExistIds;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListFpShotImportJobResponseBody create() {
        return builder().build();
    }

    /**
     * @return fpShotImportJobList
     */
    public java.util.List < FpShotImportJobList> getFpShotImportJobList() {
        return this.fpShotImportJobList;
    }

    /**
     * @return nonExistIds
     */
    public java.util.List < String > getNonExistIds() {
        return this.nonExistIds;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List < FpShotImportJobList> fpShotImportJobList; 
        private java.util.List < String > nonExistIds; 
        private String requestId; 

        /**
         * The jobs of importing text files to a text fingerprint library.
         */
        public Builder fpShotImportJobList(java.util.List < FpShotImportJobList> fpShotImportJobList) {
            this.fpShotImportJobList = fpShotImportJobList;
            return this;
        }

        /**
         * The job IDs that do not exist. This parameter is not returned if all specified job IDs exist.
         */
        public Builder nonExistIds(java.util.List < String > nonExistIds) {
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

        public ListFpShotImportJobResponseBody build() {
            return new ListFpShotImportJobResponseBody(this);
        } 

    } 

    public static class FpShotImportJobList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Code")
        private String code;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("FinishTime")
        private String finishTime;

        @com.aliyun.core.annotation.NameInMap("FpDBId")
        private String fpDBId;

        @com.aliyun.core.annotation.NameInMap("FpImportConfig")
        private String fpImportConfig;

        @com.aliyun.core.annotation.NameInMap("Id")
        private String id;

        @com.aliyun.core.annotation.NameInMap("Input")
        private String input;

        @com.aliyun.core.annotation.NameInMap("Message")
        private String message;

        @com.aliyun.core.annotation.NameInMap("PipelineId")
        private String pipelineId;

        @com.aliyun.core.annotation.NameInMap("ProcessMessage")
        private String processMessage;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("UserData")
        private String userData;

        private FpShotImportJobList(Builder builder) {
            this.code = builder.code;
            this.createTime = builder.createTime;
            this.finishTime = builder.finishTime;
            this.fpDBId = builder.fpDBId;
            this.fpImportConfig = builder.fpImportConfig;
            this.id = builder.id;
            this.input = builder.input;
            this.message = builder.message;
            this.pipelineId = builder.pipelineId;
            this.processMessage = builder.processMessage;
            this.status = builder.status;
            this.userData = builder.userData;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static FpShotImportJobList create() {
            return builder().build();
        }

        /**
         * @return code
         */
        public String getCode() {
            return this.code;
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
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
         * @return fpImportConfig
         */
        public String getFpImportConfig() {
            return this.fpImportConfig;
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
        }

        /**
         * @return input
         */
        public String getInput() {
            return this.input;
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
         * @return processMessage
         */
        public String getProcessMessage() {
            return this.processMessage;
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
            private String createTime; 
            private String finishTime; 
            private String fpDBId; 
            private String fpImportConfig; 
            private String id; 
            private String input; 
            private String message; 
            private String pipelineId; 
            private String processMessage; 
            private String status; 
            private String userData; 

            /**
             * The error code returned when the job fails.
             */
            public Builder code(String code) {
                this.code = code;
                return this;
            }

            /**
             * The time when the job was created.
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * The time when the job was completed.
             */
            public Builder finishTime(String finishTime) {
                this.finishTime = finishTime;
                return this;
            }

            /**
             * The ID of the text fingerprint library.
             */
            public Builder fpDBId(String fpDBId) {
                this.fpDBId = fpDBId;
                return this;
            }

            /**
             * The import configuration.
             */
            public Builder fpImportConfig(String fpImportConfig) {
                this.fpImportConfig = fpImportConfig;
                return this;
            }

            /**
             * The job ID.
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * The input file.
             */
            public Builder input(String input) {
                this.input = input;
                return this;
            }

            /**
             * The error message returned when the job fails.
             */
            public Builder message(String message) {
                this.message = message;
                return this;
            }

            /**
             * The ID of the ApsaraVideo Media Processing (MPS) queue to which the job is submitted.
             */
            public Builder pipelineId(String pipelineId) {
                this.pipelineId = pipelineId;
                return this;
            }

            /**
             * The processing information of the job.
             */
            public Builder processMessage(String processMessage) {
                this.processMessage = processMessage;
                return this;
            }

            /**
             * The status of the job. Valid values:
             * <p>
             * 
             * *   Processing: The job is in progress.
             * *   Fail: The job fails.
             * *   Success: The job is successful.
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

            public FpShotImportJobList build() {
                return new FpShotImportJobList(this);
            } 

        } 

    }
}
