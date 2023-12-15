// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.baas20180731.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateEthereumNodeConfigurationRequest} extends {@link RequestModel}
 *
 * <p>UpdateEthereumNodeConfigurationRequest</p>
 */
public class UpdateEthereumNodeConfigurationRequest extends Request {
    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Body
    @NameInMap("IP")
    @Validation(required = true)
    private String ip;

    @Body
    @NameInMap("NodeId")
    @Validation(required = true)
    private String nodeId;

    @Body
    @NameInMap("NodePub")
    @Validation(required = true)
    private String nodePub;

    @Body
    @NameInMap("P2pPort")
    @Validation(required = true)
    private Integer p2pPort;

    @Body
    @NameInMap("RaftPort")
    private Integer raftPort;

    @Body
    @NameInMap("RpcPort")
    private Integer rpcPort;

    @Body
    @NameInMap("TMPort")
    @Validation(required = true)
    private Integer TMPort;

    @Body
    @NameInMap("TMPub")
    @Validation(required = true)
    private String TMPub;

    @Body
    @NameInMap("WSPort")
    private Integer WSPort;

    private UpdateEthereumNodeConfigurationRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.ip = builder.ip;
        this.nodeId = builder.nodeId;
        this.nodePub = builder.nodePub;
        this.p2pPort = builder.p2pPort;
        this.raftPort = builder.raftPort;
        this.rpcPort = builder.rpcPort;
        this.TMPort = builder.TMPort;
        this.TMPub = builder.TMPub;
        this.WSPort = builder.WSPort;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateEthereumNodeConfigurationRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return ip
     */
    public String getIp() {
        return this.ip;
    }

    /**
     * @return nodeId
     */
    public String getNodeId() {
        return this.nodeId;
    }

    /**
     * @return nodePub
     */
    public String getNodePub() {
        return this.nodePub;
    }

    /**
     * @return p2pPort
     */
    public Integer getP2pPort() {
        return this.p2pPort;
    }

    /**
     * @return raftPort
     */
    public Integer getRaftPort() {
        return this.raftPort;
    }

    /**
     * @return rpcPort
     */
    public Integer getRpcPort() {
        return this.rpcPort;
    }

    /**
     * @return TMPort
     */
    public Integer getTMPort() {
        return this.TMPort;
    }

    /**
     * @return TMPub
     */
    public String getTMPub() {
        return this.TMPub;
    }

    /**
     * @return WSPort
     */
    public Integer getWSPort() {
        return this.WSPort;
    }

    public static final class Builder extends Request.Builder<UpdateEthereumNodeConfigurationRequest, Builder> {
        private String regionId; 
        private String ip; 
        private String nodeId; 
        private String nodePub; 
        private Integer p2pPort; 
        private Integer raftPort; 
        private Integer rpcPort; 
        private Integer TMPort; 
        private String TMPub; 
        private Integer WSPort; 

        private Builder() {
            super();
        } 

        private Builder(UpdateEthereumNodeConfigurationRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.ip = request.ip;
            this.nodeId = request.nodeId;
            this.nodePub = request.nodePub;
            this.p2pPort = request.p2pPort;
            this.raftPort = request.raftPort;
            this.rpcPort = request.rpcPort;
            this.TMPort = request.TMPort;
            this.TMPub = request.TMPub;
            this.WSPort = request.WSPort;
        } 

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * IP.
         */
        public Builder ip(String ip) {
            this.putBodyParameter("IP", ip);
            this.ip = ip;
            return this;
        }

        /**
         * NodeId.
         */
        public Builder nodeId(String nodeId) {
            this.putBodyParameter("NodeId", nodeId);
            this.nodeId = nodeId;
            return this;
        }

        /**
         * NodePub.
         */
        public Builder nodePub(String nodePub) {
            this.putBodyParameter("NodePub", nodePub);
            this.nodePub = nodePub;
            return this;
        }

        /**
         * P2pPort.
         */
        public Builder p2pPort(Integer p2pPort) {
            this.putBodyParameter("P2pPort", p2pPort);
            this.p2pPort = p2pPort;
            return this;
        }

        /**
         * RaftPort.
         */
        public Builder raftPort(Integer raftPort) {
            this.putBodyParameter("RaftPort", raftPort);
            this.raftPort = raftPort;
            return this;
        }

        /**
         * RpcPort.
         */
        public Builder rpcPort(Integer rpcPort) {
            this.putBodyParameter("RpcPort", rpcPort);
            this.rpcPort = rpcPort;
            return this;
        }

        /**
         * TMPort.
         */
        public Builder TMPort(Integer TMPort) {
            this.putBodyParameter("TMPort", TMPort);
            this.TMPort = TMPort;
            return this;
        }

        /**
         * TMPub.
         */
        public Builder TMPub(String TMPub) {
            this.putBodyParameter("TMPub", TMPub);
            this.TMPub = TMPub;
            return this;
        }

        /**
         * WSPort.
         */
        public Builder WSPort(Integer WSPort) {
            this.putBodyParameter("WSPort", WSPort);
            this.WSPort = WSPort;
            return this;
        }

        @Override
        public UpdateEthereumNodeConfigurationRequest build() {
            return new UpdateEthereumNodeConfigurationRequest(this);
        } 

    } 

}
