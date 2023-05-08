// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribePropertyCronDetailResponseBody} extends {@link TeaModel}
 *
 * <p>DescribePropertyCronDetailResponseBody</p>
 */
public class DescribePropertyCronDetailResponseBody extends TeaModel {
    @NameInMap("PageInfo")
    private PageInfo pageInfo;

    @NameInMap("Propertys")
    private java.util.List < Propertys> propertys;

    @NameInMap("RequestId")
    private String requestId;

    private DescribePropertyCronDetailResponseBody(Builder builder) {
        this.pageInfo = builder.pageInfo;
        this.propertys = builder.propertys;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribePropertyCronDetailResponseBody create() {
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
         * The username of the account that runs the scheduled task.
         */
        public Builder pageInfo(PageInfo pageInfo) {
            this.pageInfo = pageInfo;
            return this;
        }

        /**
         * 10
         */
        public Builder propertys(java.util.List < Propertys> propertys) {
            this.propertys = propertys;
            return this;
        }

        /**
         * The username of the account that runs the scheduled task.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribePropertyCronDetailResponseBody build() {
            return new DescribePropertyCronDetailResponseBody(this);
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
             * The path to the scheduled task.
             */
            public Builder count(Integer count) {
                this.count = count;
                return this;
            }

            /**
             * The UUID of the server.
             */
            public Builder currentPage(Integer currentPage) {
                this.currentPage = currentPage;
                return this;
            }

            /**
             * The interval at which the scheduled task is performed.
             */
            public Builder pageSize(Integer pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            /**
             * The number of entries returned on the current page.
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
        @NameInMap("Cmd")
        private String cmd;

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

        @NameInMap("Md5")
        private String md5;

        @NameInMap("Period")
        private String period;

        @NameInMap("Source")
        private String source;

        @NameInMap("User")
        private String user;

        @NameInMap("Uuid")
        private String uuid;

        private Propertys(Builder builder) {
            this.cmd = builder.cmd;
            this.createTimestamp = builder.createTimestamp;
            this.instanceId = builder.instanceId;
            this.instanceName = builder.instanceName;
            this.internetIp = builder.internetIp;
            this.intranetIp = builder.intranetIp;
            this.ip = builder.ip;
            this.md5 = builder.md5;
            this.period = builder.period;
            this.source = builder.source;
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
         * @return cmd
         */
        public String getCmd() {
            return this.cmd;
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
         * @return md5
         */
        public String getMd5() {
            return this.md5;
        }

        /**
         * @return period
         */
        public String getPeriod() {
            return this.period;
        }

        /**
         * @return source
         */
        public String getSource() {
            return this.source;
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
            private String cmd; 
            private Long createTimestamp; 
            private String instanceId; 
            private String instanceName; 
            private String internetIp; 
            private String intranetIp; 
            private String ip; 
            private String md5; 
            private String period; 
            private String source; 
            private String user; 
            private String uuid; 

            /**
             * The number of the page to return. Default value: **1**.
             */
            public Builder cmd(String cmd) {
                this.cmd = cmd;
                return this;
            }

            /**
             * DescribePropertyCronDetail
             */
            public Builder createTimestamp(Long createTimestamp) {
                this.createTimestamp = createTimestamp;
                return this;
            }

            /**
             * The IP addresses of the server.
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * The ID of the request, which is used to locate and troubleshoot issues.
             */
            public Builder instanceName(String instanceName) {
                this.instanceName = instanceName;
                return this;
            }

            /**
             * The pagination information.
             */
            public Builder internetIp(String internetIp) {
                this.internetIp = internetIp;
                return this;
            }

            /**
             * The name of the server.
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
             * Queries the details of scheduled tasks on the Host page.
             */
            public Builder md5(String md5) {
                this.md5 = md5;
                return this;
            }

            /**
             * The number of entries returned per page. Default value: **10**.
             */
            public Builder period(String period) {
                this.period = period;
                return this;
            }

            /**
             * The MD5 hash value of the path to the scheduled task.
             */
            public Builder source(String source) {
                this.source = source;
                return this;
            }

            /**
             * root
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

            public Propertys build() {
                return new Propertys(this);
            } 

        } 

    }
}
