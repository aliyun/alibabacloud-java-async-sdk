// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.elasticsearch20170613.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link RestartLogstashRequest} extends {@link RequestModel}
 *
 * <p>RestartLogstashRequest</p>
 */
public class RestartLogstashRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("batchCount")
    @com.aliyun.core.annotation.Validation(maximum = 100)
    private Double batchCount;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("blueGreenDep")
    private Boolean blueGreenDep;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("nodeTypes")
    private java.util.List < String > nodeTypes;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("nodes")
    private java.util.List < String > nodes;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("restartType")
    private String restartType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("clientToken")
    private String clientToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("force")
    private Boolean force;

    private RestartLogstashRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.batchCount = builder.batchCount;
        this.blueGreenDep = builder.blueGreenDep;
        this.nodeTypes = builder.nodeTypes;
        this.nodes = builder.nodes;
        this.restartType = builder.restartType;
        this.clientToken = builder.clientToken;
        this.force = builder.force;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RestartLogstashRequest create() {
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
     * @return batchCount
     */
    public Double getBatchCount() {
        return this.batchCount;
    }

    /**
     * @return blueGreenDep
     */
    public Boolean getBlueGreenDep() {
        return this.blueGreenDep;
    }

    /**
     * @return nodeTypes
     */
    public java.util.List < String > getNodeTypes() {
        return this.nodeTypes;
    }

    /**
     * @return nodes
     */
    public java.util.List < String > getNodes() {
        return this.nodes;
    }

    /**
     * @return restartType
     */
    public String getRestartType() {
        return this.restartType;
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

    public static final class Builder extends Request.Builder<RestartLogstashRequest, Builder> {
        private String instanceId; 
        private Double batchCount; 
        private Boolean blueGreenDep; 
        private java.util.List < String > nodeTypes; 
        private java.util.List < String > nodes; 
        private String restartType; 
        private String clientToken; 
        private Boolean force; 

        private Builder() {
            super();
        } 

        private Builder(RestartLogstashRequest request) {
            super(request);
            this.instanceId = request.instanceId;
            this.batchCount = request.batchCount;
            this.blueGreenDep = request.blueGreenDep;
            this.nodeTypes = request.nodeTypes;
            this.nodes = request.nodes;
            this.restartType = request.restartType;
            this.clientToken = request.clientToken;
            this.force = request.force;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ls-cn-v0h1kzca****</p>
         */
        public Builder instanceId(String instanceId) {
            this.putPathParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * batchCount.
         */
        public Builder batchCount(Double batchCount) {
            this.putBodyParameter("batchCount", batchCount);
            this.batchCount = batchCount;
            return this;
        }

        /**
         * blueGreenDep.
         */
        public Builder blueGreenDep(Boolean blueGreenDep) {
            this.putBodyParameter("blueGreenDep", blueGreenDep);
            this.blueGreenDep = blueGreenDep;
            return this;
        }

        /**
         * nodeTypes.
         */
        public Builder nodeTypes(java.util.List < String > nodeTypes) {
            this.putBodyParameter("nodeTypes", nodeTypes);
            this.nodeTypes = nodeTypes;
            return this;
        }

        /**
         * nodes.
         */
        public Builder nodes(java.util.List < String > nodes) {
            this.putBodyParameter("nodes", nodes);
            this.nodes = nodes;
            return this;
        }

        /**
         * restartType.
         */
        public Builder restartType(String restartType) {
            this.putBodyParameter("restartType", restartType);
            this.restartType = restartType;
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

        /**
         * force.
         */
        public Builder force(Boolean force) {
            this.putQueryParameter("force", force);
            this.force = force;
            return this;
        }

        @Override
        public RestartLogstashRequest build() {
            return new RestartLogstashRequest(this);
        } 

    } 

}
