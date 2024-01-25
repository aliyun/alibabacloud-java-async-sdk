// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.umeng_finplus20211130.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListYydComputeTaskListRequest} extends {@link RequestModel}
 *
 * <p>ListYydComputeTaskListRequest</p>
 */
public class ListYydComputeTaskListRequest extends Request {
    private ListYydComputeTaskListRequest(Builder builder) {
        super(builder);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListYydComputeTaskListRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    public static final class Builder extends Request.Builder<ListYydComputeTaskListRequest, Builder> {

        private Builder() {
            super();
        } 

        private Builder(ListYydComputeTaskListRequest request) {
            super(request);
        } 

        @Override
        public ListYydComputeTaskListRequest build() {
            return new ListYydComputeTaskListRequest(this);
        } 

    } 

}
