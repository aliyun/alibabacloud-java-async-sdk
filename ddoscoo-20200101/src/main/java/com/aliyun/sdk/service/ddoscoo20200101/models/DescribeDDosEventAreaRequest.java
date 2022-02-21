// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddoscoo20200101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDDosEventAreaRequest} extends {@link RequestModel}
 *
 * <p>DescribeDDosEventAreaRequest</p>
 */
public class DescribeDDosEventAreaRequest extends Request {
    @Query
    @NameInMap("EventType")
    @Validation(required = true)
    private String eventType;

    @Query
    @NameInMap("Ip")
    @Validation(required = true)
    private String ip;

    @Query
    @NameInMap("StartTime")
    @Validation(required = true)
    private Long startTime;

    private DescribeDDosEventAreaRequest(Builder builder) {
        super(builder);
        this.eventType = builder.eventType;
        this.ip = builder.ip;
        this.startTime = builder.startTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDDosEventAreaRequest create() {
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
     * @return startTime
     */
    public Long getStartTime() {
        return this.startTime;
    }

    public static final class Builder extends Request.Builder<DescribeDDosEventAreaRequest, Builder> {
        private String eventType; 
        private String ip; 
        private Long startTime; 

        private Builder() {
            super();
        } 

        private Builder(DescribeDDosEventAreaRequest response) {
            super(response);
            this.eventType = response.eventType;
            this.ip = response.ip;
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
         * StartTime.
         */
        public Builder startTime(Long startTime) {
            this.putQueryParameter("StartTime", startTime);
            this.startTime = startTime;
            return this;
        }

        @Override
        public DescribeDDosEventAreaRequest build() {
            return new DescribeDDosEventAreaRequest(this);
        } 

    } 

}
