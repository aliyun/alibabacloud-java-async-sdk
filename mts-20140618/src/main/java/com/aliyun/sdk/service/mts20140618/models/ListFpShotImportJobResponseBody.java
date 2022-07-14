// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mts20140618.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListFpShotImportJobResponseBody} extends {@link TeaModel}
 *
 * <p>ListFpShotImportJobResponseBody</p>
 */
public class ListFpShotImportJobResponseBody extends TeaModel {
    @NameInMap("FpShotImportJobList")
    private java.util.List < FpShotImportJobList> fpShotImportJobList;

    @NameInMap("NonExistIds")
    private java.util.List < String > nonExistIds;

    @NameInMap("RequestId")
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
         * FpShotImportJobList.
         */
        public Builder fpShotImportJobList(java.util.List < FpShotImportJobList> fpShotImportJobList) {
            this.fpShotImportJobList = fpShotImportJobList;
            return this;
        }

        /**
         * NonExistIds.
         */
        public Builder nonExistIds(java.util.List < String > nonExistIds) {
            this.nonExistIds = nonExistIds;
            return this;
        }

        /**
         * Id of the request
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
        @NameInMap("Code")
        private String code;

        @NameInMap("CreateTime")
        private String createTime;

        @NameInMap("FinishTime")
        private String finishTime;

        @NameInMap("FpDBId")
        private String fpDBId;

        @NameInMap("FpImportConfig")
        private String fpImportConfig;

        @NameInMap("Id")
        private String id;

        @NameInMap("Input")
        private String input;

        @NameInMap("Message")
        private String message;

        @NameInMap("PipelineId")
        private String pipelineId;

        @NameInMap("ProcessMessage")
        private String processMessage;

        @NameInMap("Status")
        private String status;

        @NameInMap("UserData")
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
             * Code.
             */
            public Builder code(String code) {
                this.code = code;
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
             * FpImportConfig.
             */
            public Builder fpImportConfig(String fpImportConfig) {
                this.fpImportConfig = fpImportConfig;
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
             * Input.
             */
            public Builder input(String input) {
                this.input = input;
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
             * ProcessMessage.
             */
            public Builder processMessage(String processMessage) {
                this.processMessage = processMessage;
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

            public FpShotImportJobList build() {
                return new FpShotImportJobList(this);
            } 

        } 

    }
}
