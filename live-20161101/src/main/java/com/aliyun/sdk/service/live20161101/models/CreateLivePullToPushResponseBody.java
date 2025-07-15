// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.live20161101.models;

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
 * {@link CreateLivePullToPushResponseBody} extends {@link TeaModel}
 *
 * <p>CreateLivePullToPushResponseBody</p>
 */
public class CreateLivePullToPushResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("RetCode")
    private Integer retCode;

    @com.aliyun.core.annotation.NameInMap("TaskId")
    private String taskId;

    private CreateLivePullToPushResponseBody(Builder builder) {
        this.description = builder.description;
        this.requestId = builder.requestId;
        this.retCode = builder.retCode;
        this.taskId = builder.taskId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateLivePullToPushResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return retCode
     */
    public Integer getRetCode() {
        return this.retCode;
    }

    /**
     * @return taskId
     */
    public String getTaskId() {
        return this.taskId;
    }

    public static final class Builder {
        private String description; 
        private String requestId; 
        private Integer retCode; 
        private String taskId; 

        private Builder() {
        } 

        private Builder(CreateLivePullToPushResponseBody model) {
            this.description = model.description;
            this.requestId = model.requestId;
            this.retCode = model.retCode;
            this.taskId = model.taskId;
        } 

        /**
         * <p>The description of the custom rule.</p>
         * 
         * <strong>example:</strong>
         * <p>OK</p>
         */
        public Builder description(String description) {
            this.description = description;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>16A96B9A-F203-4EC5-8E43-CB92E68*****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The code that is returned for the request.</p>
         * <blockquote>
         * </blockquote>
         * <ul>
         * <li><p>0 is returned if the request is normal.</p>
         * </li>
         * <li><p>For information about codes that are returned when exceptions occur, see the following Error codes table.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder retCode(Integer retCode) {
            this.retCode = retCode;
            return this;
        }

        /**
         * <p>The task ID.</p>
         * 
         * <strong>example:</strong>
         * <p>fd245384-4067-4f91-9d75-9666a6bc9****</p>
         */
        public Builder taskId(String taskId) {
            this.taskId = taskId;
            return this;
        }

        public CreateLivePullToPushResponseBody build() {
            return new CreateLivePullToPushResponseBody(this);
        } 

    } 

}
