// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.elasticsearch20170613.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateInstanceRequest} extends {@link RequestModel}
 *
 * <p>UpdateInstanceRequest</p>
 */
public class UpdateInstanceRequest extends Request {
    @Path
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    @Body
    @NameInMap("clientNodeConfiguration")
    private ClientNodeConfiguration clientNodeConfiguration;

    @Body
    @NameInMap("elasticDataNodeConfiguration")
    private ElasticDataNodeConfiguration elasticDataNodeConfiguration;

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
    @NameInMap("nodeAmount")
    private Integer nodeAmount;

    @Body
    @NameInMap("nodeSpec")
    private NodeSpec nodeSpec;

    @Body
    @NameInMap("warmNodeConfiguration")
    private WarmNodeConfiguration warmNodeConfiguration;

    @Query
    @NameInMap("clientToken")
    private String clientToken;

    @Query
    @NameInMap("force")
    private Boolean force;

    @Query
    @NameInMap("orderActionType")
    private String orderActionType;

    private UpdateInstanceRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.clientNodeConfiguration = builder.clientNodeConfiguration;
        this.elasticDataNodeConfiguration = builder.elasticDataNodeConfiguration;
        this.instanceCategory = builder.instanceCategory;
        this.kibanaConfiguration = builder.kibanaConfiguration;
        this.masterConfiguration = builder.masterConfiguration;
        this.nodeAmount = builder.nodeAmount;
        this.nodeSpec = builder.nodeSpec;
        this.warmNodeConfiguration = builder.warmNodeConfiguration;
        this.clientToken = builder.clientToken;
        this.force = builder.force;
        this.orderActionType = builder.orderActionType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateInstanceRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
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
     * @return warmNodeConfiguration
     */
    public WarmNodeConfiguration getWarmNodeConfiguration() {
        return this.warmNodeConfiguration;
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return force
     */
    public Boolean getForce() {
        return this.force;
    }

    /**
     * @return orderActionType
     */
    public String getOrderActionType() {
        return this.orderActionType;
    }

    public static final class Builder extends Request.Builder<UpdateInstanceRequest, Builder> {
        private String instanceId; 
        private ClientNodeConfiguration clientNodeConfiguration; 
        private ElasticDataNodeConfiguration elasticDataNodeConfiguration; 
        private String instanceCategory; 
        private KibanaNodeConfiguration kibanaConfiguration; 
        private MasterNodeConfiguration masterConfiguration; 
        private Integer nodeAmount; 
        private NodeSpec nodeSpec; 
        private WarmNodeConfiguration warmNodeConfiguration; 
        private String clientToken; 
        private Boolean force; 
        private String orderActionType; 

        private Builder() {
            super();
        } 

        private Builder(UpdateInstanceRequest request) {
            super(request);
            this.instanceId = request.instanceId;
            this.clientNodeConfiguration = request.clientNodeConfiguration;
            this.elasticDataNodeConfiguration = request.elasticDataNodeConfiguration;
            this.instanceCategory = request.instanceCategory;
            this.kibanaConfiguration = request.kibanaConfiguration;
            this.masterConfiguration = request.masterConfiguration;
            this.nodeAmount = request.nodeAmount;
            this.nodeSpec = request.nodeSpec;
            this.warmNodeConfiguration = request.warmNodeConfiguration;
            this.clientToken = request.clientToken;
            this.force = request.force;
            this.orderActionType = request.orderActionType;
        } 

        /**
         * The ID of the request.
         */
        public Builder instanceId(String instanceId) {
            this.putPathParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
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
         * warmNodeConfiguration.
         */
        public Builder warmNodeConfiguration(WarmNodeConfiguration warmNodeConfiguration) {
            this.putBodyParameter("warmNodeConfiguration", warmNodeConfiguration);
            this.warmNodeConfiguration = warmNodeConfiguration;
            return this;
        }

        /**
         * The result of the request.
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("clientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * force.
         */
        public Builder force(Boolean force) {
            this.putQueryParameter("force", force);
            this.force = force;
            return this;
        }

        /**
         * The number of data nodes.
         */
        public Builder orderActionType(String orderActionType) {
            this.putQueryParameter("orderActionType", orderActionType);
            this.orderActionType = orderActionType;
            return this;
        }

        @Override
        public UpdateInstanceRequest build() {
            return new UpdateInstanceRequest(this);
        } 

    } 

}
