// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ListFileProtectPluginStatusResponseBody} extends {@link TeaModel}
 *
 * <p>ListFileProtectPluginStatusResponseBody</p>
 */
public class ListFileProtectPluginStatusResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private java.util.List < Data> data;

    @com.aliyun.core.annotation.NameInMap("PageInfo")
    private PageInfo pageInfo;

    @com.aliyun.core.annotation.NameInMap("RequestId")
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
         * <p>The data returned if the call is successful.</p>
         */
        public Builder data(java.util.List < Data> data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The pagination information.</p>
         */
        public Builder pageInfo(PageInfo pageInfo) {
            this.pageInfo = pageInfo;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>60F289EC-BAA3-5DF1-8476-B3F05A14EBC2</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListFileProtectPluginStatusResponseBody build() {
            return new ListFileProtectPluginStatusResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListFileProtectPluginStatusResponseBody} extends {@link TeaModel}
     *
     * <p>ListFileProtectPluginStatusResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ClientVersion")
        private String clientVersion;

        @com.aliyun.core.annotation.NameInMap("InstallCode")
        private String installCode;

        @com.aliyun.core.annotation.NameInMap("InstallMessage")
        private String installMessage;

        @com.aliyun.core.annotation.NameInMap("Installed")
        private Boolean installed;

        @com.aliyun.core.annotation.NameInMap("InstanceName")
        private String instanceName;

        @com.aliyun.core.annotation.NameInMap("InternetIp")
        private String internetIp;

        @com.aliyun.core.annotation.NameInMap("IntranetIp")
        private String intranetIp;

        @com.aliyun.core.annotation.NameInMap("Online")
        private Boolean online;

        @com.aliyun.core.annotation.NameInMap("Platform")
        private String platform;

        @com.aliyun.core.annotation.NameInMap("SupportFile")
        private Boolean supportFile;

        @com.aliyun.core.annotation.NameInMap("Uuid")
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
            this.platform = builder.platform;
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
         * @return platform
         */
        public String getPlatform() {
            return this.platform;
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
            private String platform; 
            private Boolean supportFile; 
            private String uuid; 

            /**
             * <p>The version of the Security Center agent.</p>
             * 
             * <strong>example:</strong>
             * <p>00_41</p>
             */
            public Builder clientVersion(String clientVersion) {
                this.clientVersion = clientVersion;
                return this;
            }

            /**
             * <p>The returned code after you install the Security Center agent. Valid values:</p>
             * <ol>
             * <li>0: The installation is successful.</li>
             * <li>-2: The kernel does not support the installation.</li>
             * </ol>
             * 
             * <strong>example:</strong>
             * <p>-2</p>
             */
            public Builder installCode(String installCode) {
                this.installCode = installCode;
                return this;
            }

            /**
             * <p>The returned message after you install the Security Center agent.</p>
             * 
             * <strong>example:</strong>
             * <p>driver file not exist</p>
             */
            public Builder installMessage(String installMessage) {
                this.installMessage = installMessage;
                return this;
            }

            /**
             * <p>Indicates whether the Security Center agent is installed.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder installed(Boolean installed) {
                this.installed = installed;
                return this;
            }

            /**
             * <p>The name of the instance.</p>
             * 
             * <strong>example:</strong>
             * <p>i-wz92q7m5hsbgfhdss***</p>
             */
            public Builder instanceName(String instanceName) {
                this.instanceName = instanceName;
                return this;
            }

            /**
             * <p>The public IP address that is associated with the instance.</p>
             * 
             * <strong>example:</strong>
             * <p>172.16.XX.XX</p>
             */
            public Builder internetIp(String internetIp) {
                this.internetIp = internetIp;
                return this;
            }

            /**
             * <p>The private IP address that is associated with the instance.</p>
             * 
             * <strong>example:</strong>
             * <p>10.42.XX.XX</p>
             */
            public Builder intranetIp(String intranetIp) {
                this.intranetIp = intranetIp;
                return this;
            }

            /**
             * <p>Indicates whether the Security Center agent is online. Valid value:</p>
             * <ul>
             * <li><strong>true</strong></li>
             * <li><strong>false</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder online(Boolean online) {
                this.online = online;
                return this;
            }

            /**
             * <p>The type of the operating system. Valid values:</p>
             * <ul>
             * <li><strong>windows</strong>: Windows</li>
             * <li><strong>linux</strong>: Linux</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>linux</p>
             */
            public Builder platform(String platform) {
                this.platform = platform;
                return this;
            }

            /**
             * <p>Indicates whether the core file monitoring file is supported.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder supportFile(Boolean supportFile) {
                this.supportFile = supportFile;
                return this;
            }

            /**
             * <p>The UUID of the asset.</p>
             * 
             * <strong>example:</strong>
             * <p>6690a46c-0edb-4663-a641-3629d1a9****</p>
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
    /**
     * 
     * {@link ListFileProtectPluginStatusResponseBody} extends {@link TeaModel}
     *
     * <p>ListFileProtectPluginStatusResponseBody</p>
     */
    public static class PageInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CurrentPage")
        private Integer currentPage;

        @com.aliyun.core.annotation.NameInMap("PageSize")
        private Integer pageSize;

        @com.aliyun.core.annotation.NameInMap("TotalCount")
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
             * <p>The page number.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder currentPage(Integer currentPage) {
                this.currentPage = currentPage;
                return this;
            }

            /**
             * <p>The number of entries per page.</p>
             * 
             * <strong>example:</strong>
             * <p>20</p>
             */
            public Builder pageSize(Integer pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            /**
             * <p>The total number of entries returned.</p>
             * 
             * <strong>example:</strong>
             * <p>149</p>
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
