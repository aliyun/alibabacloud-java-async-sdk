// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rds20140815.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link CopyDatabaseResponseBody} extends {@link TeaModel}
 *
 * <p>CopyDatabaseResponseBody</p>
 */
public class CopyDatabaseResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DBName")
    private String DBName;

    @com.aliyun.core.annotation.NameInMap("DBStatus")
    private String DBStatus;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TaskId")
    private String taskId;

    private CopyDatabaseResponseBody(Builder builder) {
        this.DBName = builder.DBName;
        this.DBStatus = builder.DBStatus;
        this.requestId = builder.requestId;
        this.taskId = builder.taskId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CopyDatabaseResponseBody create() {
        return builder().build();
    }

    /**
     * @return DBName
     */
    public String getDBName() {
        return this.DBName;
    }

    /**
     * @return DBStatus
     */
    public String getDBStatus() {
        return this.DBStatus;
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
    public String getTaskId() {
        return this.taskId;
    }

    public static final class Builder {
        private String DBName; 
        private String DBStatus; 
        private String requestId; 
        private String taskId; 

        /**
         * <p>The name of the database.</p>
         * 
         * <strong>example:</strong>
         * <p>test02</p>
         */
        public Builder DBName(String DBName) {
            this.DBName = DBName;
            return this;
        }

        /**
         * <p>The status of the database. Valid values:</p>
         * <ul>
         * <li><strong>Creating</strong></li>
         * <li><strong>Running</strong></li>
         * <li><strong>Deleting</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Creating</p>
         */
        public Builder DBStatus(String DBStatus) {
            this.DBStatus = DBStatus;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>1AD222E9-E606-4A42-BF6D-8A4442913CEF</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The ID of the task.</p>
         * 
         * <strong>example:</strong>
         * <p>2562****</p>
         */
        public Builder taskId(String taskId) {
            this.taskId = taskId;
            return this;
        }

        public CopyDatabaseResponseBody build() {
            return new CopyDatabaseResponseBody(this);
        } 

    } 

}
