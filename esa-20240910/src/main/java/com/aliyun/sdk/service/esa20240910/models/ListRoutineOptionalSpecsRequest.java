// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.esa20240910.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ListRoutineOptionalSpecsRequest} extends {@link RequestModel}
 *
 * <p>ListRoutineOptionalSpecsRequest</p>
 */
public class ListRoutineOptionalSpecsRequest extends Request {
    private ListRoutineOptionalSpecsRequest(Builder builder) {
        super(builder);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListRoutineOptionalSpecsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    public static final class Builder extends Request.Builder<ListRoutineOptionalSpecsRequest, Builder> {

        private Builder() {
            super();
        } 

        private Builder(ListRoutineOptionalSpecsRequest request) {
            super(request);
        } 

        @Override
        public ListRoutineOptionalSpecsRequest build() {
            return new ListRoutineOptionalSpecsRequest(this);
        } 

    } 

}
