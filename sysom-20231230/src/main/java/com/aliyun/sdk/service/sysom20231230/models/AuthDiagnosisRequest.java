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
 * {@link AuthDiagnosisRequest} extends {@link RequestModel}
 *
 * <p>AuthDiagnosisRequest</p>
 */
public class AuthDiagnosisRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("X-Debug-Id")
    private String xDebugId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("autoCreateRole")
    private Boolean autoCreateRole;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("autoInstallAgent")
    private Boolean autoInstallAgent;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("instances")
    private java.util.List<Instances> instances;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("x-sysom-invoke-source")
    private String xSysomInvokeSource;

    private AuthDiagnosisRequest(Builder builder) {
        super(builder);
        this.xDebugId = builder.xDebugId;
        this.autoCreateRole = builder.autoCreateRole;
        this.autoInstallAgent = builder.autoInstallAgent;
        this.instances = builder.instances;
        this.xSysomInvokeSource = builder.xSysomInvokeSource;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AuthDiagnosisRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return xDebugId
     */
    public String getXDebugId() {
        return this.xDebugId;
    }

    /**
     * @return autoCreateRole
     */
    public Boolean getAutoCreateRole() {
        return this.autoCreateRole;
    }

    /**
     * @return autoInstallAgent
     */
    public Boolean getAutoInstallAgent() {
        return this.autoInstallAgent;
    }

    /**
     * @return instances
     */
    public java.util.List<Instances> getInstances() {
        return this.instances;
    }

    /**
     * @return xSysomInvokeSource
     */
    public String getXSysomInvokeSource() {
        return this.xSysomInvokeSource;
    }

    public static final class Builder extends Request.Builder<AuthDiagnosisRequest, Builder> {
        private String xDebugId; 
        private Boolean autoCreateRole; 
        private Boolean autoInstallAgent; 
        private java.util.List<Instances> instances; 
        private String xSysomInvokeSource; 

        private Builder() {
            super();
        } 

        private Builder(AuthDiagnosisRequest request) {
            super(request);
            this.xDebugId = request.xDebugId;
            this.autoCreateRole = request.autoCreateRole;
            this.autoInstallAgent = request.autoInstallAgent;
            this.instances = request.instances;
            this.xSysomInvokeSource = request.xSysomInvokeSource;
        } 

        /**
         * X-Debug-Id.
         */
        public Builder xDebugId(String xDebugId) {
            this.putQueryParameter("X-Debug-Id", xDebugId);
            this.xDebugId = xDebugId;
            return this;
        }

        /**
         * autoCreateRole.
         */
        public Builder autoCreateRole(Boolean autoCreateRole) {
            this.putBodyParameter("autoCreateRole", autoCreateRole);
            this.autoCreateRole = autoCreateRole;
            return this;
        }

        /**
         * autoInstallAgent.
         */
        public Builder autoInstallAgent(Boolean autoInstallAgent) {
            this.putBodyParameter("autoInstallAgent", autoInstallAgent);
            this.autoInstallAgent = autoInstallAgent;
            return this;
        }

        /**
         * instances.
         */
        public Builder instances(java.util.List<Instances> instances) {
            this.putBodyParameter("instances", instances);
            this.instances = instances;
            return this;
        }

        /**
         * x-sysom-invoke-source.
         */
        public Builder xSysomInvokeSource(String xSysomInvokeSource) {
            this.putQueryParameter("x-sysom-invoke-source", xSysomInvokeSource);
            this.xSysomInvokeSource = xSysomInvokeSource;
            return this;
        }

        @Override
        public AuthDiagnosisRequest build() {
            return new AuthDiagnosisRequest(this);
        } 

    } 

    /**
     * 
     * {@link AuthDiagnosisRequest} extends {@link TeaModel}
     *
     * <p>AuthDiagnosisRequest</p>
     */
    public static class Instances extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("instance")
        private String instance;

        @com.aliyun.core.annotation.NameInMap("region")
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
             * instance.
             */
            public Builder instance(String instance) {
                this.instance = instance;
                return this;
            }

            /**
             * region.
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
