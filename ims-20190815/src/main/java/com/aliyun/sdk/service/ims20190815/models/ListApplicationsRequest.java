// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ims20190815.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ListApplicationsRequest} extends {@link RequestModel}
 *
 * <p>ListApplicationsRequest</p>
 */
public class ListApplicationsRequest extends Request {
    private ListApplicationsRequest(Builder builder) {
        super(builder);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListApplicationsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    public static final class Builder extends Request.Builder<ListApplicationsRequest, Builder> {

        private Builder() {
            super();
        } 

        private Builder(ListApplicationsRequest request) {
            super(request);
        } 

        @Override
        public ListApplicationsRequest build() {
            return new ListApplicationsRequest(this);
        } 

    } 

}
