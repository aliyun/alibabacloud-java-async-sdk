// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.config20190108.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeConfigurationRecorderRequest} extends {@link RequestModel}
 *
 * <p>DescribeConfigurationRecorderRequest</p>
 */
public class DescribeConfigurationRecorderRequest extends Request {
    private DescribeConfigurationRecorderRequest(Builder builder) {
        super(builder);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeConfigurationRecorderRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    public static final class Builder extends Request.Builder<DescribeConfigurationRecorderRequest, Builder> {

        private Builder() {
            super();
        } 

        private Builder(DescribeConfigurationRecorderRequest response) {
            super(response);
        } 

        @Override
        public DescribeConfigurationRecorderRequest build() {
            return new DescribeConfigurationRecorderRequest(this);
        } 

    } 

}
