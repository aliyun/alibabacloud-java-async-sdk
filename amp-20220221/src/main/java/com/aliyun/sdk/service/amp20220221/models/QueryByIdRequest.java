// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.amp20220221.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryByIdRequest} extends {@link RequestModel}
 *
 * <p>QueryByIdRequest</p>
 */
public class QueryByIdRequest extends Request {
    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("address")
    private String address;

    private QueryByIdRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.address = builder.address;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryByIdRequest create() {
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
     * @return address
     */
    public String getAddress() {
        return this.address;
    }

    public static final class Builder extends Request.Builder<QueryByIdRequest, Builder> {
        private String regionId; 
        private String address; 

        private Builder() {
            super();
        } 

        private Builder(QueryByIdRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.address = request.address;
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
         * fsdfs
         */
        public Builder address(String address) {
            this.putQueryParameter("address", address);
            this.address = address;
            return this;
        }

        @Override
        public QueryByIdRequest build() {
            return new QueryByIdRequest(this);
        } 

    } 

}
