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
 * {@link DeleteMemoryRequest} extends {@link RequestModel}
 *
 * <p>DeleteMemoryRequest</p>
 */
public class DeleteMemoryRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AppId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String appId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MemoryNodeId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String memoryNodeId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UserDefinedId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String userDefinedId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("WorkspaceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String workspaceId;

    private DeleteMemoryRequest(Builder builder) {
        super(builder);
        this.appId = builder.appId;
        this.memoryNodeId = builder.memoryNodeId;
        this.userDefinedId = builder.userDefinedId;
        this.workspaceId = builder.workspaceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteMemoryRequest create() {
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
     * @return memoryNodeId
     */
    public String getMemoryNodeId() {
        return this.memoryNodeId;
    }

    /**
     * @return userDefinedId
     */
    public String getUserDefinedId() {
        return this.userDefinedId;
    }

    /**
     * @return workspaceId
     */
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    public static final class Builder extends Request.Builder<DeleteMemoryRequest, Builder> {
        private String appId; 
        private String memoryNodeId; 
        private String userDefinedId; 
        private String workspaceId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteMemoryRequest request) {
            super(request);
            this.appId = request.appId;
            this.memoryNodeId = request.memoryNodeId;
            this.userDefinedId = request.userDefinedId;
            this.workspaceId = request.workspaceId;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>mm_bfaf7e110b6d4359977d1686a3f8</p>
         */
        public Builder appId(String appId) {
            this.putQueryParameter("AppId", appId);
            this.appId = appId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>CD51C0ED-4666-13DA-BC7D-C0D21CBE16C</p>
         */
        public Builder memoryNodeId(String memoryNodeId) {
            this.putQueryParameter("MemoryNodeId", memoryNodeId);
            this.memoryNodeId = memoryNodeId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>5A7C969B-5101-112B-8202-DFAEEA4BFBED</p>
         */
        public Builder userDefinedId(String userDefinedId) {
            this.putQueryParameter("UserDefinedId", userDefinedId);
            this.userDefinedId = userDefinedId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>llm-jb5sabg80b4ts71g</p>
         */
        public Builder workspaceId(String workspaceId) {
            this.putQueryParameter("WorkspaceId", workspaceId);
            this.workspaceId = workspaceId;
            return this;
        }

        @Override
        public DeleteMemoryRequest build() {
            return new DeleteMemoryRequest(this);
        } 

    } 

}
