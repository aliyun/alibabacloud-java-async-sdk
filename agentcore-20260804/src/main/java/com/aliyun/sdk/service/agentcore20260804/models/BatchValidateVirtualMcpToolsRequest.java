// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.agentcore20260804.models;

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
 * {@link BatchValidateVirtualMcpToolsRequest} extends {@link RequestModel}
 *
 * <p>BatchValidateVirtualMcpToolsRequest</p>
 */
public class BatchValidateVirtualMcpToolsRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("workspaceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String workspaceId;

    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("regionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("body")
    @com.aliyun.core.annotation.Validation(required = true)
    private BatchValidateVirtualMcpToolsRequestBody body;

    private BatchValidateVirtualMcpToolsRequest(Builder builder) {
        super(builder);
        this.workspaceId = builder.workspaceId;
        this.regionId = builder.regionId;
        this.body = builder.body;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static BatchValidateVirtualMcpToolsRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return workspaceId
     */
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return body
     */
    public BatchValidateVirtualMcpToolsRequestBody getBody() {
        return this.body;
    }

    public static final class Builder extends Request.Builder<BatchValidateVirtualMcpToolsRequest, Builder> {
        private String workspaceId; 
        private String regionId; 
        private BatchValidateVirtualMcpToolsRequestBody body; 

        private Builder() {
            super();
        } 

        private Builder(BatchValidateVirtualMcpToolsRequest request) {
            super(request);
            this.workspaceId = request.workspaceId;
            this.regionId = request.regionId;
            this.body = request.body;
        } 

        /**
         * <p>The AgentCore workspace ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>workspace-id</p>
         */
        public Builder workspaceId(String workspaceId) {
            this.putPathParameter("workspaceId", workspaceId);
            this.workspaceId = workspaceId;
            return this;
        }

        /**
         * regionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("regionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The batch validation request.</p>
         * <p>This parameter is required.</p>
         */
        public Builder body(BatchValidateVirtualMcpToolsRequestBody body) {
            String bodyShrink = shrink(body, "body", "json");
            this.putBodyParameter("body", bodyShrink);
            this.body = body;
            return this;
        }

        @Override
        public BatchValidateVirtualMcpToolsRequest build() {
            return new BatchValidateVirtualMcpToolsRequest(this);
        } 

    } 

    /**
     * 
     * {@link BatchValidateVirtualMcpToolsRequest} extends {@link TeaModel}
     *
     * <p>BatchValidateVirtualMcpToolsRequest</p>
     */
    public static class BatchValidateVirtualMcpToolsRequestBody extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("mcpIds")
        @com.aliyun.core.annotation.Validation(required = true)
        private java.util.List<String> mcpIds;

        private BatchValidateVirtualMcpToolsRequestBody(Builder builder) {
            this.mcpIds = builder.mcpIds;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static BatchValidateVirtualMcpToolsRequestBody create() {
            return builder().build();
        }

        /**
         * @return mcpIds
         */
        public java.util.List<String> getMcpIds() {
            return this.mcpIds;
        }

        public static final class Builder {
            private java.util.List<String> mcpIds; 

            private Builder() {
            } 

            private Builder(BatchValidateVirtualMcpToolsRequestBody model) {
                this.mcpIds = model.mcpIds;
            } 

            /**
             * <p>The saved virtual MCP IDs in the current workspace. You can specify 1 to 20 unique IDs. The server validates the IDs based on the saved tool selections, revision numbers, and digest baselines. A single batch can involve up to 10 different source MCPs, and up to 10 sources can be checked concurrently in each round.</p>
             * <p>This parameter is required.</p>
             */
            public Builder mcpIds(java.util.List<String> mcpIds) {
                this.mcpIds = mcpIds;
                return this;
            }

            public BatchValidateVirtualMcpToolsRequestBody build() {
                return new BatchValidateVirtualMcpToolsRequestBody(this);
            } 

        } 

    }
}
