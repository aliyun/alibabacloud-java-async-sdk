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
 * {@link GetAgentSpecImportFileUrlRequest} extends {@link RequestModel}
 *
 * <p>GetAgentSpecImportFileUrlRequest</p>
 */
public class GetAgentSpecImportFileUrlRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("workspaceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String workspaceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("contentType")
    private String contentType;

    private GetAgentSpecImportFileUrlRequest(Builder builder) {
        super(builder);
        this.workspaceId = builder.workspaceId;
        this.contentType = builder.contentType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetAgentSpecImportFileUrlRequest create() {
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
     * @return contentType
     */
    public String getContentType() {
        return this.contentType;
    }

    public static final class Builder extends Request.Builder<GetAgentSpecImportFileUrlRequest, Builder> {
        private String workspaceId; 
        private String contentType; 

        private Builder() {
            super();
        } 

        private Builder(GetAgentSpecImportFileUrlRequest request) {
            super(request);
            this.workspaceId = request.workspaceId;
            this.contentType = request.contentType;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>550e8400-e29b-41d4-a716-446655440000</p>
         */
        public Builder workspaceId(String workspaceId) {
            this.putPathParameter("workspaceId", workspaceId);
            this.workspaceId = workspaceId;
            return this;
        }

        /**
         * contentType.
         */
        public Builder contentType(String contentType) {
            this.putQueryParameter("contentType", contentType);
            this.contentType = contentType;
            return this;
        }

        @Override
        public GetAgentSpecImportFileUrlRequest build() {
            return new GetAgentSpecImportFileUrlRequest(this);
        } 

    } 

}
