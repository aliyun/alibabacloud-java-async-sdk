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
 * {@link ListGatewayLoadBalancersRequest} extends {@link RequestModel}
 *
 * <p>ListGatewayLoadBalancersRequest</p>
 */
public class ListGatewayLoadBalancersRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("gatewayId")
    private String gatewayId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("all")
    private Boolean all;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("loadBalancerId")
    private String loadBalancerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("network")
    private String network;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("related")
    private Boolean related;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("type")
    private String type;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("vpcId")
    private String vpcId;

    private ListGatewayLoadBalancersRequest(Builder builder) {
        super(builder);
        this.gatewayId = builder.gatewayId;
        this.all = builder.all;
        this.loadBalancerId = builder.loadBalancerId;
        this.network = builder.network;
        this.related = builder.related;
        this.type = builder.type;
        this.vpcId = builder.vpcId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListGatewayLoadBalancersRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return gatewayId
     */
    public String getGatewayId() {
        return this.gatewayId;
    }

    /**
     * @return all
     */
    public Boolean getAll() {
        return this.all;
    }

    /**
     * @return loadBalancerId
     */
    public String getLoadBalancerId() {
        return this.loadBalancerId;
    }

    /**
     * @return network
     */
    public String getNetwork() {
        return this.network;
    }

    /**
     * @return related
     */
    public Boolean getRelated() {
        return this.related;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    /**
     * @return vpcId
     */
    public String getVpcId() {
        return this.vpcId;
    }

    public static final class Builder extends Request.Builder<ListGatewayLoadBalancersRequest, Builder> {
        private String gatewayId; 
        private Boolean all; 
        private String loadBalancerId; 
        private String network; 
        private Boolean related; 
        private String type; 
        private String vpcId; 

        private Builder() {
            super();
        } 

        private Builder(ListGatewayLoadBalancersRequest request) {
            super(request);
            this.gatewayId = request.gatewayId;
            this.all = request.all;
            this.loadBalancerId = request.loadBalancerId;
            this.network = request.network;
            this.related = request.related;
            this.type = request.type;
            this.vpcId = request.vpcId;
        } 

        /**
         * gatewayId.
         */
        public Builder gatewayId(String gatewayId) {
            this.putPathParameter("gatewayId", gatewayId);
            this.gatewayId = gatewayId;
            return this;
        }

        /**
         * all.
         */
        public Builder all(Boolean all) {
            this.putQueryParameter("all", all);
            this.all = all;
            return this;
        }

        /**
         * loadBalancerId.
         */
        public Builder loadBalancerId(String loadBalancerId) {
            this.putQueryParameter("loadBalancerId", loadBalancerId);
            this.loadBalancerId = loadBalancerId;
            return this;
        }

        /**
         * network.
         */
        public Builder network(String network) {
            this.putQueryParameter("network", network);
            this.network = network;
            return this;
        }

        /**
         * related.
         */
        public Builder related(Boolean related) {
            this.putQueryParameter("related", related);
            this.related = related;
            return this;
        }

        /**
         * type.
         */
        public Builder type(String type) {
            this.putQueryParameter("type", type);
            this.type = type;
            return this;
        }

        /**
         * vpcId.
         */
        public Builder vpcId(String vpcId) {
            this.putQueryParameter("vpcId", vpcId);
            this.vpcId = vpcId;
            return this;
        }

        @Override
        public ListGatewayLoadBalancersRequest build() {
            return new ListGatewayLoadBalancersRequest(this);
        } 

    } 

}
