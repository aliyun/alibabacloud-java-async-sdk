// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.miniapplcdp20200113.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RunLogicModelResponseBody} extends {@link TeaModel}
 *
 * <p>RunLogicModelResponseBody</p>
 */
public class RunLogicModelResponseBody extends TeaModel {
    @NameInMap("Data")
    private Data data;

    @NameInMap("RequestId")
    private String requestId;

    private RunLogicModelResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RunLogicModelResponseBody create() {
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

        public RunLogicModelResponseBody build() {
            return new RunLogicModelResponseBody(this);
        } 

    } 

    public static class Data extends TeaModel {
        @NameInMap("Body")
        private String body;

        @NameInMap("Headers")
        private java.util.Map < String, String > headers;

        @NameInMap("Status")
        private Integer status;

        private Data(Builder builder) {
            this.body = builder.body;
            this.headers = builder.headers;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return body
         */
        public String getBody() {
            return this.body;
        }

        /**
         * @return headers
         */
        public java.util.Map < String, String > getHeaders() {
            return this.headers;
        }

        /**
         * @return status
         */
        public Integer getStatus() {
            return this.status;
        }

        public static final class Builder {
            private String body; 
            private java.util.Map < String, String > headers; 
            private Integer status; 

            /**
             * Body.
             */
            public Builder body(String body) {
                this.body = body;
                return this;
            }

            /**
             * Headers.
             */
            public Builder headers(java.util.Map < String, String > headers) {
                this.headers = headers;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(Integer status) {
                this.status = status;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
