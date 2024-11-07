// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eds_user20210308.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ListPropertyRequest} extends {@link RequestModel}
 *
 * <p>ListPropertyRequest</p>
 */
public class ListPropertyRequest extends Request {
    private ListPropertyRequest(Builder builder) {
        super(builder);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListPropertyRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    public static final class Builder extends Request.Builder<ListPropertyRequest, Builder> {

        private Builder() {
            super();
        } 

        private Builder(ListPropertyRequest request) {
            super(request);
        } 

        @Override
        public ListPropertyRequest build() {
            return new ListPropertyRequest(this);
        } 

    } 

}
