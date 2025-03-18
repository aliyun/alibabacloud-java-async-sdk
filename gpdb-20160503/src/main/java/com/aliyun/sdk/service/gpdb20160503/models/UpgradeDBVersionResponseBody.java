// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gpdb20160503.models;

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
 * {@link UpgradeDBVersionResponseBody} extends {@link TeaModel}
 *
 * <p>UpgradeDBVersionResponseBody</p>
 */
public class UpgradeDBVersionResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DBInstanceId")
    private String DBInstanceId;

    @com.aliyun.core.annotation.NameInMap("DBInstanceName")
    private String DBInstanceName;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TaskId")
    private String taskId;

    private UpgradeDBVersionResponseBody(Builder builder) {
        this.DBInstanceId = builder.DBInstanceId;
        this.DBInstanceName = builder.DBInstanceName;
        this.requestId = builder.requestId;
        this.taskId = builder.taskId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpgradeDBVersionResponseBody create() {
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
     * @return DBInstanceName
     */
    public String getDBInstanceName() {
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
    public String getTaskId() {
        return this.taskId;
    }

    public static final class Builder {
        private String DBInstanceId; 
        private String DBInstanceName; 
        private String requestId; 
        private String taskId; 

        private Builder() {
        } 

        private Builder(UpgradeDBVersionResponseBody model) {
            this.DBInstanceId = model.DBInstanceId;
            this.DBInstanceName = model.DBInstanceName;
            this.requestId = model.requestId;
            this.taskId = model.taskId;
        } 

        /**
         * <p>This parameter is no longer returned.</p>
         * 
         * <strong>example:</strong>
         * <p>gp-wz9kmr708m155j***</p>
         */
        public Builder DBInstanceId(String DBInstanceId) {
            this.DBInstanceId = DBInstanceId;
            return this;
        }

        /**
         * <p>The name of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>gp-wz9kmr708m155j***</p>
         */
        public Builder DBInstanceName(String DBInstanceName) {
            this.DBInstanceName = DBInstanceName;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>25C11EE5-B7E8-481A-A07C-BD619971A570</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The ID of the task.</p>
         * 
         * <strong>example:</strong>
         * <p>101450956</p>
         */
        public Builder taskId(String taskId) {
            this.taskId = taskId;
            return this;
        }

        public UpgradeDBVersionResponseBody build() {
            return new UpgradeDBVersionResponseBody(this);
        } 

    } 

}
