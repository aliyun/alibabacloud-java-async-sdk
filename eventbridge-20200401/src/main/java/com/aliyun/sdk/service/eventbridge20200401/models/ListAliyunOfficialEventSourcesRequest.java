// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eventbridge20200401.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.eventbridge.models.*;

/**
 * {@link ListAliyunOfficialEventSourcesRequest} extends {@link RequestModel}
 *
 * <p>ListAliyunOfficialEventSourcesRequest</p>
 */
public class ListAliyunOfficialEventSourcesRequest extends Request {
    private ListAliyunOfficialEventSourcesRequest(Builder builder) {
        super(builder);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListAliyunOfficialEventSourcesRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    public static final class Builder extends Request.Builder<ListAliyunOfficialEventSourcesRequest, Builder> {

        private Builder() {
            super();
        } 

        private Builder(ListAliyunOfficialEventSourcesRequest request) {
            super(request);
        } 

        @Override
        public ListAliyunOfficialEventSourcesRequest build() {
            return new ListAliyunOfficialEventSourcesRequest(this);
        } 

    } 

}
