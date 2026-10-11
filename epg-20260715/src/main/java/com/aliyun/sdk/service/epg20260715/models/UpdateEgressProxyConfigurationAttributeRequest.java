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
 * {@link UpdateEgressProxyConfigurationAttributeRequest} extends {@link RequestModel}
 *
 * <p>UpdateEgressProxyConfigurationAttributeRequest</p>
 */
public class UpdateEgressProxyConfigurationAttributeRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    private String clientToken;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("DefaultRulePhaseActions")
    private DefaultRulePhaseActions defaultRulePhaseActions;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("DryRun")
    private Boolean dryRun;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("EgressProxyConfigurationId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String egressProxyConfigurationId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("EgressProxyConfigurationName")
    private String egressProxyConfigurationName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("EgressProxyRuleGroups")
    private java.util.List<EgressProxyRuleGroups> egressProxyRuleGroups;

    private UpdateEgressProxyConfigurationAttributeRequest(Builder builder) {
        super(builder);
        this.clientToken = builder.clientToken;
        this.defaultRulePhaseActions = builder.defaultRulePhaseActions;
        this.description = builder.description;
        this.dryRun = builder.dryRun;
        this.egressProxyConfigurationId = builder.egressProxyConfigurationId;
        this.egressProxyConfigurationName = builder.egressProxyConfigurationName;
        this.egressProxyRuleGroups = builder.egressProxyRuleGroups;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateEgressProxyConfigurationAttributeRequest create() {
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
     * @return defaultRulePhaseActions
     */
    public DefaultRulePhaseActions getDefaultRulePhaseActions() {
        return this.defaultRulePhaseActions;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
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
     * @return egressProxyConfigurationName
     */
    public String getEgressProxyConfigurationName() {
        return this.egressProxyConfigurationName;
    }

    /**
     * @return egressProxyRuleGroups
     */
    public java.util.List<EgressProxyRuleGroups> getEgressProxyRuleGroups() {
        return this.egressProxyRuleGroups;
    }

    public static final class Builder extends Request.Builder<UpdateEgressProxyConfigurationAttributeRequest, Builder> {
        private String clientToken; 
        private DefaultRulePhaseActions defaultRulePhaseActions; 
        private String description; 
        private Boolean dryRun; 
        private String egressProxyConfigurationId; 
        private String egressProxyConfigurationName; 
        private java.util.List<EgressProxyRuleGroups> egressProxyRuleGroups; 

        private Builder() {
            super();
        } 

        private Builder(UpdateEgressProxyConfigurationAttributeRequest request) {
            super(request);
            this.clientToken = request.clientToken;
            this.defaultRulePhaseActions = request.defaultRulePhaseActions;
            this.description = request.description;
            this.dryRun = request.dryRun;
            this.egressProxyConfigurationId = request.egressProxyConfigurationId;
            this.egressProxyConfigurationName = request.egressProxyConfigurationName;
            this.egressProxyRuleGroups = request.egressProxyRuleGroups;
        } 

        /**
         * ClientToken.
         */
        public Builder clientToken(String clientToken) {
            this.putBodyParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * DefaultRulePhaseActions.
         */
        public Builder defaultRulePhaseActions(DefaultRulePhaseActions defaultRulePhaseActions) {
            this.putBodyParameter("DefaultRulePhaseActions", defaultRulePhaseActions);
            this.defaultRulePhaseActions = defaultRulePhaseActions;
            return this;
        }

        /**
         * Description.
         */
        public Builder description(String description) {
            this.putBodyParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * DryRun.
         */
        public Builder dryRun(Boolean dryRun) {
            this.putBodyParameter("DryRun", dryRun);
            this.dryRun = dryRun;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>epc-gw80d16a969933e7****</p>
         */
        public Builder egressProxyConfigurationId(String egressProxyConfigurationId) {
            this.putBodyParameter("EgressProxyConfigurationId", egressProxyConfigurationId);
            this.egressProxyConfigurationId = egressProxyConfigurationId;
            return this;
        }

        /**
         * EgressProxyConfigurationName.
         */
        public Builder egressProxyConfigurationName(String egressProxyConfigurationName) {
            this.putBodyParameter("EgressProxyConfigurationName", egressProxyConfigurationName);
            this.egressProxyConfigurationName = egressProxyConfigurationName;
            return this;
        }

        /**
         * EgressProxyRuleGroups.
         */
        public Builder egressProxyRuleGroups(java.util.List<EgressProxyRuleGroups> egressProxyRuleGroups) {
            this.putBodyParameter("EgressProxyRuleGroups", egressProxyRuleGroups);
            this.egressProxyRuleGroups = egressProxyRuleGroups;
            return this;
        }

        @Override
        public UpdateEgressProxyConfigurationAttributeRequest build() {
            return new UpdateEgressProxyConfigurationAttributeRequest(this);
        } 

    } 

    /**
     * 
     * {@link UpdateEgressProxyConfigurationAttributeRequest} extends {@link TeaModel}
     *
     * <p>UpdateEgressProxyConfigurationAttributeRequest</p>
     */
    public static class DefaultRulePhaseActions extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("PostResponse")
        @com.aliyun.core.annotation.Validation(required = true)
        private String postResponse;

        @com.aliyun.core.annotation.NameInMap("PreDns")
        @com.aliyun.core.annotation.Validation(required = true)
        private String preDns;

        @com.aliyun.core.annotation.NameInMap("PreRequest")
        @com.aliyun.core.annotation.Validation(required = true)
        private String preRequest;

        private DefaultRulePhaseActions(Builder builder) {
            this.postResponse = builder.postResponse;
            this.preDns = builder.preDns;
            this.preRequest = builder.preRequest;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DefaultRulePhaseActions create() {
            return builder().build();
        }

        /**
         * @return postResponse
         */
        public String getPostResponse() {
            return this.postResponse;
        }

        /**
         * @return preDns
         */
        public String getPreDns() {
            return this.preDns;
        }

        /**
         * @return preRequest
         */
        public String getPreRequest() {
            return this.preRequest;
        }

        public static final class Builder {
            private String postResponse; 
            private String preDns; 
            private String preRequest; 

            private Builder() {
            } 

            private Builder(DefaultRulePhaseActions model) {
                this.postResponse = model.postResponse;
                this.preDns = model.preDns;
                this.preRequest = model.preRequest;
            } 

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>Allow</p>
             */
            public Builder postResponse(String postResponse) {
                this.postResponse = postResponse;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>Allow</p>
             */
            public Builder preDns(String preDns) {
                this.preDns = preDns;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>Allow</p>
             */
            public Builder preRequest(String preRequest) {
                this.preRequest = preRequest;
                return this;
            }

            public DefaultRulePhaseActions build() {
                return new DefaultRulePhaseActions(this);
            } 

        } 

    }
    /**
     * 
     * {@link UpdateEgressProxyConfigurationAttributeRequest} extends {@link TeaModel}
     *
     * <p>UpdateEgressProxyConfigurationAttributeRequest</p>
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
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>eprg-gw80bb6a95380edb****</p>
             */
            public Builder egressProxyRuleGroupId(String egressProxyRuleGroupId) {
                this.egressProxyRuleGroupId = egressProxyRuleGroupId;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>20</p>
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
