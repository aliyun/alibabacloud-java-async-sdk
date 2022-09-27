// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.elasticsearch20170613.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateInstanceRequest} extends {@link RequestModel}
 *
 * <p>CreateInstanceRequest</p>
 */
public class CreateInstanceRequest extends Request {
    @Body
    @NameInMap("clientNodeConfiguration")
    private ClientNodeConfiguration clientNodeConfiguration;

    @Body
    @NameInMap("elasticDataNodeConfiguration")
    private ElasticDataNodeConfiguration elasticDataNodeConfiguration;

    @Body
    @NameInMap("esAdminPassword")
    private String esAdminPassword;

    @Body
    @NameInMap("esVersion")
    private String esVersion;

    @Body
    @NameInMap("instanceCategory")
    private String instanceCategory;

    @Body
    @NameInMap("kibanaConfiguration")
    private KibanaNodeConfiguration kibanaConfiguration;

    @Body
    @NameInMap("masterConfiguration")
    private MasterNodeConfiguration masterConfiguration;

    @Body
    @NameInMap("networkConfig")
    private NetworkConfig networkConfig;

    @Body
    @NameInMap("nodeAmount")
    private Integer nodeAmount;

    @Body
    @NameInMap("nodeSpec")
    private NodeSpec nodeSpec;

    @Body
    @NameInMap("paymentInfo")
    private PaymentInfo paymentInfo;

    @Body
    @NameInMap("paymentType")
    private String paymentType;

    @Body
    @NameInMap("warmNodeConfiguration")
    private WarmNodeConfiguration warmNodeConfiguration;

    @Body
    @NameInMap("zoneCount")
    private Integer zoneCount;

    @Query
    @NameInMap("clientToken")
    private String clientToken;

    private CreateInstanceRequest(Builder builder) {
        super(builder);
        this.clientNodeConfiguration = builder.clientNodeConfiguration;
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
        private WarmNodeConfiguration warmNodeConfiguration; 
        private Integer zoneCount; 
        private String clientToken; 

        private Builder() {
            super();
        } 

        private Builder(CreateInstanceRequest request) {
            super(request);
            this.clientNodeConfiguration = request.clientNodeConfiguration;
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
         * elasticDataNodeConfiguration.
         */
        public Builder elasticDataNodeConfiguration(ElasticDataNodeConfiguration elasticDataNodeConfiguration) {
            this.putBodyParameter("elasticDataNodeConfiguration", elasticDataNodeConfiguration);
            this.elasticDataNodeConfiguration = elasticDataNodeConfiguration;
            return this;
        }

        /**
         * esAdminPassword.
         */
        public Builder esAdminPassword(String esAdminPassword) {
            this.putBodyParameter("esAdminPassword", esAdminPassword);
            this.esAdminPassword = esAdminPassword;
            return this;
        }

        /**
         * esVersion.
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
         * networkConfig.
         */
        public Builder networkConfig(NetworkConfig networkConfig) {
            this.putBodyParameter("networkConfig", networkConfig);
            this.networkConfig = networkConfig;
            return this;
        }

        /**
         * nodeAmount.
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

}
