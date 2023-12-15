// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.baas20180731.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateBlockchainApplicationRequest} extends {@link RequestModel}
 *
 * <p>CreateBlockchainApplicationRequest</p>
 */
public class CreateBlockchainApplicationRequest extends Request {
    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Body
    @NameInMap("Bizid")
    private String bizid;

    @Body
    @NameInMap("BlockchainRegionId")
    private String blockchainRegionId;

    @Body
    @NameInMap("BlockchainType")
    private String blockchainType;

    @Body
    @NameInMap("CipherSuit")
    private String cipherSuit;

    @Body
    @NameInMap("LiveTime")
    private Integer liveTime;

    @Body
    @NameInMap("MachineNum")
    private Integer machineNum;

    @Body
    @NameInMap("MerkleTreeSuit")
    private String merkleTreeSuit;

    @Body
    @NameInMap("Size")
    private Integer size;

    @Body
    @NameInMap("TlsAlgo")
    private String tlsAlgo;

    private CreateBlockchainApplicationRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.bizid = builder.bizid;
        this.blockchainRegionId = builder.blockchainRegionId;
        this.blockchainType = builder.blockchainType;
        this.cipherSuit = builder.cipherSuit;
        this.liveTime = builder.liveTime;
        this.machineNum = builder.machineNum;
        this.merkleTreeSuit = builder.merkleTreeSuit;
        this.size = builder.size;
        this.tlsAlgo = builder.tlsAlgo;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateBlockchainApplicationRequest create() {
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
     * @return bizid
     */
    public String getBizid() {
        return this.bizid;
    }

    /**
     * @return blockchainRegionId
     */
    public String getBlockchainRegionId() {
        return this.blockchainRegionId;
    }

    /**
     * @return blockchainType
     */
    public String getBlockchainType() {
        return this.blockchainType;
    }

    /**
     * @return cipherSuit
     */
    public String getCipherSuit() {
        return this.cipherSuit;
    }

    /**
     * @return liveTime
     */
    public Integer getLiveTime() {
        return this.liveTime;
    }

    /**
     * @return machineNum
     */
    public Integer getMachineNum() {
        return this.machineNum;
    }

    /**
     * @return merkleTreeSuit
     */
    public String getMerkleTreeSuit() {
        return this.merkleTreeSuit;
    }

    /**
     * @return size
     */
    public Integer getSize() {
        return this.size;
    }

    /**
     * @return tlsAlgo
     */
    public String getTlsAlgo() {
        return this.tlsAlgo;
    }

    public static final class Builder extends Request.Builder<CreateBlockchainApplicationRequest, Builder> {
        private String regionId; 
        private String bizid; 
        private String blockchainRegionId; 
        private String blockchainType; 
        private String cipherSuit; 
        private Integer liveTime; 
        private Integer machineNum; 
        private String merkleTreeSuit; 
        private Integer size; 
        private String tlsAlgo; 

        private Builder() {
            super();
        } 

        private Builder(CreateBlockchainApplicationRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.bizid = request.bizid;
            this.blockchainRegionId = request.blockchainRegionId;
            this.blockchainType = request.blockchainType;
            this.cipherSuit = request.cipherSuit;
            this.liveTime = request.liveTime;
            this.machineNum = request.machineNum;
            this.merkleTreeSuit = request.merkleTreeSuit;
            this.size = request.size;
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
         * Bizid.
         */
        public Builder bizid(String bizid) {
            this.putBodyParameter("Bizid", bizid);
            this.bizid = bizid;
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
         * BlockchainType.
         */
        public Builder blockchainType(String blockchainType) {
            this.putBodyParameter("BlockchainType", blockchainType);
            this.blockchainType = blockchainType;
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
         * LiveTime.
         */
        public Builder liveTime(Integer liveTime) {
            this.putBodyParameter("LiveTime", liveTime);
            this.liveTime = liveTime;
            return this;
        }

        /**
         * MachineNum.
         */
        public Builder machineNum(Integer machineNum) {
            this.putBodyParameter("MachineNum", machineNum);
            this.machineNum = machineNum;
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
         * Size.
         */
        public Builder size(Integer size) {
            this.putBodyParameter("Size", size);
            this.size = size;
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
        public CreateBlockchainApplicationRequest build() {
            return new CreateBlockchainApplicationRequest(this);
        } 

    } 

}
