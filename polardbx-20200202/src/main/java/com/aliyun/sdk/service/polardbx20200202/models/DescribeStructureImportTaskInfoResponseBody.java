// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.polardbx20200202.models;

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
 * {@link DescribeStructureImportTaskInfoResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeStructureImportTaskInfoResponseBody</p>
 */
public class DescribeStructureImportTaskInfoResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private DescribeStructureImportTaskInfoResponseBody(Builder builder) {
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeStructureImportTaskInfoResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
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
        private String message; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(DescribeStructureImportTaskInfoResponseBody model) {
            this.data = model.data;
            this.message = model.message;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * Data.
         */
        public Builder data(Data data) {
            this.data = data;
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

        public DescribeStructureImportTaskInfoResponseBody build() {
            return new DescribeStructureImportTaskInfoResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeStructureImportTaskInfoResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeStructureImportTaskInfoResponseBody</p>
     */
    public static class StructureImportResult extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ExceptionDetail")
        private String exceptionDetail;

        @com.aliyun.core.annotation.NameInMap("ExceptionFullTableName")
        private String exceptionFullTableName;

        @com.aliyun.core.annotation.NameInMap("FinishedNum")
        private Integer finishedNum;

        @com.aliyun.core.annotation.NameInMap("Percentage")
        private Integer percentage;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("TotalNum")
        private Integer totalNum;

        private StructureImportResult(Builder builder) {
            this.exceptionDetail = builder.exceptionDetail;
            this.exceptionFullTableName = builder.exceptionFullTableName;
            this.finishedNum = builder.finishedNum;
            this.percentage = builder.percentage;
            this.status = builder.status;
            this.totalNum = builder.totalNum;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static StructureImportResult create() {
            return builder().build();
        }

        /**
         * @return exceptionDetail
         */
        public String getExceptionDetail() {
            return this.exceptionDetail;
        }

        /**
         * @return exceptionFullTableName
         */
        public String getExceptionFullTableName() {
            return this.exceptionFullTableName;
        }

        /**
         * @return finishedNum
         */
        public Integer getFinishedNum() {
            return this.finishedNum;
        }

        /**
         * @return percentage
         */
        public Integer getPercentage() {
            return this.percentage;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return totalNum
         */
        public Integer getTotalNum() {
            return this.totalNum;
        }

        public static final class Builder {
            private String exceptionDetail; 
            private String exceptionFullTableName; 
            private Integer finishedNum; 
            private Integer percentage; 
            private String status; 
            private Integer totalNum; 

            private Builder() {
            } 

            private Builder(StructureImportResult model) {
                this.exceptionDetail = model.exceptionDetail;
                this.exceptionFullTableName = model.exceptionFullTableName;
                this.finishedNum = model.finishedNum;
                this.percentage = model.percentage;
                this.status = model.status;
                this.totalNum = model.totalNum;
            } 

            /**
             * ExceptionDetail.
             */
            public Builder exceptionDetail(String exceptionDetail) {
                this.exceptionDetail = exceptionDetail;
                return this;
            }

            /**
             * ExceptionFullTableName.
             */
            public Builder exceptionFullTableName(String exceptionFullTableName) {
                this.exceptionFullTableName = exceptionFullTableName;
                return this;
            }

            /**
             * FinishedNum.
             */
            public Builder finishedNum(Integer finishedNum) {
                this.finishedNum = finishedNum;
                return this;
            }

            /**
             * Percentage.
             */
            public Builder percentage(Integer percentage) {
                this.percentage = percentage;
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
             * TotalNum.
             */
            public Builder totalNum(Integer totalNum) {
                this.totalNum = totalNum;
                return this;
            }

            public StructureImportResult build() {
                return new StructureImportResult(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeStructureImportTaskInfoResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeStructureImportTaskInfoResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("SlinkStage")
        private String slinkStage;

        @com.aliyun.core.annotation.NameInMap("StructureImportResult")
        private StructureImportResult structureImportResult;

        private Data(Builder builder) {
            this.slinkStage = builder.slinkStage;
            this.structureImportResult = builder.structureImportResult;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return slinkStage
         */
        public String getSlinkStage() {
            return this.slinkStage;
        }

        /**
         * @return structureImportResult
         */
        public StructureImportResult getStructureImportResult() {
            return this.structureImportResult;
        }

        public static final class Builder {
            private String slinkStage; 
            private StructureImportResult structureImportResult; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.slinkStage = model.slinkStage;
                this.structureImportResult = model.structureImportResult;
            } 

            /**
             * SlinkStage.
             */
            public Builder slinkStage(String slinkStage) {
                this.slinkStage = slinkStage;
                return this;
            }

            /**
             * StructureImportResult.
             */
            public Builder structureImportResult(StructureImportResult structureImportResult) {
                this.structureImportResult = structureImportResult;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
