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
 * {@link DescribeDataAgentSkillDownloadRequest} extends {@link RequestModel}
 *
 * <p>DescribeDataAgentSkillDownloadRequest</p>
 */
public class DescribeDataAgentSkillDownloadRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SkillId")
    private String skillId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("WorkspaceId")
    private String workspaceId;

    private DescribeDataAgentSkillDownloadRequest(Builder builder) {
        super(builder);
        this.skillId = builder.skillId;
        this.workspaceId = builder.workspaceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDataAgentSkillDownloadRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return skillId
     */
    public String getSkillId() {
        return this.skillId;
    }

    /**
     * @return workspaceId
     */
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    public static final class Builder extends Request.Builder<DescribeDataAgentSkillDownloadRequest, Builder> {
        private String skillId; 
        private String workspaceId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeDataAgentSkillDownloadRequest request) {
            super(request);
            this.skillId = request.skillId;
            this.workspaceId = request.workspaceId;
        } 

        /**
         * <p>The skill ID.</p>
         * 
         * <strong>example:</strong>
         * <p>ski-04pomiln*************j0</p>
         */
        public Builder skillId(String skillId) {
            this.putQueryParameter("SkillId", skillId);
            this.skillId = skillId;
            return this;
        }

        /**
         * <p>The workspace ID.</p>
         * 
         * <strong>example:</strong>
         * <p>2ktbdovwf6********cznfo</p>
         */
        public Builder workspaceId(String workspaceId) {
            this.putQueryParameter("WorkspaceId", workspaceId);
            this.workspaceId = workspaceId;
            return this;
        }

        @Override
        public DescribeDataAgentSkillDownloadRequest build() {
            return new DescribeDataAgentSkillDownloadRequest(this);
        } 

    } 

}
