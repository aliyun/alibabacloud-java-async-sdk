// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.edas20170801.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListServiceGroupsRequest} extends {@link RequestModel}
 *
 * <p>ListServiceGroupsRequest</p>
 */
public class ListServiceGroupsRequest extends Request {
    private ListServiceGroupsRequest(Builder builder) {
        super(builder);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListServiceGroupsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    public static final class Builder extends Request.Builder<ListServiceGroupsRequest, Builder> {

        private Builder() {
            super();
        } 

        private Builder(ListServiceGroupsRequest request) {
            super(request);
        } 

        @Override
        public ListServiceGroupsRequest build() {
            return new ListServiceGroupsRequest(this);
        } 

    } 

}
