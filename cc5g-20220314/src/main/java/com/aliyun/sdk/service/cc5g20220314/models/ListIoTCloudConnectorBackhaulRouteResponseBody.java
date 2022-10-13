// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cc5g20220314.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListIoTCloudConnectorBackhaulRouteResponseBody} extends {@link TeaModel}
 *
 * <p>ListIoTCloudConnectorBackhaulRouteResponseBody</p>
 */
public class ListIoTCloudConnectorBackhaulRouteResponseBody extends TeaModel {
    @NameInMap("NetLinkId")
    private String netLinkId;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Routes")
    private java.util.List < Routes> routes;

    private ListIoTCloudConnectorBackhaulRouteResponseBody(Builder builder) {
        this.netLinkId = builder.netLinkId;
        this.requestId = builder.requestId;
        this.routes = builder.routes;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListIoTCloudConnectorBackhaulRouteResponseBody create() {
        return builder().build();
    }

    /**
     * @return netLinkId
     */
    public String getNetLinkId() {
        return this.netLinkId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return routes
     */
    public java.util.List < Routes> getRoutes() {
        return this.routes;
    }

    public static final class Builder {
        private String netLinkId; 
        private String requestId; 
        private java.util.List < Routes> routes; 

        /**
         * Id of the request
         */
        public Builder netLinkId(String netLinkId) {
            this.netLinkId = netLinkId;
            return this;
        }

        /**
         * Id of the request
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * 数组，返回示例目录。
         */
        public Builder routes(java.util.List < Routes> routes) {
            this.routes = routes;
            return this;
        }

        public ListIoTCloudConnectorBackhaulRouteResponseBody build() {
            return new ListIoTCloudConnectorBackhaulRouteResponseBody(this);
        } 

    } 

    public static class Routes extends TeaModel {
        @NameInMap("Description")
        private String description;

        @NameInMap("DestinationCidrBlock")
        private String destinationCidrBlock;

        @NameInMap("NextHopId")
        private String nextHopId;

        @NameInMap("NextHopType")
        private String nextHopType;

        @NameInMap("Status")
        private String status;

        private Routes(Builder builder) {
            this.description = builder.description;
            this.destinationCidrBlock = builder.destinationCidrBlock;
            this.nextHopId = builder.nextHopId;
            this.nextHopType = builder.nextHopType;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Routes create() {
            return builder().build();
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return destinationCidrBlock
         */
        public String getDestinationCidrBlock() {
            return this.destinationCidrBlock;
        }

        /**
         * @return nextHopId
         */
        public String getNextHopId() {
            return this.nextHopId;
        }

        /**
         * @return nextHopType
         */
        public String getNextHopType() {
            return this.nextHopType;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private String description; 
            private String destinationCidrBlock; 
            private String nextHopId; 
            private String nextHopType; 
            private String status; 

            /**
             * 代表创建时间的资源属性字段
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * 代表资源名称的资源属性字段
             */
            public Builder destinationCidrBlock(String destinationCidrBlock) {
                this.destinationCidrBlock = destinationCidrBlock;
                return this;
            }

            /**
             * 代表创建时间的资源属性字段
             */
            public Builder nextHopId(String nextHopId) {
                this.nextHopId = nextHopId;
                return this;
            }

            /**
             * 代表创建时间的资源属性字段
             */
            public Builder nextHopType(String nextHopType) {
                this.nextHopType = nextHopType;
                return this;
            }

            /**
             * 代表创建时间的资源属性字段
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public Routes build() {
                return new Routes(this);
            } 

        } 

    }
}
