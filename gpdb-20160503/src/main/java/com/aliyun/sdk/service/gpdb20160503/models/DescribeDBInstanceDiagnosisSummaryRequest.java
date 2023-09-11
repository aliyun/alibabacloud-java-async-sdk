// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gpdb20160503.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDBInstanceDiagnosisSummaryRequest} extends {@link RequestModel}
 *
 * <p>DescribeDBInstanceDiagnosisSummaryRequest</p>
 */
public class DescribeDBInstanceDiagnosisSummaryRequest extends Request {
    @Query
    @NameInMap("DBInstanceId")
    @Validation(required = true)
    private String DBInstanceId;

    @Query
    @NameInMap("PageNumber")
    private Integer pageNumber;

    @Query
    @NameInMap("PageSize")
    private Integer pageSize;

    @Query
    @NameInMap("RolePreferd")
    private String rolePreferd;

    @Query
    @NameInMap("StartStatus")
    private String startStatus;

    @Query
    @NameInMap("SyncMode")
    private String syncMode;

    private DescribeDBInstanceDiagnosisSummaryRequest(Builder builder) {
        super(builder);
        this.DBInstanceId = builder.DBInstanceId;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.rolePreferd = builder.rolePreferd;
        this.startStatus = builder.startStatus;
        this.syncMode = builder.syncMode;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDBInstanceDiagnosisSummaryRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return DBInstanceId
     */
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    /**
     * @return pageNumber
     */
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return rolePreferd
     */
    public String getRolePreferd() {
        return this.rolePreferd;
    }

    /**
     * @return startStatus
     */
    public String getStartStatus() {
        return this.startStatus;
    }

    /**
     * @return syncMode
     */
    public String getSyncMode() {
        return this.syncMode;
    }

    public static final class Builder extends Request.Builder<DescribeDBInstanceDiagnosisSummaryRequest, Builder> {
        private String DBInstanceId; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String rolePreferd; 
        private String startStatus; 
        private String syncMode; 

        private Builder() {
            super();
        } 

        private Builder(DescribeDBInstanceDiagnosisSummaryRequest request) {
            super(request);
            this.DBInstanceId = request.DBInstanceId;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.rolePreferd = request.rolePreferd;
            this.startStatus = request.startStatus;
            this.syncMode = request.syncMode;
        } 

        /**
         * The instance ID.
         * <p>
         * 
         * > You can call the [DescribeDBInstances](~~86911~~) operation to query details about all AnalyticDB for PostgreSQL instances within a region, including instance IDs.
         */
        public Builder DBInstanceId(String DBInstanceId) {
            this.putQueryParameter("DBInstanceId", DBInstanceId);
            this.DBInstanceId = DBInstanceId;
            return this;
        }

        /**
         * The page number. Pages start from page 1. Default value: **1**.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.putQueryParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * The number of entries per page. Valid values:
         * <p>
         * 
         * *   **20**
         * *   **50**
         * *   **100**
         * 
         * Default value: **20**.
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * The role state of the node. It specifies whether a primary/secondary switchover occurs. Valid values:
         * <p>
         * 
         * *   **normal**: The node role is normal. No primary/secondary switchover occurs.
         * *   **reverse**: The node role is reversed. A primary/secondary switchover occurs.
         */
        public Builder rolePreferd(String rolePreferd) {
            this.putQueryParameter("RolePreferd", rolePreferd);
            this.rolePreferd = rolePreferd;
            return this;
        }

        /**
         * The running state of the node. Valid values:
         * <p>
         * 
         * *   **UP**: The node is running.
         * *   **DOWN**: The node is faulty.
         * 
         * If you do not specify this parameter, the information about nodes in all running states is returned.
         */
        public Builder startStatus(String startStatus) {
            this.putQueryParameter("StartStatus", startStatus);
            this.startStatus = startStatus;
            return this;
        }

        /**
         * The data synchronization state of the node. Valid values:
         * <p>
         * 
         * *   **synced**: The node data is synchronized.
         * *   **notSyncing**: The node data is not synchronized.
         * 
         * If you do not specify this parameter, the information about nodes in all synchronization states is returned.
         */
        public Builder syncMode(String syncMode) {
            this.putQueryParameter("SyncMode", syncMode);
            this.syncMode = syncMode;
            return this;
        }

        @Override
        public DescribeDBInstanceDiagnosisSummaryRequest build() {
            return new DescribeDBInstanceDiagnosisSummaryRequest(this);
        } 

    } 

}
