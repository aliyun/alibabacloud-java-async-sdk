// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dts20200101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ReverseTwoWayDirectionRequest} extends {@link RequestModel}
 *
 * <p>ReverseTwoWayDirectionRequest</p>
 */
public class ReverseTwoWayDirectionRequest extends Request {
    @Query
    @NameInMap("DtsInstanceId")
    private String dtsInstanceId;

    @Query
    @NameInMap("IgnoreErrorSubJob")
    private Boolean ignoreErrorSubJob;

    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    private ReverseTwoWayDirectionRequest(Builder builder) {
        super(builder);
        this.dtsInstanceId = builder.dtsInstanceId;
        this.ignoreErrorSubJob = builder.ignoreErrorSubJob;
        this.regionId = builder.regionId;
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

    public static final class Builder extends Request.Builder<ReverseTwoWayDirectionRequest, Builder> {
        private String dtsInstanceId; 
        private Boolean ignoreErrorSubJob; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(ReverseTwoWayDirectionRequest request) {
            super(request);
            this.dtsInstanceId = request.dtsInstanceId;
            this.ignoreErrorSubJob = request.ignoreErrorSubJob;
            this.regionId = request.regionId;
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
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public ReverseTwoWayDirectionRequest build() {
            return new ReverseTwoWayDirectionRequest(this);
        } 

    } 

}
