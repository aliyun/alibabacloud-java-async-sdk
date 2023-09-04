// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gemp20210413.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteServiceGroupSchedulingRequest} extends {@link RequestModel}
 *
 * <p>DeleteServiceGroupSchedulingRequest</p>
 */
public class DeleteServiceGroupSchedulingRequest extends Request {
    private DeleteServiceGroupSchedulingRequest(Builder builder) {
        super(builder);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteServiceGroupSchedulingRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    public static final class Builder extends Request.Builder<DeleteServiceGroupSchedulingRequest, Builder> {

        private Builder() {
            super();
        } 

        private Builder(DeleteServiceGroupSchedulingRequest request) {
            super(request);
        } 

        @Override
        public DeleteServiceGroupSchedulingRequest build() {
            return new DeleteServiceGroupSchedulingRequest(this);
        } 

    } 

}
