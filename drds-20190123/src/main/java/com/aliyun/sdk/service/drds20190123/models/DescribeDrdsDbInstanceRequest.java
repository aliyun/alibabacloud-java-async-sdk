// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.drds20190123.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDrdsDbInstanceRequest} extends {@link RequestModel}
 *
 * <p>DescribeDrdsDbInstanceRequest</p>
 */
public class DescribeDrdsDbInstanceRequest extends Request {
    @Query
    @NameInMap("DbInstanceId")
    @Validation(required = true)
    private String dbInstanceId;

    @Query
    @NameInMap("DbName")
    @Validation(required = true)
    private String dbName;

    @Query
    @NameInMap("DrdsInstanceId")
    @Validation(required = true)
    private String drdsInstanceId;

    private DescribeDrdsDbInstanceRequest(Builder builder) {
        super(builder);
        this.dbInstanceId = builder.dbInstanceId;
        this.dbName = builder.dbName;
        this.drdsInstanceId = builder.drdsInstanceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDrdsDbInstanceRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return dbInstanceId
     */
    public String getDbInstanceId() {
        return this.dbInstanceId;
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

    public static final class Builder extends Request.Builder<DescribeDrdsDbInstanceRequest, Builder> {
        private String dbInstanceId; 
        private String dbName; 
        private String drdsInstanceId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeDrdsDbInstanceRequest request) {
            super(request);
            this.dbInstanceId = request.dbInstanceId;
            this.dbName = request.dbName;
            this.drdsInstanceId = request.drdsInstanceId;
        } 

        /**
         * The ID of the custom ApsaraDB RDS for MySQL instance that you want to query.
         */
        public Builder dbInstanceId(String dbInstanceId) {
            this.putQueryParameter("DbInstanceId", dbInstanceId);
            this.dbInstanceId = dbInstanceId;
            return this;
        }

        /**
         * The name of the database.
         */
        public Builder dbName(String dbName) {
            this.putQueryParameter("DbName", dbName);
            this.dbName = dbName;
            return this;
        }

        /**
         * The name of the PolarDB-X 1.0 instance.
         */
        public Builder drdsInstanceId(String drdsInstanceId) {
            this.putQueryParameter("DrdsInstanceId", drdsInstanceId);
            this.drdsInstanceId = drdsInstanceId;
            return this;
        }

        @Override
        public DescribeDrdsDbInstanceRequest build() {
            return new DescribeDrdsDbInstanceRequest(this);
        } 

    } 

}
