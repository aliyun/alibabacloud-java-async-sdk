// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cdn20180510.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SetIpBlackListConfigRequest} extends {@link RequestModel}
 *
 * <p>SetIpBlackListConfigRequest</p>
 */
public class SetIpBlackListConfigRequest extends Request {
    @Query
    @NameInMap("BlockIps")
    @Validation(required = true)
    private String blockIps;

    @Query
    @NameInMap("ConfigId")
    private Long configId;

    @Query
    @NameInMap("DomainName")
    @Validation(required = true)
    private String domainName;

    @Query
    @NameInMap("OwnerId")
    private Long ownerId;

    private SetIpBlackListConfigRequest(Builder builder) {
        super(builder);
        this.blockIps = builder.blockIps;
        this.configId = builder.configId;
        this.domainName = builder.domainName;
        this.ownerId = builder.ownerId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SetIpBlackListConfigRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return blockIps
     */
    public String getBlockIps() {
        return this.blockIps;
    }

    /**
     * @return configId
     */
    public Long getConfigId() {
        return this.configId;
    }

    /**
     * @return domainName
     */
    public String getDomainName() {
        return this.domainName;
    }

    /**
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
    }

    public static final class Builder extends Request.Builder<SetIpBlackListConfigRequest, Builder> {
        private String blockIps; 
        private Long configId; 
        private String domainName; 
        private Long ownerId; 

        private Builder() {
            super();
        } 

        private Builder(SetIpBlackListConfigRequest response) {
            super(response);
            this.blockIps = response.blockIps;
            this.configId = response.configId;
            this.domainName = response.domainName;
            this.ownerId = response.ownerId;
        } 

        /**
         * BlockIps.
         */
        public Builder blockIps(String blockIps) {
            this.putQueryParameter("BlockIps", blockIps);
            this.blockIps = blockIps;
            return this;
        }

        /**
         * ConfigId.
         */
        public Builder configId(Long configId) {
            this.putQueryParameter("ConfigId", configId);
            this.configId = configId;
            return this;
        }

        /**
         * DomainName.
         */
        public Builder domainName(String domainName) {
            this.putQueryParameter("DomainName", domainName);
            this.domainName = domainName;
            return this;
        }

        /**
         * OwnerId.
         */
        public Builder ownerId(Long ownerId) {
            this.putQueryParameter("OwnerId", ownerId);
            this.ownerId = ownerId;
            return this;
        }

        @Override
        public SetIpBlackListConfigRequest build() {
            return new SetIpBlackListConfigRequest(this);
        } 

    } 

}
