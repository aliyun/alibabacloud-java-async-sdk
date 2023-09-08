// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cbn20170912.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeCenAttachedChildInstanceAttributeResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeCenAttachedChildInstanceAttributeResponseBody</p>
 */
public class DescribeCenAttachedChildInstanceAttributeResponseBody extends TeaModel {
    @NameInMap("CenId")
    private String cenId;

    @NameInMap("ChildInstanceAttachTime")
    private String childInstanceAttachTime;

    @NameInMap("ChildInstanceAttributes")
    private ChildInstanceAttributes childInstanceAttributes;

    @NameInMap("ChildInstanceId")
    private String childInstanceId;

    @NameInMap("ChildInstanceName")
    private String childInstanceName;

    @NameInMap("ChildInstanceOwnerId")
    private Long childInstanceOwnerId;

    @NameInMap("ChildInstanceRegionId")
    private String childInstanceRegionId;

    @NameInMap("ChildInstanceType")
    private String childInstanceType;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Status")
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
         * The ID of the CEN instance.
         */
        public Builder cenId(String cenId) {
            this.cenId = cenId;
            return this;
        }

        /**
         * The time when the network instance was attached to the CEN instance.
         * <p>
         * 
         * The time follows the ISO 8601 standard in the yyyy-MM-ddThh:mmZ format. The time is displayed in UTC.
         */
        public Builder childInstanceAttachTime(String childInstanceAttachTime) {
            this.childInstanceAttachTime = childInstanceAttachTime;
            return this;
        }

        /**
         * The details about the network instance.
         */
        public Builder childInstanceAttributes(ChildInstanceAttributes childInstanceAttributes) {
            this.childInstanceAttributes = childInstanceAttributes;
            return this;
        }

        /**
         * The ID of the network instance.
         */
        public Builder childInstanceId(String childInstanceId) {
            this.childInstanceId = childInstanceId;
            return this;
        }

        /**
         * The name of the network instance.
         */
        public Builder childInstanceName(String childInstanceName) {
            this.childInstanceName = childInstanceName;
            return this;
        }

        /**
         * The ID of the Alibaba Cloud account to which the network instance belongs.
         */
        public Builder childInstanceOwnerId(Long childInstanceOwnerId) {
            this.childInstanceOwnerId = childInstanceOwnerId;
            return this;
        }

        /**
         * The region ID of the network instance.
         */
        public Builder childInstanceRegionId(String childInstanceRegionId) {
            this.childInstanceRegionId = childInstanceRegionId;
            return this;
        }

        /**
         * The type of the network instance. Valid values:
         * <p>
         * 
         * *   **VPC**: VPC
         * *   **VBR**: VBR
         * *   **CCN**: CCN instance
         */
        public Builder childInstanceType(String childInstanceType) {
            this.childInstanceType = childInstanceType;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Indicates whether the network instance is attached to the CEN instance.
         * <p>
         * 
         * *   **Attaching**: The network instance is being attached to the CEN instance.
         * *   **Attached**: The network instance is attached to the CEN instance.
         * *   **Detaching**: The network instance is being detached from the CEN instance.
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        public DescribeCenAttachedChildInstanceAttributeResponseBody build() {
            return new DescribeCenAttachedChildInstanceAttributeResponseBody(this);
        } 

    } 

    public static class Ipv6CidrBlock extends TeaModel {
        @NameInMap("Ipv6CidrBlock")
        private String ipv6CidrBlock;

        @NameInMap("Ipv6Isp")
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
             * The IPv6 CIDR block of the VPC.
             */
            public Builder ipv6CidrBlock(String ipv6CidrBlock) {
                this.ipv6CidrBlock = ipv6CidrBlock;
                return this;
            }

            /**
             * The type of the IPv6 CIDR block. Valid values:
             * <p>
             * 
             * * **BGP** (default): Alibaba Cloud Border Gateway Protocol (BGP) IPv6
             * * **ChinaMobile:** China Mobile (single line)
             * * **ChinaUnicom:** China Unicom (single line)
             * * **ChinaTelecom:** China Telecom (single line)
             * 
             * > If your Alibaba Cloud account has the required permissions to activate single-ISP bandwidth, you can set Ipv6Isp to ChinaTelecom, ChinaUnicom, or ChinaMobile.
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
    public static class Ipv6CidrBlocks extends TeaModel {
        @NameInMap("ipv6CidrBlock")
        private java.util.List < Ipv6CidrBlock> ipv6CidrBlock;

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
        public java.util.List < Ipv6CidrBlock> getIpv6CidrBlock() {
            return this.ipv6CidrBlock;
        }

        public static final class Builder {
            private java.util.List < Ipv6CidrBlock> ipv6CidrBlock; 

            /**
             * ipv6CidrBlock.
             */
            public Builder ipv6CidrBlock(java.util.List < Ipv6CidrBlock> ipv6CidrBlock) {
                this.ipv6CidrBlock = ipv6CidrBlock;
                return this;
            }

            public Ipv6CidrBlocks build() {
                return new Ipv6CidrBlocks(this);
            } 

        } 

    }
    public static class SecondaryCidrBlocks extends TeaModel {
        @NameInMap("secondaryCidrBlock")
        private java.util.List < String > secondaryCidrBlock;

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
        public java.util.List < String > getSecondaryCidrBlock() {
            return this.secondaryCidrBlock;
        }

        public static final class Builder {
            private java.util.List < String > secondaryCidrBlock; 

            /**
             * secondaryCidrBlock.
             */
            public Builder secondaryCidrBlock(java.util.List < String > secondaryCidrBlock) {
                this.secondaryCidrBlock = secondaryCidrBlock;
                return this;
            }

            public SecondaryCidrBlocks build() {
                return new SecondaryCidrBlocks(this);
            } 

        } 

    }
    public static class ChildInstanceAttributes extends TeaModel {
        @NameInMap("CidrBlock")
        private String cidrBlock;

        @NameInMap("Ipv6CidrBlock")
        private String ipv6CidrBlock;

        @NameInMap("Ipv6CidrBlocks")
        private Ipv6CidrBlocks ipv6CidrBlocks;

        @NameInMap("SecondaryCidrBlocks")
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
             * The IPv4 CIDR block of the VPC.
             */
            public Builder cidrBlock(String cidrBlock) {
                this.cidrBlock = cidrBlock;
                return this;
            }

            /**
             * The IPv6 CIDR block of the VPC.
             */
            public Builder ipv6CidrBlock(String ipv6CidrBlock) {
                this.ipv6CidrBlock = ipv6CidrBlock;
                return this;
            }

            /**
             * The information about the IPv6 CIDR blocks of the VPC.
             */
            public Builder ipv6CidrBlocks(Ipv6CidrBlocks ipv6CidrBlocks) {
                this.ipv6CidrBlocks = ipv6CidrBlocks;
                return this;
            }

            /**
             * The secondary IPv4 CIDR block of the VPC.
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
