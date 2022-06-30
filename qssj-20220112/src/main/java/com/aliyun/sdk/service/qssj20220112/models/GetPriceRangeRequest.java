// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.qssj20220112.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetPriceRangeRequest} extends {@link RequestModel}
 *
 * <p>GetPriceRangeRequest</p>
 */
public class GetPriceRangeRequest extends Request {
    @Body
    @NameInMap("CateIds")
    @Validation(required = true)
    private String cateIds;

    private GetPriceRangeRequest(Builder builder) {
        super(builder);
        this.cateIds = builder.cateIds;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetPriceRangeRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return cateIds
     */
    public String getCateIds() {
        return this.cateIds;
    }

    public static final class Builder extends Request.Builder<GetPriceRangeRequest, Builder> {
        private String cateIds; 

        private Builder() {
            super();
        } 

        private Builder(GetPriceRangeRequest request) {
            super(request);
            this.cateIds = request.cateIds;
        } 

        /**
         * CateIds.
         */
        public Builder cateIds(String cateIds) {
            this.putBodyParameter("CateIds", cateIds);
            this.cateIds = cateIds;
            return this;
        }

        @Override
        public GetPriceRangeRequest build() {
            return new GetPriceRangeRequest(this);
        } 

    } 

}
