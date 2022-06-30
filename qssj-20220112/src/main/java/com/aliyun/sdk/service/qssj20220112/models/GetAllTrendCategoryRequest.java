// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.qssj20220112.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetAllTrendCategoryRequest} extends {@link RequestModel}
 *
 * <p>GetAllTrendCategoryRequest</p>
 */
public class GetAllTrendCategoryRequest extends Request {
    private GetAllTrendCategoryRequest(Builder builder) {
        super(builder);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetAllTrendCategoryRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    public static final class Builder extends Request.Builder<GetAllTrendCategoryRequest, Builder> {

        private Builder() {
            super();
        } 

        private Builder(GetAllTrendCategoryRequest request) {
            super(request);
        } 

        @Override
        public GetAllTrendCategoryRequest build() {
            return new GetAllTrendCategoryRequest(this);
        } 

    } 

}
