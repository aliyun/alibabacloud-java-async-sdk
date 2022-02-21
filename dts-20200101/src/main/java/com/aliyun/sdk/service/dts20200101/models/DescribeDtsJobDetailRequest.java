// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dts20200101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDtsJobDetailRequest} extends {@link RequestModel}
 *
 * <p>DescribeDtsJobDetailRequest</p>
 */
public class DescribeDtsJobDetailRequest extends Request {
    @Query
    @NameInMap("DtsInstanceID")
    private String dtsInstanceID;

    @Query
    @NameInMap("DtsJobId")
    private String dtsJobId;

    @Query
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("SyncSubJobHistory")
    private Boolean syncSubJobHistory;

    @Query
    @NameInMap("SynchronizationDirection")
    private String synchronizationDirection;

    private DescribeDtsJobDetailRequest(Builder builder) {
        super(builder);
        this.dtsInstanceID = builder.dtsInstanceID;
        this.dtsJobId = builder.dtsJobId;
        this.regionId = builder.regionId;
        this.syncSubJobHistory = builder.syncSubJobHistory;
        this.synchronizationDirection = builder.synchronizationDirection;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDtsJobDetailRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return dtsInstanceID
     */
    public String getDtsInstanceID() {
        return this.dtsInstanceID;
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
     * @return syncSubJobHistory
     */
    public Boolean getSyncSubJobHistory() {
        return this.syncSubJobHistory;
    }

    /**
     * @return synchronizationDirection
     */
    public String getSynchronizationDirection() {
        return this.synchronizationDirection;
    }

    public static final class Builder extends Request.Builder<DescribeDtsJobDetailRequest, Builder> {
        private String dtsInstanceID; 
        private String dtsJobId; 
        private String regionId; 
        private Boolean syncSubJobHistory; 
        private String synchronizationDirection; 

        private Builder() {
            super();
        } 

        private Builder(DescribeDtsJobDetailRequest response) {
            super(response);
            this.dtsInstanceID = response.dtsInstanceID;
            this.dtsJobId = response.dtsJobId;
            this.regionId = response.regionId;
            this.syncSubJobHistory = response.syncSubJobHistory;
            this.synchronizationDirection = response.synchronizationDirection;
        } 

        /**
         * DtsInstanceID.
         */
        public Builder dtsInstanceID(String dtsInstanceID) {
            this.putQueryParameter("DtsInstanceID", dtsInstanceID);
            this.dtsInstanceID = dtsInstanceID;
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
         * 是否返回所有的同步子任务
         */
        public Builder syncSubJobHistory(Boolean syncSubJobHistory) {
            this.putQueryParameter("SyncSubJobHistory", syncSubJobHistory);
            this.syncSubJobHistory = syncSubJobHistory;
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
        public DescribeDtsJobDetailRequest build() {
            return new DescribeDtsJobDetailRequest(this);
        } 

    } 

}
