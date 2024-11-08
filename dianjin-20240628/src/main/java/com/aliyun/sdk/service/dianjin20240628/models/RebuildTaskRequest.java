// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dianjin20240628.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link RebuildTaskRequest} extends {@link RequestModel}
 *
 * <p>RebuildTaskRequest</p>
 */
public class RebuildTaskRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("workspaceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String workspaceId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("taskIds")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List < String > taskIds;

    private RebuildTaskRequest(Builder builder) {
        super(builder);
        this.workspaceId = builder.workspaceId;
        this.taskIds = builder.taskIds;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RebuildTaskRequest create() {
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
     * @return taskIds
     */
    public java.util.List < String > getTaskIds() {
        return this.taskIds;
    }

    public static final class Builder extends Request.Builder<RebuildTaskRequest, Builder> {
        private String workspaceId; 
        private java.util.List < String > taskIds; 

        private Builder() {
            super();
        } 

        private Builder(RebuildTaskRequest request) {
            super(request);
            this.workspaceId = request.workspaceId;
            this.taskIds = request.taskIds;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>llm-xxxxx</p>
         */
        public Builder workspaceId(String workspaceId) {
            this.putPathParameter("workspaceId", workspaceId);
            this.workspaceId = workspaceId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder taskIds(java.util.List < String > taskIds) {
            this.putBodyParameter("taskIds", taskIds);
            this.taskIds = taskIds;
            return this;
        }

        @Override
        public RebuildTaskRequest build() {
            return new RebuildTaskRequest(this);
        } 

    } 

}
