// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.umeng_finplus20220913.models;

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
 * {@link ListDataSetRequest} extends {@link RequestModel}
 *
 * <p>ListDataSetRequest</p>
 */
public class ListDataSetRequest extends Request {
    private ListDataSetRequest(Builder builder) {
        super(builder);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListDataSetRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    public static final class Builder extends Request.Builder<ListDataSetRequest, Builder> {

        private Builder() {
            super();
        } 

        private Builder(ListDataSetRequest request) {
            super(request);
        } 

        @Override
        public ListDataSetRequest build() {
            return new ListDataSetRequest(this);
        } 

    } 

}
