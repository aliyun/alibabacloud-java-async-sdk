// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListFileProtectPluginStatusResponseBody} extends {@link TeaModel}
 *
 * <p>ListFileProtectPluginStatusResponseBody</p>
 */
public class ListFileProtectPluginStatusResponseBody extends TeaModel {
    @NameInMap("Data")
    private java.util.List < Data> data;

    @NameInMap("PageInfo")
    private PageInfo pageInfo;

    @NameInMap("RequestId")
    private String requestId;

    private ListFileProtectPluginStatusResponseBody(Builder builder) {
        this.data = builder.data;
        this.pageInfo = builder.pageInfo;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListFileProtectPluginStatusResponseBody create() {
        return builder().build();
    }

    /**
     * @return data
     */
    public java.util.List < Data> getData() {
        return this.data;
    }

    /**
     * @return pageInfo
     */
    public PageInfo getPageInfo() {
        return this.pageInfo;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List < Data> data; 
        private PageInfo pageInfo; 
        private String requestId; 

        /**
         * The data returned if the call is successful.
         */
        public Builder data(java.util.List < Data> data) {
            this.data = data;
            return this;
        }

        /**
         * The pagination information.
         */
        public Builder pageInfo(PageInfo pageInfo) {
            this.pageInfo = pageInfo;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListFileProtectPluginStatusResponseBody build() {
            return new ListFileProtectPluginStatusResponseBody(this);
        } 

    } 

    public static class Data extends TeaModel {
        @NameInMap("ClientVersion")
        private String clientVersion;

        @NameInMap("InstallCode")
        private String installCode;

        @NameInMap("InstallMessage")
        private String installMessage;

        @NameInMap("Installed")
        private Boolean installed;

        @NameInMap("InstanceName")
        private String instanceName;

        @NameInMap("InternetIp")
        private String internetIp;

        @NameInMap("IntranetIp")
        private String intranetIp;

        @NameInMap("Online")
        private Boolean online;

        @NameInMap("SupportFile")
        private Boolean supportFile;

        @NameInMap("Uuid")
        private String uuid;

        private Data(Builder builder) {
            this.clientVersion = builder.clientVersion;
            this.installCode = builder.installCode;
            this.installMessage = builder.installMessage;
            this.installed = builder.installed;
            this.instanceName = builder.instanceName;
            this.internetIp = builder.internetIp;
            this.intranetIp = builder.intranetIp;
            this.online = builder.online;
            this.supportFile = builder.supportFile;
            this.uuid = builder.uuid;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return clientVersion
         */
        public String getClientVersion() {
            return this.clientVersion;
        }

        /**
         * @return installCode
         */
        public String getInstallCode() {
            return this.installCode;
        }

        /**
         * @return installMessage
         */
        public String getInstallMessage() {
            return this.installMessage;
        }

        /**
         * @return installed
         */
        public Boolean getInstalled() {
            return this.installed;
        }

        /**
         * @return instanceName
         */
        public String getInstanceName() {
            return this.instanceName;
        }

        /**
         * @return internetIp
         */
        public String getInternetIp() {
            return this.internetIp;
        }

        /**
         * @return intranetIp
         */
        public String getIntranetIp() {
            return this.intranetIp;
        }

        /**
         * @return online
         */
        public Boolean getOnline() {
            return this.online;
        }

        /**
         * @return supportFile
         */
        public Boolean getSupportFile() {
            return this.supportFile;
        }

        /**
         * @return uuid
         */
        public String getUuid() {
            return this.uuid;
        }

        public static final class Builder {
            private String clientVersion; 
            private String installCode; 
            private String installMessage; 
            private Boolean installed; 
            private String instanceName; 
            private String internetIp; 
            private String intranetIp; 
            private Boolean online; 
            private Boolean supportFile; 
            private String uuid; 

            /**
             * The version of the Security Center agent.
             */
            public Builder clientVersion(String clientVersion) {
                this.clientVersion = clientVersion;
                return this;
            }

            /**
             * The returned code after you install the Security Center agent. Valid values:
             * <p>
             * 
             * 1.  0: The installation is successful.
             * 2.  \-2: The kernel does not support the installation.
             */
            public Builder installCode(String installCode) {
                this.installCode = installCode;
                return this;
            }

            /**
             * The returned message after you install the Security Center agent.
             */
            public Builder installMessage(String installMessage) {
                this.installMessage = installMessage;
                return this;
            }

            /**
             * Indicates whether the Security Center agent is installed.
             */
            public Builder installed(Boolean installed) {
                this.installed = installed;
                return this;
            }

            /**
             * The name of the instance.
             */
            public Builder instanceName(String instanceName) {
                this.instanceName = instanceName;
                return this;
            }

            /**
             * The public IP address that is associated with the instance.
             */
            public Builder internetIp(String internetIp) {
                this.internetIp = internetIp;
                return this;
            }

            /**
             * The private IP address that is associated with the instance.
             */
            public Builder intranetIp(String intranetIp) {
                this.intranetIp = intranetIp;
                return this;
            }

            /**
             * Indicates whether the Security Center agent is online. Valid value:
             * <p>
             * 
             * *   **true**
             * *   **false**
             */
            public Builder online(Boolean online) {
                this.online = online;
                return this;
            }

            /**
             * Indicates whether the core file monitoring file is supported.
             */
            public Builder supportFile(Boolean supportFile) {
                this.supportFile = supportFile;
                return this;
            }

            /**
             * The UUID of the asset.
             */
            public Builder uuid(String uuid) {
                this.uuid = uuid;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
    public static class PageInfo extends TeaModel {
        @NameInMap("CurrentPage")
        private Integer currentPage;

        @NameInMap("PageSize")
        private Integer pageSize;

        @NameInMap("TotalCount")
        private Integer totalCount;

        private PageInfo(Builder builder) {
            this.currentPage = builder.currentPage;
            this.pageSize = builder.pageSize;
            this.totalCount = builder.totalCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PageInfo create() {
            return builder().build();
        }

        /**
         * @return currentPage
         */
        public Integer getCurrentPage() {
            return this.currentPage;
        }

        /**
         * @return pageSize
         */
        public Integer getPageSize() {
            return this.pageSize;
        }

        /**
         * @return totalCount
         */
        public Integer getTotalCount() {
            return this.totalCount;
        }

        public static final class Builder {
            private Integer currentPage; 
            private Integer pageSize; 
            private Integer totalCount; 

            /**
             * The page number.
             */
            public Builder currentPage(Integer currentPage) {
                this.currentPage = currentPage;
                return this;
            }

            /**
             * The number of entries per page.
             */
            public Builder pageSize(Integer pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            /**
             * The total number of entries returned.
             */
            public Builder totalCount(Integer totalCount) {
                this.totalCount = totalCount;
                return this;
            }

            public PageInfo build() {
                return new PageInfo(this);
            } 

        } 

    }
}
