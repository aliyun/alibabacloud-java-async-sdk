// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ehpc20240730.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link CreateNodesRequest} extends {@link RequestModel}
 *
 * <p>CreateNodesRequest</p>
 */
public class CreateNodesRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClusterId")
    private String clusterId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ComputeNode")
    private NodeTemplate computeNode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Count")
    private Integer count;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("HPCInterConnect")
    private String HPCInterConnect;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("HostnamePrefix")
    private String hostnamePrefix;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("HostnameSuffix")
    private String hostnameSuffix;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("KeepAlive")
    private String keepAlive;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("QueueName")
    private String queueName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RamRole")
    private String ramRole;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VSwitchId")
    private String vSwitchId;

    private CreateNodesRequest(Builder builder) {
        super(builder);
        this.clusterId = builder.clusterId;
        this.computeNode = builder.computeNode;
        this.count = builder.count;
        this.HPCInterConnect = builder.HPCInterConnect;
        this.hostnamePrefix = builder.hostnamePrefix;
        this.hostnameSuffix = builder.hostnameSuffix;
        this.keepAlive = builder.keepAlive;
        this.queueName = builder.queueName;
        this.ramRole = builder.ramRole;
        this.vSwitchId = builder.vSwitchId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateNodesRequest create() {
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
     * @return computeNode
     */
    public NodeTemplate getComputeNode() {
        return this.computeNode;
    }

    /**
     * @return count
     */
    public Integer getCount() {
        return this.count;
    }

    /**
     * @return HPCInterConnect
     */
    public String getHPCInterConnect() {
        return this.HPCInterConnect;
    }

    /**
     * @return hostnamePrefix
     */
    public String getHostnamePrefix() {
        return this.hostnamePrefix;
    }

    /**
     * @return hostnameSuffix
     */
    public String getHostnameSuffix() {
        return this.hostnameSuffix;
    }

    /**
     * @return keepAlive
     */
    public String getKeepAlive() {
        return this.keepAlive;
    }

    /**
     * @return queueName
     */
    public String getQueueName() {
        return this.queueName;
    }

    /**
     * @return ramRole
     */
    public String getRamRole() {
        return this.ramRole;
    }

    /**
     * @return vSwitchId
     */
    public String getVSwitchId() {
        return this.vSwitchId;
    }

    public static final class Builder extends Request.Builder<CreateNodesRequest, Builder> {
        private String clusterId; 
        private NodeTemplate computeNode; 
        private Integer count; 
        private String HPCInterConnect; 
        private String hostnamePrefix; 
        private String hostnameSuffix; 
        private String keepAlive; 
        private String queueName; 
        private String ramRole; 
        private String vSwitchId; 

        private Builder() {
            super();
        } 

        private Builder(CreateNodesRequest request) {
            super(request);
            this.clusterId = request.clusterId;
            this.computeNode = request.computeNode;
            this.count = request.count;
            this.HPCInterConnect = request.HPCInterConnect;
            this.hostnamePrefix = request.hostnamePrefix;
            this.hostnameSuffix = request.hostnameSuffix;
            this.keepAlive = request.keepAlive;
            this.queueName = request.queueName;
            this.ramRole = request.ramRole;
            this.vSwitchId = request.vSwitchId;
        } 

        /**
         * <p>The cluster ID.</p>
         * <p>You can call the <a href="https://help.aliyun.com/document_detail/87116.html">ListClusters</a> operation to query the cluster ID.</p>
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
         * <p>The hardware configurations of the compute nodes.</p>
         */
        public Builder computeNode(NodeTemplate computeNode) {
            String computeNodeShrink = shrink(computeNode, "ComputeNode", "json");
            this.putQueryParameter("ComputeNode", computeNodeShrink);
            this.computeNode = computeNode;
            return this;
        }

        /**
         * <p>The number of compute nodes that you want to add. Valid values: 1 to 99. The MinCount value must be smaller than the Count value.</p>
         * <ul>
         * <li>If the number of available Elastic Compute Service (ECS) instances is smaller than the MinCount value, the nodes fail to be added.</li>
         * <li>If the number of available ECS instances is larger than the MinCount value but smaller than the Count value, nodes are added based on the MinCount value.</li>
         * <li>If the number of available ECS instances is larger than the Count value, nodes are added based on the Count value.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder count(Integer count) {
            this.putQueryParameter("Count", count);
            this.count = count;
            return this;
        }

        /**
         * <p>The type of the network between compute nodes. Valid values:</p>
         * <ul>
         * <li>vpc</li>
         * <li>eRDMA</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>vpc</p>
         */
        public Builder HPCInterConnect(String HPCInterConnect) {
            this.putQueryParameter("HPCInterConnect", HPCInterConnect);
            this.HPCInterConnect = HPCInterConnect;
            return this;
        }

        /**
         * <p>The hostname prefix of the added compute nodes.</p>
         * 
         * <strong>example:</strong>
         * <p>compute</p>
         */
        public Builder hostnamePrefix(String hostnamePrefix) {
            this.putQueryParameter("HostnamePrefix", hostnamePrefix);
            this.hostnamePrefix = hostnamePrefix;
            return this;
        }

        /**
         * <p>The hostname suffix of the added compute nodes.</p>
         * 
         * <strong>example:</strong>
         * <p>demo</p>
         */
        public Builder hostnameSuffix(String hostnameSuffix) {
            this.putQueryParameter("HostnameSuffix", hostnameSuffix);
            this.hostnameSuffix = hostnameSuffix;
            return this;
        }

        /**
         * <p>Specifies whether to enable deletion protection for the added compute nodes.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder keepAlive(String keepAlive) {
            this.putQueryParameter("KeepAlive", keepAlive);
            this.keepAlive = keepAlive;
            return this;
        }

        /**
         * <p>The name of the queue for which you want to create compute nodes.</p>
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
         * <p>The Resource Access Management (RAM) role to be assumed by the added nodes.</p>
         * 
         * <strong>example:</strong>
         * <p>AliyunServiceRoleForOOSBandwidthScheduler</p>
         */
        public Builder ramRole(String ramRole) {
            this.putQueryParameter("RamRole", ramRole);
            this.ramRole = ramRole;
            return this;
        }

        /**
         * <p>The ID of the vSwitch to be used by the added nodes.</p>
         * 
         * <strong>example:</strong>
         * <p>vsw-bp1lfcjbfb099rrjn****</p>
         */
        public Builder vSwitchId(String vSwitchId) {
            this.putQueryParameter("VSwitchId", vSwitchId);
            this.vSwitchId = vSwitchId;
            return this;
        }

        @Override
        public CreateNodesRequest build() {
            return new CreateNodesRequest(this);
        } 

    } 

}
