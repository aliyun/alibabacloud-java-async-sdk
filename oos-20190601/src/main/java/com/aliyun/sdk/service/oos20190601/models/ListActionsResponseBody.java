// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.oos20190601.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListActionsResponseBody} extends {@link TeaModel}
 *
 * <p>ListActionsResponseBody</p>
 */
public class ListActionsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Actions")
    private java.util.List < Actions> actions;

    @com.aliyun.core.annotation.NameInMap("MaxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private ListActionsResponseBody(Builder builder) {
        this.actions = builder.actions;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListActionsResponseBody create() {
        return builder().build();
    }

    /**
     * @return actions
     */
    public java.util.List < Actions> getActions() {
        return this.actions;
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

    public static final class Builder {
        private java.util.List < Actions> actions; 
        private Integer maxResults; 
        private String nextToken; 
        private String requestId; 

        /**
         * The details of the actions.
         */
        public Builder actions(java.util.List < Actions> actions) {
            this.actions = actions;
            return this;
        }

        /**
         * The number of entries returned per page.
         */
        public Builder maxResults(Integer maxResults) {
            this.maxResults = maxResults;
            return this;
        }

        /**
         * The token that is used to retrieve the next page of results.
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListActionsResponseBody build() {
            return new ListActionsResponseBody(this);
        } 

    } 

    public static class Actions extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ActionType")
        private String actionType;

        @com.aliyun.core.annotation.NameInMap("CreatedDate")
        private String createdDate;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("OOSActionName")
        private String OOSActionName;

        @com.aliyun.core.annotation.NameInMap("Popularity")
        private Integer popularity;

        @com.aliyun.core.annotation.NameInMap("Properties")
        private String properties;

        @com.aliyun.core.annotation.NameInMap("TemplateVersion")
        private String templateVersion;

        private Actions(Builder builder) {
            this.actionType = builder.actionType;
            this.createdDate = builder.createdDate;
            this.description = builder.description;
            this.OOSActionName = builder.OOSActionName;
            this.popularity = builder.popularity;
            this.properties = builder.properties;
            this.templateVersion = builder.templateVersion;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Actions create() {
            return builder().build();
        }

        /**
         * @return actionType
         */
        public String getActionType() {
            return this.actionType;
        }

        /**
         * @return createdDate
         */
        public String getCreatedDate() {
            return this.createdDate;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return OOSActionName
         */
        public String getOOSActionName() {
            return this.OOSActionName;
        }

        /**
         * @return popularity
         */
        public Integer getPopularity() {
            return this.popularity;
        }

        /**
         * @return properties
         */
        public String getProperties() {
            return this.properties;
        }

        /**
         * @return templateVersion
         */
        public String getTemplateVersion() {
            return this.templateVersion;
        }

        public static final class Builder {
            private String actionType; 
            private String createdDate; 
            private String description; 
            private String OOSActionName; 
            private Integer popularity; 
            private String properties; 
            private String templateVersion; 

            /**
             * The type of the action.
             * <p>
             * 
             * 1.  Atomic actions
             * 
             *     *   Atomic.API
             *     *   Atomic.Trigger
             *     *   Atomic.Control
             *     *   Atomic.Embedded
             * 
             * 2.  Cloud product actions
             * 
             *     *   Product.ECS
             *     *   Product.RDS
             *     *   Product.VPC
             *     *   Product.FC
             *     *   ...
             */
            public Builder actionType(String actionType) {
                this.actionType = actionType;
                return this;
            }

            /**
             * The time when the action was created.
             */
            public Builder createdDate(String createdDate) {
                this.createdDate = createdDate;
                return this;
            }

            /**
             * The description of the action.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * The name of the action.
             */
            public Builder OOSActionName(String OOSActionName) {
                this.OOSActionName = OOSActionName;
                return this;
            }

            /**
             * The number of times that the action is used.
             */
            public Builder popularity(Integer popularity) {
                this.popularity = popularity;
                return this;
            }

            /**
             * The parameters of the action.
             */
            public Builder properties(String properties) {
                this.properties = properties;
                return this;
            }

            /**
             * The version of the template that corresponds to the action.
             * <p>
             * 
             * >  For atomic actions, this parameter is not returned.
             */
            public Builder templateVersion(String templateVersion) {
                this.templateVersion = templateVersion;
                return this;
            }

            public Actions build() {
                return new Actions(this);
            } 

        } 

    }
}
