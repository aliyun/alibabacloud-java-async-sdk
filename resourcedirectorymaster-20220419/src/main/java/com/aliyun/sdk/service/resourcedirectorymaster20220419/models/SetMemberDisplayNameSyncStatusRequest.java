// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.resourcedirectorymaster20220419.models;

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
 * {@link SetMemberDisplayNameSyncStatusRequest} extends {@link RequestModel}
 *
 * <p>SetMemberDisplayNameSyncStatusRequest</p>
 */
public class SetMemberDisplayNameSyncStatusRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Status")
    @com.aliyun.core.annotation.Validation(required = true)
    private String status;

    private SetMemberDisplayNameSyncStatusRequest(Builder builder) {
        super(builder);
        this.status = builder.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SetMemberDisplayNameSyncStatusRequest create() {
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

    public static final class Builder extends Request.Builder<SetMemberDisplayNameSyncStatusRequest, Builder> {
        private String status; 

        private Builder() {
            super();
        } 

        private Builder(SetMemberDisplayNameSyncStatusRequest request) {
            super(request);
            this.status = request.status;
        } 

        /**
         * <p>The status of the Member Display Name Synchronization feature. Valid values:</p>
         * <ul>
         * <li>Enabled: The feature is enabled. This indicates that the display names specified by the management account for the members will be synchronized to the basic account information of the members. The display name information will be visible and perceptible to the members. If a notification is sent to a member, the display name of the member will be used as the appellation of the member.</li>
         * <li>Disabled: The feature is disabled. This indicates that the display names specified by the management account for the members are valid only in the resource directory and will not be updated to the basic account information of the members.</li>
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
        public SetMemberDisplayNameSyncStatusRequest build() {
            return new SetMemberDisplayNameSyncStatusRequest(this);
        } 

    } 

}
