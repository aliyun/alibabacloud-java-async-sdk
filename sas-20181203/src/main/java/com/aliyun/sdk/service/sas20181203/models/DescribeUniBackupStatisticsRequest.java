// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeUniBackupStatisticsRequest} extends {@link RequestModel}
 *
 * <p>DescribeUniBackupStatisticsRequest</p>
 */
public class DescribeUniBackupStatisticsRequest extends Request {
    private DescribeUniBackupStatisticsRequest(Builder builder) {
        super(builder);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeUniBackupStatisticsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    public static final class Builder extends Request.Builder<DescribeUniBackupStatisticsRequest, Builder> {

        private Builder() {
            super();
        } 

        private Builder(DescribeUniBackupStatisticsRequest request) {
            super(request);
        } 

        @Override
        public DescribeUniBackupStatisticsRequest build() {
            return new DescribeUniBackupStatisticsRequest(this);
        } 

    } 

}
