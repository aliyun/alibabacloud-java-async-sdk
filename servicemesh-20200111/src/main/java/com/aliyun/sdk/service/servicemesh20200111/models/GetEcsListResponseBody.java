// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.servicemesh20200111.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetEcsListResponseBody} extends {@link TeaModel}
 *
 * <p>GetEcsListResponseBody</p>
 */
public class GetEcsListResponseBody extends TeaModel {
    @NameInMap("EcsInstances")
    private java.util.List < EcsInstances> ecsInstances;

    @NameInMap("RequestId")
    private String requestId;

    private GetEcsListResponseBody(Builder builder) {
        this.ecsInstances = builder.ecsInstances;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetEcsListResponseBody create() {
        return builder().build();
    }

    /**
     * @return ecsInstances
     */
    public java.util.List < EcsInstances> getEcsInstances() {
        return this.ecsInstances;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List < EcsInstances> ecsInstances; 
        private String requestId; 

        /**
         * EcsInstances.
         */
        public Builder ecsInstances(java.util.List < EcsInstances> ecsInstances) {
            this.ecsInstances = ecsInstances;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetEcsListResponseBody build() {
            return new GetEcsListResponseBody(this);
        } 

    } 

    public static class EcsInstances extends TeaModel {
        @NameInMap("HasTag")
        private Boolean hasTag;

        @NameInMap("HostName")
        private String hostName;

        @NameInMap("InstanceId")
        private String instanceId;

        @NameInMap("IpAddress")
        private String ipAddress;

        @NameInMap("SecurityGroupIds")
        private java.util.List < String > securityGroupIds;

        @NameInMap("Status")
        private String status;

        private EcsInstances(Builder builder) {
            this.hasTag = builder.hasTag;
            this.hostName = builder.hostName;
            this.instanceId = builder.instanceId;
            this.ipAddress = builder.ipAddress;
            this.securityGroupIds = builder.securityGroupIds;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static EcsInstances create() {
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
         * @return securityGroupIds
         */
        public java.util.List < String > getSecurityGroupIds() {
            return this.securityGroupIds;
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
            private java.util.List < String > securityGroupIds; 
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
             * SecurityGroupIds.
             */
            public Builder securityGroupIds(java.util.List < String > securityGroupIds) {
                this.securityGroupIds = securityGroupIds;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public EcsInstances build() {
                return new EcsInstances(this);
            } 

        } 

    }
}
