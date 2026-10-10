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
 * {@link ModelRouterQueryBillingRuleListResponseBody} extends {@link TeaModel}
 *
 * <p>ModelRouterQueryBillingRuleListResponseBody</p>
 */
public class ModelRouterQueryBillingRuleListResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("errCode")
    private String errCode;

    @com.aliyun.core.annotation.NameInMap("errMessage")
    private String errMessage;

    @com.aliyun.core.annotation.NameInMap("httpStatusCode")
    private Integer httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("maxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.NameInMap("nextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("success")
    private Boolean success;

    private ModelRouterQueryBillingRuleListResponseBody(Builder builder) {
        this.data = builder.data;
        this.errCode = builder.errCode;
        this.errMessage = builder.errMessage;
        this.httpStatusCode = builder.httpStatusCode;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModelRouterQueryBillingRuleListResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return errCode
     */
    public String getErrCode() {
        return this.errCode;
    }

    /**
     * @return errMessage
     */
    public String getErrMessage() {
        return this.errMessage;
    }

    /**
     * @return httpStatusCode
     */
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    /**
     * @return maxResults
     */
    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private Data data; 
        private String errCode; 
        private String errMessage; 
        private Integer httpStatusCode; 
        private Integer maxResults; 
        private String nextToken; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(ModelRouterQueryBillingRuleListResponseBody model) {
            this.data = model.data;
            this.errCode = model.errCode;
            this.errMessage = model.errMessage;
            this.httpStatusCode = model.httpStatusCode;
            this.maxResults = model.maxResults;
            this.nextToken = model.nextToken;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * <p>Response data</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>Error code</p>
         * 
         * <strong>example:</strong>
         * <p>UNKNOWN_ERROR</p>
         */
        public Builder errCode(String errCode) {
            this.errCode = errCode;
            return this;
        }

        /**
         * <p>Error message</p>
         * 
         * <strong>example:</strong>
         * <p>未知错误</p>
         */
        public Builder errMessage(String errMessage) {
            this.errMessage = errMessage;
            return this;
        }

        /**
         * <p>HTTP status code</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * <p>maxResults</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder maxResults(Integer maxResults) {
            this.maxResults = maxResults;
            return this;
        }

        /**
         * <p>nextToken</p>
         * 
         * <strong>example:</strong>
         * <p>xxxx-xxx-xxxxx</p>
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>Request ID</p>
         * 
         * <strong>example:</strong>
         * <p>xxxx-xxxx-xxxx-xxxxxxxx</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the request succeeded.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public ModelRouterQueryBillingRuleListResponseBody build() {
            return new ModelRouterQueryBillingRuleListResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ModelRouterQueryBillingRuleListResponseBody} extends {@link TeaModel}
     *
     * <p>ModelRouterQueryBillingRuleListResponseBody</p>
     */
    public static class List extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("billingType")
        private String billingType;

        @com.aliyun.core.annotation.NameInMap("deleteTag")
        private Integer deleteTag;

        @com.aliyun.core.annotation.NameInMap("effectiveTime")
        private String effectiveTime;

        @com.aliyun.core.annotation.NameInMap("expireTime")
        private String expireTime;

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

        @com.aliyun.core.annotation.NameInMap("pricingConfig")
        private Object pricingConfig;

        @com.aliyun.core.annotation.NameInMap("symbol")
        private String symbol;

        @com.aliyun.core.annotation.NameInMap("version")
        private Integer version;

        private List(Builder builder) {
            this.billingType = builder.billingType;
            this.deleteTag = builder.deleteTag;
            this.effectiveTime = builder.effectiveTime;
            this.expireTime = builder.expireTime;
            this.gmtCreate = builder.gmtCreate;
            this.gmtModified = builder.gmtModified;
            this.id = builder.id;
            this.modelCode = builder.modelCode;
            this.modelId = builder.modelId;
            this.modelName = builder.modelName;
            this.modelType = builder.modelType;
            this.pricingConfig = builder.pricingConfig;
            this.symbol = builder.symbol;
            this.version = builder.version;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static List create() {
            return builder().build();
        }

        /**
         * @return billingType
         */
        public String getBillingType() {
            return this.billingType;
        }

        /**
         * @return deleteTag
         */
        public Integer getDeleteTag() {
            return this.deleteTag;
        }

        /**
         * @return effectiveTime
         */
        public String getEffectiveTime() {
            return this.effectiveTime;
        }

        /**
         * @return expireTime
         */
        public String getExpireTime() {
            return this.expireTime;
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
         * @return pricingConfig
         */
        public Object getPricingConfig() {
            return this.pricingConfig;
        }

        /**
         * @return symbol
         */
        public String getSymbol() {
            return this.symbol;
        }

        /**
         * @return version
         */
        public Integer getVersion() {
            return this.version;
        }

        public static final class Builder {
            private String billingType; 
            private Integer deleteTag; 
            private String effectiveTime; 
            private String expireTime; 
            private String gmtCreate; 
            private String gmtModified; 
            private Long id; 
            private String modelCode; 
            private Long modelId; 
            private String modelName; 
            private String modelType; 
            private Object pricingConfig; 
            private String symbol; 
            private Integer version; 

            private Builder() {
            } 

            private Builder(List model) {
                this.billingType = model.billingType;
                this.deleteTag = model.deleteTag;
                this.effectiveTime = model.effectiveTime;
                this.expireTime = model.expireTime;
                this.gmtCreate = model.gmtCreate;
                this.gmtModified = model.gmtModified;
                this.id = model.id;
                this.modelCode = model.modelCode;
                this.modelId = model.modelId;
                this.modelName = model.modelName;
                this.modelType = model.modelType;
                this.pricingConfig = model.pricingConfig;
                this.symbol = model.symbol;
                this.version = model.version;
            } 

            /**
             * <p>Billing type</p>
             * 
             * <strong>example:</strong>
             * <p>token_tiered</p>
             */
            public Builder billingType(String billingType) {
                this.billingType = billingType;
                return this;
            }

            /**
             * <p>Delete marker</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder deleteTag(Integer deleteTag) {
                this.deleteTag = deleteTag;
                return this;
            }

            /**
             * <p>Effective time</p>
             * 
             * <strong>example:</strong>
             * <p>2024-01-01T00:00:00Z</p>
             */
            public Builder effectiveTime(String effectiveTime) {
                this.effectiveTime = effectiveTime;
                return this;
            }

            /**
             * <p>Expiration time</p>
             * 
             * <strong>example:</strong>
             * <p>2025-01-01T00:00:00Z</p>
             */
            public Builder expireTime(String expireTime) {
                this.expireTime = expireTime;
                return this;
            }

            /**
             * <p>Creation time</p>
             * 
             * <strong>example:</strong>
             * <p>2024-01-01T00:00:00Z</p>
             */
            public Builder gmtCreate(String gmtCreate) {
                this.gmtCreate = gmtCreate;
                return this;
            }

            /**
             * <p>Modification time</p>
             * 
             * <strong>example:</strong>
             * <p>2024-01-01T00:00:00Z</p>
             */
            public Builder gmtModified(String gmtModified) {
                this.gmtModified = gmtModified;
                return this;
            }

            /**
             * <p>Rule ID</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * <p>Model identifier</p>
             * 
             * <strong>example:</strong>
             * <p>qwen-plus</p>
             */
            public Builder modelCode(String modelCode) {
                this.modelCode = modelCode;
                return this;
            }

            /**
             * <p>Model ID</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder modelId(Long modelId) {
                this.modelId = modelId;
                return this;
            }

            /**
             * <p>Model name</p>
             * 
             * <strong>example:</strong>
             * <p>通义千问Plus</p>
             */
            public Builder modelName(String modelName) {
                this.modelName = modelName;
                return this;
            }

            /**
             * <p>Model type</p>
             * 
             * <strong>example:</strong>
             * <p>chat</p>
             */
            public Builder modelType(String modelType) {
                this.modelType = modelType;
                return this;
            }

            /**
             * <p>Billing configuration</p>
             * 
             * <strong>example:</strong>
             * <p>{}</p>
             */
            public Builder pricingConfig(Object pricingConfig) {
                this.pricingConfig = pricingConfig;
                return this;
            }

            /**
             * <p>Vendor identifier</p>
             * 
             * <strong>example:</strong>
             * <p>alibaba</p>
             */
            public Builder symbol(String symbol) {
                this.symbol = symbol;
                return this;
            }

            /**
             * <p>Version number</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder version(Integer version) {
                this.version = version;
                return this;
            }

            public List build() {
                return new List(this);
            } 

        } 

    }
    /**
     * 
     * {@link ModelRouterQueryBillingRuleListResponseBody} extends {@link TeaModel}
     *
     * <p>ModelRouterQueryBillingRuleListResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("list")
        private java.util.List<List> list;

        @com.aliyun.core.annotation.NameInMap("page")
        private Integer page;

        @com.aliyun.core.annotation.NameInMap("pageSize")
        private Integer pageSize;

        @com.aliyun.core.annotation.NameInMap("total")
        private Integer total;

        private Data(Builder builder) {
            this.list = builder.list;
            this.page = builder.page;
            this.pageSize = builder.pageSize;
            this.total = builder.total;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return list
         */
        public java.util.List<List> getList() {
            return this.list;
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
         * @return total
         */
        public Integer getTotal() {
            return this.total;
        }

        public static final class Builder {
            private java.util.List<List> list; 
            private Integer page; 
            private Integer pageSize; 
            private Integer total; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.list = model.list;
                this.page = model.page;
                this.pageSize = model.pageSize;
                this.total = model.total;
            } 

            /**
             * <p>List of billing rules</p>
             */
            public Builder list(java.util.List<List> list) {
                this.list = list;
                return this;
            }

            /**
             * <p>Current page number</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder page(Integer page) {
                this.page = page;
                return this;
            }

            /**
             * <p>Number of items per page</p>
             * 
             * <strong>example:</strong>
             * <p>20</p>
             */
            public Builder pageSize(Integer pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            /**
             * <p>Total number of records</p>
             * 
             * <strong>example:</strong>
             * <p>5</p>
             */
            public Builder total(Integer total) {
                this.total = total;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
