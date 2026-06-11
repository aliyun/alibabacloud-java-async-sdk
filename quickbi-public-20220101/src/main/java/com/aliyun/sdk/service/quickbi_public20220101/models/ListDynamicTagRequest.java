// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.quickbi_public20220101.models;

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
 * {@link ListDynamicTagRequest} extends {@link RequestModel}
 *
 * <p>ListDynamicTagRequest</p>
 */
public class ListDynamicTagRequest extends Request {
    private ListDynamicTagRequest(Builder builder) {
        super(builder);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListDynamicTagRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    public static final class Builder extends Request.Builder<ListDynamicTagRequest, Builder> {

        private Builder() {
            super();
        } 

        private Builder(ListDynamicTagRequest request) {
            super(request);
        } 

        @Override
        public ListDynamicTagRequest build() {
            return new ListDynamicTagRequest(this);
        } 

    } 

}
