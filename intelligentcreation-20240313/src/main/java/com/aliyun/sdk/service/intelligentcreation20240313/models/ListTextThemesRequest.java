// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.intelligentcreation20240313.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListTextThemesRequest} extends {@link RequestModel}
 *
 * <p>ListTextThemesRequest</p>
 */
public class ListTextThemesRequest extends Request {
    private ListTextThemesRequest(Builder builder) {
        super(builder);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListTextThemesRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    public static final class Builder extends Request.Builder<ListTextThemesRequest, Builder> {

        private Builder() {
            super();
        } 

        private Builder(ListTextThemesRequest request) {
            super(request);
        } 

        @Override
        public ListTextThemesRequest build() {
            return new ListTextThemesRequest(this);
        } 

    } 

}
