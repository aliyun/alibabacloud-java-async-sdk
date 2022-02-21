// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.drds20190123.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CheckExpandStatusResponseBody} extends {@link TeaModel}
 *
 * <p>CheckExpandStatusResponseBody</p>
 */
public class CheckExpandStatusResponseBody extends TeaModel {
    @NameInMap("Data")
    private Data data;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private Boolean success;

    private CheckExpandStatusResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CheckExpandStatusResponseBody create() {
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
         * Data.
         */
        public Builder data(Data data) {
            this.data = data;
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

        public CheckExpandStatusResponseBody build() {
            return new CheckExpandStatusResponseBody(this);
        } 

    } 

    public static class Data extends TeaModel {
        @NameInMap("IsActive")
        private Boolean isActive;

        @NameInMap("Msg")
        private String msg;

        private Data(Builder builder) {
            this.isActive = builder.isActive;
            this.msg = builder.msg;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return isActive
         */
        public Boolean getIsActive() {
            return this.isActive;
        }

        /**
         * @return msg
         */
        public String getMsg() {
            return this.msg;
        }

        public static final class Builder {
            private Boolean isActive; 
            private String msg; 

            /**
             * IsActive.
             */
            public Builder isActive(Boolean isActive) {
                this.isActive = isActive;
                return this;
            }

            /**
             * Msg.
             */
            public Builder msg(String msg) {
                this.msg = msg;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
