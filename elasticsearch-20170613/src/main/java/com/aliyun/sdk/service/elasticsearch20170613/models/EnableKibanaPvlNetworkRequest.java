// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.elasticsearch20170613.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link EnableKibanaPvlNetworkRequest} extends {@link RequestModel}
 *
 * <p>EnableKibanaPvlNetworkRequest</p>
 */
public class EnableKibanaPvlNetworkRequest extends Request {
    @Path
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    @Body
    @NameInMap("endpointName")
    @Validation(required = true)
    private String endpointName;

    @Body
    @NameInMap("securityGroups")
    @Validation(required = true)
    private java.util.List < String > securityGroups;

    @Body
    @NameInMap("vSwitchIdsZone")
    @Validation(required = true)
    private java.util.List < VSwitchIdsZone> vSwitchIdsZone;

    @Body
    @NameInMap("vpcId")
    @Validation(required = true)
    private String vpcId;

    private EnableKibanaPvlNetworkRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.endpointName = builder.endpointName;
        this.securityGroups = builder.securityGroups;
        this.vSwitchIdsZone = builder.vSwitchIdsZone;
        this.vpcId = builder.vpcId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static EnableKibanaPvlNetworkRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return endpointName
     */
    public String getEndpointName() {
        return this.endpointName;
    }

    /**
     * @return securityGroups
     */
    public java.util.List < String > getSecurityGroups() {
        return this.securityGroups;
    }

    /**
     * @return vSwitchIdsZone
     */
    public java.util.List < VSwitchIdsZone> getVSwitchIdsZone() {
        return this.vSwitchIdsZone;
    }

    /**
     * @return vpcId
     */
    public String getVpcId() {
        return this.vpcId;
    }

    public static final class Builder extends Request.Builder<EnableKibanaPvlNetworkRequest, Builder> {
        private String instanceId; 
        private String endpointName; 
        private java.util.List < String > securityGroups; 
        private java.util.List < VSwitchIdsZone> vSwitchIdsZone; 
        private String vpcId; 

        private Builder() {
            super();
        } 

        private Builder(EnableKibanaPvlNetworkRequest request) {
            super(request);
            this.instanceId = request.instanceId;
            this.endpointName = request.endpointName;
            this.securityGroups = request.securityGroups;
            this.vSwitchIdsZone = request.vSwitchIdsZone;
            this.vpcId = request.vpcId;
        } 

        /**
         * InstanceId.
         */
        public Builder instanceId(String instanceId) {
            this.putPathParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * endpointName.
         */
        public Builder endpointName(String endpointName) {
            this.putBodyParameter("endpointName", endpointName);
            this.endpointName = endpointName;
            return this;
        }

        /**
         * securityGroups.
         */
        public Builder securityGroups(java.util.List < String > securityGroups) {
            this.putBodyParameter("securityGroups", securityGroups);
            this.securityGroups = securityGroups;
            return this;
        }

        /**
         * vSwitchIdsZone.
         */
        public Builder vSwitchIdsZone(java.util.List < VSwitchIdsZone> vSwitchIdsZone) {
            this.putBodyParameter("vSwitchIdsZone", vSwitchIdsZone);
            this.vSwitchIdsZone = vSwitchIdsZone;
            return this;
        }

        /**
         * vpcId.
         */
        public Builder vpcId(String vpcId) {
            this.putBodyParameter("vpcId", vpcId);
            this.vpcId = vpcId;
            return this;
        }

        @Override
        public EnableKibanaPvlNetworkRequest build() {
            return new EnableKibanaPvlNetworkRequest(this);
        } 

    } 

    public static class VSwitchIdsZone extends TeaModel {
        @NameInMap("vswitchId")
        @Validation(required = true)
        private String vswitchId;

        @NameInMap("zoneId")
        @Validation(required = true)
        private String zoneId;

        private VSwitchIdsZone(Builder builder) {
            this.vswitchId = builder.vswitchId;
            this.zoneId = builder.zoneId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static VSwitchIdsZone create() {
            return builder().build();
        }

        /**
         * @return vswitchId
         */
        public String getVswitchId() {
            return this.vswitchId;
        }

        /**
         * @return zoneId
         */
        public String getZoneId() {
            return this.zoneId;
        }

        public static final class Builder {
            private String vswitchId; 
            private String zoneId; 

            /**
             * vswitchId.
             */
            public Builder vswitchId(String vswitchId) {
                this.vswitchId = vswitchId;
                return this;
            }

            /**
             * zoneId.
             */
            public Builder zoneId(String zoneId) {
                this.zoneId = zoneId;
                return this;
            }

            public VSwitchIdsZone build() {
                return new VSwitchIdsZone(this);
            } 

        } 

    }
}
