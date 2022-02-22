// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudsso20210515.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateUserStatusRequest} extends {@link RequestModel}
 *
 * <p>UpdateUserStatusRequest</p>
 */
public class UpdateUserStatusRequest extends Request {
    @Query
    @NameInMap("DirectoryId")
    private String directoryId;

    @Query
    @NameInMap("NewStatus")
    private String newStatus;

    @Query
    @NameInMap("UserId")
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

        private Builder(UpdateUserStatusRequest response) {
            super(response);
            this.directoryId = response.directoryId;
            this.newStatus = response.newStatus;
            this.userId = response.userId;
        } 

        /**
         * DirectoryId.
         */
        public Builder directoryId(String directoryId) {
            this.putQueryParameter("DirectoryId", directoryId);
            this.directoryId = directoryId;
            return this;
        }

        /**
         * NewStatus.
         */
        public Builder newStatus(String newStatus) {
            this.putQueryParameter("NewStatus", newStatus);
            this.newStatus = newStatus;
            return this;
        }

        /**
         * UserId.
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
