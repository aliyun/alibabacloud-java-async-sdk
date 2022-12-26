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
         * PageInfo.
         */
        public Builder pageInfo(PageInfo pageInfo) {
            this.pageInfo = pageInfo;
            return this;
        }

        /**
         * Propertys.
         */
        public Builder propertys(java.util.List < Propertys> propertys) {
            this.propertys = propertys;
            return this;
        }

        /**
         * RequestId.
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
             * Count.
             */
            public Builder count(Integer count) {
                this.count = count;
                return this;
            }

            /**
             * CurrentPage.
             */
            public Builder currentPage(Integer currentPage) {
                this.currentPage = currentPage;
                return this;
            }

            /**
             * PageSize.
             */
            public Builder pageSize(Integer pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            /**
             * TotalCount.
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
             * 容器名称
             */
            public Builder containerName(String containerName) {
                this.containerName = containerName;
                return this;
            }

            /**
             * 扫描时间戳
             */
            public Builder createTimestamp(Long createTimestamp) {
                this.createTimestamp = createTimestamp;
                return this;
            }

            /**
             * web站点:域名
             */
            public Builder domain(String domain) {
                this.domain = domain;
                return this;
            }

            /**
             * 内核模块:路径
             */
            public Builder filepath(String filepath) {
                this.filepath = filepath;
                return this;
            }

            /**
             * 镜像名称
             */
            public Builder imageName(String imageName) {
                this.imageName = imageName;
                return this;
            }

            /**
             * 机器信息:实例id
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * 机器信息:实例名称
             */
            public Builder instanceName(String instanceName) {
                this.instanceName = instanceName;
                return this;
            }

            /**
             * 机器信息:公网ip
             */
            public Builder internetIp(String internetIp) {
                this.internetIp = internetIp;
                return this;
            }

            /**
             * 机器信息:私网ip
             */
            public Builder intranetIp(String intranetIp) {
                this.intranetIp = intranetIp;
                return this;
            }

            /**
             * 机器信息:机器ip
             */
            public Builder ip(String ip) {
                this.ip = ip;
                return this;
            }

            /**
             * 进程监听协议
             */
            public Builder listenProtocol(String listenProtocol) {
                this.listenProtocol = listenProtocol;
                return this;
            }

            /**
             * 内核模块:模块名称
             */
            public Builder moduleName(String moduleName) {
                this.moduleName = moduleName;
                return this;
            }

            /**
             * 启动项:路径 web站点:安装路径
             */
            public Builder path(String path) {
                this.path = path;
                return this;
            }

            /**
             * web站点:目录权限
             */
            public Builder pathMode(String pathMode) {
                this.pathMode = pathMode;
                return this;
            }

            /**
             * Pid
             */
            public Builder pid(String pid) {
                this.pid = pid;
                return this;
            }

            /**
             * web站点:监听端口
             */
            public Builder port(String port) {
                this.port = port;
                return this;
            }

            /**
             * 进程启动时间
             */
            public Builder processStarted(Long processStarted) {
                this.processStarted = processStarted;
                return this;
            }

            /**
             * 机器信息:地域id
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * web站点:站点类型
             */
            public Builder serverType(String serverType) {
                this.serverType = serverType;
                return this;
            }

            /**
             * 内核模块:大小
             */
            public Builder size(Integer size) {
                this.size = size;
                return this;
            }

            /**
             * 内核模块:被依赖数目
             */
            public Builder usedByCount(Integer usedByCount) {
                this.usedByCount = usedByCount;
                return this;
            }

            /**
             * web站点:操作用户
             */
            public Builder user(String user) {
                this.user = user;
                return this;
            }

            /**
             * 机器信息:uuid
             */
            public Builder uuid(String uuid) {
                this.uuid = uuid;
                return this;
            }

            /**
             * web站点:web路径
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
