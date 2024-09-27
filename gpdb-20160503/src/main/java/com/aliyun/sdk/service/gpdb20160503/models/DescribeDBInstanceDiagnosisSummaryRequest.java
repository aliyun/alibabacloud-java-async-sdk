// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gpdb20160503.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeDBInstanceDiagnosisSummaryRequest} extends {@link RequestModel}
 *
 * <p>DescribeDBInstanceDiagnosisSummaryRequest</p>
 */
public class DescribeDBInstanceDiagnosisSummaryRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DBInstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String DBInstanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RolePreferd")
    private String rolePreferd;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StartStatus")
    private String startStatus;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SyncMode")
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
         * <p>The instance ID.</p>
         * <blockquote>
         * <p>You can call the <a href="~~86911~~">DescribeDBInstances</a> operation to query details about all AnalyticDB for PostgreSQL instances within a region, including instance IDs.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>gp-bp12ga6v69h86****</p>
         */
        public Builder DBInstanceId(String DBInstanceId) {
            this.putQueryParameter("DBInstanceId", DBInstanceId);
            this.DBInstanceId = DBInstanceId;
            return this;
        }

        /**
         * <p>The page number. Pages start from page 1. Default value: <strong>1</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Integer pageNumber) {
            this.putQueryParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The number of entries per page. Valid values:</p>
         * <ul>
         * <li><strong>20</strong></li>
         * <li><strong>50</strong></li>
         * <li><strong>100</strong></li>
         * </ul>
         * <p>Default value: <strong>20</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The role state of the node. It specifies whether a primary/secondary switchover occurs. Valid values:</p>
         * <ul>
         * <li><strong>normal</strong>: The node role is normal. No primary/secondary switchover occurs.</li>
         * <li><strong>reverse</strong>: The node role is reversed. A primary/secondary switchover occurs.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>normal</p>
         */
        public Builder rolePreferd(String rolePreferd) {
            this.putQueryParameter("RolePreferd", rolePreferd);
            this.rolePreferd = rolePreferd;
            return this;
        }

        /**
         * <p>The running state of the node. Valid values:</p>
         * <ul>
         * <li><strong>UP</strong>: The node is running.</li>
         * <li><strong>DOWN</strong>: The node is faulty.</li>
         * </ul>
         * <p>If you do not specify this parameter, the information about nodes in all running states is returned.</p>
         * 
         * <strong>example:</strong>
         * <p>UP</p>
         */
        public Builder startStatus(String startStatus) {
            this.putQueryParameter("StartStatus", startStatus);
            this.startStatus = startStatus;
            return this;
        }

        /**
         * <p>The data synchronization state of the node. Valid values:</p>
         * <ul>
         * <li><strong>synced</strong>: The node data is synchronized.</li>
         * <li><strong>notSyncing</strong>: The node data is not synchronized.</li>
         * </ul>
         * <p>If you do not specify this parameter, the information about nodes in all synchronization states is returned.</p>
         * 
         * <strong>example:</strong>
         * <p>synced</p>
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
