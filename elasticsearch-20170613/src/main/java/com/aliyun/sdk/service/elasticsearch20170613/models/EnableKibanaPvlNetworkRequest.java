// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.elasticsearch20170613.models;

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
 * {@link EnableKibanaPvlNetworkRequest} extends {@link RequestModel}
 *
 * <p>EnableKibanaPvlNetworkRequest</p>
 */
public class EnableKibanaPvlNetworkRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("endpointName")
    private String endpointName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("securityGroups")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<String> securityGroups;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("vSwitchIdsZone")
    private java.util.List<VSwitchIdsZone> vSwitchIdsZone;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("vpcId")
    private String vpcId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("clientToken")
    private String clientToken;

    private EnableKibanaPvlNetworkRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.endpointName = builder.endpointName;
        this.securityGroups = builder.securityGroups;
        this.vSwitchIdsZone = builder.vSwitchIdsZone;
        this.vpcId = builder.vpcId;
        this.clientToken = builder.clientToken;
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
    public java.util.List<String> getSecurityGroups() {
        return this.securityGroups;
    }

    /**
     * @return vSwitchIdsZone
     */
    public java.util.List<VSwitchIdsZone> getVSwitchIdsZone() {
        return this.vSwitchIdsZone;
    }

    /**
     * @return vpcId
     */
    public String getVpcId() {
        return this.vpcId;
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    public static final class Builder extends Request.Builder<EnableKibanaPvlNetworkRequest, Builder> {
        private String instanceId; 
        private String endpointName; 
        private java.util.List<String> securityGroups; 
        private java.util.List<VSwitchIdsZone> vSwitchIdsZone; 
        private String vpcId; 
        private String clientToken; 

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
            this.clientToken = request.clientToken;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>es-cn-n6w1oxxx****</p>
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
         * <p>This parameter is required.</p>
         */
        public Builder securityGroups(java.util.List<String> securityGroups) {
            this.putBodyParameter("securityGroups", securityGroups);
            this.securityGroups = securityGroups;
            return this;
        }

        /**
         * vSwitchIdsZone.
         */
        public Builder vSwitchIdsZone(java.util.List<VSwitchIdsZone> vSwitchIdsZone) {
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

        /**
         * clientToken.
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("clientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        @Override
        public EnableKibanaPvlNetworkRequest build() {
            return new EnableKibanaPvlNetworkRequest(this);
        } 

    } 

    /**
     * 
     * {@link EnableKibanaPvlNetworkRequest} extends {@link TeaModel}
     *
     * <p>EnableKibanaPvlNetworkRequest</p>
     */
    public static class VSwitchIdsZone extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("vswitchId")
        private String vswitchId;

        @com.aliyun.core.annotation.NameInMap("zoneId")
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

            private Builder() {
            } 

            private Builder(VSwitchIdsZone model) {
                this.vswitchId = model.vswitchId;
                this.zoneId = model.zoneId;
            } 

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
