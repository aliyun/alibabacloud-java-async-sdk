// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.green20220926.models;

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
 * {@link CreateOnlineTestResponseBody} extends {@link TeaModel}
 *
 * <p>CreateOnlineTestResponseBody</p>
 */
public class CreateOnlineTestResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("ServiceCode")
    private String serviceCode;

    @com.aliyun.core.annotation.NameInMap("TaskId")
    private String taskId;

    @com.aliyun.core.annotation.NameInMap("TaskStatus")
    private String taskStatus;

    @com.aliyun.core.annotation.NameInMap("Url")
    private String url;

    private CreateOnlineTestResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.serviceCode = builder.serviceCode;
        this.taskId = builder.taskId;
        this.taskStatus = builder.taskStatus;
        this.url = builder.url;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateOnlineTestResponseBody create() {
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
     * @return serviceCode
     */
    public String getServiceCode() {
        return this.serviceCode;
    }

    /**
     * @return taskId
     */
    public String getTaskId() {
        return this.taskId;
    }

    /**
     * @return taskStatus
     */
    public String getTaskStatus() {
        return this.taskStatus;
    }

    /**
     * @return url
     */
    public String getUrl() {
        return this.url;
    }

    public static final class Builder {
        private String requestId; 
        private String serviceCode; 
        private String taskId; 
        private String taskStatus; 
        private String url; 

        private Builder() {
        } 

        private Builder(CreateOnlineTestResponseBody model) {
            this.requestId = model.requestId;
            this.serviceCode = model.serviceCode;
            this.taskId = model.taskId;
            this.taskStatus = model.taskStatus;
            this.url = model.url;
        } 

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * ServiceCode.
         */
        public Builder serviceCode(String serviceCode) {
            this.serviceCode = serviceCode;
            return this;
        }

        /**
         * TaskId.
         */
        public Builder taskId(String taskId) {
            this.taskId = taskId;
            return this;
        }

        /**
         * TaskStatus.
         */
        public Builder taskStatus(String taskStatus) {
            this.taskStatus = taskStatus;
            return this;
        }

        /**
         * Url.
         */
        public Builder url(String url) {
            this.url = url;
            return this;
        }

        public CreateOnlineTestResponseBody build() {
            return new CreateOnlineTestResponseBody(this);
        } 

    } 

}
