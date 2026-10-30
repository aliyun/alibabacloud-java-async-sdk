// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sysom20231230.models;

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
 * {@link GetListGpuClusterRequest} extends {@link RequestModel}
 *
 * <p>GetListGpuClusterRequest</p>
 */
public class GetListGpuClusterRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("regionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("timeRegion")
    private Object timeRegion;

    private GetListGpuClusterRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.timeRegion = builder.timeRegion;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetListGpuClusterRequest create() {
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
     * @return timeRegion
     */
    public Object getTimeRegion() {
        return this.timeRegion;
    }

    public static final class Builder extends Request.Builder<GetListGpuClusterRequest, Builder> {
        private String regionId; 
        private Object timeRegion; 

        private Builder() {
            super();
        } 

        private Builder(GetListGpuClusterRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.timeRegion = request.timeRegion;
        } 

        /**
         * <p>The ID of the region to query.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("regionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The time range to query. Unit: milliseconds. Format: [start,end]. Example: [13254125000, 52451241000].</p>
         * 
         * <strong>example:</strong>
         * <p>[1757820000, 1757823600]</p>
         */
        public Builder timeRegion(Object timeRegion) {
            this.putQueryParameter("timeRegion", timeRegion);
            this.timeRegion = timeRegion;
            return this;
        }

        @Override
        public GetListGpuClusterRequest build() {
            return new GetListGpuClusterRequest(this);
        } 

    } 

}
