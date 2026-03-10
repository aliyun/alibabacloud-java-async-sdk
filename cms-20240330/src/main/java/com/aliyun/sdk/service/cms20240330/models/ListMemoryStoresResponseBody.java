// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20240330.models;

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
 * {@link ListMemoryStoresResponseBody} extends {@link TeaModel}
 *
 * <p>ListMemoryStoresResponseBody</p>
 */
public class ListMemoryStoresResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("maxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.NameInMap("memoryStores")
    private java.util.List<MemoryStores> memoryStores;

    @com.aliyun.core.annotation.NameInMap("nextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    private ListMemoryStoresResponseBody(Builder builder) {
        this.maxResults = builder.maxResults;
        this.memoryStores = builder.memoryStores;
        this.nextToken = builder.nextToken;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListMemoryStoresResponseBody create() {
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
     * @return memoryStores
     */
    public java.util.List<MemoryStores> getMemoryStores() {
        return this.memoryStores;
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

    public static final class Builder {
        private Integer maxResults; 
        private java.util.List<MemoryStores> memoryStores; 
        private String nextToken; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(ListMemoryStoresResponseBody model) {
            this.maxResults = model.maxResults;
            this.memoryStores = model.memoryStores;
            this.nextToken = model.nextToken;
            this.requestId = model.requestId;
        } 

        /**
         * maxResults.
         */
        public Builder maxResults(Integer maxResults) {
            this.maxResults = maxResults;
            return this;
        }

        /**
         * memoryStores.
         */
        public Builder memoryStores(java.util.List<MemoryStores> memoryStores) {
            this.memoryStores = memoryStores;
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

        public ListMemoryStoresResponseBody build() {
            return new ListMemoryStoresResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListMemoryStoresResponseBody} extends {@link TeaModel}
     *
     * <p>ListMemoryStoresResponseBody</p>
     */
    public static class MemoryStores extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("createTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("memoryStoreName")
        private String memoryStoreName;

        @com.aliyun.core.annotation.NameInMap("regionId")
        private String regionId;

        @com.aliyun.core.annotation.NameInMap("updateTime")
        private String updateTime;

        @com.aliyun.core.annotation.NameInMap("workspace")
        private String workspace;

        private MemoryStores(Builder builder) {
            this.createTime = builder.createTime;
            this.description = builder.description;
            this.memoryStoreName = builder.memoryStoreName;
            this.regionId = builder.regionId;
            this.updateTime = builder.updateTime;
            this.workspace = builder.workspace;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static MemoryStores create() {
            return builder().build();
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return memoryStoreName
         */
        public String getMemoryStoreName() {
            return this.memoryStoreName;
        }

        /**
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
        }

        /**
         * @return updateTime
         */
        public String getUpdateTime() {
            return this.updateTime;
        }

        /**
         * @return workspace
         */
        public String getWorkspace() {
            return this.workspace;
        }

        public static final class Builder {
            private String createTime; 
            private String description; 
            private String memoryStoreName; 
            private String regionId; 
            private String updateTime; 
            private String workspace; 

            private Builder() {
            } 

            private Builder(MemoryStores model) {
                this.createTime = model.createTime;
                this.description = model.description;
                this.memoryStoreName = model.memoryStoreName;
                this.regionId = model.regionId;
                this.updateTime = model.updateTime;
                this.workspace = model.workspace;
            } 

            /**
             * <p>Use the UTC time format: yyyy-MM-ddTHH:mm:ssZ</p>
             * 
             * <strong>example:</strong>
             * <p>1764556182850</p>
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * memoryStoreName.
             */
            public Builder memoryStoreName(String memoryStoreName) {
                this.memoryStoreName = memoryStoreName;
                return this;
            }

            /**
             * regionId.
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * <p>Use the UTC time format: yyyy-MM-ddTHH:mm:ssZ</p>
             * 
             * <strong>example:</strong>
             * <p>1764556182850</p>
             */
            public Builder updateTime(String updateTime) {
                this.updateTime = updateTime;
                return this;
            }

            /**
             * workspace.
             */
            public Builder workspace(String workspace) {
                this.workspace = workspace;
                return this;
            }

            public MemoryStores build() {
                return new MemoryStores(this);
            } 

        } 

    }
}
