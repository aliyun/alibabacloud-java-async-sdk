// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dts20160801.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteSynchronizationJobRequest} extends {@link RequestModel}
 *
 * <p>DeleteSynchronizationJobRequest</p>
 */
public class DeleteSynchronizationJobRequest extends Request {
    @Query
    @NameInMap("OwnerId")
    private String ownerId;

    @Query
    @NameInMap("SynchronizationJobId")
    @Validation(required = true)
    private String synchronizationJobId;

    private DeleteSynchronizationJobRequest(Builder builder) {
        super(builder);
        this.ownerId = builder.ownerId;
        this.synchronizationJobId = builder.synchronizationJobId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteSynchronizationJobRequest create() {
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
     * @return synchronizationJobId
     */
    public String getSynchronizationJobId() {
        return this.synchronizationJobId;
    }

    public static final class Builder extends Request.Builder<DeleteSynchronizationJobRequest, Builder> {
        private String ownerId; 
        private String synchronizationJobId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteSynchronizationJobRequest request) {
            super(request);
            this.ownerId = request.ownerId;
            this.synchronizationJobId = request.synchronizationJobId;
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
         * SynchronizationJobId.
         */
        public Builder synchronizationJobId(String synchronizationJobId) {
            this.putQueryParameter("SynchronizationJobId", synchronizationJobId);
            this.synchronizationJobId = synchronizationJobId;
            return this;
        }

        @Override
        public DeleteSynchronizationJobRequest build() {
            return new DeleteSynchronizationJobRequest(this);
        } 

    } 

}
