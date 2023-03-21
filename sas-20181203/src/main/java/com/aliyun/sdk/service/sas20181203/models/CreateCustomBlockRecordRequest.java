// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateCustomBlockRecordRequest} extends {@link RequestModel}
 *
 * <p>CreateCustomBlockRecordRequest</p>
 */
public class CreateCustomBlockRecordRequest extends Request {
    @Query
    @NameInMap("BlockIp")
    @Validation(required = true)
    private String blockIp;

    @Query
    @NameInMap("Bound")
    @Validation(required = true)
    private String bound;

    @Query
    @NameInMap("ExpireTime")
    @Validation(required = true)
    private Long expireTime;

    @Query
    @NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @Query
    @NameInMap("Uuids")
    @Validation(required = true)
    private String uuids;

    private CreateCustomBlockRecordRequest(Builder builder) {
        super(builder);
        this.blockIp = builder.blockIp;
        this.bound = builder.bound;
        this.expireTime = builder.expireTime;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.uuids = builder.uuids;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateCustomBlockRecordRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return blockIp
     */
    public String getBlockIp() {
        return this.blockIp;
    }

    /**
     * @return bound
     */
    public String getBound() {
        return this.bound;
    }

    /**
     * @return expireTime
     */
    public Long getExpireTime() {
        return this.expireTime;
    }

    /**
     * @return resourceOwnerId
     */
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    /**
     * @return uuids
     */
    public String getUuids() {
        return this.uuids;
    }

    public static final class Builder extends Request.Builder<CreateCustomBlockRecordRequest, Builder> {
        private String blockIp; 
        private String bound; 
        private Long expireTime; 
        private Long resourceOwnerId; 
        private String uuids; 

        private Builder() {
            super();
        } 

        private Builder(CreateCustomBlockRecordRequest request) {
            super(request);
            this.blockIp = request.blockIp;
            this.bound = request.bound;
            this.expireTime = request.expireTime;
            this.resourceOwnerId = request.resourceOwnerId;
            this.uuids = request.uuids;
        } 

        /**
         * The IP address that you want to specify in the policy.
         */
        public Builder blockIp(String blockIp) {
            this.putQueryParameter("BlockIp", blockIp);
            this.blockIp = blockIp;
            return this;
        }

        /**
         * The traffic direction that you want to specify in the policy. Valid values:
         * <p>
         * 
         * *   **in**: inbound
         * *   **out**: outbound
         */
        public Builder bound(String bound) {
            this.putQueryParameter("Bound", bound);
            this.bound = bound;
            return this;
        }

        /**
         * The expiration time of the policy.
         */
        public Builder expireTime(Long expireTime) {
            this.putQueryParameter("ExpireTime", expireTime);
            this.expireTime = expireTime;
            return this;
        }

        /**
         * ResourceOwnerId.
         */
        public Builder resourceOwnerId(Long resourceOwnerId) {
            this.putQueryParameter("ResourceOwnerId", resourceOwnerId);
            this.resourceOwnerId = resourceOwnerId;
            return this;
        }

        /**
         * The UUIDs of the servers. Separate multiple UUIDs with commas (,).
         */
        public Builder uuids(String uuids) {
            this.putQueryParameter("Uuids", uuids);
            this.uuids = uuids;
            return this;
        }

        @Override
        public CreateCustomBlockRecordRequest build() {
            return new CreateCustomBlockRecordRequest(this);
        } 

    } 

}
