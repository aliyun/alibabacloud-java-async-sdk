// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cs20180418.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeTemplatesRequest} extends {@link RequestModel}
 *
 * <p>DescribeTemplatesRequest</p>
 */
public class DescribeTemplatesRequest extends Request {
    private DescribeTemplatesRequest(Builder builder) {
        super(builder);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeTemplatesRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    public static final class Builder extends Request.Builder<DescribeTemplatesRequest, Builder> {

        private Builder() {
            super();
        } 

        private Builder(DescribeTemplatesRequest response) {
            super(response);
        } 

        @Override
        public DescribeTemplatesRequest build() {
            return new DescribeTemplatesRequest(this);
        } 

    } 

}
