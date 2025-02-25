// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mse20190531.models;

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
 * {@link UpdateGatewayAuthConsumerResourceRequest} extends {@link RequestModel}
 *
 * <p>UpdateGatewayAuthConsumerResourceRequest</p>
 */
public class UpdateGatewayAuthConsumerResourceRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AcceptLanguage")
    private String acceptLanguage;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ConsumerId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long consumerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("GatewayUniqueId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String gatewayUniqueId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceList")
    private java.util.List<ResourceList> resourceList;

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
    public java.util.List<ResourceList> getResourceList() {
        return this.resourceList;
    }

    public static final class Builder extends Request.Builder<UpdateGatewayAuthConsumerResourceRequest, Builder> {
        private String acceptLanguage; 
        private Long consumerId; 
        private String gatewayUniqueId; 
        private java.util.List<ResourceList> resourceList; 

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
         * <p>The language of the response. Valid values:</p>
         * <ul>
         * <li>zh: Chinese</li>
         * <li>en: English</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>zh</p>
         */
        public Builder acceptLanguage(String acceptLanguage) {
            this.putQueryParameter("AcceptLanguage", acceptLanguage);
            this.acceptLanguage = acceptLanguage;
            return this;
        }

        /**
         * <p>The gateway authentication consumer ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        public Builder consumerId(Long consumerId) {
            this.putQueryParameter("ConsumerId", consumerId);
            this.consumerId = consumerId;
            return this;
        }

        /**
         * <p>The unique ID of the gateway.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>gw-3f97e2989c344f35ab3fd62b19f1****</p>
         */
        public Builder gatewayUniqueId(String gatewayUniqueId) {
            this.putQueryParameter("GatewayUniqueId", gatewayUniqueId);
            this.gatewayUniqueId = gatewayUniqueId;
            return this;
        }

        /**
         * <p>The gateway authentication consumer ID.</p>
         */
        public Builder resourceList(java.util.List<ResourceList> resourceList) {
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

    /**
     * 
     * {@link UpdateGatewayAuthConsumerResourceRequest} extends {@link TeaModel}
     *
     * <p>UpdateGatewayAuthConsumerResourceRequest</p>
     */
    public static class ResourceList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("RouteId")
        private Long routeId;

        @com.aliyun.core.annotation.NameInMap("RouteName")
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
             * <p>The route ID.</p>
             * 
             * <strong>example:</strong>
             * <p>7816</p>
             */
            public Builder routeId(Long routeId) {
                this.routeId = routeId;
                return this;
            }

            /**
             * <p>The name of the route.</p>
             * 
             * <strong>example:</strong>
             * <p>helo</p>
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
