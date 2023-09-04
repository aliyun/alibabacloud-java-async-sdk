// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gemp20210413.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListServiceGroupsByUserIdRequest} extends {@link RequestModel}
 *
 * <p>ListServiceGroupsByUserIdRequest</p>
 */
public class ListServiceGroupsByUserIdRequest extends Request {
    private ListServiceGroupsByUserIdRequest(Builder builder) {
        super(builder);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListServiceGroupsByUserIdRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    public static final class Builder extends Request.Builder<ListServiceGroupsByUserIdRequest, Builder> {

        private Builder() {
            super();
        } 

        private Builder(ListServiceGroupsByUserIdRequest request) {
            super(request);
        } 

        @Override
        public ListServiceGroupsByUserIdRequest build() {
            return new ListServiceGroupsByUserIdRequest(this);
        } 

    } 

}
