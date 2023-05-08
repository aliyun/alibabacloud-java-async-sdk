// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyCustomBlockRecordRequest} extends {@link RequestModel}
 *
 * <p>ModifyCustomBlockRecordRequest</p>
 */
public class ModifyCustomBlockRecordRequest extends Request {
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

    private ModifyCustomBlockRecordRequest(Builder builder) {
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

    public static ModifyCustomBlockRecordRequest create() {
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

    public static final class Builder extends Request.Builder<ModifyCustomBlockRecordRequest, Builder> {
        private String blockIp; 
        private String bound; 
        private Long expireTime; 
        private Long resourceOwnerId; 
        private String uuids; 

        private Builder() {
            super();
        } 

        private Builder(ModifyCustomBlockRecordRequest request) {
            super(request);
            this.blockIp = request.blockIp;
            this.bound = request.bound;
            this.expireTime = request.expireTime;
            this.resourceOwnerId = request.resourceOwnerId;
            this.uuids = request.uuids;
        } 

        /**
         * BlockIp.
         */
        public Builder blockIp(String blockIp) {
            this.putQueryParameter("BlockIp", blockIp);
            this.blockIp = blockIp;
            return this;
        }

        /**
         * Bound.
         */
        public Builder bound(String bound) {
            this.putQueryParameter("Bound", bound);
            this.bound = bound;
            return this;
        }

        /**
         * ExpireTime.
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
         * Uuids.
         */
        public Builder uuids(String uuids) {
            this.putQueryParameter("Uuids", uuids);
            this.uuids = uuids;
            return this;
        }

        @Override
        public ModifyCustomBlockRecordRequest build() {
            return new ModifyCustomBlockRecordRequest(this);
        } 

    } 

}
