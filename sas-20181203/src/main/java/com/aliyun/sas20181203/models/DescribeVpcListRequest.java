// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;

/**
 * {@link DescribeVpcListRequest} extends {@link RequestModel}
 *
 * <p>DescribeVpcListRequest</p>
 */
public class DescribeVpcListRequest extends Request {

    private DescribeVpcListRequest(Builder builder) {
        super(builder);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeVpcListRequest create() {
        return builder().build();
    }

    public static final class Builder extends Request.Builder<Builder> {

        public DescribeVpcListRequest build() {
            return new DescribeVpcListRequest(this);
        } 

    } 

}
