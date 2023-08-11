// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.servicemesh20200111.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeIstioGatewayRoutesResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeIstioGatewayRoutesResponseBody</p>
 */
public class DescribeIstioGatewayRoutesResponseBody extends TeaModel {
    @NameInMap("ManagementRoutes")
    private java.util.List < ManagementRoutes> managementRoutes;

    @NameInMap("RequestId")
    private String requestId;

    private DescribeIstioGatewayRoutesResponseBody(Builder builder) {
        this.managementRoutes = builder.managementRoutes;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeIstioGatewayRoutesResponseBody create() {
        return builder().build();
    }

    /**
     * @return managementRoutes
     */
    public java.util.List < ManagementRoutes> getManagementRoutes() {
        return this.managementRoutes;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List < ManagementRoutes> managementRoutes; 
        private String requestId; 

        /**
         * The routing rules.
         */
        public Builder managementRoutes(java.util.List < ManagementRoutes> managementRoutes) {
            this.managementRoutes = managementRoutes;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeIstioGatewayRoutesResponseBody build() {
            return new DescribeIstioGatewayRoutesResponseBody(this);
        } 

    } 

    public static class ManagementRoutes extends TeaModel {
        @NameInMap("ASMGatewayName")
        private String ASMGatewayName;

        @NameInMap("Description")
        private String description;

        @NameInMap("DestinationHost")
        private java.util.List < String > destinationHost;

        @NameInMap("DestinationSubSet")
        private java.util.List < String > destinationSubSet;

        @NameInMap("Namespace")
        private String namespace;

        @NameInMap("Priority")
        private Integer priority;

        @NameInMap("RouteName")
        private String routeName;

        @NameInMap("RoutePath")
        private String routePath;

        @NameInMap("Status")
        private Integer status;

        private ManagementRoutes(Builder builder) {
            this.ASMGatewayName = builder.ASMGatewayName;
            this.description = builder.description;
            this.destinationHost = builder.destinationHost;
            this.destinationSubSet = builder.destinationSubSet;
            this.namespace = builder.namespace;
            this.priority = builder.priority;
            this.routeName = builder.routeName;
            this.routePath = builder.routePath;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ManagementRoutes create() {
            return builder().build();
        }

        /**
         * @return ASMGatewayName
         */
        public String getASMGatewayName() {
            return this.ASMGatewayName;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return destinationHost
         */
        public java.util.List < String > getDestinationHost() {
            return this.destinationHost;
        }

        /**
         * @return destinationSubSet
         */
        public java.util.List < String > getDestinationSubSet() {
            return this.destinationSubSet;
        }

        /**
         * @return namespace
         */
        public String getNamespace() {
            return this.namespace;
        }

        /**
         * @return priority
         */
        public Integer getPriority() {
            return this.priority;
        }

        /**
         * @return routeName
         */
        public String getRouteName() {
            return this.routeName;
        }

        /**
         * @return routePath
         */
        public String getRoutePath() {
            return this.routePath;
        }

        /**
         * @return status
         */
        public Integer getStatus() {
            return this.status;
        }

        public static final class Builder {
            private String ASMGatewayName; 
            private String description; 
            private java.util.List < String > destinationHost; 
            private java.util.List < String > destinationSubSet; 
            private String namespace; 
            private Integer priority; 
            private String routeName; 
            private String routePath; 
            private Integer status; 

            /**
             * The name of the ASM gateway.
             */
            public Builder ASMGatewayName(String ASMGatewayName) {
                this.ASMGatewayName = ASMGatewayName;
                return this;
            }

            /**
             * The description of the routing rule.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * DestinationHost.
             */
            public Builder destinationHost(java.util.List < String > destinationHost) {
                this.destinationHost = destinationHost;
                return this;
            }

            /**
             * DestinationSubSet.
             */
            public Builder destinationSubSet(java.util.List < String > destinationSubSet) {
                this.destinationSubSet = destinationSubSet;
                return this;
            }

            /**
             * The namespace.
             */
            public Builder namespace(String namespace) {
                this.namespace = namespace;
                return this;
            }

            /**
             * The priority of the routing rule. The value of this parameter is an integer. A smaller value indicates a higher priority.
             */
            public Builder priority(Integer priority) {
                this.priority = priority;
                return this;
            }

            /**
             * The name of the routing rule.
             */
            public Builder routeName(String routeName) {
                this.routeName = routeName;
                return this;
            }

            /**
             * The path that is used to match request URLs.
             */
            public Builder routePath(String routePath) {
                this.routePath = routePath;
                return this;
            }

            /**
             * The status of the routing rule. Valid values:
             * <p>
             * 
             * *   `0`: The routing rule is valid.
             * *   `1`: The routing rule is invalid.
             * *   `2`: An error occurs during the creation or update of the routing rule.
             */
            public Builder status(Integer status) {
                this.status = status;
                return this;
            }

            public ManagementRoutes build() {
                return new ManagementRoutes(this);
            } 

        } 

    }
}
