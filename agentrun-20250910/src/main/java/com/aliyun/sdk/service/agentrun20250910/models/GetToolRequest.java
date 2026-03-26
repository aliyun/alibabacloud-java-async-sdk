// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.agentrun20250910.models;

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
 * {@link GetToolRequest} extends {@link RequestModel}
 *
 * <p>GetToolRequest</p>
 */
public class GetToolRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("toolName")
    private String toolName;

    private GetToolRequest(Builder builder) {
        super(builder);
        this.toolName = builder.toolName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetToolRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return toolName
     */
    public String getToolName() {
        return this.toolName;
    }

    public static final class Builder extends Request.Builder<GetToolRequest, Builder> {
        private String toolName; 

        private Builder() {
            super();
        } 

        private Builder(GetToolRequest request) {
            super(request);
            this.toolName = request.toolName;
        } 

        /**
         * <p>要查询的工具名称，路径参数</p>
         * 
         * <strong>example:</strong>
         * <p>my-mcp-tool</p>
         */
        public Builder toolName(String toolName) {
            this.putPathParameter("toolName", toolName);
            this.toolName = toolName;
            return this;
        }

        @Override
        public GetToolRequest build() {
            return new GetToolRequest(this);
        } 

    } 

}
