// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20240330.models;

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
 * {@link GetCmsServiceRequest} extends {@link RequestModel}
 *
 * <p>GetCmsServiceRequest</p>
 */
public class GetCmsServiceRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("product")
    private String product;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("service")
    private String service;

    private GetCmsServiceRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.product = builder.product;
        this.service = builder.service;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetCmsServiceRequest create() {
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
     * @return product
     */
    public String getProduct() {
        return this.product;
    }

    /**
     * @return service
     */
    public String getService() {
        return this.service;
    }

    public static final class Builder extends Request.Builder<GetCmsServiceRequest, Builder> {
        private String regionId; 
        private String product; 
        private String service; 

        private Builder() {
            super();
        } 

        private Builder(GetCmsServiceRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.product = request.product;
            this.service = request.service;
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
         * product.
         */
        public Builder product(String product) {
            this.putQueryParameter("product", product);
            this.product = product;
            return this;
        }

        /**
         * service.
         */
        public Builder service(String service) {
            this.putQueryParameter("service", service);
            this.service = service;
            return this;
        }

        @Override
        public GetCmsServiceRequest build() {
            return new GetCmsServiceRequest(this);
        } 

    } 

}
