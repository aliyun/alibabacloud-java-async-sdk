// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aicontent20240611.models;

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
 * {@link ModelRouterQueryCostTrendMetricsRequest} extends {@link RequestModel}
 *
 * <p>ModelRouterQueryCostTrendMetricsRequest</p>
 */
public class ModelRouterQueryCostTrendMetricsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("apiKeyId")
    private Long apiKeyId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("clientId")
    private Long clientId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("clientIds")
    private String clientIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("endTime")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long endTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("granularity")
    private String granularity;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("maxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("memberUserIds")
    private String memberUserIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("modelTypes")
    private String modelTypes;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("nextToken")
    private String nextToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("startTime")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long startTime;

    private ModelRouterQueryCostTrendMetricsRequest(Builder builder) {
        super(builder);
        this.apiKeyId = builder.apiKeyId;
        this.clientId = builder.clientId;
        this.clientIds = builder.clientIds;
        this.endTime = builder.endTime;
        this.granularity = builder.granularity;
        this.maxResults = builder.maxResults;
        this.memberUserIds = builder.memberUserIds;
        this.modelTypes = builder.modelTypes;
        this.nextToken = builder.nextToken;
        this.startTime = builder.startTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModelRouterQueryCostTrendMetricsRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return apiKeyId
     */
    public Long getApiKeyId() {
        return this.apiKeyId;
    }

    /**
     * @return clientId
     */
    public Long getClientId() {
        return this.clientId;
    }

    /**
     * @return clientIds
     */
    public String getClientIds() {
        return this.clientIds;
    }

    /**
     * @return endTime
     */
    public Long getEndTime() {
        return this.endTime;
    }

    /**
     * @return granularity
     */
    public String getGranularity() {
        return this.granularity;
    }

    /**
     * @return maxResults
     */
    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * @return memberUserIds
     */
    public String getMemberUserIds() {
        return this.memberUserIds;
    }

    /**
     * @return modelTypes
     */
    public String getModelTypes() {
        return this.modelTypes;
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * @return startTime
     */
    public Long getStartTime() {
        return this.startTime;
    }

    public static final class Builder extends Request.Builder<ModelRouterQueryCostTrendMetricsRequest, Builder> {
        private Long apiKeyId; 
        private Long clientId; 
        private String clientIds; 
        private Long endTime; 
        private String granularity; 
        private Integer maxResults; 
        private String memberUserIds; 
        private String modelTypes; 
        private String nextToken; 
        private Long startTime; 

        private Builder() {
            super();
        } 

        private Builder(ModelRouterQueryCostTrendMetricsRequest request) {
            super(request);
            this.apiKeyId = request.apiKeyId;
            this.clientId = request.clientId;
            this.clientIds = request.clientIds;
            this.endTime = request.endTime;
            this.granularity = request.granularity;
            this.maxResults = request.maxResults;
            this.memberUserIds = request.memberUserIds;
            this.modelTypes = request.modelTypes;
            this.nextToken = request.nextToken;
            this.startTime = request.startTime;
        } 

        /**
         * <p>Optional. Filters by API Key ID. This parameter is linked to the department and requires clientId to be specified first.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        public Builder apiKeyId(Long apiKeyId) {
            this.putQueryParameter("apiKeyId", apiKeyId);
            this.apiKeyId = apiKeyId;
            return this;
        }

        /**
         * <p>The department ID used to filter results.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder clientId(Long clientId) {
            this.putQueryParameter("clientId", clientId);
            this.clientId = clientId;
            return this;
        }

        /**
         * <p>The list of department IDs, separated by commas. Supports querying data for multiple departments. This parameter is mutually exclusive with clientId.</p>
         * 
         * <strong>example:</strong>
         * <p>1,2,3</p>
         */
        public Builder clientIds(String clientIds) {
            this.putQueryParameter("clientIds", clientIds);
            this.clientIds = clientIds;
            return this;
        }

        /**
         * <p>The end time, as a UNIX timestamp in seconds.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1700086400</p>
         */
        public Builder endTime(Long endTime) {
            this.putQueryParameter("endTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * <p>The time granularity. Valid values:</p>
         * <ul>
         * <li>hourly</li>
         * <li>daily</li>
         * </ul>
         * <p>Default value: hourly.</p>
         * 
         * <strong>example:</strong>
         * <p>hourly</p>
         */
        public Builder granularity(String granularity) {
            this.putQueryParameter("granularity", granularity);
            this.granularity = granularity;
            return this;
        }

        /**
         * <p>The maximum number of results to return.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder maxResults(Integer maxResults) {
            this.putQueryParameter("maxResults", maxResults);
            this.maxResults = maxResults;
            return this;
        }

        /**
         * <p>Optional. Filters by member IDs, separated by commas. If not specified, data for the department and all its members is returned. If an empty value is specified, only department data without members is returned.</p>
         * 
         * <strong>example:</strong>
         * <p>30001,30002</p>
         */
        public Builder memberUserIds(String memberUserIds) {
            this.putQueryParameter("memberUserIds", memberUserIds);
            this.memberUserIds = memberUserIds;
            return this;
        }

        /**
         * <p>The model types, separated by commas.</p>
         * 
         * <strong>example:</strong>
         * <p>LLM,VL</p>
         */
        public Builder modelTypes(String modelTypes) {
            this.putQueryParameter("modelTypes", modelTypes);
            this.modelTypes = modelTypes;
            return this;
        }

        /**
         * <p>nextToken</p>
         * 
         * <strong>example:</strong>
         * <p>xxxx-xxx-xxxxx</p>
         */
        public Builder nextToken(String nextToken) {
            this.putQueryParameter("nextToken", nextToken);
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>The start time, as a UNIX timestamp in seconds.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1700000000</p>
         */
        public Builder startTime(Long startTime) {
            this.putQueryParameter("startTime", startTime);
            this.startTime = startTime;
            return this;
        }

        @Override
        public ModelRouterQueryCostTrendMetricsRequest build() {
            return new ModelRouterQueryCostTrendMetricsRequest(this);
        } 

    } 

}
