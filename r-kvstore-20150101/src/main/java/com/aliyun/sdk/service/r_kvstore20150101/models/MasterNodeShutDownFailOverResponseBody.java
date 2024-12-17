// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.r_kvstore20150101.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link MasterNodeShutDownFailOverResponseBody} extends {@link TeaModel}
 *
 * <p>MasterNodeShutDownFailOverResponseBody</p>
 */
public class MasterNodeShutDownFailOverResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DBInstanceId")
    private String DBInstanceId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TaskID")
    private String taskID;

    private MasterNodeShutDownFailOverResponseBody(Builder builder) {
        this.DBInstanceId = builder.DBInstanceId;
        this.requestId = builder.requestId;
        this.taskID = builder.taskID;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static MasterNodeShutDownFailOverResponseBody create() {
        return builder().build();
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
     * @return taskID
     */
    public String getTaskID() {
        return this.taskID;
    }

    public static final class Builder {
        private String DBInstanceId; 
        private String requestId; 
        private String taskID; 

        /**
         * <p>The instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>r-bp1zxszhcgatnx****</p>
         */
        public Builder DBInstanceId(String DBInstanceId) {
            this.DBInstanceId = DBInstanceId;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>12123216-4B00-4378-BE4B-08005BFC****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The task ID. For information about how to obtain the ID of a task, see <a href="https://help.aliyun.com/document_detail/454662.html">ListTasks</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>17566</p>
         */
        public Builder taskID(String taskID) {
            this.taskID = taskID;
            return this;
        }

        public MasterNodeShutDownFailOverResponseBody build() {
            return new MasterNodeShutDownFailOverResponseBody(this);
        } 

    } 

}
