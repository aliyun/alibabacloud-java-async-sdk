// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rds20140815.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CopyDatabaseResponseBody} extends {@link TeaModel}
 *
 * <p>CopyDatabaseResponseBody</p>
 */
public class CopyDatabaseResponseBody extends TeaModel {
    @NameInMap("DBName")
    private String DBName;

    @NameInMap("DBStatus")
    private String DBStatus;

    @NameInMap("TaskId")
    private String taskId;

    private CopyDatabaseResponseBody(Builder builder) {
        this.DBName = builder.DBName;
        this.DBStatus = builder.DBStatus;
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
     * @return taskId
     */
    public String getTaskId() {
        return this.taskId;
    }

    public static final class Builder {
        private String DBName; 
        private String DBStatus; 
        private String taskId; 

        /**
         * DBName.
         */
        public Builder DBName(String DBName) {
            this.DBName = DBName;
            return this;
        }

        /**
         * DBStatus.
         */
        public Builder DBStatus(String DBStatus) {
            this.DBStatus = DBStatus;
            return this;
        }

        /**
         * TaskId.
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
