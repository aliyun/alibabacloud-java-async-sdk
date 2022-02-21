// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gpdb20160503.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeResourceUsageRequest} extends {@link RequestModel}
 *
 * <p>DescribeResourceUsageRequest</p>
 */
public class DescribeResourceUsageRequest extends Request {
    @Query
    @NameInMap("DBInstanceId")
    @Validation(required = true)
    private String DBInstanceId;

    private DescribeResourceUsageRequest(Builder builder) {
        super(builder);
        this.DBInstanceId = builder.DBInstanceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeResourceUsageRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return DBInstanceId
     */
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    public static final class Builder extends Request.Builder<DescribeResourceUsageRequest, Builder> {
        private String DBInstanceId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeResourceUsageRequest response) {
            super(response);
            this.DBInstanceId = response.DBInstanceId;
        } 

        /**
         * DBInstanceId.
         */
        public Builder DBInstanceId(String DBInstanceId) {
            this.putQueryParameter("DBInstanceId", DBInstanceId);
            this.DBInstanceId = DBInstanceId;
            return this;
        }

        @Override
        public DescribeResourceUsageRequest build() {
            return new DescribeResourceUsageRequest(this);
        } 

    } 

}
