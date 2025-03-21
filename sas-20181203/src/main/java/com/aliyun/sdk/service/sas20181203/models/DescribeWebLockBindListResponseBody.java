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
 * {@link DescribeWebLockBindListResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeWebLockBindListResponseBody</p>
 */
public class DescribeWebLockBindListResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("BindList")
    private java.util.List<BindList> bindList;

    @com.aliyun.core.annotation.NameInMap("CurrentPage")
    private Integer currentPage;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
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
    public java.util.List<BindList> getBindList() {
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
        private java.util.List<BindList> bindList; 
        private Integer currentPage; 
        private Integer pageSize; 
        private String requestId; 
        private Integer totalCount; 

        /**
         * <p>The information about the servers that have web tamper proofing enabled.</p>
         */
        public Builder bindList(java.util.List<BindList> bindList) {
            this.bindList = bindList;
            return this;
        }

        /**
         * <p>The page number of the returned page. Pages start from page 1. Default value: 1.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder currentPage(Integer currentPage) {
            this.currentPage = currentPage;
            return this;
        }

        /**
         * <p>The number of entries returned per page. Default value: 20.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
         * 
         * <strong>example:</strong>
         * <p>D9354C1A-D709-4873-9AAE-41513327B247</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of servers that have web tamper proofing enabled.</p>
         * 
         * <strong>example:</strong>
         * <p>11409</p>
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeWebLockBindListResponseBody build() {
            return new DescribeWebLockBindListResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeWebLockBindListResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeWebLockBindListResponseBody</p>
     */
    public static class BindList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AuditCount")
        private String auditCount;

        @com.aliyun.core.annotation.NameInMap("BlockCount")
        private String blockCount;

        @com.aliyun.core.annotation.NameInMap("DirCount")
        private String dirCount;

        @com.aliyun.core.annotation.NameInMap("InstanceName")
        private String instanceName;

        @com.aliyun.core.annotation.NameInMap("InternetIp")
        private String internetIp;

        @com.aliyun.core.annotation.NameInMap("IntranetIp")
        private String intranetIp;

        @com.aliyun.core.annotation.NameInMap("Os")
        private String os;

        @com.aliyun.core.annotation.NameInMap("Percent")
        private Integer percent;

        @com.aliyun.core.annotation.NameInMap("ServiceCode")
        private String serviceCode;

        @com.aliyun.core.annotation.NameInMap("ServiceDetail")
        private String serviceDetail;

        @com.aliyun.core.annotation.NameInMap("ServiceStatus")
        private String serviceStatus;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("Uuid")
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
             * <p>The number of alerts.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder auditCount(String auditCount) {
                this.auditCount = auditCount;
                return this;
            }

            /**
             * <p>The number of blocked tampering events.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder blockCount(String blockCount) {
                this.blockCount = blockCount;
                return this;
            }

            /**
             * <p>The number of protected directories.</p>
             * 
             * <strong>example:</strong>
             * <p>5</p>
             */
            public Builder dirCount(String dirCount) {
                this.dirCount = dirCount;
                return this;
            }

            /**
             * <p>The name of the server.</p>
             * 
             * <strong>example:</strong>
             * <p>testName</p>
             */
            public Builder instanceName(String instanceName) {
                this.instanceName = instanceName;
                return this;
            }

            /**
             * <p>The public IP address of the server.</p>
             * 
             * <strong>example:</strong>
             * <p>54.169.XX.XX</p>
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
             * <p>The operating system that the server runs.</p>
             * 
             * <strong>example:</strong>
             * <p>Linux</p>
             */
            public Builder os(String os) {
                this.os = os;
                return this;
            }

            /**
             * <p>The percentage of the starting progress of web tamper proofing. Valid values: 0 to 100.</p>
             * 
             * <strong>example:</strong>
             * <p>99</p>
             */
            public Builder percent(Integer percent) {
                this.percent = percent;
                return this;
            }

            /**
             * <p>The error code for web tamper proofing. Valid values:</p>
             * <ul>
             * <li><strong>2001</strong>: The Security Center agent is offline.</li>
             * <li><strong>9999</strong>: The connection timed out.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>2001</p>
             */
            public Builder serviceCode(String serviceCode) {
                this.serviceCode = serviceCode;
                return this;
            }

            /**
             * <p>The exception details of web tamper proofing. Valid values:</p>
             * <ul>
             * <li><strong>client offline</strong>: The Security Center agent is offline.</li>
             * <li><strong>timeout</strong>: The connection timed out.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>client offline</p>
             */
            public Builder serviceDetail(String serviceDetail) {
                this.serviceDetail = serviceDetail;
                return this;
            }

            /**
             * <p>The status of web tamper proofing on the server. Valid values:</p>
             * <ul>
             * <li><strong>stop</strong>: Web tamper proofing is disabled.</li>
             * <li><strong>initializing</strong>: Web tamper proofing is being enabled.</li>
             * <li><strong>exception</strong>: Web tamper proofing is not running as expected.</li>
             * <li><strong>running</strong>: Web tamper proofing is running.</li>
             * <li><strong>closing</strong>: Web tamper proofing is being disabled.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>stop</p>
             */
            public Builder serviceStatus(String serviceStatus) {
                this.serviceStatus = serviceStatus;
                return this;
            }

            /**
             * <p>The protection status of the server. Valid values:</p>
             * <ul>
             * <li><strong>on</strong>: The server is protected.</li>
             * <li><strong>off</strong>: The server is not protected.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>on</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The UUID of the server.</p>
             * 
             * <strong>example:</strong>
             * <p>inet-12345****</p>
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
