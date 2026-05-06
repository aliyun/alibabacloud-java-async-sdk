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
 * {@link ListModelTemplatesResponseBody} extends {@link TeaModel}
 *
 * <p>ListModelTemplatesResponseBody</p>
 */
public class ListModelTemplatesResponseBody extends TeaModel {
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

    private ListModelTemplatesResponseBody(Builder builder) {
        this.data = builder.data;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListModelTemplatesResponseBody create() {
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

        private Builder(ListModelTemplatesResponseBody model) {
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

        public ListModelTemplatesResponseBody build() {
            return new ListModelTemplatesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListModelTemplatesResponseBody} extends {@link TeaModel}
     *
     * <p>ListModelTemplatesResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AgentProvider")
        private String agentProvider;

        @com.aliyun.core.annotation.NameInMap("Config")
        private String config;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("HasModel")
        private Boolean hasModel;

        @com.aliyun.core.annotation.NameInMap("ModelTemplateId")
        private String modelTemplateId;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        private Data(Builder builder) {
            this.agentProvider = builder.agentProvider;
            this.config = builder.config;
            this.description = builder.description;
            this.hasModel = builder.hasModel;
            this.modelTemplateId = builder.modelTemplateId;
            this.name = builder.name;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return agentProvider
         */
        public String getAgentProvider() {
            return this.agentProvider;
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
         * @return hasModel
         */
        public Boolean getHasModel() {
            return this.hasModel;
        }

        /**
         * @return modelTemplateId
         */
        public String getModelTemplateId() {
            return this.modelTemplateId;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        public static final class Builder {
            private String agentProvider; 
            private String config; 
            private String description; 
            private Boolean hasModel; 
            private String modelTemplateId; 
            private String name; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.agentProvider = model.agentProvider;
                this.config = model.config;
                this.description = model.description;
                this.hasModel = model.hasModel;
                this.modelTemplateId = model.modelTemplateId;
                this.name = model.name;
            } 

            /**
             * AgentProvider.
             */
            public Builder agentProvider(String agentProvider) {
                this.agentProvider = agentProvider;
                return this;
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
             * HasModel.
             */
            public Builder hasModel(Boolean hasModel) {
                this.hasModel = hasModel;
                return this;
            }

            /**
             * ModelTemplateId.
             */
            public Builder modelTemplateId(String modelTemplateId) {
                this.modelTemplateId = modelTemplateId;
                return this;
            }

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
