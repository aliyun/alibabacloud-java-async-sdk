// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.agentexplorer20260317.models;

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
 * {@link ListCategoriesRequest} extends {@link RequestModel}
 *
 * <p>ListCategoriesRequest</p>
 */
public class ListCategoriesRequest extends Request {
    private ListCategoriesRequest(Builder builder) {
        super(builder);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListCategoriesRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    public static final class Builder extends Request.Builder<ListCategoriesRequest, Builder> {

        private Builder() {
            super();
        } 

        private Builder(ListCategoriesRequest request) {
            super(request);
        } 

        @Override
        public ListCategoriesRequest build() {
            return new ListCategoriesRequest(this);
        } 

    } 

}
