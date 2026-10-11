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
 * {@link AttachEgressProxyRuleGroupsToConfigurationRequest} extends {@link RequestModel}
 *
 * <p>AttachEgressProxyRuleGroupsToConfigurationRequest</p>
 */
public class AttachEgressProxyRuleGroupsToConfigurationRequest extends Request {
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
    @com.aliyun.core.annotation.NameInMap("EgressProxyRuleGroups")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<EgressProxyRuleGroups> egressProxyRuleGroups;

    private AttachEgressProxyRuleGroupsToConfigurationRequest(Builder builder) {
        super(builder);
        this.clientToken = builder.clientToken;
        this.dryRun = builder.dryRun;
        this.egressProxyConfigurationId = builder.egressProxyConfigurationId;
        this.egressProxyRuleGroups = builder.egressProxyRuleGroups;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AttachEgressProxyRuleGroupsToConfigurationRequest create() {
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
     * @return egressProxyRuleGroups
     */
    public java.util.List<EgressProxyRuleGroups> getEgressProxyRuleGroups() {
        return this.egressProxyRuleGroups;
    }

    public static final class Builder extends Request.Builder<AttachEgressProxyRuleGroupsToConfigurationRequest, Builder> {
        private String clientToken; 
        private Boolean dryRun; 
        private String egressProxyConfigurationId; 
        private java.util.List<EgressProxyRuleGroups> egressProxyRuleGroups; 

        private Builder() {
            super();
        } 

        private Builder(AttachEgressProxyRuleGroupsToConfigurationRequest request) {
            super(request);
            this.clientToken = request.clientToken;
            this.dryRun = request.dryRun;
            this.egressProxyConfigurationId = request.egressProxyConfigurationId;
            this.egressProxyRuleGroups = request.egressProxyRuleGroups;
        } 

        /**
         * <p>The client token that is used to ensure the idempotence of the request.</p>
         * <p>You can use the client to generate the value, but you must ensure that it is unique among different requests. The client token can contain only ASCII characters.</p>
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
         * <p>Specifies whether to perform only a dry run. Valid values:</p>
         * <ul>
         * <li><p><strong>true</strong>: performs a dry run and does not attach the egress proxy rule groups. The system checks whether required parameters are specified, the request format is valid, and the service limits are met. If the request fails the dry run, an error message is returned. If the request passes the dry run, the DryRunOperation error code is returned.</p>
         * </li>
         * <li><p><strong>false</strong> (default): sends a normal request. If the request passes the check, the system returns an HTTP 2xx status code and performs the operation.</p>
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
         * <p>epc-uf609a6a8fdf9f4d****</p>
         */
        public Builder egressProxyConfigurationId(String egressProxyConfigurationId) {
            this.putBodyParameter("EgressProxyConfigurationId", egressProxyConfigurationId);
            this.egressProxyConfigurationId = egressProxyConfigurationId;
            return this;
        }

        /**
         * <p>The list of egress proxy rule group references to be attached to the egress proxy configuration.</p>
         * <p>This parameter is required.</p>
         */
        public Builder egressProxyRuleGroups(java.util.List<EgressProxyRuleGroups> egressProxyRuleGroups) {
            this.putBodyParameter("EgressProxyRuleGroups", egressProxyRuleGroups);
            this.egressProxyRuleGroups = egressProxyRuleGroups;
            return this;
        }

        @Override
        public AttachEgressProxyRuleGroupsToConfigurationRequest build() {
            return new AttachEgressProxyRuleGroupsToConfigurationRequest(this);
        } 

    } 

    /**
     * 
     * {@link AttachEgressProxyRuleGroupsToConfigurationRequest} extends {@link TeaModel}
     *
     * <p>AttachEgressProxyRuleGroupsToConfigurationRequest</p>
     */
    public static class EgressProxyRuleGroups extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("EgressProxyRuleGroupId")
        @com.aliyun.core.annotation.Validation(required = true)
        private String egressProxyRuleGroupId;

        @com.aliyun.core.annotation.NameInMap("Priority")
        @com.aliyun.core.annotation.Validation(required = true)
        private Integer priority;

        private EgressProxyRuleGroups(Builder builder) {
            this.egressProxyRuleGroupId = builder.egressProxyRuleGroupId;
            this.priority = builder.priority;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static EgressProxyRuleGroups create() {
            return builder().build();
        }

        /**
         * @return egressProxyRuleGroupId
         */
        public String getEgressProxyRuleGroupId() {
            return this.egressProxyRuleGroupId;
        }

        /**
         * @return priority
         */
        public Integer getPriority() {
            return this.priority;
        }

        public static final class Builder {
            private String egressProxyRuleGroupId; 
            private Integer priority; 

            private Builder() {
            } 

            private Builder(EgressProxyRuleGroups model) {
                this.egressProxyRuleGroupId = model.egressProxyRuleGroupId;
                this.priority = model.priority;
            } 

            /**
             * <p>The ID of the egress proxy rule group.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>eprg-uf60966a9633667c****</p>
             */
            public Builder egressProxyRuleGroupId(String egressProxyRuleGroupId) {
                this.egressProxyRuleGroupId = egressProxyRuleGroupId;
                return this;
            }

            /**
             * <p>The priority of the egress proxy rule group in the egress proxy configuration. Valid values: 1 to 1000. A smaller value indicates a higher priority.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder priority(Integer priority) {
                this.priority = priority;
                return this;
            }

            public EgressProxyRuleGroups build() {
                return new EgressProxyRuleGroups(this);
            } 

        } 

    }
}
