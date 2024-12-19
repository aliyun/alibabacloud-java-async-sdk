// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.esa20240910.models;

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
 * {@link ListEdgeRoutinePlansRequest} extends {@link RequestModel}
 *
 * <p>ListEdgeRoutinePlansRequest</p>
 */
public class ListEdgeRoutinePlansRequest extends Request {
    private ListEdgeRoutinePlansRequest(Builder builder) {
        super(builder);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListEdgeRoutinePlansRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    public static final class Builder extends Request.Builder<ListEdgeRoutinePlansRequest, Builder> {

        private Builder() {
            super();
        } 

        private Builder(ListEdgeRoutinePlansRequest request) {
            super(request);
        } 

        @Override
        public ListEdgeRoutinePlansRequest build() {
            return new ListEdgeRoutinePlansRequest(this);
        } 

    } 

}
