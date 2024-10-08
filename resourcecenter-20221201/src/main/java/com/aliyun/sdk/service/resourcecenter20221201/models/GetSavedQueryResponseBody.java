// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.resourcecenter20221201.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link GetSavedQueryResponseBody} extends {@link TeaModel}
 *
 * <p>GetSavedQueryResponseBody</p>
 */
public class GetSavedQueryResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("SavedQuery")
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
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>6D98D9B0-318D-56A4-910C-93B5F945AF2B</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The information about the template.</p>
         */
        public Builder savedQuery(SavedQuery savedQuery) {
            this.savedQuery = savedQuery;
            return this;
        }

        public GetSavedQueryResponseBody build() {
            return new GetSavedQueryResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetSavedQueryResponseBody} extends {@link TeaModel}
     *
     * <p>GetSavedQueryResponseBody</p>
     */
    public static class SavedQuery extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("Expression")
        private String expression;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("QueryId")
        private String queryId;

        @com.aliyun.core.annotation.NameInMap("UpdateTime")
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
             * <p>The time when the template was created. The time is displayed in UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>2023-10-30T01:43:16Z</p>
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
             * <p>The query statement in the template.</p>
             * 
             * <strong>example:</strong>
             * <p>SELECT * FROM resources;</p>
             */
            public Builder expression(String expression) {
                this.expression = expression;
                return this;
            }

            /**
             * <p>The name of the template.</p>
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
             * <p>2023-10-30T01:43:16Z</p>
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
