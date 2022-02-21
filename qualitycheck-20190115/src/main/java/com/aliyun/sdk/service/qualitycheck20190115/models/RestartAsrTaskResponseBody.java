// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.qualitycheck20190115.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RestartAsrTaskResponseBody} extends {@link TeaModel}
 *
 * <p>RestartAsrTaskResponseBody</p>
 */
public class RestartAsrTaskResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("Data")
    private Data data;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private Boolean success;

    private RestartAsrTaskResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RestartAsrTaskResponseBody create() {
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
        private String code; 
        private Data data; 
        private String message; 
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

        public RestartAsrTaskResponseBody build() {
            return new RestartAsrTaskResponseBody(this);
        } 

    } 

    public static class RestartResult extends TeaModel {
        @NameInMap("Data")
        private String data;

        @NameInMap("Message")
        private String message;

        @NameInMap("Success")
        private Boolean success;

        private RestartResult(Builder builder) {
            this.data = builder.data;
            this.message = builder.message;
            this.success = builder.success;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RestartResult create() {
            return builder().build();
        }

        /**
         * @return data
         */
        public String getData() {
            return this.data;
        }

        /**
         * @return message
         */
        public String getMessage() {
            return this.message;
        }

        /**
         * @return success
         */
        public Boolean getSuccess() {
            return this.success;
        }

        public static final class Builder {
            private String data; 
            private String message; 
            private Boolean success; 

            /**
             * Data.
             */
            public Builder data(String data) {
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
             * Success.
             */
            public Builder success(Boolean success) {
                this.success = success;
                return this;
            }

            public RestartResult build() {
                return new RestartResult(this);
            } 

        } 

    }
    public static class Data extends TeaModel {
        @NameInMap("RestartResult")
        private java.util.List < RestartResult> restartResult;

        private Data(Builder builder) {
            this.restartResult = builder.restartResult;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return restartResult
         */
        public java.util.List < RestartResult> getRestartResult() {
            return this.restartResult;
        }

        public static final class Builder {
            private java.util.List < RestartResult> restartResult; 

            /**
             * RestartResult.
             */
            public Builder restartResult(java.util.List < RestartResult> restartResult) {
                this.restartResult = restartResult;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
