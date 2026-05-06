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
 * {@link ListLlmTemplatesResponseBody} extends {@link TeaModel}
 *
 * <p>ListLlmTemplatesResponseBody</p>
 */
public class ListLlmTemplatesResponseBody extends TeaModel {
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

    private ListLlmTemplatesResponseBody(Builder builder) {
        this.data = builder.data;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListLlmTemplatesResponseBody create() {
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

        private Builder(ListLlmTemplatesResponseBody model) {
            this.data = model.data;
            this.pageNumber = model.pageNumber;
            this.pageSize = model.pageSize;
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
        } 

        /**
         * Data.
         */
        public Builder data(java.util.List<Data> data) {
            this.data = data;
            return this;
        }

        /**
         * PageNumber.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * TotalCount.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListLlmTemplatesResponseBody build() {
            return new ListLlmTemplatesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListLlmTemplatesResponseBody} extends {@link TeaModel}
     *
     * <p>ListLlmTemplatesResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Config")
        private String config;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("IsDefaultModel")
        private Boolean isDefaultModel;

        @com.aliyun.core.annotation.NameInMap("LlmCode")
        private String llmCode;

        @com.aliyun.core.annotation.NameInMap("LlmTemplateId")
        private String llmTemplateId;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("ProviderTemplateId")
        private String providerTemplateId;

        private Data(Builder builder) {
            this.config = builder.config;
            this.description = builder.description;
            this.isDefaultModel = builder.isDefaultModel;
            this.llmCode = builder.llmCode;
            this.llmTemplateId = builder.llmTemplateId;
            this.name = builder.name;
            this.providerTemplateId = builder.providerTemplateId;
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
         * @return isDefaultModel
         */
        public Boolean getIsDefaultModel() {
            return this.isDefaultModel;
        }

        /**
         * @return llmCode
         */
        public String getLlmCode() {
            return this.llmCode;
        }

        /**
         * @return llmTemplateId
         */
        public String getLlmTemplateId() {
            return this.llmTemplateId;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return providerTemplateId
         */
        public String getProviderTemplateId() {
            return this.providerTemplateId;
        }

        public static final class Builder {
            private String config; 
            private String description; 
            private Boolean isDefaultModel; 
            private String llmCode; 
            private String llmTemplateId; 
            private String name; 
            private String providerTemplateId; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.config = model.config;
                this.description = model.description;
                this.isDefaultModel = model.isDefaultModel;
                this.llmCode = model.llmCode;
                this.llmTemplateId = model.llmTemplateId;
                this.name = model.name;
                this.providerTemplateId = model.providerTemplateId;
            } 

            /**
             * Config.
             */
            public Builder config(String config) {
                this.config = config;
                return this;
            }

            /**
             * Description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * IsDefaultModel.
             */
            public Builder isDefaultModel(Boolean isDefaultModel) {
                this.isDefaultModel = isDefaultModel;
                return this;
            }

            /**
             * LlmCode.
             */
            public Builder llmCode(String llmCode) {
                this.llmCode = llmCode;
                return this;
            }

            /**
             * LlmTemplateId.
             */
            public Builder llmTemplateId(String llmTemplateId) {
                this.llmTemplateId = llmTemplateId;
                return this;
            }

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * ProviderTemplateId.
             */
            public Builder providerTemplateId(String providerTemplateId) {
                this.providerTemplateId = providerTemplateId;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
