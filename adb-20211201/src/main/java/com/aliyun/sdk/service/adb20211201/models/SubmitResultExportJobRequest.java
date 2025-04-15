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
 * {@link SubmitResultExportJobRequest} extends {@link RequestModel}
 *
 * <p>SubmitResultExportJobRequest</p>
 */
public class SubmitResultExportJobRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("DBClusterId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String DBClusterId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Engine")
    private String engine;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ExportType")
    private String exportType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ResourceGroup")
    private String resourceGroup;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("SQL")
    @com.aliyun.core.annotation.Validation(required = true)
    private String SQL;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Schema")
    @com.aliyun.core.annotation.Validation(required = true)
    private String schema;

    private SubmitResultExportJobRequest(Builder builder) {
        super(builder);
        this.DBClusterId = builder.DBClusterId;
        this.engine = builder.engine;
        this.exportType = builder.exportType;
        this.regionId = builder.regionId;
        this.resourceGroup = builder.resourceGroup;
        this.SQL = builder.SQL;
        this.schema = builder.schema;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SubmitResultExportJobRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return DBClusterId
     */
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    /**
     * @return engine
     */
    public String getEngine() {
        return this.engine;
    }

    /**
     * @return exportType
     */
    public String getExportType() {
        return this.exportType;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return resourceGroup
     */
    public String getResourceGroup() {
        return this.resourceGroup;
    }

    /**
     * @return SQL
     */
    public String getSQL() {
        return this.SQL;
    }

    /**
     * @return schema
     */
    public String getSchema() {
        return this.schema;
    }

    public static final class Builder extends Request.Builder<SubmitResultExportJobRequest, Builder> {
        private String DBClusterId; 
        private String engine; 
        private String exportType; 
        private String regionId; 
        private String resourceGroup; 
        private String SQL; 
        private String schema; 

        private Builder() {
            super();
        } 

        private Builder(SubmitResultExportJobRequest request) {
            super(request);
            this.DBClusterId = request.DBClusterId;
            this.engine = request.engine;
            this.exportType = request.exportType;
            this.regionId = request.regionId;
            this.resourceGroup = request.resourceGroup;
            this.SQL = request.SQL;
            this.schema = request.schema;
        } 

        /**
         * <p>The ID of the AnalyticDB for MySQL Data Lakehouse Edition cluster.</p>
         * <blockquote>
         * <p> You can call the <a href="https://help.aliyun.com/document_detail/129857.html">DescribeDBClusters</a> operation to query the IDs of all AnalyticDB for MySQL Data Lakehouse Edition clusters within a region.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>amv-bp10a0ng21t5****</p>
         */
        public Builder DBClusterId(String DBClusterId) {
            this.putBodyParameter("DBClusterId", DBClusterId);
            this.DBClusterId = DBClusterId;
            return this;
        }

        /**
         * <p>The engine that is used to run the result set export job. Set the value to XIHE.</p>
         * 
         * <strong>example:</strong>
         * <p>XIHE</p>
         */
        public Builder engine(String engine) {
            this.putBodyParameter("Engine", engine);
            this.engine = engine;
            return this;
        }

        /**
         * <p>The export type.</p>
         */
        public Builder exportType(String exportType) {
            this.putBodyParameter("ExportType", exportType);
            this.exportType = exportType;
            return this;
        }

        /**
         * <p>The region ID.</p>
         * <blockquote>
         * <p> You can call the <a href="https://help.aliyun.com/document_detail/143074.html">DescribeRegions</a> operation to query the most recent region list.</p>
         * </blockquote>
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
         * <p>The name of the resource group that runs the result set export job.</p>
         * 
         * <strong>example:</strong>
         * <p>user_default</p>
         */
        public Builder resourceGroup(String resourceGroup) {
            this.putBodyParameter("ResourceGroup", resourceGroup);
            this.resourceGroup = resourceGroup;
            return this;
        }

        /**
         * <p>The SQL statement that is used in the result set export job. You can specify only SELECT statements. If you specify other SQL statements, the request fails.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>SELECT * FROM <code>fotor_com_datastore_resource</code>.<code>fotor_ai_create_task</code> where <code>date</code> = &quot;2023-05-13&quot; LIMIT 10;</p>
         */
        public Builder SQL(String SQL) {
            this.putBodyParameter("SQL", SQL);
            this.SQL = SQL;
            return this;
        }

        /**
         * <p>The name of the database.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>tpch_oss</p>
         */
        public Builder schema(String schema) {
            this.putBodyParameter("Schema", schema);
            this.schema = schema;
            return this;
        }

        @Override
        public SubmitResultExportJobRequest build() {
            return new SubmitResultExportJobRequest(this);
        } 

    } 

}
