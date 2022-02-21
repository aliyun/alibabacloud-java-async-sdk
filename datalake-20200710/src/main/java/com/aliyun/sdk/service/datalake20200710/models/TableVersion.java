// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.datalake20200710.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link TableVersion} extends {@link TeaModel}
 *
 * <p>TableVersion</p>
 */
public class TableVersion extends TeaModel {
    @NameInMap("Table")
    private Table table;

    @NameInMap("VersionId")
    private Integer versionId;

    private TableVersion(Builder builder) {
        this.table = builder.table;
        this.versionId = builder.versionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static TableVersion create() {
        return builder().build();
    }

    /**
     * @return table
     */
    public Table getTable() {
        return this.table;
    }

    /**
     * @return versionId
     */
    public Integer getVersionId() {
        return this.versionId;
    }

    public static final class Builder {
        private Table table; 
        private Integer versionId; 

        /**
         * Table.
         */
        public Builder table(Table table) {
            this.table = table;
            return this;
        }

        /**
         * table version
         */
        public Builder versionId(Integer versionId) {
            this.versionId = versionId;
            return this;
        }

        public TableVersion build() {
            return new TableVersion(this);
        } 

    } 

}
