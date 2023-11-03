// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListSupportObjectSuffixRequest} extends {@link RequestModel}
 *
 * <p>ListSupportObjectSuffixRequest</p>
 */
public class ListSupportObjectSuffixRequest extends Request {
    private ListSupportObjectSuffixRequest(Builder builder) {
        super(builder);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListSupportObjectSuffixRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    public static final class Builder extends Request.Builder<ListSupportObjectSuffixRequest, Builder> {

        private Builder() {
            super();
        } 

        private Builder(ListSupportObjectSuffixRequest request) {
            super(request);
        } 

        @Override
        public ListSupportObjectSuffixRequest build() {
            return new ListSupportObjectSuffixRequest(this);
        } 

    } 

}
