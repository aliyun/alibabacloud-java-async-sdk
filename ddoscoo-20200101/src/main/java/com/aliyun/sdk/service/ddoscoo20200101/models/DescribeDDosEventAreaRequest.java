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

        private Builder(DescribeDDosEventAreaRequest request) {
            super(request);
            this.eventType = request.eventType;
            this.ip = request.ip;
            this.startTime = request.startTime;
        } 

        /**
         * The type of the attack event that you want to query. Valid values:
         * <p>
         * 
         * *   **defense**: attack events that trigger traffic scrubbing
         * *   **blackhole**: attack events that trigger blackhole filtering
         */
        public Builder eventType(String eventType) {
            this.putQueryParameter("EventType", eventType);
            this.eventType = eventType;
            return this;
        }

        /**
         * The IP address of the attacked Anti-DDoS Pro or Anti-DDoS Premium instance.
         */
        public Builder ip(String ip) {
            this.putQueryParameter("Ip", ip);
            this.ip = ip;
            return this;
        }

        /**
         * The UNIX timestamp when the query starts. Unit: seconds.
         * <p>
         * 
         * > You can call the [DescribeDDosAllEventList](~~188604~~) operation to query the beginning time of all attack events.
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
