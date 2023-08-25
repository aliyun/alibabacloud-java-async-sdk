// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.oceanbasepro20190901.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SwitchoverInstanceResponseBody} extends {@link TeaModel}
 *
 * <p>SwitchoverInstanceResponseBody</p>
 */
public class SwitchoverInstanceResponseBody extends TeaModel {
    @NameInMap("Data")
    private Data data;

    @NameInMap("RequestId")
    private String requestId;

    private SwitchoverInstanceResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SwitchoverInstanceResponseBody create() {
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

    public static final class Builder {
        private Data data; 
        private String requestId; 

        /**
         * The list of data for the switchover.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public SwitchoverInstanceResponseBody build() {
            return new SwitchoverInstanceResponseBody(this);
        } 

    } 

    public static class Data extends TeaModel {
        @NameInMap("Message")
        private String message;

        @NameInMap("Success")
        private Boolean success;

        private Data(Builder builder) {
            this.message = builder.message;
            this.success = builder.success;
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
         * @return success
         */
        public Boolean getSuccess() {
            return this.success;
        }

        public static final class Builder {
            private String message; 
            private Boolean success; 

            /**
             * The message of the switchover.
             */
            public Builder message(String message) {
                this.message = message;
                return this;
            }

            /**
             * Whether the switchover is successful.
             * <p>
             * - true: the switchover succeeded.
             * - false: the switchover failed.
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
