// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20200518.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link StartDISyncInstanceResponseBody} extends {@link TeaModel}
 *
 * <p>StartDISyncInstanceResponseBody</p>
 */
public class StartDISyncInstanceResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private StartDISyncInstanceResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static StartDISyncInstanceResponseBody create() {
        return builder().build();
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
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
        private String requestId; 
        private Boolean success; 

        /**
         * Indicates whether the real-time synchronization node or the data synchronization solution is started. Valid values:
         * <p>
         * 
         * *   success: The real-time synchronization node or the data synchronization solution is started.
         * *   fail: The real-time synchronization node or the data synchronization solution fails to be started. You can troubleshoot the issue based on the provided cause.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * The result returned for the start.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The ID of the request. You can locate logs and troubleshoot issues based on the ID.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public StartDISyncInstanceResponseBody build() {
            return new StartDISyncInstanceResponseBody(this);
        } 

    } 

    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Message")
        private String message;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        private Data(Builder builder) {
            this.message = builder.message;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return message
         */
        public String getMessage() {
            return this.message;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private String message; 
            private String status; 

            /**
             * Message.
             */
            public Builder message(String message) {
                this.message = message;
                return this;
            }

            /**
             * The reason why the real-time synchronization node or the data synchronization solution fails to be started.
             * <p>
             * 
             * If the real-time synchronization node or the data synchronization solution is started, the value null is returned.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
