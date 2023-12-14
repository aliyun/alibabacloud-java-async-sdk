// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloud_siem20220616.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeAlertSceneByEventRequest} extends {@link RequestModel}
 *
 * <p>DescribeAlertSceneByEventRequest</p>
 */
public class DescribeAlertSceneByEventRequest extends Request {
    @Body
    @NameInMap("IncidentUuid")
    @Validation(required = true)
    private String incidentUuid;

    @Body
    @NameInMap("RegionId")
    private String regionId;

    private DescribeAlertSceneByEventRequest(Builder builder) {
        super(builder);
        this.incidentUuid = builder.incidentUuid;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeAlertSceneByEventRequest create() {
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

    public static final class Builder extends Request.Builder<DescribeAlertSceneByEventRequest, Builder> {
        private String incidentUuid; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeAlertSceneByEventRequest request) {
            super(request);
            this.incidentUuid = request.incidentUuid;
            this.regionId = request.regionId;
        } 

        /**
         * The ID of the event.
         */
        public Builder incidentUuid(String incidentUuid) {
            this.putBodyParameter("IncidentUuid", incidentUuid);
            this.incidentUuid = incidentUuid;
            return this;
        }

        /**
         * The region in which the data management center of the threat analysis feature resides. Specify this parameter based on the regions in which your assets reside. Valid values:
         * <p>
         * 
         * *   cn-hangzhou: Your assets reside in regions in China.
         * *   ap-southeast-1: Your assets reside in regions outside China.
         */
        public Builder regionId(String regionId) {
            this.putBodyParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public DescribeAlertSceneByEventRequest build() {
            return new DescribeAlertSceneByEventRequest(this);
        } 

    } 

}
