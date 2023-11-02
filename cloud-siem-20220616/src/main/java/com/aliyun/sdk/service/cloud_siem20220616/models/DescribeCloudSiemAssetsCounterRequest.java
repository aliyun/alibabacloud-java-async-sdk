// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloud_siem20220616.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeCloudSiemAssetsCounterRequest} extends {@link RequestModel}
 *
 * <p>DescribeCloudSiemAssetsCounterRequest</p>
 */
public class DescribeCloudSiemAssetsCounterRequest extends Request {
    @Body
    @NameInMap("IncidentUuid")
    @Validation(required = true)
    private String incidentUuid;

    @Body
    @NameInMap("RegionId")
    private String regionId;

    private DescribeCloudSiemAssetsCounterRequest(Builder builder) {
        super(builder);
        this.incidentUuid = builder.incidentUuid;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeCloudSiemAssetsCounterRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return incidentUuid
     */
    public String getIncidentUuid() {
        return this.incidentUuid;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<DescribeCloudSiemAssetsCounterRequest, Builder> {
        private String incidentUuid; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeCloudSiemAssetsCounterRequest request) {
            super(request);
            this.incidentUuid = request.incidentUuid;
            this.regionId = request.regionId;
        } 

        /**
         * IncidentUuid.
         */
        public Builder incidentUuid(String incidentUuid) {
            this.putBodyParameter("IncidentUuid", incidentUuid);
            this.incidentUuid = incidentUuid;
            return this;
        }

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putBodyParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public DescribeCloudSiemAssetsCounterRequest build() {
            return new DescribeCloudSiemAssetsCounterRequest(this);
        } 

    } 

}
