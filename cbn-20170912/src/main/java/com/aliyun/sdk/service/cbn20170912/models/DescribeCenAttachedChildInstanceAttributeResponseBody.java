// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cbn20170912.models;

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
 * {@link DescribeCenAttachedChildInstanceAttributeResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeCenAttachedChildInstanceAttributeResponseBody</p>
 */
public class DescribeCenAttachedChildInstanceAttributeResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("CenId")
    private String cenId;

    @com.aliyun.core.annotation.NameInMap("ChildInstanceAttachTime")
    private String childInstanceAttachTime;

    @com.aliyun.core.annotation.NameInMap("ChildInstanceAttributes")
    private ChildInstanceAttributes childInstanceAttributes;

    @com.aliyun.core.annotation.NameInMap("ChildInstanceId")
    private String childInstanceId;

    @com.aliyun.core.annotation.NameInMap("ChildInstanceName")
    private String childInstanceName;

    @com.aliyun.core.annotation.NameInMap("ChildInstanceOwnerId")
    private Long childInstanceOwnerId;

    @com.aliyun.core.annotation.NameInMap("ChildInstanceRegionId")
    private String childInstanceRegionId;

    @com.aliyun.core.annotation.NameInMap("ChildInstanceType")
    private String childInstanceType;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Status")
    private String status;

    private DescribeCenAttachedChildInstanceAttributeResponseBody(Builder builder) {
        this.cenId = builder.cenId;
        this.childInstanceAttachTime = builder.childInstanceAttachTime;
        this.childInstanceAttributes = builder.childInstanceAttributes;
        this.childInstanceId = builder.childInstanceId;
        this.childInstanceName = builder.childInstanceName;
        this.childInstanceOwnerId = builder.childInstanceOwnerId;
        this.childInstanceRegionId = builder.childInstanceRegionId;
        this.childInstanceType = builder.childInstanceType;
        this.requestId = builder.requestId;
        this.status = builder.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeCenAttachedChildInstanceAttributeResponseBody create() {
        return builder().build();
    }

    /**
     * @return cenId
     */
    public String getCenId() {
        return this.cenId;
    }

    /**
     * @return childInstanceAttachTime
     */
    public String getChildInstanceAttachTime() {
        return this.childInstanceAttachTime;
    }

    /**
     * @return childInstanceAttributes
     */
    public ChildInstanceAttributes getChildInstanceAttributes() {
        return this.childInstanceAttributes;
    }

    /**
     * @return childInstanceId
     */
    public String getChildInstanceId() {
        return this.childInstanceId;
    }

    /**
     * @return childInstanceName
     */
    public String getChildInstanceName() {
        return this.childInstanceName;
    }

    /**
     * @return childInstanceOwnerId
     */
    public Long getChildInstanceOwnerId() {
        return this.childInstanceOwnerId;
    }

    /**
     * @return childInstanceRegionId
     */
    public String getChildInstanceRegionId() {
        return this.childInstanceRegionId;
    }

    /**
     * @return childInstanceType
     */
    public String getChildInstanceType() {
        return this.childInstanceType;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    public static final class Builder {
        private String cenId; 
        private String childInstanceAttachTime; 
        private ChildInstanceAttributes childInstanceAttributes; 
        private String childInstanceId; 
        private String childInstanceName; 
        private Long childInstanceOwnerId; 
        private String childInstanceRegionId; 
        private String childInstanceType; 
        private String requestId; 
        private String status; 

        /**
         * <p>The ID of the CEN instance.</p>
         * 
         * <strong>example:</strong>
         * <p>cen-5mv960yjhja0dh****</p>
         */
        public Builder cenId(String cenId) {
            this.cenId = cenId;
            return this;
        }

        /**
         * <p>The time when the network instance was attached to the CEN instance.</p>
         * <p>The time follows the ISO 8601 standard in the yyyy-MM-ddThh:mmZ format. The time is displayed in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2018-07-30T07:53Z</p>
         */
        public Builder childInstanceAttachTime(String childInstanceAttachTime) {
            this.childInstanceAttachTime = childInstanceAttachTime;
            return this;
        }

        /**
         * <p>The details about the network instance.</p>
         */
        public Builder childInstanceAttributes(ChildInstanceAttributes childInstanceAttributes) {
            this.childInstanceAttributes = childInstanceAttributes;
            return this;
        }

        /**
         * <p>The ID of the network instance.</p>
         * 
         * <strong>example:</strong>
         * <p>vpc-2zebdboka7d7t37vo****</p>
         */
        public Builder childInstanceId(String childInstanceId) {
            this.childInstanceId = childInstanceId;
            return this;
        }

        /**
         * <p>The name of the network instance.</p>
         * 
         * <strong>example:</strong>
         * <p>defaultvpc</p>
         */
        public Builder childInstanceName(String childInstanceName) {
            this.childInstanceName = childInstanceName;
            return this;
        }

        /**
         * <p>The ID of the Alibaba Cloud account to which the network instance belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>1688000000000000</p>
         */
        public Builder childInstanceOwnerId(Long childInstanceOwnerId) {
            this.childInstanceOwnerId = childInstanceOwnerId;
            return this;
        }

        /**
         * <p>The region ID of the network instance.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-beijing</p>
         */
        public Builder childInstanceRegionId(String childInstanceRegionId) {
            this.childInstanceRegionId = childInstanceRegionId;
            return this;
        }

        /**
         * <p>The type of the network instance. Valid values:</p>
         * <ul>
         * <li><strong>VPC</strong>: VPC</li>
         * <li><strong>VBR</strong>: VBR</li>
         * <li><strong>CCN</strong>: CCN instance</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>VPC</p>
         */
        public Builder childInstanceType(String childInstanceType) {
            this.childInstanceType = childInstanceType;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>ADD98358-D265-4060-87CB-A2427F5A8944</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the network instance is attached to the CEN instance.</p>
         * <ul>
         * <li><strong>Attaching</strong>: The network instance is being attached to the CEN instance.</li>
         * <li><strong>Attached</strong>: The network instance is attached to the CEN instance.</li>
         * <li><strong>Detaching</strong>: The network instance is being detached from the CEN instance.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Attached</p>
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        public DescribeCenAttachedChildInstanceAttributeResponseBody build() {
            return new DescribeCenAttachedChildInstanceAttributeResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeCenAttachedChildInstanceAttributeResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeCenAttachedChildInstanceAttributeResponseBody</p>
     */
    public static class Ipv6CidrBlock extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Ipv6CidrBlock")
        private String ipv6CidrBlock;

        @com.aliyun.core.annotation.NameInMap("Ipv6Isp")
        private String ipv6Isp;

        private Ipv6CidrBlock(Builder builder) {
            this.ipv6CidrBlock = builder.ipv6CidrBlock;
            this.ipv6Isp = builder.ipv6Isp;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Ipv6CidrBlock create() {
            return builder().build();
        }

        /**
         * @return ipv6CidrBlock
         */
        public String getIpv6CidrBlock() {
            return this.ipv6CidrBlock;
        }

        /**
         * @return ipv6Isp
         */
        public String getIpv6Isp() {
            return this.ipv6Isp;
        }

        public static final class Builder {
            private String ipv6CidrBlock; 
            private String ipv6Isp; 

            /**
             * <p>The IPv6 CIDR block of the VPC.</p>
             * 
             * <strong>example:</strong>
             * <p>2408:XXXX:0:6a::/56</p>
             */
            public Builder ipv6CidrBlock(String ipv6CidrBlock) {
                this.ipv6CidrBlock = ipv6CidrBlock;
                return this;
            }

            /**
             * <p>The type of the IPv6 CIDR block of the VPC. Valid values:</p>
             * <ul>
             * <li>BGP (default): Alibaba Cloud Border Gateway Protocol (BGP) IPv6</li>
             * <li>ChinaMobile: China Mobile (single line)</li>
             * <li>ChinaUnicom: China Unicom (single line)</li>
             * <li>ChinaTelecom: China Telecom (single line)</li>
             * </ul>
             * <blockquote>
             * <p> If you are on the whitelist of single-line bandwidth, you can set this parameter to ChinaTelecom, ChinaUnicom, or ChinaMobile.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>BGP</p>
             */
            public Builder ipv6Isp(String ipv6Isp) {
                this.ipv6Isp = ipv6Isp;
                return this;
            }

            public Ipv6CidrBlock build() {
                return new Ipv6CidrBlock(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeCenAttachedChildInstanceAttributeResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeCenAttachedChildInstanceAttributeResponseBody</p>
     */
    public static class Ipv6CidrBlocks extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ipv6CidrBlock")
        private java.util.List<Ipv6CidrBlock> ipv6CidrBlock;

        private Ipv6CidrBlocks(Builder builder) {
            this.ipv6CidrBlock = builder.ipv6CidrBlock;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Ipv6CidrBlocks create() {
            return builder().build();
        }

        /**
         * @return ipv6CidrBlock
         */
        public java.util.List<Ipv6CidrBlock> getIpv6CidrBlock() {
            return this.ipv6CidrBlock;
        }

        public static final class Builder {
            private java.util.List<Ipv6CidrBlock> ipv6CidrBlock; 

            /**
             * ipv6CidrBlock.
             */
            public Builder ipv6CidrBlock(java.util.List<Ipv6CidrBlock> ipv6CidrBlock) {
                this.ipv6CidrBlock = ipv6CidrBlock;
                return this;
            }

            public Ipv6CidrBlocks build() {
                return new Ipv6CidrBlocks(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeCenAttachedChildInstanceAttributeResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeCenAttachedChildInstanceAttributeResponseBody</p>
     */
    public static class SecondaryCidrBlocks extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("secondaryCidrBlock")
        private java.util.List<String> secondaryCidrBlock;

        private SecondaryCidrBlocks(Builder builder) {
            this.secondaryCidrBlock = builder.secondaryCidrBlock;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SecondaryCidrBlocks create() {
            return builder().build();
        }

        /**
         * @return secondaryCidrBlock
         */
        public java.util.List<String> getSecondaryCidrBlock() {
            return this.secondaryCidrBlock;
        }

        public static final class Builder {
            private java.util.List<String> secondaryCidrBlock; 

            /**
             * secondaryCidrBlock.
             */
            public Builder secondaryCidrBlock(java.util.List<String> secondaryCidrBlock) {
                this.secondaryCidrBlock = secondaryCidrBlock;
                return this;
            }

            public SecondaryCidrBlocks build() {
                return new SecondaryCidrBlocks(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeCenAttachedChildInstanceAttributeResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeCenAttachedChildInstanceAttributeResponseBody</p>
     */
    public static class ChildInstanceAttributes extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CidrBlock")
        private String cidrBlock;

        @com.aliyun.core.annotation.NameInMap("Ipv6CidrBlock")
        private String ipv6CidrBlock;

        @com.aliyun.core.annotation.NameInMap("Ipv6CidrBlocks")
        private Ipv6CidrBlocks ipv6CidrBlocks;

        @com.aliyun.core.annotation.NameInMap("SecondaryCidrBlocks")
        private SecondaryCidrBlocks secondaryCidrBlocks;

        private ChildInstanceAttributes(Builder builder) {
            this.cidrBlock = builder.cidrBlock;
            this.ipv6CidrBlock = builder.ipv6CidrBlock;
            this.ipv6CidrBlocks = builder.ipv6CidrBlocks;
            this.secondaryCidrBlocks = builder.secondaryCidrBlocks;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ChildInstanceAttributes create() {
            return builder().build();
        }

        /**
         * @return cidrBlock
         */
        public String getCidrBlock() {
            return this.cidrBlock;
        }

        /**
         * @return ipv6CidrBlock
         */
        public String getIpv6CidrBlock() {
            return this.ipv6CidrBlock;
        }

        /**
         * @return ipv6CidrBlocks
         */
        public Ipv6CidrBlocks getIpv6CidrBlocks() {
            return this.ipv6CidrBlocks;
        }

        /**
         * @return secondaryCidrBlocks
         */
        public SecondaryCidrBlocks getSecondaryCidrBlocks() {
            return this.secondaryCidrBlocks;
        }

        public static final class Builder {
            private String cidrBlock; 
            private String ipv6CidrBlock; 
            private Ipv6CidrBlocks ipv6CidrBlocks; 
            private SecondaryCidrBlocks secondaryCidrBlocks; 

            /**
             * <p>The IPv4 CIDR block of the VPC.</p>
             * 
             * <strong>example:</strong>
             * <p>192.168.0.0/16</p>
             */
            public Builder cidrBlock(String cidrBlock) {
                this.cidrBlock = cidrBlock;
                return this;
            }

            /**
             * <p>The IPv6 CIDR block of the VPC.</p>
             * 
             * <strong>example:</strong>
             * <p>2408:XXXX:0:a600::/56</p>
             */
            public Builder ipv6CidrBlock(String ipv6CidrBlock) {
                this.ipv6CidrBlock = ipv6CidrBlock;
                return this;
            }

            /**
             * <p>The IPv6 CIDR blocks of the VPC.</p>
             */
            public Builder ipv6CidrBlocks(Ipv6CidrBlocks ipv6CidrBlocks) {
                this.ipv6CidrBlocks = ipv6CidrBlocks;
                return this;
            }

            /**
             * <p>The information about the VPC secondary CIDR block.</p>
             */
            public Builder secondaryCidrBlocks(SecondaryCidrBlocks secondaryCidrBlocks) {
                this.secondaryCidrBlocks = secondaryCidrBlocks;
                return this;
            }

            public ChildInstanceAttributes build() {
                return new ChildInstanceAttributes(this);
            } 

        } 

    }
}
