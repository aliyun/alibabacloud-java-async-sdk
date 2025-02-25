// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cs20151215.models;

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
 * {@link FixNodePoolVulsResponseBody} extends {@link TeaModel}
 *
 * <p>FixNodePoolVulsResponseBody</p>
 */
public class FixNodePoolVulsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("task_id")
    private String taskId;

    private FixNodePoolVulsResponseBody(Builder builder) {
        this.taskId = builder.taskId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static FixNodePoolVulsResponseBody create() {
        return builder().build();
    }

    /**
     * @return taskId
     */
    public String getTaskId() {
        return this.taskId;
    }

    public static final class Builder {
        private String taskId; 

        /**
         * <p>The ID of the CVE patching task.</p>
         * 
         * <strong>example:</strong>
         * <p>T-60fea8ad2e277f087900****</p>
         */
        public Builder taskId(String taskId) {
            this.taskId = taskId;
            return this;
        }

        public FixNodePoolVulsResponseBody build() {
            return new FixNodePoolVulsResponseBody(this);
        } 

    } 

}
