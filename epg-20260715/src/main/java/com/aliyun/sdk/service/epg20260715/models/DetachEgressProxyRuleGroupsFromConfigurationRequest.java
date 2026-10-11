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
 * {@link DetachEgressProxyRuleGroupsFromConfigurationRequest} extends {@link RequestModel}
 *
 * <p>DetachEgressProxyRuleGroupsFromConfigurationRequest</p>
 */
public class DetachEgressProxyRuleGroupsFromConfigurationRequest extends Request {
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

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("EgressProxyRuleGroupIds")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<String> egressProxyRuleGroupIds;

    private DetachEgressProxyRuleGroupsFromConfigurationRequest(Builder builder) {
        super(builder);
        this.clientToken = builder.clientToken;
        this.dryRun = builder.dryRun;
        this.egressProxyConfigurationId = builder.egressProxyConfigurationId;
        this.egressProxyRuleGroupIds = builder.egressProxyRuleGroupIds;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DetachEgressProxyRuleGroupsFromConfigurationRequest create() {
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

    /**
     * @return egressProxyRuleGroupIds
     */
    public java.util.List<String> getEgressProxyRuleGroupIds() {
        return this.egressProxyRuleGroupIds;
    }

    public static final class Builder extends Request.Builder<DetachEgressProxyRuleGroupsFromConfigurationRequest, Builder> {
        private String clientToken; 
        private Boolean dryRun; 
        private String egressProxyConfigurationId; 
        private java.util.List<String> egressProxyRuleGroupIds; 

        private Builder() {
            super();
        } 

        private Builder(DetachEgressProxyRuleGroupsFromConfigurationRequest request) {
            super(request);
            this.clientToken = request.clientToken;
            this.dryRun = request.dryRun;
            this.egressProxyConfigurationId = request.egressProxyConfigurationId;
            this.egressProxyRuleGroupIds = request.egressProxyRuleGroupIds;
        } 

        /**
         * <p>The client token that is used to ensure the idempotence of the request.</p>
         * <p>You can use the client to generate the value, but you must ensure that it is unique among different requests. The client token can contain only ASCII characters.</p>
         * <blockquote>
         * <p>Note If you do not specify this parameter, the system automatically uses the RequestId of the API request as the ClientToken. The RequestId of each API request is unique.</p>
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
         * <li><p><strong>true</strong>: Sends a check request and does not disassociate the egress proxy rule groups. The check items include whether the required parameters are specified, the request format, and service limits. If the check fails, the corresponding error is returned. If the check succeeds, the DryRunOperation error code is returned.</p>
         * </li>
         * <li><p><strong>false</strong> (default): Sends a normal request. After the check succeeds, an HTTP 2xx status code is returned and the operation is directly executed.</p>
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
         * <p>epc-hn302f6a9a284c4****</p>
         */
        public Builder egressProxyConfigurationId(String egressProxyConfigurationId) {
            this.putBodyParameter("EgressProxyConfigurationId", egressProxyConfigurationId);
            this.egressProxyConfigurationId = egressProxyConfigurationId;
            return this;
        }

        /**
         * <p>The IDs of the egress proxy rule groups to be disassociated from the egress proxy configuration.</p>
         * <p>This parameter is required.</p>
         */
        public Builder egressProxyRuleGroupIds(java.util.List<String> egressProxyRuleGroupIds) {
            this.putBodyParameter("EgressProxyRuleGroupIds", egressProxyRuleGroupIds);
            this.egressProxyRuleGroupIds = egressProxyRuleGroupIds;
            return this;
        }

        @Override
        public DetachEgressProxyRuleGroupsFromConfigurationRequest build() {
            return new DetachEgressProxyRuleGroupsFromConfigurationRequest(this);
        } 

    } 

}
