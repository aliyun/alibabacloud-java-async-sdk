// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.lto20210707.models;

import com.aliyun.sdk.gateway.pop.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ListAllSystemContractRequest} extends {@link RequestModel}
 *
 * <p>ListAllSystemContractRequest</p>
 */
public class ListAllSystemContractRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BlockChainType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String blockChainType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    private ListAllSystemContractRequest(Builder builder) {
        super(builder);
        this.blockChainType = builder.blockChainType;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListAllSystemContractRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return blockChainType
     */
    public String getBlockChainType() {
        return this.blockChainType;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<ListAllSystemContractRequest, Builder> {
        private String blockChainType; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(ListAllSystemContractRequest request) {
            super(request);
            this.blockChainType = request.blockChainType;
            this.regionId = request.regionId;
        } 

        /**
         * <p>This parameter is required.</p>
         */
        public Builder blockChainType(String blockChainType) {
            this.putQueryParameter("BlockChainType", blockChainType);
            this.blockChainType = blockChainType;
            return this;
        }

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public ListAllSystemContractRequest build() {
            return new ListAllSystemContractRequest(this);
        } 

    } 

}
