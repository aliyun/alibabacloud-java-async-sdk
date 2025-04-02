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
 * {@link StopTensorboardRequest} extends {@link RequestModel}
 *
 * <p>StopTensorboardRequest</p>
 */
public class StopTensorboardRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("TensorboardId")
    @com.aliyun.core.annotation.Validation(required = true, maxLength = 256, minLength = 1)
    private String tensorboardId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("WorkspaceId")
    private String workspaceId;

    private StopTensorboardRequest(Builder builder) {
        super(builder);
        this.tensorboardId = builder.tensorboardId;
        this.workspaceId = builder.workspaceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static StopTensorboardRequest create() {
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
     * @return workspaceId
     */
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    public static final class Builder extends Request.Builder<StopTensorboardRequest, Builder> {
        private String tensorboardId; 
        private String workspaceId; 

        private Builder() {
            super();
        } 

        private Builder(StopTensorboardRequest request) {
            super(request);
            this.tensorboardId = request.tensorboardId;
            this.workspaceId = request.workspaceId;
        } 

        /**
         * <p>The ID of the TensorBoard instance. For more information about how to query the Tensorboard instance ID, see <a href="https://help.aliyun.com/document_detail/459689.html">ListTensorboards</a>.</p>
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
         * <p>The workspace ID. 
         * &lt;props=&quot;china&quot;&gt;For more information about how to query the workspace ID, see <a href="https://help.aliyun.com/document_detail/449124.html">ListWorkspaces</a>.</p>
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
        public StopTensorboardRequest build() {
            return new StopTensorboardRequest(this);
        } 

    } 

}
