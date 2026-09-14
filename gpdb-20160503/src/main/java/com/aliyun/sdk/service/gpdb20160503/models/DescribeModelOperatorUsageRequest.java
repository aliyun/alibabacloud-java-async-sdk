// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gpdb20160503.models;

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
 * {@link DescribeModelOperatorUsageRequest} extends {@link RequestModel}
 *
 * <p>DescribeModelOperatorUsageRequest</p>
 */
public class DescribeModelOperatorUsageRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ApiKeyIds")
    private java.util.List<Integer> apiKeyIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EndTime")
    private String endTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("GroupBy")
    private String groupBy;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Keys")
    private java.util.List<String> keys;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ModelNames")
    private java.util.List<String> modelNames;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Period")
    private Integer period;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StartTime")
    private String startTime;

    private DescribeModelOperatorUsageRequest(Builder builder) {
        super(builder);
        this.apiKeyIds = builder.apiKeyIds;
        this.endTime = builder.endTime;
        this.groupBy = builder.groupBy;
        this.keys = builder.keys;
        this.modelNames = builder.modelNames;
        this.period = builder.period;
        this.startTime = builder.startTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeModelOperatorUsageRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return apiKeyIds
     */
    public java.util.List<Integer> getApiKeyIds() {
        return this.apiKeyIds;
    }

    /**
     * @return endTime
     */
    public String getEndTime() {
        return this.endTime;
    }

    /**
     * @return groupBy
     */
    public String getGroupBy() {
        return this.groupBy;
    }

    /**
     * @return keys
     */
    public java.util.List<String> getKeys() {
        return this.keys;
    }

    /**
     * @return modelNames
     */
    public java.util.List<String> getModelNames() {
        return this.modelNames;
    }

    /**
     * @return period
     */
    public Integer getPeriod() {
        return this.period;
    }

    /**
     * @return startTime
     */
    public String getStartTime() {
        return this.startTime;
    }

    public static final class Builder extends Request.Builder<DescribeModelOperatorUsageRequest, Builder> {
        private java.util.List<Integer> apiKeyIds; 
        private String endTime; 
        private String groupBy; 
        private java.util.List<String> keys; 
        private java.util.List<String> modelNames; 
        private Integer period; 
        private String startTime; 

        private Builder() {
            super();
        } 

        private Builder(DescribeModelOperatorUsageRequest request) {
            super(request);
            this.apiKeyIds = request.apiKeyIds;
            this.endTime = request.endTime;
            this.groupBy = request.groupBy;
            this.keys = request.keys;
            this.modelNames = request.modelNames;
            this.period = request.period;
            this.startTime = request.startTime;
        } 

        /**
         * <p>The list of API key IDs. Separate multiple IDs with commas (,). If this parameter is not specified, all API key IDs under the instance ID are used by default.</p>
         * <blockquote>
         * <p>The list can contain up to 50 items.</p>
         * </blockquote>
         */
        public Builder apiKeyIds(java.util.List<Integer> apiKeyIds) {
            String apiKeyIdsShrink = shrink(apiKeyIds, "ApiKeyIds", "simple");
            this.putQueryParameter("ApiKeyIds", apiKeyIdsShrink);
            this.apiKeyIds = apiKeyIds;
            return this;
        }

        /**
         * <p>The end time of the query. Specify the time in the <i>YYYY-MM-DDThh:mmZ</i> format (UTC).</p>
         * <blockquote>
         * <p>The end time must be later than the start time, and the interval between the start time and end time cannot exceed 7 days.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>2026-06-02T00:00Z</p>
         */
        public Builder endTime(String endTime) {
            this.putQueryParameter("EndTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * <p>The dimension by which to split the series. Separate multiple dimensions with commas (,). The order is not significant. Valid values:</p>
         * <ul>
         * <li>model (default): splits by model.</li>
         * <li>api_key: splits by API key.</li>
         * <li>model,api_key: splits by model and API key.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>model</p>
         */
        public Builder groupBy(String groupBy) {
            this.putQueryParameter("GroupBy", groupBy);
            this.groupBy = groupBy;
            return this;
        }

        /**
         * <p>The list of metrics. Separate multiple metrics with commas (,). Valid values:</p>
         * <ul>
         * <li>request_count: the number of requests.</li>
         * <li>success_count: the number of successful requests.</li>
         * <li>error_count: the number of failed requests.</li>
         * <li>success_rate: the request success rate.</li>
         * <li>input_token: the number of input tokens.</li>
         * <li>output_token: the number of output tokens.</li>
         * <li>total_token: the total number of tokens.</li>
         * </ul>
         */
        public Builder keys(java.util.List<String> keys) {
            String keysShrink = shrink(keys, "Keys", "simple");
            this.putQueryParameter("Keys", keysShrink);
            this.keys = keys;
            return this;
        }

        /**
         * <p>The list of model names. Separate multiple names with commas (,).</p>
         */
        public Builder modelNames(java.util.List<String> modelNames) {
            String modelNamesShrink = shrink(modelNames, "ModelNames", "simple");
            this.putQueryParameter("ModelNames", modelNamesShrink);
            this.modelNames = modelNames;
            return this;
        }

        /**
         * <p>The time bucket size in seconds. Valid values: 1, 5, 15, 60, 300, and 3600.</p>
         * <blockquote>
         * <ul>
         * <li><ol>
         * <li>If Period is not specified, the default value is determined by the following rules:</li>
         * </ol>
         * </li>
         * <li><ul>
         * <li>Window range ≤ 1 hour: Period = 1.</li>
         * </ul>
         * </li>
         * <li><ul>
         * <li>Window range ≤ 1 day: Period = 60.</li>
         * </ul>
         * </li>
         * <li><ul>
         * <li>Window range ≤ 7 days: Period = 60.</li>
         * </ul>
         * </li>
         * <li><ol start="2">
         * <li>When Period is set to 1, the window must be ≤ 1 day.</li>
         * </ol>
         * </li>
         * </ul>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder period(Integer period) {
            this.putQueryParameter("Period", period);
            this.period = period;
            return this;
        }

        /**
         * <p>The start time of the query. Specify the time in the <i>YYYY-MM-DDThh:mmZ</i> format (UTC).</p>
         * <blockquote>
         * <p>Only metrics within the last 30 days can be queried.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>2026-06-01T00:00Z</p>
         */
        public Builder startTime(String startTime) {
            this.putQueryParameter("StartTime", startTime);
            this.startTime = startTime;
            return this;
        }

        @Override
        public DescribeModelOperatorUsageRequest build() {
            return new DescribeModelOperatorUsageRequest(this);
        } 

    } 

}
