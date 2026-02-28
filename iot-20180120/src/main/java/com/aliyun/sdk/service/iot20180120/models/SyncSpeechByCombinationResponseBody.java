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
 * {@link SyncSpeechByCombinationResponseBody} extends {@link TeaModel}
 *
 * <p>SyncSpeechByCombinationResponseBody</p>
 */
public class SyncSpeechByCombinationResponseBody extends TeaModel {
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

        private Builder(SyncSpeechByCombinationResponseBody model) {
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

        public SyncSpeechByCombinationResponseBody build() {
            return new SyncSpeechByCombinationResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link SyncSpeechByCombinationResponseBody} extends {@link TeaModel}
     *
     * <p>SyncSpeechByCombinationResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Detail")
        private String detail;

        @com.aliyun.core.annotation.NameInMap("DeviceErrorCode")
        private String deviceErrorCode;

        @com.aliyun.core.annotation.NameInMap("DeviceErrorMessage")
        private String deviceErrorMessage;

        @com.aliyun.core.annotation.NameInMap("Id")
        private String id;

        @com.aliyun.core.annotation.NameInMap("MaxRetryCount")
        private Integer maxRetryCount;

        @com.aliyun.core.annotation.NameInMap("RetryCount")
        private Integer retryCount;

        @com.aliyun.core.annotation.NameInMap("Success")
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

            private Builder() {
            } 

            private Builder(Data model) {
                this.detail = model.detail;
                this.deviceErrorCode = model.deviceErrorCode;
                this.deviceErrorMessage = model.deviceErrorMessage;
                this.id = model.id;
                this.maxRetryCount = model.maxRetryCount;
                this.retryCount = model.retryCount;
                this.success = model.success;
            } 

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
