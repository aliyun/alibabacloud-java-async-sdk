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
 * {@link ReverseTwoWayDirectionRequest} extends {@link RequestModel}
 *
 * <p>ReverseTwoWayDirectionRequest</p>
 */
public class ReverseTwoWayDirectionRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DtsInstanceId")
    private String dtsInstanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IgnoreErrorSubJob")
    private Boolean ignoreErrorSubJob;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
    private String resourceGroupId;

    private ReverseTwoWayDirectionRequest(Builder builder) {
        super(builder);
        this.dtsInstanceId = builder.dtsInstanceId;
        this.ignoreErrorSubJob = builder.ignoreErrorSubJob;
        this.regionId = builder.regionId;
        this.resourceGroupId = builder.resourceGroupId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ReverseTwoWayDirectionRequest create() {
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
     * @return ignoreErrorSubJob
     */
    public Boolean getIgnoreErrorSubJob() {
        return this.ignoreErrorSubJob;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return resourceGroupId
     */
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public static final class Builder extends Request.Builder<ReverseTwoWayDirectionRequest, Builder> {
        private String dtsInstanceId; 
        private Boolean ignoreErrorSubJob; 
        private String regionId; 
        private String resourceGroupId; 

        private Builder() {
            super();
        } 

        private Builder(ReverseTwoWayDirectionRequest request) {
            super(request);
            this.dtsInstanceId = request.dtsInstanceId;
            this.ignoreErrorSubJob = request.ignoreErrorSubJob;
            this.regionId = request.regionId;
            this.resourceGroupId = request.resourceGroupId;
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
         * IgnoreErrorSubJob.
         */
        public Builder ignoreErrorSubJob(Boolean ignoreErrorSubJob) {
            this.putQueryParameter("IgnoreErrorSubJob", ignoreErrorSubJob);
            this.ignoreErrorSubJob = ignoreErrorSubJob;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
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
        public ReverseTwoWayDirectionRequest build() {
            return new ReverseTwoWayDirectionRequest(this);
        } 

    } 

}
