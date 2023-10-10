// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.edas20170801.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListSlbResponseBody} extends {@link TeaModel}
 *
 * <p>ListSlbResponseBody</p>
 */
public class ListSlbResponseBody extends TeaModel {
    @NameInMap("Code")
    private Integer code;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("SlbList")
    private SlbList slbList;

    private ListSlbResponseBody(Builder builder) {
        this.code = builder.code;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.slbList = builder.slbList;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListSlbResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public Integer getCode() {
        return this.code;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return slbList
     */
    public SlbList getSlbList() {
        return this.slbList;
    }

    public static final class Builder {
        private Integer code; 
        private String message; 
        private String requestId; 
        private SlbList slbList; 

        /**
         * The HTTP status code that is returned.
         */
        public Builder code(Integer code) {
            this.code = code;
            return this;
        }

        /**
         * The additional information that is returned.
         */
        public Builder message(String message) {
            this.message = message;
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
         * The list of SLB instances.
         */
        public Builder slbList(SlbList slbList) {
            this.slbList = slbList;
            return this;
        }

        public ListSlbResponseBody build() {
            return new ListSlbResponseBody(this);
        } 

    } 

    public static class SlbEntity extends TeaModel {
        @NameInMap("Address")
        private String address;

        @NameInMap("AddressType")
        private String addressType;

        @NameInMap("Expired")
        private Boolean expired;

        @NameInMap("GroupId")
        private Integer groupId;

        @NameInMap("NetworkType")
        private String networkType;

        @NameInMap("RegionId")
        private String regionId;

        @NameInMap("Reusable")
        private Boolean reusable;

        @NameInMap("SlbId")
        private String slbId;

        @NameInMap("SlbName")
        private String slbName;

        @NameInMap("SlbStatus")
        private String slbStatus;

        @NameInMap("Tags")
        private String tags;

        @NameInMap("UserId")
        private String userId;

        @NameInMap("VpcId")
        private String vpcId;

        @NameInMap("VswitchId")
        private String vswitchId;

        private SlbEntity(Builder builder) {
            this.address = builder.address;
            this.addressType = builder.addressType;
            this.expired = builder.expired;
            this.groupId = builder.groupId;
            this.networkType = builder.networkType;
            this.regionId = builder.regionId;
            this.reusable = builder.reusable;
            this.slbId = builder.slbId;
            this.slbName = builder.slbName;
            this.slbStatus = builder.slbStatus;
            this.tags = builder.tags;
            this.userId = builder.userId;
            this.vpcId = builder.vpcId;
            this.vswitchId = builder.vswitchId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SlbEntity create() {
            return builder().build();
        }

        /**
         * @return address
         */
        public String getAddress() {
            return this.address;
        }

        /**
         * @return addressType
         */
        public String getAddressType() {
            return this.addressType;
        }

        /**
         * @return expired
         */
        public Boolean getExpired() {
            return this.expired;
        }

        /**
         * @return groupId
         */
        public Integer getGroupId() {
            return this.groupId;
        }

        /**
         * @return networkType
         */
        public String getNetworkType() {
            return this.networkType;
        }

        /**
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
        }

        /**
         * @return reusable
         */
        public Boolean getReusable() {
            return this.reusable;
        }

        /**
         * @return slbId
         */
        public String getSlbId() {
            return this.slbId;
        }

        /**
         * @return slbName
         */
        public String getSlbName() {
            return this.slbName;
        }

        /**
         * @return slbStatus
         */
        public String getSlbStatus() {
            return this.slbStatus;
        }

        /**
         * @return tags
         */
        public String getTags() {
            return this.tags;
        }

        /**
         * @return userId
         */
        public String getUserId() {
            return this.userId;
        }

        /**
         * @return vpcId
         */
        public String getVpcId() {
            return this.vpcId;
        }

        /**
         * @return vswitchId
         */
        public String getVswitchId() {
            return this.vswitchId;
        }

        public static final class Builder {
            private String address; 
            private String addressType; 
            private Boolean expired; 
            private Integer groupId; 
            private String networkType; 
            private String regionId; 
            private Boolean reusable; 
            private String slbId; 
            private String slbName; 
            private String slbStatus; 
            private String tags; 
            private String userId; 
            private String vpcId; 
            private String vswitchId; 

            /**
             * The IP address of the SLB instance.
             */
            public Builder address(String address) {
                this.address = address;
                return this;
            }

            /**
             * The type of the IP addresses. Valid values:
             * <p>
             * 
             * *   internet: Users can connect to the SLB instance over the Internet.
             * *   intranet: Users can connect to the SLB instance over the internal network.
             */
            public Builder addressType(String addressType) {
                this.addressType = addressType;
                return this;
            }

            /**
             * Indicates whether the SLB instance has expired. Valid values:
             * <p>
             * 
             * *   true: The SLB instance has expired.
             * *   false: The SLB instance has not expired.
             */
            public Builder expired(Boolean expired) {
                this.expired = expired;
                return this;
            }

            /**
             * The ID of the resource group in Enterprise Distributed Application Service (EDAS).
             */
            public Builder groupId(Integer groupId) {
                this.groupId = groupId;
                return this;
            }

            /**
             * The type of the network.
             */
            public Builder networkType(String networkType) {
                this.networkType = networkType;
                return this;
            }

            /**
             * The ID of the region.
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * Indicates whether Kubernetes applications can be reused. Valid values:
             * <p>
             * 
             * *   true: Kubernetes applications can be reused.
             * *   false: Kubernetes applications cannot be reused.
             */
            public Builder reusable(Boolean reusable) {
                this.reusable = reusable;
                return this;
            }

            /**
             * The ID of the SLB instance.
             */
            public Builder slbId(String slbId) {
                this.slbId = slbId;
                return this;
            }

            /**
             * The name of the SLB instance.
             */
            public Builder slbName(String slbName) {
                this.slbName = slbName;
                return this;
            }

            /**
             * The status of the SLB instance.
             */
            public Builder slbStatus(String slbStatus) {
                this.slbStatus = slbStatus;
                return this;
            }

            /**
             * The tag of the SLB instance.
             */
            public Builder tags(String tags) {
                this.tags = tags;
                return this;
            }

            /**
             * The ID of the user.
             */
            public Builder userId(String userId) {
                this.userId = userId;
                return this;
            }

            /**
             * The ID of the VPC.
             */
            public Builder vpcId(String vpcId) {
                this.vpcId = vpcId;
                return this;
            }

            /**
             * The ID of the vSwitch in the VPC.
             */
            public Builder vswitchId(String vswitchId) {
                this.vswitchId = vswitchId;
                return this;
            }

            public SlbEntity build() {
                return new SlbEntity(this);
            } 

        } 

    }
    public static class SlbList extends TeaModel {
        @NameInMap("SlbEntity")
        private java.util.List < SlbEntity> slbEntity;

        private SlbList(Builder builder) {
            this.slbEntity = builder.slbEntity;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SlbList create() {
            return builder().build();
        }

        /**
         * @return slbEntity
         */
        public java.util.List < SlbEntity> getSlbEntity() {
            return this.slbEntity;
        }

        public static final class Builder {
            private java.util.List < SlbEntity> slbEntity; 

            /**
             * SlbEntity.
             */
            public Builder slbEntity(java.util.List < SlbEntity> slbEntity) {
                this.slbEntity = slbEntity;
                return this;
            }

            public SlbList build() {
                return new SlbList(this);
            } 

        } 

    }
}
