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
         * <p>The gateway ID. This parameter is used for RAM resource authorization.</p>
         * 
         * <strong>example:</strong>
         * <p>gw-xxxx</p>
         */
        public Builder gatewayId(String gatewayId) {
            this.putPathParameter("gatewayId", gatewayId);
            this.gatewayId = gatewayId;
            return this;
        }

        /**
         * <p>Specifies whether to return all instances in the selectable list mode. This parameter affects pagination and filtering behavior.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder all(Boolean all) {
            this.putQueryParameter("all", all);
            this.all = all;
            return this;
        }

        /**
         * <p>The load balancer instance ID. Specify this parameter to query details of a specific load balancer in the selectable list mode.</p>
         * 
         * <strong>example:</strong>
         * <p>lb-xxxx</p>
         */
        public Builder loadBalancerId(String loadBalancerId) {
            this.putQueryParameter("loadBalancerId", loadBalancerId);
            this.loadBalancerId = loadBalancerId;
            return this;
        }

        /**
         * <p>The network type used to filter results.</p>
         * 
         * <strong>example:</strong>
         * <p>Internet</p>
         */
        public Builder network(String network) {
            this.putQueryParameter("network", network);
            this.network = network;
            return this;
        }

        /**
         * <p>The mode switch. Valid values:</p>
         * <ul>
         * <li>true: Returns the list of load balancers that are already associated with the gateway by reading database relationships.</li>
         * <li>false (default): Returns the selectable list by calling SLB or NLB OpenAPI to filter bindable instances.</li>
         * </ul>
         * <p>Use related=true to retrieve the list of associated load balancers. The default mode (related=false) calls SLB or NLB OpenAPI to filter bindable instances, which may return a 500 error in common scenarios due to backend data issues.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder related(Boolean related) {
            this.putQueryParameter("related", related);
            this.related = related;
            return this;
        }

        /**
         * <p>The load balancer type used to filter results.</p>
         * 
         * <strong>example:</strong>
         * <p>NLB</p>
         */
        public Builder type(String type) {
            this.putQueryParameter("type", type);
            this.type = type;
            return this;
        }

        /**
         * <p>The VPC ID used to filter instances within the specified VPC in the selectable list mode. This parameter is required when type is set to NLB and related is not set to true. Otherwise, the API returns a 500 error.</p>
         * 
         * <strong>example:</strong>
         * <p>vpc-xxxx</p>
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
