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
    @com.aliyun.core.annotation.NameInMap("LogProjectName")
    private String logProjectName;

    @com.aliyun.core.annotation.NameInMap("LogRegionId")
    private String logRegionId;

    @com.aliyun.core.annotation.NameInMap("LogStoreName")
    private String logStoreName;

    @com.aliyun.core.annotation.NameInMap("MaxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("QueryViews")
    private java.util.List<QueryViews> queryViews;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private ListQueryViewsResponseBody(Builder builder) {
        this.logProjectName = builder.logProjectName;
        this.logRegionId = builder.logRegionId;
        this.logStoreName = builder.logStoreName;
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
     * @return logProjectName
     */
    public String getLogProjectName() {
        return this.logProjectName;
    }

    /**
     * @return logRegionId
     */
    public String getLogRegionId() {
        return this.logRegionId;
    }

    /**
     * @return logStoreName
     */
    public String getLogStoreName() {
        return this.logStoreName;
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
        private String logProjectName; 
        private String logRegionId; 
        private String logStoreName; 
        private Integer maxResults; 
        private String nextToken; 
        private java.util.List<QueryViews> queryViews; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(ListQueryViewsResponseBody model) {
            this.logProjectName = model.logProjectName;
            this.logRegionId = model.logRegionId;
            this.logStoreName = model.logStoreName;
            this.maxResults = model.maxResults;
            this.nextToken = model.nextToken;
            this.queryViews = model.queryViews;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The Simple Log Service project name.</p>
         * 
         * <strong>example:</strong>
         * <p>aliyun-cloudsiem-data-173326*******-cn-hangzhou</p>
         */
        public Builder logProjectName(String logProjectName) {
            this.logProjectName = logProjectName;
            return this;
        }

        /**
         * <p>The log storage region ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder logRegionId(String logRegionId) {
            this.logRegionId = logRegionId;
            return this;
        }

        /**
         * <p>The Simple Log Service Logstore name.</p>
         * 
         * <strong>example:</strong>
         * <p>audit-activity</p>
         */
        public Builder logStoreName(String logStoreName) {
            this.logStoreName = logStoreName;
            return this;
        }

        /**
         * <p>The maximum number of results to return when you use the NextToken-based pagination method. Valid values: 1 to 100. Default value: 50.</p>
         * 
         * <strong>example:</strong>
         * <p>50</p>
         */
        public Builder maxResults(Integer maxResults) {
            this.maxResults = maxResults;
            return this;
        }

        /**
         * <p>The pagination token that is used in the next request to retrieve a new page of results. You do not need to specify this parameter for the first request or if no more results exist. Set this parameter to the NextToken value returned in the previous API call.</p>
         * 
         * <strong>example:</strong>
         * <p>AAAAASLVeIxed4466E0LVmGkzwS6hJKd9DGVGMDRM6Lu****</p>
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>The list of query views.</p>
         */
        public Builder queryViews(java.util.List<QueryViews> queryViews) {
            this.queryViews = queryViews;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>9AAA9ED9-78F4-5021-86DC-D51C7511****</p>
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
             * <p>The custom query condition of the view.</p>
             * 
             * <strong>example:</strong>
             * <p>preset</p>
             */
            public Builder queryViewCondition(String queryViewCondition) {
                this.queryViewCondition = queryViewCondition;
                return this;
            }

            /**
             * <p>The alert filter statement of the view.</p>
             * 
             * <strong>example:</strong>
             * <p>module_code: alibaba_cloud_sas_custom_rule</p>
             */
            public Builder queryViewCriteria(String queryViewCriteria) {
                this.queryViewCriteria = queryViewCriteria;
                return this;
            }

            /**
             * <p>The list of displayed fields.</p>
             * 
             * <strong>example:</strong>
             * <p>[&quot;alert_name_cn&quot;,&quot;alert_type_cn&quot;,&quot;entity_list&quot;,&quot;alert_level&quot;,&quot;alert_status&quot;,&quot;start_time&quot;,&quot;end_time&quot;]</p>
             */
            public Builder queryViewFields(String queryViewFields) {
                this.queryViewFields = queryViewFields;
                return this;
            }

            /**
             * <p>The unique identifier of the query view.</p>
             * 
             * <strong>example:</strong>
             * <p>qv-a1b2c3d4e5f6g7h8****</p>
             */
            public Builder queryViewId(String queryViewId) {
                this.queryViewId = queryViewId;
                return this;
            }

            /**
             * <p>The view name.</p>
             * 
             * <strong>example:</strong>
             * <p>alert</p>
             */
            public Builder queryViewName(String queryViewName) {
                this.queryViewName = queryViewName;
                return this;
            }

            /**
             * <p>The display order.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder queryViewOrder(String queryViewOrder) {
                this.queryViewOrder = queryViewOrder;
                return this;
            }

            /**
             * <p>The scene to which the view belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>Alert</p>
             */
            public Builder queryViewScene(String queryViewScene) {
                this.queryViewScene = queryViewScene;
                return this;
            }

            /**
             * <p>The view status.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder queryViewStatus(String queryViewStatus) {
                this.queryViewStatus = queryViewStatus;
                return this;
            }

            /**
             * <p>The view type.</p>
             * 
             * <strong>example:</strong>
             * <p>preset</p>
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
