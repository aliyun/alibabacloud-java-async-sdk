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
 * {@link GetTagValRequest} extends {@link RequestModel}
 *
 * <p>GetTagValRequest</p>
 */
public class GetTagValRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EndTime")
    private Long endTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
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

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TagKey")
    @com.aliyun.core.annotation.Validation(required = true)
    private String tagKey;

    private GetTagValRequest(Builder builder) {
        super(builder);
        this.endTime = builder.endTime;
        this.regionId = builder.regionId;
        this.serviceName = builder.serviceName;
        this.spanName = builder.spanName;
        this.startTime = builder.startTime;
        this.tagKey = builder.tagKey;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetTagValRequest create() {
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

    /**
     * @return tagKey
     */
    public String getTagKey() {
        return this.tagKey;
    }

    public static final class Builder extends Request.Builder<GetTagValRequest, Builder> {
        private Long endTime; 
        private String regionId; 
        private String serviceName; 
        private String spanName; 
        private Long startTime; 
        private String tagKey; 

        private Builder() {
            super();
        } 

        private Builder(GetTagValRequest request) {
            super(request);
            this.endTime = request.endTime;
            this.regionId = request.regionId;
            this.serviceName = request.serviceName;
            this.spanName = request.spanName;
            this.startTime = request.startTime;
            this.tagKey = request.tagKey;
        } 

        /**
         * <p>The end of the time range to query. The value is a timestamp that is accurate to milliseconds.</p>
         * <blockquote>
         * <p> This value is of the LONG type, and precision loss may occur during serialization or deserialization. Do not set this parameter to a value greater than 9007199254740991.</p>
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
         * <p> This value is of the LONG type, and precision loss may occur during serialization or deserialization. Do not set this parameter to a value greater than 9007199254740991.</p>
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

        /**
         * <p>The tag key.</p>
         * <p>You can call the <a href="https://help.aliyun.com/document_detail/2399667.html">GetTagKey</a> operation to obtain a tag key.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>span.kind</p>
         */
        public Builder tagKey(String tagKey) {
            this.putQueryParameter("TagKey", tagKey);
            this.tagKey = tagKey;
            return this;
        }

        @Override
        public GetTagValRequest build() {
            return new GetTagValRequest(this);
        } 

    } 

}
