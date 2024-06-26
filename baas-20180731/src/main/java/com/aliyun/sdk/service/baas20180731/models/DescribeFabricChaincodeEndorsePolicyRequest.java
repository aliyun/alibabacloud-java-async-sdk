// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.baas20180731.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeFabricChaincodeEndorsePolicyRequest} extends {@link RequestModel}
 *
 * <p>DescribeFabricChaincodeEndorsePolicyRequest</p>
 */
public class DescribeFabricChaincodeEndorsePolicyRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ChaincodeName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String chaincodeName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ChannelId")
    private String channelId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("OrganizationId")
    private String organizationId;

    private DescribeFabricChaincodeEndorsePolicyRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.chaincodeName = builder.chaincodeName;
        this.channelId = builder.channelId;
        this.organizationId = builder.organizationId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeFabricChaincodeEndorsePolicyRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return chaincodeName
     */
    public String getChaincodeName() {
        return this.chaincodeName;
    }

    /**
     * @return channelId
     */
    public String getChannelId() {
        return this.channelId;
    }

    /**
     * @return organizationId
     */
    public String getOrganizationId() {
        return this.organizationId;
    }

    public static final class Builder extends Request.Builder<DescribeFabricChaincodeEndorsePolicyRequest, Builder> {
        private String regionId; 
        private String chaincodeName; 
        private String channelId; 
        private String organizationId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeFabricChaincodeEndorsePolicyRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.chaincodeName = request.chaincodeName;
            this.channelId = request.channelId;
            this.organizationId = request.organizationId;
        } 

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * ChaincodeName.
         */
        public Builder chaincodeName(String chaincodeName) {
            this.putBodyParameter("ChaincodeName", chaincodeName);
            this.chaincodeName = chaincodeName;
            return this;
        }

        /**
         * ChannelId.
         */
        public Builder channelId(String channelId) {
            this.putBodyParameter("ChannelId", channelId);
            this.channelId = channelId;
            return this;
        }

        /**
         * OrganizationId.
         */
        public Builder organizationId(String organizationId) {
            this.putBodyParameter("OrganizationId", organizationId);
            this.organizationId = organizationId;
            return this;
        }

        @Override
        public DescribeFabricChaincodeEndorsePolicyRequest build() {
            return new DescribeFabricChaincodeEndorsePolicyRequest(this);
        } 

    } 

}
