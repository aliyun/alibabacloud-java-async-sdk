// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.umeng_finplus20211130.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListYydDataSetRequest} extends {@link RequestModel}
 *
 * <p>ListYydDataSetRequest</p>
 */
public class ListYydDataSetRequest extends Request {
    private ListYydDataSetRequest(Builder builder) {
        super(builder);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListYydDataSetRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    public static final class Builder extends Request.Builder<ListYydDataSetRequest, Builder> {

        private Builder() {
            super();
        } 

        private Builder(ListYydDataSetRequest request) {
            super(request);
        } 

        @Override
        public ListYydDataSetRequest build() {
            return new ListYydDataSetRequest(this);
        } 

    } 

}
