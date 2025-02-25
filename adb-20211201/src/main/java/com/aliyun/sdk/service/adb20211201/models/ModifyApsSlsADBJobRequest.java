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
 * {@link ModifyApsSlsADBJobRequest} extends {@link RequestModel}
 *
 * <p>ModifyApsSlsADBJobRequest</p>
 */
public class ModifyApsSlsADBJobRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Columns")
    private java.util.List<Columns> columns;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("DBClusterId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String DBClusterId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("DbName")
    private String dbName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("DirtyDataProcessPattern")
    private String dirtyDataProcessPattern;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ExactlyOnce")
    private String exactlyOnce;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Password")
    private String password;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("StartingOffsets")
    private String startingOffsets;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("TableName")
    private String tableName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("UnixTimestampConvert")
    private String unixTimestampConvert;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("UserName")
    private String userName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("WorkloadId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String workloadId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("WorkloadName")
    private String workloadName;

    private ModifyApsSlsADBJobRequest(Builder builder) {
        super(builder);
        this.columns = builder.columns;
        this.DBClusterId = builder.DBClusterId;
        this.dbName = builder.dbName;
        this.dirtyDataProcessPattern = builder.dirtyDataProcessPattern;
        this.exactlyOnce = builder.exactlyOnce;
        this.password = builder.password;
        this.regionId = builder.regionId;
        this.startingOffsets = builder.startingOffsets;
        this.tableName = builder.tableName;
        this.unixTimestampConvert = builder.unixTimestampConvert;
        this.userName = builder.userName;
        this.workloadId = builder.workloadId;
        this.workloadName = builder.workloadName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyApsSlsADBJobRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return columns
     */
    public java.util.List<Columns> getColumns() {
        return this.columns;
    }

    /**
     * @return DBClusterId
     */
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    /**
     * @return dbName
     */
    public String getDbName() {
        return this.dbName;
    }

    /**
     * @return dirtyDataProcessPattern
     */
    public String getDirtyDataProcessPattern() {
        return this.dirtyDataProcessPattern;
    }

    /**
     * @return exactlyOnce
     */
    public String getExactlyOnce() {
        return this.exactlyOnce;
    }

    /**
     * @return password
     */
    public String getPassword() {
        return this.password;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return startingOffsets
     */
    public String getStartingOffsets() {
        return this.startingOffsets;
    }

    /**
     * @return tableName
     */
    public String getTableName() {
        return this.tableName;
    }

    /**
     * @return unixTimestampConvert
     */
    public String getUnixTimestampConvert() {
        return this.unixTimestampConvert;
    }

    /**
     * @return userName
     */
    public String getUserName() {
        return this.userName;
    }

    /**
     * @return workloadId
     */
    public String getWorkloadId() {
        return this.workloadId;
    }

    /**
     * @return workloadName
     */
    public String getWorkloadName() {
        return this.workloadName;
    }

    public static final class Builder extends Request.Builder<ModifyApsSlsADBJobRequest, Builder> {
        private java.util.List<Columns> columns; 
        private String DBClusterId; 
        private String dbName; 
        private String dirtyDataProcessPattern; 
        private String exactlyOnce; 
        private String password; 
        private String regionId; 
        private String startingOffsets; 
        private String tableName; 
        private String unixTimestampConvert; 
        private String userName; 
        private String workloadId; 
        private String workloadName; 

        private Builder() {
            super();
        } 

        private Builder(ModifyApsSlsADBJobRequest request) {
            super(request);
            this.columns = request.columns;
            this.DBClusterId = request.DBClusterId;
            this.dbName = request.dbName;
            this.dirtyDataProcessPattern = request.dirtyDataProcessPattern;
            this.exactlyOnce = request.exactlyOnce;
            this.password = request.password;
            this.regionId = request.regionId;
            this.startingOffsets = request.startingOffsets;
            this.tableName = request.tableName;
            this.unixTimestampConvert = request.unixTimestampConvert;
            this.userName = request.userName;
            this.workloadId = request.workloadId;
            this.workloadName = request.workloadName;
        } 

        /**
         * Columns.
         */
        public Builder columns(java.util.List<Columns> columns) {
            String columnsShrink = shrink(columns, "Columns", "json");
            this.putBodyParameter("Columns", columnsShrink);
            this.columns = columns;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>amv-*******</p>
         */
        public Builder DBClusterId(String DBClusterId) {
            this.putBodyParameter("DBClusterId", DBClusterId);
            this.DBClusterId = DBClusterId;
            return this;
        }

        /**
         * DbName.
         */
        public Builder dbName(String dbName) {
            this.putBodyParameter("DbName", dbName);
            this.dbName = dbName;
            return this;
        }

        /**
         * DirtyDataProcessPattern.
         */
        public Builder dirtyDataProcessPattern(String dirtyDataProcessPattern) {
            this.putBodyParameter("DirtyDataProcessPattern", dirtyDataProcessPattern);
            this.dirtyDataProcessPattern = dirtyDataProcessPattern;
            return this;
        }

        /**
         * ExactlyOnce.
         */
        public Builder exactlyOnce(String exactlyOnce) {
            this.putBodyParameter("ExactlyOnce", exactlyOnce);
            this.exactlyOnce = exactlyOnce;
            return this;
        }

        /**
         * Password.
         */
        public Builder password(String password) {
            this.putBodyParameter("Password", password);
            this.password = password;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder regionId(String regionId) {
            this.putBodyParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * StartingOffsets.
         */
        public Builder startingOffsets(String startingOffsets) {
            this.putBodyParameter("StartingOffsets", startingOffsets);
            this.startingOffsets = startingOffsets;
            return this;
        }

        /**
         * TableName.
         */
        public Builder tableName(String tableName) {
            this.putBodyParameter("TableName", tableName);
            this.tableName = tableName;
            return this;
        }

        /**
         * UnixTimestampConvert.
         */
        public Builder unixTimestampConvert(String unixTimestampConvert) {
            this.putBodyParameter("UnixTimestampConvert", unixTimestampConvert);
            this.unixTimestampConvert = unixTimestampConvert;
            return this;
        }

        /**
         * UserName.
         */
        public Builder userName(String userName) {
            this.putBodyParameter("UserName", userName);
            this.userName = userName;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>aps-******</p>
         */
        public Builder workloadId(String workloadId) {
            this.putBodyParameter("WorkloadId", workloadId);
            this.workloadId = workloadId;
            return this;
        }

        /**
         * WorkloadName.
         */
        public Builder workloadName(String workloadName) {
            this.putBodyParameter("WorkloadName", workloadName);
            this.workloadName = workloadName;
            return this;
        }

        @Override
        public ModifyApsSlsADBJobRequest build() {
            return new ModifyApsSlsADBJobRequest(this);
        } 

    } 

    /**
     * 
     * {@link ModifyApsSlsADBJobRequest} extends {@link TeaModel}
     *
     * <p>ModifyApsSlsADBJobRequest</p>
     */
    public static class Columns extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("MapName")
        private String mapName;

        @com.aliyun.core.annotation.NameInMap("MapType")
        private String mapType;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        private Columns(Builder builder) {
            this.mapName = builder.mapName;
            this.mapType = builder.mapType;
            this.name = builder.name;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Columns create() {
            return builder().build();
        }

        /**
         * @return mapName
         */
        public String getMapName() {
            return this.mapName;
        }

        /**
         * @return mapType
         */
        public String getMapType() {
            return this.mapType;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private String mapName; 
            private String mapType; 
            private String name; 
            private String type; 

            /**
             * MapName.
             */
            public Builder mapName(String mapName) {
                this.mapName = mapName;
                return this;
            }

            /**
             * MapType.
             */
            public Builder mapType(String mapType) {
                this.mapType = mapType;
                return this;
            }

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * Type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public Columns build() {
                return new Columns(this);
            } 

        } 

    }
}
