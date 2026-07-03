// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloud_siem20241212.models;

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
 * {@link ListQueryViewsResponseBody} extends {@link TeaModel}
 *
 * <p>ListQueryViewsResponseBody</p>
 */
public class ListQueryViewsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("MaxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("QueryViews")
    private java.util.List<QueryViews> queryViews;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private ListQueryViewsResponseBody(Builder builder) {
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.queryViews = builder.queryViews;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListQueryViewsResponseBody create() {
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
     * @return queryViews
     */
    public java.util.List<QueryViews> getQueryViews() {
        return this.queryViews;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Integer maxResults; 
        private String nextToken; 
        private java.util.List<QueryViews> queryViews; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(ListQueryViewsResponseBody model) {
            this.maxResults = model.maxResults;
            this.nextToken = model.nextToken;
            this.queryViews = model.queryViews;
            this.requestId = model.requestId;
        } 

        /**
         * MaxResults.
         */
        public Builder maxResults(Integer maxResults) {
            this.maxResults = maxResults;
            return this;
        }

        /**
         * NextToken.
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * QueryViews.
         */
        public Builder queryViews(java.util.List<QueryViews> queryViews) {
            this.queryViews = queryViews;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListQueryViewsResponseBody build() {
            return new ListQueryViewsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListQueryViewsResponseBody} extends {@link TeaModel}
     *
     * <p>ListQueryViewsResponseBody</p>
     */
    public static class QueryViews extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("QueryViewCondition")
        private String queryViewCondition;

        @com.aliyun.core.annotation.NameInMap("QueryViewCriteria")
        private String queryViewCriteria;

        @com.aliyun.core.annotation.NameInMap("QueryViewFields")
        private String queryViewFields;

        @com.aliyun.core.annotation.NameInMap("QueryViewId")
        private String queryViewId;

        @com.aliyun.core.annotation.NameInMap("QueryViewName")
        private String queryViewName;

        @com.aliyun.core.annotation.NameInMap("QueryViewOrder")
        private String queryViewOrder;

        @com.aliyun.core.annotation.NameInMap("QueryViewScene")
        private String queryViewScene;

        @com.aliyun.core.annotation.NameInMap("QueryViewStatus")
        private String queryViewStatus;

        @com.aliyun.core.annotation.NameInMap("QueryViewType")
        private String queryViewType;

        private QueryViews(Builder builder) {
            this.queryViewCondition = builder.queryViewCondition;
            this.queryViewCriteria = builder.queryViewCriteria;
            this.queryViewFields = builder.queryViewFields;
            this.queryViewId = builder.queryViewId;
            this.queryViewName = builder.queryViewName;
            this.queryViewOrder = builder.queryViewOrder;
            this.queryViewScene = builder.queryViewScene;
            this.queryViewStatus = builder.queryViewStatus;
            this.queryViewType = builder.queryViewType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static QueryViews create() {
            return builder().build();
        }

        /**
         * @return queryViewCondition
         */
        public String getQueryViewCondition() {
            return this.queryViewCondition;
        }

        /**
         * @return queryViewCriteria
         */
        public String getQueryViewCriteria() {
            return this.queryViewCriteria;
        }

        /**
         * @return queryViewFields
         */
        public String getQueryViewFields() {
            return this.queryViewFields;
        }

        /**
         * @return queryViewId
         */
        public String getQueryViewId() {
            return this.queryViewId;
        }

        /**
         * @return queryViewName
         */
        public String getQueryViewName() {
            return this.queryViewName;
        }

        /**
         * @return queryViewOrder
         */
        public String getQueryViewOrder() {
            return this.queryViewOrder;
        }

        /**
         * @return queryViewScene
         */
        public String getQueryViewScene() {
            return this.queryViewScene;
        }

        /**
         * @return queryViewStatus
         */
        public String getQueryViewStatus() {
            return this.queryViewStatus;
        }

        /**
         * @return queryViewType
         */
        public String getQueryViewType() {
            return this.queryViewType;
        }

        public static final class Builder {
            private String queryViewCondition; 
            private String queryViewCriteria; 
            private String queryViewFields; 
            private String queryViewId; 
            private String queryViewName; 
            private String queryViewOrder; 
            private String queryViewScene; 
            private String queryViewStatus; 
            private String queryViewType; 

            private Builder() {
            } 

            private Builder(QueryViews model) {
                this.queryViewCondition = model.queryViewCondition;
                this.queryViewCriteria = model.queryViewCriteria;
                this.queryViewFields = model.queryViewFields;
                this.queryViewId = model.queryViewId;
                this.queryViewName = model.queryViewName;
                this.queryViewOrder = model.queryViewOrder;
                this.queryViewScene = model.queryViewScene;
                this.queryViewStatus = model.queryViewStatus;
                this.queryViewType = model.queryViewType;
            } 

            /**
             * QueryViewCondition.
             */
            public Builder queryViewCondition(String queryViewCondition) {
                this.queryViewCondition = queryViewCondition;
                return this;
            }

            /**
             * QueryViewCriteria.
             */
            public Builder queryViewCriteria(String queryViewCriteria) {
                this.queryViewCriteria = queryViewCriteria;
                return this;
            }

            /**
             * QueryViewFields.
             */
            public Builder queryViewFields(String queryViewFields) {
                this.queryViewFields = queryViewFields;
                return this;
            }

            /**
             * QueryViewId.
             */
            public Builder queryViewId(String queryViewId) {
                this.queryViewId = queryViewId;
                return this;
            }

            /**
             * QueryViewName.
             */
            public Builder queryViewName(String queryViewName) {
                this.queryViewName = queryViewName;
                return this;
            }

            /**
             * QueryViewOrder.
             */
            public Builder queryViewOrder(String queryViewOrder) {
                this.queryViewOrder = queryViewOrder;
                return this;
            }

            /**
             * QueryViewScene.
             */
            public Builder queryViewScene(String queryViewScene) {
                this.queryViewScene = queryViewScene;
                return this;
            }

            /**
             * QueryViewStatus.
             */
            public Builder queryViewStatus(String queryViewStatus) {
                this.queryViewStatus = queryViewStatus;
                return this;
            }

            /**
             * QueryViewType.
             */
            public Builder queryViewType(String queryViewType) {
                this.queryViewType = queryViewType;
                return this;
            }

            public QueryViews build() {
                return new QueryViews(this);
            } 

        } 

    }
}
