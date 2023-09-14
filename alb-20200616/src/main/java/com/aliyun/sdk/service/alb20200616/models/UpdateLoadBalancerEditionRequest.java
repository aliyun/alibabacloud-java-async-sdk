// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alb20200616.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateLoadBalancerEditionRequest} extends {@link RequestModel}
 *
 * <p>UpdateLoadBalancerEditionRequest</p>
 */
public class UpdateLoadBalancerEditionRequest extends Request {
    @Query
    @NameInMap("ClientToken")
    private String clientToken;

    @Query
    @NameInMap("DryRun")
    private Boolean dryRun;

    @Query
    @NameInMap("LoadBalancerEdition")
    @Validation(required = true)
    private String loadBalancerEdition;

    @Query
    @NameInMap("LoadBalancerId")
    @Validation(required = true)
    private String loadBalancerId;

    private UpdateLoadBalancerEditionRequest(Builder builder) {
        super(builder);
        this.clientToken = builder.clientToken;
        this.dryRun = builder.dryRun;
        this.loadBalancerEdition = builder.loadBalancerEdition;
        this.loadBalancerId = builder.loadBalancerId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateLoadBalancerEditionRequest create() {
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
     * @return loadBalancerEdition
     */
    public String getLoadBalancerEdition() {
        return this.loadBalancerEdition;
    }

    /**
     * @return loadBalancerId
     */
    public String getLoadBalancerId() {
        return this.loadBalancerId;
    }

    public static final class Builder extends Request.Builder<UpdateLoadBalancerEditionRequest, Builder> {
        private String clientToken; 
        private Boolean dryRun; 
        private String loadBalancerEdition; 
        private String loadBalancerId; 

        private Builder() {
            super();
        } 

        private Builder(UpdateLoadBalancerEditionRequest request) {
            super(request);
            this.clientToken = request.clientToken;
            this.dryRun = request.dryRun;
            this.loadBalancerEdition = request.loadBalancerEdition;
            this.loadBalancerId = request.loadBalancerId;
        } 

        /**
         * The client token that is used to ensure the idempotence of the request.
         * <p>
         * 
         * You can use the client to generate the token, but you must make sure that the token is unique among different requests. The token can contain only ASCII characters.
         * 
         * > If you do not specify this parameter, the system automatically uses the **request ID** as the **client token**. The **request ID** may be different for each request.
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * Specifies whether to perform only a dry run, without performing the actual request. Valid values:
         * <p>
         * 
         * *   **true**: performs only a dry run. The system checks the request for potential issues, including missing parameter values, incorrect request syntax, and service limits. If the request fails the dry run, an error message is returned. If the request passes the dry run, the `DryRunOperation` error code is returned.
         * *   **false** (default): performs a dry run and performs the actual request. If the request passes the dry run, a `2xx HTTP` status code is returned and the operation is performed.
         */
        public Builder dryRun(Boolean dryRun) {
            this.putQueryParameter("DryRun", dryRun);
            this.dryRun = dryRun;
            return this;
        }

        /**
         * The edition of the ALB instance. Different editions have different limits and support different billing methods.
         * <p>
         * 
         * *   **Basic**: basic
         * *   **Standard**: standard
         * *   **StandardWithWaf**: WAF-enabled
         */
        public Builder loadBalancerEdition(String loadBalancerEdition) {
            this.putQueryParameter("LoadBalancerEdition", loadBalancerEdition);
            this.loadBalancerEdition = loadBalancerEdition;
            return this;
        }

        /**
         * The ID of the ALB instance.
         */
        public Builder loadBalancerId(String loadBalancerId) {
            this.putQueryParameter("LoadBalancerId", loadBalancerId);
            this.loadBalancerId = loadBalancerId;
            return this;
        }

        @Override
        public UpdateLoadBalancerEditionRequest build() {
            return new UpdateLoadBalancerEditionRequest(this);
        } 

    } 

}
