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
 * {@link RequestLogDTO} extends {@link TeaModel}
 *
 * <p>RequestLogDTO</p>
 */
public class RequestLogDTO extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("apiKeyId")
    private Long apiKeyId;

    @com.aliyun.core.annotation.NameInMap("clientId")
    private Long clientId;

    @com.aliyun.core.annotation.NameInMap("clientUuid")
    private String clientUuid;

    @com.aliyun.core.annotation.NameInMap("completionTokens")
    private Integer completionTokens;

    @com.aliyun.core.annotation.NameInMap("deleteTag")
    private Integer deleteTag;

    @com.aliyun.core.annotation.NameInMap("gmtCreate")
    private String gmtCreate;

    @com.aliyun.core.annotation.NameInMap("gmtModified")
    private String gmtModified;

    @com.aliyun.core.annotation.NameInMap("id")
    private Long id;

    @com.aliyun.core.annotation.NameInMap("modelCode")
    private String modelCode;

    @com.aliyun.core.annotation.NameInMap("modelId")
    private Long modelId;

    @com.aliyun.core.annotation.NameInMap("modelName")
    private String modelName;

    @com.aliyun.core.annotation.NameInMap("modelType")
    private String modelType;

    @com.aliyun.core.annotation.NameInMap("promptTokens")
    private Integer promptTokens;

    @com.aliyun.core.annotation.NameInMap("requestBody")
    private String requestBody;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("requestTime")
    private String requestTime;

    @com.aliyun.core.annotation.NameInMap("responseBody")
    private String responseBody;

    @com.aliyun.core.annotation.NameInMap("responseTimeMs")
    private Integer responseTimeMs;

    @com.aliyun.core.annotation.NameInMap("status")
    private String status;

    @com.aliyun.core.annotation.NameInMap("statusCode")
    private Integer statusCode;

    @com.aliyun.core.annotation.NameInMap("symbol")
    private String symbol;

    @com.aliyun.core.annotation.NameInMap("totalTokens")
    private Integer totalTokens;

    @com.aliyun.core.annotation.NameInMap("usage")
    private UsageInfoDTO usage;

    private RequestLogDTO(Builder builder) {
        this.apiKeyId = builder.apiKeyId;
        this.clientId = builder.clientId;
        this.clientUuid = builder.clientUuid;
        this.completionTokens = builder.completionTokens;
        this.deleteTag = builder.deleteTag;
        this.gmtCreate = builder.gmtCreate;
        this.gmtModified = builder.gmtModified;
        this.id = builder.id;
        this.modelCode = builder.modelCode;
        this.modelId = builder.modelId;
        this.modelName = builder.modelName;
        this.modelType = builder.modelType;
        this.promptTokens = builder.promptTokens;
        this.requestBody = builder.requestBody;
        this.requestId = builder.requestId;
        this.requestTime = builder.requestTime;
        this.responseBody = builder.responseBody;
        this.responseTimeMs = builder.responseTimeMs;
        this.status = builder.status;
        this.statusCode = builder.statusCode;
        this.symbol = builder.symbol;
        this.totalTokens = builder.totalTokens;
        this.usage = builder.usage;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RequestLogDTO create() {
        return builder().build();
    }

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
     * @return clientUuid
     */
    public String getClientUuid() {
        return this.clientUuid;
    }

    /**
     * @return completionTokens
     */
    public Integer getCompletionTokens() {
        return this.completionTokens;
    }

    /**
     * @return deleteTag
     */
    public Integer getDeleteTag() {
        return this.deleteTag;
    }

    /**
     * @return gmtCreate
     */
    public String getGmtCreate() {
        return this.gmtCreate;
    }

    /**
     * @return gmtModified
     */
    public String getGmtModified() {
        return this.gmtModified;
    }

    /**
     * @return id
     */
    public Long getId() {
        return this.id;
    }

    /**
     * @return modelCode
     */
    public String getModelCode() {
        return this.modelCode;
    }

    /**
     * @return modelId
     */
    public Long getModelId() {
        return this.modelId;
    }

    /**
     * @return modelName
     */
    public String getModelName() {
        return this.modelName;
    }

    /**
     * @return modelType
     */
    public String getModelType() {
        return this.modelType;
    }

    /**
     * @return promptTokens
     */
    public Integer getPromptTokens() {
        return this.promptTokens;
    }

    /**
     * @return requestBody
     */
    public String getRequestBody() {
        return this.requestBody;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return requestTime
     */
    public String getRequestTime() {
        return this.requestTime;
    }

    /**
     * @return responseBody
     */
    public String getResponseBody() {
        return this.responseBody;
    }

    /**
     * @return responseTimeMs
     */
    public Integer getResponseTimeMs() {
        return this.responseTimeMs;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * @return statusCode
     */
    public Integer getStatusCode() {
        return this.statusCode;
    }

    /**
     * @return symbol
     */
    public String getSymbol() {
        return this.symbol;
    }

    /**
     * @return totalTokens
     */
    public Integer getTotalTokens() {
        return this.totalTokens;
    }

    /**
     * @return usage
     */
    public UsageInfoDTO getUsage() {
        return this.usage;
    }

    public static final class Builder {
        private Long apiKeyId; 
        private Long clientId; 
        private String clientUuid; 
        private Integer completionTokens; 
        private Integer deleteTag; 
        private String gmtCreate; 
        private String gmtModified; 
        private Long id; 
        private String modelCode; 
        private Long modelId; 
        private String modelName; 
        private String modelType; 
        private Integer promptTokens; 
        private String requestBody; 
        private String requestId; 
        private String requestTime; 
        private String responseBody; 
        private Integer responseTimeMs; 
        private String status; 
        private Integer statusCode; 
        private String symbol; 
        private Integer totalTokens; 
        private UsageInfoDTO usage; 

        private Builder() {
        } 

        private Builder(RequestLogDTO model) {
            this.apiKeyId = model.apiKeyId;
            this.clientId = model.clientId;
            this.clientUuid = model.clientUuid;
            this.completionTokens = model.completionTokens;
            this.deleteTag = model.deleteTag;
            this.gmtCreate = model.gmtCreate;
            this.gmtModified = model.gmtModified;
            this.id = model.id;
            this.modelCode = model.modelCode;
            this.modelId = model.modelId;
            this.modelName = model.modelName;
            this.modelType = model.modelType;
            this.promptTokens = model.promptTokens;
            this.requestBody = model.requestBody;
            this.requestId = model.requestId;
            this.requestTime = model.requestTime;
            this.responseBody = model.responseBody;
            this.responseTimeMs = model.responseTimeMs;
            this.status = model.status;
            this.statusCode = model.statusCode;
            this.symbol = model.symbol;
            this.totalTokens = model.totalTokens;
            this.usage = model.usage;
        } 

        /**
         * apiKeyId.
         */
        public Builder apiKeyId(Long apiKeyId) {
            this.apiKeyId = apiKeyId;
            return this;
        }

        /**
         * clientId.
         */
        public Builder clientId(Long clientId) {
            this.clientId = clientId;
            return this;
        }

        /**
         * clientUuid.
         */
        public Builder clientUuid(String clientUuid) {
            this.clientUuid = clientUuid;
            return this;
        }

        /**
         * completionTokens.
         */
        public Builder completionTokens(Integer completionTokens) {
            this.completionTokens = completionTokens;
            return this;
        }

        /**
         * deleteTag.
         */
        public Builder deleteTag(Integer deleteTag) {
            this.deleteTag = deleteTag;
            return this;
        }

        /**
         * gmtCreate.
         */
        public Builder gmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }

        /**
         * gmtModified.
         */
        public Builder gmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }

        /**
         * id.
         */
        public Builder id(Long id) {
            this.id = id;
            return this;
        }

        /**
         * modelCode.
         */
        public Builder modelCode(String modelCode) {
            this.modelCode = modelCode;
            return this;
        }

        /**
         * modelId.
         */
        public Builder modelId(Long modelId) {
            this.modelId = modelId;
            return this;
        }

        /**
         * modelName.
         */
        public Builder modelName(String modelName) {
            this.modelName = modelName;
            return this;
        }

        /**
         * modelType.
         */
        public Builder modelType(String modelType) {
            this.modelType = modelType;
            return this;
        }

        /**
         * promptTokens.
         */
        public Builder promptTokens(Integer promptTokens) {
            this.promptTokens = promptTokens;
            return this;
        }

        /**
         * requestBody.
         */
        public Builder requestBody(String requestBody) {
            this.requestBody = requestBody;
            return this;
        }

        /**
         * requestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * requestTime.
         */
        public Builder requestTime(String requestTime) {
            this.requestTime = requestTime;
            return this;
        }

        /**
         * responseBody.
         */
        public Builder responseBody(String responseBody) {
            this.responseBody = responseBody;
            return this;
        }

        /**
         * responseTimeMs.
         */
        public Builder responseTimeMs(Integer responseTimeMs) {
            this.responseTimeMs = responseTimeMs;
            return this;
        }

        /**
         * status.
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        /**
         * statusCode.
         */
        public Builder statusCode(Integer statusCode) {
            this.statusCode = statusCode;
            return this;
        }

        /**
         * symbol.
         */
        public Builder symbol(String symbol) {
            this.symbol = symbol;
            return this;
        }

        /**
         * totalTokens.
         */
        public Builder totalTokens(Integer totalTokens) {
            this.totalTokens = totalTokens;
            return this;
        }

        /**
         * usage.
         */
        public Builder usage(UsageInfoDTO usage) {
            this.usage = usage;
            return this;
        }

        public RequestLogDTO build() {
            return new RequestLogDTO(this);
        } 

    } 

}
