// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.epg20260715.models;

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
 * {@link DeleteEgressProxyGatewayRequest} extends {@link RequestModel}
 *
 * <p>DeleteEgressProxyGatewayRequest</p>
 */
public class DeleteEgressProxyGatewayRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    private String clientToken;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("DryRun")
    private Boolean dryRun;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("EgressProxyGatewayId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String egressProxyGatewayId;

    private DeleteEgressProxyGatewayRequest(Builder builder) {
        super(builder);
        this.clientToken = builder.clientToken;
        this.dryRun = builder.dryRun;
        this.egressProxyGatewayId = builder.egressProxyGatewayId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteEgressProxyGatewayRequest create() {
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
     * @return egressProxyGatewayId
     */
    public String getEgressProxyGatewayId() {
        return this.egressProxyGatewayId;
    }

    public static final class Builder extends Request.Builder<DeleteEgressProxyGatewayRequest, Builder> {
        private String clientToken; 
        private Boolean dryRun; 
        private String egressProxyGatewayId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteEgressProxyGatewayRequest request) {
            super(request);
            this.clientToken = request.clientToken;
            this.dryRun = request.dryRun;
            this.egressProxyGatewayId = request.egressProxyGatewayId;
        } 

        /**
         * <p>The client token that is used to ensure the idempotence of the request.</p>
         * <p>You can generate the value of this parameter on the client side. Make sure that the value is unique across different requests. The ClientToken parameter supports only ASCII characters.</p>
         * <blockquote>
         * <p>Note: If you do not specify this parameter, the system automatically uses the RequestId of the API request as the ClientToken. The RequestId of each API request is unique.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>5A2CFF0E-5718-45B5-9D4D-70B******</p>
         */
        public Builder clientToken(String clientToken) {
            this.putBodyParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * <p>Specifies whether to perform only a dry run on the request. Valid values:</p>
         * <ul>
         * <li><p><strong>true</strong>: Sends a check request and does not delete the egress proxy gateway instance. The system checks whether required parameters are specified, the request format is valid, and service limits are met. If the check fails, the system returns an error. If the check succeeds, the system returns the error code DryRunOperation.</p>
         * </li>
         * <li><p><strong>false</strong> (default): Sends a regular request. If the check succeeds, the system returns an HTTP 2xx status code and performs the operation.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder dryRun(Boolean dryRun) {
            this.putBodyParameter("DryRun", dryRun);
            this.dryRun = dryRun;
            return this;
        }

        /**
         * <p>The ID of the egress proxy gateway instance.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>epg-gw80bb6a94f835db****</p>
         */
        public Builder egressProxyGatewayId(String egressProxyGatewayId) {
            this.putBodyParameter("EgressProxyGatewayId", egressProxyGatewayId);
            this.egressProxyGatewayId = egressProxyGatewayId;
            return this;
        }

        @Override
        public DeleteEgressProxyGatewayRequest build() {
            return new DeleteEgressProxyGatewayRequest(this);
        } 

    } 

}
