// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link EnableBruteForceRecordRequest} extends {@link RequestModel}
 *
 * <p>EnableBruteForceRecordRequest</p>
 */
public class EnableBruteForceRecordRequest extends Request {
    @Query
    @NameInMap("BlockIp")
    @Validation(required = true)
    private String blockIp;

    @Query
    @NameInMap("Bound")
    private String bound;

    @Query
    @NameInMap("Id")
    private Long id;

    @Query
    @NameInMap("Port")
    private String port;

    @Query
    @NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @Query
    @NameInMap("Uuid")
    @Validation(required = true)
    private String uuid;

    private EnableBruteForceRecordRequest(Builder builder) {
        super(builder);
        this.blockIp = builder.blockIp;
        this.bound = builder.bound;
        this.id = builder.id;
        this.port = builder.port;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.uuid = builder.uuid;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static EnableBruteForceRecordRequest create() {
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
     * @return id
     */
    public Long getId() {
        return this.id;
    }

    /**
     * @return port
     */
    public String getPort() {
        return this.port;
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

    public static final class Builder extends Request.Builder<EnableBruteForceRecordRequest, Builder> {
        private String blockIp; 
        private String bound; 
        private Long id; 
        private String port; 
        private Long resourceOwnerId; 
        private String uuid; 

        private Builder() {
            super();
        } 

        private Builder(EnableBruteForceRecordRequest request) {
            super(request);
            this.blockIp = request.blockIp;
            this.bound = request.bound;
            this.id = request.id;
            this.port = request.port;
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
         * Id.
         */
        public Builder id(Long id) {
            this.putQueryParameter("Id", id);
            this.id = id;
            return this;
        }

        /**
         * Port.
         */
        public Builder port(String port) {
            this.putQueryParameter("Port", port);
            this.port = port;
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
        public EnableBruteForceRecordRequest build() {
            return new EnableBruteForceRecordRequest(this);
        } 

    } 

}
