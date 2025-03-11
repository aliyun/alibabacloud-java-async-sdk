// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.drds20190123.models;

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
 * {@link SubmitHotExpandPreCheckTaskRequest} extends {@link RequestModel}
 *
 * <p>SubmitHotExpandPreCheckTaskRequest</p>
 */
public class SubmitHotExpandPreCheckTaskRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DbInstType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String dbInstType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DbName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String dbName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DrdsInstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String drdsInstanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TableList")
    private java.util.List<String> tableList;

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
    public java.util.List<String> getTableList() {
        return this.tableList;
    }

    public static final class Builder extends Request.Builder<SubmitHotExpandPreCheckTaskRequest, Builder> {
        private String dbInstType; 
        private String dbName; 
        private String drdsInstanceId; 
        private java.util.List<String> tableList; 

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
         * <p>The type of the database. Valid values:</p>
         * <ul>
         * <li>RDS</li>
         * <li>PolarDB</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>RDS</p>
         */
        public Builder dbInstType(String dbInstType) {
            this.putQueryParameter("DbInstType", dbInstType);
            this.dbInstType = dbInstType;
            return this;
        }

        /**
         * <p>The name of the PolarDB-X database.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        public Builder dbName(String dbName) {
            this.putQueryParameter("DbName", dbName);
            this.dbName = dbName;
            return this;
        }

        /**
         * <p>The ID of the PolarDB-X 1.0 instance.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>drd*********</p>
         */
        public Builder drdsInstanceId(String drdsInstanceId) {
            this.putQueryParameter("DrdsInstanceId", drdsInstanceId);
            this.drdsInstanceId = drdsInstanceId;
            return this;
        }

        /**
         * <p>The name of the table.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        public Builder tableList(java.util.List<String> tableList) {
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
