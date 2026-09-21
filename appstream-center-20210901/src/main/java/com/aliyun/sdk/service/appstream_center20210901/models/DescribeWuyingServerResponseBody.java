// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.appstream_center20210901.models;

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
 * {@link DescribeWuyingServerResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeWuyingServerResponseBody</p>
 */
public class DescribeWuyingServerResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeWuyingServerResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeWuyingServerResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Data data; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(DescribeWuyingServerResponseBody model) {
            this.data = model.data;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The details of the development host.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>1CBAFFAB-B697-4049-A9B1-67E1FC5F****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeWuyingServerResponseBody build() {
            return new DescribeWuyingServerResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeWuyingServerResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeWuyingServerResponseBody</p>
     */
    public static class PrivateIpSets extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Primary")
        private Boolean primary;

        @com.aliyun.core.annotation.NameInMap("PrivateIpAddress")
        private String privateIpAddress;

        private PrivateIpSets(Builder builder) {
            this.primary = builder.primary;
            this.privateIpAddress = builder.privateIpAddress;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PrivateIpSets create() {
            return builder().build();
        }

        /**
         * @return primary
         */
        public Boolean getPrimary() {
            return this.primary;
        }

        /**
         * @return privateIpAddress
         */
        public String getPrivateIpAddress() {
            return this.privateIpAddress;
        }

        public static final class Builder {
            private Boolean primary; 
            private String privateIpAddress; 

            private Builder() {
            } 

            private Builder(PrivateIpSets model) {
                this.primary = model.primary;
                this.privateIpAddress = model.privateIpAddress;
            } 

            /**
             * <p>Indicates whether the IP address is the primary private IP address. Valid values:</p>
             * <ul>
             * <li>true: The IP address is the primary private IP address.</li>
             * <li>false: The IP address is a secondary private IP address.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder primary(Boolean primary) {
                this.primary = primary;
                return this;
            }

            /**
             * <p>The private IP address.</p>
             * 
             * <strong>example:</strong>
             * <p>10.0.0.1</p>
             */
            public Builder privateIpAddress(String privateIpAddress) {
                this.privateIpAddress = privateIpAddress;
                return this;
            }

            public PrivateIpSets build() {
                return new PrivateIpSets(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeWuyingServerResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeWuyingServerResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Bandwidth")
        private Integer bandwidth;

        @com.aliyun.core.annotation.NameInMap("BizRegionId")
        private String bizRegionId;

        @com.aliyun.core.annotation.NameInMap("ChargeType")
        private String chargeType;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("EniPrivateIpAddressQuantity")
        private Integer eniPrivateIpAddressQuantity;

        @com.aliyun.core.annotation.NameInMap("ExpiredTime")
        private String expiredTime;

        @com.aliyun.core.annotation.NameInMap("ImageId")
        private String imageId;

        @com.aliyun.core.annotation.NameInMap("ImageName")
        private String imageName;

        @com.aliyun.core.annotation.NameInMap("NetworkInterfaceIp")
        private String networkInterfaceIp;

        @com.aliyun.core.annotation.NameInMap("OfficeSiteId")
        private String officeSiteId;

        @com.aliyun.core.annotation.NameInMap("OfficeSiteName")
        private String officeSiteName;

        @com.aliyun.core.annotation.NameInMap("OfficeSiteType")
        private String officeSiteType;

        @com.aliyun.core.annotation.NameInMap("OsType")
        private String osType;

        @com.aliyun.core.annotation.NameInMap("PrivateIpSets")
        private java.util.List<PrivateIpSets> privateIpSets;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("SupportASP")
        private Boolean supportASP;

        @com.aliyun.core.annotation.NameInMap("SystemDiskCategory")
        private String systemDiskCategory;

        @com.aliyun.core.annotation.NameInMap("SystemDiskSize")
        private Integer systemDiskSize;

        @com.aliyun.core.annotation.NameInMap("WuyingServerId")
        private String wuyingServerId;

        @com.aliyun.core.annotation.NameInMap("WuyingServerName")
        private String wuyingServerName;

        private Data(Builder builder) {
            this.bandwidth = builder.bandwidth;
            this.bizRegionId = builder.bizRegionId;
            this.chargeType = builder.chargeType;
            this.createTime = builder.createTime;
            this.eniPrivateIpAddressQuantity = builder.eniPrivateIpAddressQuantity;
            this.expiredTime = builder.expiredTime;
            this.imageId = builder.imageId;
            this.imageName = builder.imageName;
            this.networkInterfaceIp = builder.networkInterfaceIp;
            this.officeSiteId = builder.officeSiteId;
            this.officeSiteName = builder.officeSiteName;
            this.officeSiteType = builder.officeSiteType;
            this.osType = builder.osType;
            this.privateIpSets = builder.privateIpSets;
            this.status = builder.status;
            this.supportASP = builder.supportASP;
            this.systemDiskCategory = builder.systemDiskCategory;
            this.systemDiskSize = builder.systemDiskSize;
            this.wuyingServerId = builder.wuyingServerId;
            this.wuyingServerName = builder.wuyingServerName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return bandwidth
         */
        public Integer getBandwidth() {
            return this.bandwidth;
        }

        /**
         * @return bizRegionId
         */
        public String getBizRegionId() {
            return this.bizRegionId;
        }

        /**
         * @return chargeType
         */
        public String getChargeType() {
            return this.chargeType;
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return eniPrivateIpAddressQuantity
         */
        public Integer getEniPrivateIpAddressQuantity() {
            return this.eniPrivateIpAddressQuantity;
        }

        /**
         * @return expiredTime
         */
        public String getExpiredTime() {
            return this.expiredTime;
        }

        /**
         * @return imageId
         */
        public String getImageId() {
            return this.imageId;
        }

        /**
         * @return imageName
         */
        public String getImageName() {
            return this.imageName;
        }

        /**
         * @return networkInterfaceIp
         */
        public String getNetworkInterfaceIp() {
            return this.networkInterfaceIp;
        }

        /**
         * @return officeSiteId
         */
        public String getOfficeSiteId() {
            return this.officeSiteId;
        }

        /**
         * @return officeSiteName
         */
        public String getOfficeSiteName() {
            return this.officeSiteName;
        }

        /**
         * @return officeSiteType
         */
        public String getOfficeSiteType() {
            return this.officeSiteType;
        }

        /**
         * @return osType
         */
        public String getOsType() {
            return this.osType;
        }

        /**
         * @return privateIpSets
         */
        public java.util.List<PrivateIpSets> getPrivateIpSets() {
            return this.privateIpSets;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return supportASP
         */
        public Boolean getSupportASP() {
            return this.supportASP;
        }

        /**
         * @return systemDiskCategory
         */
        public String getSystemDiskCategory() {
            return this.systemDiskCategory;
        }

        /**
         * @return systemDiskSize
         */
        public Integer getSystemDiskSize() {
            return this.systemDiskSize;
        }

        /**
         * @return wuyingServerId
         */
        public String getWuyingServerId() {
            return this.wuyingServerId;
        }

        /**
         * @return wuyingServerName
         */
        public String getWuyingServerName() {
            return this.wuyingServerName;
        }

        public static final class Builder {
            private Integer bandwidth; 
            private String bizRegionId; 
            private String chargeType; 
            private String createTime; 
            private Integer eniPrivateIpAddressQuantity; 
            private String expiredTime; 
            private String imageId; 
            private String imageName; 
            private String networkInterfaceIp; 
            private String officeSiteId; 
            private String officeSiteName; 
            private String officeSiteType; 
            private String osType; 
            private java.util.List<PrivateIpSets> privateIpSets; 
            private String status; 
            private Boolean supportASP; 
            private String systemDiskCategory; 
            private Integer systemDiskSize; 
            private String wuyingServerId; 
            private String wuyingServerName; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.bandwidth = model.bandwidth;
                this.bizRegionId = model.bizRegionId;
                this.chargeType = model.chargeType;
                this.createTime = model.createTime;
                this.eniPrivateIpAddressQuantity = model.eniPrivateIpAddressQuantity;
                this.expiredTime = model.expiredTime;
                this.imageId = model.imageId;
                this.imageName = model.imageName;
                this.networkInterfaceIp = model.networkInterfaceIp;
                this.officeSiteId = model.officeSiteId;
                this.officeSiteName = model.officeSiteName;
                this.officeSiteType = model.officeSiteType;
                this.osType = model.osType;
                this.privateIpSets = model.privateIpSets;
                this.status = model.status;
                this.supportASP = model.supportASP;
                this.systemDiskCategory = model.systemDiskCategory;
                this.systemDiskSize = model.systemDiskSize;
                this.wuyingServerId = model.wuyingServerId;
                this.wuyingServerName = model.wuyingServerName;
            } 

            /**
             * <p>The bandwidth size, in Mbit/s.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder bandwidth(Integer bandwidth) {
                this.bandwidth = bandwidth;
                return this;
            }

            /**
             * <p>The region ID.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou</p>
             */
            public Builder bizRegionId(String bizRegionId) {
                this.bizRegionId = bizRegionId;
                return this;
            }

            /**
             * <p>The billing type.</p>
             * 
             * <strong>example:</strong>
             * <p>PrePaid</p>
             */
            public Builder chargeType(String chargeType) {
                this.chargeType = chargeType;
                return this;
            }

            /**
             * <p>The creation time, in US English date and time format with a 12-hour clock.</p>
             * 
             * <strong>example:</strong>
             * <p>Sep 2, 2026 1:46:41 PM</p>
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The maximum number of private IP addresses per NIC, including the primary IP address.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder eniPrivateIpAddressQuantity(Integer eniPrivateIpAddressQuantity) {
                this.eniPrivateIpAddressQuantity = eniPrivateIpAddressQuantity;
                return this;
            }

            /**
             * <p>The expiration time, in US English date and time format with a 12-hour clock.</p>
             * 
             * <strong>example:</strong>
             * <p>Oct 3, 2026 12:00:00 AM</p>
             */
            public Builder expiredTime(String expiredTime) {
                this.expiredTime = expiredTime;
                return this;
            }

            /**
             * <p>The image ID.</p>
             * 
             * <strong>example:</strong>
             * <p>img-bp1234567890abcde</p>
             */
            public Builder imageId(String imageId) {
                this.imageId = imageId;
                return this;
            }

            /**
             * <p>The image name.</p>
             * 
             * <strong>example:</strong>
             * <p>Ubuntu 22.04</p>
             */
            public Builder imageName(String imageName) {
                this.imageName = imageName;
                return this;
            }

            /**
             * <p>The internal IP address.</p>
             * 
             * <strong>example:</strong>
             * <p>10.0.0.1</p>
             */
            public Builder networkInterfaceIp(String networkInterfaceIp) {
                this.networkInterfaceIp = networkInterfaceIp;
                return this;
            }

            /**
             * <p>The workspace ID.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou+dir-abc123</p>
             */
            public Builder officeSiteId(String officeSiteId) {
                this.officeSiteId = officeSiteId;
                return this;
            }

            /**
             * <p>The workspace name.</p>
             * 
             * <strong>example:</strong>
             * <p>Default Workspace</p>
             */
            public Builder officeSiteName(String officeSiteName) {
                this.officeSiteName = officeSiteName;
                return this;
            }

            /**
             * <p>The workspace type.</p>
             * 
             * <strong>example:</strong>
             * <p>Simple</p>
             */
            public Builder officeSiteType(String officeSiteType) {
                this.officeSiteType = officeSiteType;
                return this;
            }

            /**
             * <p>The operating system type.</p>
             * 
             * <strong>example:</strong>
             * <p>Linux</p>
             */
            public Builder osType(String osType) {
                this.osType = osType;
                return this;
            }

            /**
             * <p>The set of private IP addresses, including the primary and secondary IP addresses.</p>
             */
            public Builder privateIpSets(java.util.List<PrivateIpSets> privateIpSets) {
                this.privateIpSets = privateIpSets;
                return this;
            }

            /**
             * <p>The status of the development host.</p>
             * 
             * <strong>example:</strong>
             * <p>Running</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>Whether ASP streaming connection is supported.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder supportASP(Boolean supportASP) {
                this.supportASP = supportASP;
                return this;
            }

            /**
             * <p>The type of the system cloud disk.</p>
             * 
             * <strong>example:</strong>
             * <p>cloud_essd</p>
             */
            public Builder systemDiskCategory(String systemDiskCategory) {
                this.systemDiskCategory = systemDiskCategory;
                return this;
            }

            /**
             * <p>The size of the system cloud disk, in GB.</p>
             * 
             * <strong>example:</strong>
             * <p>80</p>
             */
            public Builder systemDiskSize(Integer systemDiskSize) {
                this.systemDiskSize = systemDiskSize;
                return this;
            }

            /**
             * <p>The ID of the development host.</p>
             * 
             * <strong>example:</strong>
             * <p>aig-bp1234567890abcde</p>
             */
            public Builder wuyingServerId(String wuyingServerId) {
                this.wuyingServerId = wuyingServerId;
                return this;
            }

            /**
             * <p>The name of the development host.</p>
             * 
             * <strong>example:</strong>
             * <p>my-dev-server</p>
             */
            public Builder wuyingServerName(String wuyingServerName) {
                this.wuyingServerName = wuyingServerName;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
