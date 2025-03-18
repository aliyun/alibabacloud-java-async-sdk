// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gpdb20160503.models;

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
 * {@link DescribeIMVInfosRequest} extends {@link RequestModel}
 *
 * <p>DescribeIMVInfosRequest</p>
 */
public class DescribeIMVInfosRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DBInstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String DBInstanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Database")
    @com.aliyun.core.annotation.Validation(required = true)
    private String database;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MVName")
    private String MVName;

    private DescribeIMVInfosRequest(Builder builder) {
        super(builder);
        this.DBInstanceId = builder.DBInstanceId;
        this.database = builder.database;
        this.MVName = builder.MVName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeIMVInfosRequest create() {
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

    /**
     * @return database
     */
    public String getDatabase() {
        return this.database;
    }

    /**
     * @return MVName
     */
    public String getMVName() {
        return this.MVName;
    }

    public static final class Builder extends Request.Builder<DescribeIMVInfosRequest, Builder> {
        private String DBInstanceId; 
        private String database; 
        private String MVName; 

        private Builder() {
            super();
        } 

        private Builder(DescribeIMVInfosRequest request) {
            super(request);
            this.DBInstanceId = request.DBInstanceId;
            this.database = request.database;
            this.MVName = request.MVName;
        } 

        /**
         * <p>The instance ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>gp-xxxxxxxxxx</p>
         */
        public Builder DBInstanceId(String DBInstanceId) {
            this.putQueryParameter("DBInstanceId", DBInstanceId);
            this.DBInstanceId = DBInstanceId;
            return this;
        }

        /**
         * <p>The name of the database.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>testdb</p>
         */
        public Builder database(String database) {
            this.putQueryParameter("Database", database);
            this.database = database;
            return this;
        }

        /**
         * <p>The name of MV</p>
         * 
         * <strong>example:</strong>
         * <p>public.&quot;mv1&quot;</p>
         */
        public Builder MVName(String MVName) {
            this.putQueryParameter("MVName", MVName);
            this.MVName = MVName;
            return this;
        }

        @Override
        public DescribeIMVInfosRequest build() {
            return new DescribeIMVInfosRequest(this);
        } 

    } 

}
