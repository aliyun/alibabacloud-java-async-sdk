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
 * {@link DeleteProfileRequest} extends {@link RequestModel}
 *
 * <p>DeleteProfileRequest</p>
 */
public class DeleteProfileRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AppId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String appId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UserDefinedId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String userDefinedId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("WorkspaceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String workspaceId;

    private DeleteProfileRequest(Builder builder) {
        super(builder);
        this.appId = builder.appId;
        this.userDefinedId = builder.userDefinedId;
        this.workspaceId = builder.workspaceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteProfileRequest create() {
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

    public static final class Builder extends Request.Builder<DeleteProfileRequest, Builder> {
        private String appId; 
        private String userDefinedId; 
        private String workspaceId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteProfileRequest request) {
            super(request);
            this.appId = request.appId;
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
        public DeleteProfileRequest build() {
            return new DeleteProfileRequest(this);
        } 

    } 

}
