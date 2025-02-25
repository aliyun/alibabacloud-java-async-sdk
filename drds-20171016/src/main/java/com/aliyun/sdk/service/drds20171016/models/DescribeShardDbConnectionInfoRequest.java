// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.drds20171016.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeShardDbConnectionInfoRequest} extends {@link RequestModel}
 *
 * <p>DescribeShardDbConnectionInfoRequest</p>
 */
public class DescribeShardDbConnectionInfoRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DbName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String dbName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DrdsInstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String drdsInstanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SubDbName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String subDbName;

    private DescribeShardDbConnectionInfoRequest(Builder builder) {
        super(builder);
        this.dbName = builder.dbName;
        this.drdsInstanceId = builder.drdsInstanceId;
        this.subDbName = builder.subDbName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeShardDbConnectionInfoRequest create() {
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

    /**
     * @return subDbName
     */
    public String getSubDbName() {
        return this.subDbName;
    }

    public static final class Builder extends Request.Builder<DescribeShardDbConnectionInfoRequest, Builder> {
        private String dbName; 
        private String drdsInstanceId; 
        private String subDbName; 

        private Builder() {
            super();
        } 

        private Builder(DescribeShardDbConnectionInfoRequest request) {
            super(request);
            this.dbName = request.dbName;
            this.drdsInstanceId = request.drdsInstanceId;
            this.subDbName = request.subDbName;
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

        /**
         * SubDbName.
         */
        public Builder subDbName(String subDbName) {
            this.putQueryParameter("SubDbName", subDbName);
            this.subDbName = subDbName;
            return this;
        }

        @Override
        public DescribeShardDbConnectionInfoRequest build() {
            return new DescribeShardDbConnectionInfoRequest(this);
        } 

    } 

}
