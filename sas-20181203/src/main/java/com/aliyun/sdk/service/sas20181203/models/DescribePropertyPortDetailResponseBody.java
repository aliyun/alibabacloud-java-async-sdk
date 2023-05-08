// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribePropertyPortDetailResponseBody} extends {@link TeaModel}
 *
 * <p>DescribePropertyPortDetailResponseBody</p>
 */
public class DescribePropertyPortDetailResponseBody extends TeaModel {
    @NameInMap("PageInfo")
    private PageInfo pageInfo;

    @NameInMap("Propertys")
    private java.util.List < Propertys> propertys;

    @NameInMap("RequestId")
    private String requestId;

    private DescribePropertyPortDetailResponseBody(Builder builder) {
        this.pageInfo = builder.pageInfo;
        this.propertys = builder.propertys;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribePropertyPortDetailResponseBody create() {
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
         * 192.168.XX.XX
         */
        public Builder pageInfo(PageInfo pageInfo) {
            this.pageInfo = pageInfo;
            return this;
        }

        /**
         * Specifies whether fuzzy search by port number is supported. If you want to use fuzzy search, set the parameter to **1**. If you set the parameter to a different value or leave the parameter empty, fuzzy search is not supported.
         */
        public Builder propertys(java.util.List < Propertys> propertys) {
            this.propertys = propertys;
            return this;
        }

        /**
         * 0.0.XX.XX
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribePropertyPortDetailResponseBody build() {
            return new DescribePropertyPortDetailResponseBody(this);
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
             * The UUID of the server.
             */
            public Builder count(Integer count) {
                this.count = count;
                return this;
            }

            /**
             * An array that consists of the fingerprints of the ports.
             */
            public Builder currentPage(Integer currentPage) {
                this.currentPage = currentPage;
                return this;
            }

            /**
             * The ID of the server process that listens on the port.
             */
            public Builder pageSize(Integer pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            /**
             * The name of the server process.
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
        @NameInMap("BindIp")
        private String bindIp;

        @NameInMap("CreateTimestamp")
        private Long createTimestamp;

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

        @NameInMap("Pid")
        private String pid;

        @NameInMap("Port")
        private String port;

        @NameInMap("ProcName")
        private String procName;

        @NameInMap("Proto")
        private String proto;

        @NameInMap("Uuid")
        private String uuid;

        private Propertys(Builder builder) {
            this.bindIp = builder.bindIp;
            this.createTimestamp = builder.createTimestamp;
            this.instanceId = builder.instanceId;
            this.instanceName = builder.instanceName;
            this.internetIp = builder.internetIp;
            this.intranetIp = builder.intranetIp;
            this.ip = builder.ip;
            this.pid = builder.pid;
            this.port = builder.port;
            this.procName = builder.procName;
            this.proto = builder.proto;
            this.uuid = builder.uuid;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Propertys create() {
            return builder().build();
        }

        /**
         * @return bindIp
         */
        public String getBindIp() {
            return this.bindIp;
        }

        /**
         * @return createTimestamp
         */
        public Long getCreateTimestamp() {
            return this.createTimestamp;
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
         * @return procName
         */
        public String getProcName() {
            return this.procName;
        }

        /**
         * @return proto
         */
        public String getProto() {
            return this.proto;
        }

        /**
         * @return uuid
         */
        public String getUuid() {
            return this.uuid;
        }

        public static final class Builder {
            private String bindIp; 
            private Long createTimestamp; 
            private String instanceId; 
            private String instanceName; 
            private String internetIp; 
            private String intranetIp; 
            private String ip; 
            private String pid; 
            private String port; 
            private String procName; 
            private String proto; 
            private String uuid; 

            /**
             * The pagination information.
             */
            public Builder bindIp(String bindIp) {
                this.bindIp = bindIp;
                return this;
            }

            /**
             * Queries the fingerprints of ports on a specified server.
             */
            public Builder createTimestamp(Long createTimestamp) {
                this.createTimestamp = createTimestamp;
                return this;
            }

            /**
             * The IP address of the network interface controller (NIC) that is bound to the listening port.
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * The UUID of the server.
             */
            public Builder instanceName(String instanceName) {
                this.instanceName = instanceName;
                return this;
            }

            /**
             * The number of entries returned on the current page.
             */
            public Builder internetIp(String internetIp) {
                this.internetIp = internetIp;
                return this;
            }

            /**
             * The number of the page to return. Default value: **1**.
             */
            public Builder intranetIp(String intranetIp) {
                this.intranetIp = intranetIp;
                return this;
            }

            /**
             * The ID of the server.
             */
            public Builder ip(String ip) {
                this.ip = ip;
                return this;
            }

            /**
             * 10
             */
            public Builder pid(String pid) {
                this.pid = pid;
                return this;
            }

            /**
             * The name of the server.
             */
            public Builder port(String port) {
                this.port = port;
                return this;
            }

            /**
             * sshd
             */
            public Builder procName(String procName) {
                this.procName = procName;
                return this;
            }

            /**
             * The ID of the request, which is used to locate and troubleshoot issues.
             */
            public Builder proto(String proto) {
                this.proto = proto;
                return this;
            }

            /**
             * The number of entries returned per page. Default value: **10**.
             */
            public Builder uuid(String uuid) {
                this.uuid = uuid;
                return this;
            }

            public Propertys build() {
                return new Propertys(this);
            } 

        } 

    }
}
