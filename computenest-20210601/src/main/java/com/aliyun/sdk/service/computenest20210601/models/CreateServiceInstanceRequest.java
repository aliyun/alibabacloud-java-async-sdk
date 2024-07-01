// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.computenest20210601.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateServiceInstanceRequest} extends {@link RequestModel}
 *
 * <p>CreateServiceInstanceRequest</p>
 */
public class CreateServiceInstanceRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    private String clientToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Commodity")
    private Commodity commodity;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ContactGroup")
    private String contactGroup;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DryRun")
    private Boolean dryRun;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EnableInstanceOps")
    private Boolean enableInstanceOps;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EnableUserPrometheus")
    private Boolean enableUserPrometheus;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Name")
    private String name;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OperationMetadata")
    private OperationMetadata operationMetadata;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Parameters")
    private java.util.Map < String, ? > parameters;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceAutoPay")
    private Boolean resourceAutoPay;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
    private String resourceGroupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ServiceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String serviceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ServiceVersion")
    private String serviceVersion;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SpecificationCode")
    private String specificationCode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SpecificationName")
    private String specificationName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Tag")
    private java.util.List < Tag> tag;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TemplateName")
    private String templateName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TrialType")
    private String trialType;

    private CreateServiceInstanceRequest(Builder builder) {
        super(builder);
        this.clientToken = builder.clientToken;
        this.commodity = builder.commodity;
        this.contactGroup = builder.contactGroup;
        this.dryRun = builder.dryRun;
        this.enableInstanceOps = builder.enableInstanceOps;
        this.enableUserPrometheus = builder.enableUserPrometheus;
        this.name = builder.name;
        this.operationMetadata = builder.operationMetadata;
        this.parameters = builder.parameters;
        this.regionId = builder.regionId;
        this.resourceAutoPay = builder.resourceAutoPay;
        this.resourceGroupId = builder.resourceGroupId;
        this.serviceId = builder.serviceId;
        this.serviceVersion = builder.serviceVersion;
        this.specificationCode = builder.specificationCode;
        this.specificationName = builder.specificationName;
        this.tag = builder.tag;
        this.templateName = builder.templateName;
        this.trialType = builder.trialType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateServiceInstanceRequest create() {
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
     * @return commodity
     */
    public Commodity getCommodity() {
        return this.commodity;
    }

    /**
     * @return contactGroup
     */
    public String getContactGroup() {
        return this.contactGroup;
    }

    /**
     * @return dryRun
     */
    public Boolean getDryRun() {
        return this.dryRun;
    }

    /**
     * @return enableInstanceOps
     */
    public Boolean getEnableInstanceOps() {
        return this.enableInstanceOps;
    }

    /**
     * @return enableUserPrometheus
     */
    public Boolean getEnableUserPrometheus() {
        return this.enableUserPrometheus;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return operationMetadata
     */
    public OperationMetadata getOperationMetadata() {
        return this.operationMetadata;
    }

    /**
     * @return parameters
     */
    public java.util.Map < String, ? > getParameters() {
        return this.parameters;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return resourceAutoPay
     */
    public Boolean getResourceAutoPay() {
        return this.resourceAutoPay;
    }

    /**
     * @return resourceGroupId
     */
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    /**
     * @return serviceId
     */
    public String getServiceId() {
        return this.serviceId;
    }

    /**
     * @return serviceVersion
     */
    public String getServiceVersion() {
        return this.serviceVersion;
    }

    /**
     * @return specificationCode
     */
    public String getSpecificationCode() {
        return this.specificationCode;
    }

    /**
     * @return specificationName
     */
    public String getSpecificationName() {
        return this.specificationName;
    }

    /**
     * @return tag
     */
    public java.util.List < Tag> getTag() {
        return this.tag;
    }

    /**
     * @return templateName
     */
    public String getTemplateName() {
        return this.templateName;
    }

    /**
     * @return trialType
     */
    public String getTrialType() {
        return this.trialType;
    }

    public static final class Builder extends Request.Builder<CreateServiceInstanceRequest, Builder> {
        private String clientToken; 
        private Commodity commodity; 
        private String contactGroup; 
        private Boolean dryRun; 
        private Boolean enableInstanceOps; 
        private Boolean enableUserPrometheus; 
        private String name; 
        private OperationMetadata operationMetadata; 
        private java.util.Map < String, ? > parameters; 
        private String regionId; 
        private Boolean resourceAutoPay; 
        private String resourceGroupId; 
        private String serviceId; 
        private String serviceVersion; 
        private String specificationCode; 
        private String specificationName; 
        private java.util.List < Tag> tag; 
        private String templateName; 
        private String trialType; 

        private Builder() {
            super();
        } 

        private Builder(CreateServiceInstanceRequest request) {
            super(request);
            this.clientToken = request.clientToken;
            this.commodity = request.commodity;
            this.contactGroup = request.contactGroup;
            this.dryRun = request.dryRun;
            this.enableInstanceOps = request.enableInstanceOps;
            this.enableUserPrometheus = request.enableUserPrometheus;
            this.name = request.name;
            this.operationMetadata = request.operationMetadata;
            this.parameters = request.parameters;
            this.regionId = request.regionId;
            this.resourceAutoPay = request.resourceAutoPay;
            this.resourceGroupId = request.resourceGroupId;
            this.serviceId = request.serviceId;
            this.serviceVersion = request.serviceVersion;
            this.specificationCode = request.specificationCode;
            this.specificationName = request.specificationName;
            this.tag = request.tag;
            this.templateName = request.templateName;
            this.trialType = request.trialType;
        } 

        /**
         * ClientToken.
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * Commodity.
         */
        public Builder commodity(Commodity commodity) {
            this.putQueryParameter("Commodity", commodity);
            this.commodity = commodity;
            return this;
        }

        /**
         * 接收告警的云监控联系人组。
         */
        public Builder contactGroup(String contactGroup) {
            this.putQueryParameter("ContactGroup", contactGroup);
            this.contactGroup = contactGroup;
            return this;
        }

        /**
         * DryRun.
         */
        public Builder dryRun(Boolean dryRun) {
            this.putQueryParameter("DryRun", dryRun);
            this.dryRun = dryRun;
            return this;
        }

        /**
         * EnableInstanceOps.
         */
        public Builder enableInstanceOps(Boolean enableInstanceOps) {
            this.putQueryParameter("EnableInstanceOps", enableInstanceOps);
            this.enableInstanceOps = enableInstanceOps;
            return this;
        }

        /**
         * EnableUserPrometheus.
         */
        public Builder enableUserPrometheus(Boolean enableUserPrometheus) {
            this.putQueryParameter("EnableUserPrometheus", enableUserPrometheus);
            this.enableUserPrometheus = enableUserPrometheus;
            return this;
        }

        /**
         * 服务实例名称。格式要求如下：
         * <p>
         * 
         * - 长度不超过64个字符。
         * 
         * - 必须以数字或英文字母开头，可包含数字、英文字母、短划线（-）和下划线（_）。
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * OperationMetadata.
         */
        public Builder operationMetadata(OperationMetadata operationMetadata) {
            this.putQueryParameter("OperationMetadata", operationMetadata);
            this.operationMetadata = operationMetadata;
            return this;
        }

        /**
         * Parameters.
         */
        public Builder parameters(java.util.Map < String, ? > parameters) {
            String parametersShrink = shrink(parameters, "Parameters", "json");
            this.putQueryParameter("Parameters", parametersShrink);
            this.parameters = parameters;
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

        /**
         * ResourceAutoPay.
         */
        public Builder resourceAutoPay(Boolean resourceAutoPay) {
            this.putQueryParameter("ResourceAutoPay", resourceAutoPay);
            this.resourceAutoPay = resourceAutoPay;
            return this;
        }

        /**
         * ResourceGroupId.
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.putQueryParameter("ResourceGroupId", resourceGroupId);
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        /**
         * ServiceId.
         */
        public Builder serviceId(String serviceId) {
            this.putQueryParameter("ServiceId", serviceId);
            this.serviceId = serviceId;
            return this;
        }

        /**
         * ServiceVersion.
         */
        public Builder serviceVersion(String serviceVersion) {
            this.putQueryParameter("ServiceVersion", serviceVersion);
            this.serviceVersion = serviceVersion;
            return this;
        }

        /**
         * SpecificationCode.
         */
        public Builder specificationCode(String specificationCode) {
            this.putQueryParameter("SpecificationCode", specificationCode);
            this.specificationCode = specificationCode;
            return this;
        }

        /**
         * 套餐规格名称。
         */
        public Builder specificationName(String specificationName) {
            this.putQueryParameter("SpecificationName", specificationName);
            this.specificationName = specificationName;
            return this;
        }

        /**
         * 用户自定义标签。
         */
        public Builder tag(java.util.List < Tag> tag) {
            this.putQueryParameter("Tag", tag);
            this.tag = tag;
            return this;
        }

        /**
         * TemplateName.
         */
        public Builder templateName(String templateName) {
            this.putQueryParameter("TemplateName", templateName);
            this.templateName = templateName;
            return this;
        }

        /**
         * 使用类型。可选值：
         * <p>
         * 
         * - Trial：支持试用。
         * 
         * - NotTrial：不支持试用。
         */
        public Builder trialType(String trialType) {
            this.putQueryParameter("TrialType", trialType);
            this.trialType = trialType;
            return this;
        }

        @Override
        public CreateServiceInstanceRequest build() {
            return new CreateServiceInstanceRequest(this);
        } 

    } 

    public static class Commodity extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AutoPay")
        private Boolean autoPay;

        @com.aliyun.core.annotation.NameInMap("AutoRenew")
        private Boolean autoRenew;

        @com.aliyun.core.annotation.NameInMap("PayPeriod")
        private Long payPeriod;

        @com.aliyun.core.annotation.NameInMap("PayPeriodUnit")
        private String payPeriodUnit;

        private Commodity(Builder builder) {
            this.autoPay = builder.autoPay;
            this.autoRenew = builder.autoRenew;
            this.payPeriod = builder.payPeriod;
            this.payPeriodUnit = builder.payPeriodUnit;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Commodity create() {
            return builder().build();
        }

        /**
         * @return autoPay
         */
        public Boolean getAutoPay() {
            return this.autoPay;
        }

        /**
         * @return autoRenew
         */
        public Boolean getAutoRenew() {
            return this.autoRenew;
        }

        /**
         * @return payPeriod
         */
        public Long getPayPeriod() {
            return this.payPeriod;
        }

        /**
         * @return payPeriodUnit
         */
        public String getPayPeriodUnit() {
            return this.payPeriodUnit;
        }

        public static final class Builder {
            private Boolean autoPay; 
            private Boolean autoRenew; 
            private Long payPeriod; 
            private String payPeriodUnit; 

            /**
             * AutoPay.
             */
            public Builder autoPay(Boolean autoPay) {
                this.autoPay = autoPay;
                return this;
            }

            /**
             * AutoRenew.
             */
            public Builder autoRenew(Boolean autoRenew) {
                this.autoRenew = autoRenew;
                return this;
            }

            /**
             * PayPeriod.
             */
            public Builder payPeriod(Long payPeriod) {
                this.payPeriod = payPeriod;
                return this;
            }

            /**
             * PayPeriodUnit.
             */
            public Builder payPeriodUnit(String payPeriodUnit) {
                this.payPeriodUnit = payPeriodUnit;
                return this;
            }

            public Commodity build() {
                return new Commodity(this);
            } 

        } 

    }
    public static class OperationMetadata extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("EndTime")
        private String endTime;

        @com.aliyun.core.annotation.NameInMap("ExtraInfo")
        private String extraInfo;

        @com.aliyun.core.annotation.NameInMap("Resources")
        private String resources;

        @com.aliyun.core.annotation.NameInMap("ServiceInstanceId")
        private String serviceInstanceId;

        @com.aliyun.core.annotation.NameInMap("StartTime")
        private String startTime;

        private OperationMetadata(Builder builder) {
            this.endTime = builder.endTime;
            this.extraInfo = builder.extraInfo;
            this.resources = builder.resources;
            this.serviceInstanceId = builder.serviceInstanceId;
            this.startTime = builder.startTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static OperationMetadata create() {
            return builder().build();
        }

        /**
         * @return endTime
         */
        public String getEndTime() {
            return this.endTime;
        }

        /**
         * @return extraInfo
         */
        public String getExtraInfo() {
            return this.extraInfo;
        }

        /**
         * @return resources
         */
        public String getResources() {
            return this.resources;
        }

        /**
         * @return serviceInstanceId
         */
        public String getServiceInstanceId() {
            return this.serviceInstanceId;
        }

        /**
         * @return startTime
         */
        public String getStartTime() {
            return this.startTime;
        }

        public static final class Builder {
            private String endTime; 
            private String extraInfo; 
            private String resources; 
            private String serviceInstanceId; 
            private String startTime; 

            /**
             * EndTime.
             */
            public Builder endTime(String endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * ExtraInfo.
             */
            public Builder extraInfo(String extraInfo) {
                this.extraInfo = extraInfo;
                return this;
            }

            /**
             * Resources.
             */
            public Builder resources(String resources) {
                this.resources = resources;
                return this;
            }

            /**
             * ServiceInstanceId.
             */
            public Builder serviceInstanceId(String serviceInstanceId) {
                this.serviceInstanceId = serviceInstanceId;
                return this;
            }

            /**
             * StartTime.
             */
            public Builder startTime(String startTime) {
                this.startTime = startTime;
                return this;
            }

            public OperationMetadata build() {
                return new OperationMetadata(this);
            } 

        } 

    }
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

            /**
             * 标签键。
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * 标签值。
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
