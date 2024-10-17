// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.arms20190808.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link GrafanaWorkspaceDashboardSync} extends {@link TeaModel}
 *
 * <p>GrafanaWorkspaceDashboardSync</p>
 */
public class GrafanaWorkspaceDashboardSync extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("dashboardTitle")
    private String dashboardTitle;

    @com.aliyun.core.annotation.NameInMap("dashboardURL")
    private String dashboardURL;

    @com.aliyun.core.annotation.NameInMap("dashboardUid")
    private String dashboardUid;

    @com.aliyun.core.annotation.NameInMap("folderId")
    private String folderId;

    @com.aliyun.core.annotation.NameInMap("folderTitle")
    private String folderTitle;

    @com.aliyun.core.annotation.NameInMap("folderURL")
    private String folderURL;

    @com.aliyun.core.annotation.NameInMap("folderUid")
    private String folderUid;

    @com.aliyun.core.annotation.NameInMap("orgId")
    private String orgId;

    @com.aliyun.core.annotation.NameInMap("orgName")
    private String orgName;

    @com.aliyun.core.annotation.NameInMap("type")
    private String type;

    private GrafanaWorkspaceDashboardSync(Builder builder) {
        this.dashboardTitle = builder.dashboardTitle;
        this.dashboardURL = builder.dashboardURL;
        this.dashboardUid = builder.dashboardUid;
        this.folderId = builder.folderId;
        this.folderTitle = builder.folderTitle;
        this.folderURL = builder.folderURL;
        this.folderUid = builder.folderUid;
        this.orgId = builder.orgId;
        this.orgName = builder.orgName;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GrafanaWorkspaceDashboardSync create() {
        return builder().build();
    }

    /**
     * @return dashboardTitle
     */
    public String getDashboardTitle() {
        return this.dashboardTitle;
    }

    /**
     * @return dashboardURL
     */
    public String getDashboardURL() {
        return this.dashboardURL;
    }

    /**
     * @return dashboardUid
     */
    public String getDashboardUid() {
        return this.dashboardUid;
    }

    /**
     * @return folderId
     */
    public String getFolderId() {
        return this.folderId;
    }

    /**
     * @return folderTitle
     */
    public String getFolderTitle() {
        return this.folderTitle;
    }

    /**
     * @return folderURL
     */
    public String getFolderURL() {
        return this.folderURL;
    }

    /**
     * @return folderUid
     */
    public String getFolderUid() {
        return this.folderUid;
    }

    /**
     * @return orgId
     */
    public String getOrgId() {
        return this.orgId;
    }

    /**
     * @return orgName
     */
    public String getOrgName() {
        return this.orgName;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    public static final class Builder {
        private String dashboardTitle; 
        private String dashboardURL; 
        private String dashboardUid; 
        private String folderId; 
        private String folderTitle; 
        private String folderURL; 
        private String folderUid; 
        private String orgId; 
        private String orgName; 
        private String type; 

        /**
         * dashboardTitle.
         */
        public Builder dashboardTitle(String dashboardTitle) {
            this.dashboardTitle = dashboardTitle;
            return this;
        }

        /**
         * dashboardURL.
         */
        public Builder dashboardURL(String dashboardURL) {
            this.dashboardURL = dashboardURL;
            return this;
        }

        /**
         * dashboardUid.
         */
        public Builder dashboardUid(String dashboardUid) {
            this.dashboardUid = dashboardUid;
            return this;
        }

        /**
         * folderId.
         */
        public Builder folderId(String folderId) {
            this.folderId = folderId;
            return this;
        }

        /**
         * folderTitle.
         */
        public Builder folderTitle(String folderTitle) {
            this.folderTitle = folderTitle;
            return this;
        }

        /**
         * folderURL.
         */
        public Builder folderURL(String folderURL) {
            this.folderURL = folderURL;
            return this;
        }

        /**
         * folderUid.
         */
        public Builder folderUid(String folderUid) {
            this.folderUid = folderUid;
            return this;
        }

        /**
         * orgId.
         */
        public Builder orgId(String orgId) {
            this.orgId = orgId;
            return this;
        }

        /**
         * orgName.
         */
        public Builder orgName(String orgName) {
            this.orgName = orgName;
            return this;
        }

        /**
         * type.
         */
        public Builder type(String type) {
            this.type = type;
            return this;
        }

        public GrafanaWorkspaceDashboardSync build() {
            return new GrafanaWorkspaceDashboardSync(this);
        } 

    } 

}
