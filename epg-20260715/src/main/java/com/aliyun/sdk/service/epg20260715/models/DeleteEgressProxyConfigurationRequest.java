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
 * {@link DeleteEgressProxyConfigurationRequest} extends {@link RequestModel}
 *
 * <p>DeleteEgressProxyConfigurationRequest</p>
 */
public class DeleteEgressProxyConfigurationRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    private String clientToken;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("DryRun")
    private Boolean dryRun;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("EgressProxyConfigurationId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String egressProxyConfigurationId;

    private DeleteEgressProxyConfigurationRequest(Builder builder) {
        super(builder);
        this.clientToken = builder.clientToken;
        this.dryRun = builder.dryRun;
        this.egressProxyConfigurationId = builder.egressProxyConfigurationId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteEgressProxyConfigurationRequest create() {
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
     * @return egressProxyConfigurationId
     */
    public String getEgressProxyConfigurationId() {
        return this.egressProxyConfigurationId;
    }

    public static final class Builder extends Request.Builder<DeleteEgressProxyConfigurationRequest, Builder> {
        private String clientToken; 
        private Boolean dryRun; 
        private String egressProxyConfigurationId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteEgressProxyConfigurationRequest request) {
            super(request);
            this.clientToken = request.clientToken;
            this.dryRun = request.dryRun;
            this.egressProxyConfigurationId = request.egressProxyConfigurationId;
        } 

        /**
         * <p>The client token that is used to ensure the idempotence of the request.</p>
         * <p>You can generate the value of this parameter on the client side. The value must be unique across different requests. The client token can contain only ASCII characters.</p>
         * <blockquote>
         * <p>Note If you do not specify this parameter, the system automatically uses the RequestId of the API request as the client token. The RequestId of each API request is different.</p>
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
         * <li><p><strong>true</strong>: sends a check request and does not delete the configuration. The system checks whether required parameters are specified, the request format is valid, and service limits are met. If the check fails, an error is returned. If the check succeeds, the DryRunOperation error code is returned.</p>
         * </li>
         * <li><p><strong>false</strong> (default): sends a regular request. If the check succeeds, an HTTP 2xx status code is returned and the operation is performed.</p>
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
         * <p>The ID of the egress proxy configuration.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>epc-hn302f6a9a284c4f****</p>
         */
        public Builder egressProxyConfigurationId(String egressProxyConfigurationId) {
            this.putBodyParameter("EgressProxyConfigurationId", egressProxyConfigurationId);
            this.egressProxyConfigurationId = egressProxyConfigurationId;
            return this;
        }

        @Override
        public DeleteEgressProxyConfigurationRequest build() {
            return new DeleteEgressProxyConfigurationRequest(this);
        } 

    } 

}
