// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cgcs20211111.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateSessionBizStatusResponseBody} extends {@link TeaModel}
 *
 * <p>UpdateSessionBizStatusResponseBody</p>
 */
public class UpdateSessionBizStatusResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private UpdateSessionBizStatusResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateSessionBizStatusResponseBody create() {
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

        public UpdateSessionBizStatusResponseBody build() {
            return new UpdateSessionBizStatusResponseBody(this);
        } 

    } 

    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CustomSessionId")
        private String customSessionId;

        @com.aliyun.core.annotation.NameInMap("PlatformSessionId")
        private String platformSessionId;

        private Data(Builder builder) {
            this.customSessionId = builder.customSessionId;
            this.platformSessionId = builder.platformSessionId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return customSessionId
         */
        public String getCustomSessionId() {
            return this.customSessionId;
        }

        /**
         * @return platformSessionId
         */
        public String getPlatformSessionId() {
            return this.platformSessionId;
        }

        public static final class Builder {
            private String customSessionId; 
            private String platformSessionId; 

            /**
             * CustomSessionId.
             */
            public Builder customSessionId(String customSessionId) {
                this.customSessionId = customSessionId;
                return this;
            }

            /**
             * PlatformSessionId.
             */
            public Builder platformSessionId(String platformSessionId) {
                this.platformSessionId = platformSessionId;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
