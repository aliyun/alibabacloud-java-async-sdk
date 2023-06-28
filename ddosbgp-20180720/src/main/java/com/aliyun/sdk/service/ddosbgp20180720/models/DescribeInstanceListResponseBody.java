// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddosbgp20180720.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeInstanceListResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeInstanceListResponseBody</p>
 */
public class DescribeInstanceListResponseBody extends TeaModel {
    @NameInMap("InstanceList")
    private java.util.List < InstanceList> instanceList;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Total")
    private Long total;

    private DescribeInstanceListResponseBody(Builder builder) {
        this.instanceList = builder.instanceList;
        this.requestId = builder.requestId;
        this.total = builder.total;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeInstanceListResponseBody create() {
        return builder().build();
    }

    /**
     * @return instanceList
     */
    public java.util.List < InstanceList> getInstanceList() {
        return this.instanceList;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return total
     */
    public Long getTotal() {
        return this.total;
    }

    public static final class Builder {
        private java.util.List < InstanceList> instanceList; 
        private String requestId; 
        private Long total; 

        /**
         * The number of the page to return.
         */
        public Builder instanceList(java.util.List < InstanceList> instanceList) {
            this.instanceList = instanceList;
            return this;
        }

        /**
         * The value of the tag that is added to the Anti-DDoS Origin instance to query.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The type of the cloud service that is associated with the Anti-DDoS Origin instance. By default, this parameter is not returned. If the Anti-DDoS Origin instance is created by using a different cloud service, the code of the cloud service is returned.
         * <p>
         * 
         * Valid values:
         * 
         * *   **gamebox**: The Anti-DDoS Origin instance is created by using Game Security Box.
         * *   **eip**: The Anti-DDoS Origin instance is created by using an elastic IP address (EIP) for which Anti-DDoS (Enhanced Edition) is enabled.
         */
        public Builder total(Long total) {
            this.total = total;
            return this;
        }

        public DescribeInstanceListResponseBody build() {
            return new DescribeInstanceListResponseBody(this);
        } 

    } 

    public static class InstanceList extends TeaModel {
        @NameInMap("AutoRenewal")
        private Boolean autoRenewal;

        @NameInMap("BlackholdingCount")
        private String blackholdingCount;

        @NameInMap("CoverageType")
        private Integer coverageType;

        @NameInMap("ExpireTime")
        private Long expireTime;

        @NameInMap("GmtCreate")
        private Long gmtCreate;

        @NameInMap("InstanceId")
        private String instanceId;

        @NameInMap("InstanceType")
        private String instanceType;

        @NameInMap("IpType")
        private String ipType;

        @NameInMap("Product")
        private String product;

        @NameInMap("Remark")
        private String remark;

        @NameInMap("Status")
        private String status;

        private InstanceList(Builder builder) {
            this.autoRenewal = builder.autoRenewal;
            this.blackholdingCount = builder.blackholdingCount;
            this.coverageType = builder.coverageType;
            this.expireTime = builder.expireTime;
            this.gmtCreate = builder.gmtCreate;
            this.instanceId = builder.instanceId;
            this.instanceType = builder.instanceType;
            this.ipType = builder.ipType;
            this.product = builder.product;
            this.remark = builder.remark;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static InstanceList create() {
            return builder().build();
        }

        /**
         * @return autoRenewal
         */
        public Boolean getAutoRenewal() {
            return this.autoRenewal;
        }

        /**
         * @return blackholdingCount
         */
        public String getBlackholdingCount() {
            return this.blackholdingCount;
        }

        /**
         * @return coverageType
         */
        public Integer getCoverageType() {
            return this.coverageType;
        }

        /**
         * @return expireTime
         */
        public Long getExpireTime() {
            return this.expireTime;
        }

        /**
         * @return gmtCreate
         */
        public Long getGmtCreate() {
            return this.gmtCreate;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return instanceType
         */
        public String getInstanceType() {
            return this.instanceType;
        }

        /**
         * @return ipType
         */
        public String getIpType() {
            return this.ipType;
        }

        /**
         * @return product
         */
        public String getProduct() {
            return this.product;
        }

        /**
         * @return remark
         */
        public String getRemark() {
            return this.remark;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private Boolean autoRenewal; 
            private String blackholdingCount; 
            private Integer coverageType; 
            private Long expireTime; 
            private Long gmtCreate; 
            private String instanceId; 
            private String instanceType; 
            private String ipType; 
            private String product; 
            private String remark; 
            private String status; 

            /**
             * All Alibaba Cloud API operations must include common request parameters. For more information about common request parameters, see [Common parameters](~~118841~~).
             * <p>
             * 
             * For more information about sample requests, see the **"Examples"** section of this topic.
             */
            public Builder autoRenewal(Boolean autoRenewal) {
                this.autoRenewal = autoRenewal;
                return this;
            }

            /**
             * BlackholdingCount.
             */
            public Builder blackholdingCount(String blackholdingCount) {
                this.blackholdingCount = blackholdingCount;
                return this;
            }

            /**
             * CoverageType.
             */
            public Builder coverageType(Integer coverageType) {
                this.coverageType = coverageType;
                return this;
            }

            /**
             * DescribeInstanceList
             */
            public Builder expireTime(Long expireTime) {
                this.expireTime = expireTime;
                return this;
            }

            /**
             * GmtCreate.
             */
            public Builder gmtCreate(Long gmtCreate) {
                this.gmtCreate = gmtCreate;
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
             * InstanceType.
             */
            public Builder instanceType(String instanceType) {
                this.instanceType = instanceType;
                return this;
            }

            /**
             * The ID of the request.
             */
            public Builder ipType(String ipType) {
                this.ipType = ipType;
                return this;
            }

            /**
             * WB269094
             */
            public Builder product(String product) {
                this.product = product;
                return this;
            }

            /**
             * Queries the details of all Anti-DDoS Origin instances.
             */
            public Builder remark(String remark) {
                this.remark = remark;
                return this;
            }

            /**
             * The remarks of the instance.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public InstanceList build() {
                return new InstanceList(this);
            } 

        } 

    }
}
