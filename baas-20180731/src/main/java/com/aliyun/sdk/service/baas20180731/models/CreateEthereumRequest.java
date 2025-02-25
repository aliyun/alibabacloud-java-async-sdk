// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.baas20180731.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateEthereumRequest} extends {@link RequestModel}
 *
 * <p>CreateEthereumRequest</p>
 */
public class CreateEthereumRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Consensus")
    @com.aliyun.core.annotation.Validation(required = true)
    private String consensus;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Difficulty")
    private String difficulty;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Gas")
    private String gas;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Name")
    @com.aliyun.core.annotation.Validation(required = true)
    private String name;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("NetworkId")
    private String networkId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Node")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List < Node> node;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Region")
    private String region;

    private CreateEthereumRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.consensus = builder.consensus;
        this.description = builder.description;
        this.difficulty = builder.difficulty;
        this.gas = builder.gas;
        this.name = builder.name;
        this.networkId = builder.networkId;
        this.node = builder.node;
        this.region = builder.region;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateEthereumRequest create() {
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
     * @return consensus
     */
    public String getConsensus() {
        return this.consensus;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return difficulty
     */
    public String getDifficulty() {
        return this.difficulty;
    }

    /**
     * @return gas
     */
    public String getGas() {
        return this.gas;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return networkId
     */
    public String getNetworkId() {
        return this.networkId;
    }

    /**
     * @return node
     */
    public java.util.List < Node> getNode() {
        return this.node;
    }

    /**
     * @return region
     */
    public String getRegion() {
        return this.region;
    }

    public static final class Builder extends Request.Builder<CreateEthereumRequest, Builder> {
        private String regionId; 
        private String consensus; 
        private String description; 
        private String difficulty; 
        private String gas; 
        private String name; 
        private String networkId; 
        private java.util.List < Node> node; 
        private String region; 

        private Builder() {
            super();
        } 

        private Builder(CreateEthereumRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.consensus = request.consensus;
            this.description = request.description;
            this.difficulty = request.difficulty;
            this.gas = request.gas;
            this.name = request.name;
            this.networkId = request.networkId;
            this.node = request.node;
            this.region = request.region;
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
         * Consensus.
         */
        public Builder consensus(String consensus) {
            this.putBodyParameter("Consensus", consensus);
            this.consensus = consensus;
            return this;
        }

        /**
         * Description.
         */
        public Builder description(String description) {
            this.putBodyParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * Difficulty.
         */
        public Builder difficulty(String difficulty) {
            this.putBodyParameter("Difficulty", difficulty);
            this.difficulty = difficulty;
            return this;
        }

        /**
         * Gas.
         */
        public Builder gas(String gas) {
            this.putBodyParameter("Gas", gas);
            this.gas = gas;
            return this;
        }

        /**
         * Name.
         */
        public Builder name(String name) {
            this.putBodyParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * NetworkId.
         */
        public Builder networkId(String networkId) {
            this.putBodyParameter("NetworkId", networkId);
            this.networkId = networkId;
            return this;
        }

        /**
         * Node.
         */
        public Builder node(java.util.List < Node> node) {
            this.putBodyParameter("Node", node);
            this.node = node;
            return this;
        }

        /**
         * Region.
         */
        public Builder region(String region) {
            this.putBodyParameter("Region", region);
            this.region = region;
            return this;
        }

        @Override
        public CreateEthereumRequest build() {
            return new CreateEthereumRequest(this);
        } 

    } 

    public static class Node extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        private Node(Builder builder) {
            this.name = builder.name;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Node create() {
            return builder().build();
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        public static final class Builder {
            private String name; 

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            public Node build() {
                return new Node(this);
            } 

        } 

    }
}
