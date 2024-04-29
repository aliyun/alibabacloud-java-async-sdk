// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeCustomBlockInstancesResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeCustomBlockInstancesResponseBody</p>
 */
public class DescribeCustomBlockInstancesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("InstanceList")
    private java.util.List < InstanceList> instanceList;

    @com.aliyun.core.annotation.NameInMap("PageInfo")
    private PageInfo pageInfo;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeCustomBlockInstancesResponseBody(Builder builder) {
        this.instanceList = builder.instanceList;
        this.pageInfo = builder.pageInfo;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeCustomBlockInstancesResponseBody create() {
        return builder().build();
    }

    /**
     * @return instanceList
     */
    public java.util.List < InstanceList> getInstanceList() {
        return this.instanceList;
    }

    /**
     * @return pageInfo
     */
    public PageInfo getPageInfo() {
        return this.pageInfo;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List < InstanceList> instanceList; 
        private PageInfo pageInfo; 
        private String requestId; 

        /**
         * The server ID.
         */
        public Builder instanceList(java.util.List < InstanceList> instanceList) {
            this.instanceList = instanceList;
            return this;
        }

        /**
         * The pagination information.
         */
        public Builder pageInfo(PageInfo pageInfo) {
            this.pageInfo = pageInfo;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeCustomBlockInstancesResponseBody build() {
            return new DescribeCustomBlockInstancesResponseBody(this);
        } 

    } 

    public static class InstanceList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AliNetOnline")
        private Boolean aliNetOnline;

        @com.aliyun.core.annotation.NameInMap("BlockType")
        private String blockType;

        @com.aliyun.core.annotation.NameInMap("ErrorCode")
        private String errorCode;

        @com.aliyun.core.annotation.NameInMap("InstanceName")
        private String instanceName;

        @com.aliyun.core.annotation.NameInMap("InternetIp")
        private String internetIp;

        @com.aliyun.core.annotation.NameInMap("IntranetIp")
        private String intranetIp;

        @com.aliyun.core.annotation.NameInMap("Status")
        private Integer status;

        @com.aliyun.core.annotation.NameInMap("SuccessInfo")
        private String successInfo;

        @com.aliyun.core.annotation.NameInMap("Uuid")
        private String uuid;

        private InstanceList(Builder builder) {
            this.aliNetOnline = builder.aliNetOnline;
            this.blockType = builder.blockType;
            this.errorCode = builder.errorCode;
            this.instanceName = builder.instanceName;
            this.internetIp = builder.internetIp;
            this.intranetIp = builder.intranetIp;
            this.status = builder.status;
            this.successInfo = builder.successInfo;
            this.uuid = builder.uuid;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static InstanceList create() {
            return builder().build();
        }

        /**
         * @return aliNetOnline
         */
        public Boolean getAliNetOnline() {
            return this.aliNetOnline;
        }

        /**
         * @return blockType
         */
        public String getBlockType() {
            return this.blockType;
        }

        /**
         * @return errorCode
         */
        public String getErrorCode() {
            return this.errorCode;
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
         * @return status
         */
        public Integer getStatus() {
            return this.status;
        }

        /**
         * @return successInfo
         */
        public String getSuccessInfo() {
            return this.successInfo;
        }

        /**
         * @return uuid
         */
        public String getUuid() {
            return this.uuid;
        }

        public static final class Builder {
            private Boolean aliNetOnline; 
            private String blockType; 
            private String errorCode; 
            private String instanceName; 
            private String internetIp; 
            private String intranetIp; 
            private Integer status; 
            private String successInfo; 
            private String uuid; 

            /**
             * The status of the host network extension. Valid values:
             * <p>
             * 
             * *   **true**: online
             * *   **false**: offline
             */
            public Builder aliNetOnline(Boolean aliNetOnline) {
                this.aliNetOnline = aliNetOnline;
                return this;
            }

            /**
             * The blocking type. Valid values:
             * <p>
             * 
             * *   **group**: security group
             * *   **alinet**: host network extension
             */
            public Builder blockType(String blockType) {
                this.blockType = blockType;
                return this;
            }

            /**
             * The error code returned.
             */
            public Builder errorCode(String errorCode) {
                this.errorCode = errorCode;
                return this;
            }

            /**
             * The name of the asset.
             */
            public Builder instanceName(String instanceName) {
                this.instanceName = instanceName;
                return this;
            }

            /**
             * The public IP address of the server.
             */
            public Builder internetIp(String internetIp) {
                this.internetIp = internetIp;
                return this;
            }

            /**
             * The private IP address of the server.
             */
            public Builder intranetIp(String intranetIp) {
                this.intranetIp = intranetIp;
                return this;
            }

            /**
             * Indicates whether the rule is enabled for the server.
             * <p>
             * 
             * *   **2**: enabling failed
             * *   **1**: enabled
             * *   **0**: disabled
             */
            public Builder status(Integer status) {
                this.status = status;
                return this;
            }

            /**
             * The information that is returned after brute-force attacks are blocked.
             */
            public Builder successInfo(String successInfo) {
                this.successInfo = successInfo;
                return this;
            }

            /**
             * The UUID of the server.
             */
            public Builder uuid(String uuid) {
                this.uuid = uuid;
                return this;
            }

            public InstanceList build() {
                return new InstanceList(this);
            } 

        } 

    }
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
             * The number of entries returned on the current page.
             */
            public Builder count(Integer count) {
                this.count = count;
                return this;
            }

            /**
             * The page number.
             */
            public Builder currentPage(Integer currentPage) {
                this.currentPage = currentPage;
                return this;
            }

            /**
             * The number of entries per page. Default value: **20**.
             */
            public Builder pageSize(Integer pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            /**
             * The total number of servers to which the defense rule is applied.
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
}
