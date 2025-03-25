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
 * {@link GetPromptTemplateResponseBody} extends {@link TeaModel}
 *
 * <p>GetPromptTemplateResponseBody</p>
 */
public class GetPromptTemplateResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("content")
    private String content;

    @com.aliyun.core.annotation.NameInMap("name")
    private String name;

    @com.aliyun.core.annotation.NameInMap("promptTemplateId")
    private String promptTemplateId;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("variables")
    private java.util.List<String> variables;

    @com.aliyun.core.annotation.NameInMap("workspaceId")
    private String workspaceId;

    private GetPromptTemplateResponseBody(Builder builder) {
        this.content = builder.content;
        this.name = builder.name;
        this.promptTemplateId = builder.promptTemplateId;
        this.requestId = builder.requestId;
        this.variables = builder.variables;
        this.workspaceId = builder.workspaceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetPromptTemplateResponseBody create() {
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
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return variables
     */
    public java.util.List<String> getVariables() {
        return this.variables;
    }

    /**
     * @return workspaceId
     */
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    public static final class Builder {
        private String content; 
        private String name; 
        private String promptTemplateId; 
        private String requestId; 
        private java.util.List<String> variables; 
        private String workspaceId; 

        /**
         * <p>The template content.</p>
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
         * <p>6e49109bfeb94a39bb268f4e483ccxxx</p>
         */
        public Builder promptTemplateId(String promptTemplateId) {
            this.promptTemplateId = promptTemplateId;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>8C56C7AF-6573-19CE-B018-E05E1EDCF4C5</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The variables of the template.</p>
         * 
         * <strong>example:</strong>
         * <p>[&quot;theme&quot;]</p>
         */
        public Builder variables(java.util.List<String> variables) {
            this.variables = variables;
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

        public GetPromptTemplateResponseBody build() {
            return new GetPromptTemplateResponseBody(this);
        } 

    } 

}
