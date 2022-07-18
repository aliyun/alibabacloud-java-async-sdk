// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eas20210701.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListBenchmarkTaskRequest} extends {@link RequestModel}
 *
 * <p>ListBenchmarkTaskRequest</p>
 */
public class ListBenchmarkTaskRequest extends Request {
    private ListBenchmarkTaskRequest(Builder builder) {
        super(builder);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListBenchmarkTaskRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    public static final class Builder extends Request.Builder<ListBenchmarkTaskRequest, Builder> {

        private Builder() {
            super();
        } 

        private Builder(ListBenchmarkTaskRequest request) {
            super(request);
        } 

        @Override
        public ListBenchmarkTaskRequest build() {
            return new ListBenchmarkTaskRequest(this);
        } 

    } 

}
