// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.baas20180731.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateAntChainRequest} extends {@link RequestModel}
 *
 * <p>CreateAntChainRequest</p>
 */
public class CreateAntChainRequest extends Request {
    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Body
    @NameInMap("AntChainName")
    @Validation(required = true)
    private String antChainName;

    @Body
    @NameInMap("BlockchainRegionId")
    @Validation(required = true)
    private String blockchainRegionId;

    @Body
    @NameInMap("CipherSuit")
    @Validation(required = true)
    private String cipherSuit;

    @Body
    @NameInMap("ConsortiumId")
    @Validation(required = true)
    private String consortiumId;

    @Body
    @NameInMap("LiveTime")
    @Validation(required = true)
    private Integer liveTime;

    @Body
    @NameInMap("MerkleTreeSuit")
    @Validation(required = true)
    private String merkleTreeSuit;

    @Body
    @NameInMap("NodeNum")
    @Validation(required = true)
    private Integer nodeNum;

    @Body
    @NameInMap("ResourceSize")
    @Validation(required = true)
    private Integer resourceSize;

    @Body
    @NameInMap("TlsAlgo")
    @Validation(required = true)
    private String tlsAlgo;

    private CreateAntChainRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.antChainName = builder.antChainName;
        this.blockchainRegionId = builder.blockchainRegionId;
        this.cipherSuit = builder.cipherSuit;
        this.consortiumId = builder.consortiumId;
        this.liveTime = builder.liveTime;
        this.merkleTreeSuit = builder.merkleTreeSuit;
        this.nodeNum = builder.nodeNum;
        this.resourceSize = builder.resourceSize;
        this.tlsAlgo = builder.tlsAlgo;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateAntChainRequest create() {
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
     * @return antChainName
     */
    public String getAntChainName() {
        return this.antChainName;
    }

    /**
     * @return blockchainRegionId
     */
    public String getBlockchainRegionId() {
        return this.blockchainRegionId;
    }

    /**
     * @return cipherSuit
     */
    public String getCipherSuit() {
        return this.cipherSuit;
    }

    /**
     * @return consortiumId
     */
    public String getConsortiumId() {
        return this.consortiumId;
    }

    /**
     * @return liveTime
     */
    public Integer getLiveTime() {
        return this.liveTime;
    }

    /**
     * @return merkleTreeSuit
     */
    public String getMerkleTreeSuit() {
        return this.merkleTreeSuit;
    }

    /**
     * @return nodeNum
     */
    public Integer getNodeNum() {
        return this.nodeNum;
    }

    /**
     * @return resourceSize
     */
    public Integer getResourceSize() {
        return this.resourceSize;
    }

    /**
     * @return tlsAlgo
     */
    public String getTlsAlgo() {
        return this.tlsAlgo;
    }

    public static final class Builder extends Request.Builder<CreateAntChainRequest, Builder> {
        private String regionId; 
        private String antChainName; 
        private String blockchainRegionId; 
        private String cipherSuit; 
        private String consortiumId; 
        private Integer liveTime; 
        private String merkleTreeSuit; 
        private Integer nodeNum; 
        private Integer resourceSize; 
        private String tlsAlgo; 

        private Builder() {
            super();
        } 

        private Builder(CreateAntChainRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.antChainName = request.antChainName;
            this.blockchainRegionId = request.blockchainRegionId;
            this.cipherSuit = request.cipherSuit;
            this.consortiumId = request.consortiumId;
            this.liveTime = request.liveTime;
            this.merkleTreeSuit = request.merkleTreeSuit;
            this.nodeNum = request.nodeNum;
            this.resourceSize = request.resourceSize;
            this.tlsAlgo = request.tlsAlgo;
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
         * AntChainName.
         */
        public Builder antChainName(String antChainName) {
            this.putBodyParameter("AntChainName", antChainName);
            this.antChainName = antChainName;
            return this;
        }

        /**
         * BlockchainRegionId.
         */
        public Builder blockchainRegionId(String blockchainRegionId) {
            this.putBodyParameter("BlockchainRegionId", blockchainRegionId);
            this.blockchainRegionId = blockchainRegionId;
            return this;
        }

        /**
         * CipherSuit.
         */
        public Builder cipherSuit(String cipherSuit) {
            this.putBodyParameter("CipherSuit", cipherSuit);
            this.cipherSuit = cipherSuit;
            return this;
        }

        /**
         * ConsortiumId.
         */
        public Builder consortiumId(String consortiumId) {
            this.putBodyParameter("ConsortiumId", consortiumId);
            this.consortiumId = consortiumId;
            return this;
        }

        /**
         * LiveTime.
         */
        public Builder liveTime(Integer liveTime) {
            this.putBodyParameter("LiveTime", liveTime);
            this.liveTime = liveTime;
            return this;
        }

        /**
         * MerkleTreeSuit.
         */
        public Builder merkleTreeSuit(String merkleTreeSuit) {
            this.putBodyParameter("MerkleTreeSuit", merkleTreeSuit);
            this.merkleTreeSuit = merkleTreeSuit;
            return this;
        }

        /**
         * NodeNum.
         */
        public Builder nodeNum(Integer nodeNum) {
            this.putBodyParameter("NodeNum", nodeNum);
            this.nodeNum = nodeNum;
            return this;
        }

        /**
         * ResourceSize.
         */
        public Builder resourceSize(Integer resourceSize) {
            this.putBodyParameter("ResourceSize", resourceSize);
            this.resourceSize = resourceSize;
            return this;
        }

        /**
         * TlsAlgo.
         */
        public Builder tlsAlgo(String tlsAlgo) {
            this.putBodyParameter("TlsAlgo", tlsAlgo);
            this.tlsAlgo = tlsAlgo;
            return this;
        }

        @Override
        public CreateAntChainRequest build() {
            return new CreateAntChainRequest(this);
        } 

    } 

}
