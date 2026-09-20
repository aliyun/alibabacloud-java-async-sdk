// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pairecservice20221213.models;

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
 * {@link ExportRecallManagementTableRequest} extends {@link RequestModel}
 *
 * <p>ExportRecallManagementTableRequest</p>
 */
public class ExportRecallManagementTableRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("RecallManagementTableId")
    private String recallManagementTableId;

    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    private String instanceId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("MaxcomputeProjectName")
    private String maxcomputeProjectName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("MaxcomputeSchema")
    private String maxcomputeSchema;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("MaxcomputeTableName")
    private String maxcomputeTableName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Partitions")
    private java.util.Map<String, String> partitions;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("RecallManagementTableVersionId")
    private String recallManagementTableVersionId;

    private ExportRecallManagementTableRequest(Builder builder) {
        super(builder);
        this.recallManagementTableId = builder.recallManagementTableId;
        this.regionId = builder.regionId;
        this.instanceId = builder.instanceId;
        this.maxcomputeProjectName = builder.maxcomputeProjectName;
        this.maxcomputeSchema = builder.maxcomputeSchema;
        this.maxcomputeTableName = builder.maxcomputeTableName;
        this.partitions = builder.partitions;
        this.recallManagementTableVersionId = builder.recallManagementTableVersionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ExportRecallManagementTableRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return recallManagementTableId
     */
    public String getRecallManagementTableId() {
        return this.recallManagementTableId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return maxcomputeProjectName
     */
    public String getMaxcomputeProjectName() {
        return this.maxcomputeProjectName;
    }

    /**
     * @return maxcomputeSchema
     */
    public String getMaxcomputeSchema() {
        return this.maxcomputeSchema;
    }

    /**
     * @return maxcomputeTableName
     */
    public String getMaxcomputeTableName() {
        return this.maxcomputeTableName;
    }

    /**
     * @return partitions
     */
    public java.util.Map<String, String> getPartitions() {
        return this.partitions;
    }

    /**
     * @return recallManagementTableVersionId
     */
    public String getRecallManagementTableVersionId() {
        return this.recallManagementTableVersionId;
    }

    public static final class Builder extends Request.Builder<ExportRecallManagementTableRequest, Builder> {
        private String recallManagementTableId; 
        private String regionId; 
        private String instanceId; 
        private String maxcomputeProjectName; 
        private String maxcomputeSchema; 
        private String maxcomputeTableName; 
        private java.util.Map<String, String> partitions; 
        private String recallManagementTableVersionId; 

        private Builder() {
            super();
        } 

        private Builder(ExportRecallManagementTableRequest request) {
            super(request);
            this.recallManagementTableId = request.recallManagementTableId;
            this.regionId = request.regionId;
            this.instanceId = request.instanceId;
            this.maxcomputeProjectName = request.maxcomputeProjectName;
            this.maxcomputeSchema = request.maxcomputeSchema;
            this.maxcomputeTableName = request.maxcomputeTableName;
            this.partitions = request.partitions;
            this.recallManagementTableVersionId = request.recallManagementTableVersionId;
        } 

        /**
         * <p>The ID of the table to export.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        public Builder recallManagementTableId(String recallManagementTableId) {
            this.putPathParameter("RecallManagementTableId", recallManagementTableId);
            this.recallManagementTableId = recallManagementTableId;
            return this;
        }

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>pairec-test1</p>
         */
        public Builder instanceId(String instanceId) {
            this.putBodyParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>The MaxCompute project name.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        public Builder maxcomputeProjectName(String maxcomputeProjectName) {
            this.putBodyParameter("MaxcomputeProjectName", maxcomputeProjectName);
            this.maxcomputeProjectName = maxcomputeProjectName;
            return this;
        }

        /**
         * <p>The MaxCompute project schema.</p>
         * 
         * <strong>example:</strong>
         * <p>default</p>
         */
        public Builder maxcomputeSchema(String maxcomputeSchema) {
            this.putBodyParameter("MaxcomputeSchema", maxcomputeSchema);
            this.maxcomputeSchema = maxcomputeSchema;
            return this;
        }

        /**
         * <p>The name of the destination table in MaxCompute.</p>
         * 
         * <strong>example:</strong>
         * <p>table-1</p>
         */
        public Builder maxcomputeTableName(String maxcomputeTableName) {
            this.putBodyParameter("MaxcomputeTableName", maxcomputeTableName);
            this.maxcomputeTableName = maxcomputeTableName;
            return this;
        }

        /**
         * <p>The table partitions to export. The value must be a JSON object where each key is a partition field and its value is the corresponding partition value.</p>
         */
        public Builder partitions(java.util.Map<String, String> partitions) {
            this.putBodyParameter("Partitions", partitions);
            this.partitions = partitions;
            return this;
        }

        /**
         * <p>The version ID of the recall management table. This parameter defaults to the current published version.</p>
         * 
         * <strong>example:</strong>
         * <p>20250213000000</p>
         */
        public Builder recallManagementTableVersionId(String recallManagementTableVersionId) {
            this.putBodyParameter("RecallManagementTableVersionId", recallManagementTableVersionId);
            this.recallManagementTableVersionId = recallManagementTableVersionId;
            return this;
        }

        @Override
        public ExportRecallManagementTableRequest build() {
            return new ExportRecallManagementTableRequest(this);
        } 

    } 

}
