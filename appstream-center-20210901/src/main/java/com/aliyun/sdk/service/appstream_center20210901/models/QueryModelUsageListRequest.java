// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.appstream_center20210901.models;

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
 * {@link QueryModelUsageListRequest} extends {@link RequestModel}
 *
 * <p>QueryModelUsageListRequest</p>
 */
public class QueryModelUsageListRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BizType")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer bizType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EndDate")
    private String endDate;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Keyword")
    private String keyword;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Language")
    private String language;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ModelType")
    private String modelType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SortType")
    private String sortType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StartDate")
    private String startDate;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StatDateType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String statDateType;

    private QueryModelUsageListRequest(Builder builder) {
        super(builder);
        this.bizType = builder.bizType;
        this.endDate = builder.endDate;
        this.keyword = builder.keyword;
        this.language = builder.language;
        this.modelType = builder.modelType;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.sortType = builder.sortType;
        this.startDate = builder.startDate;
        this.statDateType = builder.statDateType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryModelUsageListRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return bizType
     */
    public Integer getBizType() {
        return this.bizType;
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
     * @return language
     */
    public String getLanguage() {
        return this.language;
    }

    /**
     * @return modelType
     */
    public String getModelType() {
        return this.modelType;
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
     * @return sortType
     */
    public String getSortType() {
        return this.sortType;
    }

    /**
     * @return startDate
     */
    public String getStartDate() {
        return this.startDate;
    }

    /**
     * @return statDateType
     */
    public String getStatDateType() {
        return this.statDateType;
    }

    public static final class Builder extends Request.Builder<QueryModelUsageListRequest, Builder> {
        private Integer bizType; 
        private String endDate; 
        private String keyword; 
        private String language; 
        private String modelType; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String sortType; 
        private String startDate; 
        private String statDateType; 

        private Builder() {
            super();
        } 

        private Builder(QueryModelUsageListRequest request) {
            super(request);
            this.bizType = request.bizType;
            this.endDate = request.endDate;
            this.keyword = request.keyword;
            this.language = request.language;
            this.modelType = request.modelType;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.sortType = request.sortType;
            this.startDate = request.startDate;
            this.statDateType = request.statDateType;
        } 

        /**
         * <p>The business type. This parameter is required and has no default value. The mapping between business types and values is as follows:</p>
         * <ul>
         * <li>1: Enterprise Edition.</li>
         * <li>10: Personal Edition.</li>
         * <li>20: Commercial Edition.</li>
         * <li>70: Agentic Computer.</li>
         * </ul>
         * <p><strong>The API directly queries the model usage of the current account based on the passed BizType and does not automatically convert or replace the business type.</strong> When querying the usage of the Agentic Computer business, you must explicitly pass BizType=70. Usage of different business types is counted separately.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder bizType(Integer bizType) {
            this.putQueryParameter("BizType", bizType);
            this.bizType = bizType;
            return this;
        }

        /**
         * <p>The end date of the custom query. The format is yyyy-MM-dd. It is interpreted as a natural day in Asia/Shanghai (UTC+8) and includes the current day. This value is a date string and does not contain hours, minutes, seconds, or time zone suffixes.</p>
         * <p><strong>This parameter can be passed only when StatDateType=1d, and it must be passed or omitted together with StartDate.</strong> The end date cannot be earlier than the start date. The total number of days, including the start and end dates, cannot exceed 90. When custom dates are not used, omit these two parameters directly. Do not pass empty strings or pure spaces.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-08-07</p>
         */
        public Builder endDate(String endDate) {
            this.putQueryParameter("EndDate", endDate);
            this.endDate = endDate;
            return this;
        }

        /**
         * <p>The keyword for the model name or model code. After removing leading and trailing spaces, a case-insensitive inclusion match is performed. It is not a regular expression. If this parameter is not passed or is completely blank, no filtering by keyword is performed. If it is passed together with ModelType, both conditions take effect simultaneously.</p>
         * <p>The translated display names of some models do not participate in name matching. To stably locate a model, we recommend that you use the returned LlmCode as the keyword.</p>
         * 
         * <strong>example:</strong>
         * <p>qwen</p>
         */
        public Builder keyword(String keyword) {
            this.putQueryParameter("Keyword", keyword);
            this.keyword = keyword;
            return this;
        }

        /**
         * <p>The model display language. Valid values:</p>
         * <ul>
         * <li>zh-CN: Simplified Chinese.</li>
         * <li>en-US: English.</li>
         * <li>ja-JP: Japanese.</li>
         * <li>zh-TW: Traditional Chinese.</li>
         * </ul>
         * <p>If this parameter is not passed, is blank, or has an unsupported value, zh-CN is used. It is also compatible with zh_CN, en_US, ja_JP, zh_TW, en, and ja. Case and leading or trailing spaces are ignored.</p>
         * <p>The returned content is not guaranteed to be entirely in the selected language. Some model names and descriptions are provided in Japanese or Traditional Chinese. For other model information, brands, and capability tags, English is used when ja-JP is selected, and Simplified Chinese is used when zh-TW is selected. If the corresponding translation is missing, the existing content is retained. If the model name is missing, the model code is returned.</p>
         * 
         * <strong>example:</strong>
         * <p>zh-CN</p>
         */
        public Builder language(String language) {
            this.putQueryParameter("Language", language);
            this.language = language;
            return this;
        }

        /**
         * <p>The model type filter condition. If this parameter is not passed or an empty string is passed, no filtering by type is performed. The value is case-insensitive:</p>
         * <ul>
         * <li>LLM: Large language model.</li>
         * <li>IMAGE: Image model.</li>
         * <li>VIDEO: Video model.</li>
         * <li>AUDIO: Audio model.</li>
         * <li>EMBEDDING: Embedding model.</li>
         * </ul>
         * <p>Non-empty values do not support leading or trailing spaces. Other non-empty values besides the preceding ones cause parameter validation to fail.</p>
         * 
         * <strong>example:</strong>
         * <p>LLM</p>
         */
        public Builder modelType(String modelType) {
            this.putQueryParameter("ModelType", modelType);
            this.modelType = modelType;
            return this;
        }

        /**
         * <p>The page number. It starts from 1 and the default value is 1. It must be an integer greater than or equal to 1. It is used together with PageSize for pagination. If the page number exceeds the range of the filtered results, an empty list is returned.</p>
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
         * <p>The maximum number of models returned per page. The default value is 10. Valid values: 1 to 100.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The sort order. If this parameter is not passed or is blank, the default value is CALL_COUNT_DESC. The value is case-sensitive, and non-empty values do not support leading or trailing spaces:</p>
         * <ul>
         * <li>CALL_COUNT_DESC: Sort by call count in descending order.</li>
         * <li>POINTS_CONSUMPTION_DESC: Sort by consumed points in descending order.</li>
         * <li>SUCCESS_RATE_ASC: Sort by call success rate in ascending order. Models with unavailable success rates are ranked last.</li>
         * <li>AVG_TTFT_DESC: Sort by average time to first token latency in descending order. Models with unavailable latency are ranked last.</li>
         * </ul>
         * <p>When sort values are the same, sort by model code LlmCode in ascending order. Filter and sort first, then paginate. Other non-empty values besides the preceding ones cause parameter validation to fail.</p>
         * 
         * <strong>example:</strong>
         * <p>CALL_COUNT_DESC</p>
         */
        public Builder sortType(String sortType) {
            this.putQueryParameter("SortType", sortType);
            this.sortType = sortType;
            return this;
        }

        /**
         * <p>The start date of the custom query. The format is yyyy-MM-dd. It is interpreted as a natural day in Asia/Shanghai (UTC+8) and includes the current day. This value is a date string and does not contain hours, minutes, seconds, or time zone suffixes.</p>
         * <p><strong>This parameter can be passed only when StatDateType=1d, and it must be passed or omitted together with EndDate.</strong> The start date cannot be later than the end date. The total number of days, including the start and end dates, must be between 1 and 90. If both are omitted, the cumulative usage for today is queried. When custom dates are not used, omit these two parameters directly. Do not pass empty strings or pure spaces.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-08-01</p>
         */
        public Builder startDate(String startDate) {
            this.putQueryParameter("StartDate", startDate);
            this.startDate = startDate;
            return this;
        }

        /**
         * <p>The statistical window. This parameter is required, has no default value, is case-sensitive, and does not support leading or trailing spaces. Time boundaries are calculated based on <strong>Asia/Shanghai (UTC+8)</strong>.</p>
         * <ul>
         * <li>24h: The last 24 hours up to the most recent available statistical cutoff time. The statistical cutoff time corresponds to the current hour or the previous hour.</li>
         * <li>1d: If no start and end dates are passed, the cumulative usage for today is queried. If both StartDate and EndDate are passed, the specified natural day range is queried.</li>
         * <li>1w: The last 7 days up to the day of the request. If the statistical results for the current day are unavailable, the results from the previous day are not used.</li>
         * <li>30d: The last 30 days up to the day of the request. If the statistical results for the current day are unavailable, the results from the previous day are not used.</li>
         * <li>1y: The statistical results for the last 365 days. If the results for the current year are unavailable, the statistical results for the previous year may be returned. The actual coverage range may be earlier than the day of the request. This API does not return the statistical cutoff time for this result, so you cannot use it to confirm whether the data has been updated to the current day.</li>
         * </ul>
         * <p><strong>Only 1d supports custom date ranges</strong>. Do not pass start and end dates for other windows.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1d</p>
         */
        public Builder statDateType(String statDateType) {
            this.putQueryParameter("StatDateType", statDateType);
            this.statDateType = statDateType;
            return this;
        }

        @Override
        public QueryModelUsageListRequest build() {
            return new QueryModelUsageListRequest(this);
        } 

    } 

}
