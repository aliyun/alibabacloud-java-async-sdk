// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudsso20210515.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;

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

    public static final class Builder extends Request.Builder {
        private String directoryId; 
        private String newStatus; 
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
         * <p>NewStatus.</p>
         */
        public Builder newStatus(String newStatus) {
            this.putQueryParameter("NewStatus", newStatus);
            this.newStatus = newStatus;
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

        public UpdateUserStatusRequest build() {
            return new UpdateUserStatusRequest(this);
        } 

    } 

}
