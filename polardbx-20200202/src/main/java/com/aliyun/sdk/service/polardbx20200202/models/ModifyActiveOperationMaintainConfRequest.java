// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.polardbx20200202.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyActiveOperationMaintainConfRequest} extends {@link RequestModel}
 *
 * <p>ModifyActiveOperationMaintainConfRequest</p>
 */
public class ModifyActiveOperationMaintainConfRequest extends Request {
    @Query
    @NameInMap("CycleTime")
    private String cycleTime;

    @Query
    @NameInMap("CycleType")
    private String cycleType;

    @Query
    @NameInMap("MaintainEndTime")
    private String maintainEndTime;

    @Query
    @NameInMap("MaintainStartTime")
    private String maintainStartTime;

    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    @Query
    @NameInMap("Status")
    private Integer status;

    private ModifyActiveOperationMaintainConfRequest(Builder builder) {
        super(builder);
        this.cycleTime = builder.cycleTime;
        this.cycleType = builder.cycleType;
        this.maintainEndTime = builder.maintainEndTime;
        this.maintainStartTime = builder.maintainStartTime;
        this.regionId = builder.regionId;
        this.status = builder.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyActiveOperationMaintainConfRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return cycleTime
     */
    public String getCycleTime() {
        return this.cycleTime;
    }

    /**
     * @return cycleType
     */
    public String getCycleType() {
        return this.cycleType;
    }

    /**
     * @return maintainEndTime
     */
    public String getMaintainEndTime() {
        return this.maintainEndTime;
    }

    /**
     * @return maintainStartTime
     */
    public String getMaintainStartTime() {
        return this.maintainStartTime;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return status
     */
    public Integer getStatus() {
        return this.status;
    }

    public static final class Builder extends Request.Builder<ModifyActiveOperationMaintainConfRequest, Builder> {
        private String cycleTime; 
        private String cycleType; 
        private String maintainEndTime; 
        private String maintainStartTime; 
        private String regionId; 
        private Integer status; 

        private Builder() {
            super();
        } 

        private Builder(ModifyActiveOperationMaintainConfRequest response) {
            super(response);
            this.cycleTime = response.cycleTime;
            this.cycleType = response.cycleType;
            this.maintainEndTime = response.maintainEndTime;
            this.maintainStartTime = response.maintainStartTime;
            this.regionId = response.regionId;
            this.status = response.status;
        } 

        /**
         * CycleTime.
         */
        public Builder cycleTime(String cycleTime) {
            this.putQueryParameter("CycleTime", cycleTime);
            this.cycleTime = cycleTime;
            return this;
        }

        /**
         * CycleType.
         */
        public Builder cycleType(String cycleType) {
            this.putQueryParameter("CycleType", cycleType);
            this.cycleType = cycleType;
            return this;
        }

        /**
         * MaintainEndTime.
         */
        public Builder maintainEndTime(String maintainEndTime) {
            this.putQueryParameter("MaintainEndTime", maintainEndTime);
            this.maintainEndTime = maintainEndTime;
            return this;
        }

        /**
         * MaintainStartTime.
         */
        public Builder maintainStartTime(String maintainStartTime) {
            this.putQueryParameter("MaintainStartTime", maintainStartTime);
            this.maintainStartTime = maintainStartTime;
            return this;
        }

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * Status.
         */
        public Builder status(Integer status) {
            this.putQueryParameter("Status", status);
            this.status = status;
            return this;
        }

        @Override
        public ModifyActiveOperationMaintainConfRequest build() {
            return new ModifyActiveOperationMaintainConfRequest(this);
        } 

    } 

}
