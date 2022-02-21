// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ebs20210730.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeSecondMonitorServiceStatusRequest} extends {@link RequestModel}
 *
 * <p>DescribeSecondMonitorServiceStatusRequest</p>
 */
public class DescribeSecondMonitorServiceStatusRequest extends Request {
    private DescribeSecondMonitorServiceStatusRequest(Builder builder) {
        super(builder);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeSecondMonitorServiceStatusRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    public static final class Builder extends Request.Builder<DescribeSecondMonitorServiceStatusRequest, Builder> {

        private Builder() {
            super();
        } 

        private Builder(DescribeSecondMonitorServiceStatusRequest response) {
            super(response);
        } 

        @Override
        public DescribeSecondMonitorServiceStatusRequest build() {
            return new DescribeSecondMonitorServiceStatusRequest(this);
        } 

    } 

}
