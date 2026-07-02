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
 * {@link InstallAgentWithTypeRequest} extends {@link RequestModel}
 *
 * <p>InstallAgentWithTypeRequest</p>
 */
public class InstallAgentWithTypeRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("agentId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String agentId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("agentVersion")
    @com.aliyun.core.annotation.Validation(required = true)
    private String agentVersion;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("configId")
    private String configId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("instanceType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("instances")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<Instances> instances;

    private InstallAgentWithTypeRequest(Builder builder) {
        super(builder);
        this.agentId = builder.agentId;
        this.agentVersion = builder.agentVersion;
        this.configId = builder.configId;
        this.instanceType = builder.instanceType;
        this.instances = builder.instances;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static InstallAgentWithTypeRequest create() {
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
     * @return configId
     */
    public String getConfigId() {
        return this.configId;
    }

    /**
     * @return instanceType
     */
    public String getInstanceType() {
        return this.instanceType;
    }

    /**
     * @return instances
     */
    public java.util.List<Instances> getInstances() {
        return this.instances;
    }

    public static final class Builder extends Request.Builder<InstallAgentWithTypeRequest, Builder> {
        private String agentId; 
        private String agentVersion; 
        private String configId; 
        private String instanceType; 
        private java.util.List<Instances> instances; 

        private Builder() {
            super();
        } 

        private Builder(InstallAgentWithTypeRequest request) {
            super(request);
            this.agentId = request.agentId;
            this.agentVersion = request.agentVersion;
            this.configId = request.configId;
            this.instanceType = request.instanceType;
            this.instances = request.instances;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>74a86327-3170-412c-8e67-da3389ec56a9</p>
         */
        public Builder agentId(String agentId) {
            this.putBodyParameter("agentId", agentId);
            this.agentId = agentId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>3.4.0-1</p>
         */
        public Builder agentVersion(String agentVersion) {
            this.putBodyParameter("agentVersion", agentVersion);
            this.agentVersion = agentVersion;
            return this;
        }

        /**
         * configId.
         */
        public Builder configId(String configId) {
            this.putBodyParameter("configId", configId);
            this.configId = configId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ecs</p>
         */
        public Builder instanceType(String instanceType) {
            this.putBodyParameter("instanceType", instanceType);
            this.instanceType = instanceType;
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
        public InstallAgentWithTypeRequest build() {
            return new InstallAgentWithTypeRequest(this);
        } 

    } 

    /**
     * 
     * {@link InstallAgentWithTypeRequest} extends {@link TeaModel}
     *
     * <p>InstallAgentWithTypeRequest</p>
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

            private Builder() {
            } 

            private Builder(Instances model) {
                this.instance = model.instance;
                this.region = model.region;
            } 

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
