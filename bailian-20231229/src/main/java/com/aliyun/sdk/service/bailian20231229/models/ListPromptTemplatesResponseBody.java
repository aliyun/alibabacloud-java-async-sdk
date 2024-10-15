// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.bailian20231229.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ListPromptTemplatesResponseBody} extends {@link TeaModel}
 *
 * <p>ListPromptTemplatesResponseBody</p>
 */
public class ListPromptTemplatesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("maxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.NameInMap("nextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("promptTemplates")
    private java.util.List < PromptTemplates> promptTemplates;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("totalCount")
    private Integer totalCount;

    @com.aliyun.core.annotation.NameInMap("workspaceId")
    private String workspaceId;

    private ListPromptTemplatesResponseBody(Builder builder) {
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.promptTemplates = builder.promptTemplates;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
        this.workspaceId = builder.workspaceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListPromptTemplatesResponseBody create() {
        return builder().build();
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
     * @return promptTemplates
     */
    public java.util.List < PromptTemplates> getPromptTemplates() {
        return this.promptTemplates;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    /**
     * @return workspaceId
     */
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    public static final class Builder {
        private Integer maxResults; 
        private String nextToken; 
        private java.util.List < PromptTemplates> promptTemplates; 
        private String requestId; 
        private Integer totalCount; 
        private String workspaceId; 

        /**
         * maxResults.
         */
        public Builder maxResults(Integer maxResults) {
            this.maxResults = maxResults;
            return this;
        }

        /**
         * nextToken.
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * promptTemplates.
         */
        public Builder promptTemplates(java.util.List < PromptTemplates> promptTemplates) {
            this.promptTemplates = promptTemplates;
            return this;
        }

        /**
         * requestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * totalCount.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        /**
         * workspaceId.
         */
        public Builder workspaceId(String workspaceId) {
            this.workspaceId = workspaceId;
            return this;
        }

        public ListPromptTemplatesResponseBody build() {
            return new ListPromptTemplatesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListPromptTemplatesResponseBody} extends {@link TeaModel}
     *
     * <p>ListPromptTemplatesResponseBody</p>
     */
    public static class PromptTemplates extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("content")
        private String content;

        @com.aliyun.core.annotation.NameInMap("name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("promptTemplateId")
        private String promptTemplateId;

        @com.aliyun.core.annotation.NameInMap("type")
        private String type;

        @com.aliyun.core.annotation.NameInMap("variables")
        private java.util.List < String > variables;

        private PromptTemplates(Builder builder) {
            this.content = builder.content;
            this.name = builder.name;
            this.promptTemplateId = builder.promptTemplateId;
            this.type = builder.type;
            this.variables = builder.variables;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PromptTemplates create() {
            return builder().build();
        }

        /**
         * @return content
         */
        public String getContent() {
            return this.content;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return promptTemplateId
         */
        public String getPromptTemplateId() {
            return this.promptTemplateId;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        /**
         * @return variables
         */
        public java.util.List < String > getVariables() {
            return this.variables;
        }

        public static final class Builder {
            private String content; 
            private String name; 
            private String promptTemplateId; 
            private String type; 
            private java.util.List < String > variables; 

            /**
             * content.
             */
            public Builder content(String content) {
                this.content = content;
                return this;
            }

            /**
             * name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * promptTemplateId.
             */
            public Builder promptTemplateId(String promptTemplateId) {
                this.promptTemplateId = promptTemplateId;
                return this;
            }

            /**
             * type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * variables.
             */
            public Builder variables(java.util.List < String > variables) {
                this.variables = variables;
                return this;
            }

            public PromptTemplates build() {
                return new PromptTemplates(this);
            } 

        } 

    }
}
