// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.clickhouse20191111.models;

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
 * {@link DescribeDBClusterPerformanceRequest} extends {@link RequestModel}
 *
 * <p>DescribeDBClusterPerformanceRequest</p>
 */
public class DescribeDBClusterPerformanceRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DBClusterId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String DBClusterId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EndTime")
    @com.aliyun.core.annotation.Validation(required = true)
    private String endTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Key")
    private String key;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerAccount")
    private String ownerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StartTime")
    @com.aliyun.core.annotation.Validation(required = true)
    private String startTime;

    private DescribeDBClusterPerformanceRequest(Builder builder) {
        super(builder);
        this.DBClusterId = builder.DBClusterId;
        this.endTime = builder.endTime;
        this.key = builder.key;
        this.ownerAccount = builder.ownerAccount;
        this.ownerId = builder.ownerId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.startTime = builder.startTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDBClusterPerformanceRequest create() {
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
     * @return endTime
     */
    public String getEndTime() {
        return this.endTime;
    }

    /**
     * @return key
     */
    public String getKey() {
        return this.key;
    }

    /**
     * @return ownerAccount
     */
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    /**
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
    }

    /**
     * @return resourceOwnerAccount
     */
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    /**
     * @return resourceOwnerId
     */
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    /**
     * @return startTime
     */
    public String getStartTime() {
        return this.startTime;
    }

    public static final class Builder extends Request.Builder<DescribeDBClusterPerformanceRequest, Builder> {
        private String DBClusterId; 
        private String endTime; 
        private String key; 
        private String ownerAccount; 
        private Long ownerId; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private String startTime; 

        private Builder() {
            super();
        } 

        private Builder(DescribeDBClusterPerformanceRequest request) {
            super(request);
            this.DBClusterId = request.DBClusterId;
            this.endTime = request.endTime;
            this.key = request.key;
            this.ownerAccount = request.ownerAccount;
            this.ownerId = request.ownerId;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
            this.startTime = request.startTime;
        } 

        /**
         * <p>The cluster ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cc-bp125e3uu94wo****</p>
         */
        public Builder DBClusterId(String DBClusterId) {
            this.putQueryParameter("DBClusterId", DBClusterId);
            this.DBClusterId = DBClusterId;
            return this;
        }

        /**
         * <p>The end time of the query. Format: yyyy-MM-ddTHH:mmZ (UTC time).</p>
         * <blockquote>
         * <p>The end time must be later than the start time, and the time interval between the start time and the end time cannot exceed 32 days.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>2021-11-27T16:38Z</p>
         */
        public Builder endTime(String endTime) {
            this.putQueryParameter("EndTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * <p>The names of the performance metrics to query. Separate multiple values with commas (,). You can query up to 5 performance metrics at a time. The following performance metrics are supported:</p>
         * <blockquote>
         * <p><strong>Key</strong> is required.</p>
         * </blockquote>
         * <ul>
         * <li><strong>CPU</strong>:<ul>
         * <li><strong>CPU_USAGE</strong>: CPU utilization.</li>
         * </ul>
         * </li>
         * <li><strong>Memory</strong>:<ul>
         * <li><strong>MEM_USAGE</strong>: Memory utilization.</li>
         * <li><strong>MEM_USAGE_SIZE</strong>: Memory usage (unit: MB).</li>
         * </ul>
         * </li>
         * <li><strong>Disk</strong>:<ul>
         * <li><strong>DISK_USAGE</strong>: Disk utilization. </li>
         * <li><strong>DISK_USAGE_SIZE</strong>: Disk usage (unit: MB).</li>
         * <li><strong>IOPS</strong>: Disk IOPS.</li>
         * </ul>
         * </li>
         * <li><strong>Connections</strong>:<ul>
         * <li><strong>CONN_USAGE</strong>: Database connection utilization.</li>
         * <li><strong>CONN_USAGE_COUNT</strong>: Number of database connections in use.</li>
         * </ul>
         * </li>
         * <li><strong>Writes</strong>: <ul>
         * <li><strong>TPS</strong>: Number of rows written per second.</li>
         * <li><strong>INSERT_SIZE</strong>: Size of data written per second (unit: MB).</li>
         * </ul>
         * </li>
         * <li><strong>Queries</strong>: <ul>
         * <li><strong>QPS</strong>: Queries per second (QPS).</li>
         * <li><strong>AVG_SEEK</strong>: Number of random SEEK calls.</li>
         * </ul>
         * </li>
         * <li><strong>WAIT</strong>: <ul>
         * <li><strong>ZK_WAIT</strong>: Average wait time for ZooKeeper (unit: ms).</li>
         * <li><strong>IO_WAIT</strong>: Average wait time for IO_WAIT (unit: ms).</li>
         * <li><strong>CPU_WAIT</strong>: Average wait time for CPU_WAIT (unit: ms).</li>
         * </ul>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>MEM_USAGE</p>
         */
        public Builder key(String key) {
            this.putQueryParameter("Key", key);
            this.key = key;
            return this;
        }

        /**
         * OwnerAccount.
         */
        public Builder ownerAccount(String ownerAccount) {
            this.putQueryParameter("OwnerAccount", ownerAccount);
            this.ownerAccount = ownerAccount;
            return this;
        }

        /**
         * OwnerId.
         */
        public Builder ownerId(Long ownerId) {
            this.putQueryParameter("OwnerId", ownerId);
            this.ownerId = ownerId;
            return this;
        }

        /**
         * ResourceOwnerAccount.
         */
        public Builder resourceOwnerAccount(String resourceOwnerAccount) {
            this.putQueryParameter("ResourceOwnerAccount", resourceOwnerAccount);
            this.resourceOwnerAccount = resourceOwnerAccount;
            return this;
        }

        /**
         * ResourceOwnerId.
         */
        public Builder resourceOwnerId(Long resourceOwnerId) {
            this.putQueryParameter("ResourceOwnerId", resourceOwnerId);
            this.resourceOwnerId = resourceOwnerId;
            return this;
        }

        /**
         * <p>The start time of the query. Format: yyyy-MM-ddTHH:mmZ (UTC time).</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>2021-11-27T16:37Z</p>
         */
        public Builder startTime(String startTime) {
            this.putQueryParameter("StartTime", startTime);
            this.startTime = startTime;
            return this;
        }

        @Override
        public DescribeDBClusterPerformanceRequest build() {
            return new DescribeDBClusterPerformanceRequest(this);
        } 

    } 

}
