// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.resourcemanager20200331.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SetMemberDeletionPermissionRequest} extends {@link RequestModel}
 *
 * <p>SetMemberDeletionPermissionRequest</p>
 */
public class SetMemberDeletionPermissionRequest extends Request {
    @Query
    @NameInMap("Status")
    @Validation(required = true)
    private String status;

    private SetMemberDeletionPermissionRequest(Builder builder) {
        super(builder);
        this.status = builder.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SetMemberDeletionPermissionRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    public static final class Builder extends Request.Builder<SetMemberDeletionPermissionRequest, Builder> {
        private String status; 

        private Builder() {
            super();
        } 

        private Builder(SetMemberDeletionPermissionRequest request) {
            super(request);
            this.status = request.status;
        } 

        /**
         * Specifies whether to enable the member deletion feature. Valid values:
         * <p>
         * 
         * *   Enabled: enables the member deletion feature
         * *   Disabled: disables the member deletion feature
         */
        public Builder status(String status) {
            this.putQueryParameter("Status", status);
            this.status = status;
            return this;
        }

        @Override
        public SetMemberDeletionPermissionRequest build() {
            return new SetMemberDeletionPermissionRequest(this);
        } 

    } 

}
