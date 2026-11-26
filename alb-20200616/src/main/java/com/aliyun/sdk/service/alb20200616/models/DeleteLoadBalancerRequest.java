// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alb20200616.models;

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
 * {@link DeleteLoadBalancerRequest} extends {@link RequestModel}
 *
 * <p>DeleteLoadBalancerRequest</p>
 */
public class DeleteLoadBalancerRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    private String clientToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DryRun")
    private Boolean dryRun;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("LoadBalancerId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String loadBalancerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RetainResourceType")
    private java.util.List<String> retainResourceType;

    private DeleteLoadBalancerRequest(Builder builder) {
        super(builder);
        this.clientToken = builder.clientToken;
        this.dryRun = builder.dryRun;
        this.loadBalancerId = builder.loadBalancerId;
        this.retainResourceType = builder.retainResourceType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteLoadBalancerRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return dryRun
     */
    public Boolean getDryRun() {
        return this.dryRun;
    }

    /**
     * @return loadBalancerId
     */
    public String getLoadBalancerId() {
        return this.loadBalancerId;
    }

    /**
     * @return retainResourceType
     */
    public java.util.List<String> getRetainResourceType() {
        return this.retainResourceType;
    }

    public static final class Builder extends Request.Builder<DeleteLoadBalancerRequest, Builder> {
        private String clientToken; 
        private Boolean dryRun; 
        private String loadBalancerId; 
        private java.util.List<String> retainResourceType; 

        private Builder() {
            super();
        } 

        private Builder(DeleteLoadBalancerRequest request) {
            super(request);
            this.clientToken = request.clientToken;
            this.dryRun = request.dryRun;
            this.loadBalancerId = request.loadBalancerId;
            this.retainResourceType = request.retainResourceType;
        } 

        /**
         * <p>The client token that is used to ensure the idempotence of the request.</p>
         * <p>You can generate a parameter value from your client to ensure that the value is unique among different requests. The ClientToken parameter supports only ASCII characters.</p>
         * 
         * <strong>example:</strong>
         * <p>5A2CFF0E-5718-45B5-9D4D-70B3FF3898</p>
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * <p>Specifies whether to only perform a dry run on the request. Valid values:</p>
         * <ul>
         * <li><p><strong>true</strong>: performs a dry run on the request and does not delete the application load balancing instance. The system checks whether required parameters are specified, the request format, and service limits. If the request fails the dry run, the corresponding error is returned. If the request passes the dry run, the <code>DryRunOperation</code> error code is returned.</p>
         * </li>
         * <li><p><strong>false</strong> (default): sends a Normal request. If the request passes the dry run, the <code>HTTP 2xx</code> status code is returned and the operation is performed.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder dryRun(Boolean dryRun) {
            this.putQueryParameter("DryRun", dryRun);
            this.dryRun = dryRun;
            return this;
        }

        /**
         * <p>The application load balancing instance ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>alb-o9ulmq5hgn68jk****</p>
         */
        public Builder loadBalancerId(String loadBalancerId) {
            this.putQueryParameter("LoadBalancerId", loadBalancerId);
            this.loadBalancerId = loadBalancerId;
            return this;
        }

        /**
         * <p>The type of resources that are of automatic creation and attach by application load balancing and need to be retained. When you release an Internet-facing application load balancing instance, you can configure the Settings to eip to retain the EIP that is of automatic creation and attach by application load balancing. Anycast EIPs are not supported for retention, and EIPs that users manually attach are automatically retained.</p>
         */
        public Builder retainResourceType(java.util.List<String> retainResourceType) {
            this.putQueryParameter("RetainResourceType", retainResourceType);
            this.retainResourceType = retainResourceType;
            return this;
        }

        @Override
        public DeleteLoadBalancerRequest build() {
            return new DeleteLoadBalancerRequest(this);
        } 

    } 

}
