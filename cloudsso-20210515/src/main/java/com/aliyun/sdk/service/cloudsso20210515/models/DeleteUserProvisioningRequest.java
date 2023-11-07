// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudsso20210515.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteUserProvisioningRequest} extends {@link RequestModel}
 *
 * <p>DeleteUserProvisioningRequest</p>
 */
public class DeleteUserProvisioningRequest extends Request {
    @Query
    @NameInMap("DeletionStrategy")
    private String deletionStrategy;

    @Query
    @NameInMap("DirectoryId")
    private String directoryId;

    @Query
    @NameInMap("UserProvisioningId")
    private String userProvisioningId;

    private DeleteUserProvisioningRequest(Builder builder) {
        super(builder);
        this.deletionStrategy = builder.deletionStrategy;
        this.directoryId = builder.directoryId;
        this.userProvisioningId = builder.userProvisioningId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteUserProvisioningRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return deletionStrategy
     */
    public String getDeletionStrategy() {
        return this.deletionStrategy;
    }

    /**
     * @return directoryId
     */
    public String getDirectoryId() {
        return this.directoryId;
    }

    /**
     * @return userProvisioningId
     */
    public String getUserProvisioningId() {
        return this.userProvisioningId;
    }

    public static final class Builder extends Request.Builder<DeleteUserProvisioningRequest, Builder> {
        private String deletionStrategy; 
        private String directoryId; 
        private String userProvisioningId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteUserProvisioningRequest request) {
            super(request);
            this.deletionStrategy = request.deletionStrategy;
            this.directoryId = request.directoryId;
            this.userProvisioningId = request.userProvisioningId;
        } 

        /**
         * DeletionStrategy.
         */
        public Builder deletionStrategy(String deletionStrategy) {
            this.putQueryParameter("DeletionStrategy", deletionStrategy);
            this.deletionStrategy = deletionStrategy;
            return this;
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
         * UserProvisioningId.
         */
        public Builder userProvisioningId(String userProvisioningId) {
            this.putQueryParameter("UserProvisioningId", userProvisioningId);
            this.userProvisioningId = userProvisioningId;
            return this;
        }

        @Override
        public DeleteUserProvisioningRequest build() {
            return new DeleteUserProvisioningRequest(this);
        } 

    } 

}
