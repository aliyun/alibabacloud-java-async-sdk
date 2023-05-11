// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alidns20150109.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeRecordResolveStatisticsSummaryRequest} extends {@link RequestModel}
 *
 * <p>DescribeRecordResolveStatisticsSummaryRequest</p>
 */
public class DescribeRecordResolveStatisticsSummaryRequest extends Request {
    @Query
    @NameInMap("Direction")
    private String direction;

    @Query
    @NameInMap("DomainName")
    @Validation(required = true)
    private String domainName;

    @Query
    @NameInMap("DomainType")
    private String domainType;

    @Query
    @NameInMap("EndDate")
    private String endDate;

    @Query
    @NameInMap("Keyword")
    private String keyword;

    @Query
    @NameInMap("Lang")
    private String lang;

    @Query
    @NameInMap("PageNumber")
    private Integer pageNumber;

    @Query
    @NameInMap("PageSize")
    private Integer pageSize;

    @Query
    @NameInMap("SearchMode")
    private String searchMode;

    @Query
    @NameInMap("StartDate")
    @Validation(required = true)
    private String startDate;

    @Query
    @NameInMap("Threshold")
    private Long threshold;

    private DescribeRecordResolveStatisticsSummaryRequest(Builder builder) {
        super(builder);
        this.direction = builder.direction;
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

    public static DescribeRecordResolveStatisticsSummaryRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return direction
     */
    public String getDirection() {
        return this.direction;
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
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
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

    public static final class Builder extends Request.Builder<DescribeRecordResolveStatisticsSummaryRequest, Builder> {
        private String direction; 
        private String domainName; 
        private String domainType; 
        private String endDate; 
        private String keyword; 
        private String lang; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String searchMode; 
        private String startDate; 
        private Long threshold; 

        private Builder() {
            super();
        } 

        private Builder(DescribeRecordResolveStatisticsSummaryRequest request) {
            super(request);
            this.direction = request.direction;
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
         * The order in which you want to sort the query results. Valid values: DESC and ASC. DESC is the default value and indicates that the query results are sorted in descending order. ASC indicates that the query results are sorted in ascending order.
         */
        public Builder direction(String direction) {
            this.putQueryParameter("Direction", direction);
            this.direction = direction;
            return this;
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
         * PUBLIC and CACHE. PUBLIC is the default value and indicates an authoritative domain name. CACHE indicates a cache-accelerated domain name.
         */
        public Builder domainType(String domainType) {
            this.putQueryParameter("DomainType", domainType);
            this.domainType = domainType;
            return this;
        }

        /**
         * The end time in the yyyy-MM-dd format, for example, 2023-03-13.
         */
        public Builder endDate(String endDate) {
            this.putQueryParameter("EndDate", endDate);
            this.endDate = endDate;
            return this;
        }

        /**
         * The keyword. The Keyword parameter is used together with the SearchMode parameter.
         */
        public Builder keyword(String keyword) {
            this.putQueryParameter("Keyword", keyword);
            this.keyword = keyword;
            return this;
        }

        /**
         * The language used. Valid values: zh, en, and ja.
         */
        public Builder lang(String lang) {
            this.putQueryParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        /**
         * The number of the page to return. Pages start from page 1. Default value: 1.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.putQueryParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * The number of entries to return on each page. Valid values: 1 to 1000.
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * The search mode of the keyword. Valid values:
         * <p>
         * 
         * LIKE (default): fuzzy search. EXACT: exact match.
         */
        public Builder searchMode(String searchMode) {
            this.putQueryParameter("SearchMode", searchMode);
            this.searchMode = searchMode;
            return this;
        }

        /**
         * The start time in the yyyy-MM-dd format, for example, 2023-03-01.
         */
        public Builder startDate(String startDate) {
            this.putQueryParameter("StartDate", startDate);
            this.startDate = startDate;
            return this;
        }

        /**
         * The threshold for the number of resolution requests. You can query the subdomain names at the specified quantity level of resolution requests and query the number of resolution requests for each subdomain name. For example, if you set this parameter to 100, you can obtain data about the subdomain names with less than 100 resolution requests.
         * <p>
         * 
         * If you do not specify this parameter, the data about the subdomain names that have resolution requests is obtained.
         * 
         * If you set this parameter to a value less than 0, the data about all subdomain names is obtained.
         * 
         * If you set this parameter to 0, the data about the subdomain names that do not have resolution requests is obtained.
         * 
         * If you set this parameter to a value greater than 0, the data about the subdomain names whose number of resolution requests is less than or equal to the value of this parameter is obtained.
         */
        public Builder threshold(Long threshold) {
            this.putQueryParameter("Threshold", threshold);
            this.threshold = threshold;
            return this;
        }

        @Override
        public DescribeRecordResolveStatisticsSummaryRequest build() {
            return new DescribeRecordResolveStatisticsSummaryRequest(this);
        } 

    } 

}
