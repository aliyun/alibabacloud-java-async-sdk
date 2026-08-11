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
            this.specFileUrl = request.specFileUrl;
            this.specOssConfig = request.specOssConfig;
            this.strategy = request.strategy;
            this.withGatewayExtension = request.withGatewayExtension;
        } 

        /**
         * allowUpdate.
         */
        public Builder allowUpdate(Boolean allowUpdate) {
            this.putBodyParameter("allowUpdate", allowUpdate);
            this.allowUpdate = allowUpdate;
            return this;
        }

        /**
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
         * dryRun.
         */
        public Builder dryRun(Boolean dryRun) {
            this.putBodyParameter("dryRun", dryRun);
            this.dryRun = dryRun;
            return this;
        }

        /**
         * gatewayId.
         */
        public Builder gatewayId(String gatewayId) {
            this.putBodyParameter("gatewayId", gatewayId);
            this.gatewayId = gatewayId;
            return this;
        }

        /**
         * resourceGroupId.
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.putBodyParameter("resourceGroupId", resourceGroupId);
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        /**
         * specFileUrl.
         */
        public Builder specFileUrl(String specFileUrl) {
            this.putBodyParameter("specFileUrl", specFileUrl);
            this.specFileUrl = specFileUrl;
            return this;
        }

        /**
         * specOssConfig.
         */
        public Builder specOssConfig(SpecOssConfig specOssConfig) {
            this.putBodyParameter("specOssConfig", specOssConfig);
            this.specOssConfig = specOssConfig;
            return this;
        }

        /**
         * strategy.
         */
        public Builder strategy(String strategy) {
            this.putBodyParameter("strategy", strategy);
            this.strategy = strategy;
            return this;
        }

        /**
         * withGatewayExtension.
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
