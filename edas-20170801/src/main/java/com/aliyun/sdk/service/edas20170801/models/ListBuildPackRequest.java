// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.edas20170801.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListBuildPackRequest} extends {@link RequestModel}
 *
 * <p>ListBuildPackRequest</p>
 */
public class ListBuildPackRequest extends Request {
    private ListBuildPackRequest(Builder builder) {
        super(builder);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListBuildPackRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    public static final class Builder extends Request.Builder<ListBuildPackRequest, Builder> {

        private Builder() {
            super();
        } 

        private Builder(ListBuildPackRequest request) {
            super(request);
        } 

        @Override
        public ListBuildPackRequest build() {
            return new ListBuildPackRequest(this);
        } 

    } 

}
