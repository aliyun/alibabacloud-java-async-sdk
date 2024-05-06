// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.searchengine20211025.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListClusterNamesRequest} extends {@link RequestModel}
 *
 * <p>ListClusterNamesRequest</p>
 */
public class ListClusterNamesRequest extends Request {
    private ListClusterNamesRequest(Builder builder) {
        super(builder);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListClusterNamesRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    public static final class Builder extends Request.Builder<ListClusterNamesRequest, Builder> {

        private Builder() {
            super();
        } 

        private Builder(ListClusterNamesRequest request) {
            super(request);
        } 

        @Override
        public ListClusterNamesRequest build() {
            return new ListClusterNamesRequest(this);
        } 

    } 

}
