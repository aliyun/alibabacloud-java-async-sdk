// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeUserBackupMachinesRequest} extends {@link RequestModel}
 *
 * <p>DescribeUserBackupMachinesRequest</p>
 */
public class DescribeUserBackupMachinesRequest extends Request {
    private DescribeUserBackupMachinesRequest(Builder builder) {
        super(builder);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeUserBackupMachinesRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    public static final class Builder extends Request.Builder<DescribeUserBackupMachinesRequest, Builder> {

        private Builder() {
            super();
        } 

        private Builder(DescribeUserBackupMachinesRequest request) {
            super(request);
        } 

        @Override
        public DescribeUserBackupMachinesRequest build() {
            return new DescribeUserBackupMachinesRequest(this);
        } 

    } 

}
