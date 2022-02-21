// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gpdb20160503.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDBInstanceIPArrayListRequest} extends {@link RequestModel}
 *
 * <p>DescribeDBInstanceIPArrayListRequest</p>
 */
public class DescribeDBInstanceIPArrayListRequest extends Request {
    @Query
    @NameInMap("DBInstanceId")
    @Validation(required = true)
    private String DBInstanceId;

    private DescribeDBInstanceIPArrayListRequest(Builder builder) {
        super(builder);
        this.DBInstanceId = builder.DBInstanceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDBInstanceIPArrayListRequest create() {
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

    public static final class Builder extends Request.Builder<DescribeDBInstanceIPArrayListRequest, Builder> {
        private String DBInstanceId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeDBInstanceIPArrayListRequest response) {
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
        public DescribeDBInstanceIPArrayListRequest build() {
            return new DescribeDBInstanceIPArrayListRequest(this);
        } 

    } 

}
