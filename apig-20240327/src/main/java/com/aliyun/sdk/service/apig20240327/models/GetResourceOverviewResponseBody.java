// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.apig20240327.models;

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
 * {@link GetResourceOverviewResponseBody} extends {@link TeaModel}
 *
 * <p>GetResourceOverviewResponseBody</p>
 */
public class GetResourceOverviewResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    private GetResourceOverviewResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetResourceOverviewResponseBody create() {
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

    public static final class Builder {
        private String code; 
        private Data data; 
        private String message; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(GetResourceOverviewResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.message = model.message;
            this.requestId = model.requestId;
        } 

        /**
         * <p>Response status code.</p>
         * 
         * <strong>example:</strong>
         * <p>Ok</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>Resource information.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>Response message.</p>
         * 
         * <strong>example:</strong>
         * <p>success</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>Request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>DD19A442-93C5-5C97-AFA0-B9C57EBD781B</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetResourceOverviewResponseBody build() {
            return new GetResourceOverviewResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetResourceOverviewResponseBody} extends {@link TeaModel}
     *
     * <p>GetResourceOverviewResponseBody</p>
     */
    public static class Api extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("publishedCount")
        private Long publishedCount;

        @com.aliyun.core.annotation.NameInMap("totalCount")
        private Long totalCount;

        private Api(Builder builder) {
            this.publishedCount = builder.publishedCount;
            this.totalCount = builder.totalCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Api create() {
            return builder().build();
        }

        /**
         * @return publishedCount
         */
        public Long getPublishedCount() {
            return this.publishedCount;
        }

        /**
         * @return totalCount
         */
        public Long getTotalCount() {
            return this.totalCount;
        }

        public static final class Builder {
            private Long publishedCount; 
            private Long totalCount; 

            private Builder() {
            } 

            private Builder(Api model) {
                this.publishedCount = model.publishedCount;
                this.totalCount = model.totalCount;
            } 

            /**
             * <p>Number of published APIs.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder publishedCount(Long publishedCount) {
                this.publishedCount = publishedCount;
                return this;
            }

            /**
             * <p>Number of APIs.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder totalCount(Long totalCount) {
                this.totalCount = totalCount;
                return this;
            }

            public Api build() {
                return new Api(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetResourceOverviewResponseBody} extends {@link TeaModel}
     *
     * <p>GetResourceOverviewResponseBody</p>
     */
    public static class Gateway extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("runningCount")
        private Long runningCount;

        @com.aliyun.core.annotation.NameInMap("totalCount")
        private Long totalCount;

        private Gateway(Builder builder) {
            this.runningCount = builder.runningCount;
            this.totalCount = builder.totalCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Gateway create() {
            return builder().build();
        }

        /**
         * @return runningCount
         */
        public Long getRunningCount() {
            return this.runningCount;
        }

        /**
         * @return totalCount
         */
        public Long getTotalCount() {
            return this.totalCount;
        }

        public static final class Builder {
            private Long runningCount; 
            private Long totalCount; 

            private Builder() {
            } 

            private Builder(Gateway model) {
                this.runningCount = model.runningCount;
                this.totalCount = model.totalCount;
            } 

            /**
             * <p>Number of running gateways.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder runningCount(Long runningCount) {
                this.runningCount = runningCount;
                return this;
            }

            /**
             * <p>Number of gateway instances.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder totalCount(Long totalCount) {
                this.totalCount = totalCount;
                return this;
            }

            public Gateway build() {
                return new Gateway(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetResourceOverviewResponseBody} extends {@link TeaModel}
     *
     * <p>GetResourceOverviewResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("api")
        private Api api;

        @com.aliyun.core.annotation.NameInMap("gateway")
        private Gateway gateway;

        private Data(Builder builder) {
            this.api = builder.api;
            this.gateway = builder.gateway;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return api
         */
        public Api getApi() {
            return this.api;
        }

        /**
         * @return gateway
         */
        public Gateway getGateway() {
            return this.gateway;
        }

        public static final class Builder {
            private Api api; 
            private Gateway gateway; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.api = model.api;
                this.gateway = model.gateway;
            } 

            /**
             * <p>API information.</p>
             */
            public Builder api(Api api) {
                this.api = api;
                return this;
            }

            /**
             * <p>Gateway information.</p>
             */
            public Builder gateway(Gateway gateway) {
                this.gateway = gateway;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
