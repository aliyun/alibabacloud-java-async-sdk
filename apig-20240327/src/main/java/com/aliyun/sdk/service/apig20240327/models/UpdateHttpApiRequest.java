// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.apig20240327.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link UpdateHttpApiRequest} extends {@link RequestModel}
 *
 * <p>UpdateHttpApiRequest</p>
 */
public class UpdateHttpApiRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("httpApiId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String httpApiId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("aiProtocols")
    private java.util.List < String > aiProtocols;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("basePath")
    @com.aliyun.core.annotation.Validation(required = true)
    private String basePath;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("deployConfigs")
    private java.util.List < HttpApiDeployConfig > deployConfigs;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("description")
    private String description;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ingressConfig")
    private IngressConfig ingressConfig;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("protocols")
    private java.util.List < String > protocols;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("versionConfig")
    private HttpApiVersionConfig versionConfig;

    private UpdateHttpApiRequest(Builder builder) {
        super(builder);
        this.httpApiId = builder.httpApiId;
        this.aiProtocols = builder.aiProtocols;
        this.basePath = builder.basePath;
        this.deployConfigs = builder.deployConfigs;
        this.description = builder.description;
        this.ingressConfig = builder.ingressConfig;
        this.protocols = builder.protocols;
        this.versionConfig = builder.versionConfig;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateHttpApiRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return httpApiId
     */
    public String getHttpApiId() {
        return this.httpApiId;
    }

    /**
     * @return aiProtocols
     */
    public java.util.List < String > getAiProtocols() {
        return this.aiProtocols;
    }

    /**
     * @return basePath
     */
    public String getBasePath() {
        return this.basePath;
    }

    /**
     * @return deployConfigs
     */
    public java.util.List < HttpApiDeployConfig > getDeployConfigs() {
        return this.deployConfigs;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return ingressConfig
     */
    public IngressConfig getIngressConfig() {
        return this.ingressConfig;
    }

    /**
     * @return protocols
     */
    public java.util.List < String > getProtocols() {
        return this.protocols;
    }

    /**
     * @return versionConfig
     */
    public HttpApiVersionConfig getVersionConfig() {
        return this.versionConfig;
    }

    public static final class Builder extends Request.Builder<UpdateHttpApiRequest, Builder> {
        private String httpApiId; 
        private java.util.List < String > aiProtocols; 
        private String basePath; 
        private java.util.List < HttpApiDeployConfig > deployConfigs; 
        private String description; 
        private IngressConfig ingressConfig; 
        private java.util.List < String > protocols; 
        private HttpApiVersionConfig versionConfig; 

        private Builder() {
            super();
        } 

        private Builder(UpdateHttpApiRequest request) {
            super(request);
            this.httpApiId = request.httpApiId;
            this.aiProtocols = request.aiProtocols;
            this.basePath = request.basePath;
            this.deployConfigs = request.deployConfigs;
            this.description = request.description;
            this.ingressConfig = request.ingressConfig;
            this.protocols = request.protocols;
            this.versionConfig = request.versionConfig;
        } 

        /**
         * <p>The ID of the HTTP API to be updated.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>api-xxx</p>
         */
        public Builder httpApiId(String httpApiId) {
            this.putPathParameter("httpApiId", httpApiId);
            this.httpApiId = httpApiId;
            return this;
        }

        /**
         * aiProtocols.
         */
        public Builder aiProtocols(java.util.List < String > aiProtocols) {
            this.putBodyParameter("aiProtocols", aiProtocols);
            this.aiProtocols = aiProtocols;
            return this;
        }

        /**
         * <p>Base path of the API, which must start with a &quot;/&quot;.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>/v1</p>
         */
        public Builder basePath(String basePath) {
            this.putBodyParameter("basePath", basePath);
            this.basePath = basePath;
            return this;
        }

        /**
         * deployConfigs.
         */
        public Builder deployConfigs(java.util.List < HttpApiDeployConfig > deployConfigs) {
            this.putBodyParameter("deployConfigs", deployConfigs);
            this.deployConfigs = deployConfigs;
            return this;
        }

        /**
         * <p>API description.</p>
         * 
         * <strong>example:</strong>
         * <p>更新API描述</p>
         */
        public Builder description(String description) {
            this.putBodyParameter("description", description);
            this.description = description;
            return this;
        }

        /**
         * <p>Configuration information for the HTTP Ingress API.</p>
         */
        public Builder ingressConfig(IngressConfig ingressConfig) {
            this.putBodyParameter("ingressConfig", ingressConfig);
            this.ingressConfig = ingressConfig;
            return this;
        }

        /**
         * <p>List of API access protocols.</p>
         */
        public Builder protocols(java.util.List < String > protocols) {
            this.putBodyParameter("protocols", protocols);
            this.protocols = protocols;
            return this;
        }

        /**
         * <p>API versioning configuration.</p>
         */
        public Builder versionConfig(HttpApiVersionConfig versionConfig) {
            this.putBodyParameter("versionConfig", versionConfig);
            this.versionConfig = versionConfig;
            return this;
        }

        @Override
        public UpdateHttpApiRequest build() {
            return new UpdateHttpApiRequest(this);
        } 

    } 

    /**
     * 
     * {@link UpdateHttpApiRequest} extends {@link TeaModel}
     *
     * <p>UpdateHttpApiRequest</p>
     */
    public static class IngressConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("environmentId")
        private String environmentId;

        @com.aliyun.core.annotation.NameInMap("ingressClass")
        private String ingressClass;

        @com.aliyun.core.annotation.NameInMap("overrideIngressIp")
        private Boolean overrideIngressIp;

        @com.aliyun.core.annotation.NameInMap("sourceId")
        private String sourceId;

        @com.aliyun.core.annotation.NameInMap("watchNamespace")
        private String watchNamespace;

        private IngressConfig(Builder builder) {
            this.environmentId = builder.environmentId;
            this.ingressClass = builder.ingressClass;
            this.overrideIngressIp = builder.overrideIngressIp;
            this.sourceId = builder.sourceId;
            this.watchNamespace = builder.watchNamespace;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static IngressConfig create() {
            return builder().build();
        }

        /**
         * @return environmentId
         */
        public String getEnvironmentId() {
            return this.environmentId;
        }

        /**
         * @return ingressClass
         */
        public String getIngressClass() {
            return this.ingressClass;
        }

        /**
         * @return overrideIngressIp
         */
        public Boolean getOverrideIngressIp() {
            return this.overrideIngressIp;
        }

        /**
         * @return sourceId
         */
        public String getSourceId() {
            return this.sourceId;
        }

        /**
         * @return watchNamespace
         */
        public String getWatchNamespace() {
            return this.watchNamespace;
        }

        public static final class Builder {
            private String environmentId; 
            private String ingressClass; 
            private Boolean overrideIngressIp; 
            private String sourceId; 
            private String watchNamespace; 

            /**
             * <p>Environment ID.</p>
             * 
             * <strong>example:</strong>
             * <p>env-cr6ql0tlhtgmc****</p>
             */
            public Builder environmentId(String environmentId) {
                this.environmentId = environmentId;
                return this;
            }

            /**
             * <p>Ingress Class being listened to.</p>
             * 
             * <strong>example:</strong>
             * <p>mse</p>
             */
            public Builder ingressClass(String ingressClass) {
                this.ingressClass = ingressClass;
                return this;
            }

            /**
             * <p>Whether to update the address in the Ingress Status.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder overrideIngressIp(Boolean overrideIngressIp) {
                this.overrideIngressIp = overrideIngressIp;
                return this;
            }

            /**
             * <p>Source ID.</p>
             * 
             * <strong>example:</strong>
             * <p>src-crdddallhtgtr****</p>
             */
            public Builder sourceId(String sourceId) {
                this.sourceId = sourceId;
                return this;
            }

            /**
             * <p>Watched namespace.</p>
             * 
             * <strong>example:</strong>
             * <p>default</p>
             */
            public Builder watchNamespace(String watchNamespace) {
                this.watchNamespace = watchNamespace;
                return this;
            }

            public IngressConfig build() {
                return new IngressConfig(this);
            } 

        } 

    }
}
