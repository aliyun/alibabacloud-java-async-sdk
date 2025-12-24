// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs_workbench20251111.models;

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
 * {@link DescribeTerminalSettingsRequest} extends {@link RequestModel}
 *
 * <p>DescribeTerminalSettingsRequest</p>
 */
public class DescribeTerminalSettingsRequest extends Request {
    private DescribeTerminalSettingsRequest(Builder builder) {
        super(builder);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeTerminalSettingsRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    public static final class Builder extends Request.Builder<DescribeTerminalSettingsRequest, Builder> {

        private Builder() {
            super();
        } 

        private Builder(DescribeTerminalSettingsRequest request) {
            super(request);
        } 

        @Override
        public DescribeTerminalSettingsRequest build() {
            return new DescribeTerminalSettingsRequest(this);
        } 

    } 

}
