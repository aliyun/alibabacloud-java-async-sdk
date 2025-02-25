// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.computenest20210601.models;

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
 * {@link ListServiceCategoriesRequest} extends {@link RequestModel}
 *
 * <p>ListServiceCategoriesRequest</p>
 */
public class ListServiceCategoriesRequest extends Request {
    private ListServiceCategoriesRequest(Builder builder) {
        super(builder);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListServiceCategoriesRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    public static final class Builder extends Request.Builder<ListServiceCategoriesRequest, Builder> {

        private Builder() {
            super();
        } 

        private Builder(ListServiceCategoriesRequest request) {
            super(request);
        } 

        @Override
        public ListServiceCategoriesRequest build() {
            return new ListServiceCategoriesRequest(this);
        } 

    } 

}
