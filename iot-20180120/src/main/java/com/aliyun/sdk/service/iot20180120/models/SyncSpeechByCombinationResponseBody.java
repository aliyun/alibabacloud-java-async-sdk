// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iot20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SyncSpeechByCombinationResponseBody} extends {@link TeaModel}
 *
 * <p>SyncSpeechByCombinationResponseBody</p>
 */
public class SyncSpeechByCombinationResponseBody extends TeaModel {
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

    private SyncSpeechByCombinationResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.errorMessage = builder.errorMessage;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SyncSpeechByCombinationResponseBody create() {
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

        public SyncSpeechByCombinationResponseBody build() {
            return new SyncSpeechByCombinationResponseBody(this);
        } 

    } 

    public static class Data extends TeaModel {
        @NameInMap("Detail")
        private String detail;

        @NameInMap("DeviceErrorCode")
        private String deviceErrorCode;

        @NameInMap("DeviceErrorMessage")
        private String deviceErrorMessage;

        @NameInMap("Id")
        private String id;

        @NameInMap("MaxRetryCount")
        private Integer maxRetryCount;

        @NameInMap("RetryCount")
        private Integer retryCount;

        @NameInMap("Success")
        private Boolean success;

        private Data(Builder builder) {
            this.detail = builder.detail;
            this.deviceErrorCode = builder.deviceErrorCode;
            this.deviceErrorMessage = builder.deviceErrorMessage;
            this.id = builder.id;
            this.maxRetryCount = builder.maxRetryCount;
            this.retryCount = builder.retryCount;
            this.success = builder.success;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return detail
         */
        public String getDetail() {
            return this.detail;
        }

        /**
         * @return deviceErrorCode
         */
        public String getDeviceErrorCode() {
            return this.deviceErrorCode;
        }

        /**
         * @return deviceErrorMessage
         */
        public String getDeviceErrorMessage() {
            return this.deviceErrorMessage;
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
        }

        /**
         * @return maxRetryCount
         */
        public Integer getMaxRetryCount() {
            return this.maxRetryCount;
        }

        /**
         * @return retryCount
         */
        public Integer getRetryCount() {
            return this.retryCount;
        }

        /**
         * @return success
         */
        public Boolean getSuccess() {
            return this.success;
        }

        public static final class Builder {
            private String detail; 
            private String deviceErrorCode; 
            private String deviceErrorMessage; 
            private String id; 
            private Integer maxRetryCount; 
            private Integer retryCount; 
            private Boolean success; 

            /**
             * Detail.
             */
            public Builder detail(String detail) {
                this.detail = detail;
                return this;
            }

            /**
             * DeviceErrorCode.
             */
            public Builder deviceErrorCode(String deviceErrorCode) {
                this.deviceErrorCode = deviceErrorCode;
                return this;
            }

            /**
             * DeviceErrorMessage.
             */
            public Builder deviceErrorMessage(String deviceErrorMessage) {
                this.deviceErrorMessage = deviceErrorMessage;
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
             * MaxRetryCount.
             */
            public Builder maxRetryCount(Integer maxRetryCount) {
                this.maxRetryCount = maxRetryCount;
                return this;
            }

            /**
             * RetryCount.
             */
            public Builder retryCount(Integer retryCount) {
                this.retryCount = retryCount;
                return this;
            }

            /**
             * Success.
             */
            public Builder success(Boolean success) {
                this.success = success;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
