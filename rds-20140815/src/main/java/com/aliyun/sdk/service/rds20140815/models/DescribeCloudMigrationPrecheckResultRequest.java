// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rds20140815.models;

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
 * {@link DescribeCloudMigrationPrecheckResultRequest} extends {@link RequestModel}
 *
 * <p>DescribeCloudMigrationPrecheckResultRequest</p>
 */
public class DescribeCloudMigrationPrecheckResultRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DBInstanceName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String DBInstanceName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageNumber")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long pageNumber;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SourceIpAddress")
    private String sourceIpAddress;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SourcePort")
    private Long sourcePort;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TaskId")
    private Long taskId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TaskName")
    private String taskName;

    private DescribeCloudMigrationPrecheckResultRequest(Builder builder) {
        super(builder);
        this.DBInstanceName = builder.DBInstanceName;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.sourceIpAddress = builder.sourceIpAddress;
        this.sourcePort = builder.sourcePort;
        this.taskId = builder.taskId;
        this.taskName = builder.taskName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeCloudMigrationPrecheckResultRequest create() {
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
     * @return pageNumber
     */
    public Long getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public Long getPageSize() {
        return this.pageSize;
    }

    /**
     * @return resourceOwnerId
     */
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    /**
     * @return sourceIpAddress
     */
    public String getSourceIpAddress() {
        return this.sourceIpAddress;
    }

    /**
     * @return sourcePort
     */
    public Long getSourcePort() {
        return this.sourcePort;
    }

    /**
     * @return taskId
     */
    public Long getTaskId() {
        return this.taskId;
    }

    /**
     * @return taskName
     */
    public String getTaskName() {
        return this.taskName;
    }

    public static final class Builder extends Request.Builder<DescribeCloudMigrationPrecheckResultRequest, Builder> {
        private String DBInstanceName; 
        private Long pageNumber; 
        private Long pageSize; 
        private Long resourceOwnerId; 
        private String sourceIpAddress; 
        private Long sourcePort; 
        private Long taskId; 
        private String taskName; 

        private Builder() {
            super();
        } 

        private Builder(DescribeCloudMigrationPrecheckResultRequest request) {
            super(request);
            this.DBInstanceName = request.DBInstanceName;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.resourceOwnerId = request.resourceOwnerId;
            this.sourceIpAddress = request.sourceIpAddress;
            this.sourcePort = request.sourcePort;
            this.taskId = request.taskId;
            this.taskName = request.taskName;
        } 

        /**
         * <p>The instance ID. You can call the DescribeDBInstances operation to query the instance ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>pgm-bp102g323jd4****</p>
         */
        public Builder DBInstanceName(String DBInstanceName) {
            this.putQueryParameter("DBInstanceName", DBInstanceName);
            this.DBInstanceName = DBInstanceName;
            return this;
        }

        /**
         * <p>The page number. Pages start from page 1. Default value: <strong>1</strong>.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Long pageNumber) {
            this.putQueryParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The number of entries per page. Valid values: <strong>30</strong> to <strong>100</strong>. Default value: 30.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>30</p>
         */
        public Builder pageSize(Long pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
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
         * <p>The private or public IP address that is used to connect to the self-managed PostgreSQL instance.</p>
         * <ul>
         * <li>If the self-managed PostgreSQL instance resides on an Elastic Compute Service (ECS) instance, enter the private IP address of the ECS instance. For more information about how to obtain the private IP address of an ECS instance, see <a href="https://help.aliyun.com/document_detail/273914.html">View IP addresses</a>.</li>
         * <li>If the self-managed PostgreSQL instance resides in an on-premises data center, enter the private IP address of the on-premises data center.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>172.2.XX.XX</p>
         */
        public Builder sourceIpAddress(String sourceIpAddress) {
            this.putQueryParameter("SourceIpAddress", sourceIpAddress);
            this.sourceIpAddress = sourceIpAddress;
            return this;
        }

        /**
         * <p>The port number that is used to connect to the self-managed PostgreSQL instance. You can run the netstat -a | grep PGSQL command to obtain the port number.</p>
         * 
         * <strong>example:</strong>
         * <p>5432</p>
         */
        public Builder sourcePort(Long sourcePort) {
            this.putQueryParameter("SourcePort", sourcePort);
            this.sourcePort = sourcePort;
            return this;
        }

        /**
         * <p>The task ID. You can obtain the task ID from the response that is returned after you call the CreateCloudMigrationPrecheckTask operation to create the task.</p>
         * 
         * <strong>example:</strong>
         * <p>439946016</p>
         */
        public Builder taskId(Long taskId) {
            this.putQueryParameter("TaskId", taskId);
            this.taskId = taskId;
            return this;
        }

        /**
         * <p>The task name. You can obtain the task name from the response that is returned after you call the CreateCloudMigrationPrecheckTask operation to create the task.</p>
         * 
         * <strong>example:</strong>
         * <p>slf7w7wj3g</p>
         */
        public Builder taskName(String taskName) {
            this.putQueryParameter("TaskName", taskName);
            this.taskName = taskName;
            return this;
        }

        @Override
        public DescribeCloudMigrationPrecheckResultRequest build() {
            return new DescribeCloudMigrationPrecheckResultRequest(this);
        } 

    } 

}
