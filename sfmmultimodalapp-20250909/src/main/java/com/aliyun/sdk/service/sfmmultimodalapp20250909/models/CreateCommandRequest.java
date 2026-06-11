// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sfmmultimodalapp20250909.models;

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
 * {@link CreateCommandRequest} extends {@link RequestModel}
 *
 * <p>CreateCommandRequest</p>
 */
public class CreateCommandRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AppId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String appId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DomainCode")
    private String domainCode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DomainName")
    private String domainName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ReplyMode")
    private String replyMode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ToolDescription")
    @com.aliyun.core.annotation.Validation(required = true)
    private String toolDescription;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ToolExamples")
    private java.util.List<ToolExamples> toolExamples;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ToolName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String toolName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ToolParams")
    private java.util.List<ToolParams> toolParams;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("WorkspaceId")
    private String workspaceId;

    private CreateCommandRequest(Builder builder) {
        super(builder);
        this.appId = builder.appId;
        this.domainCode = builder.domainCode;
        this.domainName = builder.domainName;
        this.replyMode = builder.replyMode;
        this.toolDescription = builder.toolDescription;
        this.toolExamples = builder.toolExamples;
        this.toolName = builder.toolName;
        this.toolParams = builder.toolParams;
        this.workspaceId = builder.workspaceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateCommandRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return appId
     */
    public String getAppId() {
        return this.appId;
    }

    /**
     * @return domainCode
     */
    public String getDomainCode() {
        return this.domainCode;
    }

    /**
     * @return domainName
     */
    public String getDomainName() {
        return this.domainName;
    }

    /**
     * @return replyMode
     */
    public String getReplyMode() {
        return this.replyMode;
    }

    /**
     * @return toolDescription
     */
    public String getToolDescription() {
        return this.toolDescription;
    }

    /**
     * @return toolExamples
     */
    public java.util.List<ToolExamples> getToolExamples() {
        return this.toolExamples;
    }

    /**
     * @return toolName
     */
    public String getToolName() {
        return this.toolName;
    }

    /**
     * @return toolParams
     */
    public java.util.List<ToolParams> getToolParams() {
        return this.toolParams;
    }

    /**
     * @return workspaceId
     */
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    public static final class Builder extends Request.Builder<CreateCommandRequest, Builder> {
        private String appId; 
        private String domainCode; 
        private String domainName; 
        private String replyMode; 
        private String toolDescription; 
        private java.util.List<ToolExamples> toolExamples; 
        private String toolName; 
        private java.util.List<ToolParams> toolParams; 
        private String workspaceId; 

        private Builder() {
            super();
        } 

        private Builder(CreateCommandRequest request) {
            super(request);
            this.appId = request.appId;
            this.domainCode = request.domainCode;
            this.domainName = request.domainName;
            this.replyMode = request.replyMode;
            this.toolDescription = request.toolDescription;
            this.toolExamples = request.toolExamples;
            this.toolName = request.toolName;
            this.toolParams = request.toolParams;
            this.workspaceId = request.workspaceId;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>mm_axaxaaa</p>
         */
        public Builder appId(String appId) {
            this.putQueryParameter("AppId", appId);
            this.appId = appId;
            return this;
        }

        /**
         * DomainCode.
         */
        public Builder domainCode(String domainCode) {
            this.putQueryParameter("DomainCode", domainCode);
            this.domainCode = domainCode;
            return this;
        }

        /**
         * DomainName.
         */
        public Builder domainName(String domainName) {
            this.putQueryParameter("DomainName", domainName);
            this.domainName = domainName;
            return this;
        }

        /**
         * ReplyMode.
         */
        public Builder replyMode(String replyMode) {
            this.putQueryParameter("ReplyMode", replyMode);
            this.replyMode = replyMode;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>xxxx</p>
         */
        public Builder toolDescription(String toolDescription) {
            this.putQueryParameter("ToolDescription", toolDescription);
            this.toolDescription = toolDescription;
            return this;
        }

        /**
         * ToolExamples.
         */
        public Builder toolExamples(java.util.List<ToolExamples> toolExamples) {
            String toolExamplesShrink = shrink(toolExamples, "ToolExamples", "json");
            this.putQueryParameter("ToolExamples", toolExamplesShrink);
            this.toolExamples = toolExamples;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>open_bx</p>
         */
        public Builder toolName(String toolName) {
            this.putQueryParameter("ToolName", toolName);
            this.toolName = toolName;
            return this;
        }

        /**
         * ToolParams.
         */
        public Builder toolParams(java.util.List<ToolParams> toolParams) {
            String toolParamsShrink = shrink(toolParams, "ToolParams", "json");
            this.putQueryParameter("ToolParams", toolParamsShrink);
            this.toolParams = toolParams;
            return this;
        }

        /**
         * WorkspaceId.
         */
        public Builder workspaceId(String workspaceId) {
            this.putQueryParameter("WorkspaceId", workspaceId);
            this.workspaceId = workspaceId;
            return this;
        }

        @Override
        public CreateCommandRequest build() {
            return new CreateCommandRequest(this);
        } 

    } 

    /**
     * 
     * {@link CreateCommandRequest} extends {@link TeaModel}
     *
     * <p>CreateCommandRequest</p>
     */
    public static class ToolExamples extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Parameters")
        private java.util.Map<String, String> parameters;

        @com.aliyun.core.annotation.NameInMap("Query")
        private String query;

        private ToolExamples(Builder builder) {
            this.parameters = builder.parameters;
            this.query = builder.query;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ToolExamples create() {
            return builder().build();
        }

        /**
         * @return parameters
         */
        public java.util.Map<String, String> getParameters() {
            return this.parameters;
        }

        /**
         * @return query
         */
        public String getQuery() {
            return this.query;
        }

        public static final class Builder {
            private java.util.Map<String, String> parameters; 
            private String query; 

            private Builder() {
            } 

            private Builder(ToolExamples model) {
                this.parameters = model.parameters;
                this.query = model.query;
            } 

            /**
             * Parameters.
             */
            public Builder parameters(java.util.Map<String, String> parameters) {
                this.parameters = parameters;
                return this;
            }

            /**
             * Query.
             */
            public Builder query(String query) {
                this.query = query;
                return this;
            }

            public ToolExamples build() {
                return new ToolExamples(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateCommandRequest} extends {@link TeaModel}
     *
     * <p>CreateCommandRequest</p>
     */
    public static class ToolParams extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ParamDesc")
        private String paramDesc;

        @com.aliyun.core.annotation.NameInMap("ParamExample")
        private String paramExample;

        @com.aliyun.core.annotation.NameInMap("ParamName")
        private String paramName;

        @com.aliyun.core.annotation.NameInMap("ParamType")
        private String paramType;

        @com.aliyun.core.annotation.NameInMap("Required")
        private Boolean required;

        private ToolParams(Builder builder) {
            this.paramDesc = builder.paramDesc;
            this.paramExample = builder.paramExample;
            this.paramName = builder.paramName;
            this.paramType = builder.paramType;
            this.required = builder.required;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ToolParams create() {
            return builder().build();
        }

        /**
         * @return paramDesc
         */
        public String getParamDesc() {
            return this.paramDesc;
        }

        /**
         * @return paramExample
         */
        public String getParamExample() {
            return this.paramExample;
        }

        /**
         * @return paramName
         */
        public String getParamName() {
            return this.paramName;
        }

        /**
         * @return paramType
         */
        public String getParamType() {
            return this.paramType;
        }

        /**
         * @return required
         */
        public Boolean getRequired() {
            return this.required;
        }

        public static final class Builder {
            private String paramDesc; 
            private String paramExample; 
            private String paramName; 
            private String paramType; 
            private Boolean required; 

            private Builder() {
            } 

            private Builder(ToolParams model) {
                this.paramDesc = model.paramDesc;
                this.paramExample = model.paramExample;
                this.paramName = model.paramName;
                this.paramType = model.paramType;
                this.required = model.required;
            } 

            /**
             * ParamDesc.
             */
            public Builder paramDesc(String paramDesc) {
                this.paramDesc = paramDesc;
                return this;
            }

            /**
             * ParamExample.
             */
            public Builder paramExample(String paramExample) {
                this.paramExample = paramExample;
                return this;
            }

            /**
             * ParamName.
             */
            public Builder paramName(String paramName) {
                this.paramName = paramName;
                return this;
            }

            /**
             * ParamType.
             */
            public Builder paramType(String paramType) {
                this.paramType = paramType;
                return this;
            }

            /**
             * Required.
             */
            public Builder required(Boolean required) {
                this.required = required;
                return this;
            }

            public ToolParams build() {
                return new ToolParams(this);
            } 

        } 

    }
}
