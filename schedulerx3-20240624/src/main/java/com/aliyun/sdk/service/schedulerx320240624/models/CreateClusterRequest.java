// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.schedulerx320240624.models;

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
 * {@link CreateClusterRequest} extends {@link RequestModel}
 *
 * <p>CreateClusterRequest</p>
 */
public class CreateClusterRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ChargeType")
    private String chargeType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ClusterName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String clusterName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ClusterSpec")
    @com.aliyun.core.annotation.Validation(required = true)
    private String clusterSpec;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Duration")
    @com.aliyun.core.annotation.Validation(maximum = 9, minimum = 1)
    private Integer duration;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("EngineType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String engineType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("PricingCycle")
    private String pricingCycle;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Tag")
    private java.util.List<Tag> tag;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("VSwitches")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<VSwitches> vSwitches;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("VpcId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String vpcId;

    private CreateClusterRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.chargeType = builder.chargeType;
        this.clusterName = builder.clusterName;
        this.clusterSpec = builder.clusterSpec;
        this.duration = builder.duration;
        this.engineType = builder.engineType;
        this.pricingCycle = builder.pricingCycle;
        this.tag = builder.tag;
        this.vSwitches = builder.vSwitches;
        this.vpcId = builder.vpcId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateClusterRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return chargeType
     */
    public String getChargeType() {
        return this.chargeType;
    }

    /**
     * @return clusterName
     */
    public String getClusterName() {
        return this.clusterName;
    }

    /**
     * @return clusterSpec
     */
    public String getClusterSpec() {
        return this.clusterSpec;
    }

    /**
     * @return duration
     */
    public Integer getDuration() {
        return this.duration;
    }

    /**
     * @return engineType
     */
    public String getEngineType() {
        return this.engineType;
    }

    /**
     * @return pricingCycle
     */
    public String getPricingCycle() {
        return this.pricingCycle;
    }

    /**
     * @return tag
     */
    public java.util.List<Tag> getTag() {
        return this.tag;
    }

    /**
     * @return vSwitches
     */
    public java.util.List<VSwitches> getVSwitches() {
        return this.vSwitches;
    }

    /**
     * @return vpcId
     */
    public String getVpcId() {
        return this.vpcId;
    }

    public static final class Builder extends Request.Builder<CreateClusterRequest, Builder> {
        private String regionId; 
        private String chargeType; 
        private String clusterName; 
        private String clusterSpec; 
        private Integer duration; 
        private String engineType; 
        private String pricingCycle; 
        private java.util.List<Tag> tag; 
        private java.util.List<VSwitches> vSwitches; 
        private String vpcId; 

        private Builder() {
            super();
        } 

        private Builder(CreateClusterRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.chargeType = request.chargeType;
            this.clusterName = request.clusterName;
            this.clusterSpec = request.clusterSpec;
            this.duration = request.duration;
            this.engineType = request.engineType;
            this.pricingCycle = request.pricingCycle;
            this.tag = request.tag;
            this.vSwitches = request.vSwitches;
            this.vpcId = request.vpcId;
        } 

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * ChargeType.
         */
        public Builder chargeType(String chargeType) {
            this.putBodyParameter("ChargeType", chargeType);
            this.chargeType = chargeType;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>qianxi-test-0812</p>
         */
        public Builder clusterName(String clusterName) {
            this.putBodyParameter("ClusterName", clusterName);
            this.clusterName = clusterName;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>scx.dev.x1</p>
         */
        public Builder clusterSpec(String clusterSpec) {
            this.putBodyParameter("ClusterSpec", clusterSpec);
            this.clusterSpec = clusterSpec;
            return this;
        }

        /**
         * Duration.
         */
        public Builder duration(Integer duration) {
            this.putBodyParameter("Duration", duration);
            this.duration = duration;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>xxljob</p>
         */
        public Builder engineType(String engineType) {
            this.putBodyParameter("EngineType", engineType);
            this.engineType = engineType;
            return this;
        }

        /**
         * PricingCycle.
         */
        public Builder pricingCycle(String pricingCycle) {
            this.putBodyParameter("PricingCycle", pricingCycle);
            this.pricingCycle = pricingCycle;
            return this;
        }

        /**
         * Tag.
         */
        public Builder tag(java.util.List<Tag> tag) {
            this.putQueryParameter("Tag", tag);
            this.tag = tag;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder vSwitches(java.util.List<VSwitches> vSwitches) {
            String vSwitchesShrink = shrink(vSwitches, "VSwitches", "json");
            this.putBodyParameter("VSwitches", vSwitchesShrink);
            this.vSwitches = vSwitches;
            return this;
        }

        /**
         * <p>VPC id</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>vpc-aa1a18236n90rqhuhhnhh</p>
         */
        public Builder vpcId(String vpcId) {
            this.putBodyParameter("VpcId", vpcId);
            this.vpcId = vpcId;
            return this;
        }

        @Override
        public CreateClusterRequest build() {
            return new CreateClusterRequest(this);
        } 

    } 

    /**
     * 
     * {@link CreateClusterRequest} extends {@link TeaModel}
     *
     * <p>CreateClusterRequest</p>
     */
    public static class Tag extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Key")
        private String key;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private Tag(Builder builder) {
            this.key = builder.key;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Tag create() {
            return builder().build();
        }

        /**
         * @return key
         */
        public String getKey() {
            return this.key;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String key; 
            private String value; 

            private Builder() {
            } 

            private Builder(Tag model) {
                this.key = model.key;
                this.value = model.value;
            } 

            /**
             * Key.
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * Value.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public Tag build() {
                return new Tag(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateClusterRequest} extends {@link TeaModel}
     *
     * <p>CreateClusterRequest</p>
     */
    public static class VSwitches extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("VSwitchId")
        @com.aliyun.core.annotation.Validation(required = true)
        private String vSwitchId;

        @com.aliyun.core.annotation.NameInMap("ZoneId")
        @com.aliyun.core.annotation.Validation(required = true)
        private String zoneId;

        private VSwitches(Builder builder) {
            this.vSwitchId = builder.vSwitchId;
            this.zoneId = builder.zoneId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static VSwitches create() {
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

            private Builder() {
            } 

            private Builder(VSwitches model) {
                this.vSwitchId = model.vSwitchId;
                this.zoneId = model.zoneId;
            } 

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>vsw-2ze745n3r2sfqtahhubpl</p>
             */
            public Builder vSwitchId(String vSwitchId) {
                this.vSwitchId = vSwitchId;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou-j</p>
             */
            public Builder zoneId(String zoneId) {
                this.zoneId = zoneId;
                return this;
            }

            public VSwitches build() {
                return new VSwitches(this);
            } 

        } 

    }
}
