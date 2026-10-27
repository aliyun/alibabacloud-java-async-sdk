// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.polardbx20200202.models;

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
 * {@link CreateStructureImportTaskRequest} extends {@link RequestModel}
 *
 * <p>CreateStructureImportTaskRequest</p>
 */
public class CreateStructureImportTaskRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Config")
    private String config;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DBInstanceName")
    private String DBInstanceName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SlinkTaskId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String slinkTaskId;

    private CreateStructureImportTaskRequest(Builder builder) {
        super(builder);
        this.config = builder.config;
        this.DBInstanceName = builder.DBInstanceName;
        this.regionId = builder.regionId;
        this.slinkTaskId = builder.slinkTaskId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateStructureImportTaskRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return config
     */
    public String getConfig() {
        return this.config;
    }

    /**
     * @return DBInstanceName
     */
    public String getDBInstanceName() {
        return this.DBInstanceName;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return slinkTaskId
     */
    public String getSlinkTaskId() {
        return this.slinkTaskId;
    }

    public static final class Builder extends Request.Builder<CreateStructureImportTaskRequest, Builder> {
        private String config; 
        private String DBInstanceName; 
        private String regionId; 
        private String slinkTaskId; 

        private Builder() {
            super();
        } 

        private Builder(CreateStructureImportTaskRequest request) {
            super(request);
            this.config = request.config;
            this.DBInstanceName = request.DBInstanceName;
            this.regionId = request.regionId;
            this.slinkTaskId = request.slinkTaskId;
        } 

        /**
         * <p>The configuration information.</p>
         * 
         * <strong>example:</strong>
         * <p>[{\&quot;schemaName\&quot;:\&quot;transfer_test\&quot;,\&quot;tableList\&quot;:[]}]</p>
         */
        public Builder config(String config) {
            this.putBodyParameter("Config", config);
            this.config = config;
            return this;
        }

        /**
         * <p>The instance ID. &gt; You can call the <a href="https://help.aliyun.com/document_detail/196830.html">DescribeDBInstances</a> operation to query the details of all instances in the specified region, including instance IDs.</p>
         * 
         * <strong>example:</strong>
         * <p>pxc-********</p>
         */
        public Builder DBInstanceName(String DBInstanceName) {
            this.putQueryParameter("DBInstanceName", DBInstanceName);
            this.DBInstanceName = DBInstanceName;
            return this;
        }

        /**
         * <p>The region in which the instance resides.</p>
         * <p>This parameter is required.</p>
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
         * <p>The ID of the target task. &gt; You can call the <a href="https://help.aliyun.com/document_detail/196830.html">DescribeSlinkTasks</a> operation to query the execution status of the target task, including the task ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>etx-szr2rr6i*****</p>
         */
        public Builder slinkTaskId(String slinkTaskId) {
            this.putQueryParameter("SlinkTaskId", slinkTaskId);
            this.slinkTaskId = slinkTaskId;
            return this;
        }

        @Override
        public CreateStructureImportTaskRequest build() {
            return new CreateStructureImportTaskRequest(this);
        } 

    } 

}
