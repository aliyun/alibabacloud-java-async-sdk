// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pai_dlc20201203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link Workspace} extends {@link TeaModel}
 *
 * <p>Workspace</p>
 */
public class Workspace extends TeaModel {
    @NameInMap("Creator")
    private String creator;

    @NameInMap("GmtCreateTime")
    private String gmtCreateTime;

    @NameInMap("GmtModifyTime")
    private String gmtModifyTime;

    @NameInMap("Members")
    private java.util.List < Member > members;

    @NameInMap("Quotas")
    private java.util.List < Quota > quotas;

    @NameInMap("TotalResources")
    private Resources totalResources;

    @NameInMap("WorkspaceAdmins")
    private java.util.List < Member > workspaceAdmins;

    @NameInMap("WorkspaceId")
    private String workspaceId;

    @NameInMap("WorkspaceName")
    private String workspaceName;

    private Workspace(Builder builder) {
        this.creator = builder.creator;
        this.gmtCreateTime = builder.gmtCreateTime;
        this.gmtModifyTime = builder.gmtModifyTime;
        this.members = builder.members;
        this.quotas = builder.quotas;
        this.totalResources = builder.totalResources;
        this.workspaceAdmins = builder.workspaceAdmins;
        this.workspaceId = builder.workspaceId;
        this.workspaceName = builder.workspaceName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Workspace create() {
        return builder().build();
    }

    /**
     * @return creator
     */
    public String getCreator() {
        return this.creator;
    }

    /**
     * @return gmtCreateTime
     */
    public String getGmtCreateTime() {
        return this.gmtCreateTime;
    }

    /**
     * @return gmtModifyTime
     */
    public String getGmtModifyTime() {
        return this.gmtModifyTime;
    }

    /**
     * @return members
     */
    public java.util.List < Member > getMembers() {
        return this.members;
    }

    /**
     * @return quotas
     */
    public java.util.List < Quota > getQuotas() {
        return this.quotas;
    }

    /**
     * @return totalResources
     */
    public Resources getTotalResources() {
        return this.totalResources;
    }

    /**
     * @return workspaceAdmins
     */
    public java.util.List < Member > getWorkspaceAdmins() {
        return this.workspaceAdmins;
    }

    /**
     * @return workspaceId
     */
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    /**
     * @return workspaceName
     */
    public String getWorkspaceName() {
        return this.workspaceName;
    }

    public static final class Builder {
        private String creator; 
        private String gmtCreateTime; 
        private String gmtModifyTime; 
        private java.util.List < Member > members; 
        private java.util.List < Quota > quotas; 
        private Resources totalResources; 
        private java.util.List < Member > workspaceAdmins; 
        private String workspaceId; 
        private String workspaceName; 

        /**
         * Creator.
         */
        public Builder creator(String creator) {
            this.creator = creator;
            return this;
        }

        /**
         * GmtCreateTime.
         */
        public Builder gmtCreateTime(String gmtCreateTime) {
            this.gmtCreateTime = gmtCreateTime;
            return this;
        }

        /**
         * GmtModifyTime.
         */
        public Builder gmtModifyTime(String gmtModifyTime) {
            this.gmtModifyTime = gmtModifyTime;
            return this;
        }

        /**
         * Members.
         */
        public Builder members(java.util.List < Member > members) {
            this.members = members;
            return this;
        }

        /**
         * Quotas.
         */
        public Builder quotas(java.util.List < Quota > quotas) {
            this.quotas = quotas;
            return this;
        }

        /**
         * TotalResources.
         */
        public Builder totalResources(Resources totalResources) {
            this.totalResources = totalResources;
            return this;
        }

        /**
         * WorkspaceAdmins.
         */
        public Builder workspaceAdmins(java.util.List < Member > workspaceAdmins) {
            this.workspaceAdmins = workspaceAdmins;
            return this;
        }

        /**
         * WorkspaceId.
         */
        public Builder workspaceId(String workspaceId) {
            this.workspaceId = workspaceId;
            return this;
        }

        /**
         * WorkspaceName.
         */
        public Builder workspaceName(String workspaceName) {
            this.workspaceName = workspaceName;
            return this;
        }

        public Workspace build() {
            return new Workspace(this);
        } 

    } 

}
