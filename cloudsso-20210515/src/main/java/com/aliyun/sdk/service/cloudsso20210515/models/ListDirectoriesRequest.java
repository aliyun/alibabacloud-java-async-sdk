// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudsso20210515.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListDirectoriesRequest} extends {@link RequestModel}
 *
 * <p>ListDirectoriesRequest</p>
 */
public class ListDirectoriesRequest extends Request {
    private ListDirectoriesRequest(Builder builder) {
        super(builder);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListDirectoriesRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    public static final class Builder extends Request.Builder<ListDirectoriesRequest, Builder> {

        private Builder() {
            super();
        } 

        private Builder(ListDirectoriesRequest request) {
            super(request);
        } 

        @Override
        public ListDirectoriesRequest build() {
            return new ListDirectoriesRequest(this);
        } 

    } 

}
