// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListInterceptionImageRequest} extends {@link RequestModel}
 *
 * <p>ListInterceptionImageRequest</p>
 */
public class ListInterceptionImageRequest extends Request {
    private ListInterceptionImageRequest(Builder builder) {
        super(builder);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListInterceptionImageRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    public static final class Builder extends Request.Builder<ListInterceptionImageRequest, Builder> {

        private Builder() {
            super();
        } 

        private Builder(ListInterceptionImageRequest request) {
            super(request);
        } 

        @Override
        public ListInterceptionImageRequest build() {
            return new ListInterceptionImageRequest(this);
        } 

    } 

}
