// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dcdn20180115.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDcdnDomainCcActivityLogRequest} extends {@link RequestModel}
 *
 * <p>DescribeDcdnDomainCcActivityLogRequest</p>
 */
public class DescribeDcdnDomainCcActivityLogRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DomainName")
    private String domainName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EndTime")
    private String endTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Long pageNumber;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    @com.aliyun.core.annotation.Validation(maximum = 100)
    private Long pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RuleName")
    private String ruleName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StartTime")
    private String startTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TriggerObject")
    private String triggerObject;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Value")
    private String value;

    private DescribeDcdnDomainCcActivityLogRequest(Builder builder) {
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

    public static DescribeDcdnDomainCcActivityLogRequest create() {
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

    public static final class Builder extends Request.Builder<DescribeDcdnDomainCcActivityLogRequest, Builder> {
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

        private Builder(DescribeDcdnDomainCcActivityLogRequest request) {
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
         * The accelerated domain name. You can specify one or more domain names. Separate multiple domain names with commas (,).
         * <p>
         * 
         * If you leave this parameter empty, the data of all domain names is queried.
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
         * The page number of the page returned. Default value: **1**.
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
         * The name of the defense rule.
         * <p>
         * 
         * *   default_normal in normal mode
         * *   default_attack in emergency mode
         * *   A custom rule name in custom mode. Example: test2.
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
         * The resolution of the queried data is 5 minutes.
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
         * The value of the object that triggered rate limiting.
         * <p>
         * 
         * If you leave this parameter empty, events that triggered rate limiting based on all rules are queried.
         */
        public Builder value(String value) {
            this.putQueryParameter("Value", value);
            this.value = value;
            return this;
        }

        @Override
        public DescribeDcdnDomainCcActivityLogRequest build() {
            return new DescribeDcdnDomainCcActivityLogRequest(this);
        } 

    } 

}
