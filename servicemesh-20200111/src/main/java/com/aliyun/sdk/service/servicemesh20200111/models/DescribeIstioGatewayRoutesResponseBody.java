// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.servicemesh20200111.models;

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
 * {@link DescribeIstioGatewayRoutesResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeIstioGatewayRoutesResponseBody</p>
 */
public class DescribeIstioGatewayRoutesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ManagementRoutes")
    private java.util.List<ManagementRoutes> managementRoutes;

    @com.aliyun.core.annotation.NameInMap("RequestId")
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

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return managementRoutes
     */
    public java.util.List<ManagementRoutes> getManagementRoutes() {
        return this.managementRoutes;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List<ManagementRoutes> managementRoutes; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(DescribeIstioGatewayRoutesResponseBody model) {
            this.managementRoutes = model.managementRoutes;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The routing rules.</p>
         */
        public Builder managementRoutes(java.util.List<ManagementRoutes> managementRoutes) {
            this.managementRoutes = managementRoutes;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>31d3a0f0-07ed-4f6e-9004-1804498c****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeIstioGatewayRoutesResponseBody build() {
            return new DescribeIstioGatewayRoutesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeIstioGatewayRoutesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeIstioGatewayRoutesResponseBody</p>
     */
    public static class ManagementRoutes extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ASMGatewayName")
        private String ASMGatewayName;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("DestinationHost")
        private java.util.List<String> destinationHost;

        @com.aliyun.core.annotation.NameInMap("DestinationSubSet")
        private java.util.List<String> destinationSubSet;

        @com.aliyun.core.annotation.NameInMap("Namespace")
        private String namespace;

        @com.aliyun.core.annotation.NameInMap("Priority")
        private Integer priority;

        @com.aliyun.core.annotation.NameInMap("RouteName")
        private String routeName;

        @com.aliyun.core.annotation.NameInMap("RoutePath")
        private String routePath;

        @com.aliyun.core.annotation.NameInMap("Status")
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
        public java.util.List<String> getDestinationHost() {
            return this.destinationHost;
        }

        /**
         * @return destinationSubSet
         */
        public java.util.List<String> getDestinationSubSet() {
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
            private java.util.List<String> destinationHost; 
            private java.util.List<String> destinationSubSet; 
            private String namespace; 
            private Integer priority; 
            private String routeName; 
            private String routePath; 
            private Integer status; 

            private Builder() {
            } 

            private Builder(ManagementRoutes model) {
                this.ASMGatewayName = model.ASMGatewayName;
                this.description = model.description;
                this.destinationHost = model.destinationHost;
                this.destinationSubSet = model.destinationSubSet;
                this.namespace = model.namespace;
                this.priority = model.priority;
                this.routeName = model.routeName;
                this.routePath = model.routePath;
                this.status = model.status;
            } 

            /**
             * <p>The name of the ASM gateway.</p>
             * 
             * <strong>example:</strong>
             * <p>ingressgateway</p>
             */
            public Builder ASMGatewayName(String ASMGatewayName) {
                this.ASMGatewayName = ASMGatewayName;
                return this;
            }

            /**
             * <p>The description of the routing rule.</p>
             * 
             * <strong>example:</strong>
             * <p>demo route</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>Destination hosts list.</p>
             */
            public Builder destinationHost(java.util.List<String> destinationHost) {
                this.destinationHost = destinationHost;
                return this;
            }

            /**
             * <p>Destination subset list.</p>
             */
            public Builder destinationSubSet(java.util.List<String> destinationSubSet) {
                this.destinationSubSet = destinationSubSet;
                return this;
            }

            /**
             * <p>The namespace.</p>
             * 
             * <strong>example:</strong>
             * <p>istio-demo</p>
             */
            public Builder namespace(String namespace) {
                this.namespace = namespace;
                return this;
            }

            /**
             * <p>The priority of the routing rule. The value of this parameter is an integer. A smaller value indicates a higher priority.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder priority(Integer priority) {
                this.priority = priority;
                return this;
            }

            /**
             * <p>The name of the routing rule.</p>
             * 
             * <strong>example:</strong>
             * <p>http-route</p>
             */
            public Builder routeName(String routeName) {
                this.routeName = routeName;
                return this;
            }

            /**
             * <p>The path that is used to match request URLs.</p>
             * 
             * <strong>example:</strong>
             * <p>/reviews/v1</p>
             */
            public Builder routePath(String routePath) {
                this.routePath = routePath;
                return this;
            }

            /**
             * <p>The status of the routing rule. Valid values:</p>
             * <ul>
             * <li><code>0</code>: The routing rule is valid.</li>
             * <li><code>1</code>: The routing rule is invalid.</li>
             * <li><code>2</code>: An error occurs during the creation or update of the routing rule.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>1</p>
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
