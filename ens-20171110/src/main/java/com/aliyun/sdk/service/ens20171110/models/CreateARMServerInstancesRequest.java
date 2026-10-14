// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ens20171110.models;

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
 * {@link CreateARMServerInstancesRequest} extends {@link RequestModel}
 *
 * <p>CreateARMServerInstancesRequest</p>
 */
public class CreateARMServerInstancesRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Amount")
    @com.aliyun.core.annotation.Validation(required = true, maximum = 10, minimum = 1)
    private Integer amount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AutoRenew")
    private Boolean autoRenew;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AutoUseCoupon")
    private Boolean autoUseCoupon;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Cidr")
    private String cidr;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EnsRegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String ensRegionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EnvironmentVar")
    private String environmentVar;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Frequency")
    private Integer frequency;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ImageId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String imageId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceBillingCycle")
    private String instanceBillingCycle;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("KeyPairName")
    private String keyPairName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NameSpace")
    private String nameSpace;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PayType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String payType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Period")
    private Integer period;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PeriodUnit")
    private String periodUnit;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Resolution")
    @com.aliyun.core.annotation.Validation(required = true)
    private String resolution;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ServerName")
    @com.aliyun.core.annotation.Validation(maxLength = 255)
    private String serverName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ServerType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String serverType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Tag")
    private java.util.List<Tag> tag;

    private CreateARMServerInstancesRequest(Builder builder) {
        super(builder);
        this.amount = builder.amount;
        this.autoRenew = builder.autoRenew;
        this.autoUseCoupon = builder.autoUseCoupon;
        this.cidr = builder.cidr;
        this.ensRegionId = builder.ensRegionId;
        this.environmentVar = builder.environmentVar;
        this.frequency = builder.frequency;
        this.imageId = builder.imageId;
        this.instanceBillingCycle = builder.instanceBillingCycle;
        this.instanceType = builder.instanceType;
        this.keyPairName = builder.keyPairName;
        this.nameSpace = builder.nameSpace;
        this.payType = builder.payType;
        this.period = builder.period;
        this.periodUnit = builder.periodUnit;
        this.resolution = builder.resolution;
        this.serverName = builder.serverName;
        this.serverType = builder.serverType;
        this.tag = builder.tag;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateARMServerInstancesRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return amount
     */
    public Integer getAmount() {
        return this.amount;
    }

    /**
     * @return autoRenew
     */
    public Boolean getAutoRenew() {
        return this.autoRenew;
    }

    /**
     * @return autoUseCoupon
     */
    public Boolean getAutoUseCoupon() {
        return this.autoUseCoupon;
    }

    /**
     * @return cidr
     */
    public String getCidr() {
        return this.cidr;
    }

    /**
     * @return ensRegionId
     */
    public String getEnsRegionId() {
        return this.ensRegionId;
    }

    /**
     * @return environmentVar
     */
    public String getEnvironmentVar() {
        return this.environmentVar;
    }

    /**
     * @return frequency
     */
    public Integer getFrequency() {
        return this.frequency;
    }

    /**
     * @return imageId
     */
    public String getImageId() {
        return this.imageId;
    }

    /**
     * @return instanceBillingCycle
     */
    public String getInstanceBillingCycle() {
        return this.instanceBillingCycle;
    }

    /**
     * @return instanceType
     */
    public String getInstanceType() {
        return this.instanceType;
    }

    /**
     * @return keyPairName
     */
    public String getKeyPairName() {
        return this.keyPairName;
    }

    /**
     * @return nameSpace
     */
    public String getNameSpace() {
        return this.nameSpace;
    }

    /**
     * @return payType
     */
    public String getPayType() {
        return this.payType;
    }

    /**
     * @return period
     */
    public Integer getPeriod() {
        return this.period;
    }

    /**
     * @return periodUnit
     */
    public String getPeriodUnit() {
        return this.periodUnit;
    }

    /**
     * @return resolution
     */
    public String getResolution() {
        return this.resolution;
    }

    /**
     * @return serverName
     */
    public String getServerName() {
        return this.serverName;
    }

    /**
     * @return serverType
     */
    public String getServerType() {
        return this.serverType;
    }

    /**
     * @return tag
     */
    public java.util.List<Tag> getTag() {
        return this.tag;
    }

    public static final class Builder extends Request.Builder<CreateARMServerInstancesRequest, Builder> {
        private Integer amount; 
        private Boolean autoRenew; 
        private Boolean autoUseCoupon; 
        private String cidr; 
        private String ensRegionId; 
        private String environmentVar; 
        private Integer frequency; 
        private String imageId; 
        private String instanceBillingCycle; 
        private String instanceType; 
        private String keyPairName; 
        private String nameSpace; 
        private String payType; 
        private Integer period; 
        private String periodUnit; 
        private String resolution; 
        private String serverName; 
        private String serverType; 
        private java.util.List<Tag> tag; 

        private Builder() {
            super();
        } 

        private Builder(CreateARMServerInstancesRequest request) {
            super(request);
            this.amount = request.amount;
            this.autoRenew = request.autoRenew;
            this.autoUseCoupon = request.autoUseCoupon;
            this.cidr = request.cidr;
            this.ensRegionId = request.ensRegionId;
            this.environmentVar = request.environmentVar;
            this.frequency = request.frequency;
            this.imageId = request.imageId;
            this.instanceBillingCycle = request.instanceBillingCycle;
            this.instanceType = request.instanceType;
            this.keyPairName = request.keyPairName;
            this.nameSpace = request.nameSpace;
            this.payType = request.payType;
            this.period = request.period;
            this.periodUnit = request.periodUnit;
            this.resolution = request.resolution;
            this.serverName = request.serverName;
            this.serverType = request.serverType;
            this.tag = request.tag;
        } 

        /**
         * <p>The number of instances to create. Minimum value: <strong>1</strong>. Maximum value: <strong>100</strong>.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder amount(Integer amount) {
            this.putQueryParameter("Amount", amount);
            this.amount = amount;
            return this;
        }

        /**
         * <p>Specifies whether to enable auto-renewal.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder autoRenew(Boolean autoRenew) {
            this.putQueryParameter("AutoRenew", autoRenew);
            this.autoRenew = autoRenew;
            return this;
        }

        /**
         * <p>Specifies whether to use coupons. Valid values:</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder autoUseCoupon(Boolean autoUseCoupon) {
            this.putQueryParameter("AutoUseCoupon", autoUseCoupon);
            this.autoUseCoupon = autoUseCoupon;
            return this;
        }

        /**
         * <p>The IPv4 CIDR block used by the instance, in CIDR notation.</p>
         * 
         * <strong>example:</strong>
         * <p>10.0.0.0/24</p>
         */
        public Builder cidr(String cidr) {
            this.putQueryParameter("Cidr", cidr);
            this.cidr = cidr;
            return this;
        }

        /**
         * <p>The ENS edge zone ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-guiyang-12</p>
         */
        public Builder ensRegionId(String ensRegionId) {
            this.putQueryParameter("EnsRegionId", ensRegionId);
            this.ensRegionId = ensRegionId;
            return this;
        }

        /**
         * <p>One or more environment variables to set during EAIS instance initialization.</p>
         * 
         * <strong>example:</strong>
         * <p>[object Object]</p>
         */
        public Builder environmentVar(String environmentVar) {
            this.putQueryParameter("EnvironmentVar", environmentVar);
            this.environmentVar = environmentVar;
            return this;
        }

        /**
         * <p>The refresh rate, in Hz. Valid values: 30 and 60.</p>
         * 
         * <strong>example:</strong>
         * <p>30</p>
         */
        public Builder frequency(Integer frequency) {
            this.putQueryParameter("Frequency", frequency);
            this.frequency = frequency;
            return this;
        }

        /**
         * <p>The image ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>yourImage ID</p>
         */
        public Builder imageId(String imageId) {
            this.putQueryParameter("ImageId", imageId);
            this.imageId = imageId;
            return this;
        }

        /**
         * <p>The instance billing cycle. Valid values:</p>
         * <ul>
         * <li>Hour</li>
         * <li>Day</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Hour</p>
         */
        public Builder instanceBillingCycle(String instanceBillingCycle) {
            this.putQueryParameter("InstanceBillingCycle", instanceBillingCycle);
            this.instanceBillingCycle = instanceBillingCycle;
            return this;
        }

        /**
         * <p>The instance type of the AIC container instance. Valid values:</p>
         * <ul>
         * <li><p>aic.cf52r.c1.np</p>
         * </li>
         * <li><p>aic.cf52r.c2.np</p>
         * </li>
         * <li><p>aic.cf53r.c2.np</p>
         * </li>
         * <li><p>aic.cf52r.c4.np</p>
         * </li>
         * <li><p>aic.cf53r.c3.np</p>
         * </li>
         * <li><p>aic.cf52r.c3.np</p>
         * </li>
         * <li><p>aic.cf53r.c1.np</p>
         * </li>
         * <li><p>aic.cf53r.c5.np</p>
         * </li>
         * <li><p>aic.cf53r.c6</p>
         * </li>
         * <li><p>aic.cf53r.c4.np</p>
         * </li>
         * <li><p>aic.cf53r.c6.np</p>
         * </li>
         * <li><p>aic.cf53r.c7.np</p>
         * </li>
         * <li><p>aic.cf52m1r.c5.np</p>
         * </li>
         * <li><p>aic.cf53r.c8.np</p>
         * </li>
         * <li><p>aic.cf53r.c7</p>
         * </li>
         * <li><p>aic.cf52m1r.c2.np</p>
         * </li>
         * <li><p>aic.cf52m1r.c1.np</p>
         * </li>
         * <li><p>aic.cf52m1r.c3.np</p>
         * </li>
         * <li><p>aic.cf52m1r.c4.np</p>
         * </li>
         * <li><p>aic.cf52m1r.c6</p>
         * </li>
         * <li><p>ens.a6c2</p>
         * </li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>aic.cf53r.c6.np</p>
         */
        public Builder instanceType(String instanceType) {
            this.putQueryParameter("InstanceType", instanceType);
            this.instanceType = instanceType;
            return this;
        }

        /**
         * <p>The key pair name.</p>
         * 
         * <strong>example:</strong>
         * <p>TestKeyPairName</p>
         */
        public Builder keyPairName(String keyPairName) {
            this.putQueryParameter("KeyPairName", keyPairName);
            this.keyPairName = keyPairName;
            return this;
        }

        /**
         * <p>The namespace.</p>
         * 
         * <strong>example:</strong>
         * <p>pre</p>
         */
        public Builder nameSpace(String nameSpace) {
            this.putQueryParameter("NameSpace", nameSpace);
            this.nameSpace = nameSpace;
            return this;
        }

        /**
         * <p>The billing type. Valid values: <strong>PrePaid</strong> (subscription).</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>PrePaid</p>
         */
        public Builder payType(String payType) {
            this.putQueryParameter("PayType", payType);
            this.payType = payType;
            return this;
        }

        /**
         * <p>The duration for which you want to purchase the resource.</p>
         * <ul>
         * <li>If you do not specify PeriodUnit, the resource is purchased on a monthly basis by default. Currently, only Days and Month are supported.</li>
         * <li>If PeriodUnit is set to Day, Period can only be set to 3.</li>
         * <li>If PeriodUnit is set to Month, Period can be set to 1 to 9 or 12.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder period(Integer period) {
            this.putQueryParameter("Period", period);
            this.period = period;
            return this;
        }

        /**
         * <p>The unit of the purchase duration.</p>
         * 
         * <strong>example:</strong>
         * <p>Month</p>
         */
        public Builder periodUnit(String periodUnit) {
            this.putQueryParameter("PeriodUnit", periodUnit);
            this.periodUnit = periodUnit;
            return this;
        }

        /**
         * <p>The resolution. Valid values:</p>
         * <ul>
         * <li><p>1920*864</p>
         * </li>
         * <li><p>1080*1920</p>
         * </li>
         * <li><p>1920*1080</p>
         * </li>
         * <li><p>720*1280</p>
         * </li>
         * <li><p>2400*1080</p>
         * </li>
         * <li><p>1080*2400</p>
         * </li>
         * <li><p>1280*720</p>
         * </li>
         * <li><p>864*1920</p>
         * </li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>720*1280</p>
         */
        public Builder resolution(String resolution) {
            this.putQueryParameter("Resolution", resolution);
            this.resolution = resolution;
            return this;
        }

        /**
         * <p>The service name.</p>
         * 
         * <strong>example:</strong>
         * <p>AIC-Server</p>
         */
        public Builder serverName(String serverName) {
            this.putQueryParameter("ServerName", serverName);
            this.serverName = serverName;
            return this;
        }

        /**
         * <p>The ARM board specification. Valid values:</p>
         * <ul>
         * <li>cas.cf53r</li>
         * <li>cas.cf52r</li>
         * <li>cas.cf52m1r</li>
         * <li>cas.tg52g2</li>
         * <li>ens.afq-c2m3i.medium</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cas.cf53r</p>
         */
        public Builder serverType(String serverType) {
            this.putQueryParameter("ServerType", serverType);
            this.serverType = serverType;
            return this;
        }

        /**
         * <p>The list of tags bound to the instance.</p>
         */
        public Builder tag(java.util.List<Tag> tag) {
            this.putQueryParameter("Tag", tag);
            this.tag = tag;
            return this;
        }

        @Override
        public CreateARMServerInstancesRequest build() {
            return new CreateARMServerInstancesRequest(this);
        } 

    } 

    /**
     * 
     * {@link CreateARMServerInstancesRequest} extends {@link TeaModel}
     *
     * <p>CreateARMServerInstancesRequest</p>
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
             * <p>The tag key.</p>
             * 
             * <strong>example:</strong>
             * <p>team</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>The tag value.</p>
             * 
             * <strong>example:</strong>
             * <p>backend</p>
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
}
