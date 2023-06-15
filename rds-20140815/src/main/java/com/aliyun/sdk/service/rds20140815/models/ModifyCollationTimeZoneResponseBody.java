// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rds20140815.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyCollationTimeZoneResponseBody} extends {@link TeaModel}
 *
 * <p>ModifyCollationTimeZoneResponseBody</p>
 */
public class ModifyCollationTimeZoneResponseBody extends TeaModel {
    @NameInMap("Collation")
    private String collation;

    @NameInMap("DBInstanceId")
    private String DBInstanceId;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TaskId")
    private String taskId;

    @NameInMap("Timezone")
    private String timezone;

    private ModifyCollationTimeZoneResponseBody(Builder builder) {
        this.collation = builder.collation;
        this.DBInstanceId = builder.DBInstanceId;
        this.requestId = builder.requestId;
        this.taskId = builder.taskId;
        this.timezone = builder.timezone;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyCollationTimeZoneResponseBody create() {
        return builder().build();
    }

    /**
     * @return collation
     */
    public String getCollation() {
        return this.collation;
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
    public String getTaskId() {
        return this.taskId;
    }

    /**
     * @return timezone
     */
    public String getTimezone() {
        return this.timezone;
    }

    public static final class Builder {
        private String collation; 
        private String DBInstanceId; 
        private String requestId; 
        private String taskId; 
        private String timezone; 

        /**
         * The character set collation of the instance.
         */
        public Builder collation(String collation) {
            this.collation = collation;
            return this;
        }

        /**
         * The ID of the instance.
         */
        public Builder DBInstanceId(String DBInstanceId) {
            this.DBInstanceId = DBInstanceId;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The ID of the task.
         */
        public Builder taskId(String taskId) {
            this.taskId = taskId;
            return this;
        }

        /**
         * The time zone of the instance.
         */
        public Builder timezone(String timezone) {
            this.timezone = timezone;
            return this;
        }

        public ModifyCollationTimeZoneResponseBody build() {
            return new ModifyCollationTimeZoneResponseBody(this);
        } 

    } 

}
