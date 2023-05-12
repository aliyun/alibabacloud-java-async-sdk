// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pvtz20180101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link BindResolverRuleVpcRequest} extends {@link RequestModel}
 *
 * <p>BindResolverRuleVpcRequest</p>
 */
public class BindResolverRuleVpcRequest extends Request {
    @Query
    @NameInMap("Lang")
    private String lang;

    @Query
    @NameInMap("RuleId")
    @Validation(required = true)
    private String ruleId;

    @Query
    @NameInMap("Vpc")
    private java.util.List < Vpc> vpc;

    private BindResolverRuleVpcRequest(Builder builder) {
        super(builder);
        this.lang = builder.lang;
        this.ruleId = builder.ruleId;
        this.vpc = builder.vpc;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static BindResolverRuleVpcRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return lang
     */
    public String getLang() {
        return this.lang;
    }

    /**
     * @return ruleId
     */
    public String getRuleId() {
        return this.ruleId;
    }

    /**
     * @return vpc
     */
    public java.util.List < Vpc> getVpc() {
        return this.vpc;
    }

    public static final class Builder extends Request.Builder<BindResolverRuleVpcRequest, Builder> {
        private String lang; 
        private String ruleId; 
        private java.util.List < Vpc> vpc; 

        private Builder() {
            super();
        } 

        private Builder(BindResolverRuleVpcRequest request) {
            super(request);
            this.lang = request.lang;
            this.ruleId = request.ruleId;
            this.vpc = request.vpc;
        } 

        /**
         * Lang.
         */
        public Builder lang(String lang) {
            this.putQueryParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        /**
         * RuleId.
         */
        public Builder ruleId(String ruleId) {
            this.putQueryParameter("RuleId", ruleId);
            this.ruleId = ruleId;
            return this;
        }

        /**
         * Vpc.
         */
        public Builder vpc(java.util.List < Vpc> vpc) {
            this.putQueryParameter("Vpc", vpc);
            this.vpc = vpc;
            return this;
        }

        @Override
        public BindResolverRuleVpcRequest build() {
            return new BindResolverRuleVpcRequest(this);
        } 

    } 

    public static class Vpc extends TeaModel {
        @NameInMap("RegionId")
        private String regionId;

        @NameInMap("VpcId")
        private String vpcId;

        @NameInMap("VpcType")
        private String vpcType;

        private Vpc(Builder builder) {
            this.regionId = builder.regionId;
            this.vpcId = builder.vpcId;
            this.vpcType = builder.vpcType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Vpc create() {
            return builder().build();
        }

        /**
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
        }

        /**
         * @return vpcId
         */
        public String getVpcId() {
            return this.vpcId;
        }

        /**
         * @return vpcType
         */
        public String getVpcType() {
            return this.vpcType;
        }

        public static final class Builder {
            private String regionId; 
            private String vpcId; 
            private String vpcType; 

            /**
             * RegionId.
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * vpcID
             */
            public Builder vpcId(String vpcId) {
                this.vpcId = vpcId;
                return this;
            }

            /**
             * VpcType.
             */
            public Builder vpcType(String vpcType) {
                this.vpcType = vpcType;
                return this;
            }

            public Vpc build() {
                return new Vpc(this);
            } 

        } 

    }
}
