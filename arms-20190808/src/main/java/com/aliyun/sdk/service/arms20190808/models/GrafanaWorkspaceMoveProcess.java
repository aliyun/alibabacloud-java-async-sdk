// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.arms20190808.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GrafanaWorkspaceMoveProcess} extends {@link TeaModel}
 *
 * <p>GrafanaWorkspaceMoveProcess</p>
 */
public class GrafanaWorkspaceMoveProcess extends TeaModel {
    @NameInMap("gmtCreate")
    private Long gmtCreate;

    @NameInMap("gmtModified")
    private Long gmtModified;

    @NameInMap("grafanaWorkspaceId")
    private String grafanaWorkspaceId;

    @NameInMap("id")
    private Long id;

    @NameInMap("msg")
    private String msg;

    @NameInMap("processName")
    private String processName;

    @NameInMap("processStatus")
    private String processStatus;

    @NameInMap("subType")
    private String subType;

    @NameInMap("userId")
    private String userId;

    private GrafanaWorkspaceMoveProcess(Builder builder) {
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

    public static GrafanaWorkspaceMoveProcess create() {
        return builder().build();
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

        public GrafanaWorkspaceMoveProcess build() {
            return new GrafanaWorkspaceMoveProcess(this);
        } 

    } 

}
