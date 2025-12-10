// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.paistudio20210202.models;

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
 * {@link ListAuthRolesRequest} extends {@link RequestModel}
 *
 * <p>ListAuthRolesRequest</p>
 */
public class ListAuthRolesRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IsGenerateToken")
    private String isGenerateToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("WorkspaceId")
    private String workspaceId;

    private ListAuthRolesRequest(Builder builder) {
        super(builder);
        this.isGenerateToken = builder.isGenerateToken;
        this.workspaceId = builder.workspaceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListAuthRolesRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return isGenerateToken
     */
    public String getIsGenerateToken() {
        return this.isGenerateToken;
    }

    /**
     * @return workspaceId
     */
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    public static final class Builder extends Request.Builder<ListAuthRolesRequest, Builder> {
        private String isGenerateToken; 
        private String workspaceId; 

        private Builder() {
            super();
        } 

        private Builder(ListAuthRolesRequest request) {
            super(request);
            this.isGenerateToken = request.isGenerateToken;
            this.workspaceId = request.workspaceId;
        } 

        /**
         * IsGenerateToken.
         */
        public Builder isGenerateToken(String isGenerateToken) {
            this.putQueryParameter("IsGenerateToken", isGenerateToken);
            this.isGenerateToken = isGenerateToken;
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
        public ListAuthRolesRequest build() {
            return new ListAuthRolesRequest(this);
        } 

    } 

}
