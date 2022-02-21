// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.clickhouse20191111.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link TransferVersionResponseBody} extends {@link TeaModel}
 *
 * <p>TransferVersionResponseBody</p>
 */
public class TransferVersionResponseBody extends TeaModel {
    @NameInMap("DBInstanceID")
    private Integer DBInstanceID;

    @NameInMap("DBInstanceName")
    private Long DBInstanceName;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TaskId")
    private Boolean taskId;

    private TransferVersionResponseBody(Builder builder) {
        this.DBInstanceID = builder.DBInstanceID;
        this.DBInstanceName = builder.DBInstanceName;
        this.requestId = builder.requestId;
        this.taskId = builder.taskId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static TransferVersionResponseBody create() {
        return builder().build();
    }

    /**
     * @return DBInstanceID
     */
    public Integer getDBInstanceID() {
        return this.DBInstanceID;
    }

    /**
     * @return DBInstanceName
     */
    public Long getDBInstanceName() {
        return this.DBInstanceName;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return taskId
     */
    public Boolean getTaskId() {
        return this.taskId;
    }

    public static final class Builder {
        private Integer DBInstanceID; 
        private Long DBInstanceName; 
        private String requestId; 
        private Boolean taskId; 

        /**
         * DBInstanceID.
         */
        public Builder DBInstanceID(Integer DBInstanceID) {
            this.DBInstanceID = DBInstanceID;
            return this;
        }

        /**
         * DBInstanceName.
         */
        public Builder DBInstanceName(Long DBInstanceName) {
            this.DBInstanceName = DBInstanceName;
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
         * TaskId.
         */
        public Builder taskId(Boolean taskId) {
            this.taskId = taskId;
            return this;
        }

        public TransferVersionResponseBody build() {
            return new TransferVersionResponseBody(this);
        } 

    } 

}
