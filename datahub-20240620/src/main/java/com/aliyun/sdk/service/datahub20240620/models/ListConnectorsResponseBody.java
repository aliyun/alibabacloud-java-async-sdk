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
 * {@link ListConnectorsResponseBody} extends {@link TeaModel}
 *
 * <p>ListConnectorsResponseBody</p>
 */
public class ListConnectorsResponseBody extends TeaModel {
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

    private ListConnectorsResponseBody(Builder builder) {
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

    public static ListConnectorsResponseBody create() {
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

        private Builder(ListConnectorsResponseBody model) {
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

        public ListConnectorsResponseBody build() {
            return new ListConnectorsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListConnectorsResponseBody} extends {@link TeaModel}
     *
     * <p>ListConnectorsResponseBody</p>
     */
    public static class Connector extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ColumnFields")
        private String columnFields;

        @com.aliyun.core.annotation.NameInMap("Config")
        private String config;

        @com.aliyun.core.annotation.NameInMap("ConnectorId")
        private String connectorId;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("Creator")
        private String creator;

        @com.aliyun.core.annotation.NameInMap("DoneTime")
        private String doneTime;

        @com.aliyun.core.annotation.NameInMap("ProjectName")
        private String projectName;

        @com.aliyun.core.annotation.NameInMap("State")
        private String state;

        @com.aliyun.core.annotation.NameInMap("SubscriptionId")
        private String subscriptionId;

        @com.aliyun.core.annotation.NameInMap("TopicName")
        private String topicName;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        @com.aliyun.core.annotation.NameInMap("UpdateTime")
        private String updateTime;

        private Connector(Builder builder) {
            this.columnFields = builder.columnFields;
            this.config = builder.config;
            this.connectorId = builder.connectorId;
            this.createTime = builder.createTime;
            this.creator = builder.creator;
            this.doneTime = builder.doneTime;
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

        public static Connector create() {
            return builder().build();
        }

        /**
         * @return columnFields
         */
        public String getColumnFields() {
            return this.columnFields;
        }

        /**
         * @return config
         */
        public String getConfig() {
            return this.config;
        }

        /**
         * @return connectorId
         */
        public String getConnectorId() {
            return this.connectorId;
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return creator
         */
        public String getCreator() {
            return this.creator;
        }

        /**
         * @return doneTime
         */
        public String getDoneTime() {
            return this.doneTime;
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
        public String getState() {
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
        public String getUpdateTime() {
            return this.updateTime;
        }

        public static final class Builder {
            private String columnFields; 
            private String config; 
            private String connectorId; 
            private String createTime; 
            private String creator; 
            private String doneTime; 
            private String projectName; 
            private String state; 
            private String subscriptionId; 
            private String topicName; 
            private String type; 
            private String updateTime; 

            private Builder() {
            } 

            private Builder(Connector model) {
                this.columnFields = model.columnFields;
                this.config = model.config;
                this.connectorId = model.connectorId;
                this.createTime = model.createTime;
                this.creator = model.creator;
                this.doneTime = model.doneTime;
                this.projectName = model.projectName;
                this.state = model.state;
                this.subscriptionId = model.subscriptionId;
                this.topicName = model.topicName;
                this.type = model.type;
                this.updateTime = model.updateTime;
            } 

            /**
             * ColumnFields.
             */
            public Builder columnFields(String columnFields) {
                this.columnFields = columnFields;
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
             * ConnectorId.
             */
            public Builder connectorId(String connectorId) {
                this.connectorId = connectorId;
                return this;
            }

            /**
             * CreateTime.
             */
            public Builder createTime(String createTime) {
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
             * DoneTime.
             */
            public Builder doneTime(String doneTime) {
                this.doneTime = doneTime;
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
            public Builder state(String state) {
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
            public Builder updateTime(String updateTime) {
                this.updateTime = updateTime;
                return this;
            }

            public Connector build() {
                return new Connector(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListConnectorsResponseBody} extends {@link TeaModel}
     *
     * <p>ListConnectorsResponseBody</p>
     */
    public static class List extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Connector")
        private java.util.List<Connector> connector;

        private List(Builder builder) {
            this.connector = builder.connector;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static List create() {
            return builder().build();
        }

        /**
         * @return connector
         */
        public java.util.List<Connector> getConnector() {
            return this.connector;
        }

        public static final class Builder {
            private java.util.List<Connector> connector; 

            private Builder() {
            } 

            private Builder(List model) {
                this.connector = model.connector;
            } 

            /**
             * Connector.
             */
            public Builder connector(java.util.List<Connector> connector) {
                this.connector = connector;
                return this;
            }

            public List build() {
                return new List(this);
            } 

        } 

    }
}
