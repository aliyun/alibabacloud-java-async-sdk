// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddoscoo20200101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDDosEventSrcIpRequest} extends {@link RequestModel}
 *
 * <p>DescribeDDosEventSrcIpRequest</p>
 */
public class DescribeDDosEventSrcIpRequest extends Request {
    @Query
    @NameInMap("EventType")
    @Validation(required = true)
    private String eventType;

    @Query
    @NameInMap("Ip")
    @Validation(required = true)
    private String ip;

    @Query
    @NameInMap("Range")
    @Validation(required = true)
    private Long range;

    @Query
    @NameInMap("StartTime")
    @Validation(required = true)
    private Long startTime;

    private DescribeDDosEventSrcIpRequest(Builder builder) {
        super(builder);
        this.eventType = builder.eventType;
        this.ip = builder.ip;
        this.range = builder.range;
        this.startTime = builder.startTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDDosEventSrcIpRequest create() {
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
     * @return startTime
     */
    public Long getStartTime() {
        return this.startTime;
    }

    public static final class Builder extends Request.Builder<DescribeDDosEventSrcIpRequest, Builder> {
        private String eventType; 
        private String ip; 
        private Long range; 
        private Long startTime; 

        private Builder() {
            super();
        } 

        private Builder(DescribeDDosEventSrcIpRequest response) {
            super(response);
            this.eventType = response.eventType;
            this.ip = response.ip;
            this.range = response.range;
            this.startTime = response.startTime;
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
         * StartTime.
         */
        public Builder startTime(Long startTime) {
            this.putQueryParameter("StartTime", startTime);
            this.startTime = startTime;
            return this;
        }

        @Override
        public DescribeDDosEventSrcIpRequest build() {
            return new DescribeDDosEventSrcIpRequest(this);
        } 

    } 

}
