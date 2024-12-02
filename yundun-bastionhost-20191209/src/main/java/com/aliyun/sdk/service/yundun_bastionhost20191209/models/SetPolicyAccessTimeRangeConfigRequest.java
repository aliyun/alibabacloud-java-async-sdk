// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.yundun_bastionhost20191209.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link SetPolicyAccessTimeRangeConfigRequest} extends {@link RequestModel}
 *
 * <p>SetPolicyAccessTimeRangeConfigRequest</p>
 */
public class SetPolicyAccessTimeRangeConfigRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AccessTimeRangeConfig")
    @com.aliyun.core.annotation.Validation(required = true)
    private AccessTimeRangeConfig accessTimeRangeConfig;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PolicyId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String policyId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
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
         * <p>The logon period limits.</p>
         * <p>This parameter is required.</p>
         */
        public Builder accessTimeRangeConfig(AccessTimeRangeConfig accessTimeRangeConfig) {
            String accessTimeRangeConfigShrink = shrink(accessTimeRangeConfig, "AccessTimeRangeConfig", "json");
            this.putQueryParameter("AccessTimeRangeConfig", accessTimeRangeConfigShrink);
            this.accessTimeRangeConfig = accessTimeRangeConfig;
            return this;
        }

        /**
         * <p>The bastion host ID.</p>
         * <blockquote>
         * <p>You can call the <a href="https://help.aliyun.com/document_detail/153281.html">DescribeInstances</a> operation to query the bastion host ID.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>bastionhost-cn-st220aw****</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>The control policy ID.</p>
         * <blockquote>
         * <p> You can call the <a href="https://help.aliyun.com/document_detail/2758876.html">ListPolicies</a> operation to query the control policy ID.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>13</p>
         */
        public Builder policyId(String policyId) {
            this.putQueryParameter("PolicyId", policyId);
            this.policyId = policyId;
            return this;
        }

        /**
         * <p>The region ID of the bastion host.</p>
         * <blockquote>
         * <p>For more information about the mapping between region IDs and region names, see <a href="https://help.aliyun.com/document_detail/40654.html">Regions and zones</a>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
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

    /**
     * 
     * {@link SetPolicyAccessTimeRangeConfigRequest} extends {@link TeaModel}
     *
     * <p>SetPolicyAccessTimeRangeConfigRequest</p>
     */
    public static class EffectiveTime extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Days")
        private java.util.List < Integer > days;

        @com.aliyun.core.annotation.NameInMap("Hours")
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
             * <p>The days of the week during which users can log on to the assets.</p>
             */
            public Builder days(java.util.List < Integer > days) {
                this.days = days;
                return this;
            }

            /**
             * <p>The time periods of the day during which users can log on to the assets.</p>
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
    /**
     * 
     * {@link SetPolicyAccessTimeRangeConfigRequest} extends {@link TeaModel}
     *
     * <p>SetPolicyAccessTimeRangeConfigRequest</p>
     */
    public static class AccessTimeRangeConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("EffectiveTime")
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
             * <p>The details about the periods during which users can log on to the assets.</p>
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
