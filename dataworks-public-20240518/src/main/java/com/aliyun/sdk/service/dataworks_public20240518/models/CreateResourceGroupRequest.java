// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20240518.models;

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
 * {@link CreateResourceGroupRequest} extends {@link RequestModel}
 *
 * <p>CreateResourceGroupRequest</p>
 */
public class CreateResourceGroupRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AliyunResourceGroupId")
    private String aliyunResourceGroupId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AliyunResourceTags")
    private java.util.List<AliyunResourceTags> aliyunResourceTags;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AutoRenewEnabled")
    private Boolean autoRenewEnabled;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    @com.aliyun.core.annotation.Validation(required = true)
    private String clientToken;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Name")
    @com.aliyun.core.annotation.Validation(required = true)
    private String name;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("PaymentDuration")
    private Integer paymentDuration;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("PaymentDurationUnit")
    private String paymentDurationUnit;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("PaymentType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String paymentType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Remark")
    private String remark;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Spec")
    private Integer spec;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("VpcId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String vpcId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("VswitchId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String vswitchId;

    private CreateResourceGroupRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.aliyunResourceGroupId = builder.aliyunResourceGroupId;
        this.aliyunResourceTags = builder.aliyunResourceTags;
        this.autoRenewEnabled = builder.autoRenewEnabled;
        this.clientToken = builder.clientToken;
        this.name = builder.name;
        this.paymentDuration = builder.paymentDuration;
        this.paymentDurationUnit = builder.paymentDurationUnit;
        this.paymentType = builder.paymentType;
        this.remark = builder.remark;
        this.spec = builder.spec;
        this.vpcId = builder.vpcId;
        this.vswitchId = builder.vswitchId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateResourceGroupRequest create() {
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
     * @return aliyunResourceGroupId
     */
    public String getAliyunResourceGroupId() {
        return this.aliyunResourceGroupId;
    }

    /**
     * @return aliyunResourceTags
     */
    public java.util.List<AliyunResourceTags> getAliyunResourceTags() {
        return this.aliyunResourceTags;
    }

    /**
     * @return autoRenewEnabled
     */
    public Boolean getAutoRenewEnabled() {
        return this.autoRenewEnabled;
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return paymentDuration
     */
    public Integer getPaymentDuration() {
        return this.paymentDuration;
    }

    /**
     * @return paymentDurationUnit
     */
    public String getPaymentDurationUnit() {
        return this.paymentDurationUnit;
    }

    /**
     * @return paymentType
     */
    public String getPaymentType() {
        return this.paymentType;
    }

    /**
     * @return remark
     */
    public String getRemark() {
        return this.remark;
    }

    /**
     * @return spec
     */
    public Integer getSpec() {
        return this.spec;
    }

    /**
     * @return vpcId
     */
    public String getVpcId() {
        return this.vpcId;
    }

    /**
     * @return vswitchId
     */
    public String getVswitchId() {
        return this.vswitchId;
    }

    public static final class Builder extends Request.Builder<CreateResourceGroupRequest, Builder> {
        private String regionId; 
        private String aliyunResourceGroupId; 
        private java.util.List<AliyunResourceTags> aliyunResourceTags; 
        private Boolean autoRenewEnabled; 
        private String clientToken; 
        private String name; 
        private Integer paymentDuration; 
        private String paymentDurationUnit; 
        private String paymentType; 
        private String remark; 
        private Integer spec; 
        private String vpcId; 
        private String vswitchId; 

        private Builder() {
            super();
        } 

        private Builder(CreateResourceGroupRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.aliyunResourceGroupId = request.aliyunResourceGroupId;
            this.aliyunResourceTags = request.aliyunResourceTags;
            this.autoRenewEnabled = request.autoRenewEnabled;
            this.clientToken = request.clientToken;
            this.name = request.name;
            this.paymentDuration = request.paymentDuration;
            this.paymentDurationUnit = request.paymentDurationUnit;
            this.paymentType = request.paymentType;
            this.remark = request.remark;
            this.spec = request.spec;
            this.vpcId = request.vpcId;
            this.vswitchId = request.vswitchId;
        } 

        /**
         * <p>This parameter is required.</p>
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The ID of the Alibaba Cloud resource group.</p>
         * 
         * <strong>example:</strong>
         * <p>rg-aek2kqofrgXXXXX</p>
         */
        public Builder aliyunResourceGroupId(String aliyunResourceGroupId) {
            this.putBodyParameter("AliyunResourceGroupId", aliyunResourceGroupId);
            this.aliyunResourceGroupId = aliyunResourceGroupId;
            return this;
        }

        /**
         * <p>The tags.</p>
         */
        public Builder aliyunResourceTags(java.util.List<AliyunResourceTags> aliyunResourceTags) {
            String aliyunResourceTagsShrink = shrink(aliyunResourceTags, "AliyunResourceTags", "json");
            this.putBodyParameter("AliyunResourceTags", aliyunResourceTagsShrink);
            this.aliyunResourceTags = aliyunResourceTags;
            return this;
        }

        /**
         * <p>Specifies whether to enable auto-renewal.</p>
         */
        public Builder autoRenewEnabled(Boolean autoRenewEnabled) {
            this.putBodyParameter("AutoRenewEnabled", autoRenewEnabled);
            this.autoRenewEnabled = autoRenewEnabled;
            return this;
        }

        /**
         * <p>The client token that is used to ensure the idempotence of the request.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>eb870033-74c8-4b1b-9664-04c4e7cc3465</p>
         */
        public Builder clientToken(String clientToken) {
            this.putBodyParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * <p>The name of the serverless resource group. The name can be a maximum of 128 characters in length and can contain letters, digits, and underscores (_). The name must start with a letter.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>common_resource_group</p>
         */
        public Builder name(String name) {
            this.putBodyParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * <p>The subscription duration.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder paymentDuration(Integer paymentDuration) {
            this.putBodyParameter("PaymentDuration", paymentDuration);
            this.paymentDuration = paymentDuration;
            return this;
        }

        /**
         * <p>The unit of the subscription duration. Valid values: Month and Year.</p>
         * 
         * <strong>example:</strong>
         * <p>Month</p>
         */
        public Builder paymentDurationUnit(String paymentDurationUnit) {
            this.putBodyParameter("PaymentDurationUnit", paymentDurationUnit);
            this.paymentDurationUnit = paymentDurationUnit;
            return this;
        }

        /**
         * <p>The billing method of the serverless resource group. Valid values: PrePaid and PostPaid. The value PrePaid indicates the subscription billing method, and the value PostPaid indicates the pay-as-you-go billing method.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>PrePaid</p>
         */
        public Builder paymentType(String paymentType) {
            this.putBodyParameter("PaymentType", paymentType);
            this.paymentType = paymentType;
            return this;
        }

        /**
         * <p>The description of the serverless resource group. The description can be a maximum of 128 characters in length and can contain letters, digits, and underscores (_).</p>
         * 
         * <strong>example:</strong>
         * <p>Create a serverless resource group for common tasks</p>
         */
        public Builder remark(String remark) {
            this.putBodyParameter("Remark", remark);
            this.remark = remark;
            return this;
        }

        /**
         * <p>The specifications of the serverless resource group. Unit: CU. This parameter is required only if you set the PaymentType parameter to PrePaid.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        public Builder spec(Integer spec) {
            this.putBodyParameter("Spec", spec);
            this.spec = spec;
            return this;
        }

        /**
         * <p>The ID of the virtual private cloud (VPC) with which the serverless resource group is associated by default.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>vpc-m2et4f3oc8msfbccXXXXX</p>
         */
        public Builder vpcId(String vpcId) {
            this.putBodyParameter("VpcId", vpcId);
            this.vpcId = vpcId;
            return this;
        }

        /**
         * <p>The ID of the vSwitch with which the serverless resource group is associated by default.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>vsw-uf8usrhs7hjd9amsXXXXX</p>
         */
        public Builder vswitchId(String vswitchId) {
            this.putBodyParameter("VswitchId", vswitchId);
            this.vswitchId = vswitchId;
            return this;
        }

        @Override
        public CreateResourceGroupRequest build() {
            return new CreateResourceGroupRequest(this);
        } 

    } 

    /**
     * 
     * {@link CreateResourceGroupRequest} extends {@link TeaModel}
     *
     * <p>CreateResourceGroupRequest</p>
     */
    public static class AliyunResourceTags extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Key")
        private String key;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private AliyunResourceTags(Builder builder) {
            this.key = builder.key;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AliyunResourceTags create() {
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

            private Builder(AliyunResourceTags model) {
                this.key = model.key;
                this.value = model.value;
            } 

            /**
             * <p>The tag key.</p>
             * 
             * <strong>example:</strong>
             * <p>key</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>The tag value.</p>
             * 
             * <strong>example:</strong>
             * <p>value</p>
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public AliyunResourceTags build() {
                return new AliyunResourceTags(this);
            } 

        } 

    }
}
