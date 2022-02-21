// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ehpc20180412.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListCurrentClientVersionRequest} extends {@link RequestModel}
 *
 * <p>ListCurrentClientVersionRequest</p>
 */
public class ListCurrentClientVersionRequest extends Request {
    private ListCurrentClientVersionRequest(Builder builder) {
        super(builder);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListCurrentClientVersionRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    public static final class Builder extends Request.Builder<ListCurrentClientVersionRequest, Builder> {

        private Builder() {
            super();
        } 

        private Builder(ListCurrentClientVersionRequest response) {
            super(response);
        } 

        @Override
        public ListCurrentClientVersionRequest build() {
            return new ListCurrentClientVersionRequest(this);
        } 

    } 

}
