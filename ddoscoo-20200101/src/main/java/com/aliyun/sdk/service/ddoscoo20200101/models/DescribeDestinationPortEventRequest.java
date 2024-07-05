// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddoscoo20200101.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDestinationPortEventRequest} extends {@link RequestModel}
 *
 * <p>DescribeDestinationPortEventRequest</p>
 */
public class DescribeDestinationPortEventRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EventType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String eventType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Ip")
    @com.aliyun.core.annotation.Validation(required = true)
    private String ip;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Range")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long range;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Region")
    @com.aliyun.core.annotation.Validation(required = true)
    private String region;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StartTime")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long startTime;

    private DescribeDestinationPortEventRequest(Builder builder) {
        super(builder);
        this.eventType = builder.eventType;
        this.ip = builder.ip;
        this.range = builder.range;
        this.region = builder.region;
        this.startTime = builder.startTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDestinationPortEventRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return eventType
     */
    public String getEventType() {
        return this.eventType;
    }

    /**
     * @return ip
     */
    public String getIp() {
        return this.ip;
    }

    /**
     * @return range
     */
    public Long getRange() {
        return this.range;
    }

    /**
     * @return region
     */
    public String getRegion() {
        return this.region;
    }

    /**
     * @return startTime
     */
    public Long getStartTime() {
        return this.startTime;
    }

    public static final class Builder extends Request.Builder<DescribeDestinationPortEventRequest, Builder> {
        private String eventType; 
        private String ip; 
        private Long range; 
        private String region; 
        private Long startTime; 

        private Builder() {
            super();
        } 

        private Builder(DescribeDestinationPortEventRequest request) {
            super(request);
            this.eventType = request.eventType;
            this.ip = request.ip;
            this.range = request.range;
            this.region = request.region;
            this.startTime = request.startTime;
        } 

        /**
         * EventType.
         */
        public Builder eventType(String eventType) {
            this.putQueryParameter("EventType", eventType);
            this.eventType = eventType;
            return this;
        }

        /**
         * Ip.
         */
        public Builder ip(String ip) {
            this.putQueryParameter("Ip", ip);
            this.ip = ip;
            return this;
        }

        /**
         * Range.
         */
        public Builder range(Long range) {
            this.putQueryParameter("Range", range);
            this.range = range;
            return this;
        }

        /**
         * Region.
         */
        public Builder region(String region) {
            this.putQueryParameter("Region", region);
            this.region = region;
            return this;
        }

        /**
         * StartTime.
         */
        public Builder startTime(Long startTime) {
            this.putQueryParameter("StartTime", startTime);
            this.startTime = startTime;
            return this;
        }

        @Override
        public DescribeDestinationPortEventRequest build() {
            return new DescribeDestinationPortEventRequest(this);
        } 

    } 

}
