// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adb20211201.models;

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
 * {@link OpenStructMvBaseTableDetailModel} extends {@link TeaModel}
 *
 * <p>OpenStructMvBaseTableDetailModel</p>
 */
public class OpenStructMvBaseTableDetailModel extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DataVolumn")
    private String dataVolumn;

    @com.aliyun.core.annotation.NameInMap("EnableBinlog")
    private Boolean enableBinlog;

    @com.aliyun.core.annotation.NameInMap("SchemaName")
    private String schemaName;

    @com.aliyun.core.annotation.NameInMap("TableName")
    private String tableName;

    private OpenStructMvBaseTableDetailModel(Builder builder) {
        this.dataVolumn = builder.dataVolumn;
        this.enableBinlog = builder.enableBinlog;
        this.schemaName = builder.schemaName;
        this.tableName = builder.tableName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static OpenStructMvBaseTableDetailModel create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return dataVolumn
     */
    public String getDataVolumn() {
        return this.dataVolumn;
    }

    /**
     * @return enableBinlog
     */
    public Boolean getEnableBinlog() {
        return this.enableBinlog;
    }

    /**
     * @return schemaName
     */
    public String getSchemaName() {
        return this.schemaName;
    }

    /**
     * @return tableName
     */
    public String getTableName() {
        return this.tableName;
    }

    public static final class Builder {
        private String dataVolumn; 
        private Boolean enableBinlog; 
        private String schemaName; 
        private String tableName; 

        private Builder() {
        } 

        private Builder(OpenStructMvBaseTableDetailModel model) {
            this.dataVolumn = model.dataVolumn;
            this.enableBinlog = model.enableBinlog;
            this.schemaName = model.schemaName;
            this.tableName = model.tableName;
        } 

        /**
         * DataVolumn.
         */
        public Builder dataVolumn(String dataVolumn) {
            this.dataVolumn = dataVolumn;
            return this;
        }

        /**
         * EnableBinlog.
         */
        public Builder enableBinlog(Boolean enableBinlog) {
            this.enableBinlog = enableBinlog;
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
         * TableName.
         */
        public Builder tableName(String tableName) {
            this.tableName = tableName;
            return this;
        }

        public OpenStructMvBaseTableDetailModel build() {
            return new OpenStructMvBaseTableDetailModel(this);
        } 

    } 

}
