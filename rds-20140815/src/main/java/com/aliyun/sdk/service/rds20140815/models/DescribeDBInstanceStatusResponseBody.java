// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rds20140815.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDBInstanceStatusResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDBInstanceStatusResponseBody</p>
 */
public class DescribeDBInstanceStatusResponseBody extends TeaModel {
    @NameInMap("DBInstanceCpuCores")
    private String DBInstanceCpuCores;

    @NameInMap("DBInstanceId")
    private Integer DBInstanceId;

    @NameInMap("DBInstanceName")
    private String DBInstanceName;

    @NameInMap("DBInstanceStatus")
    private Integer DBInstanceStatus;

    @NameInMap("DBInstanceUseType")
    private String DBInstanceUseType;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TaskStatus")
    private Integer taskStatus;

    private DescribeDBInstanceStatusResponseBody(Builder builder) {
        this.DBInstanceCpuCores = builder.DBInstanceCpuCores;
        this.DBInstanceId = builder.DBInstanceId;
        this.DBInstanceName = builder.DBInstanceName;
        this.DBInstanceStatus = builder.DBInstanceStatus;
        this.DBInstanceUseType = builder.DBInstanceUseType;
        this.requestId = builder.requestId;
        this.taskStatus = builder.taskStatus;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDBInstanceStatusResponseBody create() {
        return builder().build();
    }

    /**
     * @return DBInstanceCpuCores
     */
    public String getDBInstanceCpuCores() {
        return this.DBInstanceCpuCores;
    }

    /**
     * @return DBInstanceId
     */
    public Integer getDBInstanceId() {
        return this.DBInstanceId;
    }

    /**
     * @return DBInstanceName
     */
    public String getDBInstanceName() {
        return this.DBInstanceName;
    }

    /**
     * @return DBInstanceStatus
     */
    public Integer getDBInstanceStatus() {
        return this.DBInstanceStatus;
    }

    /**
     * @return DBInstanceUseType
     */
    public String getDBInstanceUseType() {
        return this.DBInstanceUseType;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return taskStatus
     */
    public Integer getTaskStatus() {
        return this.taskStatus;
    }

    public static final class Builder {
        private String DBInstanceCpuCores; 
        private Integer DBInstanceId; 
        private String DBInstanceName; 
        private Integer DBInstanceStatus; 
        private String DBInstanceUseType; 
        private String requestId; 
        private Integer taskStatus; 

        /**
         * DBInstanceCpuCores.
         */
        public Builder DBInstanceCpuCores(String DBInstanceCpuCores) {
            this.DBInstanceCpuCores = DBInstanceCpuCores;
            return this;
        }

        /**
         * DBInstanceId.
         */
        public Builder DBInstanceId(Integer DBInstanceId) {
            this.DBInstanceId = DBInstanceId;
            return this;
        }

        /**
         * DBInstanceName.
         */
        public Builder DBInstanceName(String DBInstanceName) {
            this.DBInstanceName = DBInstanceName;
            return this;
        }

        /**
         * DBInstanceStatus.
         */
        public Builder DBInstanceStatus(Integer DBInstanceStatus) {
            this.DBInstanceStatus = DBInstanceStatus;
            return this;
        }

        /**
         * DBInstanceUseType.
         */
        public Builder DBInstanceUseType(String DBInstanceUseType) {
            this.DBInstanceUseType = DBInstanceUseType;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * TaskStatus.
         */
        public Builder taskStatus(Integer taskStatus) {
            this.taskStatus = taskStatus;
            return this;
        }

        public DescribeDBInstanceStatusResponseBody build() {
            return new DescribeDBInstanceStatusResponseBody(this);
        } 

    } 

}
