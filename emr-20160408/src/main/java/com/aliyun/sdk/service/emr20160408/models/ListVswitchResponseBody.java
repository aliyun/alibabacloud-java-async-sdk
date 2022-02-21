// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.emr20160408.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListVswitchResponseBody} extends {@link TeaModel}
 *
 * <p>ListVswitchResponseBody</p>
 */
public class ListVswitchResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("VswitchList")
    private VswitchList vswitchList;

    private ListVswitchResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.vswitchList = builder.vswitchList;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListVswitchResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return vswitchList
     */
    public VswitchList getVswitchList() {
        return this.vswitchList;
    }

    public static final class Builder {
        private String requestId; 
        private VswitchList vswitchList; 

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * VswitchList.
         */
        public Builder vswitchList(VswitchList vswitchList) {
            this.vswitchList = vswitchList;
            return this;
        }

        public ListVswitchResponseBody build() {
            return new ListVswitchResponseBody(this);
        } 

    } 

    public static class Vswitch extends TeaModel {
        @NameInMap("AvailableIpAddressCount")
        private String availableIpAddressCount;

        @NameInMap("CidrBlock")
        private String cidrBlock;

        @NameInMap("CreationTime")
        private String creationTime;

        @NameInMap("Description")
        private String description;

        @NameInMap("IsDefault")
        private Boolean isDefault;

        @NameInMap("ResourceGroupId")
        private String resourceGroupId;

        @NameInMap("Status")
        private String status;

        @NameInMap("VSwitchId")
        private String vSwitchId;

        @NameInMap("VSwitchName")
        private String vSwitchName;

        @NameInMap("VpcId")
        private String vpcId;

        @NameInMap("ZoneId")
        private String zoneId;

        private Vswitch(Builder builder) {
            this.availableIpAddressCount = builder.availableIpAddressCount;
            this.cidrBlock = builder.cidrBlock;
            this.creationTime = builder.creationTime;
            this.description = builder.description;
            this.isDefault = builder.isDefault;
            this.resourceGroupId = builder.resourceGroupId;
            this.status = builder.status;
            this.vSwitchId = builder.vSwitchId;
            this.vSwitchName = builder.vSwitchName;
            this.vpcId = builder.vpcId;
            this.zoneId = builder.zoneId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Vswitch create() {
            return builder().build();
        }

        /**
         * @return availableIpAddressCount
         */
        public String getAvailableIpAddressCount() {
            return this.availableIpAddressCount;
        }

        /**
         * @return cidrBlock
         */
        public String getCidrBlock() {
            return this.cidrBlock;
        }

        /**
         * @return creationTime
         */
        public String getCreationTime() {
            return this.creationTime;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return isDefault
         */
        public Boolean getIsDefault() {
            return this.isDefault;
        }

        /**
         * @return resourceGroupId
         */
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return vSwitchId
         */
        public String getVSwitchId() {
            return this.vSwitchId;
        }

        /**
         * @return vSwitchName
         */
        public String getVSwitchName() {
            return this.vSwitchName;
        }

        /**
         * @return vpcId
         */
        public String getVpcId() {
            return this.vpcId;
        }

        /**
         * @return zoneId
         */
        public String getZoneId() {
            return this.zoneId;
        }

        public static final class Builder {
            private String availableIpAddressCount; 
            private String cidrBlock; 
            private String creationTime; 
            private String description; 
            private Boolean isDefault; 
            private String resourceGroupId; 
            private String status; 
            private String vSwitchId; 
            private String vSwitchName; 
            private String vpcId; 
            private String zoneId; 

            /**
             * AvailableIpAddressCount.
             */
            public Builder availableIpAddressCount(String availableIpAddressCount) {
                this.availableIpAddressCount = availableIpAddressCount;
                return this;
            }

            /**
             * CidrBlock.
             */
            public Builder cidrBlock(String cidrBlock) {
                this.cidrBlock = cidrBlock;
                return this;
            }

            /**
             * CreationTime.
             */
            public Builder creationTime(String creationTime) {
                this.creationTime = creationTime;
                return this;
            }

            /**
             * Description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * IsDefault.
             */
            public Builder isDefault(Boolean isDefault) {
                this.isDefault = isDefault;
                return this;
            }

            /**
             * ResourceGroupId.
             */
            public Builder resourceGroupId(String resourceGroupId) {
                this.resourceGroupId = resourceGroupId;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * VSwitchId.
             */
            public Builder vSwitchId(String vSwitchId) {
                this.vSwitchId = vSwitchId;
                return this;
            }

            /**
             * VSwitchName.
             */
            public Builder vSwitchName(String vSwitchName) {
                this.vSwitchName = vSwitchName;
                return this;
            }

            /**
             * VpcId.
             */
            public Builder vpcId(String vpcId) {
                this.vpcId = vpcId;
                return this;
            }

            /**
             * ZoneId.
             */
            public Builder zoneId(String zoneId) {
                this.zoneId = zoneId;
                return this;
            }

            public Vswitch build() {
                return new Vswitch(this);
            } 

        } 

    }
    public static class VswitchList extends TeaModel {
        @NameInMap("Vswitch")
        private java.util.List < Vswitch> vswitch;

        private VswitchList(Builder builder) {
            this.vswitch = builder.vswitch;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static VswitchList create() {
            return builder().build();
        }

        /**
         * @return vswitch
         */
        public java.util.List < Vswitch> getVswitch() {
            return this.vswitch;
        }

        public static final class Builder {
            private java.util.List < Vswitch> vswitch; 

            /**
             * Vswitch.
             */
            public Builder vswitch(java.util.List < Vswitch> vswitch) {
                this.vswitch = vswitch;
                return this;
            }

            public VswitchList build() {
                return new VswitchList(this);
            } 

        } 

    }
}
