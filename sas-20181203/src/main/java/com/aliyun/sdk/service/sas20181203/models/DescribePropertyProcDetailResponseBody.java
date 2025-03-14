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
 * {@link DescribePropertyProcDetailResponseBody} extends {@link TeaModel}
 *
 * <p>DescribePropertyProcDetailResponseBody</p>
 */
public class DescribePropertyProcDetailResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("PageInfo")
    private PageInfo pageInfo;

    @com.aliyun.core.annotation.NameInMap("Propertys")
    private java.util.List<Propertys> propertys;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribePropertyProcDetailResponseBody(Builder builder) {
        this.pageInfo = builder.pageInfo;
        this.propertys = builder.propertys;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribePropertyProcDetailResponseBody create() {
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

        private Builder(DescribePropertyProcDetailResponseBody model) {
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
         * <p>An array that consists of the fingerprints of the processes.</p>
         */
        public Builder propertys(java.util.List<Propertys> propertys) {
            this.propertys = propertys;
            return this;
        }

        /**
         * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
         * 
         * <strong>example:</strong>
         * <p>AA47D46F-10DE-138C-BBB4-8A0003F75CD7</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribePropertyProcDetailResponseBody build() {
            return new DescribePropertyProcDetailResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribePropertyProcDetailResponseBody} extends {@link TeaModel}
     *
     * <p>DescribePropertyProcDetailResponseBody</p>
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
             * <p>1</p>
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
             * <p>1</p>
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
     * {@link DescribePropertyProcDetailResponseBody} extends {@link TeaModel}
     *
     * <p>DescribePropertyProcDetailResponseBody</p>
     */
    public static class Propertys extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Cmdline")
        private String cmdline;

        @com.aliyun.core.annotation.NameInMap("CreateTimestamp")
        private Long createTimestamp;

        @com.aliyun.core.annotation.NameInMap("EuidName")
        private String euidName;

        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("InstanceName")
        private String instanceName;

        @com.aliyun.core.annotation.NameInMap("InternetIp")
        private String internetIp;

        @com.aliyun.core.annotation.NameInMap("IntranetIp")
        private String intranetIp;

        @com.aliyun.core.annotation.NameInMap("IsPackage")
        private Integer isPackage;

        @com.aliyun.core.annotation.NameInMap("Md5")
        private String md5;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Path")
        private String path;

        @com.aliyun.core.annotation.NameInMap("Pid")
        private String pid;

        @com.aliyun.core.annotation.NameInMap("Pname")
        private String pname;

        @com.aliyun.core.annotation.NameInMap("StartTime")
        private String startTime;

        @com.aliyun.core.annotation.NameInMap("StartTimeDt")
        private Long startTimeDt;

        @com.aliyun.core.annotation.NameInMap("State")
        private String state;

        @com.aliyun.core.annotation.NameInMap("User")
        private String user;

        @com.aliyun.core.annotation.NameInMap("Uuid")
        private String uuid;

        private Propertys(Builder builder) {
            this.cmdline = builder.cmdline;
            this.createTimestamp = builder.createTimestamp;
            this.euidName = builder.euidName;
            this.instanceId = builder.instanceId;
            this.instanceName = builder.instanceName;
            this.internetIp = builder.internetIp;
            this.intranetIp = builder.intranetIp;
            this.isPackage = builder.isPackage;
            this.md5 = builder.md5;
            this.name = builder.name;
            this.path = builder.path;
            this.pid = builder.pid;
            this.pname = builder.pname;
            this.startTime = builder.startTime;
            this.startTimeDt = builder.startTimeDt;
            this.state = builder.state;
            this.user = builder.user;
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
         * @return euidName
         */
        public String getEuidName() {
            return this.euidName;
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
         * @return isPackage
         */
        public Integer getIsPackage() {
            return this.isPackage;
        }

        /**
         * @return md5
         */
        public String getMd5() {
            return this.md5;
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
         * @return pname
         */
        public String getPname() {
            return this.pname;
        }

        /**
         * @return startTime
         */
        public String getStartTime() {
            return this.startTime;
        }

        /**
         * @return startTimeDt
         */
        public Long getStartTimeDt() {
            return this.startTimeDt;
        }

        /**
         * @return state
         */
        public String getState() {
            return this.state;
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

        public static final class Builder {
            private String cmdline; 
            private Long createTimestamp; 
            private String euidName; 
            private String instanceId; 
            private String instanceName; 
            private String internetIp; 
            private String intranetIp; 
            private Integer isPackage; 
            private String md5; 
            private String name; 
            private String path; 
            private String pid; 
            private String pname; 
            private String startTime; 
            private Long startTimeDt; 
            private String state; 
            private String user; 
            private String uuid; 

            private Builder() {
            } 

            private Builder(Propertys model) {
                this.cmdline = model.cmdline;
                this.createTimestamp = model.createTimestamp;
                this.euidName = model.euidName;
                this.instanceId = model.instanceId;
                this.instanceName = model.instanceName;
                this.internetIp = model.internetIp;
                this.intranetIp = model.intranetIp;
                this.isPackage = model.isPackage;
                this.md5 = model.md5;
                this.name = model.name;
                this.path = model.path;
                this.pid = model.pid;
                this.pname = model.pname;
                this.startTime = model.startTime;
                this.startTimeDt = model.startTimeDt;
                this.state = model.state;
                this.user = model.user;
                this.uuid = model.uuid;
            } 

            /**
             * <p>The startup parameter of the process.</p>
             * 
             * <strong>example:</strong>
             * <p>./8888</p>
             */
            public Builder cmdline(String cmdline) {
                this.cmdline = cmdline;
                return this;
            }

            /**
             * <p>The timestamp of last data collection. Unit: milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1565686951000</p>
             */
            public Builder createTimestamp(Long createTimestamp) {
                this.createTimestamp = createTimestamp;
                return this;
            }

            /**
             * <p>The permission that is required to run the process.</p>
             * 
             * <strong>example:</strong>
             * <p>root</p>
             */
            public Builder euidName(String euidName) {
                this.euidName = euidName;
                return this;
            }

            /**
             * <p>The ID of the server that is associated with the process.</p>
             * 
             * <strong>example:</strong>
             * <p>i-hp35tftuh52wbp1g****</p>
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * <p>The name of the server that is associated with the process.</p>
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
             * <p>192.168.XX.XX</p>
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
             * <p>Indicates whether the process is a package installation process. Valid values:</p>
             * <ul>
             * <li><strong>1</strong>: yes</li>
             * <li><strong>0</strong>: no</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder isPackage(Integer isPackage) {
                this.isPackage = isPackage;
                return this;
            }

            /**
             * <p>The MD5 hash value of the process file.</p>
             * 
             * <strong>example:</strong>
             * <p>842644ea3d88bd7f7e14c1c089ef****</p>
             */
            public Builder md5(String md5) {
                this.md5 = md5;
                return this;
            }

            /**
             * <p>The name of the process.</p>
             * 
             * <strong>example:</strong>
             * <p>agetty</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The path of the process.</p>
             */
            public Builder path(String path) {
                this.path = path;
                return this;
            }

            /**
             * <p>The ID of the process.</p>
             * 
             * <strong>example:</strong>
             * <p>12826</p>
             */
            public Builder pid(String pid) {
                this.pid = pid;
                return this;
            }

            /**
             * <p>The name of the parent process to which the process belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>start***.s</p>
             */
            public Builder pname(String pname) {
                this.pname = pname;
                return this;
            }

            /**
             * <p>The time when the process starts.</p>
             * 
             * <strong>example:</strong>
             * <p>2019-08-07 10:09:05</p>
             */
            public Builder startTime(String startTime) {
                this.startTime = startTime;
                return this;
            }

            /**
             * <p>The timestamp when the process starts. Unit: milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1648783107000</p>
             */
            public Builder startTimeDt(Long startTimeDt) {
                this.startTimeDt = startTimeDt;
                return this;
            }

            /**
             * <p>The status of the process.</p>
             * 
             * <strong>example:</strong>
             * <p>sleeping</p>
             */
            public Builder state(String state) {
                this.state = state;
                return this;
            }

            /**
             * <p>The user who runs the process.</p>
             * 
             * <strong>example:</strong>
             * <p>root</p>
             */
            public Builder user(String user) {
                this.user = user;
                return this;
            }

            /**
             * <p>The UUID of the server that is associated with the process.</p>
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
