// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.apig20240327.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetGatewayRouteResponseBody} extends {@link TeaModel}
 *
 * <p>GetGatewayRouteResponseBody</p>
 */
public class GetGatewayRouteResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    private GetGatewayRouteResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetGatewayRouteResponseBody create() {
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

    public static final class Builder {
        private String code; 
        private Data data; 
        private String message; 
        private String requestId; 

        /**
         * code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * requestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetGatewayRouteResponseBody build() {
            return new GetGatewayRouteResponseBody(this);
        } 

    } 

    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("backend")
        private GatewayRouteBackend backend;

        @com.aliyun.core.annotation.NameInMap("createTimestamp")
        private Long createTimestamp;

        @com.aliyun.core.annotation.NameInMap("description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("domainInfo")
        private GatewayRouteDomainInfo domainInfo;

        @com.aliyun.core.annotation.NameInMap("gatewayRouteId")
        private String gatewayRouteId;

        @com.aliyun.core.annotation.NameInMap("match")
        private HttpRouteMatch match;

        @com.aliyun.core.annotation.NameInMap("name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("updateTimestamp")
        private Long updateTimestamp;

        private Data(Builder builder) {
            this.backend = builder.backend;
            this.createTimestamp = builder.createTimestamp;
            this.description = builder.description;
            this.domainInfo = builder.domainInfo;
            this.gatewayRouteId = builder.gatewayRouteId;
            this.match = builder.match;
            this.name = builder.name;
            this.status = builder.status;
            this.updateTimestamp = builder.updateTimestamp;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return backend
         */
        public GatewayRouteBackend getBackend() {
            return this.backend;
        }

        /**
         * @return createTimestamp
         */
        public Long getCreateTimestamp() {
            return this.createTimestamp;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return domainInfo
         */
        public GatewayRouteDomainInfo getDomainInfo() {
            return this.domainInfo;
        }

        /**
         * @return gatewayRouteId
         */
        public String getGatewayRouteId() {
            return this.gatewayRouteId;
        }

        /**
         * @return match
         */
        public HttpRouteMatch getMatch() {
            return this.match;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return updateTimestamp
         */
        public Long getUpdateTimestamp() {
            return this.updateTimestamp;
        }

        public static final class Builder {
            private GatewayRouteBackend backend; 
            private Long createTimestamp; 
            private String description; 
            private GatewayRouteDomainInfo domainInfo; 
            private String gatewayRouteId; 
            private HttpRouteMatch match; 
            private String name; 
            private String status; 
            private Long updateTimestamp; 

            /**
             * backend.
             */
            public Builder backend(GatewayRouteBackend backend) {
                this.backend = backend;
                return this;
            }

            /**
             * createTimestamp.
             */
            public Builder createTimestamp(Long createTimestamp) {
                this.createTimestamp = createTimestamp;
                return this;
            }

            /**
             * description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * domainInfo.
             */
            public Builder domainInfo(GatewayRouteDomainInfo domainInfo) {
                this.domainInfo = domainInfo;
                return this;
            }

            /**
             * gatewayRouteId.
             */
            public Builder gatewayRouteId(String gatewayRouteId) {
                this.gatewayRouteId = gatewayRouteId;
                return this;
            }

            /**
             * match.
             */
            public Builder match(HttpRouteMatch match) {
                this.match = match;
                return this;
            }

            /**
             * name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * updateTimestamp.
             */
            public Builder updateTimestamp(Long updateTimestamp) {
                this.updateTimestamp = updateTimestamp;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
