// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mse20190531.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateGatewayAuthConsumerResourceRequest} extends {@link RequestModel}
 *
 * <p>UpdateGatewayAuthConsumerResourceRequest</p>
 */
public class UpdateGatewayAuthConsumerResourceRequest extends Request {
    @Query
    @NameInMap("AcceptLanguage")
    private String acceptLanguage;

    @Query
    @NameInMap("ConsumerId")
    @Validation(required = true)
    private Long consumerId;

    @Query
    @NameInMap("GatewayUniqueId")
    @Validation(required = true)
    private String gatewayUniqueId;

    @Query
    @NameInMap("ResourceList")
    @Validation(required = true)
    private java.util.List < ResourceList> resourceList;

    private UpdateGatewayAuthConsumerResourceRequest(Builder builder) {
        super(builder);
        this.acceptLanguage = builder.acceptLanguage;
        this.consumerId = builder.consumerId;
        this.gatewayUniqueId = builder.gatewayUniqueId;
        this.resourceList = builder.resourceList;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateGatewayAuthConsumerResourceRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return acceptLanguage
     */
    public String getAcceptLanguage() {
        return this.acceptLanguage;
    }

    /**
     * @return consumerId
     */
    public Long getConsumerId() {
        return this.consumerId;
    }

    /**
     * @return gatewayUniqueId
     */
    public String getGatewayUniqueId() {
        return this.gatewayUniqueId;
    }

    /**
     * @return resourceList
     */
    public java.util.List < ResourceList> getResourceList() {
        return this.resourceList;
    }

    public static final class Builder extends Request.Builder<UpdateGatewayAuthConsumerResourceRequest, Builder> {
        private String acceptLanguage; 
        private Long consumerId; 
        private String gatewayUniqueId; 
        private java.util.List < ResourceList> resourceList; 

        private Builder() {
            super();
        } 

        private Builder(UpdateGatewayAuthConsumerResourceRequest request) {
            super(request);
            this.acceptLanguage = request.acceptLanguage;
            this.consumerId = request.consumerId;
            this.gatewayUniqueId = request.gatewayUniqueId;
            this.resourceList = request.resourceList;
        } 

        /**
         * 返回结果显示的语言。取值：zh-CN（默认值）：中文，en-US：英文
         */
        public Builder acceptLanguage(String acceptLanguage) {
            this.putQueryParameter("AcceptLanguage", acceptLanguage);
            this.acceptLanguage = acceptLanguage;
            return this;
        }

        /**
         * ConsumerId.
         */
        public Builder consumerId(Long consumerId) {
            this.putQueryParameter("ConsumerId", consumerId);
            this.consumerId = consumerId;
            return this;
        }

        /**
         * UpdateGatewayAuthConsumerResource
         */
        public Builder gatewayUniqueId(String gatewayUniqueId) {
            this.putQueryParameter("GatewayUniqueId", gatewayUniqueId);
            this.gatewayUniqueId = gatewayUniqueId;
            return this;
        }

        /**
         * ResourceList.
         */
        public Builder resourceList(java.util.List < ResourceList> resourceList) {
            String resourceListShrink = shrink(resourceList, "ResourceList", "json");
            this.putQueryParameter("ResourceList", resourceListShrink);
            this.resourceList = resourceList;
            return this;
        }

        @Override
        public UpdateGatewayAuthConsumerResourceRequest build() {
            return new UpdateGatewayAuthConsumerResourceRequest(this);
        } 

    } 

    public static class ResourceList extends TeaModel {
        @NameInMap("RouteId")
        private Long routeId;

        @NameInMap("RouteName")
        private String routeName;

        private ResourceList(Builder builder) {
            this.routeId = builder.routeId;
            this.routeName = builder.routeName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ResourceList create() {
            return builder().build();
        }

        /**
         * @return routeId
         */
        public Long getRouteId() {
            return this.routeId;
        }

        /**
         * @return routeName
         */
        public String getRouteName() {
            return this.routeName;
        }

        public static final class Builder {
            private Long routeId; 
            private String routeName; 

            /**
             * RouteId.
             */
            public Builder routeId(Long routeId) {
                this.routeId = routeId;
                return this;
            }

            /**
             * RouteName.
             */
            public Builder routeName(String routeName) {
                this.routeName = routeName;
                return this;
            }

            public ResourceList build() {
                return new ResourceList(this);
            } 

        } 

    }
}
