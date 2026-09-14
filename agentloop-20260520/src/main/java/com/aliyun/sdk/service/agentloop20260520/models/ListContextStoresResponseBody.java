// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.agentloop20260520.models;

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
 * {@link ListContextStoresResponseBody} extends {@link TeaModel}
 *
 * <p>ListContextStoresResponseBody</p>
 */
public class ListContextStoresResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("maxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.NameInMap("nextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("results")
    private java.util.List<Results> results;

    @com.aliyun.core.annotation.NameInMap("total")
    private Integer total;

    private ListContextStoresResponseBody(Builder builder) {
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.requestId = builder.requestId;
        this.results = builder.results;
        this.total = builder.total;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListContextStoresResponseBody create() {
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
     * @return results
     */
    public java.util.List<Results> getResults() {
        return this.results;
    }

    /**
     * @return total
     */
    public Integer getTotal() {
        return this.total;
    }

    public static final class Builder {
        private Integer maxResults; 
        private String nextToken; 
        private String requestId; 
        private java.util.List<Results> results; 
        private Integer total; 

        private Builder() {
        } 

        private Builder(ListContextStoresResponseBody model) {
            this.maxResults = model.maxResults;
            this.nextToken = model.nextToken;
            this.requestId = model.requestId;
            this.results = model.results;
            this.total = model.total;
        } 

        /**
         * <p>The maximum number of entries per page that was specified in the request. This value is echoed back.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder maxResults(Integer maxResults) {
            this.maxResults = maxResults;
            return this;
        }

        /**
         * <p>The token for the next page. An empty string indicates that the current page is the last page.</p>
         * 
         * <strong>example:</strong>
         * <p>MTIzNDU2Nzg5MA==</p>
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>The request ID. You can use this ID to locate and troubleshoot issues.</p>
         * 
         * <strong>example:</strong>
         * <p>9ACFB10A-1B2C-3D4E-5F6G-7H8I9J0K1L2M</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The list of context stores.</p>
         */
        public Builder results(java.util.List<Results> results) {
            this.results = results;
            return this;
        }

        /**
         * <p>The total number of context stores that match the query conditions.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        public Builder total(Integer total) {
            this.total = total;
            return this;
        }

        public ListContextStoresResponseBody build() {
            return new ListContextStoresResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListContextStoresResponseBody} extends {@link TeaModel}
     *
     * <p>ListContextStoresResponseBody</p>
     */
    public static class Results extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("agentSpace")
        private String agentSpace;

        @com.aliyun.core.annotation.NameInMap("contextStoreName")
        private String contextStoreName;

        @com.aliyun.core.annotation.NameInMap("contextType")
        private String contextType;

        @com.aliyun.core.annotation.NameInMap("createTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("regionId")
        private String regionId;

        @com.aliyun.core.annotation.NameInMap("serviceNames")
        private java.util.List<String> serviceNames;

        @com.aliyun.core.annotation.NameInMap("status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("updateTime")
        private String updateTime;

        private Results(Builder builder) {
            this.agentSpace = builder.agentSpace;
            this.contextStoreName = builder.contextStoreName;
            this.contextType = builder.contextType;
            this.createTime = builder.createTime;
            this.description = builder.description;
            this.regionId = builder.regionId;
            this.serviceNames = builder.serviceNames;
            this.status = builder.status;
            this.updateTime = builder.updateTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Results create() {
            return builder().build();
        }

        /**
         * @return agentSpace
         */
        public String getAgentSpace() {
            return this.agentSpace;
        }

        /**
         * @return contextStoreName
         */
        public String getContextStoreName() {
            return this.contextStoreName;
        }

        /**
         * @return contextType
         */
        public String getContextType() {
            return this.contextType;
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
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
        }

        /**
         * @return serviceNames
         */
        public java.util.List<String> getServiceNames() {
            return this.serviceNames;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return updateTime
         */
        public String getUpdateTime() {
            return this.updateTime;
        }

        public static final class Builder {
            private String agentSpace; 
            private String contextStoreName; 
            private String contextType; 
            private String createTime; 
            private String description; 
            private String regionId; 
            private java.util.List<String> serviceNames; 
            private String status; 
            private String updateTime; 

            private Builder() {
            } 

            private Builder(Results model) {
                this.agentSpace = model.agentSpace;
                this.contextStoreName = model.contextStoreName;
                this.contextType = model.contextType;
                this.createTime = model.createTime;
                this.description = model.description;
                this.regionId = model.regionId;
                this.serviceNames = model.serviceNames;
                this.status = model.status;
                this.updateTime = model.updateTime;
            } 

            /**
             * <p>The name of the AgentSpace to which the context store belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>my-agent-space</p>
             */
            public Builder agentSpace(String agentSpace) {
                this.agentSpace = agentSpace;
                return this;
            }

            /**
             * <p>The name of the context store.</p>
             * 
             * <strong>example:</strong>
             * <p>my-context-store</p>
             */
            public Builder contextStoreName(String contextStoreName) {
                this.contextStoreName = contextStoreName;
                return this;
            }

            /**
             * <p>The type of the context store, such as experience or memory.</p>
             * 
             * <strong>example:</strong>
             * <p>experience</p>
             */
            public Builder contextType(String contextType) {
                this.contextType = contextType;
                return this;
            }

            /**
             * <p>The time when the context store was created, in ISO 8601 UTC format.</p>
             * <p>Use the UTC time format: yyyy-MM-ddTHH:mm:ssZ</p>
             * 
             * <strong>example:</strong>
             * <p>2026-01-01T00:00:00Z</p>
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The description of the context store.</p>
             * 
             * <strong>example:</strong>
             * <p>我的上下文库</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The region ID of the context store.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou</p>
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * <p>The list of service names. This parameter has a value only for context stores of the experience type. The service names are used together with the data source AgentSpace to locate trace data sources.</p>
             * 
             * <strong>example:</strong>
             * <p>[&quot;order-service&quot;,&quot;payment-service&quot;]</p>
             */
            public Builder serviceNames(java.util.List<String> serviceNames) {
                this.serviceNames = serviceNames;
                return this;
            }

            /**
             * <p>The status of the context store. Valid values: ACTIVE, INITIALIZING, and FAILED.</p>
             * 
             * <strong>example:</strong>
             * <p>ACTIVE</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The time when the context store was last updated, in ISO 8601 UTC format.</p>
             * <p>Use the UTC time format: yyyy-MM-ddTHH:mm:ssZ</p>
             * 
             * <strong>example:</strong>
             * <p>2026-01-02T00:00:00Z</p>
             */
            public Builder updateTime(String updateTime) {
                this.updateTime = updateTime;
                return this;
            }

            public Results build() {
                return new Results(this);
            } 

        } 

    }
}
