// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetAssetsPropertyDetailResponseBody} extends {@link TeaModel}
 *
 * <p>GetAssetsPropertyDetailResponseBody</p>
 */
public class GetAssetsPropertyDetailResponseBody extends TeaModel {
    @NameInMap("PageInfo")
    private PageInfo pageInfo;

    @NameInMap("Propertys")
    private java.util.List < Propertys> propertys;

    @NameInMap("RequestId")
    private String requestId;

    private GetAssetsPropertyDetailResponseBody(Builder builder) {
        this.pageInfo = builder.pageInfo;
        this.propertys = builder.propertys;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetAssetsPropertyDetailResponseBody create() {
        return builder().build();
    }

    /**
     * @return pageInfo
     */
    public PageInfo getPageInfo() {
        return this.pageInfo;
    }

    /**
     * @return propertys
     */
    public java.util.List < Propertys> getPropertys() {
        return this.propertys;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private PageInfo pageInfo; 
        private java.util.List < Propertys> propertys; 
        private String requestId; 

        /**
         * The pagination information.
         */
        public Builder pageInfo(PageInfo pageInfo) {
            this.pageInfo = pageInfo;
            return this;
        }

        /**
         * An array that consists of the details about the asset fingerprints.
         */
        public Builder propertys(java.util.List < Propertys> propertys) {
            this.propertys = propertys;
            return this;
        }

        /**
         * The ID of the request, which is used to locate and troubleshoot issues.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetAssetsPropertyDetailResponseBody build() {
            return new GetAssetsPropertyDetailResponseBody(this);
        } 

    } 

    public static class PageInfo extends TeaModel {
        @NameInMap("Count")
        private Integer count;

        @NameInMap("CurrentPage")
        private Integer currentPage;

        @NameInMap("PageSize")
        private Integer pageSize;

        @NameInMap("TotalCount")
        private Integer totalCount;

        private PageInfo(Builder builder) {
            this.count = builder.count;
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
         * @return count
         */
        public Integer getCount() {
            return this.count;
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
            private Integer count; 
            private Integer currentPage; 
            private Integer pageSize; 
            private Integer totalCount; 

            /**
             * The number of entries returned on the current page.
             */
            public Builder count(Integer count) {
                this.count = count;
                return this;
            }

            /**
             * The page number of the returned page.
             */
            public Builder currentPage(Integer currentPage) {
                this.currentPage = currentPage;
                return this;
            }

            /**
             * The number of entries returned per page.
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
    public static class Propertys extends TeaModel {
        @NameInMap("ContainerName")
        private String containerName;

        @NameInMap("CreateTimestamp")
        private Long createTimestamp;

        @NameInMap("Domain")
        private String domain;

        @NameInMap("Filepath")
        private String filepath;

        @NameInMap("ImageName")
        private String imageName;

        @NameInMap("InstanceId")
        private String instanceId;

        @NameInMap("InstanceName")
        private String instanceName;

        @NameInMap("InternetIp")
        private String internetIp;

        @NameInMap("IntranetIp")
        private String intranetIp;

        @NameInMap("Ip")
        private String ip;

        @NameInMap("ListenProtocol")
        private String listenProtocol;

        @NameInMap("ModuleName")
        private String moduleName;

        @NameInMap("Path")
        private String path;

        @NameInMap("PathMode")
        private String pathMode;

        @NameInMap("Pid")
        private String pid;

        @NameInMap("Port")
        private String port;

        @NameInMap("ProcessStarted")
        private Long processStarted;

        @NameInMap("RegionId")
        private String regionId;

        @NameInMap("ServerType")
        private String serverType;

        @NameInMap("Size")
        private Integer size;

        @NameInMap("UsedByCount")
        private Integer usedByCount;

        @NameInMap("User")
        private String user;

        @NameInMap("Uuid")
        private String uuid;

        @NameInMap("WebPath")
        private String webPath;

        private Propertys(Builder builder) {
            this.containerName = builder.containerName;
            this.createTimestamp = builder.createTimestamp;
            this.domain = builder.domain;
            this.filepath = builder.filepath;
            this.imageName = builder.imageName;
            this.instanceId = builder.instanceId;
            this.instanceName = builder.instanceName;
            this.internetIp = builder.internetIp;
            this.intranetIp = builder.intranetIp;
            this.ip = builder.ip;
            this.listenProtocol = builder.listenProtocol;
            this.moduleName = builder.moduleName;
            this.path = builder.path;
            this.pathMode = builder.pathMode;
            this.pid = builder.pid;
            this.port = builder.port;
            this.processStarted = builder.processStarted;
            this.regionId = builder.regionId;
            this.serverType = builder.serverType;
            this.size = builder.size;
            this.usedByCount = builder.usedByCount;
            this.user = builder.user;
            this.uuid = builder.uuid;
            this.webPath = builder.webPath;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Propertys create() {
            return builder().build();
        }

        /**
         * @return containerName
         */
        public String getContainerName() {
            return this.containerName;
        }

        /**
         * @return createTimestamp
         */
        public Long getCreateTimestamp() {
            return this.createTimestamp;
        }

        /**
         * @return domain
         */
        public String getDomain() {
            return this.domain;
        }

        /**
         * @return filepath
         */
        public String getFilepath() {
            return this.filepath;
        }

        /**
         * @return imageName
         */
        public String getImageName() {
            return this.imageName;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
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
         * @return ip
         */
        public String getIp() {
            return this.ip;
        }

        /**
         * @return listenProtocol
         */
        public String getListenProtocol() {
            return this.listenProtocol;
        }

        /**
         * @return moduleName
         */
        public String getModuleName() {
            return this.moduleName;
        }

        /**
         * @return path
         */
        public String getPath() {
            return this.path;
        }

        /**
         * @return pathMode
         */
        public String getPathMode() {
            return this.pathMode;
        }

        /**
         * @return pid
         */
        public String getPid() {
            return this.pid;
        }

        /**
         * @return port
         */
        public String getPort() {
            return this.port;
        }

        /**
         * @return processStarted
         */
        public Long getProcessStarted() {
            return this.processStarted;
        }

        /**
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
        }

        /**
         * @return serverType
         */
        public String getServerType() {
            return this.serverType;
        }

        /**
         * @return size
         */
        public Integer getSize() {
            return this.size;
        }

        /**
         * @return usedByCount
         */
        public Integer getUsedByCount() {
            return this.usedByCount;
        }

        /**
         * @return user
         */
        public String getUser() {
            return this.user;
        }

        /**
         * @return uuid
         */
        public String getUuid() {
            return this.uuid;
        }

        /**
         * @return webPath
         */
        public String getWebPath() {
            return this.webPath;
        }

        public static final class Builder {
            private String containerName; 
            private Long createTimestamp; 
            private String domain; 
            private String filepath; 
            private String imageName; 
            private String instanceId; 
            private String instanceName; 
            private String internetIp; 
            private String intranetIp; 
            private String ip; 
            private String listenProtocol; 
            private String moduleName; 
            private String path; 
            private String pathMode; 
            private String pid; 
            private String port; 
            private Long processStarted; 
            private String regionId; 
            private String serverType; 
            private Integer size; 
            private Integer usedByCount; 
            private String user; 
            private String uuid; 
            private String webPath; 

            /**
             * The name of the container.
             */
            public Builder containerName(String containerName) {
                this.containerName = containerName;
                return this;
            }

            /**
             * The timestamp of the last fingerprint collection. Unit: milliseconds.
             */
            public Builder createTimestamp(Long createTimestamp) {
                this.createTimestamp = createTimestamp;
                return this;
            }

            /**
             * The domain name of the website.
             * <p>
             * 
             * > This parameter is returned only when **Biz** is set to **web_server**.
             */
            public Builder domain(String domain) {
                this.domain = domain;
                return this;
            }

            /**
             * The path to the kernel module file.
             * <p>
             * 
             * > This parameter is returned only when **Biz** is set to **lkm**.
             */
            public Builder filepath(String filepath) {
                this.filepath = filepath;
                return this;
            }

            /**
             * The name of the image.
             */
            public Builder imageName(String imageName) {
                this.imageName = imageName;
                return this;
            }

            /**
             * The ID of the server.
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * The name of the server.
             */
            public Builder instanceName(String instanceName) {
                this.instanceName = instanceName;
                return this;
            }

            /**
             * The public IP address of the server.
             */
            public Builder internetIp(String internetIp) {
                this.internetIp = internetIp;
                return this;
            }

            /**
             * The private IP address of the server.
             */
            public Builder intranetIp(String intranetIp) {
                this.intranetIp = intranetIp;
                return this;
            }

            /**
             * The IP address of the server.
             */
            public Builder ip(String ip) {
                this.ip = ip;
                return this;
            }

            /**
             * The listening protocol that the website uses.
             * <p>
             * 
             * > This parameter is returned only when **Biz** is set to **web_server**.
             */
            public Builder listenProtocol(String listenProtocol) {
                this.listenProtocol = listenProtocol;
                return this;
            }

            /**
             * The name of the module.
             * <p>
             * 
             * > This parameter is returned only when **Biz** is set to **lkm**.
             */
            public Builder moduleName(String moduleName) {
                this.moduleName = moduleName;
                return this;
            }

            /**
             * The path. The value of this parameter varies based on the value of **Biz**.
             * <p>
             * 
             * *   If **Biz** is set to **web_server**, the value of this parameter indicates the path to the website root directory.
             * *   If **Biz** is set to **autorun**, the value of this parameter indicates the path to the startup item.
             */
            public Builder path(String path) {
                this.path = path;
                return this;
            }

            /**
             * The permissions on the root directory of the website.
             * <p>
             * 
             * > This parameter is returned only when **Biz** is set to **web_server**.
             */
            public Builder pathMode(String pathMode) {
                this.pathMode = pathMode;
                return this;
            }

            /**
             * The process ID (PID) of the process that runs the website service.
             * <p>
             * 
             * > This parameter is returned only when **Biz** is set to **web_server**.
             */
            public Builder pid(String pid) {
                this.pid = pid;
                return this;
            }

            /**
             * The port of the website.
             * <p>
             * 
             * > This parameter is returned only when **Biz** is set to **web_server**.
             */
            public Builder port(String port) {
                this.port = port;
                return this;
            }

            /**
             * The timestamp generated when the process was started. Unit: milliseconds.
             * <p>
             * 
             * > This parameter is returned only when **Biz** is set to **web_server**.
             */
            public Builder processStarted(Long processStarted) {
                this.processStarted = processStarted;
                return this;
            }

            /**
             * The ID of the region in which the server resides.
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * The type of the website.
             * <p>
             * 
             * > This parameter is returned only when **Biz** is set to **web_server**.
             */
            public Builder serverType(String serverType) {
                this.serverType = serverType;
                return this;
            }

            /**
             * The size of the kernel module.
             * <p>
             * 
             * > This parameter is returned only when **Biz** is set to **lkm**.
             */
            public Builder size(Integer size) {
                this.size = size;
                return this;
            }

            /**
             * The number of times that the kernel module is referenced.
             * <p>
             * 
             * > This parameter is returned only when **Biz** is set to **lkm**.
             */
            public Builder usedByCount(Integer usedByCount) {
                this.usedByCount = usedByCount;
                return this;
            }

            /**
             * The user who started the process of the website.
             * <p>
             * 
             * > This parameter is returned only when **Biz** is set to **web_server**.
             */
            public Builder user(String user) {
                this.user = user;
                return this;
            }

            /**
             * The UUID of the server.
             */
            public Builder uuid(String uuid) {
                this.uuid = uuid;
                return this;
            }

            /**
             * The path to the root directory of the website.
             * <p>
             * 
             * > This parameter is returned only when **Biz** is set to **web_server**.
             */
            public Builder webPath(String webPath) {
                this.webPath = webPath;
                return this;
            }

            public Propertys build() {
                return new Propertys(this);
            } 

        } 

    }
}
