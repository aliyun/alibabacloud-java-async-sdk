// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iot20180120.models;

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
 * {@link AddShareTaskDeviceResponseBody} extends {@link TeaModel}
 *
 * <p>AddShareTaskDeviceResponseBody</p>
 */
public class AddShareTaskDeviceResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("ErrorMessage")
    private String errorMessage;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private AddShareTaskDeviceResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.errorMessage = builder.errorMessage;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AddShareTaskDeviceResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return errorMessage
     */
    public String getErrorMessage() {
        return this.errorMessage;
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
        private String code; 
        private Data data; 
        private String errorMessage; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(AddShareTaskDeviceResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.errorMessage = model.errorMessage;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * Data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * ErrorMessage.
         */
        public Builder errorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
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

        public AddShareTaskDeviceResponseBody build() {
            return new AddShareTaskDeviceResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link AddShareTaskDeviceResponseBody} extends {@link TeaModel}
     *
     * <p>AddShareTaskDeviceResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("FailSum")
        private Integer failSum;

        @com.aliyun.core.annotation.NameInMap("FailedResultCsvFile")
        private String failedResultCsvFile;

        @com.aliyun.core.annotation.NameInMap("Progress")
        private Integer progress;

        @com.aliyun.core.annotation.NameInMap("ProgressId")
        private String progressId;

        @com.aliyun.core.annotation.NameInMap("SuccessSum")
        private Integer successSum;

        private Data(Builder builder) {
            this.failSum = builder.failSum;
            this.failedResultCsvFile = builder.failedResultCsvFile;
            this.progress = builder.progress;
            this.progressId = builder.progressId;
            this.successSum = builder.successSum;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return failSum
         */
        public Integer getFailSum() {
            return this.failSum;
        }

        /**
         * @return failedResultCsvFile
         */
        public String getFailedResultCsvFile() {
            return this.failedResultCsvFile;
        }

        /**
         * @return progress
         */
        public Integer getProgress() {
            return this.progress;
        }

        /**
         * @return progressId
         */
        public String getProgressId() {
            return this.progressId;
        }

        /**
         * @return successSum
         */
        public Integer getSuccessSum() {
            return this.successSum;
        }

        public static final class Builder {
            private Integer failSum; 
            private String failedResultCsvFile; 
            private Integer progress; 
            private String progressId; 
            private Integer successSum; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.failSum = model.failSum;
                this.failedResultCsvFile = model.failedResultCsvFile;
                this.progress = model.progress;
                this.progressId = model.progressId;
                this.successSum = model.successSum;
            } 

            /**
             * FailSum.
             */
            public Builder failSum(Integer failSum) {
                this.failSum = failSum;
                return this;
            }

            /**
             * FailedResultCsvFile.
             */
            public Builder failedResultCsvFile(String failedResultCsvFile) {
                this.failedResultCsvFile = failedResultCsvFile;
                return this;
            }

            /**
             * Progress.
             */
            public Builder progress(Integer progress) {
                this.progress = progress;
                return this;
            }

            /**
             * ProgressId.
             */
            public Builder progressId(String progressId) {
                this.progressId = progressId;
                return this;
            }

            /**
             * SuccessSum.
             */
            public Builder successSum(Integer successSum) {
                this.successSum = successSum;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
