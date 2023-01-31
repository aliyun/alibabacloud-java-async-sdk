// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vpc20160428.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListGeographicSubRegionsRequest} extends {@link RequestModel}
 *
 * <p>ListGeographicSubRegionsRequest</p>
 */
public class ListGeographicSubRegionsRequest extends Request {
    private ListGeographicSubRegionsRequest(Builder builder) {
        super(builder);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListGeographicSubRegionsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    public static final class Builder extends Request.Builder<ListGeographicSubRegionsRequest, Builder> {

        private Builder() {
            super();
        } 

        private Builder(ListGeographicSubRegionsRequest request) {
            super(request);
        } 

        @Override
        public ListGeographicSubRegionsRequest build() {
            return new ListGeographicSubRegionsRequest(this);
        } 

    } 

}
