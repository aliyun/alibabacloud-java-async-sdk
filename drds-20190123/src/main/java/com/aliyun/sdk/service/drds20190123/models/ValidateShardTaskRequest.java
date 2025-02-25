// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.drds20190123.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ValidateShardTaskRequest} extends {@link RequestModel}
 *
 * <p>ValidateShardTaskRequest</p>
 */
public class ValidateShardTaskRequest extends Request {
    @Query
    @NameInMap("DbName")
    @Validation(required = true)
    private String dbName;

    @Query
    @NameInMap("DrdsInstanceId")
    @Validation(required = true)
    private String drdsInstanceId;

    @Query
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("SourceTableName")
    @Validation(required = true)
    private String sourceTableName;

    @Query
    @NameInMap("TargetTableName")
    @Validation(required = true, maxLength = 100, minLength = 1)
    private String targetTableName;

    @Query
    @NameInMap("TaskType")
    @Validation(required = true, minLength = 1)
    private String taskType;

    private ValidateShardTaskRequest(Builder builder) {
        super(builder);
        this.dbName = builder.dbName;
        this.drdsInstanceId = builder.drdsInstanceId;
        this.regionId = builder.regionId;
        this.sourceTableName = builder.sourceTableName;
        this.targetTableName = builder.targetTableName;
        this.taskType = builder.taskType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ValidateShardTaskRequest create() {
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
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return sourceTableName
     */
    public String getSourceTableName() {
        return this.sourceTableName;
    }

    /**
     * @return targetTableName
     */
    public String getTargetTableName() {
        return this.targetTableName;
    }

    /**
     * @return taskType
     */
    public String getTaskType() {
        return this.taskType;
    }

    public static final class Builder extends Request.Builder<ValidateShardTaskRequest, Builder> {
        private String dbName; 
        private String drdsInstanceId; 
        private String regionId; 
        private String sourceTableName; 
        private String targetTableName; 
        private String taskType; 

        private Builder() {
            super();
        } 

        private Builder(ValidateShardTaskRequest request) {
            super(request);
            this.dbName = request.dbName;
            this.drdsInstanceId = request.drdsInstanceId;
            this.regionId = request.regionId;
            this.sourceTableName = request.sourceTableName;
            this.targetTableName = request.targetTableName;
            this.taskType = request.taskType;
        } 

        /**
         * The name of the database.
         */
        public Builder dbName(String dbName) {
            this.putQueryParameter("DbName", dbName);
            this.dbName = dbName;
            return this;
        }

        /**
         * The ID of the PolarDB-X 1.0 instance.
         */
        public Builder drdsInstanceId(String drdsInstanceId) {
            this.putQueryParameter("DrdsInstanceId", drdsInstanceId);
            this.drdsInstanceId = drdsInstanceId;
            return this;
        }

        /**
         * The ID of the region where the PolarDB-X 1.0 instance is created.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * The name of the table or table shard on which you want to perform the task.
         */
        public Builder sourceTableName(String sourceTableName) {
            this.putQueryParameter("SourceTableName", sourceTableName);
            this.sourceTableName = sourceTableName;
            return this;
        }

        /**
         * The name of the table or table shard on which you perform the task.
         */
        public Builder targetTableName(String targetTableName) {
            this.putQueryParameter("TargetTableName", targetTableName);
            this.targetTableName = targetTableName;
            return this;
        }

        /**
         * The type of the task. Valid values:
         * <p>
         * 
         * *   **SINGLE_TO_SHARD**: converts a single table to a table shard.
         * *   **SHARD_TO_SINGLE**: converts a table shard to a single table.
         * *   **SHARD_TO_SHARD**: converts a table shard to another table shard.
         */
        public Builder taskType(String taskType) {
            this.putQueryParameter("TaskType", taskType);
            this.taskType = taskType;
            return this;
        }

        @Override
        public ValidateShardTaskRequest build() {
            return new ValidateShardTaskRequest(this);
        } 

    } 

}
