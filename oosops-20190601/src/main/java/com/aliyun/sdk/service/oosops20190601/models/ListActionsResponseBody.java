// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.oosops20190601.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
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
         * Actions.
         */
        public Builder actions(java.util.List < Actions> actions) {
            this.actions = actions;
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

        public ListActionsResponseBody build() {
            return new ListActionsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListActionsResponseBody} extends {@link TeaModel}
     *
     * <p>ListActionsResponseBody</p>
     */
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

        @com.aliyun.core.annotation.NameInMap("UpdateDate")
        private String updateDate;

        private Actions(Builder builder) {
            this.actionType = builder.actionType;
            this.createdDate = builder.createdDate;
            this.description = builder.description;
            this.OOSActionName = builder.OOSActionName;
            this.popularity = builder.popularity;
            this.properties = builder.properties;
            this.templateVersion = builder.templateVersion;
            this.updateDate = builder.updateDate;
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

        /**
         * @return updateDate
         */
        public String getUpdateDate() {
            return this.updateDate;
        }

        public static final class Builder {
            private String actionType; 
            private String createdDate; 
            private String description; 
            private String OOSActionName; 
            private Integer popularity; 
            private String properties; 
            private String templateVersion; 
            private String updateDate; 

            /**
             * ActionType.
             */
            public Builder actionType(String actionType) {
                this.actionType = actionType;
                return this;
            }

            /**
             * CreatedDate.
             */
            public Builder createdDate(String createdDate) {
                this.createdDate = createdDate;
                return this;
            }

            /**
             * Description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * OOSActionName.
             */
            public Builder OOSActionName(String OOSActionName) {
                this.OOSActionName = OOSActionName;
                return this;
            }

            /**
             * Popularity.
             */
            public Builder popularity(Integer popularity) {
                this.popularity = popularity;
                return this;
            }

            /**
             * Properties.
             */
            public Builder properties(String properties) {
                this.properties = properties;
                return this;
            }

            /**
             * TemplateVersion.
             */
            public Builder templateVersion(String templateVersion) {
                this.templateVersion = templateVersion;
                return this;
            }

            /**
             * UpdateDate.
             */
            public Builder updateDate(String updateDate) {
                this.updateDate = updateDate;
                return this;
            }

            public Actions build() {
                return new Actions(this);
            } 

        } 

    }
}
