// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cdn20180510.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDomainCcActivityLogRequest} extends {@link RequestModel}
 *
 * <p>DescribeDomainCcActivityLogRequest</p>
 */
public class DescribeDomainCcActivityLogRequest extends Request {
    @Query
    @NameInMap("DomainName")
    private String domainName;

    @Query
    @NameInMap("EndTime")
    private String endTime;

    @Query
    @NameInMap("PageNumber")
    private Long pageNumber;

    @Query
    @NameInMap("PageSize")
    @Validation(maximum = 100)
    private Long pageSize;

    @Query
    @NameInMap("RuleName")
    private String ruleName;

    @Query
    @NameInMap("StartTime")
    private String startTime;

    @Query
    @NameInMap("TriggerObject")
    private String triggerObject;

    @Query
    @NameInMap("Value")
    private String value;

    private DescribeDomainCcActivityLogRequest(Builder builder) {
        super(builder);
        this.domainName = builder.domainName;
        this.endTime = builder.endTime;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.ruleName = builder.ruleName;
        this.startTime = builder.startTime;
        this.triggerObject = builder.triggerObject;
        this.value = builder.value;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDomainCcActivityLogRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
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
     * @return pageNumber
     */
    public Long getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public Long getPageSize() {
        return this.pageSize;
    }

    /**
     * @return ruleName
     */
    public String getRuleName() {
        return this.ruleName;
    }

    /**
     * @return startTime
     */
    public String getStartTime() {
        return this.startTime;
    }

    /**
     * @return triggerObject
     */
    public String getTriggerObject() {
        return this.triggerObject;
    }

    /**
     * @return value
     */
    public String getValue() {
        return this.value;
    }

    public static final class Builder extends Request.Builder<DescribeDomainCcActivityLogRequest, Builder> {
        private String domainName; 
        private String endTime; 
        private Long pageNumber; 
        private Long pageSize; 
        private String ruleName; 
        private String startTime; 
        private String triggerObject; 
        private String value; 

        private Builder() {
            super();
        } 

        private Builder(DescribeDomainCcActivityLogRequest request) {
            super(request);
            this.domainName = request.domainName;
            this.endTime = request.endTime;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.ruleName = request.ruleName;
            this.startTime = request.startTime;
            this.triggerObject = request.triggerObject;
            this.value = request.value;
        } 

        /**
         * The accelerated domain name. You can specify multiple domain names and separate them with commas (,).
         * <p>
         * 
         * If you do not specify this parameter, data of all accelerated domain names under your account is queried.
         */
        public Builder domainName(String domainName) {
            this.putQueryParameter("DomainName", domainName);
            this.domainName = domainName;
            return this;
        }

        /**
         * The end of the time range to query. Specify the time in the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time must be in UTC.
         * <p>
         * 
         * The end time must be later than the start time.
         */
        public Builder endTime(String endTime) {
            this.putQueryParameter("EndTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * The page number of the page to return. Default value: **1**.
         */
        public Builder pageNumber(Long pageNumber) {
            this.putQueryParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * The number of entries to return on each page. Default value: **30**.
         */
        public Builder pageSize(Long pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * A custom rule name. Valid values:
         * <p>
         * 
         * *   default_normal: rule for the normal mode
         * *   default_attack: rule for the emergency mode
         * 
         * If you leave this parameter empty, events that triggered rate limiting based on all rules are queried.
         */
        public Builder ruleName(String ruleName) {
            this.putQueryParameter("RuleName", ruleName);
            this.ruleName = ruleName;
            return this;
        }

        /**
         * The beginning of the time range to query. Specify the time in the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time must be in UTC.
         * <p>
         * 
         * The minimum time granularity of data collection is 5 minutes.
         * 
         * If you leave this parameter empty, the data collected over the last 24 hours is queried.
         */
        public Builder startTime(String startTime) {
            this.putQueryParameter("StartTime", startTime);
            this.startTime = startTime;
            return this;
        }

        /**
         * The trigger of rate limiting by which you want to query data.
         * <p>
         * 
         * If you leave this parameter empty, all events that triggered rate limiting are queried.
         */
        public Builder triggerObject(String triggerObject) {
            this.putQueryParameter("TriggerObject", triggerObject);
            this.triggerObject = triggerObject;
            return this;
        }

        /**
         * The value of the trigger.
         * <p>
         * 
         * If you leave this parameter empty, all events recorded for the trigger are queried.
         */
        public Builder value(String value) {
            this.putQueryParameter("Value", value);
            this.value = value;
            return this;
        }

        @Override
        public DescribeDomainCcActivityLogRequest build() {
            return new DescribeDomainCcActivityLogRequest(this);
        } 

    } 

}
