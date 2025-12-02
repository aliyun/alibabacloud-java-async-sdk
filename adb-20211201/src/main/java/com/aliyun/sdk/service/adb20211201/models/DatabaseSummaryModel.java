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
 * {@link DatabaseSummaryModel} extends {@link TeaModel}
 *
 * <p>DatabaseSummaryModel</p>
 */
public class DatabaseSummaryModel extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("CreateTime")
    private String createTime;

    @com.aliyun.core.annotation.NameInMap("CreatedBySource")
    private String createdBySource;

    @com.aliyun.core.annotation.NameInMap("CreatedByUser")
    private String createdByUser;

    @com.aliyun.core.annotation.NameInMap("DbType")
    private String dbType;

    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.NameInMap("Location")
    private String location;

    @com.aliyun.core.annotation.NameInMap("Owner")
    private String owner;

    @com.aliyun.core.annotation.NameInMap("SchemaName")
    private String schemaName;

    @com.aliyun.core.annotation.NameInMap("UpdateTime")
    private String updateTime;

    private DatabaseSummaryModel(Builder builder) {
        this.createTime = builder.createTime;
        this.createdBySource = builder.createdBySource;
        this.createdByUser = builder.createdByUser;
        this.dbType = builder.dbType;
        this.description = builder.description;
        this.location = builder.location;
        this.owner = builder.owner;
        this.schemaName = builder.schemaName;
        this.updateTime = builder.updateTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DatabaseSummaryModel create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return createTime
     */
    public String getCreateTime() {
        return this.createTime;
    }

    /**
     * @return createdBySource
     */
    public String getCreatedBySource() {
        return this.createdBySource;
    }

    /**
     * @return createdByUser
     */
    public String getCreatedByUser() {
        return this.createdByUser;
    }

    /**
     * @return dbType
     */
    public String getDbType() {
        return this.dbType;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return location
     */
    public String getLocation() {
        return this.location;
    }

    /**
     * @return owner
     */
    public String getOwner() {
        return this.owner;
    }

    /**
     * @return schemaName
     */
    public String getSchemaName() {
        return this.schemaName;
    }

    /**
     * @return updateTime
     */
    public String getUpdateTime() {
        return this.updateTime;
    }

    public static final class Builder {
        private String createTime; 
        private String createdBySource; 
        private String createdByUser; 
        private String dbType; 
        private String description; 
        private String location; 
        private String owner; 
        private String schemaName; 
        private String updateTime; 

        private Builder() {
        } 

        private Builder(DatabaseSummaryModel model) {
            this.createTime = model.createTime;
            this.createdBySource = model.createdBySource;
            this.createdByUser = model.createdByUser;
            this.dbType = model.dbType;
            this.description = model.description;
            this.location = model.location;
            this.owner = model.owner;
            this.schemaName = model.schemaName;
            this.updateTime = model.updateTime;
        } 

        /**
         * CreateTime.
         */
        public Builder createTime(String createTime) {
            this.createTime = createTime;
            return this;
        }

        /**
         * CreatedBySource.
         */
        public Builder createdBySource(String createdBySource) {
            this.createdBySource = createdBySource;
            return this;
        }

        /**
         * CreatedByUser.
         */
        public Builder createdByUser(String createdByUser) {
            this.createdByUser = createdByUser;
            return this;
        }

        /**
         * DbType.
         */
        public Builder dbType(String dbType) {
            this.dbType = dbType;
            return this;
        }

        /**
         * Description.
         */
        public Builder description(String description) {
            this.description = description;
            return this;
        }

        /**
         * Location.
         */
        public Builder location(String location) {
            this.location = location;
            return this;
        }

        /**
         * Owner.
         */
        public Builder owner(String owner) {
            this.owner = owner;
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
         * UpdateTime.
         */
        public Builder updateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }

        public DatabaseSummaryModel build() {
            return new DatabaseSummaryModel(this);
        } 

    } 

}
