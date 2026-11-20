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
         * <p>The business type. This parameter is required and has no default value. The mapping between business types and valid values is as follows:</p>
         * <ul>
         * <li><code>1</code>: Enterprise Edition.</li>
         * <li><code>10</code>: Personal Edition.</li>
         * <li><code>20</code>: Commercial Edition.</li>
         * <li><code>70</code>: Agentic Computer.</li>
         * </ul>
         * <p><strong>The API operation directly queries the model usage of the current account based on the passed <code>BizType</code> and does not automatically convert or replace the business type.</strong> When querying the usage of the Agentic Computer business, you must explicitly pass <code>BizType=70</code>. The usage of different business types is counted separately.</p>
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
         * <p>The end date of the custom query. The format is <code>yyyy-MM-dd</code>. It is interpreted as a calendar day in the Asia/Shanghai (UTC+8) time zone and includes the current day. The value is a date string and does not contain hours, minutes, seconds, or a time zone suffix.</p>
         * <p><strong>This parameter can be passed only when <code>StatDateType</code> is set to <code>1d</code>, and it must be passed or omitted together with <code>StartDate</code>.</strong> The end date cannot be earlier than the start date. The total number of days, including the start and end dates, must not exceed 90. When custom dates are not used, omit these two parameters directly. Do not pass empty strings or pure whitespace.</p>
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
         * <p>The keyword for the model name or model code. After leading and trailing whitespace is removed, a case-insensitive inclusion match is performed. It is not a regular expression. If this parameter is not passed or is completely whitespace, no filtering by keyword is performed. If it is passed together with <code>ModelType</code>, both conditions take effect simultaneously.</p>
         * <p>The translated display names of some models do not participate in name matching. When you need to stably locate a model, we recommend that you use the returned <code>LlmCode</code> as the keyword.</p>
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
         * <p>The display language for models. Valid values:</p>
         * <ul>
         * <li><code>zh-CN</code>: Simplified Chinese.</li>
         * <li><code>en-US</code>: English.</li>
         * <li><code>ja-JP</code>: Japanese.</li>
         * <li><code>zh-TW</code>: Traditional Chinese.</li>
         * </ul>
         * <p>If this parameter is not passed, is empty, or is an unsupported value, <code>zh-CN</code> is used. It is also compatible with <code>zh_CN</code>, <code>en_US</code>, <code>ja_JP</code>, <code>zh_TW</code>, <code>en</code>, and <code>ja</code>, ignoring case and leading or trailing whitespace.</p>
         * <p>The returned content is not guaranteed to be entirely in the selected language. Some model names and descriptions are provided in Japanese or Traditional Chinese. For other model information, brands, and capability tags, English is used when <code>ja-JP</code> is selected, and Simplified Chinese is used when <code>zh-TW</code> is selected. If the corresponding translation is missing, the existing content is retained. If the model name is missing, the model code is returned.</p>
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
         * <li><code>LLM</code>: Large language model.</li>
         * <li><code>IMAGE</code>: Image model.</li>
         * <li><code>VIDEO</code>: Video model.</li>
         * <li><code>AUDIO</code>: Audio model.</li>
         * <li><code>EMBEDDING</code>: Embedding model.</li>
         * </ul>
         * <p>Non-empty values do not support leading or trailing spaces. Non-empty values other than the preceding values cause parameter validation to fail.</p>
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
         * <p>The page number. It starts from <code>1</code> and the default value is <code>1</code>. It must be an integer greater than or equal to 1. It is used together with <code>PageSize</code> for pagination. If the page number exceeds the range of the filtered results, an empty list is returned.</p>
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
         * <p>The maximum number of models to return per page. The default value is <code>10</code>. Valid values: <code>1</code> to <code>100</code>.</p>
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
         * <p>The sorting method. If this parameter is not passed or is empty, the default value is <code>CALL_COUNT_DESC</code>. The value is case-sensitive, and non-empty values do not support leading or trailing spaces:</p>
         * <ul>
         * <li><code>CALL_COUNT_DESC</code>: Sort by call count in descending order.</li>
         * <li><code>POINTS_CONSUMPTION_DESC</code>: Sort by consumed points in descending order.</li>
         * <li><code>SUCCESS_RATE_ASC</code>: Sort by call success rate in ascending order. Models with unavailable success rates are ranked last.</li>
         * <li><code>AVG_TTFT_DESC</code>: Sort by average time to first token (TTFT) latency in descending order. Models with unavailable latency are ranked last.</li>
         * </ul>
         * <p>When sorting values are the same, sort by model code <code>LlmCode</code> in ascending order. Filtering and sorting are performed before pagination. Non-empty values other than the preceding values cause parameter validation to fail.</p>
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
         * <p>The start date of the custom query. The format is <code>yyyy-MM-dd</code>. It is interpreted as a calendar day in the Asia/Shanghai (UTC+8) time zone and includes the current day. The value is a date string and does not contain hours, minutes, seconds, or a time zone suffix.</p>
         * <p><strong>This parameter can be passed only when <code>StatDateType</code> is set to <code>1d</code>, and it must be passed or omitted together with <code>EndDate</code>.</strong> The start date cannot be later than the end date. The total number of days, including the start and end dates, must be between 1 and 90. If both are omitted, the cumulative usage for today is queried. When custom dates are not used, omit these two parameters directly. Do not pass empty strings or pure whitespace.</p>
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
         * <li><code>24h</code>: The last 24 hours up to the most recent available statistical cutoff time. The statistical cutoff time corresponds to the current hour or the previous hour.</li>
         * <li><code>1d</code>: If the start and end dates are not passed, the cumulative usage for today is queried. If both <code>StartDate</code> and <code>EndDate</code> are passed, the specified calendar day range is queried.</li>
         * <li><code>1w</code>: The last 7 days up to the day of the request. If the statistical results for the current day are unavailable, the results from the previous day are not used.</li>
         * <li><code>30d</code>: The last 30 days up to the day of the request. If the statistical results for the current day are unavailable, the results from the previous day are not used.</li>
         * <li><code>1y</code>: The statistical results for the last 365 days. If the results for the current year are unavailable, the statistical results for the previous year may be returned, and the actual coverage range may be earlier than the day of the request. This API operation does not return the statistical cutoff time for this result, so you cannot use it to confirm whether the data has been updated to the current day.</li>
         * </ul>
         * <p><strong>Only <code>1d</code> supports custom date ranges</strong>. Do not pass start and end dates for other windows.</p>
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
