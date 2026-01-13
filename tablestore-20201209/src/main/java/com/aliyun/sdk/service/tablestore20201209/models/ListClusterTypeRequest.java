// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.tablestore20201209.models;

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
 * {@link ListClusterTypeRequest} extends {@link RequestModel}
 *
 * <p>ListClusterTypeRequest</p>
 */
public class ListClusterTypeRequest extends Request {
    private ListClusterTypeRequest(Builder builder) {
        super(builder);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListClusterTypeRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    public static final class Builder extends Request.Builder<ListClusterTypeRequest, Builder> {

        private Builder() {
            super();
        } 

        private Builder(ListClusterTypeRequest request) {
            super(request);
        } 

        @Override
        public ListClusterTypeRequest build() {
            return new ListClusterTypeRequest(this);
        } 

    } 

}
