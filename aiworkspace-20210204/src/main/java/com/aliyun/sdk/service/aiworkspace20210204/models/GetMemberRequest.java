// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aiworkspace20210204.models;

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
 * {@link GetMemberRequest} extends {@link RequestModel}
 *
 * <p>GetMemberRequest</p>
 */
public class GetMemberRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("WorkspaceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String workspaceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MemberId")
    private String memberId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UserId")
    private String userId;

    private GetMemberRequest(Builder builder) {
        super(builder);
        this.workspaceId = builder.workspaceId;
        this.memberId = builder.memberId;
        this.userId = builder.userId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetMemberRequest create() {
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
     * @return memberId
     */
    public String getMemberId() {
        return this.memberId;
    }

    /**
     * @return userId
     */
    public String getUserId() {
        return this.userId;
    }

    public static final class Builder extends Request.Builder<GetMemberRequest, Builder> {
        private String workspaceId; 
        private String memberId; 
        private String userId; 

        private Builder() {
            super();
        } 

        private Builder(GetMemberRequest request) {
            super(request);
            this.workspaceId = request.workspaceId;
            this.memberId = request.memberId;
            this.userId = request.userId;
        } 

        /**
         * <p>The workspace ID. You can call <a href="https://help.aliyun.com/document_detail/449124.html">ListWorkspaces</a> to obtain the workspace ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>145883</p>
         */
        public Builder workspaceId(String workspaceId) {
            this.putPathParameter("WorkspaceId", workspaceId);
            this.workspaceId = workspaceId;
            return this;
        }

        /**
         * <p>The member ID. You must specify only one of the following parameters: UserId and MemberId.</p>
         * 
         * <strong>example:</strong>
         * <p>145883-21513926******88039</p>
         */
        public Builder memberId(String memberId) {
            this.putQueryParameter("MemberId", memberId);
            this.memberId = memberId;
            return this;
        }

        /**
         * <p>The ID of the Alibaba Cloud account. You can call <a href="https://help.aliyun.com/document_detail/449133.html">ListWorkspaceUsers</a> to obtain the ID of the Alibaba Cloud account. You must specify only one of the following parameters: UserId and MemberId.</p>
         * 
         * <strong>example:</strong>
         * <p>21513926******88039</p>
         */
        public Builder userId(String userId) {
            this.putQueryParameter("UserId", userId);
            this.userId = userId;
            return this;
        }

        @Override
        public GetMemberRequest build() {
            return new GetMemberRequest(this);
        } 

    } 

}
