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
         * ManagementRoutes.
         */
        public Builder managementRoutes(java.util.List < ManagementRoutes> managementRoutes) {
            this.managementRoutes = managementRoutes;
            return this;
        }

        /**
         * RequestId.
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
            private String namespace; 
            private Integer priority; 
            private String routeName; 
            private String routePath; 
            private Integer status; 

            /**
             * ASMGatewayName.
             */
            public Builder ASMGatewayName(String ASMGatewayName) {
                this.ASMGatewayName = ASMGatewayName;
                return this;
            }

            /**
             * Description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * Namespace.
             */
            public Builder namespace(String namespace) {
                this.namespace = namespace;
                return this;
            }

            /**
             * Priority.
             */
            public Builder priority(Integer priority) {
                this.priority = priority;
                return this;
            }

            /**
             * RouteName.
             */
            public Builder routeName(String routeName) {
                this.routeName = routeName;
                return this;
            }

            /**
             * RoutePath.
             */
            public Builder routePath(String routePath) {
                this.routePath = routePath;
                return this;
            }

            /**
             * Status.
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
