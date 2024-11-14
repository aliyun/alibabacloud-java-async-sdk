// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddosbgp20180720.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribePackIpListResponseBody} extends {@link TeaModel}
 *
 * <p>DescribePackIpListResponseBody</p>
 */
public class DescribePackIpListResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("IpList")
    private java.util.List < IpList> ipList;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    @com.aliyun.core.annotation.NameInMap("Total")
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
         * <p>The HTTP status code of the request.</p>
         * <p>For more information about status codes, see <a href="https://help.aliyun.com/document_detail/118841.html">Common parameters</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The IP addresses that are protected by the instance.</p>
         */
        public Builder ipList(java.util.List < IpList> ipList) {
            this.ipList = ipList;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>4FD1578A-BD77-50B7-A969-45A374A7ED22</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the request is successful. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: The call is successful.</li>
         * <li><strong>false</strong>: The call fails.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        /**
         * <p>The number of protected IP addresses.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder total(Integer total) {
            this.total = total;
            return this;
        }

        public DescribePackIpListResponseBody build() {
            return new DescribePackIpListResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribePackIpListResponseBody} extends {@link TeaModel}
     *
     * <p>DescribePackIpListResponseBody</p>
     */
    public static class IpList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Ip")
        private String ip;

        @com.aliyun.core.annotation.NameInMap("MemberUid")
        private String memberUid;

        @com.aliyun.core.annotation.NameInMap("NsmExpireAt")
        private Long nsmExpireAt;

        @com.aliyun.core.annotation.NameInMap("NsmStartAt")
        private Long nsmStartAt;

        @com.aliyun.core.annotation.NameInMap("NsmStatus")
        private Integer nsmStatus;

        @com.aliyun.core.annotation.NameInMap("Product")
        private String product;

        @com.aliyun.core.annotation.NameInMap("Region")
        private String region;

        @com.aliyun.core.annotation.NameInMap("Remark")
        private String remark;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        private IpList(Builder builder) {
            this.ip = builder.ip;
            this.memberUid = builder.memberUid;
            this.nsmExpireAt = builder.nsmExpireAt;
            this.nsmStartAt = builder.nsmStartAt;
            this.nsmStatus = builder.nsmStatus;
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
         * @return memberUid
         */
        public String getMemberUid() {
            return this.memberUid;
        }

        /**
         * @return nsmExpireAt
         */
        public Long getNsmExpireAt() {
            return this.nsmExpireAt;
        }

        /**
         * @return nsmStartAt
         */
        public Long getNsmStartAt() {
            return this.nsmStartAt;
        }

        /**
         * @return nsmStatus
         */
        public Integer getNsmStatus() {
            return this.nsmStatus;
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
            private String memberUid; 
            private Long nsmExpireAt; 
            private Long nsmStartAt; 
            private Integer nsmStatus; 
            private String product; 
            private String region; 
            private String remark; 
            private String status; 

            /**
             * <p>The IP address.</p>
             * 
             * <strong>example:</strong>
             * <p>47.98.XX.XX</p>
             */
            public Builder ip(String ip) {
                this.ip = ip;
                return this;
            }

            /**
             * <p>The ID of the member.</p>
             * 
             * <strong>example:</strong>
             * <p>170858869679****</p>
             */
            public Builder memberUid(String memberUid) {
                this.memberUid = memberUid;
                return this;
            }

            /**
             * <p>The time when the near-origin traffic diversion feature was disabled.</p>
             * 
             * <strong>example:</strong>
             * <p>1715658000</p>
             */
            public Builder nsmExpireAt(Long nsmExpireAt) {
                this.nsmExpireAt = nsmExpireAt;
                return this;
            }

            /**
             * <p>The time when the near-origin traffic diversion feature was enabled.</p>
             * 
             * <strong>example:</strong>
             * <p>1715655000</p>
             */
            public Builder nsmStartAt(Long nsmStartAt) {
                this.nsmStartAt = nsmStartAt;
                return this;
            }

            /**
             * <p>The status of the near-origin traffic diversion feature. Valid values:</p>
             * <ul>
             * <li><strong>1</strong>: The near-origin traffic diversion feature is enabled.</li>
             * <li><strong>0</strong>: The near-origin traffic diversion feature is disabled.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder nsmStatus(Integer nsmStatus) {
                this.nsmStatus = nsmStatus;
                return this;
            }

            /**
             * <p>The type of the cloud asset to which the IP address belongs. Valid values:</p>
             * <ul>
             * <li><strong>ECS</strong>: an ECS instance.</li>
             * <li><strong>SLB</strong>: a CLB (formerly SLB) instance.</li>
             * <li><strong>EIP</strong>: an EIP. If the IP address belongs to an ALB instance, the value EIP is returned.</li>
             * <li><strong>WAF</strong>: a WAF instance.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>ECS</p>
             */
            public Builder product(String product) {
                this.product = product;
                return this;
            }

            /**
             * <p>The region to which the protected IP address belongs.</p>
             * <blockquote>
             * <p> If the protected IP address is in the same region as the instance, this parameter is not returned.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou</p>
             */
            public Builder region(String region) {
                this.region = region;
                return this;
            }

            /**
             * <p>The description of the cloud asset to which the IP address belongs. The asset can be an ECS instance or an SLB instance.</p>
             * <blockquote>
             * <p> If no descriptions are provided for the asset, this parameter is not returned.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder remark(String remark) {
                this.remark = remark;
                return this;
            }

            /**
             * <p>The status of the IP address. Valid values:</p>
             * <ul>
             * <li><strong>normal</strong>: The IP address is not under attack.</li>
             * <li><strong>hole_begin</strong>: Blackhole filtering is triggered for the IP address.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>normal</p>
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
