// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribePropertyProcDetailResponseBody} extends {@link TeaModel}
 *
 * <p>DescribePropertyProcDetailResponseBody</p>
 */
public class DescribePropertyProcDetailResponseBody extends TeaModel {
    @NameInMap("PageInfo")
    private PageInfo pageInfo;

    @NameInMap("Propertys")
    private java.util.List < Propertys> propertys;

    @NameInMap("RequestId")
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

        public DescribePropertyProcDetailResponseBody build() {
            return new DescribePropertyProcDetailResponseBody(this);
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
        @NameInMap("Cmdline")
        private String cmdline;

        @NameInMap("Create")
        private String create;

        @NameInMap("CreateTimestamp")
        private Long createTimestamp;

        @NameInMap("EuidName")
        private String euidName;

        @NameInMap("InstanceId")
        private String instanceId;

        @NameInMap("InstanceName")
        private String instanceName;

        @NameInMap("InternetIp")
        private String internetIp;

        @NameInMap("IntranetIp")
        private String intranetIp;

        @NameInMap("IsPackage")
        private Integer isPackage;

        @NameInMap("Md5")
        private String md5;

        @NameInMap("Name")
        private String name;

        @NameInMap("Path")
        private String path;

        @NameInMap("Pid")
        private String pid;

        @NameInMap("Pname")
        private String pname;

        @NameInMap("StartTime")
        private String startTime;

        @NameInMap("StartTimeDt")
        private Long startTimeDt;

        @NameInMap("State")
        private String state;

        @NameInMap("User")
        private String user;

        @NameInMap("Uuid")
        private String uuid;

        private Propertys(Builder builder) {
            this.cmdline = builder.cmdline;
            this.create = builder.create;
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
         * @return create
         */
        public String getCreate() {
            return this.create;
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
            private String create; 
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

            /**
             * Cmdline.
             */
            public Builder cmdline(String cmdline) {
                this.cmdline = cmdline;
                return this;
            }

            /**
             * Create.
             */
            public Builder create(String create) {
                this.create = create;
                return this;
            }

            /**
             * CreateTimestamp.
             */
            public Builder createTimestamp(Long createTimestamp) {
                this.createTimestamp = createTimestamp;
                return this;
            }

            /**
             * EuidName.
             */
            public Builder euidName(String euidName) {
                this.euidName = euidName;
                return this;
            }

            /**
             * InstanceId.
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * InstanceName.
             */
            public Builder instanceName(String instanceName) {
                this.instanceName = instanceName;
                return this;
            }

            /**
             * InternetIp.
             */
            public Builder internetIp(String internetIp) {
                this.internetIp = internetIp;
                return this;
            }

            /**
             * IntranetIp.
             */
            public Builder intranetIp(String intranetIp) {
                this.intranetIp = intranetIp;
                return this;
            }

            /**
             * IsPackage.
             */
            public Builder isPackage(Integer isPackage) {
                this.isPackage = isPackage;
                return this;
            }

            /**
             * Md5.
             */
            public Builder md5(String md5) {
                this.md5 = md5;
                return this;
            }

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * Path.
             */
            public Builder path(String path) {
                this.path = path;
                return this;
            }

            /**
             * Pid.
             */
            public Builder pid(String pid) {
                this.pid = pid;
                return this;
            }

            /**
             * Pname.
             */
            public Builder pname(String pname) {
                this.pname = pname;
                return this;
            }

            /**
             * StartTime.
             */
            public Builder startTime(String startTime) {
                this.startTime = startTime;
                return this;
            }

            /**
             * StartTimeDt.
             */
            public Builder startTimeDt(Long startTimeDt) {
                this.startTimeDt = startTimeDt;
                return this;
            }

            /**
             * State.
             */
            public Builder state(String state) {
                this.state = state;
                return this;
            }

            /**
             * User.
             */
            public Builder user(String user) {
                this.user = user;
                return this;
            }

            /**
             * Uuid.
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
