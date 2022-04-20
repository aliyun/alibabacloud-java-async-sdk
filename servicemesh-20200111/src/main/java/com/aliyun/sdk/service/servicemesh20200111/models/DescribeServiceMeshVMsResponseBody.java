// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.servicemesh20200111.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeServiceMeshVMsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeServiceMeshVMsResponseBody</p>
 */
public class DescribeServiceMeshVMsResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("VMs")
    private java.util.List < VMs> vMs;

    private DescribeServiceMeshVMsResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.vMs = builder.vMs;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeServiceMeshVMsResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return vMs
     */
    public java.util.List < VMs> getVMs() {
        return this.vMs;
    }

    public static final class Builder {
        private String requestId; 
        private java.util.List < VMs> vMs; 

        /**
         * Id of the request
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * VMs.
         */
        public Builder vMs(java.util.List < VMs> vMs) {
            this.vMs = vMs;
            return this;
        }

        public DescribeServiceMeshVMsResponseBody build() {
            return new DescribeServiceMeshVMsResponseBody(this);
        } 

    } 

    public static class VMs extends TeaModel {
        @NameInMap("HasTag")
        private Boolean hasTag;

        @NameInMap("HostName")
        private String hostName;

        @NameInMap("InstanceId")
        private String instanceId;

        @NameInMap("IpAddress")
        private String ipAddress;

        @NameInMap("Region")
        private String region;

        @NameInMap("SecurityGroupIds")
        private String securityGroupIds;

        @NameInMap("ServiceMeshId")
        private String serviceMeshId;

        @NameInMap("Status")
        private String status;

        private VMs(Builder builder) {
            this.hasTag = builder.hasTag;
            this.hostName = builder.hostName;
            this.instanceId = builder.instanceId;
            this.ipAddress = builder.ipAddress;
            this.region = builder.region;
            this.securityGroupIds = builder.securityGroupIds;
            this.serviceMeshId = builder.serviceMeshId;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static VMs create() {
            return builder().build();
        }

        /**
         * @return hasTag
         */
        public Boolean getHasTag() {
            return this.hasTag;
        }

        /**
         * @return hostName
         */
        public String getHostName() {
            return this.hostName;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return ipAddress
         */
        public String getIpAddress() {
            return this.ipAddress;
        }

        /**
         * @return region
         */
        public String getRegion() {
            return this.region;
        }

        /**
         * @return securityGroupIds
         */
        public String getSecurityGroupIds() {
            return this.securityGroupIds;
        }

        /**
         * @return serviceMeshId
         */
        public String getServiceMeshId() {
            return this.serviceMeshId;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private Boolean hasTag; 
            private String hostName; 
            private String instanceId; 
            private String ipAddress; 
            private String region; 
            private String securityGroupIds; 
            private String serviceMeshId; 
            private String status; 

            /**
             * HasTag.
             */
            public Builder hasTag(Boolean hasTag) {
                this.hasTag = hasTag;
                return this;
            }

            /**
             * HostName.
             */
            public Builder hostName(String hostName) {
                this.hostName = hostName;
                return this;
            }

            /**
             * InstanceId.
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * IpAddress.
             */
            public Builder ipAddress(String ipAddress) {
                this.ipAddress = ipAddress;
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
             * SecurityGroupIds.
             */
            public Builder securityGroupIds(String securityGroupIds) {
                this.securityGroupIds = securityGroupIds;
                return this;
            }

            /**
             * ServiceMeshId.
             */
            public Builder serviceMeshId(String serviceMeshId) {
                this.serviceMeshId = serviceMeshId;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public VMs build() {
                return new VMs(this);
            } 

        } 

    }
}
