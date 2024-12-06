// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.elasticsearch20170613.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link CreateInstanceRequest} extends {@link RequestModel}
 *
 * <p>CreateInstanceRequest</p>
 */
public class CreateInstanceRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("clientNodeConfiguration")
    private ClientNodeConfiguration clientNodeConfiguration;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("description")
    private String description;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("elasticDataNodeConfiguration")
    private ElasticDataNodeConfiguration elasticDataNodeConfiguration;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("esAdminPassword")
    @com.aliyun.core.annotation.Validation(required = true)
    private String esAdminPassword;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("esVersion")
    @com.aliyun.core.annotation.Validation(required = true)
    private String esVersion;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("instanceCategory")
    private String instanceCategory;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("kibanaConfiguration")
    private KibanaNodeConfiguration kibanaConfiguration;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("masterConfiguration")
    private MasterNodeConfiguration masterConfiguration;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("networkConfig")
    @com.aliyun.core.annotation.Validation(required = true)
    private NetworkConfig networkConfig;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("nodeAmount")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer nodeAmount;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("nodeSpec")
    private NodeSpec nodeSpec;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("paymentInfo")
    private PaymentInfo paymentInfo;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("paymentType")
    private String paymentType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("resourceGroupId")
    private String resourceGroupId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("tags")
    private java.util.List < Tags> tags;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("warmNodeConfiguration")
    private WarmNodeConfiguration warmNodeConfiguration;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("zoneCount")
    private Integer zoneCount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("clientToken")
    private String clientToken;

    private CreateInstanceRequest(Builder builder) {
        super(builder);
        this.clientNodeConfiguration = builder.clientNodeConfiguration;
        this.description = builder.description;
        this.elasticDataNodeConfiguration = builder.elasticDataNodeConfiguration;
        this.esAdminPassword = builder.esAdminPassword;
        this.esVersion = builder.esVersion;
        this.instanceCategory = builder.instanceCategory;
        this.kibanaConfiguration = builder.kibanaConfiguration;
        this.masterConfiguration = builder.masterConfiguration;
        this.networkConfig = builder.networkConfig;
        this.nodeAmount = builder.nodeAmount;
        this.nodeSpec = builder.nodeSpec;
        this.paymentInfo = builder.paymentInfo;
        this.paymentType = builder.paymentType;
        this.resourceGroupId = builder.resourceGroupId;
        this.tags = builder.tags;
        this.warmNodeConfiguration = builder.warmNodeConfiguration;
        this.zoneCount = builder.zoneCount;
        this.clientToken = builder.clientToken;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateInstanceRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return clientNodeConfiguration
     */
    public ClientNodeConfiguration getClientNodeConfiguration() {
        return this.clientNodeConfiguration;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return elasticDataNodeConfiguration
     */
    public ElasticDataNodeConfiguration getElasticDataNodeConfiguration() {
        return this.elasticDataNodeConfiguration;
    }

    /**
     * @return esAdminPassword
     */
    public String getEsAdminPassword() {
        return this.esAdminPassword;
    }

    /**
     * @return esVersion
     */
    public String getEsVersion() {
        return this.esVersion;
    }

    /**
     * @return instanceCategory
     */
    public String getInstanceCategory() {
        return this.instanceCategory;
    }

    /**
     * @return kibanaConfiguration
     */
    public KibanaNodeConfiguration getKibanaConfiguration() {
        return this.kibanaConfiguration;
    }

    /**
     * @return masterConfiguration
     */
    public MasterNodeConfiguration getMasterConfiguration() {
        return this.masterConfiguration;
    }

    /**
     * @return networkConfig
     */
    public NetworkConfig getNetworkConfig() {
        return this.networkConfig;
    }

    /**
     * @return nodeAmount
     */
    public Integer getNodeAmount() {
        return this.nodeAmount;
    }

    /**
     * @return nodeSpec
     */
    public NodeSpec getNodeSpec() {
        return this.nodeSpec;
    }

    /**
     * @return paymentInfo
     */
    public PaymentInfo getPaymentInfo() {
        return this.paymentInfo;
    }

    /**
     * @return paymentType
     */
    public String getPaymentType() {
        return this.paymentType;
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

    /**
     * @return warmNodeConfiguration
     */
    public WarmNodeConfiguration getWarmNodeConfiguration() {
        return this.warmNodeConfiguration;
    }

    /**
     * @return zoneCount
     */
    public Integer getZoneCount() {
        return this.zoneCount;
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    public static final class Builder extends Request.Builder<CreateInstanceRequest, Builder> {
        private ClientNodeConfiguration clientNodeConfiguration; 
        private String description; 
        private ElasticDataNodeConfiguration elasticDataNodeConfiguration; 
        private String esAdminPassword; 
        private String esVersion; 
        private String instanceCategory; 
        private KibanaNodeConfiguration kibanaConfiguration; 
        private MasterNodeConfiguration masterConfiguration; 
        private NetworkConfig networkConfig; 
        private Integer nodeAmount; 
        private NodeSpec nodeSpec; 
        private PaymentInfo paymentInfo; 
        private String paymentType; 
        private String resourceGroupId; 
        private java.util.List < Tags> tags; 
        private WarmNodeConfiguration warmNodeConfiguration; 
        private Integer zoneCount; 
        private String clientToken; 

        private Builder() {
            super();
        } 

        private Builder(CreateInstanceRequest request) {
            super(request);
            this.clientNodeConfiguration = request.clientNodeConfiguration;
            this.description = request.description;
            this.elasticDataNodeConfiguration = request.elasticDataNodeConfiguration;
            this.esAdminPassword = request.esAdminPassword;
            this.esVersion = request.esVersion;
            this.instanceCategory = request.instanceCategory;
            this.kibanaConfiguration = request.kibanaConfiguration;
            this.masterConfiguration = request.masterConfiguration;
            this.networkConfig = request.networkConfig;
            this.nodeAmount = request.nodeAmount;
            this.nodeSpec = request.nodeSpec;
            this.paymentInfo = request.paymentInfo;
            this.paymentType = request.paymentType;
            this.resourceGroupId = request.resourceGroupId;
            this.tags = request.tags;
            this.warmNodeConfiguration = request.warmNodeConfiguration;
            this.zoneCount = request.zoneCount;
            this.clientToken = request.clientToken;
        } 

        /**
         * clientNodeConfiguration.
         */
        public Builder clientNodeConfiguration(ClientNodeConfiguration clientNodeConfiguration) {
            this.putBodyParameter("clientNodeConfiguration", clientNodeConfiguration);
            this.clientNodeConfiguration = clientNodeConfiguration;
            return this;
        }

        /**
         * description.
         */
        public Builder description(String description) {
            this.putBodyParameter("description", description);
            this.description = description;
            return this;
        }

        /**
         * elasticDataNodeConfiguration.
         */
        public Builder elasticDataNodeConfiguration(ElasticDataNodeConfiguration elasticDataNodeConfiguration) {
            this.putBodyParameter("elasticDataNodeConfiguration", elasticDataNodeConfiguration);
            this.elasticDataNodeConfiguration = elasticDataNodeConfiguration;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>es_password</p>
         */
        public Builder esAdminPassword(String esAdminPassword) {
            this.putBodyParameter("esAdminPassword", esAdminPassword);
            this.esAdminPassword = esAdminPassword;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>5.5.3_with_X-Pack</p>
         */
        public Builder esVersion(String esVersion) {
            this.putBodyParameter("esVersion", esVersion);
            this.esVersion = esVersion;
            return this;
        }

        /**
         * instanceCategory.
         */
        public Builder instanceCategory(String instanceCategory) {
            this.putBodyParameter("instanceCategory", instanceCategory);
            this.instanceCategory = instanceCategory;
            return this;
        }

        /**
         * kibanaConfiguration.
         */
        public Builder kibanaConfiguration(KibanaNodeConfiguration kibanaConfiguration) {
            this.putBodyParameter("kibanaConfiguration", kibanaConfiguration);
            this.kibanaConfiguration = kibanaConfiguration;
            return this;
        }

        /**
         * masterConfiguration.
         */
        public Builder masterConfiguration(MasterNodeConfiguration masterConfiguration) {
            this.putBodyParameter("masterConfiguration", masterConfiguration);
            this.masterConfiguration = masterConfiguration;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder networkConfig(NetworkConfig networkConfig) {
            this.putBodyParameter("networkConfig", networkConfig);
            this.networkConfig = networkConfig;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        public Builder nodeAmount(Integer nodeAmount) {
            this.putBodyParameter("nodeAmount", nodeAmount);
            this.nodeAmount = nodeAmount;
            return this;
        }

        /**
         * nodeSpec.
         */
        public Builder nodeSpec(NodeSpec nodeSpec) {
            this.putBodyParameter("nodeSpec", nodeSpec);
            this.nodeSpec = nodeSpec;
            return this;
        }

        /**
         * paymentInfo.
         */
        public Builder paymentInfo(PaymentInfo paymentInfo) {
            this.putBodyParameter("paymentInfo", paymentInfo);
            this.paymentInfo = paymentInfo;
            return this;
        }

        /**
         * paymentType.
         */
        public Builder paymentType(String paymentType) {
            this.putBodyParameter("paymentType", paymentType);
            this.paymentType = paymentType;
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
         * tags.
         */
        public Builder tags(java.util.List < Tags> tags) {
            this.putBodyParameter("tags", tags);
            this.tags = tags;
            return this;
        }

        /**
         * warmNodeConfiguration.
         */
        public Builder warmNodeConfiguration(WarmNodeConfiguration warmNodeConfiguration) {
            this.putBodyParameter("warmNodeConfiguration", warmNodeConfiguration);
            this.warmNodeConfiguration = warmNodeConfiguration;
            return this;
        }

        /**
         * zoneCount.
         */
        public Builder zoneCount(Integer zoneCount) {
            this.putBodyParameter("zoneCount", zoneCount);
            this.zoneCount = zoneCount;
            return this;
        }

        /**
         * clientToken.
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("clientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        @Override
        public CreateInstanceRequest build() {
            return new CreateInstanceRequest(this);
        } 

    } 

    /**
     * 
     * {@link CreateInstanceRequest} extends {@link TeaModel}
     *
     * <p>CreateInstanceRequest</p>
     */
    public static class Tags extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("tagKey")
        private String tagKey;

        @com.aliyun.core.annotation.NameInMap("tagValue")
        private String tagValue;

        private Tags(Builder builder) {
            this.tagKey = builder.tagKey;
            this.tagValue = builder.tagValue;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Tags create() {
            return builder().build();
        }

        /**
         * @return tagKey
         */
        public String getTagKey() {
            return this.tagKey;
        }

        /**
         * @return tagValue
         */
        public String getTagValue() {
            return this.tagValue;
        }

        public static final class Builder {
            private String tagKey; 
            private String tagValue; 

            /**
             * tagKey.
             */
            public Builder tagKey(String tagKey) {
                this.tagKey = tagKey;
                return this;
            }

            /**
             * tagValue.
             */
            public Builder tagValue(String tagValue) {
                this.tagValue = tagValue;
                return this;
            }

            public Tags build() {
                return new Tags(this);
            } 

        } 

    }
}
