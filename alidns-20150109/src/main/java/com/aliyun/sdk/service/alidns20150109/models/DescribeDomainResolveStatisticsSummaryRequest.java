// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alidns20150109.models;

import com.aliyun.sdk.gateway.pop.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeDomainResolveStatisticsSummaryRequest} extends {@link RequestModel}
 *
 * <p>DescribeDomainResolveStatisticsSummaryRequest</p>
 */
public class DescribeDomainResolveStatisticsSummaryRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Direction")
    private String direction;

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
    private Integer pageNumber;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

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

    private DescribeDomainResolveStatisticsSummaryRequest(Builder builder) {
        super(builder);
        this.direction = builder.direction;
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

    public static DescribeDomainResolveStatisticsSummaryRequest create() {
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

    public static final class Builder extends Request.Builder<DescribeDomainResolveStatisticsSummaryRequest, Builder> {
        private String direction; 
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

        private Builder(DescribeDomainResolveStatisticsSummaryRequest request) {
            super(request);
            this.direction = request.direction;
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
         * <p>The order in which you want to sort the returned entries. Valid values:</p>
         * <ul>
         * <li>DESC: the descending order</li>
         * <li>ASC: the ascending order</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>DESC</p>
         */
        public Builder direction(String direction) {
            this.putQueryParameter("Direction", direction);
            this.direction = direction;
            return this;
        }

        /**
         * <p>The end time in the yyyy-MM-dd format, for example, 2023-03-13.</p>
         * 
         * <strong>example:</strong>
         * <p>2023-03-01</p>
         */
        public Builder endDate(String endDate) {
            this.putQueryParameter("EndDate", endDate);
            this.endDate = endDate;
            return this;
        }

        /**
         * <p>The keyword. The Keyword parameter is used together with the SearchMode parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        public Builder keyword(String keyword) {
            this.putQueryParameter("Keyword", keyword);
            this.keyword = keyword;
            return this;
        }

        /**
         * <p>The language. Valid values: zh, en, and ja.</p>
         * 
         * <strong>example:</strong>
         * <p>zh</p>
         */
        public Builder lang(String lang) {
            this.putQueryParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        /**
         * <p>The number of the page to return. Pages start from page 1. Default value: 1.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Integer pageNumber) {
            this.putQueryParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The number of entries to return on each page. Valid values: 1 to 1000.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The search mode of the keyword. Valid values:</p>
         * <ul>
         * <li>LIKE (default): fuzzy search</li>
         * <li>EXACT: exact search</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>EXACT</p>
         */
        public Builder searchMode(String searchMode) {
            this.putQueryParameter("SearchMode", searchMode);
            this.searchMode = searchMode;
            return this;
        }

        /**
         * <p>The start time in the yyyy-MM-dd format, for example, 2023-03-01.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>2023-03-01</p>
         */
        public Builder startDate(String startDate) {
            this.putQueryParameter("StartDate", startDate);
            this.startDate = startDate;
            return this;
        }

        /**
         * <p>The threshold for the number of Domain Name System (DNS) requests. You can query the domain names at the specified quantity level of DNS requests and query the number of DNS requests for each domain name.</p>
         * <p>If you do not specify this parameter, the data about the domain names that have DNS requests is obtained.</p>
         * <p>If you set this parameter to a value less than 0, the data about all domain names is obtained.</p>
         * <p>If you set this parameter to 0, the data about the domain names that do not have DNS requests is obtained.</p>
         * <p>If you set this parameter to a value greater than 0, the data about the domain names whose number of DNS requests is less than or equal to the value of this parameter is obtained.</p>
         * 
         * <strong>example:</strong>
         * <p>-1</p>
         */
        public Builder threshold(Long threshold) {
            this.putQueryParameter("Threshold", threshold);
            this.threshold = threshold;
            return this;
        }

        @Override
        public DescribeDomainResolveStatisticsSummaryRequest build() {
            return new DescribeDomainResolveStatisticsSummaryRequest(this);
        } 

    } 

}
