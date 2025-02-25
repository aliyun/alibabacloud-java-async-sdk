// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dts20200101.models;

import com.aliyun.sdk.gateway.pop.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link StartReverseWriterRequest} extends {@link RequestModel}
 *
 * <p>StartReverseWriterRequest</p>
 */
public class StartReverseWriterRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CheckPoint")
    private String checkPoint;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DtsJobId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String dtsJobId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
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
         * <p>The offset of the Incremental Write module. Specify a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC. </p>
         * <blockquote>
         * <p>The default value is the offset that is automatically saved by DTS when the task is paused.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>1695613785</p>
         */
        public Builder checkPoint(String checkPoint) {
            this.putQueryParameter("CheckPoint", checkPoint);
            this.checkPoint = checkPoint;
            return this;
        }

        /**
         * <p>The ID of the reverse task that was created by calling the CreateReverseDtsJob operation.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>n99m9jx822k****</p>
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
