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
 * {@link DeleteRouteMapRuleRequest} extends {@link RequestModel}
 *
 * <p>DeleteRouteMapRuleRequest</p>
 */
public class DeleteRouteMapRuleRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    private String clientToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DryRun")
    private Boolean dryRun;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RouteMapRuleId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String routeMapRuleId;

    private DeleteRouteMapRuleRequest(Builder builder) {
        super(builder);
        this.clientToken = builder.clientToken;
        this.dryRun = builder.dryRun;
        this.routeMapRuleId = builder.routeMapRuleId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteRouteMapRuleRequest create() {
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
     * @return routeMapRuleId
     */
    public String getRouteMapRuleId() {
        return this.routeMapRuleId;
    }

    public static final class Builder extends Request.Builder<DeleteRouteMapRuleRequest, Builder> {
        private String clientToken; 
        private Boolean dryRun; 
        private String routeMapRuleId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteRouteMapRuleRequest request) {
            super(request);
            this.clientToken = request.clientToken;
            this.dryRun = request.dryRun;
            this.routeMapRuleId = request.routeMapRuleId;
        } 

        /**
         * <p>The client token that is used to ensure the idempotence of the request.</p>
         * <p>You can generate the parameter value from your client to ensure that the value is unique across different requests. The ClientToken parameter supports only ASCII characters.</p>
         * <blockquote>
         * <p>If you do not specify this parameter, the system automatically uses the <strong>RequestId</strong> of the API request as the <strong>ClientToken</strong>. The <strong>RequestId</strong> of each API request may be different.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>02fb3da4-130e-11e9-8e44-001****</p>
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * <p>Specifies whether to only precheck the request. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: sends a check request and does not delete the route map rule. The system checks whether required parameters are specified, the request format, and service limits. If the request fails the check, the corresponding error is returned. If the request passes the check, the DryRunOperation error code is returned.</li>
         * <li><strong>false</strong> (default): sends a regular request and directly deletes the route map rule after the request passes the check.</li>
         * </ul>
         */
        public Builder dryRun(Boolean dryRun) {
            this.putQueryParameter("DryRun", dryRun);
            this.dryRun = dryRun;
            return this;
        }

        /**
         * <p>The ID of the route map rule to delete.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>rmr-0a1b2c3d4e5f6a7b8</p>
         */
        public Builder routeMapRuleId(String routeMapRuleId) {
            this.putQueryParameter("RouteMapRuleId", routeMapRuleId);
            this.routeMapRuleId = routeMapRuleId;
            return this;
        }

        @Override
        public DeleteRouteMapRuleRequest build() {
            return new DeleteRouteMapRuleRequest(this);
        } 

    } 

}
