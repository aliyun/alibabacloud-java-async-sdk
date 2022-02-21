// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gpdb20160503.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDBInstanceNetInfoRequest} extends {@link RequestModel}
 *
 * <p>DescribeDBInstanceNetInfoRequest</p>
 */
public class DescribeDBInstanceNetInfoRequest extends Request {
    @Query
    @NameInMap("DBInstanceId")
    @Validation(required = true)
    private String DBInstanceId;

    private DescribeDBInstanceNetInfoRequest(Builder builder) {
        super(builder);
        this.DBInstanceId = builder.DBInstanceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDBInstanceNetInfoRequest create() {
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

    public static final class Builder extends Request.Builder<DescribeDBInstanceNetInfoRequest, Builder> {
        private String DBInstanceId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeDBInstanceNetInfoRequest response) {
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
        public DescribeDBInstanceNetInfoRequest build() {
            return new DescribeDBInstanceNetInfoRequest(this);
        } 

    } 

}
