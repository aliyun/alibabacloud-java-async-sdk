// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.actiontrail20200706.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetAccessKeyLastUsedProductsRequest} extends {@link RequestModel}
 *
 * <p>GetAccessKeyLastUsedProductsRequest</p>
 */
public class GetAccessKeyLastUsedProductsRequest extends Request {
    @Query
    @NameInMap("AccessKey")
    @Validation(required = true)
    private String accessKey;

    private GetAccessKeyLastUsedProductsRequest(Builder builder) {
        super(builder);
        this.accessKey = builder.accessKey;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetAccessKeyLastUsedProductsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return accessKey
     */
    public String getAccessKey() {
        return this.accessKey;
    }

    public static final class Builder extends Request.Builder<GetAccessKeyLastUsedProductsRequest, Builder> {
        private String accessKey; 

        private Builder() {
            super();
        } 

        private Builder(GetAccessKeyLastUsedProductsRequest request) {
            super(request);
            this.accessKey = request.accessKey;
        } 

        /**
         * AccessKey.
         */
        public Builder accessKey(String accessKey) {
            this.putQueryParameter("AccessKey", accessKey);
            this.accessKey = accessKey;
            return this;
        }

        @Override
        public GetAccessKeyLastUsedProductsRequest build() {
            return new GetAccessKeyLastUsedProductsRequest(this);
        } 

    } 

}
