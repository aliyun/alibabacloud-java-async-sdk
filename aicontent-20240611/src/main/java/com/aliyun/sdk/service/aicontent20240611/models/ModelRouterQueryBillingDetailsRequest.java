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
 * {@link ModelRouterQueryBillingDetailsRequest} extends {@link RequestModel}
 *
 * <p>ModelRouterQueryBillingDetailsRequest</p>
 */
public class ModelRouterQueryBillingDetailsRequest extends Request {
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
    @com.aliyun.core.annotation.NameInMap("modelCodes")
    private String modelCodes;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("modelId")
    private Long modelId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("modelTypes")
    private String modelTypes;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("page")
    private Integer page;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("pageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("startTime")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long startTime;

    private ModelRouterQueryBillingDetailsRequest(Builder builder) {
        super(builder);
        this.apiKeyId = builder.apiKeyId;
        this.clientId = builder.clientId;
        this.clientIds = builder.clientIds;
        this.endTime = builder.endTime;
        this.modelCodes = builder.modelCodes;
        this.modelId = builder.modelId;
        this.modelTypes = builder.modelTypes;
        this.page = builder.page;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.startTime = builder.startTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModelRouterQueryBillingDetailsRequest create() {
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
     * @return modelCodes
     */
    public String getModelCodes() {
        return this.modelCodes;
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
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return startTime
     */
    public Long getStartTime() {
        return this.startTime;
    }

    public static final class Builder extends Request.Builder<ModelRouterQueryBillingDetailsRequest, Builder> {
        private Long apiKeyId; 
        private Long clientId; 
        private String clientIds; 
        private Long endTime; 
        private String modelCodes; 
        private Long modelId; 
        private String modelTypes; 
        private Integer page; 
        private Integer pageSize; 
        private String requestId; 
        private Long startTime; 

        private Builder() {
            super();
        } 

        private Builder(ModelRouterQueryBillingDetailsRequest request) {
            super(request);
            this.apiKeyId = request.apiKeyId;
            this.clientId = request.clientId;
            this.clientIds = request.clientIds;
            this.endTime = request.endTime;
            this.modelCodes = request.modelCodes;
            this.modelId = request.modelId;
            this.modelTypes = request.modelTypes;
            this.page = request.page;
            this.pageSize = request.pageSize;
            this.requestId = request.requestId;
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
         * modelCodes.
         */
        public Builder modelCodes(String modelCodes) {
            this.putQueryParameter("modelCodes", modelCodes);
            this.modelCodes = modelCodes;
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
         * page.
         */
        public Builder page(Integer page) {
            this.putQueryParameter("page", page);
            this.page = page;
            return this;
        }

        /**
         * pageSize.
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("pageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * requestId.
         */
        public Builder requestId(String requestId) {
            this.putQueryParameter("requestId", requestId);
            this.requestId = requestId;
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
        public ModelRouterQueryBillingDetailsRequest build() {
            return new ModelRouterQueryBillingDetailsRequest(this);
        } 

    } 

}
