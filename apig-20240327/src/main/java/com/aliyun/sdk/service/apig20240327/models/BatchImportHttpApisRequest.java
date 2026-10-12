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
 * {@link BatchImportHttpApisRequest} extends {@link RequestModel}
 *
 * <p>BatchImportHttpApisRequest</p>
 */
public class BatchImportHttpApisRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("allowUpdate")
    private Boolean allowUpdate;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("apiType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String apiType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("dryRun")
    private Boolean dryRun;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("gatewayId")
    private String gatewayId;

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
    @com.aliyun.core.annotation.NameInMap("withGatewayExtension")
    private Boolean withGatewayExtension;

    private BatchImportHttpApisRequest(Builder builder) {
        super(builder);
        this.allowUpdate = builder.allowUpdate;
        this.apiType = builder.apiType;
        this.dryRun = builder.dryRun;
        this.gatewayId = builder.gatewayId;
        this.resourceGroupId = builder.resourceGroupId;
        this.specContentBase64 = builder.specContentBase64;
        this.specFileUrl = builder.specFileUrl;
        this.specOssConfig = builder.specOssConfig;
        this.strategy = builder.strategy;
        this.withGatewayExtension = builder.withGatewayExtension;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static BatchImportHttpApisRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return allowUpdate
     */
    public Boolean getAllowUpdate() {
        return this.allowUpdate;
    }

    /**
     * @return apiType
     */
    public String getApiType() {
        return this.apiType;
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
     * @return withGatewayExtension
     */
    public Boolean getWithGatewayExtension() {
        return this.withGatewayExtension;
    }

    public static final class Builder extends Request.Builder<BatchImportHttpApisRequest, Builder> {
        private Boolean allowUpdate; 
        private String apiType; 
        private Boolean dryRun; 
        private String gatewayId; 
        private String resourceGroupId; 
        private String specContentBase64; 
        private String specFileUrl; 
        private SpecOssConfig specOssConfig; 
        private String strategy; 
        private Boolean withGatewayExtension; 

        private Builder() {
            super();
        } 

        private Builder(BatchImportHttpApisRequest request) {
            super(request);
            this.allowUpdate = request.allowUpdate;
            this.apiType = request.apiType;
            this.dryRun = request.dryRun;
            this.gatewayId = request.gatewayId;
            this.resourceGroupId = request.resourceGroupId;
            this.specContentBase64 = request.specContentBase64;
            this.specFileUrl = request.specFileUrl;
            this.specOssConfig = request.specOssConfig;
            this.strategy = request.strategy;
            this.withGatewayExtension = request.withGatewayExtension;
        } 

        /**
         * <p>Specifies whether to overwrite existing APIs. If set to true, gatewayId is required.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder allowUpdate(Boolean allowUpdate) {
            this.putBodyParameter("allowUpdate", allowUpdate);
            this.allowUpdate = allowUpdate;
            return this;
        }

        /**
         * <p>The API type.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>Http</p>
         */
        public Builder apiType(String apiType) {
            this.putBodyParameter("apiType", apiType);
            this.apiType = apiType;
            return this;
        }

        /**
         * <p>Enables the dry run feature, which validates the definition without performing the actual import.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder dryRun(Boolean dryRun) {
            this.putBodyParameter("dryRun", dryRun);
            this.dryRun = dryRun;
            return this;
        }

        /**
         * <p>The gateway instance ID. For REST APIs, this parameter is required when withGatewayExtension is set to true or allowUpdate is set to true. For batch import of HTTP APIs, this parameter is always required.</p>
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
         * <p>The resource group ID.</p>
         * 
         * <strong>example:</strong>
         * <p>rg-xxx</p>
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.putBodyParameter("resourceGroupId", resourceGroupId);
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        /**
         * <p>The standard Base64 encoding of the raw bytes of the OAS ZIP package. The decoded size cannot exceed 10 MiB. This parameter cannot be specified together with specFileUrl or specOssConfig. Dry run is supported and returns validation results, but the dry run task result does not return a replayable importRequest.</p>
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
         * <p>The download URL of the OAS ZIP file. The URL must support unauthenticated downloads. OSS URLs and whitelisted backend domain names are supported. At least one of specFileUrl and specOssConfig must be specified.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://oss-cn-hangzhou.aliyuncs.com/my-bucket/imports/batch.zip">https://oss-cn-hangzhou.aliyuncs.com/my-bucket/imports/batch.zip</a></p>
         */
        public Builder specFileUrl(String specFileUrl) {
            this.putBodyParameter("specFileUrl", specFileUrl);
            this.specFileUrl = specFileUrl;
            return this;
        }

        /**
         * <p>The OSS configuration for the OAS file in ZIP format. At least one of specFileUrl and specOssConfig must be specified.</p>
         */
        public Builder specOssConfig(SpecOssConfig specOssConfig) {
            this.putBodyParameter("specOssConfig", specOssConfig);
            this.specOssConfig = specOssConfig;
            return this;
        }

        /**
         * <p>The conflict merge strategy during import. Default value: ExistFirst.</p>
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
         * <p>Specifies whether to import with gateway extension configurations. This parameter must be set to true for batch import of HTTP APIs.</p>
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
        public BatchImportHttpApisRequest build() {
            return new BatchImportHttpApisRequest(this);
        } 

    } 

    /**
     * 
     * {@link BatchImportHttpApisRequest} extends {@link TeaModel}
     *
     * <p>BatchImportHttpApisRequest</p>
     */
    public static class SpecOssConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("bucketName")
        @com.aliyun.core.annotation.Validation(required = true)
        private String bucketName;

        @com.aliyun.core.annotation.NameInMap("objectKey")
        @com.aliyun.core.annotation.Validation(required = true)
        private String objectKey;

        @com.aliyun.core.annotation.NameInMap("regionId")
        @com.aliyun.core.annotation.Validation(required = true)
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
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>my-bucket</p>
             */
            public Builder bucketName(String bucketName) {
                this.bucketName = bucketName;
                return this;
            }

            /**
             * <p>OSS Object Key。</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>imports/batch.zip</p>
             */
            public Builder objectKey(String objectKey) {
                this.objectKey = objectKey;
                return this;
            }

            /**
             * <p>The region ID of the OSS bucket.</p>
             * <p>This parameter is required.</p>
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
