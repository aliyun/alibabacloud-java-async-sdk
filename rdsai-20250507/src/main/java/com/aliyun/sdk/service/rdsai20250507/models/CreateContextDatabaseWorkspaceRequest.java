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
 * {@link CreateContextDatabaseWorkspaceRequest} extends {@link RequestModel}
 *
 * <p>CreateContextDatabaseWorkspaceRequest</p>
 */
public class CreateContextDatabaseWorkspaceRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MemberName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String memberName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("WorkspaceName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String workspaceName;

    private CreateContextDatabaseWorkspaceRequest(Builder builder) {
        super(builder);
        this.memberName = builder.memberName;
        this.workspaceName = builder.workspaceName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateContextDatabaseWorkspaceRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return memberName
     */
    public String getMemberName() {
        return this.memberName;
    }

    /**
     * @return workspaceName
     */
    public String getWorkspaceName() {
        return this.workspaceName;
    }

    public static final class Builder extends Request.Builder<CreateContextDatabaseWorkspaceRequest, Builder> {
        private String memberName; 
        private String workspaceName; 

        private Builder() {
            super();
        } 

        private Builder(CreateContextDatabaseWorkspaceRequest request) {
            super(request);
            this.memberName = request.memberName;
            this.workspaceName = request.workspaceName;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>my-member</p>
         */
        public Builder memberName(String memberName) {
            this.putQueryParameter("MemberName", memberName);
            this.memberName = memberName;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>my-workspace</p>
         */
        public Builder workspaceName(String workspaceName) {
            this.putQueryParameter("WorkspaceName", workspaceName);
            this.workspaceName = workspaceName;
            return this;
        }

        @Override
        public CreateContextDatabaseWorkspaceRequest build() {
            return new CreateContextDatabaseWorkspaceRequest(this);
        } 

    } 

}
