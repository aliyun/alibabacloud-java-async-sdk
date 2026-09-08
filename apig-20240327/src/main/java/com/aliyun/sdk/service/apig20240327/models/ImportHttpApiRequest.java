// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.apig20240327.models;

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
 * {@link ImportHttpApiRequest} extends {@link RequestModel}
 *
 * <p>ImportHttpApiRequest</p>
 */
public class ImportHttpApiRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("deployConfigs")
    private java.util.List<HttpApiDeployConfig> deployConfigs;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("description")
    private String description;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("dryRun")
    private Boolean dryRun;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("gatewayId")
    private String gatewayId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("mcpRouteId")
    private String mcpRouteId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("name")
    private String name;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("resourceGroupId")
    private String resourceGroupId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("specContentBase64")
    private String specContentBase64;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("specFileUrl")
    private String specFileUrl;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("specOssConfig")
    private SpecOssConfig specOssConfig;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("strategy")
    private String strategy;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("targetHttpApiId")
    private String targetHttpApiId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("versionConfig")
    private HttpApiVersionConfig versionConfig;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("withGatewayExtension")
    private Boolean withGatewayExtension;

    private ImportHttpApiRequest(Builder builder) {
        super(builder);
        this.deployConfigs = builder.deployConfigs;
        this.description = builder.description;
        this.dryRun = builder.dryRun;
        this.gatewayId = builder.gatewayId;
        this.mcpRouteId = builder.mcpRouteId;
        this.name = builder.name;
        this.resourceGroupId = builder.resourceGroupId;
        this.specContentBase64 = builder.specContentBase64;
        this.specFileUrl = builder.specFileUrl;
        this.specOssConfig = builder.specOssConfig;
        this.strategy = builder.strategy;
        this.targetHttpApiId = builder.targetHttpApiId;
        this.versionConfig = builder.versionConfig;
        this.withGatewayExtension = builder.withGatewayExtension;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ImportHttpApiRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return deployConfigs
     */
    public java.util.List<HttpApiDeployConfig> getDeployConfigs() {
        return this.deployConfigs;
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
     * @return gatewayId
     */
    public String getGatewayId() {
        return this.gatewayId;
    }

    /**
     * @return mcpRouteId
     */
    public String getMcpRouteId() {
        return this.mcpRouteId;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return resourceGroupId
     */
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    /**
     * @return specContentBase64
     */
    public String getSpecContentBase64() {
        return this.specContentBase64;
    }

    /**
     * @return specFileUrl
     */
    public String getSpecFileUrl() {
        return this.specFileUrl;
    }

    /**
     * @return specOssConfig
     */
    public SpecOssConfig getSpecOssConfig() {
        return this.specOssConfig;
    }

    /**
     * @return strategy
     */
    public String getStrategy() {
        return this.strategy;
    }

    /**
     * @return targetHttpApiId
     */
    public String getTargetHttpApiId() {
        return this.targetHttpApiId;
    }

    /**
     * @return versionConfig
     */
    public HttpApiVersionConfig getVersionConfig() {
        return this.versionConfig;
    }

    /**
     * @return withGatewayExtension
     */
    public Boolean getWithGatewayExtension() {
        return this.withGatewayExtension;
    }

    public static final class Builder extends Request.Builder<ImportHttpApiRequest, Builder> {
        private java.util.List<HttpApiDeployConfig> deployConfigs; 
        private String description; 
        private Boolean dryRun; 
        private String gatewayId; 
        private String mcpRouteId; 
        private String name; 
        private String resourceGroupId; 
        private String specContentBase64; 
        private String specFileUrl; 
        private SpecOssConfig specOssConfig; 
        private String strategy; 
        private String targetHttpApiId; 
        private HttpApiVersionConfig versionConfig; 
        private Boolean withGatewayExtension; 

        private Builder() {
            super();
        } 

        private Builder(ImportHttpApiRequest request) {
            super(request);
            this.deployConfigs = request.deployConfigs;
            this.description = request.description;
            this.dryRun = request.dryRun;
            this.gatewayId = request.gatewayId;
            this.mcpRouteId = request.mcpRouteId;
            this.name = request.name;
            this.resourceGroupId = request.resourceGroupId;
            this.specContentBase64 = request.specContentBase64;
            this.specFileUrl = request.specFileUrl;
            this.specOssConfig = request.specOssConfig;
            this.strategy = request.strategy;
            this.targetHttpApiId = request.targetHttpApiId;
            this.versionConfig = request.versionConfig;
            this.withGatewayExtension = request.withGatewayExtension;
        } 

        /**
         * <p>The API deployment configurations.</p>
         */
        public Builder deployConfigs(java.util.List<HttpApiDeployConfig> deployConfigs) {
            this.putBodyParameter("deployConfigs", deployConfigs);
            this.deployConfigs = deployConfigs;
            return this;
        }

        /**
         * <p>The description of the imported API. If not specified, the description is extracted from the API definition. Maximum length: 255 bytes.</p>
         * 
         * <strong>example:</strong>
         * <p>Test API</p>
         */
        public Builder description(String description) {
            this.putBodyParameter("description", description);
            this.description = description;
            return this;
        }

        /**
         * <p>Specifies whether to perform a dry run. If enabled, only validation is performed without the actual import.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder dryRun(Boolean dryRun) {
            this.putBodyParameter("dryRun", dryRun);
            this.dryRun = dryRun;
            return this;
        }

        /**
         * <p>The gateway ID.</p>
         * 
         * <strong>example:</strong>
         * <p>gw-xxx</p>
         */
        public Builder gatewayId(String gatewayId) {
            this.putBodyParameter("gatewayId", gatewayId);
            this.gatewayId = gatewayId;
            return this;
        }

        /**
         * <p>The MCP route ID.</p>
         * 
         * <strong>example:</strong>
         * <p>xxx</p>
         */
        public Builder mcpRouteId(String mcpRouteId) {
            this.putBodyParameter("mcpRouteId", mcpRouteId);
            this.mcpRouteId = mcpRouteId;
            return this;
        }

        /**
         * <p>The name of the imported API. If not specified, the name is extracted from the API definition file. If an API with the same name and version configuration already exists, this import updates the existing API definition based on the strategy field.</p>
         * 
         * <strong>example:</strong>
         * <p>import-test</p>
         */
        public Builder name(String name) {
            this.putBodyParameter("name", name);
            this.name = name;
            return this;
        }

        /**
         * <p>The <a href="https://help.aliyun.com/document_detail/151181.html">resource group ID</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>rg-aek23nsa353vmra</p>
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.putBodyParameter("resourceGroupId", resourceGroupId);
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        /**
         * <p>The Base64-encoded API definition. OAS 2.0 and OAS 3.0 specifications are supported in YAML or JSON format. This parameter takes priority over the specFileUrl parameter. If the file size exceeds 10 MB, use the specFileUrl parameter instead.</p>
         * 
         * <strong>example:</strong>
         * <p>b3BlbmFwaTogMy4wLjAKaW5mbzoKICAgIHRpdGxlOiBkZW1vCiAgICBkZXNjcmlwdGlvbjogdGhpc2lzZGVtbwogICAgdmVyc2lvbjogIiIKcGF0aHM6CiAgICAvdXNlci97dXNlcklkfToKICAgICAgICBnZXQ6CiAgICAgICAgICAgIHN1bW1hcnk6IOiOt+WPlueUqOaIt+S/oeaBrwogICAgICAgICAgICBkZXNjcmlwdGlvbjog6I635Y+W55So5oi35L+h5oGvCiAgICAgICAgICAgIG9wZXJhdGlvbklkOiBHZXRVc2VySW5mbwogICAgICAgICAgICByZXNwb25zZXM6CiAgICAgICAgICAgICAgICAiMjAwIjoKICAgICAgICAgICAgICAgICAgICBkZXNjcmlwdGlvbjog5oiQ5YqfCiAgICAgICAgICAgICAgICAgICAgY29udGVudDoKICAgICAgICAgICAgICAgICAgICAgICAgYXBwbGljYXRpb24vanNvbjtjaGFyc2V0PXV0Zi04OgogICAgICAgICAgICAgICAgICAgICAgICAgICAgc2NoZW1hOiBudWxsCnNlcnZlcnM6CiAgICAtIHVybDogaHR0cDovL2FwaS5leGFtcGxlLmNvbS92MQo=</p>
         */
        public Builder specContentBase64(String specContentBase64) {
            this.putBodyParameter("specContentBase64", specContentBase64);
            this.specContentBase64 = specContentBase64;
            return this;
        }

        /**
         * <p>The download URL of the API definition file. The URL must be accessible over the Internet or be an internal network OSS download URL in the same region. The URL must have download permissions. For OSS files that are not publicly readable, see References <a href="https://help.aliyun.com/document_detail/39607.html">Download objects using presigned URLs</a> and provide a URL with download permissions. Only API definition files stored in OSS are supported.</p>
         */
        public Builder specFileUrl(String specFileUrl) {
            this.putBodyParameter("specFileUrl", specFileUrl);
            this.specFileUrl = specFileUrl;
            return this;
        }

        /**
         * <p>The OSS information.</p>
         */
        public Builder specOssConfig(SpecOssConfig specOssConfig) {
            this.putBodyParameter("specOssConfig", specOssConfig);
            this.specOssConfig = specOssConfig;
            return this;
        }

        /**
         * <p>The update strategy to use when the imported API name and version management match an existing API. Valid values:</p>
         * 
         * <strong>example:</strong>
         * <p>ExistFirst</p>
         */
        public Builder strategy(String strategy) {
            this.putBodyParameter("strategy", strategy);
            this.strategy = strategy;
            return this;
        }

        /**
         * <p>If this field is specified, the import updates the specified API instead of importing a new one or searching for an existing API by name and version management configuration. The target API must be of the REST type.</p>
         * 
         * <strong>example:</strong>
         * <p>api-xxxx</p>
         */
        public Builder targetHttpApiId(String targetHttpApiId) {
            this.putBodyParameter("targetHttpApiId", targetHttpApiId);
            this.targetHttpApiId = targetHttpApiId;
            return this;
        }

        /**
         * <p>The API version configuration. If version configuration is enabled and the version number and API name match an existing API, this import is treated as an update. If version configuration is not enabled and the API name matches an existing API, this import is treated as an update.</p>
         */
        public Builder versionConfig(HttpApiVersionConfig versionConfig) {
            this.putBodyParameter("versionConfig", versionConfig);
            this.versionConfig = versionConfig;
            return this;
        }

        /**
         * <p>Specifies whether to import gateway extension information.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder withGatewayExtension(Boolean withGatewayExtension) {
            this.putBodyParameter("withGatewayExtension", withGatewayExtension);
            this.withGatewayExtension = withGatewayExtension;
            return this;
        }

        @Override
        public ImportHttpApiRequest build() {
            return new ImportHttpApiRequest(this);
        } 

    } 

    /**
     * 
     * {@link ImportHttpApiRequest} extends {@link TeaModel}
     *
     * <p>ImportHttpApiRequest</p>
     */
    public static class SpecOssConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("bucketName")
        private String bucketName;

        @com.aliyun.core.annotation.NameInMap("objectKey")
        private String objectKey;

        @com.aliyun.core.annotation.NameInMap("regionId")
        private String regionId;

        private SpecOssConfig(Builder builder) {
            this.bucketName = builder.bucketName;
            this.objectKey = builder.objectKey;
            this.regionId = builder.regionId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SpecOssConfig create() {
            return builder().build();
        }

        /**
         * @return bucketName
         */
        public String getBucketName() {
            return this.bucketName;
        }

        /**
         * @return objectKey
         */
        public String getObjectKey() {
            return this.objectKey;
        }

        /**
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
        }

        public static final class Builder {
            private String bucketName; 
            private String objectKey; 
            private String regionId; 

            private Builder() {
            } 

            private Builder(SpecOssConfig model) {
                this.bucketName = model.bucketName;
                this.objectKey = model.objectKey;
                this.regionId = model.regionId;
            } 

            /**
             * <p>The bucket name.</p>
             * 
             * <strong>example:</strong>
             * <p>gms-service-prod</p>
             */
            public Builder bucketName(String bucketName) {
                this.bucketName = bucketName;
                return this;
            }

            /**
             * <p>The full path of the file.</p>
             * 
             * <strong>example:</strong>
             * <p>/test/swagger.json</p>
             */
            public Builder objectKey(String objectKey) {
                this.objectKey = objectKey;
                return this;
            }

            /**
             * <p>The region ID.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-shanghai</p>
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            public SpecOssConfig build() {
                return new SpecOssConfig(this);
            } 

        } 

    }
}
