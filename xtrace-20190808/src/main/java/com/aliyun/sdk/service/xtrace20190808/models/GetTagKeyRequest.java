// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.xtrace20190808.models;

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
         * <p>The end of the time range to query. The value is a timestamp that is accurate to milliseconds.</p>
         * <blockquote>
         * <p> The value of this parameter is of the LONG type. Precision loss may occur during serialization or deserialization. The value must be less than or equal to 9007199254740991.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>1575622455686</p>
         */
        public Builder endTime(Long endTime) {
            this.putQueryParameter("EndTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * <p>The ID of the region.</p>
         * <p>This parameter is required.</p>
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
         * <p>The name of the application.</p>
         * 
         * <strong>example:</strong>
         * <p>appTest</p>
         */
        public Builder serviceName(String serviceName) {
            this.putQueryParameter("ServiceName", serviceName);
            this.serviceName = serviceName;
            return this;
        }

        /**
         * <p>The name of the span.</p>
         * 
         * <strong>example:</strong>
         * <p>createOrder</p>
         */
        public Builder spanName(String spanName) {
            this.putQueryParameter("SpanName", spanName);
            this.spanName = spanName;
            return this;
        }

        /**
         * <p>The beginning of the time range to query. The value is a timestamp that is accurate to milliseconds.</p>
         * <blockquote>
         * <p> The value of this parameter is of the LONG type. Precision loss may occur during serialization or deserialization. The value must be less than or equal to 9007199254740991.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>1575561600000</p>
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
