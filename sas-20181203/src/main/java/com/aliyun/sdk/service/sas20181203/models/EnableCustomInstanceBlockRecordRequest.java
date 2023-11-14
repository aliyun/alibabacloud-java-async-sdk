// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link EnableCustomInstanceBlockRecordRequest} extends {@link RequestModel}
 *
 * <p>EnableCustomInstanceBlockRecordRequest</p>
 */
public class EnableCustomInstanceBlockRecordRequest extends Request {
    @Query
    @NameInMap("BlockIp")
    @Validation(required = true)
    private String blockIp;

    @Query
    @NameInMap("Bound")
    private String bound;

    @Query
    @NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @Query
    @NameInMap("Uuid")
    @Validation(required = true)
    private String uuid;

    private EnableCustomInstanceBlockRecordRequest(Builder builder) {
        super(builder);
        this.blockIp = builder.blockIp;
        this.bound = builder.bound;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.uuid = builder.uuid;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static EnableCustomInstanceBlockRecordRequest create() {
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
     * @return resourceOwnerId
     */
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    /**
     * @return uuid
     */
    public String getUuid() {
        return this.uuid;
    }

    public static final class Builder extends Request.Builder<EnableCustomInstanceBlockRecordRequest, Builder> {
        private String blockIp; 
        private String bound; 
        private Long resourceOwnerId; 
        private String uuid; 

        private Builder() {
            super();
        } 

        private Builder(EnableCustomInstanceBlockRecordRequest request) {
            super(request);
            this.blockIp = request.blockIp;
            this.bound = request.bound;
            this.resourceOwnerId = request.resourceOwnerId;
            this.uuid = request.uuid;
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
         * ResourceOwnerId.
         */
        public Builder resourceOwnerId(Long resourceOwnerId) {
            this.putQueryParameter("ResourceOwnerId", resourceOwnerId);
            this.resourceOwnerId = resourceOwnerId;
            return this;
        }

        /**
         * Uuid.
         */
        public Builder uuid(String uuid) {
            this.putQueryParameter("Uuid", uuid);
            this.uuid = uuid;
            return this;
        }

        @Override
        public EnableCustomInstanceBlockRecordRequest build() {
            return new EnableCustomInstanceBlockRecordRequest(this);
        } 

    } 

}
