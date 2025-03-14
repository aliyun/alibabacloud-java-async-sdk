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
 * {@link DescribePropertyScaProcessDetailResponseBody} extends {@link TeaModel}
 *
 * <p>DescribePropertyScaProcessDetailResponseBody</p>
 */
public class DescribePropertyScaProcessDetailResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("PageInfo")
    private PageInfo pageInfo;

    @com.aliyun.core.annotation.NameInMap("Propertys")
    private java.util.List<Propertys> propertys;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribePropertyScaProcessDetailResponseBody(Builder builder) {
        this.pageInfo = builder.pageInfo;
        this.propertys = builder.propertys;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribePropertyScaProcessDetailResponseBody create() {
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

        private Builder(DescribePropertyScaProcessDetailResponseBody model) {
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
         * <p>The processes collected by the asset fingerprints feature.</p>
         */
        public Builder propertys(java.util.List<Propertys> propertys) {
            this.propertys = propertys;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>ADE57832-9666-511C-9A80-B87DE2E8****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribePropertyScaProcessDetailResponseBody build() {
            return new DescribePropertyScaProcessDetailResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribePropertyScaProcessDetailResponseBody} extends {@link TeaModel}
     *
     * <p>DescribePropertyScaProcessDetailResponseBody</p>
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
             * <p>10</p>
             */
            public Builder count(Integer count) {
                this.count = count;
                return this;
            }

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
             * <p>The number of entries per page. Default value: <strong>10</strong>.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder pageSize(Integer pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            /**
             * <p>The total number of entries returned.</p>
             * 
             * <strong>example:</strong>
             * <p>69</p>
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
     * {@link DescribePropertyScaProcessDetailResponseBody} extends {@link TeaModel}
     *
     * <p>DescribePropertyScaProcessDetailResponseBody</p>
     */
    public static class Propertys extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Cmdline")
        private String cmdline;

        @com.aliyun.core.annotation.NameInMap("CreateTimestamp")
        private Long createTimestamp;

        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("InstanceName")
        private String instanceName;

        @com.aliyun.core.annotation.NameInMap("InternetIp")
        private String internetIp;

        @com.aliyun.core.annotation.NameInMap("IntranetIp")
        private String intranetIp;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Pid")
        private String pid;

        @com.aliyun.core.annotation.NameInMap("Uuid")
        private String uuid;

        private Propertys(Builder builder) {
            this.cmdline = builder.cmdline;
            this.createTimestamp = builder.createTimestamp;
            this.instanceId = builder.instanceId;
            this.instanceName = builder.instanceName;
            this.internetIp = builder.internetIp;
            this.intranetIp = builder.intranetIp;
            this.name = builder.name;
            this.pid = builder.pid;
            this.uuid = builder.uuid;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Propertys create() {
            return builder().build();
        }

        /**
         * @return cmdline
         */
        public String getCmdline() {
            return this.cmdline;
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
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return pid
         */
        public String getPid() {
            return this.pid;
        }

        /**
         * @return uuid
         */
        public String getUuid() {
            return this.uuid;
        }

        public static final class Builder {
            private String cmdline; 
            private Long createTimestamp; 
            private String instanceId; 
            private String instanceName; 
            private String internetIp; 
            private String intranetIp; 
            private String name; 
            private String pid; 
            private String uuid; 

            private Builder() {
            } 

            private Builder(Propertys model) {
                this.cmdline = model.cmdline;
                this.createTimestamp = model.createTimestamp;
                this.instanceId = model.instanceId;
                this.instanceName = model.instanceName;
                this.internetIp = model.internetIp;
                this.intranetIp = model.intranetIp;
                this.name = model.name;
                this.pid = model.pid;
                this.uuid = model.uuid;
            } 

            /**
             * <p>The command line of the process.</p>
             * 
             * <strong>example:</strong>
             * <p>java -Xms128m -Xmx512m -DNACOS_URL=<a href="http://10.184.XX.XX:8848">http://10.184.XX.XX:8848</a> -DNACOS_NAMESPACE=iam-sit -jar /opt/service/xxl-job/xxl-job-admin-2.3.0.jar</p>
             */
            public Builder cmdline(String cmdline) {
                this.cmdline = cmdline;
                return this;
            }

            /**
             * <p>The timestamp at which the last asset fingerprint collection is performed. Unit: milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1597987834000</p>
             */
            public Builder createTimestamp(Long createTimestamp) {
                this.createTimestamp = createTimestamp;
                return this;
            }

            /**
             * <p>The instance ID of the server.</p>
             * 
             * <strong>example:</strong>
             * <p>i-hp35tftuh52wbp1g****</p>
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * <p>The instance name of the server.</p>
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
             * <p>120.26.XX.XX</p>
             */
            public Builder internetIp(String internetIp) {
                this.internetIp = internetIp;
                return this;
            }

            /**
             * <p>The private IP address of the server.</p>
             * 
             * <strong>example:</strong>
             * <p>192.168.XX.XX</p>
             */
            public Builder intranetIp(String intranetIp) {
                this.intranetIp = intranetIp;
                return this;
            }

            /**
             * <p>The name of the process.</p>
             * 
             * <strong>example:</strong>
             * <p>java</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The ID of the process.</p>
             * 
             * <strong>example:</strong>
             * <p>522</p>
             */
            public Builder pid(String pid) {
                this.pid = pid;
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

            public Propertys build() {
                return new Propertys(this);
            } 

        } 

    }
}
