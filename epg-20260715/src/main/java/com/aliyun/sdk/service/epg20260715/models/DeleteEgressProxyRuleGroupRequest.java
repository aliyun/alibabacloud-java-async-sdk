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
 * {@link DeleteEgressProxyRuleGroupRequest} extends {@link RequestModel}
 *
 * <p>DeleteEgressProxyRuleGroupRequest</p>
 */
public class DeleteEgressProxyRuleGroupRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    private String clientToken;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("DryRun")
    private Boolean dryRun;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("EgressProxyRuleGroupId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String egressProxyRuleGroupId;

    private DeleteEgressProxyRuleGroupRequest(Builder builder) {
        super(builder);
        this.clientToken = builder.clientToken;
        this.dryRun = builder.dryRun;
        this.egressProxyRuleGroupId = builder.egressProxyRuleGroupId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteEgressProxyRuleGroupRequest create() {
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
     * @return egressProxyRuleGroupId
     */
    public String getEgressProxyRuleGroupId() {
        return this.egressProxyRuleGroupId;
    }

    public static final class Builder extends Request.Builder<DeleteEgressProxyRuleGroupRequest, Builder> {
        private String clientToken; 
        private Boolean dryRun; 
        private String egressProxyRuleGroupId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteEgressProxyRuleGroupRequest request) {
            super(request);
            this.clientToken = request.clientToken;
            this.dryRun = request.dryRun;
            this.egressProxyRuleGroupId = request.egressProxyRuleGroupId;
        } 

        /**
         * <p>The client token that is used to ensure the idempotence of the request.</p>
         * <p>You can generate the value of this parameter on the client side. Make sure that the value is unique among different requests. The client token can contain only ASCII characters.</p>
         * <blockquote>
         * <p><strong>Note</strong>: If you do not specify this parameter, the system automatically uses the RequestId of the API request as the client token. The RequestId of each API request is unique.</p>
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
         * <li><p><strong>true</strong>: sends a check request and does not delete the rule group. The system checks whether the required parameters are specified, the request format is valid, and the service limits are met. If the check fails, the corresponding error is returned. If the check succeeds, the error code DryRunOperation is returned.</p>
         * </li>
         * <li><p><strong>false</strong> (default): sends a regular request. If the check succeeds, the HTTP 2xx status code is returned and the operation is performed.</p>
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
         * <p>The ID of the egress proxy rule group that you want to delete.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>eprg-uf60966a9633667c****</p>
         */
        public Builder egressProxyRuleGroupId(String egressProxyRuleGroupId) {
            this.putBodyParameter("EgressProxyRuleGroupId", egressProxyRuleGroupId);
            this.egressProxyRuleGroupId = egressProxyRuleGroupId;
            return this;
        }

        @Override
        public DeleteEgressProxyRuleGroupRequest build() {
            return new DeleteEgressProxyRuleGroupRequest(this);
        } 

    } 

}
