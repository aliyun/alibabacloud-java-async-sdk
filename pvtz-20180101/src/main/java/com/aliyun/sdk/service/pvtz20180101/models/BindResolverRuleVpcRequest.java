// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pvtz20180101.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link BindResolverRuleVpcRequest} extends {@link RequestModel}
 *
 * <p>BindResolverRuleVpcRequest</p>
 */
public class BindResolverRuleVpcRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RuleId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String ruleId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Vpc")
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
         * <p>The language of the response. Valid values:</p>
         * <ul>
         * <li>zh: Chinese</li>
         * <li>en: English</li>
         * </ul>
         * <p>Default value: en.</p>
         * 
         * <strong>example:</strong>
         * <p>en</p>
         */
        public Builder lang(String lang) {
            this.putQueryParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        /**
         * <p>The ID of the forwarding rule.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>hr****</p>
         */
        public Builder ruleId(String ruleId) {
            this.putQueryParameter("RuleId", ruleId);
            this.ruleId = ruleId;
            return this;
        }

        /**
         * <p>The VPCs that you want to associate with the forwarding rule.</p>
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

    /**
     * 
     * {@link BindResolverRuleVpcRequest} extends {@link TeaModel}
     *
     * <p>BindResolverRuleVpcRequest</p>
     */
    public static class Vpc extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("RegionId")
        private String regionId;

        @com.aliyun.core.annotation.NameInMap("VpcId")
        private String vpcId;

        @com.aliyun.core.annotation.NameInMap("VpcType")
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
             * <p>The region ID of the outbound VPC.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou</p>
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * <p>The VPC ID.</p>
             * 
             * <strong>example:</strong>
             * <p>vpc-f8zvrvr1payllgz38****</p>
             */
            public Builder vpcId(String vpcId) {
                this.vpcId = vpcId;
                return this;
            }

            /**
             * <p>The VPC type. Valid values:</p>
             * <ul>
             * <li>STANDARD: standard VPC</li>
             * <li>EDS: Elastic Desktop Service (EDS) workspace VPC</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>STANDARD</p>
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
