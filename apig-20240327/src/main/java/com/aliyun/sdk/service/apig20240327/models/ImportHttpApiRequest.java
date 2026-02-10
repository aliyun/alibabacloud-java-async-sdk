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
        } 

        /**
         * <p>The API deployment configuration.</p>
         */
        public Builder deployConfigs(java.util.List<HttpApiDeployConfig> deployConfigs) {
            this.putBodyParameter("deployConfigs", deployConfigs);
            this.deployConfigs = deployConfigs;
            return this;
        }

        /**
         * <p>The imported API description (255-byte limit). If not specified, a description is extracted from the API definition file. A maximum of 255 bytes is supported.</p>
         * 
         * <strong>example:</strong>
         * <p>API for testing</p>
         */
        public Builder description(String description) {
            this.putBodyParameter("description", description);
            this.description = description;
            return this;
        }

        /**
         * <p>Specifies whether to perform a precheck. If set to true, a check is performed without actual import.</p>
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
         * <p>Gateway ID.</p>
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
         * <p>The imported API name. If not specified, a name is extracted from the API definition file. If the API name and versioning configuration already exist, this import will update the existing API definition based on the strategy field.</p>
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
         * <p>rg-acfm3q4zjh7fkki</p>
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.putBodyParameter("resourceGroupId", resourceGroupId);
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        /**
         * <p>The Base64-encoded API definition (supports OAS 2.0/OAS 3.0 in YAML/JSON). This parameter has higher priority than the specFileUrl parameter. However, if the file size exceeds 10 MB, use the specFileUrl parameter to pass the definition.</p>
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
         * <p>The download URL of the API definition file. Must be either a publicly accessible Object Storage Service (OSS) URL or an OSS intranet endpoint within the same region. Requires download permissions. For OSS URLs that are not publicly readable, refer to <a href="https://help.aliyun.com/document_detail/39607.html">https://www.alibabacloud.com/help/en/oss/user-guide/how-to-obtain-the-url-of-a-single-object-or-the-urls-of-multiple-objects</a> and use URLs with download permissions. Currently, only OSS URLs are supported.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://my-bucket.oss-cn-hangzhou.aliyuncs.com/my-api/api.yaml">https://my-bucket.oss-cn-hangzhou.aliyuncs.com/my-api/api.yaml</a></p>
         */
        public Builder specFileUrl(String specFileUrl) {
            this.putBodyParameter("specFileUrl", specFileUrl);
            this.specFileUrl = specFileUrl;
            return this;
        }

        /**
         * <p>The OSS configuration details.</p>
         */
        public Builder specOssConfig(SpecOssConfig specOssConfig) {
            this.putBodyParameter("specOssConfig", specOssConfig);
            this.specOssConfig = specOssConfig;
            return this;
        }

        /**
         * <p>The conflict resolution strategy when the API to be imported has the same name and version as an existing one. Valid values:</p>
         * <ul>
         * <li>SpecOnly: full override.</li>
         * <li>SpecFirst: Merge with priority on the newly imported file. New APIs are created and existing ones are updated. APIs not included in the file remain unchanged.</li>
         * <li>ExistFirst (default): Merge with priority on existing APIs. New APIs are created but existing ones remain unchanged. If this parameter is not specified, the ExistFirst policy takes effect.</li>
         * </ul>
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
         * <p>The target REST API ID for direct updates. If specified, the import operation will directly update the designated API instead of creating new APIs or updating existing APIs based on the name and version. Only REST APIs can be specified.</p>
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
         * <p>The API versioning configuration. If versioning is enabled, an imported API that matches both the version number and the API name of an existing API will update that API. If versioning is disabled, an imported API that matches the API name of an existing API will update it.</p>
         */
        public Builder versionConfig(HttpApiVersionConfig versionConfig) {
            this.putBodyParameter("versionConfig", versionConfig);
            this.versionConfig = versionConfig;
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
             * <p>The OSS bucket name.</p>
             * 
             * <strong>example:</strong>
             * <p>api-1</p>
             */
            public Builder bucketName(String bucketName) {
                this.bucketName = bucketName;
                return this;
            }

            /**
             * <p>The full file path in OSS.</p>
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
             * <p>cn-hangzhou</p>
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
