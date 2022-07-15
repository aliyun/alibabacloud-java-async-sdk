// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pai_dsw20220101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListDemoCategoriesRequest} extends {@link RequestModel}
 *
 * <p>ListDemoCategoriesRequest</p>
 */
public class ListDemoCategoriesRequest extends Request {
    private ListDemoCategoriesRequest(Builder builder) {
        super(builder);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListDemoCategoriesRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    public static final class Builder extends Request.Builder<ListDemoCategoriesRequest, Builder> {

        private Builder() {
            super();
        } 

        private Builder(ListDemoCategoriesRequest request) {
            super(request);
        } 

        @Override
        public ListDemoCategoriesRequest build() {
            return new ListDemoCategoriesRequest(this);
        } 

    } 

}
