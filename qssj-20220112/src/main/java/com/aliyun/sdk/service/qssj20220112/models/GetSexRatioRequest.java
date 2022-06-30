// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.qssj20220112.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetSexRatioRequest} extends {@link RequestModel}
 *
 * <p>GetSexRatioRequest</p>
 */
public class GetSexRatioRequest extends Request {
    @Query
    @NameInMap("CateIds")
    @Validation(required = true)
    private String cateIds;

    private GetSexRatioRequest(Builder builder) {
        super(builder);
        this.cateIds = builder.cateIds;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetSexRatioRequest create() {
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

    public static final class Builder extends Request.Builder<GetSexRatioRequest, Builder> {
        private String cateIds; 

        private Builder() {
            super();
        } 

        private Builder(GetSexRatioRequest request) {
            super(request);
            this.cateIds = request.cateIds;
        } 

        /**
         * CateIds.
         */
        public Builder cateIds(String cateIds) {
            this.putQueryParameter("CateIds", cateIds);
            this.cateIds = cateIds;
            return this;
        }

        @Override
        public GetSexRatioRequest build() {
            return new GetSexRatioRequest(this);
        } 

    } 

}
