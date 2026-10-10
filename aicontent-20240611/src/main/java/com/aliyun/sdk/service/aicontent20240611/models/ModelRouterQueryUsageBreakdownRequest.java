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
 * {@link ModelRouterQueryUsageBreakdownRequest} extends {@link RequestModel}
 *
 * <p>ModelRouterQueryUsageBreakdownRequest</p>
 */
public class ModelRouterQueryUsageBreakdownRequest extends Request {
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
    @com.aliyun.core.annotation.Validation(required = true)
    private String granularity;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("maxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("memberUserIds")
    private String memberUserIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("nextToken")
    private String nextToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("page")
    private Integer page;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("pageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("startTime")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long startTime;

    private ModelRouterQueryUsageBreakdownRequest(Builder builder) {
        super(builder);
        this.apiKeyId = builder.apiKeyId;
        this.clientId = builder.clientId;
        this.clientIds = builder.clientIds;
        this.endTime = builder.endTime;
        this.granularity = builder.granularity;
        this.maxResults = builder.maxResults;
        this.memberUserIds = builder.memberUserIds;
        this.nextToken = builder.nextToken;
        this.page = builder.page;
        this.pageSize = builder.pageSize;
        this.startTime = builder.startTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModelRouterQueryUsageBreakdownRequest create() {
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
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * @return page
     */
    public Integer getPage() {
        return this.page;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return startTime
     */
    public Long getStartTime() {
        return this.startTime;
    }

    public static final class Builder extends Request.Builder<ModelRouterQueryUsageBreakdownRequest, Builder> {
        private Long apiKeyId; 
        private Long clientId; 
        private String clientIds; 
        private Long endTime; 
        private String granularity; 
        private Integer maxResults; 
        private String memberUserIds; 
        private String nextToken; 
        private Integer page; 
        private Integer pageSize; 
        private Long startTime; 

        private Builder() {
            super();
        } 

        private Builder(ModelRouterQueryUsageBreakdownRequest request) {
            super(request);
            this.apiKeyId = request.apiKeyId;
            this.clientId = request.clientId;
            this.clientIds = request.clientIds;
            this.endTime = request.endTime;
            this.granularity = request.granularity;
            this.maxResults = request.maxResults;
            this.memberUserIds = request.memberUserIds;
            this.nextToken = request.nextToken;
            this.page = request.page;
            this.pageSize = request.pageSize;
            this.startTime = request.startTime;
        } 

        /**
         * <p>Optional. Filters results by API key ID. This parameter is linked to the department and requires clientId to be specified first.</p>
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
         * <p>Optional. Filters results by department ID.</p>
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
         * <p>The query end time, in UNIX timestamp (seconds).</p>
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
         * <p>The aggregation granularity. Valid values: hourly and daily.</p>
         * <p>This parameter is required.</p>
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
         * <p>20</p>
         */
        public Builder maxResults(Integer maxResults) {
            this.putQueryParameter("maxResults", maxResults);
            this.maxResults = maxResults;
            return this;
        }

        /**
         * <p>Optional. Filters results by member IDs, separated by commas. If not specified, the department and all its members are included. If an empty value is passed, only the department is included without members.</p>
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
         * <p>The pagination token.</p>
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
         * <p>The page number. Default value: 1.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder page(Integer page) {
            this.putQueryParameter("page", page);
            this.page = page;
            return this;
        }

        /**
         * <p>The number of entries per page. Default value: 20. Maximum value: 500.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("pageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The query start time, in UNIX timestamp (seconds).</p>
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
        public ModelRouterQueryUsageBreakdownRequest build() {
            return new ModelRouterQueryUsageBreakdownRequest(this);
        } 

    } 

}
