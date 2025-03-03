// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.resourcemanager20200331.models;

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
 * {@link SetMemberDeletionPermissionRequest} extends {@link RequestModel}
 *
 * <p>SetMemberDeletionPermissionRequest</p>
 */
public class SetMemberDeletionPermissionRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Status")
    @com.aliyun.core.annotation.Validation(required = true)
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
         * <p>Specifies whether to enable the member deletion feature. Valid values:</p>
         * <ul>
         * <li>Enabled: enables the member deletion feature</li>
         * <li>Disabled: disables the member deletion feature</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>Enabled</p>
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
