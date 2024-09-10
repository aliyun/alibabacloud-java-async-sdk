// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20190101.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeSystemEventMetaListRequest} extends {@link RequestModel}
 *
 * <p>DescribeSystemEventMetaListRequest</p>
 */
public class DescribeSystemEventMetaListRequest extends Request {
    private DescribeSystemEventMetaListRequest(Builder builder) {
        super(builder);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeSystemEventMetaListRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    public static final class Builder extends Request.Builder<DescribeSystemEventMetaListRequest, Builder> {

        private Builder() {
            super();
        } 

        private Builder(DescribeSystemEventMetaListRequest request) {
            super(request);
        } 

        @Override
        public DescribeSystemEventMetaListRequest build() {
            return new DescribeSystemEventMetaListRequest(this);
        } 

    } 

}
