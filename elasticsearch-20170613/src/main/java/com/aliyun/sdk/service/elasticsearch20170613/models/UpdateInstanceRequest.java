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
 * {@link UpdateInstanceRequest} extends {@link RequestModel}
 *
 * <p>UpdateInstanceRequest</p>
 */
public class UpdateInstanceRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("clientNodeConfiguration")
    private ClientNodeConfiguration clientNodeConfiguration;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("elasticDataNodeConfiguration")
    private ElasticDataNodeConfiguration elasticDataNodeConfiguration;

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
    @com.aliyun.core.annotation.NameInMap("nodeAmount")
    private Integer nodeAmount;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("nodeSpec")
    private NodeSpec nodeSpec;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("updateType")
    private String updateType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("warmNodeConfiguration")
    private WarmNodeConfiguration warmNodeConfiguration;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("clientToken")
    private String clientToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("force")
    private Boolean force;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("orderActionType")
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
        this.updateType = builder.updateType;
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
     * @return updateType
     */
    public String getUpdateType() {
        return this.updateType;
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
        private String updateType; 
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
            this.updateType = request.updateType;
            this.warmNodeConfiguration = request.warmNodeConfiguration;
            this.clientToken = request.clientToken;
            this.force = request.force;
            this.orderActionType = request.orderActionType;
        } 

        /**
         * <p>The instance ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>es-cn-n6w1ptcb30009****</p>
         */
        public Builder instanceId(String instanceId) {
            this.putPathParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
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
         * <p>The elastic node configuration.</p>
         */
        public Builder elasticDataNodeConfiguration(ElasticDataNodeConfiguration elasticDataNodeConfiguration) {
            this.putBodyParameter("elasticDataNodeConfiguration", elasticDataNodeConfiguration);
            this.elasticDataNodeConfiguration = elasticDataNodeConfiguration;
            return this;
        }

        /**
         * <p>The edition type. Valid values:</p>
         * <ul>
         * <li>x-pack: Commercial Edition instance.</li>
         * <li>advanced: Advanced Edition instance.</li>
         * <li>IS: Advanced Edition instance with Indexing Service enabled.</li>
         * <li>community: Basic Edition instance.<blockquote>
         * <p>To create an Advanced Edition instance with OpenStore enabled, you must also enable Indexing Service.</p>
         * </blockquote>
         * </li>
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
         */
        public Builder kibanaConfiguration(KibanaNodeConfiguration kibanaConfiguration) {
            this.putBodyParameter("kibanaConfiguration", kibanaConfiguration);
            this.kibanaConfiguration = kibanaConfiguration;
            return this;
        }

        /**
         * <p>The dedicated master node configuration.</p>
         */
        public Builder masterConfiguration(MasterNodeConfiguration masterConfiguration) {
            this.putBodyParameter("masterConfiguration", masterConfiguration);
            this.masterConfiguration = masterConfiguration;
            return this;
        }

        /**
         * <p>The number of nodes.</p>
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
         */
        public Builder nodeSpec(NodeSpec nodeSpec) {
            this.putBodyParameter("nodeSpec", nodeSpec);
            this.nodeSpec = nodeSpec;
            return this;
        }

        /**
         * <p>normal: in-place change
         * blue_green: blue-green change</p>
         */
        public Builder updateType(String updateType) {
            this.putBodyParameter("updateType", updateType);
            this.updateType = updateType;
            return this;
        }

        /**
         * <p>The warm node configuration. The warm node is different from the data node.</p>
         */
        public Builder warmNodeConfiguration(WarmNodeConfiguration warmNodeConfiguration) {
            this.putBodyParameter("warmNodeConfiguration", warmNodeConfiguration);
            this.warmNodeConfiguration = warmNodeConfiguration;
            return this;
        }

        /**
         * <p>A unique token generated by the client to guarantee the idempotency of the request. The maximum length is 64 ASCII characters.</p>
         * 
         * <strong>example:</strong>
         * <p>5A2CFF0E-5718-45B5-9D4D-70B3FF****</p>
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("clientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * <p>Specifies whether to forcibly restart the instance. Valid values:</p>
         * <ul>
         * <li>true: Forcibly restarts the instance.</li>
         * <li>false (default): Does not forcibly restart the instance.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder force(Boolean force) {
            this.putQueryParameter("force", force);
            this.force = force;
            return this;
        }

        /**
         * <p>The type of configuration change. Valid values:</p>
         * <ul>
         * <li>upgrade (default): upgrade</li>
         * <li>downgrade: downgrade</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>upgrade</p>
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
