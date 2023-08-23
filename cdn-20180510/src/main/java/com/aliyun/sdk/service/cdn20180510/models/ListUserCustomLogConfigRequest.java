// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cdn20180510.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListUserCustomLogConfigRequest} extends {@link RequestModel}
 *
 * <p>ListUserCustomLogConfigRequest</p>
 */
public class ListUserCustomLogConfigRequest extends Request {
    private ListUserCustomLogConfigRequest(Builder builder) {
        super(builder);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListUserCustomLogConfigRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    public static final class Builder extends Request.Builder<ListUserCustomLogConfigRequest, Builder> {

        private Builder() {
            super();
        } 

        private Builder(ListUserCustomLogConfigRequest request) {
            super(request);
        } 

        @Override
        public ListUserCustomLogConfigRequest build() {
            return new ListUserCustomLogConfigRequest(this);
        } 

    } 

}
