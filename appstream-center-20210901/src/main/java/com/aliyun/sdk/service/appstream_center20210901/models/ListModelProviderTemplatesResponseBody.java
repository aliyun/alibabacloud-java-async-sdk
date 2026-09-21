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
 * {@link ListModelProviderTemplatesResponseBody} extends {@link TeaModel}
 *
 * <p>ListModelProviderTemplatesResponseBody</p>
 */
public class ListModelProviderTemplatesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private java.util.List<Data> data;

    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    private ListModelProviderTemplatesResponseBody(Builder builder) {
        this.data = builder.data;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListModelProviderTemplatesResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return data
     */
    public java.util.List<Data> getData() {
        return this.data;
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
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private java.util.List<Data> data; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private Integer totalCount; 

        private Builder() {
        } 

        private Builder(ListModelProviderTemplatesResponseBody model) {
            this.data = model.data;
            this.pageNumber = model.pageNumber;
            this.pageSize = model.pageSize;
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
        } 

        /**
         * <p>The list of returned data objects.</p>
         */
        public Builder data(java.util.List<Data> data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The page number of the current query result.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The number of entries per page in the query result.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1CBAFFAB-B697-4049-A9B1-67E1FC5F****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of query results.</p>
         * 
         * <strong>example:</strong>
         * <p>30</p>
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListModelProviderTemplatesResponseBody build() {
            return new ListModelProviderTemplatesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListModelProviderTemplatesResponseBody} extends {@link TeaModel}
     *
     * <p>ListModelProviderTemplatesResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Config")
        private String config;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("EnableWuyingProxy")
        private Boolean enableWuyingProxy;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("ProviderName")
        private String providerName;

        @com.aliyun.core.annotation.NameInMap("ProviderTemplateId")
        private String providerTemplateId;

        @com.aliyun.core.annotation.NameInMap("ProviderType")
        private String providerType;

        @com.aliyun.core.annotation.NameInMap("WuyingProviderKey")
        private String wuyingProviderKey;

        private Data(Builder builder) {
            this.config = builder.config;
            this.description = builder.description;
            this.enableWuyingProxy = builder.enableWuyingProxy;
            this.name = builder.name;
            this.providerName = builder.providerName;
            this.providerTemplateId = builder.providerTemplateId;
            this.providerType = builder.providerType;
            this.wuyingProviderKey = builder.wuyingProviderKey;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return config
         */
        public String getConfig() {
            return this.config;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return enableWuyingProxy
         */
        public Boolean getEnableWuyingProxy() {
            return this.enableWuyingProxy;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return providerName
         */
        public String getProviderName() {
            return this.providerName;
        }

        /**
         * @return providerTemplateId
         */
        public String getProviderTemplateId() {
            return this.providerTemplateId;
        }

        /**
         * @return providerType
         */
        public String getProviderType() {
            return this.providerType;
        }

        /**
         * @return wuyingProviderKey
         */
        public String getWuyingProviderKey() {
            return this.wuyingProviderKey;
        }

        public static final class Builder {
            private String config; 
            private String description; 
            private Boolean enableWuyingProxy; 
            private String name; 
            private String providerName; 
            private String providerTemplateId; 
            private String providerType; 
            private String wuyingProviderKey; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.config = model.config;
                this.description = model.description;
                this.enableWuyingProxy = model.enableWuyingProxy;
                this.name = model.name;
                this.providerName = model.providerName;
                this.providerTemplateId = model.providerTemplateId;
                this.providerType = model.providerType;
                this.wuyingProviderKey = model.wuyingProviderKey;
            } 

            /**
             * <p>The model provider configuration JSON object.</p>
             * 
             * <strong>example:</strong>
             * <p>{
             *     &quot;api&quot;: &quot;openai-completions&quot;,
             *     &quot;apiKey&quot;: &quot;sk-xxxx&quot;,
             *     &quot;baseUrl&quot;: &quot;<a href="https://dashscope.aliyuncs.com/compatible-mode/v1">https://dashscope.aliyuncs.com/compatible-mode/v1</a>&quot;
             * }</p>
             */
            public Builder config(String config) {
                this.config = config;
                return this;
            }

            /**
             * <p>The model provider template description.</p>
             * 
             * <strong>example:</strong>
             * <p>Alibaba Cloud Bailian provider</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>Indicates whether the WUYING secure gateway proxy is enabled.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder enableWuyingProxy(Boolean enableWuyingProxy) {
                this.enableWuyingProxy = enableWuyingProxy;
                return this;
            }

            /**
             * <p>The model provider template name.</p>
             * 
             * <strong>example:</strong>
             * <p>Alibaba Cloud Bailian</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The model provider name.</p>
             * 
             * <strong>example:</strong>
             * <p>bailian</p>
             */
            public Builder providerName(String providerName) {
                this.providerName = providerName;
                return this;
            }

            /**
             * <p>The model provider template ID.</p>
             * 
             * <strong>example:</strong>
             * <p>mpt-xxxx</p>
             */
            public Builder providerTemplateId(String providerTemplateId) {
                this.providerTemplateId = providerTemplateId;
                return this;
            }

            /**
             * <p>The model provider type.</p>
             * 
             * <strong>example:</strong>
             * <p>WuyingCredit</p>
             */
            public Builder providerType(String providerType) {
                this.providerType = providerType;
                return this;
            }

            /**
             * <p>The ProviderKey of the WUYING secure gateway proxy.</p>
             * 
             * <strong>example:</strong>
             * <p>wuying-key-12345</p>
             */
            public Builder wuyingProviderKey(String wuyingProviderKey) {
                this.wuyingProviderKey = wuyingProviderKey;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
