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
 * {@link MmAppBindingMcpRequest} extends {@link RequestModel}
 *
 * <p>MmAppBindingMcpRequest</p>
 */
public class MmAppBindingMcpRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AppId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String appId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Mcps")
    private java.util.List<Mcps> mcps;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("WorkspaceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String workspaceId;

    private MmAppBindingMcpRequest(Builder builder) {
        super(builder);
        this.appId = builder.appId;
        this.mcps = builder.mcps;
        this.workspaceId = builder.workspaceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static MmAppBindingMcpRequest create() {
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
     * @return mcps
     */
    public java.util.List<Mcps> getMcps() {
        return this.mcps;
    }

    /**
     * @return workspaceId
     */
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    public static final class Builder extends Request.Builder<MmAppBindingMcpRequest, Builder> {
        private String appId; 
        private java.util.List<Mcps> mcps; 
        private String workspaceId; 

        private Builder() {
            super();
        } 

        private Builder(MmAppBindingMcpRequest request) {
            super(request);
            this.appId = request.appId;
            this.mcps = request.mcps;
            this.workspaceId = request.workspaceId;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>mm_a2eb4e04b48041108edb1f6de815</p>
         */
        public Builder appId(String appId) {
            this.putQueryParameter("AppId", appId);
            this.appId = appId;
            return this;
        }

        /**
         * Mcps.
         */
        public Builder mcps(java.util.List<Mcps> mcps) {
            String mcpsShrink = shrink(mcps, "Mcps", "json");
            this.putQueryParameter("Mcps", mcpsShrink);
            this.mcps = mcps;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>llm-o8ixktz41iyd2b6p</p>
         */
        public Builder workspaceId(String workspaceId) {
            this.putQueryParameter("WorkspaceId", workspaceId);
            this.workspaceId = workspaceId;
            return this;
        }

        @Override
        public MmAppBindingMcpRequest build() {
            return new MmAppBindingMcpRequest(this);
        } 

    } 

    /**
     * 
     * {@link MmAppBindingMcpRequest} extends {@link TeaModel}
     *
     * <p>MmAppBindingMcpRequest</p>
     */
    public static class Mcps extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Code")
        private String code;

        @com.aliyun.core.annotation.NameInMap("ToolList")
        private java.util.List<String> toolList;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        private Mcps(Builder builder) {
            this.code = builder.code;
            this.toolList = builder.toolList;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Mcps create() {
            return builder().build();
        }

        /**
         * @return code
         */
        public String getCode() {
            return this.code;
        }

        /**
         * @return toolList
         */
        public java.util.List<String> getToolList() {
            return this.toolList;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private String code; 
            private java.util.List<String> toolList; 
            private String type; 

            private Builder() {
            } 

            private Builder(Mcps model) {
                this.code = model.code;
                this.toolList = model.toolList;
                this.type = model.type;
            } 

            /**
             * Code.
             */
            public Builder code(String code) {
                this.code = code;
                return this;
            }

            /**
             * ToolList.
             */
            public Builder toolList(java.util.List<String> toolList) {
                this.toolList = toolList;
                return this;
            }

            /**
             * Type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public Mcps build() {
                return new Mcps(this);
            } 

        } 

    }
}
