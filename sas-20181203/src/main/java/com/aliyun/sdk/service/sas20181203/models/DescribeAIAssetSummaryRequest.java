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
 * {@link DescribeAIAssetSummaryRequest} extends {@link RequestModel}
 *
 * <p>DescribeAIAssetSummaryRequest</p>
 */
public class DescribeAIAssetSummaryRequest extends Request {
    private DescribeAIAssetSummaryRequest(Builder builder) {
        super(builder);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeAIAssetSummaryRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    public static final class Builder extends Request.Builder<DescribeAIAssetSummaryRequest, Builder> {

        private Builder() {
            super();
        } 

        private Builder(DescribeAIAssetSummaryRequest request) {
            super(request);
        } 

        @Override
        public DescribeAIAssetSummaryRequest build() {
            return new DescribeAIAssetSummaryRequest(this);
        } 

    } 

}
