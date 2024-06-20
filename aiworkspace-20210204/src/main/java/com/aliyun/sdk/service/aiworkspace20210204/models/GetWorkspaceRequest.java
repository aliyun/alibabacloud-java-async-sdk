// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aiworkspace20210204.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetWorkspaceRequest} extends {@link RequestModel}
 *
 * <p>GetWorkspaceRequest</p>
 */
public class GetWorkspaceRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("WorkspaceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String workspaceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Verbose")
    private Boolean verbose;

    private GetWorkspaceRequest(Builder builder) {
        super(builder);
        this.workspaceId = builder.workspaceId;
        this.verbose = builder.verbose;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetWorkspaceRequest create() {
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
     * @return verbose
     */
    public Boolean getVerbose() {
        return this.verbose;
    }

    public static final class Builder extends Request.Builder<GetWorkspaceRequest, Builder> {
        private String workspaceId; 
        private Boolean verbose; 

        private Builder() {
            super();
        } 

        private Builder(GetWorkspaceRequest request) {
            super(request);
            this.workspaceId = request.workspaceId;
            this.verbose = request.verbose;
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
         * Verbose.
         */
        public Builder verbose(Boolean verbose) {
            this.putQueryParameter("Verbose", verbose);
            this.verbose = verbose;
            return this;
        }

        @Override
        public GetWorkspaceRequest build() {
            return new GetWorkspaceRequest(this);
        } 

    } 

}
