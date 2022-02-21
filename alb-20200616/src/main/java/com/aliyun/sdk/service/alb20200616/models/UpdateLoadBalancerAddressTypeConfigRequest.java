// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alb20200616.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateLoadBalancerAddressTypeConfigRequest} extends {@link RequestModel}
 *
 * <p>UpdateLoadBalancerAddressTypeConfigRequest</p>
 */
public class UpdateLoadBalancerAddressTypeConfigRequest extends Request {
    @Query
    @NameInMap("AddressType")
    @Validation(required = true)
    private String addressType;

    @Query
    @NameInMap("ClientToken")
    private String clientToken;

    @Query
    @NameInMap("DryRun")
    private String dryRun;

    @Query
    @NameInMap("LoadBalancerId")
    @Validation(required = true)
    private String loadBalancerId;

    @Query
    @NameInMap("ZoneMappings")
    private java.util.List < ZoneMappings> zoneMappings;

    private UpdateLoadBalancerAddressTypeConfigRequest(Builder builder) {
        super(builder);
        this.addressType = builder.addressType;
        this.clientToken = builder.clientToken;
        this.dryRun = builder.dryRun;
        this.loadBalancerId = builder.loadBalancerId;
        this.zoneMappings = builder.zoneMappings;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateLoadBalancerAddressTypeConfigRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return addressType
     */
    public String getAddressType() {
        return this.addressType;
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return dryRun
     */
    public String getDryRun() {
        return this.dryRun;
    }

    /**
     * @return loadBalancerId
     */
    public String getLoadBalancerId() {
        return this.loadBalancerId;
    }

    /**
     * @return zoneMappings
     */
    public java.util.List < ZoneMappings> getZoneMappings() {
        return this.zoneMappings;
    }

    public static final class Builder extends Request.Builder<UpdateLoadBalancerAddressTypeConfigRequest, Builder> {
        private String addressType; 
        private String clientToken; 
        private String dryRun; 
        private String loadBalancerId; 
        private java.util.List < ZoneMappings> zoneMappings; 

        private Builder() {
            super();
        } 

        private Builder(UpdateLoadBalancerAddressTypeConfigRequest response) {
            super(response);
            this.addressType = response.addressType;
            this.clientToken = response.clientToken;
            this.dryRun = response.dryRun;
            this.loadBalancerId = response.loadBalancerId;
            this.zoneMappings = response.zoneMappings;
        } 

        /**
         * 目标网络类型
         */
        public Builder addressType(String addressType) {
            this.putQueryParameter("AddressType", addressType);
            this.addressType = addressType;
            return this;
        }

        /**
         * 幂等标识
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * 是否只预检此次请求
         */
        public Builder dryRun(String dryRun) {
            this.putQueryParameter("DryRun", dryRun);
            this.dryRun = dryRun;
            return this;
        }

        /**
         * 实例id
         */
        public Builder loadBalancerId(String loadBalancerId) {
            this.putQueryParameter("LoadBalancerId", loadBalancerId);
            this.loadBalancerId = loadBalancerId;
            return this;
        }

        /**
         * 可用区及交换机映射列表
         */
        public Builder zoneMappings(java.util.List < ZoneMappings> zoneMappings) {
            this.putQueryParameter("ZoneMappings", zoneMappings);
            this.zoneMappings = zoneMappings;
            return this;
        }

        @Override
        public UpdateLoadBalancerAddressTypeConfigRequest build() {
            return new UpdateLoadBalancerAddressTypeConfigRequest(this);
        } 

    } 

    public static class ZoneMappings extends TeaModel {
        @NameInMap("AllocationId")
        private String allocationId;

        @NameInMap("VSwitchId")
        private String vSwitchId;

        @NameInMap("ZoneId")
        private String zoneId;

        private ZoneMappings(Builder builder) {
            this.allocationId = builder.allocationId;
            this.vSwitchId = builder.vSwitchId;
            this.zoneId = builder.zoneId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ZoneMappings create() {
            return builder().build();
        }

        /**
         * @return allocationId
         */
        public String getAllocationId() {
            return this.allocationId;
        }

        /**
         * @return vSwitchId
         */
        public String getVSwitchId() {
            return this.vSwitchId;
        }

        /**
         * @return zoneId
         */
        public String getZoneId() {
            return this.zoneId;
        }

        public static final class Builder {
            private String allocationId; 
            private String vSwitchId; 
            private String zoneId; 

            /**
             * 弹性公网IP
             */
            public Builder allocationId(String allocationId) {
                this.allocationId = allocationId;
                return this;
            }

            /**
             * 交换机标识
             */
            public Builder vSwitchId(String vSwitchId) {
                this.vSwitchId = vSwitchId;
                return this;
            }

            /**
             * 可用区
             */
            public Builder zoneId(String zoneId) {
                this.zoneId = zoneId;
                return this;
            }

            public ZoneMappings build() {
                return new ZoneMappings(this);
            } 

        } 

    }
}
