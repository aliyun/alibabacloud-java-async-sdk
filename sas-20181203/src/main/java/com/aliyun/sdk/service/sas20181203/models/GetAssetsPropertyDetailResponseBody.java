// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

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
 * {@link GetAssetsPropertyDetailResponseBody} extends {@link TeaModel}
 *
 * <p>GetAssetsPropertyDetailResponseBody</p>
 */
public class GetAssetsPropertyDetailResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("PageInfo")
    private PageInfo pageInfo;

    @com.aliyun.core.annotation.NameInMap("Propertys")
    private java.util.List<Propertys> propertys;

    @com.aliyun.core.annotation.NameInMap("RequestId")
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

    public Builder toBuilder() {
        return new Builder(this);
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
    public java.util.List<Propertys> getPropertys() {
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
        private java.util.List<Propertys> propertys; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(GetAssetsPropertyDetailResponseBody model) {
            this.pageInfo = model.pageInfo;
            this.propertys = model.propertys;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The pagination information.</p>
         */
        public Builder pageInfo(PageInfo pageInfo) {
            this.pageInfo = pageInfo;
            return this;
        }

        /**
         * <p>An array that consists of the details about the asset fingerprints.</p>
         */
        public Builder propertys(java.util.List<Propertys> propertys) {
            this.propertys = propertys;
            return this;
        }

        /**
         * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
         * 
         * <strong>example:</strong>
         * <p>4C1AE3F3-18FA-4108-BBB9-AFA1A032****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetAssetsPropertyDetailResponseBody build() {
            return new GetAssetsPropertyDetailResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetAssetsPropertyDetailResponseBody} extends {@link TeaModel}
     *
     * <p>GetAssetsPropertyDetailResponseBody</p>
     */
    public static class PageInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Count")
        private Integer count;

        @com.aliyun.core.annotation.NameInMap("CurrentPage")
        private Integer currentPage;

        @com.aliyun.core.annotation.NameInMap("PageSize")
        private Integer pageSize;

        @com.aliyun.core.annotation.NameInMap("TotalCount")
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

            private Builder() {
            } 

            private Builder(PageInfo model) {
                this.count = model.count;
                this.currentPage = model.currentPage;
                this.pageSize = model.pageSize;
                this.totalCount = model.totalCount;
            } 

            /**
             * <p>The number of entries returned on the current page.</p>
             * 
             * <strong>example:</strong>
             * <p>20</p>
             */
            public Builder count(Integer count) {
                this.count = count;
                return this;
            }

            /**
             * <p>The page number of the returned page.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder currentPage(Integer currentPage) {
                this.currentPage = currentPage;
                return this;
            }

            /**
             * <p>The number of entries returned per page.</p>
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
             * <p>23</p>
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
    /**
     * 
     * {@link GetAssetsPropertyDetailResponseBody} extends {@link TeaModel}
     *
     * <p>GetAssetsPropertyDetailResponseBody</p>
     */
    public static class Propertys extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ContainerName")
        private String containerName;

        @com.aliyun.core.annotation.NameInMap("CreateTimestamp")
        private Long createTimestamp;

        @com.aliyun.core.annotation.NameInMap("Domain")
        private String domain;

        @com.aliyun.core.annotation.NameInMap("Filepath")
        private String filepath;

        @com.aliyun.core.annotation.NameInMap("ImageName")
        private String imageName;

        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("InstanceName")
        private String instanceName;

        @com.aliyun.core.annotation.NameInMap("InternetIp")
        private String internetIp;

        @com.aliyun.core.annotation.NameInMap("IntranetIp")
        private String intranetIp;

        @com.aliyun.core.annotation.NameInMap("Ip")
        private String ip;

        @com.aliyun.core.annotation.NameInMap("ListenProtocol")
        private String listenProtocol;

        @com.aliyun.core.annotation.NameInMap("ModuleName")
        private String moduleName;

        @com.aliyun.core.annotation.NameInMap("Path")
        private String path;

        @com.aliyun.core.annotation.NameInMap("PathMode")
        private String pathMode;

        @com.aliyun.core.annotation.NameInMap("Pid")
        private String pid;

        @com.aliyun.core.annotation.NameInMap("Port")
        private String port;

        @com.aliyun.core.annotation.NameInMap("ProcessStarted")
        private Long processStarted;

        @com.aliyun.core.annotation.NameInMap("RegionId")
        private String regionId;

        @com.aliyun.core.annotation.NameInMap("ServerType")
        private String serverType;

        @com.aliyun.core.annotation.NameInMap("Size")
        private Integer size;

        @com.aliyun.core.annotation.NameInMap("UsedByCount")
        private Integer usedByCount;

        @com.aliyun.core.annotation.NameInMap("User")
        private String user;

        @com.aliyun.core.annotation.NameInMap("Uuid")
        private String uuid;

        @com.aliyun.core.annotation.NameInMap("WebPath")
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

            private Builder() {
            } 

            private Builder(Propertys model) {
                this.containerName = model.containerName;
                this.createTimestamp = model.createTimestamp;
                this.domain = model.domain;
                this.filepath = model.filepath;
                this.imageName = model.imageName;
                this.instanceId = model.instanceId;
                this.instanceName = model.instanceName;
                this.internetIp = model.internetIp;
                this.intranetIp = model.intranetIp;
                this.ip = model.ip;
                this.listenProtocol = model.listenProtocol;
                this.moduleName = model.moduleName;
                this.path = model.path;
                this.pathMode = model.pathMode;
                this.pid = model.pid;
                this.port = model.port;
                this.processStarted = model.processStarted;
                this.regionId = model.regionId;
                this.serverType = model.serverType;
                this.size = model.size;
                this.usedByCount = model.usedByCount;
                this.user = model.user;
                this.uuid = model.uuid;
                this.webPath = model.webPath;
            } 

            /**
             * <p>The name of the container.</p>
             * 
             * <strong>example:</strong>
             * <p>5-rce_web_1</p>
             */
            public Builder containerName(String containerName) {
                this.containerName = containerName;
                return this;
            }

            /**
             * <p>The timestamp of the last fingerprint collection. Unit: milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1649149566000</p>
             */
            public Builder createTimestamp(Long createTimestamp) {
                this.createTimestamp = createTimestamp;
                return this;
            }

            /**
             * <p>The domain name of the website.</p>
             * <blockquote>
             * <p>This parameter is returned only when <strong>Biz</strong> is set to <strong>web_server</strong>.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>localhost</p>
             */
            public Builder domain(String domain) {
                this.domain = domain;
                return this;
            }

            /**
             * <p>The path to the kernel module file.</p>
             * <blockquote>
             * <p>This parameter is returned only when <strong>Biz</strong> is set to <strong>lkm</strong>.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>/lib/modules/4****</p>
             */
            public Builder filepath(String filepath) {
                this.filepath = filepath;
                return this;
            }

            /**
             * <p>The name of the image.</p>
             * 
             * <strong>example:</strong>
             * <p>registry-vpc.cn-beijing.aliyuncs.com/acs/aliyun-ingress-controller****</p>
             */
            public Builder imageName(String imageName) {
                this.imageName = imageName;
                return this;
            }

            /**
             * <p>The ID of the server.</p>
             * 
             * <strong>example:</strong>
             * <p>i-hp35tftuh52wbp1g****</p>
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * <p>The name of the server.</p>
             * 
             * <strong>example:</strong>
             * <p>hc-host-****</p>
             */
            public Builder instanceName(String instanceName) {
                this.instanceName = instanceName;
                return this;
            }

            /**
             * <p>The public IP address of the server.</p>
             * 
             * <strong>example:</strong>
             * <p>47.42.XX.XX</p>
             */
            public Builder internetIp(String internetIp) {
                this.internetIp = internetIp;
                return this;
            }

            /**
             * <p>The private IP address of the server.</p>
             * 
             * <strong>example:</strong>
             * <p>100.104.XX.XX</p>
             */
            public Builder intranetIp(String intranetIp) {
                this.intranetIp = intranetIp;
                return this;
            }

            /**
             * <p>The IP address of the server.</p>
             * 
             * <strong>example:</strong>
             * <p>47.42.XX.XX</p>
             */
            public Builder ip(String ip) {
                this.ip = ip;
                return this;
            }

            /**
             * <p>The listening protocol that the website uses.</p>
             * <blockquote>
             * <p>This parameter is returned only when <strong>Biz</strong> is set to <strong>web_server</strong>.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>tcp</p>
             */
            public Builder listenProtocol(String listenProtocol) {
                this.listenProtocol = listenProtocol;
                return this;
            }

            /**
             * <p>The name of the module.</p>
             * <blockquote>
             * <p>This parameter is returned only when <strong>Biz</strong> is set to <strong>lkm</strong>.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>alihids</p>
             */
            public Builder moduleName(String moduleName) {
                this.moduleName = moduleName;
                return this;
            }

            /**
             * <p>The path. The value of this parameter varies based on the value of <strong>Biz</strong>.</p>
             * <ul>
             * <li>If <strong>Biz</strong> is set to <strong>web_server</strong>, the value of this parameter indicates the path to the website root directory.</li>
             * <li>If <strong>Biz</strong> is set to <strong>autorun</strong>, the value of this parameter indicates the path to the startup item.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>/lib/systemd/system****</p>
             */
            public Builder path(String path) {
                this.path = path;
                return this;
            }

            /**
             * <p>The permissions on the root directory of the website.</p>
             * <blockquote>
             * <p>This parameter is returned only when <strong>Biz</strong> is set to <strong>web_server</strong>.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>755</p>
             */
            public Builder pathMode(String pathMode) {
                this.pathMode = pathMode;
                return this;
            }

            /**
             * <p>The process ID (PID) of the process that runs the website service.</p>
             * <blockquote>
             * <p>This parameter is returned only when <strong>Biz</strong> is set to <strong>web_server</strong>.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>813</p>
             */
            public Builder pid(String pid) {
                this.pid = pid;
                return this;
            }

            /**
             * <p>The port of the website.</p>
             * <blockquote>
             * <p>This parameter is returned only when <strong>Biz</strong> is set to <strong>web_server</strong>.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>80</p>
             */
            public Builder port(String port) {
                this.port = port;
                return this;
            }

            /**
             * <p>The timestamp generated when the process was started. Unit: milliseconds.</p>
             * <blockquote>
             * <p>This parameter is returned only when <strong>Biz</strong> is set to <strong>web_server</strong>.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>1671186801000</p>
             */
            public Builder processStarted(Long processStarted) {
                this.processStarted = processStarted;
                return this;
            }

            /**
             * <p>The ID of the region in which the server resides.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou</p>
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * <p>The type of the website.</p>
             * <blockquote>
             * <p>This parameter is returned only when <strong>Biz</strong> is set to <strong>web_server</strong>.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>nginx</p>
             */
            public Builder serverType(String serverType) {
                this.serverType = serverType;
                return this;
            }

            /**
             * <p>The size of the kernel module.</p>
             * <blockquote>
             * <p>This parameter is returned only when <strong>Biz</strong> is set to <strong>lkm</strong>.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder size(Integer size) {
                this.size = size;
                return this;
            }

            /**
             * <p>The number of times that the kernel module is referenced.</p>
             * <blockquote>
             * <p>This parameter is returned only when <strong>Biz</strong> is set to <strong>lkm</strong>.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder usedByCount(Integer usedByCount) {
                this.usedByCount = usedByCount;
                return this;
            }

            /**
             * <p>The user who started the process of the website.</p>
             * <blockquote>
             * <p>This parameter is returned only when <strong>Biz</strong> is set to <strong>web_server</strong>.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>root</p>
             */
            public Builder user(String user) {
                this.user = user;
                return this;
            }

            /**
             * <p>The UUID of the server.</p>
             * 
             * <strong>example:</strong>
             * <p>162eb349-c2d9-4f8b-805c-75b43d4c****</p>
             */
            public Builder uuid(String uuid) {
                this.uuid = uuid;
                return this;
            }

            /**
             * <p>The path to the root directory of the website.</p>
             * <blockquote>
             * <p>This parameter is returned only when <strong>Biz</strong> is set to <strong>web_server</strong>.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>/usr/share/nginx/html</p>
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
