// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.airec20201126.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ListMixCategoriesRequest} extends {@link RequestModel}
 *
 * <p>ListMixCategoriesRequest</p>
 */
public class ListMixCategoriesRequest extends Request {
    private ListMixCategoriesRequest(Builder builder) {
        super(builder);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListMixCategoriesRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    public static final class Builder extends Request.Builder<ListMixCategoriesRequest, Builder> {

        private Builder() {
            super();
        } 

        private Builder(ListMixCategoriesRequest request) {
            super(request);
        } 

        @Override
        public ListMixCategoriesRequest build() {
            return new ListMixCategoriesRequest(this);
        } 

    } 

}
