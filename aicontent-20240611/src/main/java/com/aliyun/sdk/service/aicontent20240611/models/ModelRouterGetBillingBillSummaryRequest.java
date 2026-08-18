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
 * {@link ModelRouterGetBillingBillSummaryRequest} extends {@link RequestModel}
 *
 * <p>ModelRouterGetBillingBillSummaryRequest</p>
 */
public class ModelRouterGetBillingBillSummaryRequest extends Request {
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
    @com.aliyun.core.annotation.NameInMap("maxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("memberUserIds")
    private String memberUserIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("modelId")
    private Long modelId;

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

    private ModelRouterGetBillingBillSummaryRequest(Builder builder) {
        super(builder);
        this.apiKeyId = builder.apiKeyId;
        this.clientId = builder.clientId;
        this.clientIds = builder.clientIds;
        this.endTime = builder.endTime;
        this.maxResults = builder.maxResults;
        this.memberUserIds = builder.memberUserIds;
        this.modelId = builder.modelId;
        this.modelTypes = builder.modelTypes;
        this.nextToken = builder.nextToken;
        this.startTime = builder.startTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModelRouterGetBillingBillSummaryRequest create() {
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
     * @return modelId
     */
    public Long getModelId() {
        return this.modelId;
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

    public static final class Builder extends Request.Builder<ModelRouterGetBillingBillSummaryRequest, Builder> {
        private Long apiKeyId; 
        private Long clientId; 
        private String clientIds; 
        private Long endTime; 
        private Integer maxResults; 
        private String memberUserIds; 
        private Long modelId; 
        private String modelTypes; 
        private String nextToken; 
        private Long startTime; 

        private Builder() {
            super();
        } 

        private Builder(ModelRouterGetBillingBillSummaryRequest request) {
            super(request);
            this.apiKeyId = request.apiKeyId;
            this.clientId = request.clientId;
            this.clientIds = request.clientIds;
            this.endTime = request.endTime;
            this.maxResults = request.maxResults;
            this.memberUserIds = request.memberUserIds;
            this.modelId = request.modelId;
            this.modelTypes = request.modelTypes;
            this.nextToken = request.nextToken;
            this.startTime = request.startTime;
        } 

        /**
         * apiKeyId.
         */
        public Builder apiKeyId(Long apiKeyId) {
            this.putQueryParameter("apiKeyId", apiKeyId);
            this.apiKeyId = apiKeyId;
            return this;
        }

        /**
         * clientId.
         */
        public Builder clientId(Long clientId) {
            this.putQueryParameter("clientId", clientId);
            this.clientId = clientId;
            return this;
        }

        /**
         * clientIds.
         */
        public Builder clientIds(String clientIds) {
            this.putQueryParameter("clientIds", clientIds);
            this.clientIds = clientIds;
            return this;
        }

        /**
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
         * maxResults.
         */
        public Builder maxResults(Integer maxResults) {
            this.putQueryParameter("maxResults", maxResults);
            this.maxResults = maxResults;
            return this;
        }

        /**
         * memberUserIds.
         */
        public Builder memberUserIds(String memberUserIds) {
            this.putQueryParameter("memberUserIds", memberUserIds);
            this.memberUserIds = memberUserIds;
            return this;
        }

        /**
         * modelId.
         */
        public Builder modelId(Long modelId) {
            this.putQueryParameter("modelId", modelId);
            this.modelId = modelId;
            return this;
        }

        /**
         * modelTypes.
         */
        public Builder modelTypes(String modelTypes) {
            this.putQueryParameter("modelTypes", modelTypes);
            this.modelTypes = modelTypes;
            return this;
        }

        /**
         * nextToken.
         */
        public Builder nextToken(String nextToken) {
            this.putQueryParameter("nextToken", nextToken);
            this.nextToken = nextToken;
            return this;
        }

        /**
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
        public ModelRouterGetBillingBillSummaryRequest build() {
            return new ModelRouterGetBillingBillSummaryRequest(this);
        } 

    } 

}
