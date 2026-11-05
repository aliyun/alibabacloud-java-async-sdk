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
 * {@link UninstallPolarClawSkillsRequest} extends {@link RequestModel}
 *
 * <p>UninstallPolarClawSkillsRequest</p>
 */
public class UninstallPolarClawSkillsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AgentId")
    private String agentId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ApplicationId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String applicationId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Scope")
    private String scope;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UninstallSkillNames")
    @com.aliyun.core.annotation.Validation(required = true)
    private String uninstallSkillNames;

    private UninstallPolarClawSkillsRequest(Builder builder) {
        super(builder);
        this.agentId = builder.agentId;
        this.applicationId = builder.applicationId;
        this.regionId = builder.regionId;
        this.scope = builder.scope;
        this.uninstallSkillNames = builder.uninstallSkillNames;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UninstallPolarClawSkillsRequest create() {
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
     * @return applicationId
     */
    public String getApplicationId() {
        return this.applicationId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return scope
     */
    public String getScope() {
        return this.scope;
    }

    /**
     * @return uninstallSkillNames
     */
    public String getUninstallSkillNames() {
        return this.uninstallSkillNames;
    }

    public static final class Builder extends Request.Builder<UninstallPolarClawSkillsRequest, Builder> {
        private String agentId; 
        private String applicationId; 
        private String regionId; 
        private String scope; 
        private String uninstallSkillNames; 

        private Builder() {
            super();
        } 

        private Builder(UninstallPolarClawSkillsRequest request) {
            super(request);
            this.agentId = request.agentId;
            this.applicationId = request.applicationId;
            this.regionId = request.regionId;
            this.scope = request.scope;
            this.uninstallSkillNames = request.uninstallSkillNames;
        } 

        /**
         * <p>The task-level target agent (workspace). If not specified, the default agent is used.</p>
         * 
         * <strong>example:</strong>
         * <p>test1</p>
         */
        public Builder agentId(String agentId) {
            this.putQueryParameter("AgentId", agentId);
            this.agentId = agentId;
            return this;
        }

        /**
         * <p>The application ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>pa-**************</p>
         */
        public Builder applicationId(String applicationId) {
            this.putQueryParameter("ApplicationId", applicationId);
            this.applicationId = applicationId;
            return this;
        }

        /**
         * <p>The region ID.</p>
         * <blockquote>
         * <p>You can call the <a href="https://help.aliyun.com/document_detail/98041.html">DescribeRegions</a> operation to query region details.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The task-level scope. Valid values: workspace (default) and global. This parameter is mutually exclusive with AgentId.</p>
         * 
         * <strong>example:</strong>
         * <p>global</p>
         */
        public Builder scope(String scope) {
            this.putQueryParameter("Scope", scope);
            this.scope = scope;
            return this;
        }

        /**
         * <p>The names of the skills to uninstall.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>[&quot;polarclawhub&quot;,&quot;github&quot;]</p>
         */
        public Builder uninstallSkillNames(String uninstallSkillNames) {
            this.putQueryParameter("UninstallSkillNames", uninstallSkillNames);
            this.uninstallSkillNames = uninstallSkillNames;
            return this;
        }

        @Override
        public UninstallPolarClawSkillsRequest build() {
            return new UninstallPolarClawSkillsRequest(this);
        } 

    } 

}
