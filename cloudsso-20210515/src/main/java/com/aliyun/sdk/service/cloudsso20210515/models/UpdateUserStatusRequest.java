// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudsso20210515.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateUserStatusRequest} extends {@link RequestModel}
 *
 * <p>UpdateUserStatusRequest</p>
 */
public class UpdateUserStatusRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DirectoryId")
    private String directoryId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NewStatus")
    private String newStatus;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UserId")
    private String userId;

    private UpdateUserStatusRequest(Builder builder) {
        super(builder);
        this.directoryId = builder.directoryId;
        this.newStatus = builder.newStatus;
        this.userId = builder.userId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateUserStatusRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return directoryId
     */
    public String getDirectoryId() {
        return this.directoryId;
    }

    /**
     * @return newStatus
     */
    public String getNewStatus() {
        return this.newStatus;
    }

    /**
     * @return userId
     */
    public String getUserId() {
        return this.userId;
    }

    public static final class Builder extends Request.Builder<UpdateUserStatusRequest, Builder> {
        private String directoryId; 
        private String newStatus; 
        private String userId; 

        private Builder() {
            super();
        } 

        private Builder(UpdateUserStatusRequest request) {
            super(request);
            this.directoryId = request.directoryId;
            this.newStatus = request.newStatus;
            this.userId = request.userId;
        } 

        /**
         * The ID of the directory.
         */
        public Builder directoryId(String directoryId) {
            this.putQueryParameter("DirectoryId", directoryId);
            this.directoryId = directoryId;
            return this;
        }

        /**
         * The new status of the user. Valid values:
         * <p>
         * 
         * *   Enabled: The logon of the user is enabled.
         * *   Disabled: The logon of the user is disabled.
         */
        public Builder newStatus(String newStatus) {
            this.putQueryParameter("NewStatus", newStatus);
            this.newStatus = newStatus;
            return this;
        }

        /**
         * The ID of the user.
         */
        public Builder userId(String userId) {
            this.putQueryParameter("UserId", userId);
            this.userId = userId;
            return this;
        }

        @Override
        public UpdateUserStatusRequest build() {
            return new UpdateUserStatusRequest(this);
        } 

    } 

}
