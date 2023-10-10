// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.edas20170801.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListAliyunRegionRequest} extends {@link RequestModel}
 *
 * <p>ListAliyunRegionRequest</p>
 */
public class ListAliyunRegionRequest extends Request {
    private ListAliyunRegionRequest(Builder builder) {
        super(builder);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListAliyunRegionRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    public static final class Builder extends Request.Builder<ListAliyunRegionRequest, Builder> {

        private Builder() {
            super();
        } 

        private Builder(ListAliyunRegionRequest request) {
            super(request);
        } 

        @Override
        public ListAliyunRegionRequest build() {
            return new ListAliyunRegionRequest(this);
        } 

    } 

}
