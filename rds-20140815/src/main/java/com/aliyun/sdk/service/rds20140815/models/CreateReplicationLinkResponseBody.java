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
 * {@link CreateReplicationLinkResponseBody} extends {@link TeaModel}
 *
 * <p>CreateReplicationLinkResponseBody</p>
 */
public class CreateReplicationLinkResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DBInstanceId")
    private String DBInstanceId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TaskId")
    private Long taskId;

    @com.aliyun.core.annotation.NameInMap("TaskName")
    private String taskName;

    private CreateReplicationLinkResponseBody(Builder builder) {
        this.DBInstanceId = builder.DBInstanceId;
        this.requestId = builder.requestId;
        this.taskId = builder.taskId;
        this.taskName = builder.taskName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateReplicationLinkResponseBody create() {
        return builder().build();
    }

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
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
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

    public static final class Builder {
        private String DBInstanceId; 
        private String requestId; 
        private Long taskId; 
        private String taskName; 

        private Builder() {
        } 

        private Builder(CreateReplicationLinkResponseBody model) {
            this.DBInstanceId = model.DBInstanceId;
            this.requestId = model.requestId;
            this.taskId = model.taskId;
            this.taskName = model.taskName;
        } 

        /**
         * <p>The ID of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>pgm-****.pg.rds.aliyuncs.com</p>
         */
        public Builder DBInstanceId(String DBInstanceId) {
            this.DBInstanceId = DBInstanceId;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>9F8C06AD-3F37-57A0-ABBF-ABD7824F55CE</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The ID of the task.</p>
         * 
         * <strong>example:</strong>
         * <p>564532302</p>
         */
        public Builder taskId(Long taskId) {
            this.taskId = taskId;
            return this;
        }

        /**
         * <p>The name of the task.</p>
         * 
         * <strong>example:</strong>
         * <p>test01</p>
         */
        public Builder taskName(String taskName) {
            this.taskName = taskName;
            return this;
        }

        public CreateReplicationLinkResponseBody build() {
            return new CreateReplicationLinkResponseBody(this);
        } 

    } 

}
