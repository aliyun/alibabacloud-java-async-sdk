// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ehpc20180412.models;

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
 * {@link AddQueueRequest} extends {@link RequestModel}
 *
 * <p>AddQueueRequest</p>
 */
public class AddQueueRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClusterId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String clusterId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DeploymentSetId")
    private String deploymentSetId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NetworkInterfaceTrafficMode")
    private String networkInterfaceTrafficMode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("QueueName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String queueName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UseESS")
    private Boolean useESS;

    private AddQueueRequest(Builder builder) {
        super(builder);
        this.clusterId = builder.clusterId;
        this.deploymentSetId = builder.deploymentSetId;
        this.networkInterfaceTrafficMode = builder.networkInterfaceTrafficMode;
        this.queueName = builder.queueName;
        this.useESS = builder.useESS;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AddQueueRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return clusterId
     */
    public String getClusterId() {
        return this.clusterId;
    }

    /**
     * @return deploymentSetId
     */
    public String getDeploymentSetId() {
        return this.deploymentSetId;
    }

    /**
     * @return networkInterfaceTrafficMode
     */
    public String getNetworkInterfaceTrafficMode() {
        return this.networkInterfaceTrafficMode;
    }

    /**
     * @return queueName
     */
    public String getQueueName() {
        return this.queueName;
    }

    /**
     * @return useESS
     */
    public Boolean getUseESS() {
        return this.useESS;
    }

    public static final class Builder extends Request.Builder<AddQueueRequest, Builder> {
        private String clusterId; 
        private String deploymentSetId; 
        private String networkInterfaceTrafficMode; 
        private String queueName; 
        private Boolean useESS; 

        private Builder() {
            super();
        } 

        private Builder(AddQueueRequest request) {
            super(request);
            this.clusterId = request.clusterId;
            this.deploymentSetId = request.deploymentSetId;
            this.networkInterfaceTrafficMode = request.networkInterfaceTrafficMode;
            this.queueName = request.queueName;
            this.useESS = request.useESS;
        } 

        /**
         * <p>The cluster ID.</p>
         * <p>You can call the <a href="https://help.aliyun.com/document_detail/87116.html">ListClusters</a> operation to query the cluster ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ehpc-hz-FYUr32****</p>
         */
        public Builder clusterId(String clusterId) {
            this.putQueryParameter("ClusterId", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        /**
         * <p>The deployment set ID. You can obtain the deployment set ID by calling the <a href="https://help.aliyun.com/document_detail/91313.html">DescribeDeploymentSets</a> operation. Only the deployment sets that use low latency policy are supported.</p>
         * 
         * <strong>example:</strong>
         * <p>ds-bp1frxuzdg87zh4pzq****</p>
         */
        public Builder deploymentSetId(String deploymentSetId) {
            this.putQueryParameter("DeploymentSetId", deploymentSetId);
            this.deploymentSetId = deploymentSetId;
            return this;
        }

        /**
         * <p>The communication mode of the elastic network interface (ENI). Valid values:</p>
         * <ul>
         * <li>Standard: uses the TCP communication mode.</li>
         * <li>HighPerformance: uses the remote direct memory access (RDMA) communication mode with Elastic RDMA Interface (ERI) enabled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Standard</p>
         */
        public Builder networkInterfaceTrafficMode(String networkInterfaceTrafficMode) {
            this.putQueryParameter("NetworkInterfaceTrafficMode", networkInterfaceTrafficMode);
            this.networkInterfaceTrafficMode = networkInterfaceTrafficMode;
            return this;
        }

        /**
         * <p>The name of the queue. The name must be 1 to 63 characters in length and start with a letter. It can contain letters, digits, and underscores (_).</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>test1</p>
         */
        public Builder queueName(String queueName) {
            this.putQueryParameter("QueueName", queueName);
            this.queueName = queueName;
            return this;
        }

        /**
         * <p>Specifies whether to use scaling groups of Auto Scaling.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder useESS(Boolean useESS) {
            this.putQueryParameter("UseESS", useESS);
            this.useESS = useESS;
            return this;
        }

        @Override
        public AddQueueRequest build() {
            return new AddQueueRequest(this);
        } 

    } 

}
