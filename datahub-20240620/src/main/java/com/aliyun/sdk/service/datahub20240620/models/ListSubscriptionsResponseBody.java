// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.datahub20240620.models;

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
 * {@link ListSubscriptionsResponseBody} extends {@link TeaModel}
 *
 * <p>ListSubscriptionsResponseBody</p>
 */
public class ListSubscriptionsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("List")
    private List list;

    @com.aliyun.core.annotation.NameInMap("MaxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    private ListSubscriptionsResponseBody(Builder builder) {
        this.list = builder.list;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.requestId = builder.requestId;
        this.success = builder.success;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListSubscriptionsResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return list
     */
    public List getList() {
        return this.list;
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
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    /**
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private List list; 
        private Integer maxResults; 
        private String nextToken; 
        private String requestId; 
        private Boolean success; 
        private Integer totalCount; 

        private Builder() {
        } 

        private Builder(ListSubscriptionsResponseBody model) {
            this.list = model.list;
            this.maxResults = model.maxResults;
            this.nextToken = model.nextToken;
            this.requestId = model.requestId;
            this.success = model.success;
            this.totalCount = model.totalCount;
        } 

        /**
         * List.
         */
        public Builder list(List list) {
            this.list = list;
            return this;
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
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        /**
         * TotalCount.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListSubscriptionsResponseBody build() {
            return new ListSubscriptionsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListSubscriptionsResponseBody} extends {@link TeaModel}
     *
     * <p>ListSubscriptionsResponseBody</p>
     */
    public static class Subscription extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Application")
        private String application;

        @com.aliyun.core.annotation.NameInMap("Comment")
        private String comment;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private Long createTime;

        @com.aliyun.core.annotation.NameInMap("Creator")
        private String creator;

        @com.aliyun.core.annotation.NameInMap("ProjectName")
        private String projectName;

        @com.aliyun.core.annotation.NameInMap("State")
        private Integer state;

        @com.aliyun.core.annotation.NameInMap("SubscriptionId")
        private String subscriptionId;

        @com.aliyun.core.annotation.NameInMap("TopicName")
        private String topicName;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        @com.aliyun.core.annotation.NameInMap("UpdateTime")
        private Long updateTime;

        private Subscription(Builder builder) {
            this.application = builder.application;
            this.comment = builder.comment;
            this.createTime = builder.createTime;
            this.creator = builder.creator;
            this.projectName = builder.projectName;
            this.state = builder.state;
            this.subscriptionId = builder.subscriptionId;
            this.topicName = builder.topicName;
            this.type = builder.type;
            this.updateTime = builder.updateTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Subscription create() {
            return builder().build();
        }

        /**
         * @return application
         */
        public String getApplication() {
            return this.application;
        }

        /**
         * @return comment
         */
        public String getComment() {
            return this.comment;
        }

        /**
         * @return createTime
         */
        public Long getCreateTime() {
            return this.createTime;
        }

        /**
         * @return creator
         */
        public String getCreator() {
            return this.creator;
        }

        /**
         * @return projectName
         */
        public String getProjectName() {
            return this.projectName;
        }

        /**
         * @return state
         */
        public Integer getState() {
            return this.state;
        }

        /**
         * @return subscriptionId
         */
        public String getSubscriptionId() {
            return this.subscriptionId;
        }

        /**
         * @return topicName
         */
        public String getTopicName() {
            return this.topicName;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        /**
         * @return updateTime
         */
        public Long getUpdateTime() {
            return this.updateTime;
        }

        public static final class Builder {
            private String application; 
            private String comment; 
            private Long createTime; 
            private String creator; 
            private String projectName; 
            private Integer state; 
            private String subscriptionId; 
            private String topicName; 
            private String type; 
            private Long updateTime; 

            private Builder() {
            } 

            private Builder(Subscription model) {
                this.application = model.application;
                this.comment = model.comment;
                this.createTime = model.createTime;
                this.creator = model.creator;
                this.projectName = model.projectName;
                this.state = model.state;
                this.subscriptionId = model.subscriptionId;
                this.topicName = model.topicName;
                this.type = model.type;
                this.updateTime = model.updateTime;
            } 

            /**
             * Application.
             */
            public Builder application(String application) {
                this.application = application;
                return this;
            }

            /**
             * Comment.
             */
            public Builder comment(String comment) {
                this.comment = comment;
                return this;
            }

            /**
             * CreateTime.
             */
            public Builder createTime(Long createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * Creator.
             */
            public Builder creator(String creator) {
                this.creator = creator;
                return this;
            }

            /**
             * ProjectName.
             */
            public Builder projectName(String projectName) {
                this.projectName = projectName;
                return this;
            }

            /**
             * State.
             */
            public Builder state(Integer state) {
                this.state = state;
                return this;
            }

            /**
             * SubscriptionId.
             */
            public Builder subscriptionId(String subscriptionId) {
                this.subscriptionId = subscriptionId;
                return this;
            }

            /**
             * TopicName.
             */
            public Builder topicName(String topicName) {
                this.topicName = topicName;
                return this;
            }

            /**
             * Type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * UpdateTime.
             */
            public Builder updateTime(Long updateTime) {
                this.updateTime = updateTime;
                return this;
            }

            public Subscription build() {
                return new Subscription(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListSubscriptionsResponseBody} extends {@link TeaModel}
     *
     * <p>ListSubscriptionsResponseBody</p>
     */
    public static class List extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Subscription")
        private java.util.List<Subscription> subscription;

        private List(Builder builder) {
            this.subscription = builder.subscription;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static List create() {
            return builder().build();
        }

        /**
         * @return subscription
         */
        public java.util.List<Subscription> getSubscription() {
            return this.subscription;
        }

        public static final class Builder {
            private java.util.List<Subscription> subscription; 

            private Builder() {
            } 

            private Builder(List model) {
                this.subscription = model.subscription;
            } 

            /**
             * Subscription.
             */
            public Builder subscription(java.util.List<Subscription> subscription) {
                this.subscription = subscription;
                return this;
            }

            public List build() {
                return new List(this);
            } 

        } 

    }
}
