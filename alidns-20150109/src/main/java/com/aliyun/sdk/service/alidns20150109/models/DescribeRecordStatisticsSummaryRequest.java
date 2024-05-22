// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alidns20150109.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeRecordStatisticsSummaryRequest} extends {@link RequestModel}
 *
 * <p>DescribeRecordStatisticsSummaryRequest</p>
 */
public class DescribeRecordStatisticsSummaryRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DomainName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String domainName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DomainType")
    private String domainType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EndDate")
    private String endDate;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Keyword")
    private String keyword;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Long pageNumber;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    @com.aliyun.core.annotation.Validation(maximum = 100, minimum = 1)
    private Long pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SearchMode")
    private String searchMode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StartDate")
    @com.aliyun.core.annotation.Validation(required = true)
    private String startDate;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Threshold")
    private Long threshold;

    private DescribeRecordStatisticsSummaryRequest(Builder builder) {
        super(builder);
        this.domainName = builder.domainName;
        this.domainType = builder.domainType;
        this.endDate = builder.endDate;
        this.keyword = builder.keyword;
        this.lang = builder.lang;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.searchMode = builder.searchMode;
        this.startDate = builder.startDate;
        this.threshold = builder.threshold;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeRecordStatisticsSummaryRequest create() {
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
     * @return domainType
     */
    public String getDomainType() {
        return this.domainType;
    }

    /**
     * @return endDate
     */
    public String getEndDate() {
        return this.endDate;
    }

    /**
     * @return keyword
     */
    public String getKeyword() {
        return this.keyword;
    }

    /**
     * @return lang
     */
    public String getLang() {
        return this.lang;
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
     * @return searchMode
     */
    public String getSearchMode() {
        return this.searchMode;
    }

    /**
     * @return startDate
     */
    public String getStartDate() {
        return this.startDate;
    }

    /**
     * @return threshold
     */
    public Long getThreshold() {
        return this.threshold;
    }

    public static final class Builder extends Request.Builder<DescribeRecordStatisticsSummaryRequest, Builder> {
        private String domainName; 
        private String domainType; 
        private String endDate; 
        private String keyword; 
        private String lang; 
        private Long pageNumber; 
        private Long pageSize; 
        private String searchMode; 
        private String startDate; 
        private Long threshold; 

        private Builder() {
            super();
        } 

        private Builder(DescribeRecordStatisticsSummaryRequest request) {
            super(request);
            this.domainName = request.domainName;
            this.domainType = request.domainType;
            this.endDate = request.endDate;
            this.keyword = request.keyword;
            this.lang = request.lang;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.searchMode = request.searchMode;
            this.startDate = request.startDate;
            this.threshold = request.threshold;
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
         * The type of the domain name. The parameter value is not case-sensitive. Valid values:
         * <p>
         * 
         * *   PUBLIC (default): hosted public domain name
         * *   CACHE: cache-accelerated domain name
         */
        public Builder domainType(String domainType) {
            this.putQueryParameter("DomainType", domainType);
            this.domainType = domainType;
            return this;
        }

        /**
         * The end date of the query. Specify the start date in the **YYYY-MM-DD** format.
         * <p>
         * 
         * The default value is the day when you query the data.
         */
        public Builder endDate(String endDate) {
            this.putQueryParameter("EndDate", endDate);
            this.endDate = endDate;
            return this;
        }

        /**
         * The keyword for searches in %KeyWord% mode. The value is not case-sensitive.
         */
        public Builder keyword(String keyword) {
            this.putQueryParameter("Keyword", keyword);
            this.keyword = keyword;
            return this;
        }

        /**
         * The language.
         */
        public Builder lang(String lang) {
            this.putQueryParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        /**
         * The page number. Pages start from page **1**. Default value: **1**.
         */
        public Builder pageNumber(Long pageNumber) {
            this.putQueryParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * The number of entries per page. Valid values: **1 to 100**. Default value: **20**.
         */
        public Builder pageSize(Long pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * The search mode of the keyword. Valid values:
         * <p>
         * 
         * *   **LIKE** (default): fuzzy search
         * *   **EXACT**: exact search
         */
        public Builder searchMode(String searchMode) {
            this.putQueryParameter("SearchMode", searchMode);
            this.searchMode = searchMode;
            return this;
        }

        /**
         * The start date of the query. Specify the start date in the **YYYY-MM-DD** format.
         * <p>
         * 
         * You can only query the DNS records within the last 90 days.``
         */
        public Builder startDate(String startDate) {
            this.putQueryParameter("StartDate", startDate);
            this.startDate = startDate;
            return this;
        }

        /**
         * The maximum number of DNS requests that you can obtain. You can obtain data about a domain name with DNS request volume less than or equal to the maximum number. For example, if you set this parameter to 100, you can query domain names with less than 100 DNS requests.
         */
        public Builder threshold(Long threshold) {
            this.putQueryParameter("Threshold", threshold);
            this.threshold = threshold;
            return this;
        }

        @Override
        public DescribeRecordStatisticsSummaryRequest build() {
            return new DescribeRecordStatisticsSummaryRequest(this);
        } 

    } 

}
