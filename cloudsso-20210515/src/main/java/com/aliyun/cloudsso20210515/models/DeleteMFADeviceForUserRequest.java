// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudsso20210515.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;

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

    public static final class Builder extends Request.Builder {
        private String directoryId; 
        private String MFADeviceId; 
        private String userId; 

        /**
         * <p>DirectoryId.</p>
         */
        public Builder directoryId(String directoryId) {
            this.putQueryParameter("DirectoryId", directoryId);
            this.directoryId = directoryId;
            return this;
        }

        /**
         * <p>MFADeviceId.</p>
         */
        public Builder MFADeviceId(String MFADeviceId) {
            this.putQueryParameter("MFADeviceId", MFADeviceId);
            this.MFADeviceId = MFADeviceId;
            return this;
        }

        /**
         * <p>UserId.</p>
         */
        public Builder userId(String userId) {
            this.putQueryParameter("UserId", userId);
            this.userId = userId;
            return this;
        }

        public DeleteMFADeviceForUserRequest build() {
            return new DeleteMFADeviceForUserRequest(this);
        } 

    } 

}
