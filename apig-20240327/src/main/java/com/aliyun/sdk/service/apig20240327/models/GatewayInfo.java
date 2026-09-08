// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.apig20240327.models;

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
 * {@link GatewayInfo} extends {@link TeaModel}
 *
 * <p>GatewayInfo</p>
 */
public class GatewayInfo extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("engineVersion")
    private String engineVersion;

    @com.aliyun.core.annotation.NameInMap("gatewayEdition")
    private String gatewayEdition;

    @com.aliyun.core.annotation.NameInMap("gatewayId")
    private String gatewayId;

    @com.aliyun.core.annotation.NameInMap("name")
    private String name;

    @com.aliyun.core.annotation.NameInMap("vpcInfo")
    private VpcInfo vpcInfo;

    private GatewayInfo(Builder builder) {
        this.engineVersion = builder.engineVersion;
        this.gatewayEdition = builder.gatewayEdition;
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

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return engineVersion
     */
    public String getEngineVersion() {
        return this.engineVersion;
    }

    /**
     * @return gatewayEdition
     */
    public String getGatewayEdition() {
        return this.gatewayEdition;
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
        private String gatewayEdition; 
        private String gatewayId; 
        private String name; 
        private VpcInfo vpcInfo; 

        private Builder() {
        } 

        private Builder(GatewayInfo model) {
            this.engineVersion = model.engineVersion;
            this.gatewayEdition = model.gatewayEdition;
            this.gatewayId = model.gatewayId;
            this.name = model.name;
            this.vpcInfo = model.vpcInfo;
        } 

        /**
         * <p>The gateway DPI engine version.</p>
         * 
         * <strong>example:</strong>
         * <p>2.0.7</p>
         */
        public Builder engineVersion(String engineVersion) {
            this.engineVersion = engineVersion;
            return this;
        }

        /**
         * <p>The gateway instance edition. Valid values:</p>
         * <ul>
         * <li>Professional: standard instance.</li>
         * <li>Serverless: Serverless.</li>
         * <li>MultiTenantServerless: multi-tenant Serverless.</li>
         * <li>Unknown: unknown.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>MultiTenantServerless</p>
         */
        public Builder gatewayEdition(String gatewayEdition) {
            this.gatewayEdition = gatewayEdition;
            return this;
        }

        /**
         * <p>The gateway ID.</p>
         * 
         * <strong>example:</strong>
         * <p>gw-cq7og15lhtgi6qasrj60</p>
         */
        public Builder gatewayId(String gatewayId) {
            this.gatewayId = gatewayId;
            return this;
        }

        /**
         * <p>The gateway name.</p>
         * 
         * <strong>example:</strong>
         * <p>apitest-gw</p>
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * <p>The VPC information.</p>
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

            private Builder() {
            } 

            private Builder(VpcInfo model) {
                this.name = model.name;
                this.vpcId = model.vpcId;
            } 

            /**
             * <p>The VPC name.</p>
             * 
             * <strong>example:</strong>
             * <p>test-vpc</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The VPC ID.</p>
             * 
             * <strong>example:</strong>
             * <p>vpc-uf664nyle5kh***</p>
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
