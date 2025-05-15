// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eflo_cnp20230828.models;

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
 * {@link GetWorkloadRequest} extends {@link RequestModel}
 *
 * <p>GetWorkloadRequest</p>
 */
public class GetWorkloadRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("WorkloadId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long workloadId;

    private GetWorkloadRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.workloadId = builder.workloadId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetWorkloadRequest create() {
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
     * @return workloadId
     */
    public Long getWorkloadId() {
        return this.workloadId;
    }

    public static final class Builder extends Request.Builder<GetWorkloadRequest, Builder> {
        private String regionId; 
        private Long workloadId; 

        private Builder() {
            super();
        } 

        private Builder(GetWorkloadRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.workloadId = request.workloadId;
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
         * <p>Workload ID</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>13</p>
         */
        public Builder workloadId(Long workloadId) {
            this.putQueryParameter("WorkloadId", workloadId);
            this.workloadId = workloadId;
            return this;
        }

        @Override
        public GetWorkloadRequest build() {
            return new GetWorkloadRequest(this);
        } 

    } 

}
