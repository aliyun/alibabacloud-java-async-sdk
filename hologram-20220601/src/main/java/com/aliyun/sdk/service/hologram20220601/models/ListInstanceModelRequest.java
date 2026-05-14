// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.hologram20220601.models;

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
 * {@link ListInstanceModelRequest} extends {@link RequestModel}
 *
 * <p>ListInstanceModelRequest</p>
 */
public class ListInstanceModelRequest extends Request {
    private ListInstanceModelRequest(Builder builder) {
        super(builder);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListInstanceModelRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    public static final class Builder extends Request.Builder<ListInstanceModelRequest, Builder> {

        private Builder() {
            super();
        } 

        private Builder(ListInstanceModelRequest request) {
            super(request);
        } 

        @Override
        public ListInstanceModelRequest build() {
            return new ListInstanceModelRequest(this);
        } 

    } 

}
