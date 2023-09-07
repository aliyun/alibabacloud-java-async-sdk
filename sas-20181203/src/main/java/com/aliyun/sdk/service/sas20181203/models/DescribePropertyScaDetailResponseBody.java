// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribePropertyScaDetailResponseBody} extends {@link TeaModel}
 *
 * <p>DescribePropertyScaDetailResponseBody</p>
 */
public class DescribePropertyScaDetailResponseBody extends TeaModel {
    @NameInMap("PageInfo")
    private PageInfo pageInfo;

    @NameInMap("Propertys")
    private java.util.List < Propertys> propertys;

    @NameInMap("RequestId")
    private String requestId;

    private DescribePropertyScaDetailResponseBody(Builder builder) {
        this.pageInfo = builder.pageInfo;
        this.propertys = builder.propertys;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribePropertyScaDetailResponseBody create() {
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
         * The details about the asset fingerprints returned.
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

        public DescribePropertyScaDetailResponseBody build() {
            return new DescribePropertyScaDetailResponseBody(this);
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
             * The number of entries returned per page. Default value: **10**.
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
        @NameInMap("BizType")
        private String bizType;

        @NameInMap("BizTypeDispaly")
        private String bizTypeDispaly;

        @NameInMap("Cmdline")
        private String cmdline;

        @NameInMap("ConfigPath")
        private String configPath;

        @NameInMap("ContainerName")
        private String containerName;

        @NameInMap("CreateTimestamp")
        private Long createTimestamp;

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

        @NameInMap("ListenIp")
        private String listenIp;

        @NameInMap("ListenProtocol")
        private String listenProtocol;

        @NameInMap("ListenStatus")
        private String listenStatus;

        @NameInMap("Name")
        private String name;

        @NameInMap("Path")
        private String path;

        @NameInMap("Pid")
        private String pid;

        @NameInMap("Port")
        private String port;

        @NameInMap("Ppid")
        private String ppid;

        @NameInMap("ProcessStarted")
        private Long processStarted;

        @NameInMap("ProcessUser")
        private String processUser;

        @NameInMap("Proof")
        private String proof;

        @NameInMap("RuntimeEnvVersion")
        private String runtimeEnvVersion;

        @NameInMap("Type")
        private String type;

        @NameInMap("Uuid")
        private String uuid;

        @NameInMap("Version")
        private String version;

        @NameInMap("WebPath")
        private String webPath;

        private Propertys(Builder builder) {
            this.bizType = builder.bizType;
            this.bizTypeDispaly = builder.bizTypeDispaly;
            this.cmdline = builder.cmdline;
            this.configPath = builder.configPath;
            this.containerName = builder.containerName;
            this.createTimestamp = builder.createTimestamp;
            this.imageName = builder.imageName;
            this.instanceId = builder.instanceId;
            this.instanceName = builder.instanceName;
            this.internetIp = builder.internetIp;
            this.intranetIp = builder.intranetIp;
            this.ip = builder.ip;
            this.listenIp = builder.listenIp;
            this.listenProtocol = builder.listenProtocol;
            this.listenStatus = builder.listenStatus;
            this.name = builder.name;
            this.path = builder.path;
            this.pid = builder.pid;
            this.port = builder.port;
            this.ppid = builder.ppid;
            this.processStarted = builder.processStarted;
            this.processUser = builder.processUser;
            this.proof = builder.proof;
            this.runtimeEnvVersion = builder.runtimeEnvVersion;
            this.type = builder.type;
            this.uuid = builder.uuid;
            this.version = builder.version;
            this.webPath = builder.webPath;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Propertys create() {
            return builder().build();
        }

        /**
         * @return bizType
         */
        public String getBizType() {
            return this.bizType;
        }

        /**
         * @return bizTypeDispaly
         */
        public String getBizTypeDispaly() {
            return this.bizTypeDispaly;
        }

        /**
         * @return cmdline
         */
        public String getCmdline() {
            return this.cmdline;
        }

        /**
         * @return configPath
         */
        public String getConfigPath() {
            return this.configPath;
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
         * @return listenIp
         */
        public String getListenIp() {
            return this.listenIp;
        }

        /**
         * @return listenProtocol
         */
        public String getListenProtocol() {
            return this.listenProtocol;
        }

        /**
         * @return listenStatus
         */
        public String getListenStatus() {
            return this.listenStatus;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return path
         */
        public String getPath() {
            return this.path;
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
         * @return ppid
         */
        public String getPpid() {
            return this.ppid;
        }

        /**
         * @return processStarted
         */
        public Long getProcessStarted() {
            return this.processStarted;
        }

        /**
         * @return processUser
         */
        public String getProcessUser() {
            return this.processUser;
        }

        /**
         * @return proof
         */
        public String getProof() {
            return this.proof;
        }

        /**
         * @return runtimeEnvVersion
         */
        public String getRuntimeEnvVersion() {
            return this.runtimeEnvVersion;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        /**
         * @return uuid
         */
        public String getUuid() {
            return this.uuid;
        }

        /**
         * @return version
         */
        public String getVersion() {
            return this.version;
        }

        /**
         * @return webPath
         */
        public String getWebPath() {
            return this.webPath;
        }

        public static final class Builder {
            private String bizType; 
            private String bizTypeDispaly; 
            private String cmdline; 
            private String configPath; 
            private String containerName; 
            private Long createTimestamp; 
            private String imageName; 
            private String instanceId; 
            private String instanceName; 
            private String internetIp; 
            private String intranetIp; 
            private String ip; 
            private String listenIp; 
            private String listenProtocol; 
            private String listenStatus; 
            private String name; 
            private String path; 
            private String pid; 
            private String port; 
            private String ppid; 
            private Long processStarted; 
            private String processUser; 
            private String proof; 
            private String runtimeEnvVersion; 
            private String type; 
            private String uuid; 
            private String version; 
            private String webPath; 

            /**
             * The type of the middleware, database, or web service. Valid values:
             * <p>
             * 
             * *   **system_service**: system service
             * *   **software_library**: software library
             * *   **docker_component**: container component
             * *   **database**: database
             * *   **web_container**: web container
             * *   **jar**: JAR package
             * *   **web_framework**: web framework
             */
            public Builder bizType(String bizType) {
                this.bizType = bizType;
                return this;
            }

            /**
             * The display name of the type of the middleware, database, or web service . Valid values:
             * <p>
             * 
             * *   System service
             * *   Software library
             * *   Docker component
             * *   Database
             * *   Web container
             * *   JAR package
             * *   Web framework
             */
            public Builder bizTypeDispaly(String bizTypeDispaly) {
                this.bizTypeDispaly = bizTypeDispaly;
                return this;
            }

            /**
             * The command line of the process.
             */
            public Builder cmdline(String cmdline) {
                this.cmdline = cmdline;
                return this;
            }

            /**
             * The path to the configuration file.
             */
            public Builder configPath(String configPath) {
                this.configPath = configPath;
                return this;
            }

            /**
             * The name of the container.
             */
            public Builder containerName(String containerName) {
                this.containerName = containerName;
                return this;
            }

            /**
             * The timestamp of the latest collection , which indicates the last timestamp generated when Security Center collected the information about the middleware, database, or web service. Unit: milliseconds.
             */
            public Builder createTimestamp(Long createTimestamp) {
                this.createTimestamp = createTimestamp;
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
             * The ID of the server on which the middleware, database, or web service is run.
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * The name of the server on which the middleware, database, or web service is run.
             */
            public Builder instanceName(String instanceName) {
                this.instanceName = instanceName;
                return this;
            }

            /**
             * The public IP address of the server on which the middleware, database, or web service is run.
             */
            public Builder internetIp(String internetIp) {
                this.internetIp = internetIp;
                return this;
            }

            /**
             * The private IP address of the server on which the middleware, database, or web service is run.
             */
            public Builder intranetIp(String intranetIp) {
                this.intranetIp = intranetIp;
                return this;
            }

            /**
             * The public IP address of the server on which the middleware, database, or web service is run.
             */
            public Builder ip(String ip) {
                this.ip = ip;
                return this;
            }

            /**
             * The IP address that the process monitors.
             */
            public Builder listenIp(String listenIp) {
                this.listenIp = listenIp;
                return this;
            }

            /**
             * The listener protocol. Valid values:
             * <p>
             * 
             * *   **UDP**
             * *   **TCP**
             */
            public Builder listenProtocol(String listenProtocol) {
                this.listenProtocol = listenProtocol;
                return this;
            }

            /**
             * The listening status of the process. Valid values:
             * <p>
             * 
             * *   **NONE**: The process is not listened.
             * *   **LISTEN**: The process is listened.
             */
            public Builder listenStatus(String listenStatus) {
                this.listenStatus = listenStatus;
                return this;
            }

            /**
             * The name of the middleware, database, or web service.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * The path of the middleware, database, or web service.
             */
            public Builder path(String path) {
                this.path = path;
                return this;
            }

            /**
             * The process ID.
             */
            public Builder pid(String pid) {
                this.pid = pid;
                return this;
            }

            /**
             * The port of the middleware, database, or web service.
             */
            public Builder port(String port) {
                this.port = port;
                return this;
            }

            /**
             * The ID of the parent process.
             */
            public Builder ppid(String ppid) {
                this.ppid = ppid;
                return this;
            }

            /**
             * The timestamp generated when the process starts. Unit: milliseconds.
             */
            public Builder processStarted(Long processStarted) {
                this.processStarted = processStarted;
                return this;
            }

            /**
             * The name of the user who runs the process.
             */
            public Builder processUser(String processUser) {
                this.processUser = processUser;
                return this;
            }

            /**
             * The version verification information about the middleware, database, or web service.
             */
            public Builder proof(String proof) {
                this.proof = proof;
                return this;
            }

            /**
             * The version of the runtime environment.
             * <p>
             * 
             * > The value of this parameter can be the Java Development Kit (JDK) version of the runtime environment for a Java process.
             */
            public Builder runtimeEnvVersion(String runtimeEnvVersion) {
                this.runtimeEnvVersion = runtimeEnvVersion;
                return this;
            }

            /**
             * The type of the middleware, database, or web service.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * The UUID of the server on which the middleware, database, or web service is run.
             */
            public Builder uuid(String uuid) {
                this.uuid = uuid;
                return this;
            }

            /**
             * The version of the middleware, database, or web service.
             */
            public Builder version(String version) {
                this.version = version;
                return this;
            }

            /**
             * The web directory.
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
