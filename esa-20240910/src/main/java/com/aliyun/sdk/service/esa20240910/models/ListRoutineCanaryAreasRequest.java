// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.esa20240910.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ListRoutineCanaryAreasRequest} extends {@link RequestModel}
 *
 * <p>ListRoutineCanaryAreasRequest</p>
 */
public class ListRoutineCanaryAreasRequest extends Request {
    private ListRoutineCanaryAreasRequest(Builder builder) {
        super(builder);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListRoutineCanaryAreasRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    public static final class Builder extends Request.Builder<ListRoutineCanaryAreasRequest, Builder> {

        private Builder() {
            super();
        } 

        private Builder(ListRoutineCanaryAreasRequest request) {
            super(request);
        } 

        @Override
        public ListRoutineCanaryAreasRequest build() {
            return new ListRoutineCanaryAreasRequest(this);
        } 

    } 

}
