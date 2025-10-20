// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eiam20211201.models;

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
 * {@link GetNetworkZoneResponseBody} extends {@link TeaModel}
 *
 * <p>GetNetworkZoneResponseBody</p>
 */
public class GetNetworkZoneResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("NetworkZone")
    private NetworkZone networkZone;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private GetNetworkZoneResponseBody(Builder builder) {
        this.networkZone = builder.networkZone;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetNetworkZoneResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return networkZone
     */
    public NetworkZone getNetworkZone() {
        return this.networkZone;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private NetworkZone networkZone; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(GetNetworkZoneResponseBody model) {
            this.networkZone = model.networkZone;
            this.requestId = model.requestId;
        } 

        /**
         * NetworkZone.
         */
        public Builder networkZone(NetworkZone networkZone) {
            this.networkZone = networkZone;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetNetworkZoneResponseBody build() {
            return new GetNetworkZoneResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetNetworkZoneResponseBody} extends {@link TeaModel}
     *
     * <p>GetNetworkZoneResponseBody</p>
     */
    public static class NetworkZone extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("Ipv4Cidrs")
        private java.util.List<String> ipv4Cidrs;

        @com.aliyun.core.annotation.NameInMap("Ipv6Cidrs")
        private java.util.List<String> ipv6Cidrs;

        @com.aliyun.core.annotation.NameInMap("NetworkZoneId")
        private String networkZoneId;

        @com.aliyun.core.annotation.NameInMap("NetworkZoneName")
        private String networkZoneName;

        @com.aliyun.core.annotation.NameInMap("NetworkZoneType")
        private String networkZoneType;

        @com.aliyun.core.annotation.NameInMap("VpcId")
        private String vpcId;

        private NetworkZone(Builder builder) {
            this.description = builder.description;
            this.instanceId = builder.instanceId;
            this.ipv4Cidrs = builder.ipv4Cidrs;
            this.ipv6Cidrs = builder.ipv6Cidrs;
            this.networkZoneId = builder.networkZoneId;
            this.networkZoneName = builder.networkZoneName;
            this.networkZoneType = builder.networkZoneType;
            this.vpcId = builder.vpcId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static NetworkZone create() {
            return builder().build();
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return ipv4Cidrs
         */
        public java.util.List<String> getIpv4Cidrs() {
            return this.ipv4Cidrs;
        }

        /**
         * @return ipv6Cidrs
         */
        public java.util.List<String> getIpv6Cidrs() {
            return this.ipv6Cidrs;
        }

        /**
         * @return networkZoneId
         */
        public String getNetworkZoneId() {
            return this.networkZoneId;
        }

        /**
         * @return networkZoneName
         */
        public String getNetworkZoneName() {
            return this.networkZoneName;
        }

        /**
         * @return networkZoneType
         */
        public String getNetworkZoneType() {
            return this.networkZoneType;
        }

        /**
         * @return vpcId
         */
        public String getVpcId() {
            return this.vpcId;
        }

        public static final class Builder {
            private String description; 
            private String instanceId; 
            private java.util.List<String> ipv4Cidrs; 
            private java.util.List<String> ipv6Cidrs; 
            private String networkZoneId; 
            private String networkZoneName; 
            private String networkZoneType; 
            private String vpcId; 

            private Builder() {
            } 

            private Builder(NetworkZone model) {
                this.description = model.description;
                this.instanceId = model.instanceId;
                this.ipv4Cidrs = model.ipv4Cidrs;
                this.ipv6Cidrs = model.ipv6Cidrs;
                this.networkZoneId = model.networkZoneId;
                this.networkZoneName = model.networkZoneName;
                this.networkZoneType = model.networkZoneType;
                this.vpcId = model.vpcId;
            } 

            /**
             * <p>IDaaS EIAM 网络区域描述</p>
             * 
             * <strong>example:</strong>
             * <p>test_description</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>实例ID。</p>
             * 
             * <strong>example:</strong>
             * <p>idaas_ue2jvisn35ea5lmthk267xxxxx</p>
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * Ipv4Cidrs.
             */
            public Builder ipv4Cidrs(java.util.List<String> ipv4Cidrs) {
                this.ipv4Cidrs = ipv4Cidrs;
                return this;
            }

            /**
             * Ipv6Cidrs.
             */
            public Builder ipv6Cidrs(java.util.List<String> ipv6Cidrs) {
                this.ipv6Cidrs = ipv6Cidrs;
                return this;
            }

            /**
             * <p>IDaaS EIAM 网络区域Id</p>
             * 
             * <strong>example:</strong>
             * <p>network_m6fbr2bcbcadu3bcdpgzcxxxxx</p>
             */
            public Builder networkZoneId(String networkZoneId) {
                this.networkZoneId = networkZoneId;
                return this;
            }

            /**
             * <p>IDaaS EIAM 网络区域名称</p>
             * 
             * <strong>example:</strong>
             * <p>test4_name</p>
             */
            public Builder networkZoneName(String networkZoneName) {
                this.networkZoneName = networkZoneName;
                return this;
            }

            /**
             * <p>IDaaS EIAM 网络区域类型</p>
             * 
             * <strong>example:</strong>
             * <p>arn:alibaba:idaas:network:zone:classic</p>
             */
            public Builder networkZoneType(String networkZoneType) {
                this.networkZoneType = networkZoneType;
                return this;
            }

            /**
             * <p>IDaaS EIAM 专有网络VpcId</p>
             * 
             * <strong>example:</strong>
             * <p>vpc-25w8wxxxx</p>
             */
            public Builder vpcId(String vpcId) {
                this.vpcId = vpcId;
                return this;
            }

            public NetworkZone build() {
                return new NetworkZone(this);
            } 

        } 

    }
}
