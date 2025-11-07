// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudauth20190307.models;

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
 * {@link DescribePageSettingRequest} extends {@link RequestModel}
 *
 * <p>DescribePageSettingRequest</p>
 */
public class DescribePageSettingRequest extends Request {
    private DescribePageSettingRequest(Builder builder) {
        super(builder);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribePageSettingRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    public static final class Builder extends Request.Builder<DescribePageSettingRequest, Builder> {

        private Builder() {
            super();
        } 

        private Builder(DescribePageSettingRequest request) {
            super(request);
        } 

        @Override
        public DescribePageSettingRequest build() {
            return new DescribePageSettingRequest(this);
        } 

    } 

}
