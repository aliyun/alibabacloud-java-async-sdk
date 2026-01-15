// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.safconsole20250521.models;

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
 * {@link DescribeFeatureTemplateListRequest} extends {@link RequestModel}
 *
 * <p>DescribeFeatureTemplateListRequest</p>
 */
public class DescribeFeatureTemplateListRequest extends Request {
    private DescribeFeatureTemplateListRequest(Builder builder) {
        super(builder);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeFeatureTemplateListRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    public static final class Builder extends Request.Builder<DescribeFeatureTemplateListRequest, Builder> {

        private Builder() {
            super();
        } 

        private Builder(DescribeFeatureTemplateListRequest request) {
            super(request);
        } 

        @Override
        public DescribeFeatureTemplateListRequest build() {
            return new DescribeFeatureTemplateListRequest(this);
        } 

    } 

}
