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
 * {@link CheckBindLicenseDeviceProgressResponseBody} extends {@link TeaModel}
 *
 * <p>CheckBindLicenseDeviceProgressResponseBody</p>
 */
public class CheckBindLicenseDeviceProgressResponseBody extends TeaModel {
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

    private CheckBindLicenseDeviceProgressResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.errorMessage = builder.errorMessage;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CheckBindLicenseDeviceProgressResponseBody create() {
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

        private Builder(CheckBindLicenseDeviceProgressResponseBody model) {
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

        public CheckBindLicenseDeviceProgressResponseBody build() {
            return new CheckBindLicenseDeviceProgressResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link CheckBindLicenseDeviceProgressResponseBody} extends {@link TeaModel}
     *
     * <p>CheckBindLicenseDeviceProgressResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("FailSum")
        private Long failSum;

        @com.aliyun.core.annotation.NameInMap("Progress")
        private Integer progress;

        @com.aliyun.core.annotation.NameInMap("ResultCsvFile")
        private String resultCsvFile;

        @com.aliyun.core.annotation.NameInMap("SuccessSum")
        private Long successSum;

        private Data(Builder builder) {
            this.failSum = builder.failSum;
            this.progress = builder.progress;
            this.resultCsvFile = builder.resultCsvFile;
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
        public Long getFailSum() {
            return this.failSum;
        }

        /**
         * @return progress
         */
        public Integer getProgress() {
            return this.progress;
        }

        /**
         * @return resultCsvFile
         */
        public String getResultCsvFile() {
            return this.resultCsvFile;
        }

        /**
         * @return successSum
         */
        public Long getSuccessSum() {
            return this.successSum;
        }

        public static final class Builder {
            private Long failSum; 
            private Integer progress; 
            private String resultCsvFile; 
            private Long successSum; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.failSum = model.failSum;
                this.progress = model.progress;
                this.resultCsvFile = model.resultCsvFile;
                this.successSum = model.successSum;
            } 

            /**
             * FailSum.
             */
            public Builder failSum(Long failSum) {
                this.failSum = failSum;
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
             * ResultCsvFile.
             */
            public Builder resultCsvFile(String resultCsvFile) {
                this.resultCsvFile = resultCsvFile;
                return this;
            }

            /**
             * SuccessSum.
             */
            public Builder successSum(Long successSum) {
                this.successSum = successSum;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
