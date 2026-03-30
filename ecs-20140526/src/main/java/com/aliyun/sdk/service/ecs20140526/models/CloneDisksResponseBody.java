// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20140526.models;

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
 * {@link CloneDisksResponseBody} extends {@link TeaModel}
 *
 * <p>CloneDisksResponseBody</p>
 */
public class CloneDisksResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TaskGroupId")
    private String taskGroupId;

    private CloneDisksResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.taskGroupId = builder.taskGroupId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CloneDisksResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return taskGroupId
     */
    public String getTaskGroupId() {
        return this.taskGroupId;
    }

    public static final class Builder {
        private String requestId; 
        private String taskGroupId; 

        private Builder() {
        } 

        private Builder(CloneDisksResponseBody model) {
            this.requestId = model.requestId;
            this.taskGroupId = model.taskGroupId;
        } 

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * TaskGroupId.
         */
        public Builder taskGroupId(String taskGroupId) {
            this.taskGroupId = taskGroupId;
            return this;
        }

        public CloneDisksResponseBody build() {
            return new CloneDisksResponseBody(this);
        } 

    } 

}
