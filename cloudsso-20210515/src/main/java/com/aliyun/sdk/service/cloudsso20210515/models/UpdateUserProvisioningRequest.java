// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudsso20210515.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateUserProvisioningRequest} extends {@link RequestModel}
 *
 * <p>UpdateUserProvisioningRequest</p>
 */
public class UpdateUserProvisioningRequest extends Request {
    @Query
    @NameInMap("DirectoryId")
    private String directoryId;

    @Query
    @NameInMap("NewDeletionStrategy")
    private String newDeletionStrategy;

    @Query
    @NameInMap("NewDescription")
    private String newDescription;

    @Query
    @NameInMap("NewDuplicationStrategy")
    private String newDuplicationStrategy;

    @Query
    @NameInMap("UserProvisioningId")
    private String userProvisioningId;

    private UpdateUserProvisioningRequest(Builder builder) {
        super(builder);
        this.directoryId = builder.directoryId;
        this.newDeletionStrategy = builder.newDeletionStrategy;
        this.newDescription = builder.newDescription;
        this.newDuplicationStrategy = builder.newDuplicationStrategy;
        this.userProvisioningId = builder.userProvisioningId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateUserProvisioningRequest create() {
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
     * @return newDeletionStrategy
     */
    public String getNewDeletionStrategy() {
        return this.newDeletionStrategy;
    }

    /**
     * @return newDescription
     */
    public String getNewDescription() {
        return this.newDescription;
    }

    /**
     * @return newDuplicationStrategy
     */
    public String getNewDuplicationStrategy() {
        return this.newDuplicationStrategy;
    }

    /**
     * @return userProvisioningId
     */
    public String getUserProvisioningId() {
        return this.userProvisioningId;
    }

    public static final class Builder extends Request.Builder<UpdateUserProvisioningRequest, Builder> {
        private String directoryId; 
        private String newDeletionStrategy; 
        private String newDescription; 
        private String newDuplicationStrategy; 
        private String userProvisioningId; 

        private Builder() {
            super();
        } 

        private Builder(UpdateUserProvisioningRequest request) {
            super(request);
            this.directoryId = request.directoryId;
            this.newDeletionStrategy = request.newDeletionStrategy;
            this.newDescription = request.newDescription;
            this.newDuplicationStrategy = request.newDuplicationStrategy;
            this.userProvisioningId = request.userProvisioningId;
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
         * NewDeletionStrategy.
         */
        public Builder newDeletionStrategy(String newDeletionStrategy) {
            this.putQueryParameter("NewDeletionStrategy", newDeletionStrategy);
            this.newDeletionStrategy = newDeletionStrategy;
            return this;
        }

        /**
         * NewDescription.
         */
        public Builder newDescription(String newDescription) {
            this.putQueryParameter("NewDescription", newDescription);
            this.newDescription = newDescription;
            return this;
        }

        /**
         * NewDuplicationStrategy.
         */
        public Builder newDuplicationStrategy(String newDuplicationStrategy) {
            this.putQueryParameter("NewDuplicationStrategy", newDuplicationStrategy);
            this.newDuplicationStrategy = newDuplicationStrategy;
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
        public UpdateUserProvisioningRequest build() {
            return new UpdateUserProvisioningRequest(this);
        } 

    } 

}
