// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20240518.models;

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
 * {@link GetRouteResponseBody} extends {@link TeaModel}
 *
 * <p>GetRouteResponseBody</p>
 */
public class GetRouteResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Route")
    private Route route;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private GetRouteResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.route = builder.route;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetRouteResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return route
     */
    public Route getRoute() {
        return this.route;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String requestId; 
        private Route route; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(GetRouteResponseBody model) {
            this.requestId = model.requestId;
            this.route = model.route;
            this.success = model.success;
        } 

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>6A6CBE87-9F91-1323-B680-E7A7065XXXXX</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The information about the route.</p>
         */
        public Builder route(Route route) {
            this.route = route;
            return this;
        }

        /**
         * <p>Indicates whether the request was successful.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public GetRouteResponseBody build() {
            return new GetRouteResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetRouteResponseBody} extends {@link TeaModel}
     *
     * <p>GetRouteResponseBody</p>
     */
    public static class Route extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private Long createTime;

        @com.aliyun.core.annotation.NameInMap("DestinationCidr")
        private String destinationCidr;

        @com.aliyun.core.annotation.NameInMap("Id")
        private Long id;

        @com.aliyun.core.annotation.NameInMap("NetworkId")
        private Long networkId;

        @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
        private String resourceGroupId;

        @com.aliyun.core.annotation.NameInMap("ResourceId")
        private String resourceId;

        private Route(Builder builder) {
            this.createTime = builder.createTime;
            this.destinationCidr = builder.destinationCidr;
            this.id = builder.id;
            this.networkId = builder.networkId;
            this.resourceGroupId = builder.resourceGroupId;
            this.resourceId = builder.resourceId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Route create() {
            return builder().build();
        }

        /**
         * @return createTime
         */
        public Long getCreateTime() {
            return this.createTime;
        }

        /**
         * @return destinationCidr
         */
        public String getDestinationCidr() {
            return this.destinationCidr;
        }

        /**
         * @return id
         */
        public Long getId() {
            return this.id;
        }

        /**
         * @return networkId
         */
        public Long getNetworkId() {
            return this.networkId;
        }

        /**
         * @return resourceGroupId
         */
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        /**
         * @return resourceId
         */
        public String getResourceId() {
            return this.resourceId;
        }

        public static final class Builder {
            private Long createTime; 
            private String destinationCidr; 
            private Long id; 
            private Long networkId; 
            private String resourceGroupId; 
            private String resourceId; 

            private Builder() {
            } 

            private Builder(Route model) {
                this.createTime = model.createTime;
                this.destinationCidr = model.destinationCidr;
                this.id = model.id;
                this.networkId = model.networkId;
                this.resourceGroupId = model.resourceGroupId;
                this.resourceId = model.resourceId;
            } 

            /**
             * <p>The time when the route was created. The value is a 64-bit timestamp.</p>
             * 
             * <strong>example:</strong>
             * <p>1727055811000</p>
             */
            public Builder createTime(Long createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The CIDR block of the destination-based route.</p>
             * 
             * <strong>example:</strong>
             * <p>192.168.0.0/16</p>
             */
            public Builder destinationCidr(String destinationCidr) {
                this.destinationCidr = destinationCidr;
                return this;
            }

            /**
             * <p>The route ID.</p>
             * 
             * <strong>example:</strong>
             * <p>1000</p>
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * <p>The network ID.</p>
             * 
             * <strong>example:</strong>
             * <p>1000</p>
             */
            public Builder networkId(Long networkId) {
                this.networkId = networkId;
                return this;
            }

            /**
             * <p>The resource group ID.</p>
             * 
             * <strong>example:</strong>
             * <p>Serverless_res_group_524257424564736_6831777003XXXXX</p>
             */
            public Builder resourceGroupId(String resourceGroupId) {
                this.resourceGroupId = resourceGroupId;
                return this;
            }

            /**
             * <p>The network resource ID.</p>
             * 
             * <strong>example:</strong>
             * <p>ns-679XXXXX</p>
             */
            public Builder resourceId(String resourceId) {
                this.resourceId = resourceId;
                return this;
            }

            public Route build() {
                return new Route(this);
            } 

        } 

    }
}
