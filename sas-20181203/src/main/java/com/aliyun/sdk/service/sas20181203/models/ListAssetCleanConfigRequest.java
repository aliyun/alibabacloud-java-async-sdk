// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListAssetCleanConfigRequest} extends {@link RequestModel}
 *
 * <p>ListAssetCleanConfigRequest</p>
 */
public class ListAssetCleanConfigRequest extends Request {
    private ListAssetCleanConfigRequest(Builder builder) {
        super(builder);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListAssetCleanConfigRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    public static final class Builder extends Request.Builder<ListAssetCleanConfigRequest, Builder> {

        private Builder() {
            super();
        } 

        private Builder(ListAssetCleanConfigRequest request) {
            super(request);
        } 

        @Override
        public ListAssetCleanConfigRequest build() {
            return new ListAssetCleanConfigRequest(this);
        } 

    } 

}
