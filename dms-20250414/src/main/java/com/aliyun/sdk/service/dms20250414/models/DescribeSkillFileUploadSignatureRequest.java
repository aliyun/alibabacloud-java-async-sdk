// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dms20250414.models;

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
 * {@link DescribeSkillFileUploadSignatureRequest} extends {@link RequestModel}
 *
 * <p>DescribeSkillFileUploadSignatureRequest</p>
 */
public class DescribeSkillFileUploadSignatureRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("WorkspaceId")
    private String workspaceId;

    private DescribeSkillFileUploadSignatureRequest(Builder builder) {
        super(builder);
        this.workspaceId = builder.workspaceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeSkillFileUploadSignatureRequest create() {
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

    public static final class Builder extends Request.Builder<DescribeSkillFileUploadSignatureRequest, Builder> {
        private String workspaceId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeSkillFileUploadSignatureRequest request) {
            super(request);
            this.workspaceId = request.workspaceId;
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
        public DescribeSkillFileUploadSignatureRequest build() {
            return new DescribeSkillFileUploadSignatureRequest(this);
        } 

    } 

}
