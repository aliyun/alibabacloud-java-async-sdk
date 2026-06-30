// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.polardb20170801.models;

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
 * {@link UpdatePolarClawAgentToolsRequest} extends {@link RequestModel}
 *
 * <p>UpdatePolarClawAgentToolsRequest</p>
 */
public class UpdatePolarClawAgentToolsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AgentId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String agentId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Allow")
    private java.util.List<String> allow;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AlsoAllow")
    private java.util.List<String> alsoAllow;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ApplicationId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String applicationId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Deny")
    private java.util.List<String> deny;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Profile")
    private String profile;

    private UpdatePolarClawAgentToolsRequest(Builder builder) {
        super(builder);
        this.agentId = builder.agentId;
        this.allow = builder.allow;
        this.alsoAllow = builder.alsoAllow;
        this.applicationId = builder.applicationId;
        this.deny = builder.deny;
        this.profile = builder.profile;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdatePolarClawAgentToolsRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return agentId
     */
    public String getAgentId() {
        return this.agentId;
    }

    /**
     * @return allow
     */
    public java.util.List<String> getAllow() {
        return this.allow;
    }

    /**
     * @return alsoAllow
     */
    public java.util.List<String> getAlsoAllow() {
        return this.alsoAllow;
    }

    /**
     * @return applicationId
     */
    public String getApplicationId() {
        return this.applicationId;
    }

    /**
     * @return deny
     */
    public java.util.List<String> getDeny() {
        return this.deny;
    }

    /**
     * @return profile
     */
    public String getProfile() {
        return this.profile;
    }

    public static final class Builder extends Request.Builder<UpdatePolarClawAgentToolsRequest, Builder> {
        private String agentId; 
        private java.util.List<String> allow; 
        private java.util.List<String> alsoAllow; 
        private String applicationId; 
        private java.util.List<String> deny; 
        private String profile; 

        private Builder() {
            super();
        } 

        private Builder(UpdatePolarClawAgentToolsRequest request) {
            super(request);
            this.agentId = request.agentId;
            this.allow = request.allow;
            this.alsoAllow = request.alsoAllow;
            this.applicationId = request.applicationId;
            this.deny = request.deny;
            this.profile = request.profile;
        } 

        /**
         * <p>Agent ID</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>work</p>
         */
        public Builder agentId(String agentId) {
            this.putQueryParameter("AgentId", agentId);
            this.agentId = agentId;
            return this;
        }

        /**
         * Allow.
         */
        public Builder allow(java.util.List<String> allow) {
            String allowShrink = shrink(allow, "Allow", "json");
            this.putQueryParameter("Allow", allowShrink);
            this.allow = allow;
            return this;
        }

        /**
         * AlsoAllow.
         */
        public Builder alsoAllow(java.util.List<String> alsoAllow) {
            String alsoAllowShrink = shrink(alsoAllow, "AlsoAllow", "json");
            this.putQueryParameter("AlsoAllow", alsoAllowShrink);
            this.alsoAllow = alsoAllow;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>pa-xxx</p>
         */
        public Builder applicationId(String applicationId) {
            this.putQueryParameter("ApplicationId", applicationId);
            this.applicationId = applicationId;
            return this;
        }

        /**
         * Deny.
         */
        public Builder deny(java.util.List<String> deny) {
            String denyShrink = shrink(deny, "Deny", "json");
            this.putQueryParameter("Deny", denyShrink);
            this.deny = deny;
            return this;
        }

        /**
         * Profile.
         */
        public Builder profile(String profile) {
            this.putQueryParameter("Profile", profile);
            this.profile = profile;
            return this;
        }

        @Override
        public UpdatePolarClawAgentToolsRequest build() {
            return new UpdatePolarClawAgentToolsRequest(this);
        } 

    } 

}
