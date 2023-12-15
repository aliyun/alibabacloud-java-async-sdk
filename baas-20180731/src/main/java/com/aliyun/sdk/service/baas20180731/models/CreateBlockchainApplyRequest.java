// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.baas20180731.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateBlockchainApplyRequest} extends {@link RequestModel}
 *
 * <p>CreateBlockchainApplyRequest</p>
 */
public class CreateBlockchainApplyRequest extends Request {
    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Body
    @NameInMap("Bizid")
    private String bizid;

    @Body
    @NameInMap("LiveTime")
    private Integer liveTime;

    @Body
    @NameInMap("MachineNum")
    private Integer machineNum;

    @Body
    @NameInMap("Size")
    private Integer size;

    private CreateBlockchainApplyRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.bizid = builder.bizid;
        this.liveTime = builder.liveTime;
        this.machineNum = builder.machineNum;
        this.size = builder.size;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateBlockchainApplyRequest create() {
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
     * @return size
     */
    public Integer getSize() {
        return this.size;
    }

    public static final class Builder extends Request.Builder<CreateBlockchainApplyRequest, Builder> {
        private String regionId; 
        private String bizid; 
        private Integer liveTime; 
        private Integer machineNum; 
        private Integer size; 

        private Builder() {
            super();
        } 

        private Builder(CreateBlockchainApplyRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.bizid = request.bizid;
            this.liveTime = request.liveTime;
            this.machineNum = request.machineNum;
            this.size = request.size;
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
         * Size.
         */
        public Builder size(Integer size) {
            this.putBodyParameter("Size", size);
            this.size = size;
            return this;
        }

        @Override
        public CreateBlockchainApplyRequest build() {
            return new CreateBlockchainApplyRequest(this);
        } 

    } 

}
