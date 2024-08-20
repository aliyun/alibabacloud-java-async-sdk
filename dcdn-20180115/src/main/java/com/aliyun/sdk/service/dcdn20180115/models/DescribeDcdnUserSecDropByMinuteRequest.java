// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dcdn20180115.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDcdnUserSecDropByMinuteRequest} extends {@link RequestModel}
 *
 * <p>DescribeDcdnUserSecDropByMinuteRequest</p>
 */
public class DescribeDcdnUserSecDropByMinuteRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DomainName")
    private String domainName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EndTime")
    private String endTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Lang")
    @com.aliyun.core.annotation.Validation(required = true)
    private String lang;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Object")
    private String object;

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
    @com.aliyun.core.annotation.NameInMap("SecFunc")
    @com.aliyun.core.annotation.Validation(required = true)
    private String secFunc;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StartTime")
    private String startTime;

    private DescribeDcdnUserSecDropByMinuteRequest(Builder builder) {
        super(builder);
        this.domainName = builder.domainName;
        this.endTime = builder.endTime;
        this.lang = builder.lang;
        this.object = builder.object;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.ruleName = builder.ruleName;
        this.secFunc = builder.secFunc;
        this.startTime = builder.startTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDcdnUserSecDropByMinuteRequest create() {
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
     * @return lang
     */
    public String getLang() {
        return this.lang;
    }

    /**
     * @return object
     */
    public String getObject() {
        return this.object;
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
     * @return secFunc
     */
    public String getSecFunc() {
        return this.secFunc;
    }

    /**
     * @return startTime
     */
    public String getStartTime() {
        return this.startTime;
    }

    public static final class Builder extends Request.Builder<DescribeDcdnUserSecDropByMinuteRequest, Builder> {
        private String domainName; 
        private String endTime; 
        private String lang; 
        private String object; 
        private Long pageNumber; 
        private Long pageSize; 
        private String ruleName; 
        private String secFunc; 
        private String startTime; 

        private Builder() {
            super();
        } 

        private Builder(DescribeDcdnUserSecDropByMinuteRequest request) {
            super(request);
            this.domainName = request.domainName;
            this.endTime = request.endTime;
            this.lang = request.lang;
            this.object = request.object;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.ruleName = request.ruleName;
            this.secFunc = request.secFunc;
            this.startTime = request.startTime;
        } 

        /**
         * The domain name.
         */
        public Builder domainName(String domainName) {
            this.putQueryParameter("DomainName", domainName);
            this.domainName = domainName;
            return this;
        }

        /**
         * The end of the time range to query. Specify the time in the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time must be in UTC. Example: 2006-01-02T15:05:04Z.
         * <p>
         * 
         * > The end time must be later than the start time.
         */
        public Builder endTime(String endTime) {
            this.putQueryParameter("EndTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * The language. Valid values: en and zh. Default value: en
         */
        public Builder lang(String lang) {
            this.putQueryParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        /**
         * The object that triggered rate limiting.
         */
        public Builder object(String object) {
            this.putQueryParameter("Object", object);
            this.object = object;
            return this;
        }

        /**
         * The number of the page to return. Pages start from page 1.
         */
        public Builder pageNumber(Long pageNumber) {
            this.putQueryParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * The number of entries to return on each page. Maximum value: 100.
         */
        public Builder pageSize(Long pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * The rule that was triggered.
         */
        public Builder ruleName(String ruleName) {
            this.putQueryParameter("RuleName", ruleName);
            this.ruleName = ruleName;
            return this;
        }

        /**
         * The name of the security feature.
         */
        public Builder secFunc(String secFunc) {
            this.putQueryParameter("SecFunc", secFunc);
            this.secFunc = secFunc;
            return this;
        }

        /**
         * The beginning of the time range to query. Specify the time in the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time must be in UTC. Example: 2006-01-02T15:04:04Z.
         */
        public Builder startTime(String startTime) {
            this.putQueryParameter("StartTime", startTime);
            this.startTime = startTime;
            return this;
        }

        @Override
        public DescribeDcdnUserSecDropByMinuteRequest build() {
            return new DescribeDcdnUserSecDropByMinuteRequest(this);
        } 

    } 

}
