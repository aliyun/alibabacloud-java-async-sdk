// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.airec20201126.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ListUmengAppkeysRequest} extends {@link RequestModel}
 *
 * <p>ListUmengAppkeysRequest</p>
 */
public class ListUmengAppkeysRequest extends Request {
    private ListUmengAppkeysRequest(Builder builder) {
        super(builder);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListUmengAppkeysRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    public static final class Builder extends Request.Builder<ListUmengAppkeysRequest, Builder> {

        private Builder() {
            super();
        } 

        private Builder(ListUmengAppkeysRequest request) {
            super(request);
        } 

        @Override
        public ListUmengAppkeysRequest build() {
            return new ListUmengAppkeysRequest(this);
        } 

    } 

}
