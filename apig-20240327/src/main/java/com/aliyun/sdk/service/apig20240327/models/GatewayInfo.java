// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.apig20240327.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link GatewayInfo} extends {@link TeaModel}
 *
 * <p>GatewayInfo</p>
 */
public class GatewayInfo extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("engineVersion")
    private String engineVersion;

    @com.aliyun.core.annotation.NameInMap("gatewayId")
    private String gatewayId;

    @com.aliyun.core.annotation.NameInMap("name")
    private String name;

    @com.aliyun.core.annotation.NameInMap("vpcInfo")
    private VpcInfo vpcInfo;

    private GatewayInfo(Builder builder) {
        this.engineVersion = builder.engineVersion;
        this.gatewayId = builder.gatewayId;
        this.name = builder.name;
        this.vpcInfo = builder.vpcInfo;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GatewayInfo create() {
        return builder().build();
    }

    /**
     * @return engineVersion
     */
    public String getEngineVersion() {
        return this.engineVersion;
    }

    /**
     * @return gatewayId
     */
    public String getGatewayId() {
        return this.gatewayId;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return vpcInfo
     */
    public VpcInfo getVpcInfo() {
        return this.vpcInfo;
    }

    public static final class Builder {
        private String engineVersion; 
        private String gatewayId; 
        private String name; 
        private VpcInfo vpcInfo; 

        /**
         * engineVersion.
         */
        public Builder engineVersion(String engineVersion) {
            this.engineVersion = engineVersion;
            return this;
        }

        /**
         * gatewayId.
         */
        public Builder gatewayId(String gatewayId) {
            this.gatewayId = gatewayId;
            return this;
        }

        /**
         * name.
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * vpcInfo.
         */
        public Builder vpcInfo(VpcInfo vpcInfo) {
            this.vpcInfo = vpcInfo;
            return this;
        }

        public GatewayInfo build() {
            return new GatewayInfo(this);
        } 

    } 

    /**
     * 
     * {@link GatewayInfo} extends {@link TeaModel}
     *
     * <p>GatewayInfo</p>
     */
    public static class VpcInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("vpcId")
        private String vpcId;

        private VpcInfo(Builder builder) {
            this.name = builder.name;
            this.vpcId = builder.vpcId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static VpcInfo create() {
            return builder().build();
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return vpcId
         */
        public String getVpcId() {
            return this.vpcId;
        }

        public static final class Builder {
            private String name; 
            private String vpcId; 

            /**
             * name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * vpcId.
             */
            public Builder vpcId(String vpcId) {
                this.vpcId = vpcId;
                return this;
            }

            public VpcInfo build() {
                return new VpcInfo(this);
            } 

        } 

    }
}
