// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iot20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ReBindLicenseDeviceResponseBody} extends {@link TeaModel}
 *
 * <p>ReBindLicenseDeviceResponseBody</p>
 */
public class ReBindLicenseDeviceResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("Data")
    private Data data;

    @NameInMap("ErrorMessage")
    private String errorMessage;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private Boolean success;

    private ReBindLicenseDeviceResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.errorMessage = builder.errorMessage;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ReBindLicenseDeviceResponseBody create() {
        return builder().build();
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

        public ReBindLicenseDeviceResponseBody build() {
            return new ReBindLicenseDeviceResponseBody(this);
        } 

    } 

    public static class Data extends TeaModel {
        @NameInMap("CheckProgressId")
        private String checkProgressId;

        @NameInMap("FailSum")
        private Long failSum;

        @NameInMap("Progress")
        private Integer progress;

        @NameInMap("ResultCsvFile")
        private String resultCsvFile;

        @NameInMap("SuccessSum")
        private Long successSum;

        private Data(Builder builder) {
            this.checkProgressId = builder.checkProgressId;
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
         * @return checkProgressId
         */
        public String getCheckProgressId() {
            return this.checkProgressId;
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
            private String checkProgressId; 
            private Long failSum; 
            private Integer progress; 
            private String resultCsvFile; 
            private Long successSum; 

            /**
             * CheckProgressId.
             */
            public Builder checkProgressId(String checkProgressId) {
                this.checkProgressId = checkProgressId;
                return this;
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
