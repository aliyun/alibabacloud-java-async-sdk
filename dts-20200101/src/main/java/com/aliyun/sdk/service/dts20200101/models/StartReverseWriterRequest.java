// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dts20200101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link StartReverseWriterRequest} extends {@link RequestModel}
 *
 * <p>StartReverseWriterRequest</p>
 */
public class StartReverseWriterRequest extends Request {
    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("CheckPoint")
    private String checkPoint;

    @Query
    @NameInMap("DtsJobId")
    @Validation(required = true)
    private String dtsJobId;

    @Query
    @NameInMap("ResourceGroupId")
    private String resourceGroupId;

    private StartReverseWriterRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.checkPoint = builder.checkPoint;
        this.dtsJobId = builder.dtsJobId;
        this.resourceGroupId = builder.resourceGroupId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static StartReverseWriterRequest create() {
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
     * @return checkPoint
     */
    public String getCheckPoint() {
        return this.checkPoint;
    }

    /**
     * @return dtsJobId
     */
    public String getDtsJobId() {
        return this.dtsJobId;
    }

    /**
     * @return resourceGroupId
     */
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public static final class Builder extends Request.Builder<StartReverseWriterRequest, Builder> {
        private String regionId; 
        private String checkPoint; 
        private String dtsJobId; 
        private String resourceGroupId; 

        private Builder() {
            super();
        } 

        private Builder(StartReverseWriterRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.checkPoint = request.checkPoint;
            this.dtsJobId = request.dtsJobId;
            this.resourceGroupId = request.resourceGroupId;
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
         * The offset of the Incremental Write module. Specify a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC. 
         * <p>
         * 
         * > The default value is the offset that is automatically saved by DTS when the task is paused.
         */
        public Builder checkPoint(String checkPoint) {
            this.putQueryParameter("CheckPoint", checkPoint);
            this.checkPoint = checkPoint;
            return this;
        }

        /**
         * The ID of the reverse task that was created by calling the CreateReverseDtsJob operation.
         */
        public Builder dtsJobId(String dtsJobId) {
            this.putQueryParameter("DtsJobId", dtsJobId);
            this.dtsJobId = dtsJobId;
            return this;
        }

        /**
         * ResourceGroupId.
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.putQueryParameter("ResourceGroupId", resourceGroupId);
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        @Override
        public StartReverseWriterRequest build() {
            return new StartReverseWriterRequest(this);
        } 

    } 

}
