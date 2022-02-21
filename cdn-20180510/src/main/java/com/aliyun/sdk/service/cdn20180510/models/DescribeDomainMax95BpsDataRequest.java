// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cdn20180510.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDomainMax95BpsDataRequest} extends {@link RequestModel}
 *
 * <p>DescribeDomainMax95BpsDataRequest</p>
 */
public class DescribeDomainMax95BpsDataRequest extends Request {
    @Query
    @NameInMap("Cycle")
    private String cycle;

    @Query
    @NameInMap("DomainName")
    private String domainName;

    @Query
    @NameInMap("EndTime")
    private String endTime;

    @Query
    @NameInMap("OwnerId")
    private Long ownerId;

    @Query
    @NameInMap("StartTime")
    private String startTime;

    @Query
    @NameInMap("TimePoint")
    private String timePoint;

    private DescribeDomainMax95BpsDataRequest(Builder builder) {
        super(builder);
        this.cycle = builder.cycle;
        this.domainName = builder.domainName;
        this.endTime = builder.endTime;
        this.ownerId = builder.ownerId;
        this.startTime = builder.startTime;
        this.timePoint = builder.timePoint;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDomainMax95BpsDataRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return cycle
     */
    public String getCycle() {
        return this.cycle;
    }

    /**
     * @return domainName
     */
    public String getDomainName() {
        return this.domainName;
    }

    /**
     * @return endTime
     */
    public String getEndTime() {
        return this.endTime;
    }

    /**
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
    }

    /**
     * @return startTime
     */
    public String getStartTime() {
        return this.startTime;
    }

    /**
     * @return timePoint
     */
    public String getTimePoint() {
        return this.timePoint;
    }

    public static final class Builder extends Request.Builder<DescribeDomainMax95BpsDataRequest, Builder> {
        private String cycle; 
        private String domainName; 
        private String endTime; 
        private Long ownerId; 
        private String startTime; 
        private String timePoint; 

        private Builder() {
            super();
        } 

        private Builder(DescribeDomainMax95BpsDataRequest response) {
            super(response);
            this.cycle = response.cycle;
            this.domainName = response.domainName;
            this.endTime = response.endTime;
            this.ownerId = response.ownerId;
            this.startTime = response.startTime;
            this.timePoint = response.timePoint;
        } 

        /**
         * Cycle.
         */
        public Builder cycle(String cycle) {
            this.putQueryParameter("Cycle", cycle);
            this.cycle = cycle;
            return this;
        }

        /**
         * DomainName.
         */
        public Builder domainName(String domainName) {
            this.putQueryParameter("DomainName", domainName);
            this.domainName = domainName;
            return this;
        }

        /**
         * EndTime.
         */
        public Builder endTime(String endTime) {
            this.putQueryParameter("EndTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * OwnerId.
         */
        public Builder ownerId(Long ownerId) {
            this.putQueryParameter("OwnerId", ownerId);
            this.ownerId = ownerId;
            return this;
        }

        /**
         * StartTime.
         */
        public Builder startTime(String startTime) {
            this.putQueryParameter("StartTime", startTime);
            this.startTime = startTime;
            return this;
        }

        /**
         * TimePoint.
         */
        public Builder timePoint(String timePoint) {
            this.putQueryParameter("TimePoint", timePoint);
            this.timePoint = timePoint;
            return this;
        }

        @Override
        public DescribeDomainMax95BpsDataRequest build() {
            return new DescribeDomainMax95BpsDataRequest(this);
        } 

    } 

}
