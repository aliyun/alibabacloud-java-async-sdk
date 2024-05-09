// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.arms20190808.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GrafanaWorkspaceIniBackup} extends {@link TeaModel}
 *
 * <p>GrafanaWorkspaceIniBackup</p>
 */
public class GrafanaWorkspaceIniBackup extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ext")
    private String ext;

    @com.aliyun.core.annotation.NameInMap("gmtCreate")
    private Long gmtCreate;

    @com.aliyun.core.annotation.NameInMap("gmtModified")
    private Long gmtModified;

    @com.aliyun.core.annotation.NameInMap("grafanaWorkspaceId")
    private String grafanaWorkspaceId;

    @com.aliyun.core.annotation.NameInMap("id")
    private Long id;

    @com.aliyun.core.annotation.NameInMap("msg")
    private String msg;

    @com.aliyun.core.annotation.NameInMap("processName")
    private String processName;

    @com.aliyun.core.annotation.NameInMap("processStatus")
    private String processStatus;

    @com.aliyun.core.annotation.NameInMap("subType")
    private String subType;

    @com.aliyun.core.annotation.NameInMap("userId")
    private String userId;

    private GrafanaWorkspaceIniBackup(Builder builder) {
        this.ext = builder.ext;
        this.gmtCreate = builder.gmtCreate;
        this.gmtModified = builder.gmtModified;
        this.grafanaWorkspaceId = builder.grafanaWorkspaceId;
        this.id = builder.id;
        this.msg = builder.msg;
        this.processName = builder.processName;
        this.processStatus = builder.processStatus;
        this.subType = builder.subType;
        this.userId = builder.userId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GrafanaWorkspaceIniBackup create() {
        return builder().build();
    }

    /**
     * @return ext
     */
    public String getExt() {
        return this.ext;
    }

    /**
     * @return gmtCreate
     */
    public Long getGmtCreate() {
        return this.gmtCreate;
    }

    /**
     * @return gmtModified
     */
    public Long getGmtModified() {
        return this.gmtModified;
    }

    /**
     * @return grafanaWorkspaceId
     */
    public String getGrafanaWorkspaceId() {
        return this.grafanaWorkspaceId;
    }

    /**
     * @return id
     */
    public Long getId() {
        return this.id;
    }

    /**
     * @return msg
     */
    public String getMsg() {
        return this.msg;
    }

    /**
     * @return processName
     */
    public String getProcessName() {
        return this.processName;
    }

    /**
     * @return processStatus
     */
    public String getProcessStatus() {
        return this.processStatus;
    }

    /**
     * @return subType
     */
    public String getSubType() {
        return this.subType;
    }

    /**
     * @return userId
     */
    public String getUserId() {
        return this.userId;
    }

    public static final class Builder {
        private String ext; 
        private Long gmtCreate; 
        private Long gmtModified; 
        private String grafanaWorkspaceId; 
        private Long id; 
        private String msg; 
        private String processName; 
        private String processStatus; 
        private String subType; 
        private String userId; 

        /**
         * ext.
         */
        public Builder ext(String ext) {
            this.ext = ext;
            return this;
        }

        /**
         * gmtCreate.
         */
        public Builder gmtCreate(Long gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }

        /**
         * gmtModified.
         */
        public Builder gmtModified(Long gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }

        /**
         * grafanaWorkspaceId.
         */
        public Builder grafanaWorkspaceId(String grafanaWorkspaceId) {
            this.grafanaWorkspaceId = grafanaWorkspaceId;
            return this;
        }

        /**
         * id.
         */
        public Builder id(Long id) {
            this.id = id;
            return this;
        }

        /**
         * msg.
         */
        public Builder msg(String msg) {
            this.msg = msg;
            return this;
        }

        /**
         * processName.
         */
        public Builder processName(String processName) {
            this.processName = processName;
            return this;
        }

        /**
         * processStatus.
         */
        public Builder processStatus(String processStatus) {
            this.processStatus = processStatus;
            return this;
        }

        /**
         * subType.
         */
        public Builder subType(String subType) {
            this.subType = subType;
            return this;
        }

        /**
         * userId.
         */
        public Builder userId(String userId) {
            this.userId = userId;
            return this;
        }

        public GrafanaWorkspaceIniBackup build() {
            return new GrafanaWorkspaceIniBackup(this);
        } 

    } 

}
