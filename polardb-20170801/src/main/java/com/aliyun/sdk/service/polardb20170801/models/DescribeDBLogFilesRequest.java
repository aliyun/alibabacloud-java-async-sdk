// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.polardb20170801.models;

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
 * {@link DescribeDBLogFilesRequest} extends {@link RequestModel}
 *
 * <p>DescribeDBLogFilesRequest</p>
 */
public class DescribeDBLogFilesRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DBClusterId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String DBClusterId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DBNodeId")
    private String DBNodeId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DescribeSimulateSwitchMode")
    private String describeSimulateSwitchMode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EndTime")
    private String endTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("LogType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String logType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerAccount")
    private String ownerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SimulateListId")
    private String simulateListId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SimulateModeList")
    private String simulateModeList;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SimulateStatusList")
    private String simulateStatusList;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StartTime")
    private String startTime;

    private DescribeDBLogFilesRequest(Builder builder) {
        super(builder);
        this.DBClusterId = builder.DBClusterId;
        this.DBNodeId = builder.DBNodeId;
        this.describeSimulateSwitchMode = builder.describeSimulateSwitchMode;
        this.endTime = builder.endTime;
        this.logType = builder.logType;
        this.ownerAccount = builder.ownerAccount;
        this.ownerId = builder.ownerId;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.simulateListId = builder.simulateListId;
        this.simulateModeList = builder.simulateModeList;
        this.simulateStatusList = builder.simulateStatusList;
        this.startTime = builder.startTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDBLogFilesRequest create() {
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
     * @return DBNodeId
     */
    public String getDBNodeId() {
        return this.DBNodeId;
    }

    /**
     * @return describeSimulateSwitchMode
     */
    public String getDescribeSimulateSwitchMode() {
        return this.describeSimulateSwitchMode;
    }

    /**
     * @return endTime
     */
    public String getEndTime() {
        return this.endTime;
    }

    /**
     * @return logType
     */
    public String getLogType() {
        return this.logType;
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
     * @return simulateListId
     */
    public String getSimulateListId() {
        return this.simulateListId;
    }

    /**
     * @return simulateModeList
     */
    public String getSimulateModeList() {
        return this.simulateModeList;
    }

    /**
     * @return simulateStatusList
     */
    public String getSimulateStatusList() {
        return this.simulateStatusList;
    }

    /**
     * @return startTime
     */
    public String getStartTime() {
        return this.startTime;
    }

    public static final class Builder extends Request.Builder<DescribeDBLogFilesRequest, Builder> {
        private String DBClusterId; 
        private String DBNodeId; 
        private String describeSimulateSwitchMode; 
        private String endTime; 
        private String logType; 
        private String ownerAccount; 
        private Long ownerId; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private String simulateListId; 
        private String simulateModeList; 
        private String simulateStatusList; 
        private String startTime; 

        private Builder() {
            super();
        } 

        private Builder(DescribeDBLogFilesRequest request) {
            super(request);
            this.DBClusterId = request.DBClusterId;
            this.DBNodeId = request.DBNodeId;
            this.describeSimulateSwitchMode = request.describeSimulateSwitchMode;
            this.endTime = request.endTime;
            this.logType = request.logType;
            this.ownerAccount = request.ownerAccount;
            this.ownerId = request.ownerId;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
            this.simulateListId = request.simulateListId;
            this.simulateModeList = request.simulateModeList;
            this.simulateStatusList = request.simulateStatusList;
            this.startTime = request.startTime;
        } 

        /**
         * <p>The cluster ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>pc-*************</p>
         */
        public Builder DBClusterId(String DBClusterId) {
            this.putQueryParameter("DBClusterId", DBClusterId);
            this.DBClusterId = DBClusterId;
            return this;
        }

        /**
         * <p>The ID of the node in the PolarDB cluster.</p>
         * 
         * <strong>example:</strong>
         * <p>pi-*************</p>
         */
        public Builder DBNodeId(String DBNodeId) {
            this.putQueryParameter("DBNodeId", DBNodeId);
            this.DBNodeId = DBNodeId;
            return this;
        }

        /**
         * <p>The mode to query simulation records. Valid values:</p>
         * <ul>
         * <li><p><strong>0</strong>: Queries the simulation records of a logical instance. You can specify the simulation ID.</p>
         * </li>
         * <li><p><strong>1</strong>: Queries the simulation records of a physical instance based on a specified <code>SimulateListId</code>.</p>
         * </li>
         * <li><p><strong>2</strong>: Queries the records of the most recent simulation in progress.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder describeSimulateSwitchMode(String describeSimulateSwitchMode) {
            this.putQueryParameter("DescribeSimulateSwitchMode", describeSimulateSwitchMode);
            this.describeSimulateSwitchMode = describeSimulateSwitchMode;
            return this;
        }

        /**
         * <p>The end of the time range to query. The time must be in UTC and formatted as <code>yyyy-MM-ddTHH:mm:ssZ</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>2023-09-20T16:00:00Z</p>
         */
        public Builder endTime(String endTime) {
            this.putQueryParameter("EndTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * <p>The log type. Valid values:</p>
         * <ul>
         * <li><p><strong>HaSwitchLogList</strong>: A list of failover logs.</p>
         * </li>
         * <li><p><strong>HaSwitchLogInfo</strong>: Details of a failover log.</p>
         * </li>
         * <li><p><strong>SimulateSwitchLogs</strong>: Failover simulation logs.</p>
         * </li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>HaSwitchLogList</p>
         */
        public Builder logType(String logType) {
            this.putQueryParameter("LogType", logType);
            this.logType = logType;
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
         * <p>The page number. The value must be an integer that is greater than 0. The default value is <strong>1</strong>.</p>
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
         * <p>The page size. Valid values: 5 to 50. The default value is 10.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
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
         * <p>The ID of a logical instance simulation record.</p>
         * 
         * <strong>example:</strong>
         * <p>&quot;95&quot;</p>
         */
        public Builder simulateListId(String simulateListId) {
            this.putQueryParameter("SimulateListId", simulateListId);
            this.simulateListId = simulateListId;
            return this;
        }

        /**
         * <p>Filters the results by one or more simulation modes. Specify multiple modes as a comma-separated string. Valid values:</p>
         * <ul>
         * <li><p><strong>0</strong>: Fault is injected into the primary availability zone.</p>
         * </li>
         * <li><p><strong>1</strong>: Fault is injected into the DB instance.</p>
         * </li>
         * <li><p><strong>2</strong>: Fault is injected into the disaster recovery data center.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0,1,2</p>
         */
        public Builder simulateModeList(String simulateModeList) {
            this.putQueryParameter("SimulateModeList", simulateModeList);
            this.simulateModeList = simulateModeList;
            return this;
        }

        /**
         * <p>Filters the results by one or more simulation statuses. Specify multiple statuses as a comma-separated string. Valid values:</p>
         * <ul>
         * <li><p><strong>0</strong>: Waiting for scheduling</p>
         * </li>
         * <li><p><strong>1</strong>: Succeeded</p>
         * </li>
         * <li><p><strong>2</strong>: Running</p>
         * </li>
         * <li><p><strong>3</strong>: Failed</p>
         * </li>
         * <li><p><strong>4</strong>: Interrupted</p>
         * </li>
         * <li><p><strong>5</strong>: Waiting for switchback</p>
         * </li>
         * <li><p><strong>6</strong>: Canceled</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>&quot;0,1,2,3,4,5&quot;</p>
         */
        public Builder simulateStatusList(String simulateStatusList) {
            this.putQueryParameter("SimulateStatusList", simulateStatusList);
            this.simulateStatusList = simulateStatusList;
            return this;
        }

        /**
         * <p>The start of the time range to query. The time must be in UTC and formatted as <code>yyyy-MM-ddTHH:mm:ssZ</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>2023-08-20T16:00:00Z</p>
         */
        public Builder startTime(String startTime) {
            this.putQueryParameter("StartTime", startTime);
            this.startTime = startTime;
            return this;
        }

        @Override
        public DescribeDBLogFilesRequest build() {
            return new DescribeDBLogFilesRequest(this);
        } 

    } 

}
