// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.neuron20211115.models;

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
 * {@link ListReviewersRequest} extends {@link RequestModel}
 *
 * <p>ListReviewersRequest</p>
 */
public class ListReviewersRequest extends Request {
    private ListReviewersRequest(Builder builder) {
        super(builder);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListReviewersRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    public static final class Builder extends Request.Builder<ListReviewersRequest, Builder> {

        private Builder() {
            super();
        } 

        private Builder(ListReviewersRequest request) {
            super(request);
        } 

        @Override
        public ListReviewersRequest build() {
            return new ListReviewersRequest(this);
        } 

    } 

}
