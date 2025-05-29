// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.consolecs20160406.models;

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
 * {@link ListConsoleProductRequest} extends {@link RequestModel}
 *
 * <p>ListConsoleProductRequest</p>
 */
public class ListConsoleProductRequest extends Request {
    private ListConsoleProductRequest(Builder builder) {
        super(builder);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListConsoleProductRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    public static final class Builder extends Request.Builder<ListConsoleProductRequest, Builder> {

        private Builder() {
            super();
        } 

        private Builder(ListConsoleProductRequest request) {
            super(request);
        } 

        @Override
        public ListConsoleProductRequest build() {
            return new ListConsoleProductRequest(this);
        } 

    } 

}
