// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.milvus20231012.models;

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
 * {@link DlfDatabase} extends {@link TeaModel}
 *
 * <p>DlfDatabase</p>
 */
public class DlfDatabase extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("databaseName")
    private String databaseName;

    @com.aliyun.core.annotation.NameInMap("description")
    private String description;

    @com.aliyun.core.annotation.NameInMap("tableCount")
    private Integer tableCount;

    private DlfDatabase(Builder builder) {
        this.databaseName = builder.databaseName;
        this.description = builder.description;
        this.tableCount = builder.tableCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DlfDatabase create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return databaseName
     */
    public String getDatabaseName() {
        return this.databaseName;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return tableCount
     */
    public Integer getTableCount() {
        return this.tableCount;
    }

    public static final class Builder {
        private String databaseName; 
        private String description; 
        private Integer tableCount; 

        private Builder() {
        } 

        private Builder(DlfDatabase model) {
            this.databaseName = model.databaseName;
            this.description = model.description;
            this.tableCount = model.tableCount;
        } 

        /**
         * databaseName.
         */
        public Builder databaseName(String databaseName) {
            this.databaseName = databaseName;
            return this;
        }

        /**
         * description.
         */
        public Builder description(String description) {
            this.description = description;
            return this;
        }

        /**
         * tableCount.
         */
        public Builder tableCount(Integer tableCount) {
            this.tableCount = tableCount;
            return this;
        }

        public DlfDatabase build() {
            return new DlfDatabase(this);
        } 

    } 

}
