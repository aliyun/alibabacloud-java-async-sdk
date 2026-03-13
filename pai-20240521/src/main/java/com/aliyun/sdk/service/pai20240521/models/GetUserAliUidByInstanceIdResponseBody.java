// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pai20240521.models;

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
 * {@link GetUserAliUidByInstanceIdResponseBody} extends {@link TeaModel}
 *
 * <p>GetUserAliUidByInstanceIdResponseBody</p>
 */
public class GetUserAliUidByInstanceIdResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ApplicationId")
    private String applicationId;

    @com.aliyun.core.annotation.NameInMap("ApplicationName")
    private String applicationName;

    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Cpus")
    private Long cpus;

    @com.aliyun.core.annotation.NameInMap("CreateTime")
    private Long createTime;

    @com.aliyun.core.annotation.NameInMap("IntranetIp")
    private String intranetIp;

    @com.aliyun.core.annotation.NameInMap("Memory")
    private Long memory;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("NamespaceId")
    private String namespaceId;

    @com.aliyun.core.annotation.NameInMap("PodName")
    private String podName;

    @com.aliyun.core.annotation.NameInMap("PodUid")
    private String podUid;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("ResouceType")
    private String resouceType;

    @com.aliyun.core.annotation.NameInMap("ResourceInstanceId")
    private String resourceInstanceId;

    @com.aliyun.core.annotation.NameInMap("Status")
    private String status;

    @com.aliyun.core.annotation.NameInMap("UpdateTime")
    private Long updateTime;

    @com.aliyun.core.annotation.NameInMap("UserUid")
    private String userUid;

    private GetUserAliUidByInstanceIdResponseBody(Builder builder) {
        this.applicationId = builder.applicationId;
        this.applicationName = builder.applicationName;
        this.code = builder.code;
        this.cpus = builder.cpus;
        this.createTime = builder.createTime;
        this.intranetIp = builder.intranetIp;
        this.memory = builder.memory;
        this.message = builder.message;
        this.namespaceId = builder.namespaceId;
        this.podName = builder.podName;
        this.podUid = builder.podUid;
        this.requestId = builder.requestId;
        this.resouceType = builder.resouceType;
        this.resourceInstanceId = builder.resourceInstanceId;
        this.status = builder.status;
        this.updateTime = builder.updateTime;
        this.userUid = builder.userUid;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetUserAliUidByInstanceIdResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return applicationId
     */
    public String getApplicationId() {
        return this.applicationId;
    }

    /**
     * @return applicationName
     */
    public String getApplicationName() {
        return this.applicationName;
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return cpus
     */
    public Long getCpus() {
        return this.cpus;
    }

    /**
     * @return createTime
     */
    public Long getCreateTime() {
        return this.createTime;
    }

    /**
     * @return intranetIp
     */
    public String getIntranetIp() {
        return this.intranetIp;
    }

    /**
     * @return memory
     */
    public Long getMemory() {
        return this.memory;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return namespaceId
     */
    public String getNamespaceId() {
        return this.namespaceId;
    }

    /**
     * @return podName
     */
    public String getPodName() {
        return this.podName;
    }

    /**
     * @return podUid
     */
    public String getPodUid() {
        return this.podUid;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return resouceType
     */
    public String getResouceType() {
        return this.resouceType;
    }

    /**
     * @return resourceInstanceId
     */
    public String getResourceInstanceId() {
        return this.resourceInstanceId;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * @return updateTime
     */
    public Long getUpdateTime() {
        return this.updateTime;
    }

    /**
     * @return userUid
     */
    public String getUserUid() {
        return this.userUid;
    }

    public static final class Builder {
        private String applicationId; 
        private String applicationName; 
        private String code; 
        private Long cpus; 
        private Long createTime; 
        private String intranetIp; 
        private Long memory; 
        private String message; 
        private String namespaceId; 
        private String podName; 
        private String podUid; 
        private String requestId; 
        private String resouceType; 
        private String resourceInstanceId; 
        private String status; 
        private Long updateTime; 
        private String userUid; 

        private Builder() {
        } 

        private Builder(GetUserAliUidByInstanceIdResponseBody model) {
            this.applicationId = model.applicationId;
            this.applicationName = model.applicationName;
            this.code = model.code;
            this.cpus = model.cpus;
            this.createTime = model.createTime;
            this.intranetIp = model.intranetIp;
            this.memory = model.memory;
            this.message = model.message;
            this.namespaceId = model.namespaceId;
            this.podName = model.podName;
            this.podUid = model.podUid;
            this.requestId = model.requestId;
            this.resouceType = model.resouceType;
            this.resourceInstanceId = model.resourceInstanceId;
            this.status = model.status;
            this.updateTime = model.updateTime;
            this.userUid = model.userUid;
        } 

        /**
         * ApplicationId.
         */
        public Builder applicationId(String applicationId) {
            this.applicationId = applicationId;
            return this;
        }

        /**
         * ApplicationName.
         */
        public Builder applicationName(String applicationName) {
            this.applicationName = applicationName;
            return this;
        }

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * Cpus.
         */
        public Builder cpus(Long cpus) {
            this.cpus = cpus;
            return this;
        }

        /**
         * CreateTime.
         */
        public Builder createTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }

        /**
         * IntranetIp.
         */
        public Builder intranetIp(String intranetIp) {
            this.intranetIp = intranetIp;
            return this;
        }

        /**
         * Memory.
         */
        public Builder memory(Long memory) {
            this.memory = memory;
            return this;
        }

        /**
         * Message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * NamespaceId.
         */
        public Builder namespaceId(String namespaceId) {
            this.namespaceId = namespaceId;
            return this;
        }

        /**
         * PodName.
         */
        public Builder podName(String podName) {
            this.podName = podName;
            return this;
        }

        /**
         * PodUid.
         */
        public Builder podUid(String podUid) {
            this.podUid = podUid;
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
         * ResouceType.
         */
        public Builder resouceType(String resouceType) {
            this.resouceType = resouceType;
            return this;
        }

        /**
         * ResourceInstanceId.
         */
        public Builder resourceInstanceId(String resourceInstanceId) {
            this.resourceInstanceId = resourceInstanceId;
            return this;
        }

        /**
         * Status.
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        /**
         * UpdateTime.
         */
        public Builder updateTime(Long updateTime) {
            this.updateTime = updateTime;
            return this;
        }

        /**
         * UserUid.
         */
        public Builder userUid(String userUid) {
            this.userUid = userUid;
            return this;
        }

        public GetUserAliUidByInstanceIdResponseBody build() {
            return new GetUserAliUidByInstanceIdResponseBody(this);
        } 

    } 

}
