// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.oos20190601.models;

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
 * {@link ListActionsResponseBody} extends {@link TeaModel}
 *
 * <p>ListActionsResponseBody</p>
 */
public class ListActionsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Actions")
    private java.util.List<Actions> actions;

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

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return actions
     */
    public java.util.List<Actions> getActions() {
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
        private java.util.List<Actions> actions; 
        private Integer maxResults; 
        private String nextToken; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(ListActionsResponseBody model) {
            this.actions = model.actions;
            this.maxResults = model.maxResults;
            this.nextToken = model.nextToken;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The details of the actions.</p>
         */
        public Builder actions(java.util.List<Actions> actions) {
            this.actions = actions;
            return this;
        }

        /**
         * <p>The number of entries returned per page.</p>
         * 
         * <strong>example:</strong>
         * <p>50</p>
         */
        public Builder maxResults(Integer maxResults) {
            this.maxResults = maxResults;
            return this;
        }

        /**
         * <p>The token that is used to retrieve the next page of results.</p>
         * 
         * <strong>example:</strong>
         * <p>xxx</p>
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>F9154C02-F847-4563-BB6A-6DD01A4F0</p>
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

            private Builder() {
            } 

            private Builder(Actions model) {
                this.actionType = model.actionType;
                this.createdDate = model.createdDate;
                this.description = model.description;
                this.OOSActionName = model.OOSActionName;
                this.popularity = model.popularity;
                this.properties = model.properties;
                this.templateVersion = model.templateVersion;
            } 

            /**
             * <p>The type of the action.</p>
             * <ol>
             * <li><p>Atomic actions</p>
             * <ul>
             * <li>Atomic.API</li>
             * <li>Atomic.Trigger</li>
             * <li>Atomic.Control</li>
             * <li>Atomic.Embedded</li>
             * </ul>
             * </li>
             * <li><p>Cloud product actions</p>
             * <ul>
             * <li>Product.ECS</li>
             * <li>Product.RDS</li>
             * <li>Product.VPC</li>
             * <li>Product.FC</li>
             * <li>...</li>
             * </ul>
             * </li>
             * </ol>
             * 
             * <strong>example:</strong>
             * <p>ACS::Template</p>
             */
            public Builder actionType(String actionType) {
                this.actionType = actionType;
                return this;
            }

            /**
             * <p>The time when the action was created.</p>
             * 
             * <strong>example:</strong>
             * <p>2019-05-16T10:26:14Z</p>
             */
            public Builder createdDate(String createdDate) {
                this.createdDate = createdDate;
                return this;
            }

            /**
             * <p>The description of the action.</p>
             * 
             * <strong>example:</strong>
             * <p>ReplaceSystemDisk</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The name of the action.</p>
             * 
             * <strong>example:</strong>
             * <p>ACS::ECS::ReplaceSystemDisk</p>
             */
            public Builder OOSActionName(String OOSActionName) {
                this.OOSActionName = OOSActionName;
                return this;
            }

            /**
             * <p>The number of times that the action is used.</p>
             * 
             * <strong>example:</strong>
             * <p>5</p>
             */
            public Builder popularity(Integer popularity) {
                this.popularity = popularity;
                return this;
            }

            /**
             * <p>The parameters of the action.</p>
             * 
             * <strong>example:</strong>
             * <p>{ &quot;ImageId&quot;: { &quot;Description&quot;: &quot;The mirror ID you will use when resetting the system&quot;, &quot;Type&quot;: &quot;String&quot; }, &quot;InstanceId&quot;: { &quot;Description&quot;: &quot;the instance id that you will handle .&quot;, &quot;Type&quot;: &quot;String&quot; } }</p>
             */
            public Builder properties(String properties) {
                this.properties = properties;
                return this;
            }

            /**
             * <p>The version of the template that corresponds to the action.</p>
             * <blockquote>
             * <p> For atomic actions, this parameter is not returned.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>v1</p>
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
