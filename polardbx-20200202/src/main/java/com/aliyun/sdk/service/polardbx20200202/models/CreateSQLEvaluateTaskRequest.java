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
 * {@link CreateSQLEvaluateTaskRequest} extends {@link RequestModel}
 *
 * <p>CreateSQLEvaluateTaskRequest</p>
 */
public class CreateSQLEvaluateTaskRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DBInstanceName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String DBInstanceName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DstDb")
    private String dstDb;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DstPassword")
    private String dstPassword;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DstResId")
    private String dstResId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DstUserName")
    private String dstUserName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SlinkTaskDesc")
    private String slinkTaskDesc;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SlinkTaskId")
    private String slinkTaskId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SrcDb")
    private String srcDb;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SrcPassword")
    private String srcPassword;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SrcResId")
    private String srcResId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SrcResType")
    @com.aliyun.core.annotation.Validation(maxLength = 20, minLength = 1)
    private String srcResType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SrcUserName")
    private String srcUserName;

    private CreateSQLEvaluateTaskRequest(Builder builder) {
        super(builder);
        this.DBInstanceName = builder.DBInstanceName;
        this.dstDb = builder.dstDb;
        this.dstPassword = builder.dstPassword;
        this.dstResId = builder.dstResId;
        this.dstUserName = builder.dstUserName;
        this.regionId = builder.regionId;
        this.slinkTaskDesc = builder.slinkTaskDesc;
        this.slinkTaskId = builder.slinkTaskId;
        this.srcDb = builder.srcDb;
        this.srcPassword = builder.srcPassword;
        this.srcResId = builder.srcResId;
        this.srcResType = builder.srcResType;
        this.srcUserName = builder.srcUserName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateSQLEvaluateTaskRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return DBInstanceName
     */
    public String getDBInstanceName() {
        return this.DBInstanceName;
    }

    /**
     * @return dstDb
     */
    public String getDstDb() {
        return this.dstDb;
    }

    /**
     * @return dstPassword
     */
    public String getDstPassword() {
        return this.dstPassword;
    }

    /**
     * @return dstResId
     */
    public String getDstResId() {
        return this.dstResId;
    }

    /**
     * @return dstUserName
     */
    public String getDstUserName() {
        return this.dstUserName;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return slinkTaskDesc
     */
    public String getSlinkTaskDesc() {
        return this.slinkTaskDesc;
    }

    /**
     * @return slinkTaskId
     */
    public String getSlinkTaskId() {
        return this.slinkTaskId;
    }

    /**
     * @return srcDb
     */
    public String getSrcDb() {
        return this.srcDb;
    }

    /**
     * @return srcPassword
     */
    public String getSrcPassword() {
        return this.srcPassword;
    }

    /**
     * @return srcResId
     */
    public String getSrcResId() {
        return this.srcResId;
    }

    /**
     * @return srcResType
     */
    public String getSrcResType() {
        return this.srcResType;
    }

    /**
     * @return srcUserName
     */
    public String getSrcUserName() {
        return this.srcUserName;
    }

    public static final class Builder extends Request.Builder<CreateSQLEvaluateTaskRequest, Builder> {
        private String DBInstanceName; 
        private String dstDb; 
        private String dstPassword; 
        private String dstResId; 
        private String dstUserName; 
        private String regionId; 
        private String slinkTaskDesc; 
        private String slinkTaskId; 
        private String srcDb; 
        private String srcPassword; 
        private String srcResId; 
        private String srcResType; 
        private String srcUserName; 

        private Builder() {
            super();
        } 

        private Builder(CreateSQLEvaluateTaskRequest request) {
            super(request);
            this.DBInstanceName = request.DBInstanceName;
            this.dstDb = request.dstDb;
            this.dstPassword = request.dstPassword;
            this.dstResId = request.dstResId;
            this.dstUserName = request.dstUserName;
            this.regionId = request.regionId;
            this.slinkTaskDesc = request.slinkTaskDesc;
            this.slinkTaskId = request.slinkTaskId;
            this.srcDb = request.srcDb;
            this.srcPassword = request.srcPassword;
            this.srcResId = request.srcResId;
            this.srcResType = request.srcResType;
            this.srcUserName = request.srcUserName;
        } 

        /**
         * <p>The instance ID. &gt; You can call the <a href="https://help.aliyun.com/document_detail/196830.html">DescribeDBInstances</a> operation to query the details of all instances in the target region, including instance IDs.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>pxc-shr4idrgogti89</p>
         */
        public Builder DBInstanceName(String DBInstanceName) {
            this.putQueryParameter("DBInstanceName", DBInstanceName);
            this.DBInstanceName = DBInstanceName;
            return this;
        }

        /**
         * <p>The ID of the instance on which the target SQL statement is executed. &gt; You can call the <a href="https://help.aliyun.com/document_detail/196830.html">DescribeDBInstances</a> operation to query the details of the target SQL statement, including the instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>transfer_for_st</p>
         */
        public Builder dstDb(String dstDb) {
            this.putQueryParameter("DstDb", dstDb);
            this.dstDb = dstDb;
            return this;
        }

        /**
         * <p>The password of the target SQL statement. &gt; You can call the <a href="https://help.aliyun.com/document_detail/196830.html">DescribeDBInstances</a> operation to query the details of the target SQL statement, including the password.</p>
         * 
         * <strong>example:</strong>
         * <hr>
         */
        public Builder dstPassword(String dstPassword) {
            this.putQueryParameter("DstPassword", dstPassword);
            this.dstPassword = dstPassword;
            return this;
        }

        /**
         * <p>The ID of the target SQL statement. &gt; You can call the <a href="https://help.aliyun.com/document_detail/196830.html">DescribeDBInstances</a> operation to query the details of the target SQL statement, including the ID.</p>
         * 
         * <strong>example:</strong>
         * <p>pxc-zkrc1****l54rc</p>
         */
        public Builder dstResId(String dstResId) {
            this.putQueryParameter("DstResId", dstResId);
            this.dstResId = dstResId;
            return this;
        }

        /**
         * <p>The username of the destination instance.</p>
         * 
         * <strong>example:</strong>
         * <p>drds_test</p>
         */
        public Builder dstUserName(String dstUserName) {
            this.putQueryParameter("DstUserName", dstUserName);
            this.dstUserName = dstUserName;
            return this;
        }

        /**
         * <p>The region ID of the instance. &gt; You can call the <a href="https://help.aliyun.com/document_detail/196841.html">DescribeRegions</a> operation to query the regions supported by PolarDB-X, including region IDs.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-shanghai</p>
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The description of the target SQL statement.</p>
         * 
         * <strong>example:</strong>
         * <p>test-drds-&gt;auto</p>
         */
        public Builder slinkTaskDesc(String slinkTaskDesc) {
            this.putQueryParameter("SlinkTaskDesc", slinkTaskDesc);
            this.slinkTaskDesc = slinkTaskDesc;
            return this;
        }

        /**
         * <p>The task ID for executing the target SQL statement. &gt; You can call the <a href="https://help.aliyun.com/document_detail/196830.html">DescribeCloudCenterInstances</a> operation to query the IDs of target SQL statements supported by PolarDB-X.</p>
         * 
         * <strong>example:</strong>
         * <p>etx-szr2rr6i*****</p>
         */
        public Builder slinkTaskId(String slinkTaskId) {
            this.putQueryParameter("SlinkTaskId", slinkTaskId);
            this.slinkTaskId = slinkTaskId;
            return this;
        }

        /**
         * <p>Specifies whether to enable the source ApsaraDB RDS instance. Valid values: <strong>enable</strong>: enables the source ApsaraDB RDS instance. <strong>disabled</strong>: disables the source ApsaraDB RDS instance.</p>
         * 
         * <strong>example:</strong>
         * <p>transfer_test3</p>
         */
        public Builder srcDb(String srcDb) {
            this.putQueryParameter("SrcDb", srcDb);
            this.srcDb = srcDb;
            return this;
        }

        /**
         * <p>The port number of the source instance. Valid values: 3200 to 3999. &gt; This parameter is available and required only when <strong>DBEndpointInstanceType</strong> is set to <strong>polardb-o</strong>.</p>
         * 
         * <strong>example:</strong>
         * <hr>
         */
        public Builder srcPassword(String srcPassword) {
            this.putQueryParameter("SrcPassword", srcPassword);
            this.srcPassword = srcPassword;
            return this;
        }

        /**
         * <p>The ID of the source ApsaraDB RDS instance. &gt; You can call the <a href="https://help.aliyun.com/document_detail/196836.html">DescribeDropSystemEventMetaList</a> operation to query the details of all source ApsaraDB RDS instances in the target region, including instance IDs.</p>
         * 
         * <strong>example:</strong>
         * <p>pxc-shr****rgkh87z</p>
         */
        public Builder srcResId(String srcResId) {
            this.putQueryParameter("SrcResId", srcResId);
            this.srcResId = srcResId;
            return this;
        }

        /**
         * <p>The type of the source instance. Valid values: RDS_MYSQL, POLARX1, POLARX2_STANDARD, POLARX2_ENTERPRISE, and POLARDB_M.</p>
         * 
         * <strong>example:</strong>
         * <p>POLARX2</p>
         */
        public Builder srcResType(String srcResType) {
            this.putQueryParameter("SrcResType", srcResType);
            this.srcResType = srcResType;
            return this;
        }

        /**
         * <p>The username of the source instance.</p>
         * 
         * <strong>example:</strong>
         * <p>drds_test</p>
         */
        public Builder srcUserName(String srcUserName) {
            this.putQueryParameter("SrcUserName", srcUserName);
            this.srcUserName = srcUserName;
            return this;
        }

        @Override
        public CreateSQLEvaluateTaskRequest build() {
            return new CreateSQLEvaluateTaskRequest(this);
        } 

    } 

}
