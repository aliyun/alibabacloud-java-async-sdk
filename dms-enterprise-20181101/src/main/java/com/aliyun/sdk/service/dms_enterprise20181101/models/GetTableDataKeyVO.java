// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dms_enterprise20181101.models;

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
 * {@link GetTableDataKeyVO} extends {@link TeaModel}
 *
 * <p>GetTableDataKeyVO</p>
 */
public class GetTableDataKeyVO extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ColName")
    private String colName;

    @com.aliyun.core.annotation.NameInMap("DbName")
    private String dbName;

    @com.aliyun.core.annotation.NameInMap("MekId")
    private Long mekId;

    @com.aliyun.core.annotation.NameInMap("SchemaName")
    private String schemaName;

    @com.aliyun.core.annotation.NameInMap("TblName")
    private String tblName;

    @com.aliyun.core.annotation.NameInMap("UserName")
    private String userName;

    private GetTableDataKeyVO(Builder builder) {
        this.colName = builder.colName;
        this.dbName = builder.dbName;
        this.mekId = builder.mekId;
        this.schemaName = builder.schemaName;
        this.tblName = builder.tblName;
        this.userName = builder.userName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetTableDataKeyVO create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return colName
     */
    public String getColName() {
        return this.colName;
    }

    /**
     * @return dbName
     */
    public String getDbName() {
        return this.dbName;
    }

    /**
     * @return mekId
     */
    public Long getMekId() {
        return this.mekId;
    }

    /**
     * @return schemaName
     */
    public String getSchemaName() {
        return this.schemaName;
    }

    /**
     * @return tblName
     */
    public String getTblName() {
        return this.tblName;
    }

    /**
     * @return userName
     */
    public String getUserName() {
        return this.userName;
    }

    public static final class Builder {
        private String colName; 
        private String dbName; 
        private Long mekId; 
        private String schemaName; 
        private String tblName; 
        private String userName; 

        private Builder() {
        } 

        private Builder(GetTableDataKeyVO model) {
            this.colName = model.colName;
            this.dbName = model.dbName;
            this.mekId = model.mekId;
            this.schemaName = model.schemaName;
            this.tblName = model.tblName;
            this.userName = model.userName;
        } 

        /**
         * ColName.
         */
        public Builder colName(String colName) {
            this.colName = colName;
            return this;
        }

        /**
         * DbName.
         */
        public Builder dbName(String dbName) {
            this.dbName = dbName;
            return this;
        }

        /**
         * MekId.
         */
        public Builder mekId(Long mekId) {
            this.mekId = mekId;
            return this;
        }

        /**
         * SchemaName.
         */
        public Builder schemaName(String schemaName) {
            this.schemaName = schemaName;
            return this;
        }

        /**
         * TblName.
         */
        public Builder tblName(String tblName) {
            this.tblName = tblName;
            return this;
        }

        /**
         * UserName.
         */
        public Builder userName(String userName) {
            this.userName = userName;
            return this;
        }

        public GetTableDataKeyVO build() {
            return new GetTableDataKeyVO(this);
        } 

    } 

}
