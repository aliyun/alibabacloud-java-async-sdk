// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dts20160801.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeSynchronizationJobStatusRequest} extends {@link RequestModel}
 *
 * <p>DescribeSynchronizationJobStatusRequest</p>
 */
public class DescribeSynchronizationJobStatusRequest extends Request {
    @Query
    @NameInMap("ClientToken")
    private String clientToken;

    @Query
    @NameInMap("OwnerId")
    private String ownerId;

    @Query
    @NameInMap("SynchronizationJobId")
    @Validation(required = true)
    private String synchronizationJobId;

    private DescribeSynchronizationJobStatusRequest(Builder builder) {
        super(builder);
        this.clientToken = builder.clientToken;
        this.ownerId = builder.ownerId;
        this.synchronizationJobId = builder.synchronizationJobId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeSynchronizationJobStatusRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
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

    public static final class Builder extends Request.Builder<DescribeSynchronizationJobStatusRequest, Builder> {
        private String clientToken; 
        private String ownerId; 
        private String synchronizationJobId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeSynchronizationJobStatusRequest request) {
            super(request);
            this.clientToken = request.clientToken;
            this.ownerId = request.ownerId;
            this.synchronizationJobId = request.synchronizationJobId;
        } 

        /**
         * ClientToken.
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
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
        public DescribeSynchronizationJobStatusRequest build() {
            return new DescribeSynchronizationJobStatusRequest(this);
        } 

    } 

}
