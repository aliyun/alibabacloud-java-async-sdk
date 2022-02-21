// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alikafka20190916.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetMetaProductListRequest} extends {@link RequestModel}
 *
 * <p>GetMetaProductListRequest</p>
 */
public class GetMetaProductListRequest extends Request {
    @Query
    @NameInMap("ListNormal")
    private String listNormal;

    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    private GetMetaProductListRequest(Builder builder) {
        super(builder);
        this.listNormal = builder.listNormal;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetMetaProductListRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return listNormal
     */
    public String getListNormal() {
        return this.listNormal;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<GetMetaProductListRequest, Builder> {
        private String listNormal; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(GetMetaProductListRequest response) {
            super(response);
            this.listNormal = response.listNormal;
            this.regionId = response.regionId;
        } 

        /**
         * ListNormal.
         */
        public Builder listNormal(String listNormal) {
            this.putQueryParameter("ListNormal", listNormal);
            this.listNormal = listNormal;
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
        public GetMetaProductListRequest build() {
            return new GetMetaProductListRequest(this);
        } 

    } 

}
