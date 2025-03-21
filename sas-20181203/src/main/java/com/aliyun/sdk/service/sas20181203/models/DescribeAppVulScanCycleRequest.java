// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.sdk.gateway.pop.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeAppVulScanCycleRequest} extends {@link RequestModel}
 *
 * <p>DescribeAppVulScanCycleRequest</p>
 */
public class DescribeAppVulScanCycleRequest extends Request {
    private DescribeAppVulScanCycleRequest(Builder builder) {
        super(builder);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeAppVulScanCycleRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    public static final class Builder extends Request.Builder<DescribeAppVulScanCycleRequest, Builder> {

        private Builder() {
            super();
        } 

        private Builder(DescribeAppVulScanCycleRequest request) {
            super(request);
        } 

        @Override
        public DescribeAppVulScanCycleRequest build() {
            return new DescribeAppVulScanCycleRequest(this);
        } 

    } 

}
