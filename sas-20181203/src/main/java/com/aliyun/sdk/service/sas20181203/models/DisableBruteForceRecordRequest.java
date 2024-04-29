// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DisableBruteForceRecordRequest} extends {@link RequestModel}
 *
 * <p>DisableBruteForceRecordRequest</p>
 */
public class DisableBruteForceRecordRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BlockIp")
    @com.aliyun.core.annotation.Validation(required = true)
    private String blockIp;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Bound")
    private String bound;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Id")
    private Long id;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Port")
    private String port;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Uuid")
    @com.aliyun.core.annotation.Validation(required = true)
    private String uuid;

    private DisableBruteForceRecordRequest(Builder builder) {
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

    public static DisableBruteForceRecordRequest create() {
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

    public static final class Builder extends Request.Builder<DisableBruteForceRecordRequest, Builder> {
        private String blockIp; 
        private String bound; 
        private Long id; 
        private String port; 
        private Long resourceOwnerId; 
        private String uuid; 

        private Builder() {
            super();
        } 

        private Builder(DisableBruteForceRecordRequest request) {
            super(request);
            this.blockIp = request.blockIp;
            this.bound = request.bound;
            this.id = request.id;
            this.port = request.port;
            this.resourceOwnerId = request.resourceOwnerId;
            this.uuid = request.uuid;
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
         * The ID of the IP address blocking policy.
         * <p>
         * 
         * > You can call the [DescribeBruteForceRecords](~~DescribeBruteForceRecords~~) operation to query the policy ID.
         */
        public Builder id(Long id) {
            this.putQueryParameter("Id", id);
            this.id = id;
            return this;
        }

        /**
         * The port number.
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
         * The UUID of the server.
         */
        public Builder uuid(String uuid) {
            this.putQueryParameter("Uuid", uuid);
            this.uuid = uuid;
            return this;
        }

        @Override
        public DisableBruteForceRecordRequest build() {
            return new DisableBruteForceRecordRequest(this);
        } 

    } 

}
