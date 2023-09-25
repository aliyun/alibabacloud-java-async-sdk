// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dts20160801.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link StartSynchronizationJobRequest} extends {@link RequestModel}
 *
 * <p>StartSynchronizationJobRequest</p>
 */
public class StartSynchronizationJobRequest extends Request {
    @Query
    @NameInMap("OwnerId")
    private String ownerId;

    @Query
    @NameInMap("SynchronizationJobId")
    @Validation(required = true)
    private String synchronizationJobId;

    private StartSynchronizationJobRequest(Builder builder) {
        super(builder);
        this.ownerId = builder.ownerId;
        this.synchronizationJobId = builder.synchronizationJobId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static StartSynchronizationJobRequest create() {
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

    public static final class Builder extends Request.Builder<StartSynchronizationJobRequest, Builder> {
        private String ownerId; 
        private String synchronizationJobId; 

        private Builder() {
            super();
        } 

        private Builder(StartSynchronizationJobRequest request) {
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
        public StartSynchronizationJobRequest build() {
            return new StartSynchronizationJobRequest(this);
        } 

    } 

}
