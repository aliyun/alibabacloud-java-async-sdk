// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.yundun_bastionhost20191209.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SetPolicyAccessTimeRangeConfigRequest} extends {@link RequestModel}
 *
 * <p>SetPolicyAccessTimeRangeConfigRequest</p>
 */
public class SetPolicyAccessTimeRangeConfigRequest extends Request {
    @Query
    @NameInMap("AccessTimeRangeConfig")
    @Validation(required = true)
    private AccessTimeRangeConfig accessTimeRangeConfig;

    @Query
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    @Query
    @NameInMap("PolicyId")
    @Validation(required = true)
    private String policyId;

    @Query
    @NameInMap("RegionId")
    private String regionId;

    private SetPolicyAccessTimeRangeConfigRequest(Builder builder) {
        super(builder);
        this.accessTimeRangeConfig = builder.accessTimeRangeConfig;
        this.instanceId = builder.instanceId;
        this.policyId = builder.policyId;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SetPolicyAccessTimeRangeConfigRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return accessTimeRangeConfig
     */
    public AccessTimeRangeConfig getAccessTimeRangeConfig() {
        return this.accessTimeRangeConfig;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return policyId
     */
    public String getPolicyId() {
        return this.policyId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<SetPolicyAccessTimeRangeConfigRequest, Builder> {
        private AccessTimeRangeConfig accessTimeRangeConfig; 
        private String instanceId; 
        private String policyId; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(SetPolicyAccessTimeRangeConfigRequest request) {
            super(request);
            this.accessTimeRangeConfig = request.accessTimeRangeConfig;
            this.instanceId = request.instanceId;
            this.policyId = request.policyId;
            this.regionId = request.regionId;
        } 

        /**
         * AccessTimeRangeConfig.
         */
        public Builder accessTimeRangeConfig(AccessTimeRangeConfig accessTimeRangeConfig) {
            String accessTimeRangeConfigShrink = shrink(accessTimeRangeConfig, "AccessTimeRangeConfig", "json");
            this.putQueryParameter("AccessTimeRangeConfig", accessTimeRangeConfigShrink);
            this.accessTimeRangeConfig = accessTimeRangeConfig;
            return this;
        }

        /**
         * InstanceId.
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * PolicyId.
         */
        public Builder policyId(String policyId) {
            this.putQueryParameter("PolicyId", policyId);
            this.policyId = policyId;
            return this;
        }

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public SetPolicyAccessTimeRangeConfigRequest build() {
            return new SetPolicyAccessTimeRangeConfigRequest(this);
        } 

    } 

    public static class EffectiveTime extends TeaModel {
        @NameInMap("Days")
        private java.util.List < Integer > days;

        @NameInMap("Hours")
        private java.util.List < Integer > hours;

        private EffectiveTime(Builder builder) {
            this.days = builder.days;
            this.hours = builder.hours;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static EffectiveTime create() {
            return builder().build();
        }

        /**
         * @return days
         */
        public java.util.List < Integer > getDays() {
            return this.days;
        }

        /**
         * @return hours
         */
        public java.util.List < Integer > getHours() {
            return this.hours;
        }

        public static final class Builder {
            private java.util.List < Integer > days; 
            private java.util.List < Integer > hours; 

            /**
             * Days.
             */
            public Builder days(java.util.List < Integer > days) {
                this.days = days;
                return this;
            }

            /**
             * Hours.
             */
            public Builder hours(java.util.List < Integer > hours) {
                this.hours = hours;
                return this;
            }

            public EffectiveTime build() {
                return new EffectiveTime(this);
            } 

        } 

    }
    public static class AccessTimeRangeConfig extends TeaModel {
        @NameInMap("EffectiveTime")
        private java.util.List < EffectiveTime> effectiveTime;

        private AccessTimeRangeConfig(Builder builder) {
            this.effectiveTime = builder.effectiveTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AccessTimeRangeConfig create() {
            return builder().build();
        }

        /**
         * @return effectiveTime
         */
        public java.util.List < EffectiveTime> getEffectiveTime() {
            return this.effectiveTime;
        }

        public static final class Builder {
            private java.util.List < EffectiveTime> effectiveTime; 

            /**
             * EffectiveTime.
             */
            public Builder effectiveTime(java.util.List < EffectiveTime> effectiveTime) {
                this.effectiveTime = effectiveTime;
                return this;
            }

            public AccessTimeRangeConfig build() {
                return new AccessTimeRangeConfig(this);
            } 

        } 

    }
}
