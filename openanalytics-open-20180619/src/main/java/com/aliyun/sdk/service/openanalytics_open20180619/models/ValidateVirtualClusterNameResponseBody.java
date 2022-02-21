// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.openanalytics_open20180619.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ValidateVirtualClusterNameResponseBody} extends {@link TeaModel}
 *
 * <p>ValidateVirtualClusterNameResponseBody</p>
 */
public class ValidateVirtualClusterNameResponseBody extends TeaModel {
    @NameInMap("Data")
    private Data data;

    @NameInMap("RequestId")
    private String requestId;

    private ValidateVirtualClusterNameResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ValidateVirtualClusterNameResponseBody create() {
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

        public ValidateVirtualClusterNameResponseBody build() {
            return new ValidateVirtualClusterNameResponseBody(this);
        } 

    } 

    public static class Data extends TeaModel {
        @NameInMap("Legal")
        private String legal;

        @NameInMap("Message")
        private String message;

        private Data(Builder builder) {
            this.legal = builder.legal;
            this.message = builder.message;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return legal
         */
        public String getLegal() {
            return this.legal;
        }

        /**
         * @return message
         */
        public String getMessage() {
            return this.message;
        }

        public static final class Builder {
            private String legal; 
            private String message; 

            /**
             * Legal.
             */
            public Builder legal(String legal) {
                this.legal = legal;
                return this;
            }

            /**
             * Message.
             */
            public Builder message(String message) {
                this.message = message;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
