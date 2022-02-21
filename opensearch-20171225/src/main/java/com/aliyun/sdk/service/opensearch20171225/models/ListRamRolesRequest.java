// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.opensearch20171225.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListRamRolesRequest} extends {@link RequestModel}
 *
 * <p>ListRamRolesRequest</p>
 */
public class ListRamRolesRequest extends Request {
    private ListRamRolesRequest(Builder builder) {
        super(builder);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListRamRolesRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    public static final class Builder extends Request.Builder<ListRamRolesRequest, Builder> {

        private Builder() {
            super();
        } 

        private Builder(ListRamRolesRequest response) {
            super(response);
        } 

        @Override
        public ListRamRolesRequest build() {
            return new ListRamRolesRequest(this);
        } 

    } 

}
