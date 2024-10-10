// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribePropertyScaDetailResponseBody} extends {@link TeaModel}
 *
 * <p>DescribePropertyScaDetailResponseBody</p>
 */
public class DescribePropertyScaDetailResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("PageInfo")
    private PageInfo pageInfo;

    @com.aliyun.core.annotation.NameInMap("Propertys")
    private java.util.List < Propertys> propertys;

    @com.aliyun.core.annotation.NameInMap("RequestId")
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
         * <p>The pagination information.</p>
         */
        public Builder pageInfo(PageInfo pageInfo) {
            this.pageInfo = pageInfo;
            return this;
        }

        /**
         * <p>The details about the asset fingerprints returned.</p>
         */
        public Builder propertys(java.util.List < Propertys> propertys) {
            this.propertys = propertys;
            return this;
        }

        /**
         * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
         * 
         * <strong>example:</strong>
         * <p>F9146867-16C8-4AAB-BB4FB8C2A4</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribePropertyScaDetailResponseBody build() {
            return new DescribePropertyScaDetailResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribePropertyScaDetailResponseBody} extends {@link TeaModel}
     *
     * <p>DescribePropertyScaDetailResponseBody</p>
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

            /**
             * <p>The number of entries returned on the current page.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
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
             * <p>The number of entries returned per page. Default value: <strong>10</strong>.</p>
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
             * <p>2</p>
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
     * {@link DescribePropertyScaDetailResponseBody} extends {@link TeaModel}
     *
     * <p>DescribePropertyScaDetailResponseBody</p>
     */
    public static class Propertys extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BizType")
        private String bizType;

        @com.aliyun.core.annotation.NameInMap("BizTypeDispaly")
        private String bizTypeDispaly;

        @com.aliyun.core.annotation.NameInMap("Cmdline")
        private String cmdline;

        @com.aliyun.core.annotation.NameInMap("ConfigPath")
        private String configPath;

        @com.aliyun.core.annotation.NameInMap("ContainerName")
        private String containerName;

        @com.aliyun.core.annotation.NameInMap("CreateTimestamp")
        private Long createTimestamp;

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

        @com.aliyun.core.annotation.NameInMap("ListenIp")
        private String listenIp;

        @com.aliyun.core.annotation.NameInMap("ListenProtocol")
        private String listenProtocol;

        @com.aliyun.core.annotation.NameInMap("ListenStatus")
        private String listenStatus;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Path")
        private String path;

        @com.aliyun.core.annotation.NameInMap("Pid")
        private String pid;

        @com.aliyun.core.annotation.NameInMap("PodName")
        private String podName;

        @com.aliyun.core.annotation.NameInMap("Port")
        private String port;

        @com.aliyun.core.annotation.NameInMap("Ppid")
        private String ppid;

        @com.aliyun.core.annotation.NameInMap("ProcessStarted")
        private Long processStarted;

        @com.aliyun.core.annotation.NameInMap("ProcessUser")
        private String processUser;

        @com.aliyun.core.annotation.NameInMap("Proof")
        private String proof;

        @com.aliyun.core.annotation.NameInMap("RuntimeEnvVersion")
        private String runtimeEnvVersion;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        @com.aliyun.core.annotation.NameInMap("Uuid")
        private String uuid;

        @com.aliyun.core.annotation.NameInMap("Version")
        private String version;

        @com.aliyun.core.annotation.NameInMap("WebPath")
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
            this.podName = builder.podName;
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
         * @return podName
         */
        public String getPodName() {
            return this.podName;
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
            private String podName; 
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
             * <p>The type of the middleware, database, or web service. Valid values:</p>
             * <ul>
             * <li><strong>system_service</strong>: system service</li>
             * <li><strong>software_library</strong>: software library</li>
             * <li><strong>docker_component</strong>: container component</li>
             * <li><strong>database</strong>: database</li>
             * <li><strong>web_container</strong>: web container</li>
             * <li><strong>jar</strong>: JAR package</li>
             * <li><strong>web_framework</strong>: web framework</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>software_library</p>
             */
            public Builder bizType(String bizType) {
                this.bizType = bizType;
                return this;
            }

            /**
             * <p>The display name of the type of the middleware, database, or web service . Valid values:</p>
             * <ul>
             * <li>System service</li>
             * <li>Software library</li>
             * <li>Container component</li>
             * <li>Database</li>
             * <li>Web container</li>
             * <li>JAR package</li>
             * <li>Web framework</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>System Service</p>
             */
            public Builder bizTypeDispaly(String bizTypeDispaly) {
                this.bizTypeDispaly = bizTypeDispaly;
                return this;
            }

            /**
             * <p>The command line of the process.</p>
             * 
             * <strong>example:</strong>
             * <p>/sbin/dhclient -H iz2zeflhhbtk8gtxzt087az -1 -q -lf /var/lib/dhclient/dhclient--eth0.lease -pf /var/run/dhclient-eth0.pid eth0</p>
             */
            public Builder cmdline(String cmdline) {
                this.cmdline = cmdline;
                return this;
            }

            /**
             * <p>The path to the configuration file.</p>
             * 
             * <strong>example:</strong>
             * <p>/etc/my.cnf</p>
             */
            public Builder configPath(String configPath) {
                this.configPath = configPath;
                return this;
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
             * <p>The latest collection timestamp, which indicates the last timestamp when Security Center collected the information about the middleware, database, or web service. Unit: milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1597987834000</p>
             */
            public Builder createTimestamp(Long createTimestamp) {
                this.createTimestamp = createTimestamp;
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
             * <p>The ID of the server on which the middleware, database, or web service is run.</p>
             * 
             * <strong>example:</strong>
             * <p>i-2zeclqj7ti****</p>
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * <p>The name of the server on which the middleware, database, or web service is run.</p>
             * 
             * <strong>example:</strong>
             * <p>Test01</p>
             */
            public Builder instanceName(String instanceName) {
                this.instanceName = instanceName;
                return this;
            }

            /**
             * <p>The public IP address of the server on which the middleware, database, or web service is run.</p>
             * 
             * <strong>example:</strong>
             * <p>47.42.XX.XX</p>
             */
            public Builder internetIp(String internetIp) {
                this.internetIp = internetIp;
                return this;
            }

            /**
             * <p>The private IP address of the server on which the middleware, database, or web service is run.</p>
             * 
             * <strong>example:</strong>
             * <p>192.210.XX.XX</p>
             */
            public Builder intranetIp(String intranetIp) {
                this.intranetIp = intranetIp;
                return this;
            }

            /**
             * <p>The public IP address of the server on which the middleware, database, or web service is run.</p>
             * 
             * <strong>example:</strong>
             * <p>47.42.XX.XX</p>
             */
            public Builder ip(String ip) {
                this.ip = ip;
                return this;
            }

            /**
             * <p>The IP address that the process monitors.</p>
             * 
             * <strong>example:</strong>
             * <p>0.0.XX.XX</p>
             */
            public Builder listenIp(String listenIp) {
                this.listenIp = listenIp;
                return this;
            }

            /**
             * <p>The protocol of the traffic on which the process listens. Valid values:</p>
             * <ul>
             * <li><strong>UDP</strong></li>
             * <li><strong>TCP</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>UDP</p>
             */
            public Builder listenProtocol(String listenProtocol) {
                this.listenProtocol = listenProtocol;
                return this;
            }

            /**
             * <p>The listening status of the process. Valid values:</p>
             * <ul>
             * <li><strong>NONE</strong>: not listening</li>
             * <li><strong>LISTEN</strong>: listening</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>NONE</p>
             */
            public Builder listenStatus(String listenStatus) {
                this.listenStatus = listenStatus;
                return this;
            }

            /**
             * <p>The name of the middleware, database, or web service.</p>
             * 
             * <strong>example:</strong>
             * <p>openssl</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The path of the middleware, database, or web service.</p>
             * 
             * <strong>example:</strong>
             * <p>/usr/lib64/libssl.so.1.0.2k</p>
             */
            public Builder path(String path) {
                this.path = path;
                return this;
            }

            /**
             * <p>The PID.</p>
             * 
             * <strong>example:</strong>
             * <p>756</p>
             */
            public Builder pid(String pid) {
                this.pid = pid;
                return this;
            }

            /**
             * <p>The name of the Kubernetes pod.</p>
             * 
             * <strong>example:</strong>
             * <p>myapp-pod</p>
             */
            public Builder podName(String podName) {
                this.podName = podName;
                return this;
            }

            /**
             * <p>The port of the middleware, database, or web service.</p>
             * 
             * <strong>example:</strong>
             * <p>68</p>
             */
            public Builder port(String port) {
                this.port = port;
                return this;
            }

            /**
             * <p>The ID of the parent process.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder ppid(String ppid) {
                this.ppid = ppid;
                return this;
            }

            /**
             * <p>The timestamp when the process starts. Unit: milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1596539788</p>
             */
            public Builder processStarted(Long processStarted) {
                this.processStarted = processStarted;
                return this;
            }

            /**
             * <p>The name of the user who runs the process.</p>
             * 
             * <strong>example:</strong>
             * <p>root</p>
             */
            public Builder processUser(String processUser) {
                this.processUser = processUser;
                return this;
            }

            /**
             * <p>The version verification information about the middleware, database, or web service.</p>
             * 
             * <strong>example:</strong>
             * <p>/usr/lib64/libssl.so.1.0.2k</p>
             */
            public Builder proof(String proof) {
                this.proof = proof;
                return this;
            }

            /**
             * <p>The version of the runtime environment.</p>
             * <blockquote>
             * <p> The value of this parameter can be the Java Development Kit (JDK) version of the runtime environment for a Java process.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>1.8.0_144</p>
             */
            public Builder runtimeEnvVersion(String runtimeEnvVersion) {
                this.runtimeEnvVersion = runtimeEnvVersion;
                return this;
            }

            /**
             * <p>The type of the middleware, database, or web service.</p>
             * 
             * <strong>example:</strong>
             * <p>library</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * <p>The UUID of the server on which the middleware, database, or web service is run.</p>
             * 
             * <strong>example:</strong>
             * <p>uuid-02ebabe7-1c19-a****</p>
             */
            public Builder uuid(String uuid) {
                this.uuid = uuid;
                return this;
            }

            /**
             * <p>The version of the middleware, database, or web service.</p>
             * 
             * <strong>example:</strong>
             * <p>1.0.2k</p>
             */
            public Builder version(String version) {
                this.version = version;
                return this;
            }

            /**
             * <p>The web directory.</p>
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
