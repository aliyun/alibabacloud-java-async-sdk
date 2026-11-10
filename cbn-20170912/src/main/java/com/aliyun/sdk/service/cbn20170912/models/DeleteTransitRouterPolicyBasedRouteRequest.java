// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cbn20170912.models;

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
 * {@link DeleteTransitRouterPolicyBasedRouteRequest} extends {@link RequestModel}
 *
 * <p>DeleteTransitRouterPolicyBasedRouteRequest</p>
 */
public class DeleteTransitRouterPolicyBasedRouteRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    private String clientToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DryRun")
    private Boolean dryRun;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PolicyBasedRouteId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String policyBasedRouteId;

    private DeleteTransitRouterPolicyBasedRouteRequest(Builder builder) {
        super(builder);
        this.clientToken = builder.clientToken;
        this.dryRun = builder.dryRun;
        this.policyBasedRouteId = builder.policyBasedRouteId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteTransitRouterPolicyBasedRouteRequest create() {
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
     * @return policyBasedRouteId
     */
    public String getPolicyBasedRouteId() {
        return this.policyBasedRouteId;
    }

    public static final class Builder extends Request.Builder<DeleteTransitRouterPolicyBasedRouteRequest, Builder> {
        private String clientToken; 
        private Boolean dryRun; 
        private String policyBasedRouteId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteTransitRouterPolicyBasedRouteRequest request) {
            super(request);
            this.clientToken = request.clientToken;
            this.dryRun = request.dryRun;
            this.policyBasedRouteId = request.policyBasedRouteId;
        } 

        /**
         * <p>The client token that is used to ensure the idempotence of the request. You can use the client to generate the value, and you must ensure that the value is unique among different requests. The client token can contain only ASCII characters.</p>
         * <blockquote>
         * <p>If you do not specify this parameter, the system automatically uses the <strong>RequestId</strong> of the API request as the <strong>ClientToken</strong>. The <strong>RequestId</strong> of each API request may be different.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>123e4567-e89b-12d3-a456-42665544****</p>
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * <p>Specifies whether to perform a dry run on the deletion request. The dry run includes permission and instance status checks. Valid values:</p>
         * <ul>
         * <li><strong>false</strong> (default): sends a normal request. After the request passes the dry run, the policy-based route is deleted.</li>
         * <li><strong>true</strong>: sends a dry run request. The system only performs the dry run and does not delete the policy-based route. The system checks whether required parameters are specified and whether the request format is valid. If the request fails the dry run, the system returns an error. If the request passes the dry run, the system returns the <code>DryRunOperation</code> error code.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder dryRun(Boolean dryRun) {
            this.putQueryParameter("DryRun", dryRun);
            this.dryRun = dryRun;
            return this;
        }

        /**
         * <p>The instance ID of the policy-based routing rule.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>pbr-123abczcx</p>
         */
        public Builder policyBasedRouteId(String policyBasedRouteId) {
            this.putQueryParameter("PolicyBasedRouteId", policyBasedRouteId);
            this.policyBasedRouteId = policyBasedRouteId;
            return this;
        }

        @Override
        public DeleteTransitRouterPolicyBasedRouteRequest build() {
            return new DeleteTransitRouterPolicyBasedRouteRequest(this);
        } 

    } 

}
