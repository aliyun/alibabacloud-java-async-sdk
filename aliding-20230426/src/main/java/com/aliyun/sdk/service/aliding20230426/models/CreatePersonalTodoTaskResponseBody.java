// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aliding20230426.models;

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
 * {@link CreatePersonalTodoTaskResponseBody} extends {@link TeaModel}
 *
 * <p>CreatePersonalTodoTaskResponseBody</p>
 */
public class CreatePersonalTodoTaskResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("createdTime")
    private Long createdTime;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("taskId")
    private String taskId;

    @com.aliyun.core.annotation.NameInMap("vendorRequestId")
    private String vendorRequestId;

    @com.aliyun.core.annotation.NameInMap("vendorType")
    private String vendorType;

    private CreatePersonalTodoTaskResponseBody(Builder builder) {
        this.createdTime = builder.createdTime;
        this.requestId = builder.requestId;
        this.taskId = builder.taskId;
        this.vendorRequestId = builder.vendorRequestId;
        this.vendorType = builder.vendorType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreatePersonalTodoTaskResponseBody create() {
        return builder().build();
    }

    /**
     * @return createdTime
     */
    public Long getCreatedTime() {
        return this.createdTime;
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
     * @return vendorRequestId
     */
    public String getVendorRequestId() {
        return this.vendorRequestId;
    }

    /**
     * @return vendorType
     */
    public String getVendorType() {
        return this.vendorType;
    }

    public static final class Builder {
        private Long createdTime; 
        private String requestId; 
        private String taskId; 
        private String vendorRequestId; 
        private String vendorType; 

        /**
         * createdTime.
         */
        public Builder createdTime(Long createdTime) {
            this.createdTime = createdTime;
            return this;
        }

        /**
         * requestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * taskId.
         */
        public Builder taskId(String taskId) {
            this.taskId = taskId;
            return this;
        }

        /**
         * vendorRequestId.
         */
        public Builder vendorRequestId(String vendorRequestId) {
            this.vendorRequestId = vendorRequestId;
            return this;
        }

        /**
         * vendorType.
         */
        public Builder vendorType(String vendorType) {
            this.vendorType = vendorType;
            return this;
        }

        public CreatePersonalTodoTaskResponseBody build() {
            return new CreatePersonalTodoTaskResponseBody(this);
        } 

    } 

}
