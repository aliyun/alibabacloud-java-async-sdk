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
         * <p>ID assigned by the backend, used to uniquely identify a request. Can be used for troubleshooting.</p>
         * 
         * <strong>example:</strong>
         * <p>AAAAAA-BBBB-CCCCC-DDDD-EEEEEEEE****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Service Code</p>
         * 
         * <strong>example:</strong>
         * <p>VideoModeration</p>
         */
        public Builder serviceCode(String serviceCode) {
            this.serviceCode = serviceCode;
            return this;
        }

        /**
         * <p>Detection Task ID</p>
         * 
         * <strong>example:</strong>
         * <p>xxxxx-xxxxx</p>
         */
        public Builder taskId(String taskId) {
            this.taskId = taskId;
            return this;
        }

        /**
         * <p>Detection Status</p>
         * 
         * <strong>example:</strong>
         * <p>SUCCESS</p>
         */
        public Builder taskStatus(String taskStatus) {
            this.taskStatus = taskStatus;
            return this;
        }

        /**
         * <p>Detection URL</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://xxxxxxxxxx.com/data/data.png">https://xxxxxxxxxx.com/data/data.png</a></p>
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
