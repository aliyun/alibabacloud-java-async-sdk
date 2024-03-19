// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.arms20190808.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateEnvironmentRequest} extends {@link RequestModel}
 *
 * <p>CreateEnvironmentRequest</p>
 */
public class CreateEnvironmentRequest extends Request {
    @Query
    @NameInMap("AliyunLang")
    private String aliyunLang;

    @Query
    @NameInMap("BindResourceId")
    @Validation(required = true)
    private String bindResourceId;

    @Query
    @NameInMap("EnvironmentName")
    @Validation(required = true)
    private String environmentName;

    @Query
    @NameInMap("EnvironmentSubType")
    @Validation(required = true)
    private String environmentSubType;

    @Query
    @NameInMap("EnvironmentType")
    @Validation(required = true)
    private String environmentType;

    @Query
    @NameInMap("FeePackage")
    private String feePackage;

    @Query
    @NameInMap("ManagedType")
    private String managedType;

    @Query
    @NameInMap("PrometheusInstanceId")
    private String prometheusInstanceId;

    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    @Query
    @NameInMap("ResourceGroupId")
    private String resourceGroupId;

    @Query
    @NameInMap("Tags")
    private java.util.List < Tags> tags;

    private CreateEnvironmentRequest(Builder builder) {
        super(builder);
        this.aliyunLang = builder.aliyunLang;
        this.bindResourceId = builder.bindResourceId;
        this.environmentName = builder.environmentName;
        this.environmentSubType = builder.environmentSubType;
        this.environmentType = builder.environmentType;
        this.feePackage = builder.feePackage;
        this.managedType = builder.managedType;
        this.prometheusInstanceId = builder.prometheusInstanceId;
        this.regionId = builder.regionId;
        this.resourceGroupId = builder.resourceGroupId;
        this.tags = builder.tags;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateEnvironmentRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return aliyunLang
     */
    public String getAliyunLang() {
        return this.aliyunLang;
    }

    /**
     * @return bindResourceId
     */
    public String getBindResourceId() {
        return this.bindResourceId;
    }

    /**
     * @return environmentName
     */
    public String getEnvironmentName() {
        return this.environmentName;
    }

    /**
     * @return environmentSubType
     */
    public String getEnvironmentSubType() {
        return this.environmentSubType;
    }

    /**
     * @return environmentType
     */
    public String getEnvironmentType() {
        return this.environmentType;
    }

    /**
     * @return feePackage
     */
    public String getFeePackage() {
        return this.feePackage;
    }

    /**
     * @return managedType
     */
    public String getManagedType() {
        return this.managedType;
    }

    /**
     * @return prometheusInstanceId
     */
    public String getPrometheusInstanceId() {
        return this.prometheusInstanceId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return resourceGroupId
     */
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    /**
     * @return tags
     */
    public java.util.List < Tags> getTags() {
        return this.tags;
    }

    public static final class Builder extends Request.Builder<CreateEnvironmentRequest, Builder> {
        private String aliyunLang; 
        private String bindResourceId; 
        private String environmentName; 
        private String environmentSubType; 
        private String environmentType; 
        private String feePackage; 
        private String managedType; 
        private String prometheusInstanceId; 
        private String regionId; 
        private String resourceGroupId; 
        private java.util.List < Tags> tags; 

        private Builder() {
            super();
        } 

        private Builder(CreateEnvironmentRequest request) {
            super(request);
            this.aliyunLang = request.aliyunLang;
            this.bindResourceId = request.bindResourceId;
            this.environmentName = request.environmentName;
            this.environmentSubType = request.environmentSubType;
            this.environmentType = request.environmentType;
            this.feePackage = request.feePackage;
            this.managedType = request.managedType;
            this.prometheusInstanceId = request.prometheusInstanceId;
            this.regionId = request.regionId;
            this.resourceGroupId = request.resourceGroupId;
            this.tags = request.tags;
        } 

        /**
         * The language. Valid values: zh and en. Default value: zh.
         */
        public Builder aliyunLang(String aliyunLang) {
            this.putQueryParameter("AliyunLang", aliyunLang);
            this.aliyunLang = aliyunLang;
            return this;
        }

        /**
         * The ID of the resource bound to the environment, such as the container ID or VPC ID. For a Cloud environment, specify the region ID.
         */
        public Builder bindResourceId(String bindResourceId) {
            this.putQueryParameter("BindResourceId", bindResourceId);
            this.bindResourceId = bindResourceId;
            return this;
        }

        /**
         * The name of the environment.
         */
        public Builder environmentName(String environmentName) {
            this.putQueryParameter("EnvironmentName", environmentName);
            this.environmentName = environmentName;
            return this;
        }

        /**
         * The subtype of the environment. Valid values:
         * <p>
         * 
         * *   CS: Container Service for Kubernetes (ACK)
         * *   ECS: Elastic Compute Service (ECS)
         * *   Cloud: cloud service
         */
        public Builder environmentSubType(String environmentSubType) {
            this.putQueryParameter("EnvironmentSubType", environmentSubType);
            this.environmentSubType = environmentSubType;
            return this;
        }

        /**
         * The type of the environment. Valid values:
         * <p>
         * 
         * *   CS: Container Service
         * *   ECS: Elastic Compute Service
         * *   Cloud: cloud service
         */
        public Builder environmentType(String environmentType) {
            this.putQueryParameter("EnvironmentType", environmentType);
            this.environmentType = environmentType;
            return this;
        }

        /**
         * FeePackage.
         */
        public Builder feePackage(String feePackage) {
            this.putQueryParameter("FeePackage", feePackage);
            this.feePackage = feePackage;
            return this;
        }

        /**
         * type of managed: 
         * <p>
         * - none: not managed. default value of prometheus for ACK.
         * - agent: managed agent. default value of  promehtues for ASK/ACS/AckOne.
         * - agent-exproter: maanged agent and exporter. default of prometheus for Cloud.
         */
        public Builder managedType(String managedType) {
            this.putQueryParameter("ManagedType", managedType);
            this.managedType = managedType;
            return this;
        }

        /**
         * the ID of prometheus instance bound to the environment. If not provided, please call the InitEnvironment interface to complete the initialization of the storage instance.
         */
        public Builder prometheusInstanceId(String prometheusInstanceId) {
            this.putQueryParameter("PrometheusInstanceId", prometheusInstanceId);
            this.prometheusInstanceId = prometheusInstanceId;
            return this;
        }

        /**
         * The region ID.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * The ID of the resource group.
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.putQueryParameter("ResourceGroupId", resourceGroupId);
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        /**
         * The tags of the instance. You can specify this parameter to manage tags for the instance.
         */
        public Builder tags(java.util.List < Tags> tags) {
            this.putQueryParameter("Tags", tags);
            this.tags = tags;
            return this;
        }

        @Override
        public CreateEnvironmentRequest build() {
            return new CreateEnvironmentRequest(this);
        } 

    } 

    public static class Tags extends TeaModel {
        @NameInMap("Key")
        private String key;

        @NameInMap("Value")
        private String value;

        private Tags(Builder builder) {
            this.key = builder.key;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Tags create() {
            return builder().build();
        }

        /**
         * @return key
         */
        public String getKey() {
            return this.key;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String key; 
            private String value; 

            /**
             * The tag key.
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * The tag value.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public Tags build() {
                return new Tags(this);
            } 

        } 

    }
}
