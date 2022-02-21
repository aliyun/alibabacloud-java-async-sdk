// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dts20200101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link StopDtsJobRequest} extends {@link RequestModel}
 *
 * <p>StopDtsJobRequest</p>
 */
public class StopDtsJobRequest extends Request {
    @Query
    @NameInMap("DtsInstanceId")
    private String dtsInstanceId;

    @Query
    @NameInMap("DtsJobId")
    private String dtsJobId;

    @Query
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("SynchronizationDirection")
    private String synchronizationDirection;

    private StopDtsJobRequest(Builder builder) {
        super(builder);
        this.dtsInstanceId = builder.dtsInstanceId;
        this.dtsJobId = builder.dtsJobId;
        this.regionId = builder.regionId;
        this.synchronizationDirection = builder.synchronizationDirection;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static StopDtsJobRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return dtsInstanceId
     */
    public String getDtsInstanceId() {
        return this.dtsInstanceId;
    }

    /**
     * @return dtsJobId
     */
    public String getDtsJobId() {
        return this.dtsJobId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return synchronizationDirection
     */
    public String getSynchronizationDirection() {
        return this.synchronizationDirection;
    }

    public static final class Builder extends Request.Builder<StopDtsJobRequest, Builder> {
        private String dtsInstanceId; 
        private String dtsJobId; 
        private String regionId; 
        private String synchronizationDirection; 

        private Builder() {
            super();
        } 

        private Builder(StopDtsJobRequest response) {
            super(response);
            this.dtsInstanceId = response.dtsInstanceId;
            this.dtsJobId = response.dtsJobId;
            this.regionId = response.regionId;
            this.synchronizationDirection = response.synchronizationDirection;
        } 

        /**
         * DtsInstanceId.
         */
        public Builder dtsInstanceId(String dtsInstanceId) {
            this.putQueryParameter("DtsInstanceId", dtsInstanceId);
            this.dtsInstanceId = dtsInstanceId;
            return this;
        }

        /**
         * DtsJobId.
         */
        public Builder dtsJobId(String dtsJobId) {
            this.putQueryParameter("DtsJobId", dtsJobId);
            this.dtsJobId = dtsJobId;
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
         * SynchronizationDirection.
         */
        public Builder synchronizationDirection(String synchronizationDirection) {
            this.putQueryParameter("SynchronizationDirection", synchronizationDirection);
            this.synchronizationDirection = synchronizationDirection;
            return this;
        }

        @Override
        public StopDtsJobRequest build() {
            return new StopDtsJobRequest(this);
        } 

    } 

}
