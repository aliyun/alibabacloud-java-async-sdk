// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alb20200616.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateLoadBalancerZonesRequest} extends {@link RequestModel}
 *
 * <p>UpdateLoadBalancerZonesRequest</p>
 */
public class UpdateLoadBalancerZonesRequest extends Request {
    @Query
    @NameInMap("ClientToken")
    private String clientToken;

    @Query
    @NameInMap("DryRun")
    private Boolean dryRun;

    @Query
    @NameInMap("LoadBalancerId")
    @Validation(required = true)
    private String loadBalancerId;

    @Query
    @NameInMap("ZoneMappings")
    @Validation(required = true)
    private java.util.List < ZoneMappings> zoneMappings;

    private UpdateLoadBalancerZonesRequest(Builder builder) {
        super(builder);
        this.clientToken = builder.clientToken;
        this.dryRun = builder.dryRun;
        this.loadBalancerId = builder.loadBalancerId;
        this.zoneMappings = builder.zoneMappings;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateLoadBalancerZonesRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
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
    public Boolean getDryRun() {
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

    public static final class Builder extends Request.Builder<UpdateLoadBalancerZonesRequest, Builder> {
        private String clientToken; 
        private Boolean dryRun; 
        private String loadBalancerId; 
        private java.util.List < ZoneMappings> zoneMappings; 

        private Builder() {
            super();
        } 

        private Builder(UpdateLoadBalancerZonesRequest response) {
            super(response);
            this.clientToken = response.clientToken;
            this.dryRun = response.dryRun;
            this.loadBalancerId = response.loadBalancerId;
            this.zoneMappings = response.zoneMappings;
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
         *  是否只预检此次请求
         */
        public Builder dryRun(Boolean dryRun) {
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
        public UpdateLoadBalancerZonesRequest build() {
            return new UpdateLoadBalancerZonesRequest(this);
        } 

    } 

    public static class ZoneMappings extends TeaModel {
        @NameInMap("VSwitchId")
        @Validation(required = true)
        private String vSwitchId;

        @NameInMap("ZoneId")
        @Validation(required = true)
        private String zoneId;

        private ZoneMappings(Builder builder) {
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
            private String vSwitchId; 
            private String zoneId; 

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
