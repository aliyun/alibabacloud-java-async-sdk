// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.safconsole20250521.models;

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
 * {@link DeployModelFileRequest} extends {@link RequestModel}
 *
 * <p>DeployModelFileRequest</p>
 */
public class DeployModelFileRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("GroupId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long groupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ProjectId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long projectId;

    private DeployModelFileRequest(Builder builder) {
        super(builder);
        this.groupId = builder.groupId;
        this.projectId = builder.projectId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeployModelFileRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return groupId
     */
    public Long getGroupId() {
        return this.groupId;
    }

    /**
     * @return projectId
     */
    public Long getProjectId() {
        return this.projectId;
    }

    public static final class Builder extends Request.Builder<DeployModelFileRequest, Builder> {
        private Long groupId; 
        private Long projectId; 

        private Builder() {
            super();
        } 

        private Builder(DeployModelFileRequest request) {
            super(request);
            this.groupId = request.groupId;
            this.projectId = request.projectId;
        } 

        /**
         * <p>File Group ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>01</p>
         */
        public Builder groupId(Long groupId) {
            this.putQueryParameter("GroupId", groupId);
            this.groupId = groupId;
            return this;
        }

        /**
         * <p>Project ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>01</p>
         */
        public Builder projectId(Long projectId) {
            this.putQueryParameter("ProjectId", projectId);
            this.projectId = projectId;
            return this;
        }

        @Override
        public DeployModelFileRequest build() {
            return new DeployModelFileRequest(this);
        } 

    } 

}
