// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rdsai20250507.models;

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
 * {@link ListCustomAgentResponseBody} extends {@link TeaModel}
 *
 * <p>ListCustomAgentResponseBody</p>
 */
public class ListCustomAgentResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private java.util.List<Data> data;

    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Long pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Long pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    private ListCustomAgentResponseBody(Builder builder) {
        this.data = builder.data;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListCustomAgentResponseBody create() {
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
    public Long getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public Long getPageSize() {
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
        private Long pageNumber; 
        private Long pageSize; 
        private String requestId; 
        private Integer totalCount; 

        private Builder() {
        } 

        private Builder(ListCustomAgentResponseBody model) {
            this.data = model.data;
            this.pageNumber = model.pageNumber;
            this.pageSize = model.pageSize;
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
        } 

        /**
         * <p>The returned data.</p>
         */
        public Builder data(java.util.List<Data> data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The page number of the returned page.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Long pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The number of entries returned on each page.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(Long pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>FE9C65D7-930F-57A5-A207-8C396329****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of entries returned. By default, this parameter is not returned.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListCustomAgentResponseBody build() {
            return new ListCustomAgentResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListCustomAgentResponseBody} extends {@link TeaModel}
     *
     * <p>ListCustomAgentResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CreatedAt")
        private String createdAt;

        @com.aliyun.core.annotation.NameInMap("EnableTools")
        private Boolean enableTools;

        @com.aliyun.core.annotation.NameInMap("Id")
        private String id;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("SystemPrompt")
        private String systemPrompt;

        @com.aliyun.core.annotation.NameInMap("Tools")
        private java.util.List<String> tools;

        @com.aliyun.core.annotation.NameInMap("UpdatedAt")
        private String updatedAt;

        private Data(Builder builder) {
            this.createdAt = builder.createdAt;
            this.enableTools = builder.enableTools;
            this.id = builder.id;
            this.name = builder.name;
            this.systemPrompt = builder.systemPrompt;
            this.tools = builder.tools;
            this.updatedAt = builder.updatedAt;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return createdAt
         */
        public String getCreatedAt() {
            return this.createdAt;
        }

        /**
         * @return enableTools
         */
        public Boolean getEnableTools() {
            return this.enableTools;
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return systemPrompt
         */
        public String getSystemPrompt() {
            return this.systemPrompt;
        }

        /**
         * @return tools
         */
        public java.util.List<String> getTools() {
            return this.tools;
        }

        /**
         * @return updatedAt
         */
        public String getUpdatedAt() {
            return this.updatedAt;
        }

        public static final class Builder {
            private String createdAt; 
            private Boolean enableTools; 
            private String id; 
            private String name; 
            private String systemPrompt; 
            private java.util.List<String> tools; 
            private String updatedAt; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.createdAt = model.createdAt;
                this.enableTools = model.enableTools;
                this.id = model.id;
                this.name = model.name;
                this.systemPrompt = model.systemPrompt;
                this.tools = model.tools;
                this.updatedAt = model.updatedAt;
            } 

            /**
             * <p>The creation time of the agent.</p>
             * 
             * <strong>example:</strong>
             * <p>2020-11-27 16:01:28</p>
             */
            public Builder createdAt(String createdAt) {
                this.createdAt = createdAt;
                return this;
            }

            /**
             * <p>Indicates whether tools are enabled.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder enableTools(Boolean enableTools) {
                this.enableTools = enableTools;
                return this;
            }

            /**
             * <p>The ID of the agent.</p>
             * 
             * <strong>example:</strong>
             * <p>d1b7d639-f34e-44c7-8231-987da14d****</p>
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * <p>The name of the dedicated agent.</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The system prompts.</p>
             */
            public Builder systemPrompt(String systemPrompt) {
                this.systemPrompt = systemPrompt;
                return this;
            }

            /**
             * <p>The information about the tool.</p>
             */
            public Builder tools(java.util.List<String> tools) {
                this.tools = tools;
                return this;
            }

            /**
             * <p>The modification time of the agent.</p>
             * 
             * <strong>example:</strong>
             * <p>2020-11-27 16:02:28</p>
             */
            public Builder updatedAt(String updatedAt) {
                this.updatedAt = updatedAt;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
