// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gpdb20160503.models;

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
 * {@link GetSaasDataUnitUsageRequest} extends {@link RequestModel}
 *
 * <p>GetSaasDataUnitUsageRequest</p>
 */
public class GetSaasDataUnitUsageRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EndTime")
    @com.aliyun.core.annotation.Validation(required = true)
    private String endTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ServiceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String serviceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StartTime")
    @com.aliyun.core.annotation.Validation(required = true)
    private String startTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TimeUnit")
    private String timeUnit;

    private GetSaasDataUnitUsageRequest(Builder builder) {
        super(builder);
        this.endTime = builder.endTime;
        this.regionId = builder.regionId;
        this.serviceId = builder.serviceId;
        this.startTime = builder.startTime;
        this.timeUnit = builder.timeUnit;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetSaasDataUnitUsageRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return endTime
     */
    public String getEndTime() {
        return this.endTime;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return serviceId
     */
    public String getServiceId() {
        return this.serviceId;
    }

    /**
     * @return startTime
     */
    public String getStartTime() {
        return this.startTime;
    }

    /**
     * @return timeUnit
     */
    public String getTimeUnit() {
        return this.timeUnit;
    }

    public static final class Builder extends Request.Builder<GetSaasDataUnitUsageRequest, Builder> {
        private String endTime; 
        private String regionId; 
        private String serviceId; 
        private String startTime; 
        private String timeUnit; 

        private Builder() {
            super();
        } 

        private Builder(GetSaasDataUnitUsageRequest request) {
            super(request);
            this.endTime = request.endTime;
            this.regionId = request.regionId;
            this.serviceId = request.serviceId;
            this.startTime = request.startTime;
            this.timeUnit = request.timeUnit;
        } 

        /**
         * <p>The end time of the query in UTC. The format is yyyy-MM-ddTHH:mm:ssZ, and the seconds must be 00. The end time must be later than the start time and cannot be later than the request time. The query range is not automatically truncated.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-10-20T02:00:00Z</p>
         */
        public Builder endTime(String endTime) {
            this.putQueryParameter("EndTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * <p>The region ID.</p>
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
         * <p>The instance ID of the undeleted SaaS service. A standard DBInstanceId is not accepted as an override.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>agdb-example</p>
         */
        public Builder serviceId(String serviceId) {
            this.putQueryParameter("ServiceId", serviceId);
            this.serviceId = serviceId;
            return this;
        }

        /**
         * <p>The start time of the query in UTC. The format is yyyy-MM-ddTHH:mm:ssZ, and the seconds must be 00. The start time cannot be earlier than 30 days before the request time. The start time and the end time form a left-closed and right-open interval, and the span cannot exceed 7 days.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-10-20T00:00:00Z</p>
         */
        public Builder startTime(String startTime) {
            this.putQueryParameter("StartTime", startTime);
            this.startTime = startTime;
            return this;
        }

        /**
         * <p>The time granularity. Valid values: hour (UTC hour) and day (UTC day). Default value: hour. This parameter only determines the trend aggregation method and is not returned in the response.</p>
         * 
         * <strong>example:</strong>
         * <p>hour</p>
         */
        public Builder timeUnit(String timeUnit) {
            this.putQueryParameter("TimeUnit", timeUnit);
            this.timeUnit = timeUnit;
            return this;
        }

        @Override
        public GetSaasDataUnitUsageRequest build() {
            return new GetSaasDataUnitUsageRequest(this);
        } 

    } 

}
