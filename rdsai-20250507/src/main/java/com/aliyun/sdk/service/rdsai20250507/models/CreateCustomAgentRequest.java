// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rdsai20250507.models;

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
 * {@link CreateCustomAgentRequest} extends {@link RequestModel}
 *
 * <p>CreateCustomAgentRequest</p>
 */
public class CreateCustomAgentRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EnableTools")
    private Boolean enableTools;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Name")
    private String name;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SystemPrompt")
    @com.aliyun.core.annotation.Validation(required = true)
    private String systemPrompt;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Tools")
    private java.util.List<String> tools;

    private CreateCustomAgentRequest(Builder builder) {
        super(builder);
        this.enableTools = builder.enableTools;
        this.name = builder.name;
        this.systemPrompt = builder.systemPrompt;
        this.tools = builder.tools;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateCustomAgentRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return enableTools
     */
    public Boolean getEnableTools() {
        return this.enableTools;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return systemPrompt
     */
    public String getSystemPrompt() {
        return this.systemPrompt;
    }

    /**
     * @return tools
     */
    public java.util.List<String> getTools() {
        return this.tools;
    }

    public static final class Builder extends Request.Builder<CreateCustomAgentRequest, Builder> {
        private Boolean enableTools; 
        private String name; 
        private String systemPrompt; 
        private java.util.List<String> tools; 

        private Builder() {
            super();
        } 

        private Builder(CreateCustomAgentRequest request) {
            super(request);
            this.enableTools = request.enableTools;
            this.name = request.name;
            this.systemPrompt = request.systemPrompt;
            this.tools = request.tools;
        } 

        /**
         * EnableTools.
         */
        public Builder enableTools(Boolean enableTools) {
            this.putQueryParameter("EnableTools", enableTools);
            this.enableTools = enableTools;
            return this;
        }

        /**
         * Name.
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder systemPrompt(String systemPrompt) {
            this.putQueryParameter("SystemPrompt", systemPrompt);
            this.systemPrompt = systemPrompt;
            return this;
        }

        /**
         * Tools.
         */
        public Builder tools(java.util.List<String> tools) {
            String toolsShrink = shrink(tools, "Tools", "json");
            this.putQueryParameter("Tools", toolsShrink);
            this.tools = tools;
            return this;
        }

        @Override
        public CreateCustomAgentRequest build() {
            return new CreateCustomAgentRequest(this);
        } 

    } 

}
