// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aiworkspace20210204.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetMemberRequest} extends {@link RequestModel}
 *
 * <p>GetMemberRequest</p>
 */
public class GetMemberRequest extends Request {
    @Path
    @NameInMap("WorkspaceId")
    @Validation(required = true)
    private String workspaceId;

    @Query
    @NameInMap("UserId")
    @Validation(required = true)
    private String userId;

    private GetMemberRequest(Builder builder) {
        super(builder);
        this.workspaceId = builder.workspaceId;
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
     * @return userId
     */
    public String getUserId() {
        return this.userId;
    }

    public static final class Builder extends Request.Builder<GetMemberRequest, Builder> {
        private String workspaceId; 
        private String userId; 

        private Builder() {
            super();
        } 

        private Builder(GetMemberRequest request) {
            super(request);
            this.workspaceId = request.workspaceId;
            this.userId = request.userId;
        } 

        /**
         * WorkspaceId.
         */
        public Builder workspaceId(String workspaceId) {
            this.putPathParameter("WorkspaceId", workspaceId);
            this.workspaceId = workspaceId;
            return this;
        }

        /**
         * UserId.
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
