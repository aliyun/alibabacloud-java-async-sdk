// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pai_dlc20201203.models;

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
 * {@link UpdateTensorboardRequest} extends {@link RequestModel}
 *
 * <p>UpdateTensorboardRequest</p>
 */
public class UpdateTensorboardRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("TensorboardId")
    @com.aliyun.core.annotation.Validation(required = true, maxLength = 256, minLength = 1)
    private String tensorboardId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Accessibility")
    private String accessibility;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MaxRunningTimeMinutes")
    private Long maxRunningTimeMinutes;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Priority")
    private String priority;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("WorkspaceId")
    private String workspaceId;

    private UpdateTensorboardRequest(Builder builder) {
        super(builder);
        this.tensorboardId = builder.tensorboardId;
        this.accessibility = builder.accessibility;
        this.maxRunningTimeMinutes = builder.maxRunningTimeMinutes;
        this.priority = builder.priority;
        this.workspaceId = builder.workspaceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateTensorboardRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return tensorboardId
     */
    public String getTensorboardId() {
        return this.tensorboardId;
    }

    /**
     * @return accessibility
     */
    public String getAccessibility() {
        return this.accessibility;
    }

    /**
     * @return maxRunningTimeMinutes
     */
    public Long getMaxRunningTimeMinutes() {
        return this.maxRunningTimeMinutes;
    }

    /**
     * @return priority
     */
    public String getPriority() {
        return this.priority;
    }

    /**
     * @return workspaceId
     */
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    public static final class Builder extends Request.Builder<UpdateTensorboardRequest, Builder> {
        private String tensorboardId; 
        private String accessibility; 
        private Long maxRunningTimeMinutes; 
        private String priority; 
        private String workspaceId; 

        private Builder() {
            super();
        } 

        private Builder(UpdateTensorboardRequest request) {
            super(request);
            this.tensorboardId = request.tensorboardId;
            this.accessibility = request.accessibility;
            this.maxRunningTimeMinutes = request.maxRunningTimeMinutes;
            this.priority = request.priority;
            this.workspaceId = request.workspaceId;
        } 

        /**
         * <p>Tensorboard ID. For more information about how to get a Tensorboard ID, see <a href="">ListTensorboards</a>.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>tensorboard-20210114104214-vf9lowjt3pso</p>
         */
        public Builder tensorboardId(String tensorboardId) {
            this.putPathParameter("TensorboardId", tensorboardId);
            this.tensorboardId = tensorboardId;
            return this;
        }

        /**
         * <p>Visibility of the task. Valid values:</p>
         * <ul>
         * <li><p>PUBLIC: Visible to all users in this workspace.</p>
         * </li>
         * <li><p>PRIVATE: Visible only to you and administrators in this workspace.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>PRIVATE</p>
         */
        public Builder accessibility(String accessibility) {
            this.putQueryParameter("Accessibility", accessibility);
            this.accessibility = accessibility;
            return this;
        }

        /**
         * <p>Maximum runtime. Unit: minutes.</p>
         * 
         * <strong>example:</strong>
         * <p>300</p>
         */
        public Builder maxRunningTimeMinutes(Long maxRunningTimeMinutes) {
            this.putQueryParameter("MaxRunningTimeMinutes", maxRunningTimeMinutes);
            this.maxRunningTimeMinutes = maxRunningTimeMinutes;
            return this;
        }

        /**
         * Priority.
         */
        public Builder priority(String priority) {
            this.putQueryParameter("Priority", priority);
            this.priority = priority;
            return this;
        }

        /**
         * <p>Workspace ID. For more information about how to get a workspace ID, see <a href="">ListWorkspaces</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>380</p>
         */
        public Builder workspaceId(String workspaceId) {
            this.putQueryParameter("WorkspaceId", workspaceId);
            this.workspaceId = workspaceId;
            return this;
        }

        @Override
        public UpdateTensorboardRequest build() {
            return new UpdateTensorboardRequest(this);
        } 

    } 

}
