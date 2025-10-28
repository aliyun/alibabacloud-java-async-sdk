// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.edas20170801.models;

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
 * {@link ListSlbResponseBody} extends {@link TeaModel}
 *
 * <p>ListSlbResponseBody</p>
 */
public class ListSlbResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private Integer code;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("SlbList")
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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(ListSlbResponseBody model) {
            this.code = model.code;
            this.message = model.message;
            this.requestId = model.requestId;
            this.slbList = model.slbList;
        } 

        /**
         * <p>The HTTP status code that is returned.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(Integer code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The additional information that is returned.</p>
         * 
         * <strong>example:</strong>
         * <p>success</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>b197-40ab-9155-7ca7</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The list of SLB instances.</p>
         */
        public Builder slbList(SlbList slbList) {
            this.slbList = slbList;
            return this;
        }

        public ListSlbResponseBody build() {
            return new ListSlbResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListSlbResponseBody} extends {@link TeaModel}
     *
     * <p>ListSlbResponseBody</p>
     */
    public static class SlbEntity extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Address")
        private String address;

        @com.aliyun.core.annotation.NameInMap("AddressType")
        private String addressType;

        @com.aliyun.core.annotation.NameInMap("Expired")
        private Boolean expired;

        @com.aliyun.core.annotation.NameInMap("GroupId")
        private Integer groupId;

        @com.aliyun.core.annotation.NameInMap("NetworkType")
        private String networkType;

        @com.aliyun.core.annotation.NameInMap("RegionId")
        private String regionId;

        @com.aliyun.core.annotation.NameInMap("Reusable")
        private Boolean reusable;

        @com.aliyun.core.annotation.NameInMap("SlbId")
        private String slbId;

        @com.aliyun.core.annotation.NameInMap("SlbName")
        private String slbName;

        @com.aliyun.core.annotation.NameInMap("SlbStatus")
        private String slbStatus;

        @com.aliyun.core.annotation.NameInMap("Tags")
        private String tags;

        @com.aliyun.core.annotation.NameInMap("UserId")
        private String userId;

        @com.aliyun.core.annotation.NameInMap("VpcId")
        private String vpcId;

        @com.aliyun.core.annotation.NameInMap("VswitchId")
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

            private Builder() {
            } 

            private Builder(SlbEntity model) {
                this.address = model.address;
                this.addressType = model.addressType;
                this.expired = model.expired;
                this.groupId = model.groupId;
                this.networkType = model.networkType;
                this.regionId = model.regionId;
                this.reusable = model.reusable;
                this.slbId = model.slbId;
                this.slbName = model.slbName;
                this.slbStatus = model.slbStatus;
                this.tags = model.tags;
                this.userId = model.userId;
                this.vpcId = model.vpcId;
                this.vswitchId = model.vswitchId;
            } 

            /**
             * <p>The IP address of the SLB instance.</p>
             * 
             * <strong>example:</strong>
             * <p>39.176.XX.XX</p>
             */
            public Builder address(String address) {
                this.address = address;
                return this;
            }

            /**
             * <p>The type of the IP addresses. Valid values:</p>
             * <ul>
             * <li>internet: Users can connect to the SLB instance over the Internet.</li>
             * <li>intranet: Users can connect to the SLB instance over the internal network.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>internet</p>
             */
            public Builder addressType(String addressType) {
                this.addressType = addressType;
                return this;
            }

            /**
             * <p>Indicates whether the SLB instance has expired. Valid values:</p>
             * <ul>
             * <li>true: The SLB instance has expired.</li>
             * <li>false: The SLB instance has not expired.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder expired(Boolean expired) {
                this.expired = expired;
                return this;
            }

            /**
             * <p>The ID of the resource group in Enterprise Distributed Application Service (EDAS).</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder groupId(Integer groupId) {
                this.groupId = groupId;
                return this;
            }

            /**
             * <p>The type of the network.</p>
             * 
             * <strong>example:</strong>
             * <p>classic</p>
             */
            public Builder networkType(String networkType) {
                this.networkType = networkType;
                return this;
            }

            /**
             * <p>The ID of the region.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-beijing</p>
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * <p>Indicates whether Kubernetes applications can be reused. Valid values:</p>
             * <ul>
             * <li>true: Kubernetes applications can be reused.</li>
             * <li>false: Kubernetes applications cannot be reused.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder reusable(Boolean reusable) {
                this.reusable = reusable;
                return this;
            }

            /**
             * <p>The ID of the SLB instance.</p>
             * 
             * <strong>example:</strong>
             * <p>lb-2ze055t3xv7s8****</p>
             */
            public Builder slbId(String slbId) {
                this.slbId = slbId;
                return this;
            }

            /**
             * <p>The name of the SLB instance.</p>
             * 
             * <strong>example:</strong>
             * <p>adce</p>
             */
            public Builder slbName(String slbName) {
                this.slbName = slbName;
                return this;
            }

            /**
             * <p>The status of the SLB instance.</p>
             * 
             * <strong>example:</strong>
             * <p>active</p>
             */
            public Builder slbStatus(String slbStatus) {
                this.slbStatus = slbStatus;
                return this;
            }

            /**
             * <p>The tag of the SLB instance.</p>
             * 
             * <strong>example:</strong>
             * <p>[{&quot;tagKey&quot;:&quot;tag&quot;,&quot;tagValue&quot;:&quot;value&quot;}]</p>
             */
            public Builder tags(String tags) {
                this.tags = tags;
                return this;
            }

            /**
             * <p>The ID of the user.</p>
             * 
             * <strong>example:</strong>
             * <p>edas_****_*<em>st@aliyun-</em>***.com</p>
             */
            public Builder userId(String userId) {
                this.userId = userId;
                return this;
            }

            /**
             * <p>The ID of the VPC.</p>
             * 
             * <strong>example:</strong>
             * <p>vpc-bp1f90rfybszjogyw****</p>
             */
            public Builder vpcId(String vpcId) {
                this.vpcId = vpcId;
                return this;
            }

            /**
             * <p>The ID of the vSwitch in the VPC.</p>
             * 
             * <strong>example:</strong>
             * <p>vsw-bp156w1gpbv0o50hs****</p>
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
    /**
     * 
     * {@link ListSlbResponseBody} extends {@link TeaModel}
     *
     * <p>ListSlbResponseBody</p>
     */
    public static class SlbList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("SlbEntity")
        private java.util.List<SlbEntity> slbEntity;

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
        public java.util.List<SlbEntity> getSlbEntity() {
            return this.slbEntity;
        }

        public static final class Builder {
            private java.util.List<SlbEntity> slbEntity; 

            private Builder() {
            } 

            private Builder(SlbList model) {
                this.slbEntity = model.slbEntity;
            } 

            /**
             * SlbEntity.
             */
            public Builder slbEntity(java.util.List<SlbEntity> slbEntity) {
                this.slbEntity = slbEntity;
                return this;
            }

            public SlbList build() {
                return new SlbList(this);
            } 

        } 

    }
}
