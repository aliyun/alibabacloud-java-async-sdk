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
 * {@link DescribeBackupRestoreCountRequest} extends {@link RequestModel}
 *
 * <p>DescribeBackupRestoreCountRequest</p>
 */
public class DescribeBackupRestoreCountRequest extends Request {
    private DescribeBackupRestoreCountRequest(Builder builder) {
        super(builder);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeBackupRestoreCountRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    public static final class Builder extends Request.Builder<DescribeBackupRestoreCountRequest, Builder> {

        private Builder() {
            super();
        } 

        private Builder(DescribeBackupRestoreCountRequest request) {
            super(request);
        } 

        @Override
        public DescribeBackupRestoreCountRequest build() {
            return new DescribeBackupRestoreCountRequest(this);
        } 

    } 

}
