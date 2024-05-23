// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.drds20171016.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyFullTableScanRequest} extends {@link RequestModel}
 *
 * <p>ModifyFullTableScanRequest</p>
 */
public class ModifyFullTableScanRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DbName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String dbName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DrdsInstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String drdsInstanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FullTableScan")
    @com.aliyun.core.annotation.Validation(required = true)
    private Boolean fullTableScan;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TableNames")
    @com.aliyun.core.annotation.Validation(required = true)
    private String tableNames;

    private ModifyFullTableScanRequest(Builder builder) {
        super(builder);
        this.dbName = builder.dbName;
        this.drdsInstanceId = builder.drdsInstanceId;
        this.fullTableScan = builder.fullTableScan;
        this.tableNames = builder.tableNames;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyFullTableScanRequest create() {
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
     * @return fullTableScan
     */
    public Boolean getFullTableScan() {
        return this.fullTableScan;
    }

    /**
     * @return tableNames
     */
    public String getTableNames() {
        return this.tableNames;
    }

    public static final class Builder extends Request.Builder<ModifyFullTableScanRequest, Builder> {
        private String dbName; 
        private String drdsInstanceId; 
        private Boolean fullTableScan; 
        private String tableNames; 

        private Builder() {
            super();
        } 

        private Builder(ModifyFullTableScanRequest request) {
            super(request);
            this.dbName = request.dbName;
            this.drdsInstanceId = request.drdsInstanceId;
            this.fullTableScan = request.fullTableScan;
            this.tableNames = request.tableNames;
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
         * FullTableScan.
         */
        public Builder fullTableScan(Boolean fullTableScan) {
            this.putQueryParameter("FullTableScan", fullTableScan);
            this.fullTableScan = fullTableScan;
            return this;
        }

        /**
         * TableNames.
         */
        public Builder tableNames(String tableNames) {
            this.putQueryParameter("TableNames", tableNames);
            this.tableNames = tableNames;
            return this;
        }

        @Override
        public ModifyFullTableScanRequest build() {
            return new ModifyFullTableScanRequest(this);
        } 

    } 

}
