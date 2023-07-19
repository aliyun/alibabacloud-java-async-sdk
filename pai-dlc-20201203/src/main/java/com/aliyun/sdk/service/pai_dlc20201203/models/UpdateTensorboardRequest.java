// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pai_dlc20201203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateTensorboardRequest} extends {@link RequestModel}
 *
 * <p>UpdateTensorboardRequest</p>
 */
public class UpdateTensorboardRequest extends Request {
    @Path
    @NameInMap("TensorboardId")
    @Validation(required = true, maxLength = 256, minLength = 1)
    private String tensorboardId;

    @Query
    @NameInMap("MaxRunningTimeMinutes")
    private Long maxRunningTimeMinutes;

    @Query
    @NameInMap("WorkspaceId")
    private String workspaceId;

    private UpdateTensorboardRequest(Builder builder) {
        super(builder);
        this.tensorboardId = builder.tensorboardId;
        this.maxRunningTimeMinutes = builder.maxRunningTimeMinutes;
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
     * @return maxRunningTimeMinutes
     */
    public Long getMaxRunningTimeMinutes() {
        return this.maxRunningTimeMinutes;
    }

    /**
     * @return workspaceId
     */
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    public static final class Builder extends Request.Builder<UpdateTensorboardRequest, Builder> {
        private String tensorboardId; 
        private Long maxRunningTimeMinutes; 
        private String workspaceId; 

        private Builder() {
            super();
        } 

        private Builder(UpdateTensorboardRequest request) {
            super(request);
            this.tensorboardId = request.tensorboardId;
            this.maxRunningTimeMinutes = request.maxRunningTimeMinutes;
            this.workspaceId = request.workspaceId;
        } 

        /**
         * TensorboardId.
         */
        public Builder tensorboardId(String tensorboardId) {
            this.putPathParameter("TensorboardId", tensorboardId);
            this.tensorboardId = tensorboardId;
            return this;
        }

        /**
         * MaxRunningTimeMinutes.
         */
        public Builder maxRunningTimeMinutes(Long maxRunningTimeMinutes) {
            this.putQueryParameter("MaxRunningTimeMinutes", maxRunningTimeMinutes);
            this.maxRunningTimeMinutes = maxRunningTimeMinutes;
            return this;
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
        public UpdateTensorboardRequest build() {
            return new UpdateTensorboardRequest(this);
        } 

    } 

}
