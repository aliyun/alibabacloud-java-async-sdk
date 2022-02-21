// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.datalake20200710.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetStorageRankRequest} extends {@link RequestModel}
 *
 * <p>GetStorageRankRequest</p>
 */
public class GetStorageRankRequest extends Request {
    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Body
    @NameInMap("order")
    private String order;

    @Body
    @NameInMap("rankType")
    private java.util.List < String > rankType;

    private GetStorageRankRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.order = builder.order;
        this.rankType = builder.rankType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetStorageRankRequest create() {
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
     * @return order
     */
    public String getOrder() {
        return this.order;
    }

    /**
     * @return rankType
     */
    public java.util.List < String > getRankType() {
        return this.rankType;
    }

    public static final class Builder extends Request.Builder<GetStorageRankRequest, Builder> {
        private String regionId; 
        private String order; 
        private java.util.List < String > rankType; 

        private Builder() {
            super();
        } 

        private Builder(GetStorageRankRequest response) {
            super(response);
            this.regionId = response.regionId;
            this.order = response.order;
            this.rankType = response.rankType;
        } 

        /**
         * RegionId
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * order.
         */
        public Builder order(String order) {
            this.putBodyParameter("order", order);
            this.order = order;
            return this;
        }

        /**
         * rankType.
         */
        public Builder rankType(java.util.List < String > rankType) {
            this.putBodyParameter("rankType", rankType);
            this.rankType = rankType;
            return this;
        }

        @Override
        public GetStorageRankRequest build() {
            return new GetStorageRankRequest(this);
        } 

    } 

}
