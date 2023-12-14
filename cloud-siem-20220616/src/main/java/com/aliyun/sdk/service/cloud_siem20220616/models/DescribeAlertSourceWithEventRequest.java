// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloud_siem20220616.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeAlertSourceWithEventRequest} extends {@link RequestModel}
 *
 * <p>DescribeAlertSourceWithEventRequest</p>
 */
public class DescribeAlertSourceWithEventRequest extends Request {
    @Body
    @NameInMap("IncidentUuid")
    private String incidentUuid;

    @Body
    @NameInMap("RegionId")
    private String regionId;

    private DescribeAlertSourceWithEventRequest(Builder builder) {
        super(builder);
        this.incidentUuid = builder.incidentUuid;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeAlertSourceWithEventRequest create() {
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

    public static final class Builder extends Request.Builder<DescribeAlertSourceWithEventRequest, Builder> {
        private String incidentUuid; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeAlertSourceWithEventRequest request) {
            super(request);
            this.incidentUuid = request.incidentUuid;
            this.regionId = request.regionId;
        } 

        /**
         * The UUID of the event.
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
        public DescribeAlertSourceWithEventRequest build() {
            return new DescribeAlertSourceWithEventRequest(this);
        } 

    } 

}
