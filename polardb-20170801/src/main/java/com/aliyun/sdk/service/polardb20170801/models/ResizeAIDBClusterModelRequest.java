// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.polardb20170801.models;

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
 * {@link ResizeAIDBClusterModelRequest} extends {@link RequestModel}
 *
 * <p>ResizeAIDBClusterModelRequest</p>
 */
public class ResizeAIDBClusterModelRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DBClusterId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String DBClusterId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DryRun")
    private Boolean dryRun;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TargetCapacity")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long targetCapacity;

    private ResizeAIDBClusterModelRequest(Builder builder) {
        super(builder);
        this.DBClusterId = builder.DBClusterId;
        this.dryRun = builder.dryRun;
        this.regionId = builder.regionId;
        this.targetCapacity = builder.targetCapacity;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ResizeAIDBClusterModelRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return DBClusterId
     */
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    /**
     * @return dryRun
     */
    public Boolean getDryRun() {
        return this.dryRun;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return targetCapacity
     */
    public Long getTargetCapacity() {
        return this.targetCapacity;
    }

    public static final class Builder extends Request.Builder<ResizeAIDBClusterModelRequest, Builder> {
        private String DBClusterId; 
        private Boolean dryRun; 
        private String regionId; 
        private Long targetCapacity; 

        private Builder() {
            super();
        } 

        private Builder(ResizeAIDBClusterModelRequest request) {
            super(request);
            this.DBClusterId = request.DBClusterId;
            this.dryRun = request.dryRun;
            this.regionId = request.regionId;
            this.targetCapacity = request.targetCapacity;
        } 

        /**
         * <p>The ID of the PolarDB AI 3.0 logical instance.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>pm-2ze4x2mwo81knj08a</p>
         */
        public Builder DBClusterId(String DBClusterId) {
            this.putQueryParameter("DBClusterId", DBClusterId);
            this.DBClusterId = DBClusterId;
            return this;
        }

        /**
         * <p>Specifies whether to perform only a read-only capacity dry run.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder dryRun(Boolean dryRun) {
            this.putQueryParameter("DryRun", dryRun);
            this.dryRun = dryRun;
            return this;
        }

        /**
         * <p>The region ID. Requests are routed to the region where the instance resides.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-beijing</p>
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The target total capacity. An abstract capacity unit of 1000 is equivalent to one L20N card. The value must be a positive integer.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>12000</p>
         */
        public Builder targetCapacity(Long targetCapacity) {
            this.putQueryParameter("TargetCapacity", targetCapacity);
            this.targetCapacity = targetCapacity;
            return this;
        }

        @Override
        public ResizeAIDBClusterModelRequest build() {
            return new ResizeAIDBClusterModelRequest(this);
        } 

    } 

}
