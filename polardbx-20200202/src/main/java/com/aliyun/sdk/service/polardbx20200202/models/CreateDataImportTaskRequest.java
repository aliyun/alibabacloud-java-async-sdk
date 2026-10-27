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
 * {@link CreateDataImportTaskRequest} extends {@link RequestModel}
 *
 * <p>CreateDataImportTaskRequest</p>
 */
public class CreateDataImportTaskRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DBInstanceName")
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
    @com.aliyun.core.annotation.NameInMap("SlinkTaskId")
    @com.aliyun.core.annotation.Validation(required = true)
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
    @com.aliyun.core.annotation.NameInMap("SrcUserName")
    private String srcUserName;

    private CreateDataImportTaskRequest(Builder builder) {
        super(builder);
        this.DBInstanceName = builder.DBInstanceName;
        this.dstDb = builder.dstDb;
        this.dstPassword = builder.dstPassword;
        this.dstResId = builder.dstResId;
        this.dstUserName = builder.dstUserName;
        this.regionId = builder.regionId;
        this.slinkTaskId = builder.slinkTaskId;
        this.srcDb = builder.srcDb;
        this.srcPassword = builder.srcPassword;
        this.srcResId = builder.srcResId;
        this.srcUserName = builder.srcUserName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateDataImportTaskRequest create() {
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
     * @return srcUserName
     */
    public String getSrcUserName() {
        return this.srcUserName;
    }

    public static final class Builder extends Request.Builder<CreateDataImportTaskRequest, Builder> {
        private String DBInstanceName; 
        private String dstDb; 
        private String dstPassword; 
        private String dstResId; 
        private String dstUserName; 
        private String regionId; 
        private String slinkTaskId; 
        private String srcDb; 
        private String srcPassword; 
        private String srcResId; 
        private String srcUserName; 

        private Builder() {
            super();
        } 

        private Builder(CreateDataImportTaskRequest request) {
            super(request);
            this.DBInstanceName = request.DBInstanceName;
            this.dstDb = request.dstDb;
            this.dstPassword = request.dstPassword;
            this.dstResId = request.dstResId;
            this.dstUserName = request.dstUserName;
            this.regionId = request.regionId;
            this.slinkTaskId = request.slinkTaskId;
            this.srcDb = request.srcDb;
            this.srcPassword = request.srcPassword;
            this.srcResId = request.srcResId;
            this.srcUserName = request.srcUserName;
        } 

        /**
         * <p>The instance ID. &gt; You can call the <a href="https://help.aliyun.com/document_detail/196830.html">DescribeDBInstances</a> operation to query the details of all instances in the target region, including instance IDs.</p>
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
         * <p>The execution status of the target SQL import. Valid values: * <strong>importing</strong>: importing. * <strong>success</strong>: import succeeded. * <strong>fail</strong>: import failed.</p>
         * 
         * <strong>example:</strong>
         * <p>transfer_test3</p>
         */
        public Builder dstDb(String dstDb) {
            this.putQueryParameter("DstDb", dstDb);
            this.dstDb = dstDb;
            return this;
        }

        /**
         * <p>The password of the privileged account for the target ApsaraDB RDS instance. &gt; * You can call the <a href="https://help.aliyun.com/document_detail/196830.html">DescribeDBInstances</a> operation to query the privileged account information of the target instance, including the password. * This parameter takes effect only when DstPassword is set to true.</p>
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
         * <p>The migration task ID.</p>
         * 
         * <strong>example:</strong>
         * <p>pxc-shr8****k36vrn</p>
         */
        public Builder dstResId(String dstResId) {
            this.putQueryParameter("DstResId", dstResId);
            this.dstResId = dstResId;
            return this;
        }

        /**
         * <p>The username of the target instance.</p>
         * 
         * <strong>example:</strong>
         * <p>bbt_cms_prod</p>
         */
        public Builder dstUserName(String dstUserName) {
            this.putQueryParameter("DstUserName", dstUserName);
            this.dstUserName = dstUserName;
            return this;
        }

        /**
         * <p>The region where the instance resides. &gt; You can call the <a href="https://help.aliyun.com/document_detail/196841.html">DescribeRegions</a> operation to query the regions supported by PolarDB-X, including region IDs.</p>
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
         * <p>The import task ID.</p>
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

        /**
         * <p>The database information of the migration source when the source database is ApsaraDB RDS for MySQL. &gt; The source database must be consistent with the target database.</p>
         * 
         * <strong>example:</strong>
         * <p>transfer_for_st</p>
         */
        public Builder srcDb(String srcDb) {
            this.putQueryParameter("SrcDb", srcDb);
            this.srcDb = srcDb;
            return this;
        }

        /**
         * <p>The read/write mode for executing the import task on the source instance. Valid values: * <strong>rw</strong>: read/write. * <strong>ro</strong>: read-only.</p>
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
         * <p>The ID of the source ApsaraDB RDS instance. &gt; You can call the <a href="https://help.aliyun.com/document_detail/196830.html">DescribeDrivingAccess</a> operation to query the details of all source ApsaraDB RDS instances in the target region, including instance IDs.</p>
         * 
         * <strong>example:</strong>
         * <p>pxc-shrnv****kh87z</p>
         */
        public Builder srcResId(String srcResId) {
            this.putQueryParameter("SrcResId", srcResId);
            this.srcResId = srcResId;
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
        public CreateDataImportTaskRequest build() {
            return new CreateDataImportTaskRequest(this);
        } 

    } 

}
