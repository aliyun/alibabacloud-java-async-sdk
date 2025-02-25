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
 * {@link DescribeAssetSummaryRequest} extends {@link RequestModel}
 *
 * <p>DescribeAssetSummaryRequest</p>
 */
public class DescribeAssetSummaryRequest extends Request {
    private DescribeAssetSummaryRequest(Builder builder) {
        super(builder);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeAssetSummaryRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    public static final class Builder extends Request.Builder<DescribeAssetSummaryRequest, Builder> {

        private Builder() {
            super();
        } 

        private Builder(DescribeAssetSummaryRequest request) {
            super(request);
        } 

        @Override
        public DescribeAssetSummaryRequest build() {
            return new DescribeAssetSummaryRequest(this);
        } 

    } 

}
