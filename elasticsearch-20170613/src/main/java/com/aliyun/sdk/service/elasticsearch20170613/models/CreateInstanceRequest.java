// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.elasticsearch20170613.models;

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
    private java.util.List<Tags> tags;

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
    public java.util.List<Tags> getTags() {
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
        private java.util.List<Tags> tags; 
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
         * <p>The client node configuration.</p>
         */
        public Builder clientNodeConfiguration(ClientNodeConfiguration clientNodeConfiguration) {
            this.putBodyParameter("clientNodeConfiguration", clientNodeConfiguration);
            this.clientNodeConfiguration = clientNodeConfiguration;
            return this;
        }

        /**
         * <p>The instance name.</p>
         * 
         * <strong>example:</strong>
         * <p>es</p>
         */
        public Builder description(String description) {
            this.putBodyParameter("description", description);
            this.description = description;
            return this;
        }

        /**
         * <p>The elastic node configuration.</p>
         */
        public Builder elasticDataNodeConfiguration(ElasticDataNodeConfiguration elasticDataNodeConfiguration) {
            this.putBodyParameter("elasticDataNodeConfiguration", elasticDataNodeConfiguration);
            this.elasticDataNodeConfiguration = elasticDataNodeConfiguration;
            return this;
        }

        /**
         * <p>The access password of the instance. The password must contain at least three of the following character types: uppercase letters, lowercase letters, digits, and special characters (!@#$%^&amp;*()_+-=). The password must be 8 to 32 characters in length.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>Es_password</p>
         */
        public Builder esAdminPassword(String esAdminPassword) {
            this.putBodyParameter("esAdminPassword", esAdminPassword);
            this.esAdminPassword = esAdminPassword;
            return this;
        }

        /**
         * <p>The instance version. Valid values:</p>
         * <ul>
         * <li>8.5.1_with_X-Pack</li>
         * <li>7.10_with_X-Pack</li>
         * <li>6.7_with_X-Pack</li>
         * <li>7.7_with_X-Pack</li>
         * <li>6.8_with_X-Pack</li>
         * <li>6.3_with_X-Pack</li>
         * <li>5.6_with_X-Pack</li>
         * <li>5.5.3_with_X-Pack</li>
         * </ul>
         * <blockquote>
         * <p>The versions listed above may not include all versions supported by Elasticsearch instances. Call the <a href="https://help.aliyun.com/document_detail/254099.html">GetRegionConfiguration</a> operation to view the actual supported versions.</p>
         * </blockquote>
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
         * <p>The edition type. Valid values:</p>
         * <ul>
         * <li>x-pack: Creates a commercial edition instance, or a kernel-enhanced edition instance without Indexing Service or OpenStore enabled.</li>
         * <li>IS: Creates a kernel-enhanced edition instance with Indexing Service or OpenStore enabled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>advanced</p>
         */
        public Builder instanceCategory(String instanceCategory) {
            this.putBodyParameter("instanceCategory", instanceCategory);
            this.instanceCategory = instanceCategory;
            return this;
        }

        /**
         * <p>The Kibana node configuration.</p>
         * <blockquote>
         * <p>We strongly recommend that you enable Kibana nodes.</p>
         * </blockquote>
         */
        public Builder kibanaConfiguration(KibanaNodeConfiguration kibanaConfiguration) {
            this.putBodyParameter("kibanaConfiguration", kibanaConfiguration);
            this.kibanaConfiguration = kibanaConfiguration;
            return this;
        }

        /**
         * <p>The dedicated master node configuration.</p>
         * <blockquote>
         * <p>In the Beijing, Shanghai, Hangzhou, and Shenzhen regions, when you call createInstance to create an instance with next-generation cloud disk-based dedicated master nodes, specify the instance family followed by the <code>.new</code> suffix. For example, elasticsearch.sn1ne.large.new.</p>
         * </blockquote>
         */
        public Builder masterConfiguration(MasterNodeConfiguration masterConfiguration) {
            this.putBodyParameter("masterConfiguration", masterConfiguration);
            this.masterConfiguration = masterConfiguration;
            return this;
        }

        /**
         * <p>The network configuration.</p>
         * <blockquote>
         * <p>You cannot specify an IP whitelist when creating an instance.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         */
        public Builder networkConfig(NetworkConfig networkConfig) {
            this.putBodyParameter("networkConfig", networkConfig);
            this.networkConfig = networkConfig;
            return this;
        }

        /**
         * <p>The number of data nodes. Valid values: 2 to 50.</p>
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
         * <p>The data node configuration.</p>
         * <blockquote>
         * <p>In the Beijing, Shanghai, Hangzhou, and Shenzhen regions, when you call createInstance to create an instance with next-generation cloud disk-based data nodes, specify the instance family followed by the <code>.new</code> suffix. For example, elasticsearch.sn1ne.large.new.</p>
         * </blockquote>
         */
        public Builder nodeSpec(NodeSpec nodeSpec) {
            this.putBodyParameter("nodeSpec", nodeSpec);
            this.nodeSpec = nodeSpec;
            return this;
        }

        /**
         * <p>The billing details of the subscription instance. This parameter is required when you create a subscription instance.</p>
         */
        public Builder paymentInfo(PaymentInfo paymentInfo) {
            this.putBodyParameter("paymentInfo", paymentInfo);
            this.paymentInfo = paymentInfo;
            return this;
        }

        /**
         * <p>The billing method. Valid values:</p>
         * <ul>
         * <li>postpaid: pay-as-you-go billing method</li>
         * <li>prepaid: subscription</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>postpaid</p>
         */
        public Builder paymentType(String paymentType) {
            this.putBodyParameter("paymentType", paymentType);
            this.paymentType = paymentType;
            return this;
        }

        /**
         * <p>The ID of the resource group to which the instance belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>rg-aekzu7tsu4n****</p>
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.putBodyParameter("resourceGroupId", resourceGroupId);
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        /**
         * <p>The instance tags.</p>
         */
        public Builder tags(java.util.List<Tags> tags) {
            this.putBodyParameter("tags", tags);
            this.tags = tags;
            return this;
        }

        /**
         * <p>The cold data node configuration.</p>
         */
        public Builder warmNodeConfiguration(WarmNodeConfiguration warmNodeConfiguration) {
            this.putBodyParameter("warmNodeConfiguration", warmNodeConfiguration);
            this.warmNodeConfiguration = warmNodeConfiguration;
            return this;
        }

        /**
         * <p>The number of zones for the instance. Valid values: 1, 2, and 3. Default value: 1.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        public Builder zoneCount(Integer zoneCount) {
            this.putBodyParameter("zoneCount", zoneCount);
            this.zoneCount = zoneCount;
            return this;
        }

        /**
         * <p>A client token that is used to ensure the idempotence of the request. You can use the client to generate the token, but you must make sure that the token is unique among different requests. The token can contain only ASCII characters and cannot exceed 64 characters in length.</p>
         * 
         * <strong>example:</strong>
         * <p>5A2CFF0E-5718-45B5-9D4D-70B3FF****</p>
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

            private Builder() {
            } 

            private Builder(Tags model) {
                this.tagKey = model.tagKey;
                this.tagValue = model.tagValue;
            } 

            /**
             * <p>The tag key of the instance.</p>
             * 
             * <strong>example:</strong>
             * <p>KeyTest</p>
             */
            public Builder tagKey(String tagKey) {
                this.tagKey = tagKey;
                return this;
            }

            /**
             * <p>The tag value of the instance.</p>
             * 
             * <strong>example:</strong>
             * <p>KeyValue</p>
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
