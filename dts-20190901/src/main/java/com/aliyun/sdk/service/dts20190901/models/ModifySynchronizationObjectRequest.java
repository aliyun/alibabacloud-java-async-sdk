// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dts20190901.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifySynchronizationObjectRequest} extends {@link RequestModel}
 *
 * <p>ModifySynchronizationObjectRequest</p>
 */
public class ModifySynchronizationObjectRequest extends Request {
    @Query
    @NameInMap("OwnerId")
    private String ownerId;

    @Query
    @NameInMap("SynchronizationDirection")
    private String synchronizationDirection;

    @Query
    @NameInMap("SynchronizationJobId")
    @Validation(required = true)
    private String synchronizationJobId;

    @Query
    @NameInMap("SynchronizationObjects")
    @Validation(required = true)
    private String synchronizationObjects;

    private ModifySynchronizationObjectRequest(Builder builder) {
        super(builder);
        this.ownerId = builder.ownerId;
        this.synchronizationDirection = builder.synchronizationDirection;
        this.synchronizationJobId = builder.synchronizationJobId;
        this.synchronizationObjects = builder.synchronizationObjects;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifySynchronizationObjectRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return ownerId
     */
    public String getOwnerId() {
        return this.ownerId;
    }

    /**
     * @return synchronizationDirection
     */
    public String getSynchronizationDirection() {
        return this.synchronizationDirection;
    }

    /**
     * @return synchronizationJobId
     */
    public String getSynchronizationJobId() {
        return this.synchronizationJobId;
    }

    /**
     * @return synchronizationObjects
     */
    public String getSynchronizationObjects() {
        return this.synchronizationObjects;
    }

    public static final class Builder extends Request.Builder<ModifySynchronizationObjectRequest, Builder> {
        private String ownerId; 
        private String synchronizationDirection; 
        private String synchronizationJobId; 
        private String synchronizationObjects; 

        private Builder() {
            super();
        } 

        private Builder(ModifySynchronizationObjectRequest request) {
            super(request);
            this.ownerId = request.ownerId;
            this.synchronizationDirection = request.synchronizationDirection;
            this.synchronizationJobId = request.synchronizationJobId;
            this.synchronizationObjects = request.synchronizationObjects;
        } 

        /**
         * OwnerId.
         */
        public Builder ownerId(String ownerId) {
            this.putQueryParameter("OwnerId", ownerId);
            this.ownerId = ownerId;
            return this;
        }

        /**
         * SynchronizationDirection.
         */
        public Builder synchronizationDirection(String synchronizationDirection) {
            this.putQueryParameter("SynchronizationDirection", synchronizationDirection);
            this.synchronizationDirection = synchronizationDirection;
            return this;
        }

        /**
         * SynchronizationJobId.
         */
        public Builder synchronizationJobId(String synchronizationJobId) {
            this.putQueryParameter("SynchronizationJobId", synchronizationJobId);
            this.synchronizationJobId = synchronizationJobId;
            return this;
        }

        /**
         * SynchronizationObjects.
         */
        public Builder synchronizationObjects(String synchronizationObjects) {
            this.putQueryParameter("SynchronizationObjects", synchronizationObjects);
            this.synchronizationObjects = synchronizationObjects;
            return this;
        }

        @Override
        public ModifySynchronizationObjectRequest build() {
            return new ModifySynchronizationObjectRequest(this);
        } 

    } 

}
