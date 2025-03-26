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
 * {@link ModifyCollationTimeZoneResponseBody} extends {@link TeaModel}
 *
 * <p>ModifyCollationTimeZoneResponseBody</p>
 */
public class ModifyCollationTimeZoneResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Collation")
    private String collation;

    @com.aliyun.core.annotation.NameInMap("DBInstanceId")
    private String DBInstanceId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TaskId")
    private String taskId;

    @com.aliyun.core.annotation.NameInMap("Timezone")
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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(ModifyCollationTimeZoneResponseBody model) {
            this.collation = model.collation;
            this.DBInstanceId = model.DBInstanceId;
            this.requestId = model.requestId;
            this.taskId = model.taskId;
            this.timezone = model.timezone;
        } 

        /**
         * <p>The character set collation of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>Latin1_General_CI_AS</p>
         */
        public Builder collation(String collation) {
            this.collation = collation;
            return this;
        }

        /**
         * <p>The instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>rm-uf6wjk5xxxxxxx</p>
         */
        public Builder DBInstanceId(String DBInstanceId) {
            this.DBInstanceId = DBInstanceId;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>8EA054AF-DFA7-497D-9F57-790FFC974C0B</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The task ID.</p>
         * 
         * <strong>example:</strong>
         * <p>114413215</p>
         */
        public Builder taskId(String taskId) {
            this.taskId = taskId;
            return this;
        }

        /**
         * <p>The time zone.</p>
         * 
         * <strong>example:</strong>
         * <p>China Standard Time</p>
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
