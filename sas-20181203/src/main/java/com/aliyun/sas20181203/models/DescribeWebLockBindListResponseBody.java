// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;

/**
 * {@link DescribeWebLockBindListResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeWebLockBindListResponseBody</p>
 */
public class DescribeWebLockBindListResponseBody extends TeaModel {
    @NameInMap("BindList")
    private java.util.List < BindList> bindList;

    @NameInMap("CurrentPage")
    private Integer currentPage;

    @NameInMap("PageSize")
    private Integer pageSize;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TotalCount")
    private Integer totalCount;


    private DescribeWebLockBindListResponseBody(Builder builder) {
        this.bindList = builder.bindList;
        this.currentPage = builder.currentPage;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeWebLockBindListResponseBody create() {
        return builder().build();
    }

    /**
     * @return bindList
     */
    public java.util.List < BindList> getBindList() {
        return this.bindList;
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
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private java.util.List < BindList> bindList; 
        private Integer currentPage; 
        private Integer pageSize; 
        private String requestId; 
        private Integer totalCount; 

        /**
         * <p>BindList.</p>
         */
        public Builder bindList(java.util.List < BindList> bindList) {
            this.bindList = bindList;
            return this;
        }

        /**
         * <p>CurrentPage.</p>
         */
        public Builder currentPage(Integer currentPage) {
            this.currentPage = currentPage;
            return this;
        }

        /**
         * <p>PageSize.</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>RequestId.</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>TotalCount.</p>
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeWebLockBindListResponseBody build() {
            return new DescribeWebLockBindListResponseBody(this);
        } 

    } 

    public static class BindList extends TeaModel {
        @NameInMap("AuditCount")
        private String auditCount;

        @NameInMap("BlockCount")
        private String blockCount;

        @NameInMap("DirCount")
        private String dirCount;

        @NameInMap("InstanceName")
        private String instanceName;

        @NameInMap("InternetIp")
        private String internetIp;

        @NameInMap("IntranetIp")
        private String intranetIp;

        @NameInMap("Os")
        private String os;

        @NameInMap("Percent")
        private Integer percent;

        @NameInMap("ServiceCode")
        private String serviceCode;

        @NameInMap("ServiceDetail")
        private String serviceDetail;

        @NameInMap("ServiceStatus")
        private String serviceStatus;

        @NameInMap("Status")
        private String status;

        @NameInMap("Uuid")
        private String uuid;


        private BindList(Builder builder) {
            this.auditCount = builder.auditCount;
            this.blockCount = builder.blockCount;
            this.dirCount = builder.dirCount;
            this.instanceName = builder.instanceName;
            this.internetIp = builder.internetIp;
            this.intranetIp = builder.intranetIp;
            this.os = builder.os;
            this.percent = builder.percent;
            this.serviceCode = builder.serviceCode;
            this.serviceDetail = builder.serviceDetail;
            this.serviceStatus = builder.serviceStatus;
            this.status = builder.status;
            this.uuid = builder.uuid;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static BindList create() {
            return builder().build();
        }

        /**
         * @return auditCount
         */
        public String getAuditCount() {
            return this.auditCount;
        }

        /**
         * @return blockCount
         */
        public String getBlockCount() {
            return this.blockCount;
        }

        /**
         * @return dirCount
         */
        public String getDirCount() {
            return this.dirCount;
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
         * @return os
         */
        public String getOs() {
            return this.os;
        }

        /**
         * @return percent
         */
        public Integer getPercent() {
            return this.percent;
        }

        /**
         * @return serviceCode
         */
        public String getServiceCode() {
            return this.serviceCode;
        }

        /**
         * @return serviceDetail
         */
        public String getServiceDetail() {
            return this.serviceDetail;
        }

        /**
         * @return serviceStatus
         */
        public String getServiceStatus() {
            return this.serviceStatus;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return uuid
         */
        public String getUuid() {
            return this.uuid;
        }

        public static final class Builder {
            private String auditCount; 
            private String blockCount; 
            private String dirCount; 
            private String instanceName; 
            private String internetIp; 
            private String intranetIp; 
            private String os; 
            private Integer percent; 
            private String serviceCode; 
            private String serviceDetail; 
            private String serviceStatus; 
            private String status; 
            private String uuid; 

            /**
             * <p>AuditCount.</p>
             */
            public Builder auditCount(String auditCount) {
                this.auditCount = auditCount;
                return this;
            }

            /**
             * <p>BlockCount.</p>
             */
            public Builder blockCount(String blockCount) {
                this.blockCount = blockCount;
                return this;
            }

            /**
             * <p>DirCount.</p>
             */
            public Builder dirCount(String dirCount) {
                this.dirCount = dirCount;
                return this;
            }

            /**
             * <p>InstanceName.</p>
             */
            public Builder instanceName(String instanceName) {
                this.instanceName = instanceName;
                return this;
            }

            /**
             * <p>InternetIp.</p>
             */
            public Builder internetIp(String internetIp) {
                this.internetIp = internetIp;
                return this;
            }

            /**
             * <p>IntranetIp.</p>
             */
            public Builder intranetIp(String intranetIp) {
                this.intranetIp = intranetIp;
                return this;
            }

            /**
             * <p>Os.</p>
             */
            public Builder os(String os) {
                this.os = os;
                return this;
            }

            /**
             * <p>Percent.</p>
             */
            public Builder percent(Integer percent) {
                this.percent = percent;
                return this;
            }

            /**
             * <p>ServiceCode.</p>
             */
            public Builder serviceCode(String serviceCode) {
                this.serviceCode = serviceCode;
                return this;
            }

            /**
             * <p>ServiceDetail.</p>
             */
            public Builder serviceDetail(String serviceDetail) {
                this.serviceDetail = serviceDetail;
                return this;
            }

            /**
             * <p>ServiceStatus.</p>
             */
            public Builder serviceStatus(String serviceStatus) {
                this.serviceStatus = serviceStatus;
                return this;
            }

            /**
             * <p>Status.</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>Uuid.</p>
             */
            public Builder uuid(String uuid) {
                this.uuid = uuid;
                return this;
            }

            public BindList build() {
                return new BindList(this);
            } 

        } 

    }
}
