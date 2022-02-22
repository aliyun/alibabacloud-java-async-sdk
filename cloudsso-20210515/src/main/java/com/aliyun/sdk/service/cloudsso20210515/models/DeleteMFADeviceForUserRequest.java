// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudsso20210515.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteMFADeviceForUserRequest} extends {@link RequestModel}
 *
 * <p>DeleteMFADeviceForUserRequest</p>
 */
public class DeleteMFADeviceForUserRequest extends Request {
    @Query
    @NameInMap("DirectoryId")
    private String directoryId;

    @Query
    @NameInMap("MFADeviceId")
    private String MFADeviceId;

    @Query
    @NameInMap("UserId")
    private String userId;

    private DeleteMFADeviceForUserRequest(Builder builder) {
        super(builder);
        this.directoryId = builder.directoryId;
        this.MFADeviceId = builder.MFADeviceId;
        this.userId = builder.userId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteMFADeviceForUserRequest create() {
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
     * @return MFADeviceId
     */
    public String getMFADeviceId() {
        return this.MFADeviceId;
    }

    /**
     * @return userId
     */
    public String getUserId() {
        return this.userId;
    }

    public static final class Builder extends Request.Builder<DeleteMFADeviceForUserRequest, Builder> {
        private String directoryId; 
        private String MFADeviceId; 
        private String userId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteMFADeviceForUserRequest response) {
            super(response);
            this.directoryId = response.directoryId;
            this.MFADeviceId = response.MFADeviceId;
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
         * MFADeviceId.
         */
        public Builder MFADeviceId(String MFADeviceId) {
            this.putQueryParameter("MFADeviceId", MFADeviceId);
            this.MFADeviceId = MFADeviceId;
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
        public DeleteMFADeviceForUserRequest build() {
            return new DeleteMFADeviceForUserRequest(this);
        } 

    } 

}
