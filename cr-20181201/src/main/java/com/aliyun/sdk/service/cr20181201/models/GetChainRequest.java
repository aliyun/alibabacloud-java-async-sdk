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
    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("ChainId")
    @Validation(required = true)
    private String chainId;

    @Query
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    private GetChainRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.chainId = builder.chainId;
        this.instanceId = builder.instanceId;
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
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
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

    public static final class Builder extends Request.Builder<GetChainRequest, Builder> {
        private String regionId; 
        private String chainId; 
        private String instanceId; 

        private Builder() {
            super();
        } 

        private Builder(GetChainRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.chainId = request.chainId;
            this.instanceId = request.instanceId;
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

        @Override
        public GetChainRequest build() {
            return new GetChainRequest(this);
        } 

    } 

}
