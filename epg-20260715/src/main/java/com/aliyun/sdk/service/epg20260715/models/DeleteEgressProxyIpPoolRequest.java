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
 * {@link DeleteEgressProxyIpPoolRequest} extends {@link RequestModel}
 *
 * <p>DeleteEgressProxyIpPoolRequest</p>
 */
public class DeleteEgressProxyIpPoolRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    private String clientToken;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("DryRun")
    private Boolean dryRun;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("EgressProxyIpPoolId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String egressProxyIpPoolId;

    private DeleteEgressProxyIpPoolRequest(Builder builder) {
        super(builder);
        this.clientToken = builder.clientToken;
        this.dryRun = builder.dryRun;
        this.egressProxyIpPoolId = builder.egressProxyIpPoolId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteEgressProxyIpPoolRequest create() {
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
     * @return egressProxyIpPoolId
     */
    public String getEgressProxyIpPoolId() {
        return this.egressProxyIpPoolId;
    }

    public static final class Builder extends Request.Builder<DeleteEgressProxyIpPoolRequest, Builder> {
        private String clientToken; 
        private Boolean dryRun; 
        private String egressProxyIpPoolId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteEgressProxyIpPoolRequest request) {
            super(request);
            this.clientToken = request.clientToken;
            this.dryRun = request.dryRun;
            this.egressProxyIpPoolId = request.egressProxyIpPoolId;
        } 

        /**
         * <p>The client token that is used to ensure the idempotence of the request.</p>
         * <p>You can generate the value of this parameter on the client side. Make sure that the value is unique across different requests. The client token can contain only ASCII characters.</p>
         * <blockquote>
         * <p>Note: If you do not specify this parameter, the system automatically uses the RequestId of the API request as the client token. The RequestId of each API request is different.</p>
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
         * <p>Specifies whether to only precheck the request. Valid values:</p>
         * <ul>
         * <li><p><strong>true</strong>: The system sends a check request and does not delete the egress proxy IP address pool. The system checks whether the required parameters are specified, the request format is valid, and the service limits are met. If the check fails, the system returns the corresponding error. If the check succeeds, the system returns the error code DryRunOperation.</p>
         * </li>
         * <li><p><strong>false</strong> (default): The system sends a normal request. If the check succeeds, the system returns an HTTP 2xx status code and performs the operation.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder dryRun(Boolean dryRun) {
            this.putBodyParameter("DryRun", dryRun);
            this.dryRun = dryRun;
            return this;
        }

        /**
         * <p>The ID of the egress proxy IP address pool.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>eppool-gw80d96a96ca0b00****</p>
         */
        public Builder egressProxyIpPoolId(String egressProxyIpPoolId) {
            this.putBodyParameter("EgressProxyIpPoolId", egressProxyIpPoolId);
            this.egressProxyIpPoolId = egressProxyIpPoolId;
            return this;
        }

        @Override
        public DeleteEgressProxyIpPoolRequest build() {
            return new DeleteEgressProxyIpPoolRequest(this);
        } 

    } 

}
