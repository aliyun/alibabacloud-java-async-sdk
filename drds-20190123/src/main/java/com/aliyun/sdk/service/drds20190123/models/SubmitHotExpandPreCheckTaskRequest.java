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

        private Builder(SubmitHotExpandPreCheckTaskRequest response) {
            super(response);
            this.dbInstType = response.dbInstType;
            this.dbName = response.dbName;
            this.drdsInstanceId = response.drdsInstanceId;
            this.tableList = response.tableList;
        } 

        /**
         * DbInstType.
         */
        public Builder dbInstType(String dbInstType) {
            this.putQueryParameter("DbInstType", dbInstType);
            this.dbInstType = dbInstType;
            return this;
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
         * TableList.
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
