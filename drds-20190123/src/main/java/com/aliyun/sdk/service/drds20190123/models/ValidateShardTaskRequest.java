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
 * {@link ValidateShardTaskRequest} extends {@link RequestModel}
 *
 * <p>ValidateShardTaskRequest</p>
 */
public class ValidateShardTaskRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DbName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String dbName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DrdsInstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String drdsInstanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SourceTableName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String sourceTableName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TargetTableName")
    @com.aliyun.core.annotation.Validation(required = true, maxLength = 100, minLength = 1)
    private String targetTableName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TaskType")
    @com.aliyun.core.annotation.Validation(required = true, minLength = 1)
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
         * <p>The name of the database.</p>
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
         * <p>drds23ds****</p>
         */
        public Builder drdsInstanceId(String drdsInstanceId) {
            this.putQueryParameter("DrdsInstanceId", drdsInstanceId);
            this.drdsInstanceId = drdsInstanceId;
            return this;
        }

        /**
         * <p>The ID of the region where the PolarDB-X 1.0 instance is created.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The name of the table or table shard on which you want to perform the task.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>buyer</p>
         */
        public Builder sourceTableName(String sourceTableName) {
            this.putQueryParameter("SourceTableName", sourceTableName);
            this.sourceTableName = sourceTableName;
            return this;
        }

        /**
         * <p>The name of the table or table shard on which you perform the task.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>buyer_new</p>
         */
        public Builder targetTableName(String targetTableName) {
            this.putQueryParameter("TargetTableName", targetTableName);
            this.targetTableName = targetTableName;
            return this;
        }

        /**
         * <p>The type of the task. Valid values:</p>
         * <ul>
         * <li><strong>SINGLE_TO_SHARD</strong>: converts a single table to a table shard.</li>
         * <li><strong>SHARD_TO_SINGLE</strong>: converts a table shard to a single table.</li>
         * <li><strong>SHARD_TO_SHARD</strong>: converts a table shard to another table shard.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>SINGLE_TO_SHARD</p>
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
