// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dms20250414.models;

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
 * {@link AgenticDatabaseObject} extends {@link TeaModel}
 *
 * <p>AgenticDatabaseObject</p>
 */
public class AgenticDatabaseObject extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DatabaseQualifiedName")
    private String databaseQualifiedName;

    @com.aliyun.core.annotation.NameInMap("DatabaseUuid")
    private String databaseUuid;

    @com.aliyun.core.annotation.NameInMap("DdlSql")
    private String ddlSql;

    @com.aliyun.core.annotation.NameInMap("ObjectName")
    private String objectName;

    @com.aliyun.core.annotation.NameInMap("ObjectQualifiedName")
    private String objectQualifiedName;

    @com.aliyun.core.annotation.NameInMap("ObjectType")
    private String objectType;

    private AgenticDatabaseObject(Builder builder) {
        this.databaseQualifiedName = builder.databaseQualifiedName;
        this.databaseUuid = builder.databaseUuid;
        this.ddlSql = builder.ddlSql;
        this.objectName = builder.objectName;
        this.objectQualifiedName = builder.objectQualifiedName;
        this.objectType = builder.objectType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AgenticDatabaseObject create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return databaseQualifiedName
     */
    public String getDatabaseQualifiedName() {
        return this.databaseQualifiedName;
    }

    /**
     * @return databaseUuid
     */
    public String getDatabaseUuid() {
        return this.databaseUuid;
    }

    /**
     * @return ddlSql
     */
    public String getDdlSql() {
        return this.ddlSql;
    }

    /**
     * @return objectName
     */
    public String getObjectName() {
        return this.objectName;
    }

    /**
     * @return objectQualifiedName
     */
    public String getObjectQualifiedName() {
        return this.objectQualifiedName;
    }

    /**
     * @return objectType
     */
    public String getObjectType() {
        return this.objectType;
    }

    public static final class Builder {
        private String databaseQualifiedName; 
        private String databaseUuid; 
        private String ddlSql; 
        private String objectName; 
        private String objectQualifiedName; 
        private String objectType; 

        private Builder() {
        } 

        private Builder(AgenticDatabaseObject model) {
            this.databaseQualifiedName = model.databaseQualifiedName;
            this.databaseUuid = model.databaseUuid;
            this.ddlSql = model.ddlSql;
            this.objectName = model.objectName;
            this.objectQualifiedName = model.objectQualifiedName;
            this.objectType = model.objectType;
        } 

        /**
         * DatabaseQualifiedName.
         */
        public Builder databaseQualifiedName(String databaseQualifiedName) {
            this.databaseQualifiedName = databaseQualifiedName;
            return this;
        }

        /**
         * DatabaseUuid.
         */
        public Builder databaseUuid(String databaseUuid) {
            this.databaseUuid = databaseUuid;
            return this;
        }

        /**
         * DdlSql.
         */
        public Builder ddlSql(String ddlSql) {
            this.ddlSql = ddlSql;
            return this;
        }

        /**
         * ObjectName.
         */
        public Builder objectName(String objectName) {
            this.objectName = objectName;
            return this;
        }

        /**
         * ObjectQualifiedName.
         */
        public Builder objectQualifiedName(String objectQualifiedName) {
            this.objectQualifiedName = objectQualifiedName;
            return this;
        }

        /**
         * ObjectType.
         */
        public Builder objectType(String objectType) {
            this.objectType = objectType;
            return this;
        }

        public AgenticDatabaseObject build() {
            return new AgenticDatabaseObject(this);
        } 

    } 

}
