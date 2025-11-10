// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.openapiexplorer20241130.models;

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
 * {@link ListApiMcpServerSystemToolsResponseBody} extends {@link TeaModel}
 *
 * <p>ListApiMcpServerSystemToolsResponseBody</p>
 */
public class ListApiMcpServerSystemToolsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("maxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.NameInMap("nextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("systemTools")
    private java.util.List<SystemTools> systemTools;

    @com.aliyun.core.annotation.NameInMap("totalCount")
    private Integer totalCount;

    private ListApiMcpServerSystemToolsResponseBody(Builder builder) {
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.requestId = builder.requestId;
        this.systemTools = builder.systemTools;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListApiMcpServerSystemToolsResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
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
     * @return systemTools
     */
    public java.util.List<SystemTools> getSystemTools() {
        return this.systemTools;
    }

    /**
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private Integer maxResults; 
        private String nextToken; 
        private String requestId; 
        private java.util.List<SystemTools> systemTools; 
        private Integer totalCount; 

        private Builder() {
        } 

        private Builder(ListApiMcpServerSystemToolsResponseBody model) {
            this.maxResults = model.maxResults;
            this.nextToken = model.nextToken;
            this.requestId = model.requestId;
            this.systemTools = model.systemTools;
            this.totalCount = model.totalCount;
        } 

        /**
         * maxResults.
         */
        public Builder maxResults(Integer maxResults) {
            this.maxResults = maxResults;
            return this;
        }

        /**
         * nextToken.
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
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
         * systemTools.
         */
        public Builder systemTools(java.util.List<SystemTools> systemTools) {
            this.systemTools = systemTools;
            return this;
        }

        /**
         * totalCount.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListApiMcpServerSystemToolsResponseBody build() {
            return new ListApiMcpServerSystemToolsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListApiMcpServerSystemToolsResponseBody} extends {@link TeaModel}
     *
     * <p>ListApiMcpServerSystemToolsResponseBody</p>
     */
    public static class SystemTools extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("name")
        private String name;

        private SystemTools(Builder builder) {
            this.description = builder.description;
            this.name = builder.name;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SystemTools create() {
            return builder().build();
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        public static final class Builder {
            private String description; 
            private String name; 

            private Builder() {
            } 

            private Builder(SystemTools model) {
                this.description = model.description;
                this.name = model.name;
            } 

            /**
             * description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            public SystemTools build() {
                return new SystemTools(this);
            } 

        } 

    }
}
