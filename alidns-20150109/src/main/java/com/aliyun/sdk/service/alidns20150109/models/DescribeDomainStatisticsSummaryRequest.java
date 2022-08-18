// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alidns20150109.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDomainStatisticsSummaryRequest} extends {@link RequestModel}
 *
 * <p>DescribeDomainStatisticsSummaryRequest</p>
 */
public class DescribeDomainStatisticsSummaryRequest extends Request {
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
    private Long pageNumber;

    @Query
    @NameInMap("PageSize")
    @Validation(maximum = 100, minimum = 1)
    private Long pageSize;

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

    private DescribeDomainStatisticsSummaryRequest(Builder builder) {
        super(builder);
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

    public static DescribeDomainStatisticsSummaryRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
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

    public static final class Builder extends Request.Builder<DescribeDomainStatisticsSummaryRequest, Builder> {
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

        private Builder(DescribeDomainStatisticsSummaryRequest request) {
            super(request);
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
         * EndDate.
         */
        public Builder endDate(String endDate) {
            this.putQueryParameter("EndDate", endDate);
            this.endDate = endDate;
            return this;
        }

        /**
         * Keyword.
         */
        public Builder keyword(String keyword) {
            this.putQueryParameter("Keyword", keyword);
            this.keyword = keyword;
            return this;
        }

        /**
         * Lang.
         */
        public Builder lang(String lang) {
            this.putQueryParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        /**
         * PageNumber.
         */
        public Builder pageNumber(Long pageNumber) {
            this.putQueryParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(Long pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * SearchMode.
         */
        public Builder searchMode(String searchMode) {
            this.putQueryParameter("SearchMode", searchMode);
            this.searchMode = searchMode;
            return this;
        }

        /**
         * StartDate.
         */
        public Builder startDate(String startDate) {
            this.putQueryParameter("StartDate", startDate);
            this.startDate = startDate;
            return this;
        }

        /**
         * Threshold.
         */
        public Builder threshold(Long threshold) {
            this.putQueryParameter("Threshold", threshold);
            this.threshold = threshold;
            return this;
        }

        @Override
        public DescribeDomainStatisticsSummaryRequest build() {
            return new DescribeDomainStatisticsSummaryRequest(this);
        } 

    } 

}
