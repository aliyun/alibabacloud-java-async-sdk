// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sysom20231230.models;

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
 * {@link InstallAgentRequest} extends {@link RequestModel}
 *
 * <p>InstallAgentRequest</p>
 */
public class InstallAgentRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("agent_id")
    @com.aliyun.core.annotation.Validation(required = true)
    private String agentId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("agent_version")
    @com.aliyun.core.annotation.Validation(required = true)
    private String agentVersion;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("install_type")
    @com.aliyun.core.annotation.Validation(required = true)
    private String installType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("instances")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<Instances> instances;

    private InstallAgentRequest(Builder builder) {
        super(builder);
        this.agentId = builder.agentId;
        this.agentVersion = builder.agentVersion;
        this.installType = builder.installType;
        this.instances = builder.instances;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static InstallAgentRequest create() {
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
     * @return agentVersion
     */
    public String getAgentVersion() {
        return this.agentVersion;
    }

    /**
     * @return installType
     */
    public String getInstallType() {
        return this.installType;
    }

    /**
     * @return instances
     */
    public java.util.List<Instances> getInstances() {
        return this.instances;
    }

    public static final class Builder extends Request.Builder<InstallAgentRequest, Builder> {
        private String agentId; 
        private String agentVersion; 
        private String installType; 
        private java.util.List<Instances> instances; 

        private Builder() {
            super();
        } 

        private Builder(InstallAgentRequest request) {
            super(request);
            this.agentId = request.agentId;
            this.agentVersion = request.agentVersion;
            this.installType = request.installType;
            this.instances = request.instances;
        } 

        /**
         * <p>This parameter is required.</p>
         */
        public Builder agentId(String agentId) {
            this.putBodyParameter("agent_id", agentId);
            this.agentId = agentId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder agentVersion(String agentVersion) {
            this.putBodyParameter("agent_version", agentVersion);
            this.agentVersion = agentVersion;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>InstallAndUpgrade</p>
         */
        public Builder installType(String installType) {
            this.putBodyParameter("install_type", installType);
            this.installType = installType;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder instances(java.util.List<Instances> instances) {
            this.putBodyParameter("instances", instances);
            this.instances = instances;
            return this;
        }

        @Override
        public InstallAgentRequest build() {
            return new InstallAgentRequest(this);
        } 

    } 

    /**
     * 
     * {@link InstallAgentRequest} extends {@link TeaModel}
     *
     * <p>InstallAgentRequest</p>
     */
    public static class Instances extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("instance")
        @com.aliyun.core.annotation.Validation(required = true)
        private String instance;

        @com.aliyun.core.annotation.NameInMap("region")
        @com.aliyun.core.annotation.Validation(required = true)
        private String region;

        private Instances(Builder builder) {
            this.instance = builder.instance;
            this.region = builder.region;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Instances create() {
            return builder().build();
        }

        /**
         * @return instance
         */
        public String getInstance() {
            return this.instance;
        }

        /**
         * @return region
         */
        public String getRegion() {
            return this.region;
        }

        public static final class Builder {
            private String instance; 
            private String region; 

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>i-wz9b9vucz1iubsz8sjqo</p>
             */
            public Builder instance(String instance) {
                this.instance = instance;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou</p>
             */
            public Builder region(String region) {
                this.region = region;
                return this;
            }

            public Instances build() {
                return new Instances(this);
            } 

        } 

    }
}
