// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20200930.models;

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
 * {@link DescribeDesktopMetadataResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDesktopMetadataResponseBody</p>
 */
public class DescribeDesktopMetadataResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Desktops")
    private java.util.List<Desktops> desktops;

    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeDesktopMetadataResponseBody(Builder builder) {
        this.desktops = builder.desktops;
        this.nextToken = builder.nextToken;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDesktopMetadataResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return desktops
     */
    public java.util.List<Desktops> getDesktops() {
        return this.desktops;
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List<Desktops> desktops; 
        private String nextToken; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(DescribeDesktopMetadataResponseBody model) {
            this.desktops = model.desktops;
            this.nextToken = model.nextToken;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The cloud desktop details.</p>
         */
        public Builder desktops(java.util.List<Desktops> desktops) {
            this.desktops = desktops;
            return this;
        }

        /**
         * <p>The token for the next query. An empty value indicates that there are no more results.</p>
         * 
         * <strong>example:</strong>
         * <p>caeba0bbb2be03f84eb48b699f0a4883</p>
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1CBAFFAB-B697-4049-A9B1-67E1FC5F****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeDesktopMetadataResponseBody build() {
            return new DescribeDesktopMetadataResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeDesktopMetadataResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDesktopMetadataResponseBody</p>
     */
    public static class Desktops extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AgentProviderList")
        private java.util.List<String> agentProviderList;

        @com.aliyun.core.annotation.NameInMap("ChargeType")
        private String chargeType;

        @com.aliyun.core.annotation.NameInMap("CreationTime")
        private String creationTime;

        @com.aliyun.core.annotation.NameInMap("DesktopGroupId")
        private String desktopGroupId;

        @com.aliyun.core.annotation.NameInMap("DesktopId")
        private String desktopId;

        @com.aliyun.core.annotation.NameInMap("DesktopName")
        private String desktopName;

        @com.aliyun.core.annotation.NameInMap("DesktopStatus")
        private String desktopStatus;

        @com.aliyun.core.annotation.NameInMap("DesktopType")
        private String desktopType;

        @com.aliyun.core.annotation.NameInMap("ExpiredTime")
        private String expiredTime;

        @com.aliyun.core.annotation.NameInMap("ImageId")
        private String imageId;

        @com.aliyun.core.annotation.NameInMap("LocalName")
        private String localName;

        @com.aliyun.core.annotation.NameInMap("ManagementFlags")
        private java.util.List<String> managementFlags;

        @com.aliyun.core.annotation.NameInMap("MemberEniIp")
        private String memberEniIp;

        @com.aliyun.core.annotation.NameInMap("OfficeSiteId")
        private String officeSiteId;

        @com.aliyun.core.annotation.NameInMap("Platform")
        private String platform;

        @com.aliyun.core.annotation.NameInMap("RegionId")
        private String regionId;

        @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
        private String resourceGroupId;

        @com.aliyun.core.annotation.NameInMap("ResourceGroupName")
        private String resourceGroupName;

        @com.aliyun.core.annotation.NameInMap("StartTime")
        private String startTime;

        private Desktops(Builder builder) {
            this.agentProviderList = builder.agentProviderList;
            this.chargeType = builder.chargeType;
            this.creationTime = builder.creationTime;
            this.desktopGroupId = builder.desktopGroupId;
            this.desktopId = builder.desktopId;
            this.desktopName = builder.desktopName;
            this.desktopStatus = builder.desktopStatus;
            this.desktopType = builder.desktopType;
            this.expiredTime = builder.expiredTime;
            this.imageId = builder.imageId;
            this.localName = builder.localName;
            this.managementFlags = builder.managementFlags;
            this.memberEniIp = builder.memberEniIp;
            this.officeSiteId = builder.officeSiteId;
            this.platform = builder.platform;
            this.regionId = builder.regionId;
            this.resourceGroupId = builder.resourceGroupId;
            this.resourceGroupName = builder.resourceGroupName;
            this.startTime = builder.startTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Desktops create() {
            return builder().build();
        }

        /**
         * @return agentProviderList
         */
        public java.util.List<String> getAgentProviderList() {
            return this.agentProviderList;
        }

        /**
         * @return chargeType
         */
        public String getChargeType() {
            return this.chargeType;
        }

        /**
         * @return creationTime
         */
        public String getCreationTime() {
            return this.creationTime;
        }

        /**
         * @return desktopGroupId
         */
        public String getDesktopGroupId() {
            return this.desktopGroupId;
        }

        /**
         * @return desktopId
         */
        public String getDesktopId() {
            return this.desktopId;
        }

        /**
         * @return desktopName
         */
        public String getDesktopName() {
            return this.desktopName;
        }

        /**
         * @return desktopStatus
         */
        public String getDesktopStatus() {
            return this.desktopStatus;
        }

        /**
         * @return desktopType
         */
        public String getDesktopType() {
            return this.desktopType;
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
         * @return localName
         */
        public String getLocalName() {
            return this.localName;
        }

        /**
         * @return managementFlags
         */
        public java.util.List<String> getManagementFlags() {
            return this.managementFlags;
        }

        /**
         * @return memberEniIp
         */
        public String getMemberEniIp() {
            return this.memberEniIp;
        }

        /**
         * @return officeSiteId
         */
        public String getOfficeSiteId() {
            return this.officeSiteId;
        }

        /**
         * @return platform
         */
        public String getPlatform() {
            return this.platform;
        }

        /**
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
        }

        /**
         * @return resourceGroupId
         */
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        /**
         * @return resourceGroupName
         */
        public String getResourceGroupName() {
            return this.resourceGroupName;
        }

        /**
         * @return startTime
         */
        public String getStartTime() {
            return this.startTime;
        }

        public static final class Builder {
            private java.util.List<String> agentProviderList; 
            private String chargeType; 
            private String creationTime; 
            private String desktopGroupId; 
            private String desktopId; 
            private String desktopName; 
            private String desktopStatus; 
            private String desktopType; 
            private String expiredTime; 
            private String imageId; 
            private String localName; 
            private java.util.List<String> managementFlags; 
            private String memberEniIp; 
            private String officeSiteId; 
            private String platform; 
            private String regionId; 
            private String resourceGroupId; 
            private String resourceGroupName; 
            private String startTime; 

            private Builder() {
            } 

            private Builder(Desktops model) {
                this.agentProviderList = model.agentProviderList;
                this.chargeType = model.chargeType;
                this.creationTime = model.creationTime;
                this.desktopGroupId = model.desktopGroupId;
                this.desktopId = model.desktopId;
                this.desktopName = model.desktopName;
                this.desktopStatus = model.desktopStatus;
                this.desktopType = model.desktopType;
                this.expiredTime = model.expiredTime;
                this.imageId = model.imageId;
                this.localName = model.localName;
                this.managementFlags = model.managementFlags;
                this.memberEniIp = model.memberEniIp;
                this.officeSiteId = model.officeSiteId;
                this.platform = model.platform;
                this.regionId = model.regionId;
                this.resourceGroupId = model.resourceGroupId;
                this.resourceGroupName = model.resourceGroupName;
                this.startTime = model.startTime;
            } 

            /**
             * <p>The agents supported by the current cloud computer.</p>
             */
            public Builder agentProviderList(java.util.List<String> agentProviderList) {
                this.agentProviderList = agentProviderList;
                return this;
            }

            /**
             * <p>The billing type of the cloud desktop. Valid values:</p>
             * <ul>
             * <li>PostPaid: pay-as-you-go.</li>
             * <li>PrePaid: subscription.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>PostPaid</p>
             */
            public Builder chargeType(String chargeType) {
                this.chargeType = chargeType;
                return this;
            }

            /**
             * <p>The time when the cloud desktop was created. The time is in the ISO 8601 standard (UTC).</p>
             * 
             * <strong>example:</strong>
             * <p>2020-11-06T08:28Z</p>
             */
            public Builder creationTime(String creationTime) {
                this.creationTime = creationTime;
                return this;
            }

            /**
             * <p>The shared cloud computer ID.</p>
             * 
             * <strong>example:</strong>
             * <p>dg-3uiojcc0j4kh7****</p>
             */
            public Builder desktopGroupId(String desktopGroupId) {
                this.desktopGroupId = desktopGroupId;
                return this;
            }

            /**
             * <p>The cloud desktop ID.</p>
             * 
             * <strong>example:</strong>
             * <p>ecd-gx2x1dhsmucyy****</p>
             */
            public Builder desktopId(String desktopId) {
                this.desktopId = desktopId;
                return this;
            }

            /**
             * <p>The cloud desktop name.</p>
             * 
             * <strong>example:</strong>
             * <p>testDesktopName</p>
             */
            public Builder desktopName(String desktopName) {
                this.desktopName = desktopName;
                return this;
            }

            /**
             * <p>The cloud desktop status. Valid values:</p>
             * <ul>
             * <li>Stopped: stopped.</li>
             * <li>Starting: starting.</li>
             * <li>Rebuilding: rebuilding.</li>
             * <li>Running: running.</li>
             * <li>Stopping: stopping.</li>
             * <li>Expired: expired.</li>
             * <li>Deleted: deleted.</li>
             * <li>Pending: pending.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Running</p>
             */
            public Builder desktopStatus(String desktopStatus) {
                this.desktopStatus = desktopStatus;
                return this;
            }

            /**
             * <p>The cloud desktop specifications.</p>
             * 
             * <strong>example:</strong>
             * <p>eds.general.2c8g</p>
             */
            public Builder desktopType(String desktopType) {
                this.desktopType = desktopType;
                return this;
            }

            /**
             * <p>The time when the cloud desktop expires. This value is returned only for cloud desktops that use the subscription billable method. The time format follows the ISO 8601 standard (UTC).</p>
             * 
             * <strong>example:</strong>
             * <p>2021-12-31T15:59Z</p>
             */
            public Builder expiredTime(String expiredTime) {
                this.expiredTime = expiredTime;
                return this;
            }

            /**
             * <p>The image ID.</p>
             * 
             * <strong>example:</strong>
             * <p>m-4zfb6zj728hhr****</p>
             */
            public Builder imageId(String imageId) {
                this.imageId = imageId;
                return this;
            }

            /**
             * <p>The local name of the region to which the cloud desktop belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>华东2（上海）</p>
             */
            public Builder localName(String localName) {
                this.localName = localName;
                return this;
            }

            /**
             * <p>The management status of the cloud computer.</p>
             */
            public Builder managementFlags(java.util.List<String> managementFlags) {
                this.managementFlags = managementFlags;
                return this;
            }

            /**
             * <p>The IP address of the member elastic network interface (ENI) of the instance.</p>
             * 
             * <strong>example:</strong>
             * <p>192.168.2.1</p>
             */
            public Builder memberEniIp(String memberEniIp) {
                this.memberEniIp = memberEniIp;
                return this;
            }

            /**
             * <p>The workspace ID.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou+dir-363353****</p>
             */
            public Builder officeSiteId(String officeSiteId) {
                this.officeSiteId = officeSiteId;
                return this;
            }

            /**
             * <p>The operating system platform information.</p>
             * 
             * <strong>example:</strong>
             * <p>Ubuntu</p>
             */
            public Builder platform(String platform) {
                this.platform = platform;
                return this;
            }

            /**
             * <p>The region ID.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou</p>
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * <p>The resource group ID.</p>
             * 
             * <strong>example:</strong>
             * <p>rg-f3s3dgt8dtb0vlqc8</p>
             */
            public Builder resourceGroupId(String resourceGroupId) {
                this.resourceGroupId = resourceGroupId;
                return this;
            }

            /**
             * <p>The resource group name.</p>
             * 
             * <strong>example:</strong>
             * <p>serverless_new</p>
             */
            public Builder resourceGroupName(String resourceGroupName) {
                this.resourceGroupName = resourceGroupName;
                return this;
            }

            /**
             * <p>The time when the cloud desktop was started. The time is in the ISO 8601 standard (UTC).</p>
             * 
             * <strong>example:</strong>
             * <p>2020-11-06T08:31Z</p>
             */
            public Builder startTime(String startTime) {
                this.startTime = startTime;
                return this;
            }

            public Desktops build() {
                return new Desktops(this);
            } 

        } 

    }
}
