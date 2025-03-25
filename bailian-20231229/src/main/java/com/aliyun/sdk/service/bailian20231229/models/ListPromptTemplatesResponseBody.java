// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.bailian20231229.models;

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
    private java.util.List<PromptTemplates> promptTemplates;

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
    public java.util.List<PromptTemplates> getPromptTemplates() {
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
        private java.util.List<PromptTemplates> promptTemplates; 
        private String requestId; 
        private Integer totalCount; 
        private String workspaceId; 

        /**
         * <p>The maximum number of returned entries.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder maxResults(Integer maxResults) {
            this.maxResults = maxResults;
            return this;
        }

        /**
         * <p>The token that determines the start position of the next query.</p>
         * 
         * <strong>example:</strong>
         * <p>dc270401186b433f975d7e1faaa34e0e</p>
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>The templates.</p>
         */
        public Builder promptTemplates(java.util.List<PromptTemplates> promptTemplates) {
            this.promptTemplates = promptTemplates;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>FE9B6CBF-47E6-5D76-9C5D-B814DD5AB071</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of entries returned.</p>
         * 
         * <strong>example:</strong>
         * <p>15</p>
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        /**
         * <p>The workspace ID.</p>
         * 
         * <strong>example:</strong>
         * <p>llm-us9hjmt32nysdxxx</p>
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
        private java.util.List<String> variables;

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
        public java.util.List<String> getVariables() {
            return this.variables;
        }

        public static final class Builder {
            private String content; 
            private String name; 
            private String promptTemplateId; 
            private String type; 
            private java.util.List<String> variables; 

            /**
             * <p>The template content</p>
             */
            public Builder content(String content) {
                this.content = content;
                return this;
            }

            /**
             * <p>The template name.</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The template ID.</p>
             * 
             * <strong>example:</strong>
             * <p>d6935b7efbe34d11b13df9307151cf8c</p>
             */
            public Builder promptTemplateId(String promptTemplateId) {
                this.promptTemplateId = promptTemplateId;
                return this;
            }

            /**
             * <p>The template type.</p>
             * 
             * <strong>example:</strong>
             * <p>&quot;System&quot;</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * <p>The variables of the template.</p>
             */
            public Builder variables(java.util.List<String> variables) {
                this.variables = variables;
                return this;
            }

            public PromptTemplates build() {
                return new PromptTemplates(this);
            } 

        } 

    }
}
