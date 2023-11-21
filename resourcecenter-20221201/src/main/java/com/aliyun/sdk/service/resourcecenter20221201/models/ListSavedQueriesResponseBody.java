// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.resourcecenter20221201.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListSavedQueriesResponseBody} extends {@link TeaModel}
 *
 * <p>ListSavedQueriesResponseBody</p>
 */
public class ListSavedQueriesResponseBody extends TeaModel {
    @NameInMap("MaxResults")
    private String maxResults;

    @NameInMap("NextToken")
    private String nextToken;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("SavedQueries")
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
         * The maximum number of entries per page.
         */
        public Builder maxResults(String maxResults) {
            this.maxResults = maxResults;
            return this;
        }

        /**
         * The pagination token that is used in the next request to retrieve a new page of results.
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The information about the custom query templates.
         */
        public Builder savedQueries(java.util.List < SavedQueries> savedQueries) {
            this.savedQueries = savedQueries;
            return this;
        }

        public ListSavedQueriesResponseBody build() {
            return new ListSavedQueriesResponseBody(this);
        } 

    } 

    public static class SavedQueries extends TeaModel {
        @NameInMap("CreateTime")
        private String createTime;

        @NameInMap("Description")
        private String description;

        @NameInMap("Name")
        private String name;

        @NameInMap("QueryId")
        private String queryId;

        @NameInMap("UpdateTime")
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
             * The time when the template was created.
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * The description of the template.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * The name of the template.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * The ID of the template.
             */
            public Builder queryId(String queryId) {
                this.queryId = queryId;
                return this;
            }

            /**
             * The time when the template was last updated.
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
