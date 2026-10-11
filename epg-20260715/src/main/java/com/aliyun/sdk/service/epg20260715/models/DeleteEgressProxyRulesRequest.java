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
 * {@link DeleteEgressProxyRulesRequest} extends {@link RequestModel}
 *
 * <p>DeleteEgressProxyRulesRequest</p>
 */
public class DeleteEgressProxyRulesRequest extends Request {
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

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("EgressProxyRuleIds")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<String> egressProxyRuleIds;

    private DeleteEgressProxyRulesRequest(Builder builder) {
        super(builder);
        this.clientToken = builder.clientToken;
        this.dryRun = builder.dryRun;
        this.egressProxyRuleGroupId = builder.egressProxyRuleGroupId;
        this.egressProxyRuleIds = builder.egressProxyRuleIds;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteEgressProxyRulesRequest create() {
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

    /**
     * @return egressProxyRuleIds
     */
    public java.util.List<String> getEgressProxyRuleIds() {
        return this.egressProxyRuleIds;
    }

    public static final class Builder extends Request.Builder<DeleteEgressProxyRulesRequest, Builder> {
        private String clientToken; 
        private Boolean dryRun; 
        private String egressProxyRuleGroupId; 
        private java.util.List<String> egressProxyRuleIds; 

        private Builder() {
            super();
        } 

        private Builder(DeleteEgressProxyRulesRequest request) {
            super(request);
            this.clientToken = request.clientToken;
            this.dryRun = request.dryRun;
            this.egressProxyRuleGroupId = request.egressProxyRuleGroupId;
            this.egressProxyRuleIds = request.egressProxyRuleIds;
        } 

        /**
         * <p>The client token that is used to ensure the idempotence of the request. You can use the client to generate the value, but you must ensure that it is unique among different requests. The client token can contain only ASCII characters.</p>
         * <blockquote>
         * <p>Note: If you do not specify this parameter, the system automatically uses the request ID of the API request as the client token. The request ID of each API request is unique.</p>
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
         * <li><p><strong>true</strong>: performs only a dry run and does not delete the rules. The system checks whether required parameters are specified, the request format is valid, and the service limits are met. If the request fails the dry run, an error message is returned. If the request passes the dry run, the DryRunOperation error code is returned.</p>
         * </li>
         * <li><p><strong>false</strong> (default): performs a dry run and sends the actual request. If the request passes the dry run, an HTTP 2xx status code is returned and the operation is performed.</p>
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
         * <p>The ID of the egress proxy rule group.</p>
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

        /**
         * <p>The IDs of the egress proxy rules.</p>
         * <p>This parameter is required.</p>
         */
        public Builder egressProxyRuleIds(java.util.List<String> egressProxyRuleIds) {
            this.putBodyParameter("EgressProxyRuleIds", egressProxyRuleIds);
            this.egressProxyRuleIds = egressProxyRuleIds;
            return this;
        }

        @Override
        public DeleteEgressProxyRulesRequest build() {
            return new DeleteEgressProxyRulesRequest(this);
        } 

    } 

}
