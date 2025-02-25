// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.drds20171016.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeShardDBsRequest} extends {@link RequestModel}
 *
 * <p>DescribeShardDBsRequest</p>
 */
public class DescribeShardDBsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DbName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String dbName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DrdsInstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String drdsInstanceId;

    private DescribeShardDBsRequest(Builder builder) {
        super(builder);
        this.dbName = builder.dbName;
        this.drdsInstanceId = builder.drdsInstanceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeShardDBsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return dbName
     */
    public String getDbName() {
        return this.dbName;
    }

    /**
     * @return drdsInstanceId
     */
    public String getDrdsInstanceId() {
        return this.drdsInstanceId;
    }

    public static final class Builder extends Request.Builder<DescribeShardDBsRequest, Builder> {
        private String dbName; 
        private String drdsInstanceId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeShardDBsRequest request) {
            super(request);
            this.dbName = request.dbName;
            this.drdsInstanceId = request.drdsInstanceId;
        } 

        /**
         * DbName.
         */
        public Builder dbName(String dbName) {
            this.putQueryParameter("DbName", dbName);
            this.dbName = dbName;
            return this;
        }

        /**
         * DrdsInstanceId.
         */
        public Builder drdsInstanceId(String drdsInstanceId) {
            this.putQueryParameter("DrdsInstanceId", drdsInstanceId);
            this.drdsInstanceId = drdsInstanceId;
            return this;
        }

        @Override
        public DescribeShardDBsRequest build() {
            return new DescribeShardDBsRequest(this);
        } 

    } 

}
