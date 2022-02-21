// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.push20160801.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListSummaryAppsRequest} extends {@link RequestModel}
 *
 * <p>ListSummaryAppsRequest</p>
 */
public class ListSummaryAppsRequest extends Request {
    private ListSummaryAppsRequest(Builder builder) {
        super(builder);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListSummaryAppsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    public static final class Builder extends Request.Builder<ListSummaryAppsRequest, Builder> {

        private Builder() {
            super();
        } 

        private Builder(ListSummaryAppsRequest response) {
            super(response);
        } 

        @Override
        public ListSummaryAppsRequest build() {
            return new ListSummaryAppsRequest(this);
        } 

    } 

}
