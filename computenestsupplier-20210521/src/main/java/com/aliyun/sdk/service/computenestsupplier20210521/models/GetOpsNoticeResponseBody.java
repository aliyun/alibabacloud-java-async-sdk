// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.computenestsupplier20210521.models;

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
 * {@link GetOpsNoticeResponseBody} extends {@link TeaModel}
 *
 * <p>GetOpsNoticeResponseBody</p>
 */
public class GetOpsNoticeResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Attributes")
    private String attributes;

    @com.aliyun.core.annotation.NameInMap("Category")
    private String category;

    @com.aliyun.core.annotation.NameInMap("Content")
    private String content;

    @com.aliyun.core.annotation.NameInMap("NoticeId")
    private String noticeId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("ServiceId")
    private String serviceId;

    @com.aliyun.core.annotation.NameInMap("ServiceInstanceCount")
    private String serviceInstanceCount;

    @com.aliyun.core.annotation.NameInMap("ServiceName")
    private String serviceName;

    @com.aliyun.core.annotation.NameInMap("ServiceVersions")
    private java.util.List<String> serviceVersions;

    @com.aliyun.core.annotation.NameInMap("Severity")
    private String severity;

    @com.aliyun.core.annotation.NameInMap("Solutions")
    private String solutions;

    @com.aliyun.core.annotation.NameInMap("StartTime")
    private String startTime;

    @com.aliyun.core.annotation.NameInMap("Success")
    private String success;

    @com.aliyun.core.annotation.NameInMap("Type")
    private String type;

    @com.aliyun.core.annotation.NameInMap("UserCount")
    private String userCount;

    private GetOpsNoticeResponseBody(Builder builder) {
        this.attributes = builder.attributes;
        this.category = builder.category;
        this.content = builder.content;
        this.noticeId = builder.noticeId;
        this.requestId = builder.requestId;
        this.serviceId = builder.serviceId;
        this.serviceInstanceCount = builder.serviceInstanceCount;
        this.serviceName = builder.serviceName;
        this.serviceVersions = builder.serviceVersions;
        this.severity = builder.severity;
        this.solutions = builder.solutions;
        this.startTime = builder.startTime;
        this.success = builder.success;
        this.type = builder.type;
        this.userCount = builder.userCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetOpsNoticeResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return attributes
     */
    public String getAttributes() {
        return this.attributes;
    }

    /**
     * @return category
     */
    public String getCategory() {
        return this.category;
    }

    /**
     * @return content
     */
    public String getContent() {
        return this.content;
    }

    /**
     * @return noticeId
     */
    public String getNoticeId() {
        return this.noticeId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return serviceId
     */
    public String getServiceId() {
        return this.serviceId;
    }

    /**
     * @return serviceInstanceCount
     */
    public String getServiceInstanceCount() {
        return this.serviceInstanceCount;
    }

    /**
     * @return serviceName
     */
    public String getServiceName() {
        return this.serviceName;
    }

    /**
     * @return serviceVersions
     */
    public java.util.List<String> getServiceVersions() {
        return this.serviceVersions;
    }

    /**
     * @return severity
     */
    public String getSeverity() {
        return this.severity;
    }

    /**
     * @return solutions
     */
    public String getSolutions() {
        return this.solutions;
    }

    /**
     * @return startTime
     */
    public String getStartTime() {
        return this.startTime;
    }

    /**
     * @return success
     */
    public String getSuccess() {
        return this.success;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    /**
     * @return userCount
     */
    public String getUserCount() {
        return this.userCount;
    }

    public static final class Builder {
        private String attributes; 
        private String category; 
        private String content; 
        private String noticeId; 
        private String requestId; 
        private String serviceId; 
        private String serviceInstanceCount; 
        private String serviceName; 
        private java.util.List<String> serviceVersions; 
        private String severity; 
        private String solutions; 
        private String startTime; 
        private String success; 
        private String type; 
        private String userCount; 

        private Builder() {
        } 

        private Builder(GetOpsNoticeResponseBody model) {
            this.attributes = model.attributes;
            this.category = model.category;
            this.content = model.content;
            this.noticeId = model.noticeId;
            this.requestId = model.requestId;
            this.serviceId = model.serviceId;
            this.serviceInstanceCount = model.serviceInstanceCount;
            this.serviceName = model.serviceName;
            this.serviceVersions = model.serviceVersions;
            this.severity = model.severity;
            this.solutions = model.solutions;
            this.startTime = model.startTime;
            this.success = model.success;
            this.type = model.type;
            this.userCount = model.userCount;
        } 

        /**
         * Attributes.
         */
        public Builder attributes(String attributes) {
            this.attributes = attributes;
            return this;
        }

        /**
         * Category.
         */
        public Builder category(String category) {
            this.category = category;
            return this;
        }

        /**
         * Content.
         */
        public Builder content(String content) {
            this.content = content;
            return this;
        }

        /**
         * NoticeId.
         */
        public Builder noticeId(String noticeId) {
            this.noticeId = noticeId;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * ServiceId.
         */
        public Builder serviceId(String serviceId) {
            this.serviceId = serviceId;
            return this;
        }

        /**
         * ServiceInstanceCount.
         */
        public Builder serviceInstanceCount(String serviceInstanceCount) {
            this.serviceInstanceCount = serviceInstanceCount;
            return this;
        }

        /**
         * ServiceName.
         */
        public Builder serviceName(String serviceName) {
            this.serviceName = serviceName;
            return this;
        }

        /**
         * ServiceVersions.
         */
        public Builder serviceVersions(java.util.List<String> serviceVersions) {
            this.serviceVersions = serviceVersions;
            return this;
        }

        /**
         * Severity.
         */
        public Builder severity(String severity) {
            this.severity = severity;
            return this;
        }

        /**
         * Solutions.
         */
        public Builder solutions(String solutions) {
            this.solutions = solutions;
            return this;
        }

        /**
         * StartTime.
         */
        public Builder startTime(String startTime) {
            this.startTime = startTime;
            return this;
        }

        /**
         * Success.
         */
        public Builder success(String success) {
            this.success = success;
            return this;
        }

        /**
         * Type.
         */
        public Builder type(String type) {
            this.type = type;
            return this;
        }

        /**
         * UserCount.
         */
        public Builder userCount(String userCount) {
            this.userCount = userCount;
            return this;
        }

        public GetOpsNoticeResponseBody build() {
            return new GetOpsNoticeResponseBody(this);
        } 

    } 

}
