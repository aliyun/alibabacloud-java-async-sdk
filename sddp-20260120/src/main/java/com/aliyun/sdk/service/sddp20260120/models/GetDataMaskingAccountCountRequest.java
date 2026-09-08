// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sddp20260120.models;

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
 * {@link GetDataMaskingAccountCountRequest} extends {@link RequestModel}
 *
 * <p>GetDataMaskingAccountCountRequest</p>
 */
public class GetDataMaskingAccountCountRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ProductIds")
    private String productIds;

    private GetDataMaskingAccountCountRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.lang = builder.lang;
        this.productIds = builder.productIds;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetDataMaskingAccountCountRequest create() {
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
     * @return lang
     */
    public String getLang() {
        return this.lang;
    }

    /**
     * @return productIds
     */
    public String getProductIds() {
        return this.productIds;
    }

    public static final class Builder extends Request.Builder<GetDataMaskingAccountCountRequest, Builder> {
        private String regionId; 
        private String lang; 
        private String productIds; 

        private Builder() {
            super();
        } 

        private Builder(GetDataMaskingAccountCountRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.lang = request.lang;
            this.productIds = request.productIds;
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
         * Lang.
         */
        public Builder lang(String lang) {
            this.putQueryParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        /**
         * ProductIds.
         */
        public Builder productIds(String productIds) {
            this.putQueryParameter("ProductIds", productIds);
            this.productIds = productIds;
            return this;
        }

        @Override
        public GetDataMaskingAccountCountRequest build() {
            return new GetDataMaskingAccountCountRequest(this);
        } 

    } 

}
