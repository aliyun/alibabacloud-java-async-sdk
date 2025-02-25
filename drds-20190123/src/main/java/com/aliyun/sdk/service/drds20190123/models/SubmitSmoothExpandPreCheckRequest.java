// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.drds20190123.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SubmitSmoothExpandPreCheckRequest} extends {@link RequestModel}
 *
 * <p>SubmitSmoothExpandPreCheckRequest</p>
 */
public class SubmitSmoothExpandPreCheckRequest extends Request {
    @Query
    @NameInMap("DbInstType")
    @Validation(required = true)
    private String dbInstType;

    @Query
    @NameInMap("DbName")
    @Validation(required = true)
    private String dbName;

    @Query
    @NameInMap("DrdsInstanceId")
    @Validation(required = true)
    private String drdsInstanceId;

    private SubmitSmoothExpandPreCheckRequest(Builder builder) {
        super(builder);
        this.dbInstType = builder.dbInstType;
        this.dbName = builder.dbName;
        this.drdsInstanceId = builder.drdsInstanceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SubmitSmoothExpandPreCheckRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return dbInstType
     */
    public String getDbInstType() {
        return this.dbInstType;
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

    public static final class Builder extends Request.Builder<SubmitSmoothExpandPreCheckRequest, Builder> {
        private String dbInstType; 
        private String dbName; 
        private String drdsInstanceId; 

        private Builder() {
            super();
        } 

        private Builder(SubmitSmoothExpandPreCheckRequest request) {
            super(request);
            this.dbInstType = request.dbInstType;
            this.dbName = request.dbName;
            this.drdsInstanceId = request.drdsInstanceId;
        } 

        /**
         * The type of the database. Valid values:
         * <p>
         * 
         * *   RDS
         * *   POLARDB
         */
        public Builder dbInstType(String dbInstType) {
            this.putQueryParameter("DbInstType", dbInstType);
            this.dbInstType = dbInstType;
            return this;
        }

        /**
         * The name of the PolarDB-X database.
         */
        public Builder dbName(String dbName) {
            this.putQueryParameter("DbName", dbName);
            this.dbName = dbName;
            return this;
        }

        /**
         * The ID of the PolarDB-X 1.0 instance.
         */
        public Builder drdsInstanceId(String drdsInstanceId) {
            this.putQueryParameter("DrdsInstanceId", drdsInstanceId);
            this.drdsInstanceId = drdsInstanceId;
            return this;
        }

        @Override
        public SubmitSmoothExpandPreCheckRequest build() {
            return new SubmitSmoothExpandPreCheckRequest(this);
        } 

    } 

}
