// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.drds20190123.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SubmitHotExpandPreCheckTaskRequest} extends {@link RequestModel}
 *
 * <p>SubmitHotExpandPreCheckTaskRequest</p>
 */
public class SubmitHotExpandPreCheckTaskRequest extends Request {
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

    @Query
    @NameInMap("TableList")
    private java.util.List < String > tableList;

    private SubmitHotExpandPreCheckTaskRequest(Builder builder) {
        super(builder);
        this.dbInstType = builder.dbInstType;
        this.dbName = builder.dbName;
        this.drdsInstanceId = builder.drdsInstanceId;
        this.tableList = builder.tableList;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SubmitHotExpandPreCheckTaskRequest create() {
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

    /**
     * @return tableList
     */
    public java.util.List < String > getTableList() {
        return this.tableList;
    }

    public static final class Builder extends Request.Builder<SubmitHotExpandPreCheckTaskRequest, Builder> {
        private String dbInstType; 
        private String dbName; 
        private String drdsInstanceId; 
        private java.util.List < String > tableList; 

        private Builder() {
            super();
        } 

        private Builder(SubmitHotExpandPreCheckTaskRequest request) {
            super(request);
            this.dbInstType = request.dbInstType;
            this.dbName = request.dbName;
            this.drdsInstanceId = request.drdsInstanceId;
            this.tableList = request.tableList;
        } 

        /**
         * The type of the database. Valid values:
         * <p>
         * 
         * *   RDS
         * *   PolarDB
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

        /**
         * The name of the table.
         */
        public Builder tableList(java.util.List < String > tableList) {
            this.putQueryParameter("TableList", tableList);
            this.tableList = tableList;
            return this;
        }

        @Override
        public SubmitHotExpandPreCheckTaskRequest build() {
            return new SubmitHotExpandPreCheckTaskRequest(this);
        } 

    } 

}
