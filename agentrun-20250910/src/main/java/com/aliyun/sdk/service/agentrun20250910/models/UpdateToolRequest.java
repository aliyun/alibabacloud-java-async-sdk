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
 * {@link UpdateToolRequest} extends {@link RequestModel}
 *
 * <p>UpdateToolRequest</p>
 */
public class UpdateToolRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("toolName")
    private String toolName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("body")
    private UpdateToolInputV2 body;

    private UpdateToolRequest(Builder builder) {
        super(builder);
        this.toolName = builder.toolName;
        this.body = builder.body;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateToolRequest create() {
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

    /**
     * @return body
     */
    public UpdateToolInputV2 getBody() {
        return this.body;
    }

    public static final class Builder extends Request.Builder<UpdateToolRequest, Builder> {
        private String toolName; 
        private UpdateToolInputV2 body; 

        private Builder() {
            super();
        } 

        private Builder(UpdateToolRequest request) {
            super(request);
            this.toolName = request.toolName;
            this.body = request.body;
        } 

        /**
         * <p>要更新的工具名称，路径参数</p>
         * 
         * <strong>example:</strong>
         * <p>my-mcp-tool</p>
         */
        public Builder toolName(String toolName) {
            this.putPathParameter("toolName", toolName);
            this.toolName = toolName;
            return this;
        }

        /**
         * <p>更新工具的请求参数，只需提供需要修改的字段</p>
         */
        public Builder body(UpdateToolInputV2 body) {
            this.putBodyParameter("body", body);
            this.body = body;
            return this;
        }

        @Override
        public UpdateToolRequest build() {
            return new UpdateToolRequest(this);
        } 

    } 

}
