// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.resourcecenter20221201.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetSavedQueryResponseBody} extends {@link TeaModel}
 *
 * <p>GetSavedQueryResponseBody</p>
 */
public class GetSavedQueryResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("SavedQuery")
    private SavedQuery savedQuery;

    private GetSavedQueryResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.savedQuery = builder.savedQuery;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetSavedQueryResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return savedQuery
     */
    public SavedQuery getSavedQuery() {
        return this.savedQuery;
    }

    public static final class Builder {
        private String requestId; 
        private SavedQuery savedQuery; 

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The information about the custom query template.
         */
        public Builder savedQuery(SavedQuery savedQuery) {
            this.savedQuery = savedQuery;
            return this;
        }

        public GetSavedQueryResponseBody build() {
            return new GetSavedQueryResponseBody(this);
        } 

    } 

    public static class SavedQuery extends TeaModel {
        @NameInMap("CreateTime")
        private String createTime;

        @NameInMap("Description")
        private String description;

        @NameInMap("Expression")
        private String expression;

        @NameInMap("Name")
        private String name;

        @NameInMap("QueryId")
        private String queryId;

        @NameInMap("UpdateTime")
        private String updateTime;

        private SavedQuery(Builder builder) {
            this.createTime = builder.createTime;
            this.description = builder.description;
            this.expression = builder.expression;
            this.name = builder.name;
            this.queryId = builder.queryId;
            this.updateTime = builder.updateTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SavedQuery create() {
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
         * @return expression
         */
        public String getExpression() {
            return this.expression;
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
            private String expression; 
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
             * The query statement in the template.
             */
            public Builder expression(String expression) {
                this.expression = expression;
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

            public SavedQuery build() {
                return new SavedQuery(this);
            } 

        } 

    }
}
