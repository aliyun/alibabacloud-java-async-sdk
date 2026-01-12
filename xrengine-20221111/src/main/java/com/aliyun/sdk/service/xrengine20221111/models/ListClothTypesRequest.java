// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.xrengine20221111.models;

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
 * {@link ListClothTypesRequest} extends {@link RequestModel}
 *
 * <p>ListClothTypesRequest</p>
 */
public class ListClothTypesRequest extends Request {
    private ListClothTypesRequest(Builder builder) {
        super(builder);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListClothTypesRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    public static final class Builder extends Request.Builder<ListClothTypesRequest, Builder> {

        private Builder() {
            super();
        } 

        private Builder(ListClothTypesRequest request) {
            super(request);
        } 

        @Override
        public ListClothTypesRequest build() {
            return new ListClothTypesRequest(this);
        } 

    } 

}
