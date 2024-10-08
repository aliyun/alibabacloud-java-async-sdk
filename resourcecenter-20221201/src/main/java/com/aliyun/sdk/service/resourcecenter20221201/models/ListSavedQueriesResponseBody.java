// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.resourcecenter20221201.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ListSavedQueriesResponseBody} extends {@link TeaModel}
 *
 * <p>ListSavedQueriesResponseBody</p>
 */
public class ListSavedQueriesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("MaxResults")
    private String maxResults;

    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("SavedQueries")
    private java.util.List < SavedQueries> savedQueries;

    private ListSavedQueriesResponseBody(Builder builder) {
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.requestId = builder.requestId;
        this.savedQueries = builder.savedQueries;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListSavedQueriesResponseBody create() {
        return builder().build();
    }

    /**
     * @return maxResults
     */
    public String getMaxResults() {
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
     * @return savedQueries
     */
    public java.util.List < SavedQueries> getSavedQueries() {
        return this.savedQueries;
    }

    public static final class Builder {
        private String maxResults; 
        private String nextToken; 
        private String requestId; 
        private java.util.List < SavedQueries> savedQueries; 

        /**
         * <p>The maximum number of entries per page.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder maxResults(String maxResults) {
            this.maxResults = maxResults;
            return this;
        }

        /**
         * <p>The pagination token that is used in the next request to retrieve a new page of results.</p>
         * 
         * <strong>example:</strong>
         * <p>AAAAARfZmVDe9NvRXloR5+8CK9nNJufMdRA7W1miLC1P****</p>
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>D696E6EF-3A6D-5770-801E-4982081FE4D0</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The information about the custom query templates.</p>
         */
        public Builder savedQueries(java.util.List < SavedQueries> savedQueries) {
            this.savedQueries = savedQueries;
            return this;
        }

        public ListSavedQueriesResponseBody build() {
            return new ListSavedQueriesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListSavedQueriesResponseBody} extends {@link TeaModel}
     *
     * <p>ListSavedQueriesResponseBody</p>
     */
    public static class SavedQueries extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("QueryId")
        private String queryId;

        @com.aliyun.core.annotation.NameInMap("UpdateTime")
        private String updateTime;

        private SavedQueries(Builder builder) {
            this.createTime = builder.createTime;
            this.description = builder.description;
            this.name = builder.name;
            this.queryId = builder.queryId;
            this.updateTime = builder.updateTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SavedQueries create() {
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
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return queryId
         */
        public String getQueryId() {
            return this.queryId;
        }

        /**
         * @return updateTime
         */
        public String getUpdateTime() {
            return this.updateTime;
        }

        public static final class Builder {
            private String createTime; 
            private String description; 
            private String name; 
            private String queryId; 
            private String updateTime; 

            /**
             * <p>The time when the template was created. The time is displayed in UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>2022-01-13T05:50:35Z</p>
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The description of the template.</p>
             * 
             * <strong>example:</strong>
             * <p>Queries all resources on which you have permissions and sorts the resources by resource type and resource ID.</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The template name.</p>
             * 
             * <strong>example:</strong>
             * <p>Query of All Alibaba Cloud Resources</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The template ID.</p>
             * 
             * <strong>example:</strong>
             * <p>sq-GeAck****</p>
             */
            public Builder queryId(String queryId) {
                this.queryId = queryId;
                return this;
            }

            /**
             * <p>The time when the template was updated. The time is displayed in UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>2023-03-14 10:27:07</p>
             */
            public Builder updateTime(String updateTime) {
                this.updateTime = updateTime;
                return this;
            }

            public SavedQueries build() {
                return new SavedQueries(this);
            } 

        } 

    }
}
