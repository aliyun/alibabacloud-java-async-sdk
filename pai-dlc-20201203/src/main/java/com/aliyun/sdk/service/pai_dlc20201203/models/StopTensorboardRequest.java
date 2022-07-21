// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pai_dlc20201203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link StopTensorboardRequest} extends {@link RequestModel}
 *
 * <p>StopTensorboardRequest</p>
 */
public class StopTensorboardRequest extends Request {
    @Path
    @NameInMap("TensorboardId")
    @Validation(required = true, maxLength = 256, minLength = 1)
    private String tensorboardId;

    @Query
    @NameInMap("WorkspaceId")
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
         * Tensorboad Id
         */
        public Builder tensorboardId(String tensorboardId) {
            this.putPathParameter("TensorboardId", tensorboardId);
            this.tensorboardId = tensorboardId;
            return this;
        }

        /**
         * 工作空间ID
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
