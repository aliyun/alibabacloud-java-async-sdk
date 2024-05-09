// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddoscoo20200101.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDDosEventAttackTypeRequest} extends {@link RequestModel}
 *
 * <p>DescribeDDosEventAttackTypeRequest</p>
 */
public class DescribeDDosEventAttackTypeRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EventType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String eventType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Ip")
    @com.aliyun.core.annotation.Validation(required = true)
    private String ip;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StartTime")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long startTime;

    private DescribeDDosEventAttackTypeRequest(Builder builder) {
        super(builder);
        this.eventType = builder.eventType;
        this.ip = builder.ip;
        this.startTime = builder.startTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDDosEventAttackTypeRequest create() {
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

    public static final class Builder extends Request.Builder<DescribeDDosEventAttackTypeRequest, Builder> {
        private String eventType; 
        private String ip; 
        private Long startTime; 

        private Builder() {
            super();
        } 

        private Builder(DescribeDDosEventAttackTypeRequest request) {
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
        public DescribeDDosEventAttackTypeRequest build() {
            return new DescribeDDosEventAttackTypeRequest(this);
        } 

    } 

}
