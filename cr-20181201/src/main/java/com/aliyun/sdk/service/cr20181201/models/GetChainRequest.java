// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cr20181201.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetChainRequest} extends {@link RequestModel}
 *
 * <p>GetChainRequest</p>
 */
public class GetChainRequest extends Request {
    @Query
    @NameInMap("ChainId")
    @Validation(required = true)
    private String chainId;

    @Query
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    @Host
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    private GetChainRequest(Builder builder) {
        super(builder);
        this.chainId = builder.chainId;
        this.instanceId = builder.instanceId;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetChainRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return chainId
     */
    public String getChainId() {
        return this.chainId;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<GetChainRequest, Builder> {
        private String chainId; 
        private String instanceId; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(GetChainRequest response) {
            super(response);
            this.chainId = response.chainId;
            this.instanceId = response.instanceId;
            this.regionId = response.regionId;
        } 

        /**
         * ChainId.
         */
        public Builder chainId(String chainId) {
            this.putQueryParameter("ChainId", chainId);
            this.chainId = chainId;
            return this;
        }

        /**
         * InstanceId.
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public GetChainRequest build() {
            return new GetChainRequest(this);
        } 

    } 

}
