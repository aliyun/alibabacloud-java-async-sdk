// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.xtrace20190808.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetTagKeyRequest} extends {@link RequestModel}
 *
 * <p>GetTagKeyRequest</p>
 */
public class GetTagKeyRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EndTime")
    private Long endTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ServiceName")
    private String serviceName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SpanName")
    private String spanName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StartTime")
    private Long startTime;

    private GetTagKeyRequest(Builder builder) {
        super(builder);
        this.endTime = builder.endTime;
        this.regionId = builder.regionId;
        this.serviceName = builder.serviceName;
        this.spanName = builder.spanName;
        this.startTime = builder.startTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetTagKeyRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return endTime
     */
    public Long getEndTime() {
        return this.endTime;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return serviceName
     */
    public String getServiceName() {
        return this.serviceName;
    }

    /**
     * @return spanName
     */
    public String getSpanName() {
        return this.spanName;
    }

    /**
     * @return startTime
     */
    public Long getStartTime() {
        return this.startTime;
    }

    public static final class Builder extends Request.Builder<GetTagKeyRequest, Builder> {
        private Long endTime; 
        private String regionId; 
        private String serviceName; 
        private String spanName; 
        private Long startTime; 

        private Builder() {
            super();
        } 

        private Builder(GetTagKeyRequest request) {
            super(request);
            this.endTime = request.endTime;
            this.regionId = request.regionId;
            this.serviceName = request.serviceName;
            this.spanName = request.spanName;
            this.startTime = request.startTime;
        } 

        /**
         * The timestamp of the end time of the time range to query. The timestamp is accurate to milliseconds.
         */
        public Builder endTime(Long endTime) {
            this.putQueryParameter("EndTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * The ID of the region.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * The name of the application.
         */
        public Builder serviceName(String serviceName) {
            this.putQueryParameter("ServiceName", serviceName);
            this.serviceName = serviceName;
            return this;
        }

        /**
         * The name of the span.
         */
        public Builder spanName(String spanName) {
            this.putQueryParameter("SpanName", spanName);
            this.spanName = spanName;
            return this;
        }

        /**
         * The timestamp of the start time of the time range to query. The timestamp is accurate to milliseconds.
         */
        public Builder startTime(Long startTime) {
            this.putQueryParameter("StartTime", startTime);
            this.startTime = startTime;
            return this;
        }

        @Override
        public GetTagKeyRequest build() {
            return new GetTagKeyRequest(this);
        } 

    } 

}
