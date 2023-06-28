// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddosbgp20180720.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribePackIpListResponseBody} extends {@link TeaModel}
 *
 * <p>DescribePackIpListResponseBody</p>
 */
public class DescribePackIpListResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("IpList")
    private java.util.List < IpList> ipList;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private Boolean success;

    @NameInMap("Total")
    private Integer total;

    private DescribePackIpListResponseBody(Builder builder) {
        this.code = builder.code;
        this.ipList = builder.ipList;
        this.requestId = builder.requestId;
        this.success = builder.success;
        this.total = builder.total;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribePackIpListResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return ipList
     */
    public java.util.List < IpList> getIpList() {
        return this.ipList;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    /**
     * @return total
     */
    public Integer getTotal() {
        return this.total;
    }

    public static final class Builder {
        private String code; 
        private java.util.List < IpList> ipList; 
        private String requestId; 
        private Boolean success; 
        private Integer total; 

        /**
         * The ID of the request.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * WB269094
         */
        public Builder ipList(java.util.List < IpList> ipList) {
            this.ipList = ipList;
            return this;
        }

        /**
         * All Alibaba Cloud API operations must include common request parameters. For more information about common request parameters, see [Common parameters](~~118841~~).
         * <p>
         * 
         * For more information about sample requests, see the **"Examples"** section of this topic.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * DescribePackIpList
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        /**
         * Queries the IP addresses that are protected by a specific Anti-DDoS Origin instance.
         */
        public Builder total(Integer total) {
            this.total = total;
            return this;
        }

        public DescribePackIpListResponseBody build() {
            return new DescribePackIpListResponseBody(this);
        } 

    } 

    public static class IpList extends TeaModel {
        @NameInMap("Ip")
        private String ip;

        @NameInMap("Product")
        private String product;

        @NameInMap("Region")
        private String region;

        @NameInMap("Remark")
        private String remark;

        @NameInMap("Status")
        private String status;

        private IpList(Builder builder) {
            this.ip = builder.ip;
            this.product = builder.product;
            this.region = builder.region;
            this.remark = builder.remark;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static IpList create() {
            return builder().build();
        }

        /**
         * @return ip
         */
        public String getIp() {
            return this.ip;
        }

        /**
         * @return product
         */
        public String getProduct() {
            return this.product;
        }

        /**
         * @return region
         */
        public String getRegion() {
            return this.region;
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
            private String ip; 
            private String product; 
            private String region; 
            private String remark; 
            private String status; 

            /**
             * Ip.
             */
            public Builder ip(String ip) {
                this.ip = ip;
                return this;
            }

            /**
             * Product.
             */
            public Builder product(String product) {
                this.product = product;
                return this;
            }

            /**
             * Region.
             */
            public Builder region(String region) {
                this.region = region;
                return this;
            }

            /**
             * Remark.
             */
            public Builder remark(String remark) {
                this.remark = remark;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public IpList build() {
                return new IpList(this);
            } 

        } 

    }
}
