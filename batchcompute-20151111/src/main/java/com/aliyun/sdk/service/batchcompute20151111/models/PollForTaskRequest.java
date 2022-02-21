// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.batchcompute20151111.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link PollForTaskRequest} extends {@link RequestModel}
 *
 * <p>PollForTaskRequest</p>
 */
public class PollForTaskRequest extends Request {
    @Path
    @NameInMap("ClusterId")
    @Validation(required = true)
    private String clusterId;

    @Path
    @NameInMap("WorkerId")
    @Validation(required = true)
    private String workerId;

    @Query
    @NameInMap("RegionId")
    private String regionId;

    private PollForTaskRequest(Builder builder) {
        super(builder);
        this.clusterId = builder.clusterId;
        this.workerId = builder.workerId;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PollForTaskRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return clusterId
     */
    public String getClusterId() {
        return this.clusterId;
    }

    /**
     * @return workerId
     */
    public String getWorkerId() {
        return this.workerId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<PollForTaskRequest, Builder> {
        private String clusterId; 
        private String workerId; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(PollForTaskRequest response) {
            super(response);
            this.clusterId = response.clusterId;
            this.workerId = response.workerId;
            this.regionId = response.regionId;
        } 

        /**
         * ClusterId.
         */
        public Builder clusterId(String clusterId) {
            this.putPathParameter("ClusterId", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        /**
         * WorkerId.
         */
        public Builder workerId(String workerId) {
            this.putPathParameter("WorkerId", workerId);
            this.workerId = workerId;
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
        public PollForTaskRequest build() {
            return new PollForTaskRequest(this);
        } 

    } 

}
