// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pds20220301.models;

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
 * {@link AuditLog} extends {@link TeaModel}
 *
 * <p>AuditLog</p>
 */
public class AuditLog extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("acted_at")
    private String actedAt;

    @com.aliyun.core.annotation.NameInMap("action_category")
    private String actionCategory;

    @com.aliyun.core.annotation.NameInMap("action_type")
    private String actionType;

    @com.aliyun.core.annotation.NameInMap("actor_id")
    private String actorId;

    @com.aliyun.core.annotation.NameInMap("actor_name")
    private String actorName;

    @com.aliyun.core.annotation.NameInMap("actor_type")
    private String actorType;

    @com.aliyun.core.annotation.NameInMap("client_device")
    private String clientDevice;

    @com.aliyun.core.annotation.NameInMap("client_ip")
    private String clientIp;

    @com.aliyun.core.annotation.NameInMap("client_type")
    private String clientType;

    @com.aliyun.core.annotation.NameInMap("client_version")
    private String clientVersion;

    @com.aliyun.core.annotation.NameInMap("detail")
    private AuditLogDetail detail;

    @com.aliyun.core.annotation.NameInMap("file_path_type")
    private String filePathType;

    @com.aliyun.core.annotation.NameInMap("log_id")
    private String logId;

    @com.aliyun.core.annotation.NameInMap("object_id")
    private String objectId;

    @com.aliyun.core.annotation.NameInMap("object_name")
    private String objectName;

    private AuditLog(Builder builder) {
        this.actedAt = builder.actedAt;
        this.actionCategory = builder.actionCategory;
        this.actionType = builder.actionType;
        this.actorId = builder.actorId;
        this.actorName = builder.actorName;
        this.actorType = builder.actorType;
        this.clientDevice = builder.clientDevice;
        this.clientIp = builder.clientIp;
        this.clientType = builder.clientType;
        this.clientVersion = builder.clientVersion;
        this.detail = builder.detail;
        this.filePathType = builder.filePathType;
        this.logId = builder.logId;
        this.objectId = builder.objectId;
        this.objectName = builder.objectName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AuditLog create() {
        return builder().build();
    }

    /**
     * @return actedAt
     */
    public String getActedAt() {
        return this.actedAt;
    }

    /**
     * @return actionCategory
     */
    public String getActionCategory() {
        return this.actionCategory;
    }

    /**
     * @return actionType
     */
    public String getActionType() {
        return this.actionType;
    }

    /**
     * @return actorId
     */
    public String getActorId() {
        return this.actorId;
    }

    /**
     * @return actorName
     */
    public String getActorName() {
        return this.actorName;
    }

    /**
     * @return actorType
     */
    public String getActorType() {
        return this.actorType;
    }

    /**
     * @return clientDevice
     */
    public String getClientDevice() {
        return this.clientDevice;
    }

    /**
     * @return clientIp
     */
    public String getClientIp() {
        return this.clientIp;
    }

    /**
     * @return clientType
     */
    public String getClientType() {
        return this.clientType;
    }

    /**
     * @return clientVersion
     */
    public String getClientVersion() {
        return this.clientVersion;
    }

    /**
     * @return detail
     */
    public AuditLogDetail getDetail() {
        return this.detail;
    }

    /**
     * @return filePathType
     */
    public String getFilePathType() {
        return this.filePathType;
    }

    /**
     * @return logId
     */
    public String getLogId() {
        return this.logId;
    }

    /**
     * @return objectId
     */
    public String getObjectId() {
        return this.objectId;
    }

    /**
     * @return objectName
     */
    public String getObjectName() {
        return this.objectName;
    }

    public static final class Builder {
        private String actedAt; 
        private String actionCategory; 
        private String actionType; 
        private String actorId; 
        private String actorName; 
        private String actorType; 
        private String clientDevice; 
        private String clientIp; 
        private String clientType; 
        private String clientVersion; 
        private AuditLogDetail detail; 
        private String filePathType; 
        private String logId; 
        private String objectId; 
        private String objectName; 

        /**
         * acted_at.
         */
        public Builder actedAt(String actedAt) {
            this.actedAt = actedAt;
            return this;
        }

        /**
         * action_category.
         */
        public Builder actionCategory(String actionCategory) {
            this.actionCategory = actionCategory;
            return this;
        }

        /**
         * action_type.
         */
        public Builder actionType(String actionType) {
            this.actionType = actionType;
            return this;
        }

        /**
         * actor_id.
         */
        public Builder actorId(String actorId) {
            this.actorId = actorId;
            return this;
        }

        /**
         * actor_name.
         */
        public Builder actorName(String actorName) {
            this.actorName = actorName;
            return this;
        }

        /**
         * actor_type.
         */
        public Builder actorType(String actorType) {
            this.actorType = actorType;
            return this;
        }

        /**
         * client_device.
         */
        public Builder clientDevice(String clientDevice) {
            this.clientDevice = clientDevice;
            return this;
        }

        /**
         * client_ip.
         */
        public Builder clientIp(String clientIp) {
            this.clientIp = clientIp;
            return this;
        }

        /**
         * client_type.
         */
        public Builder clientType(String clientType) {
            this.clientType = clientType;
            return this;
        }

        /**
         * client_version.
         */
        public Builder clientVersion(String clientVersion) {
            this.clientVersion = clientVersion;
            return this;
        }

        /**
         * detail.
         */
        public Builder detail(AuditLogDetail detail) {
            this.detail = detail;
            return this;
        }

        /**
         * file_path_type.
         */
        public Builder filePathType(String filePathType) {
            this.filePathType = filePathType;
            return this;
        }

        /**
         * log_id.
         */
        public Builder logId(String logId) {
            this.logId = logId;
            return this;
        }

        /**
         * object_id.
         */
        public Builder objectId(String objectId) {
            this.objectId = objectId;
            return this;
        }

        /**
         * object_name.
         */
        public Builder objectName(String objectName) {
            this.objectName = objectName;
            return this;
        }

        public AuditLog build() {
            return new AuditLog(this);
        } 

    } 

}
