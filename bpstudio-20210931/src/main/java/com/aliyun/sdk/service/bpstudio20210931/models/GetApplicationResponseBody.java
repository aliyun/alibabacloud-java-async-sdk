// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.bpstudio20210931.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link GetApplicationResponseBody} extends {@link TeaModel}
 *
 * <p>GetApplicationResponseBody</p>
 */
public class GetApplicationResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private GetApplicationResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetApplicationResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String code; 
        private Data data; 
        private String message; 
        private String requestId; 

        /**
         * <p>The response code.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The details of the application.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>Reason for the request failure</p>
         * 
         * <strong>example:</strong>
         * <p>Success</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>Request ID</p>
         * 
         * <strong>example:</strong>
         * <p>A07FFDF2-78FA-1B48-9E38-88E833A93187</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetApplicationResponseBody build() {
            return new GetApplicationResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetApplicationResponseBody} extends {@link TeaModel}
     *
     * <p>GetApplicationResponseBody</p>
     */
    public static class Checklist extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Lifecycle")
        private String lifecycle;

        @com.aliyun.core.annotation.NameInMap("Region")
        private String region;

        @com.aliyun.core.annotation.NameInMap("Remark")
        private String remark;

        @com.aliyun.core.annotation.NameInMap("ResourceCode")
        private String resourceCode;

        @com.aliyun.core.annotation.NameInMap("ResourceName")
        private String resourceName;

        @com.aliyun.core.annotation.NameInMap("Result")
        private String result;

        @com.aliyun.core.annotation.NameInMap("Specification")
        private String specification;

        private Checklist(Builder builder) {
            this.lifecycle = builder.lifecycle;
            this.region = builder.region;
            this.remark = builder.remark;
            this.resourceCode = builder.resourceCode;
            this.resourceName = builder.resourceName;
            this.result = builder.result;
            this.specification = builder.specification;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Checklist create() {
            return builder().build();
        }

        /**
         * @return lifecycle
         */
        public String getLifecycle() {
            return this.lifecycle;
        }

        /**
         * @return region
         */
        public String getRegion() {
            return this.region;
        }

        /**
         * @return remark
         */
        public String getRemark() {
            return this.remark;
        }

        /**
         * @return resourceCode
         */
        public String getResourceCode() {
            return this.resourceCode;
        }

        /**
         * @return resourceName
         */
        public String getResourceName() {
            return this.resourceName;
        }

        /**
         * @return result
         */
        public String getResult() {
            return this.result;
        }

        /**
         * @return specification
         */
        public String getSpecification() {
            return this.specification;
        }

        public static final class Builder {
            private String lifecycle; 
            private String region; 
            private String remark; 
            private String resourceCode; 
            private String resourceName; 
            private String result; 
            private String specification; 

            /**
             * <p>The resource tag.</p>
             * 
             * <strong>example:</strong>
             * <p>Create</p>
             */
            public Builder lifecycle(String lifecycle) {
                this.lifecycle = lifecycle;
                return this;
            }

            /**
             * <p>The region in which the instance resides.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou</p>
             */
            public Builder region(String region) {
                this.region = region;
                return this;
            }

            /**
             * <p>The message returned for verification.</p>
             * 
             * <strong>example:</strong>
             * <p>The ID of the region.</p>
             */
            public Builder remark(String remark) {
                this.remark = remark;
                return this;
            }

            /**
             * <p>The service code.</p>
             * 
             * <strong>example:</strong>
             * <p>vpc</p>
             */
            public Builder resourceCode(String resourceCode) {
                this.resourceCode = resourceCode;
                return this;
            }

            /**
             * <p>The name of the instance.</p>
             * 
             * <strong>example:</strong>
             * <p>vpc</p>
             */
            public Builder resourceName(String resourceName) {
                this.resourceName = resourceName;
                return this;
            }

            /**
             * <p>The verification result.</p>
             * 
             * <strong>example:</strong>
             * <p>Finish</p>
             */
            public Builder result(String result) {
                this.result = result;
                return this;
            }

            /**
             * <p>The resource specifications.</p>
             * 
             * <strong>example:</strong>
             * <p>192.168.0.0/16</p>
             */
            public Builder specification(String specification) {
                this.specification = specification;
                return this;
            }

            public Checklist build() {
                return new Checklist(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetApplicationResponseBody} extends {@link TeaModel}
     *
     * <p>GetApplicationResponseBody</p>
     */
    public static class PriceList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ChargeType")
        private String chargeType;

        @com.aliyun.core.annotation.NameInMap("Count")
        private Integer count;

        @com.aliyun.core.annotation.NameInMap("InstanceName")
        private String instanceName;

        @com.aliyun.core.annotation.NameInMap("Lifecycle")
        private String lifecycle;

        @com.aliyun.core.annotation.NameInMap("OnePrice")
        private Double onePrice;

        @com.aliyun.core.annotation.NameInMap("OriginalPrice")
        private Double originalPrice;

        @com.aliyun.core.annotation.NameInMap("Period")
        private Integer period;

        @com.aliyun.core.annotation.NameInMap("Price")
        private Double price;

        @com.aliyun.core.annotation.NameInMap("PriceUnit")
        private String priceUnit;

        @com.aliyun.core.annotation.NameInMap("Region")
        private String region;

        @com.aliyun.core.annotation.NameInMap("Remark")
        private String remark;

        @com.aliyun.core.annotation.NameInMap("ResourceCode")
        private String resourceCode;

        @com.aliyun.core.annotation.NameInMap("Specification")
        private String specification;

        @com.aliyun.core.annotation.NameInMap("type")
        private String type;

        private PriceList(Builder builder) {
            this.chargeType = builder.chargeType;
            this.count = builder.count;
            this.instanceName = builder.instanceName;
            this.lifecycle = builder.lifecycle;
            this.onePrice = builder.onePrice;
            this.originalPrice = builder.originalPrice;
            this.period = builder.period;
            this.price = builder.price;
            this.priceUnit = builder.priceUnit;
            this.region = builder.region;
            this.remark = builder.remark;
            this.resourceCode = builder.resourceCode;
            this.specification = builder.specification;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PriceList create() {
            return builder().build();
        }

        /**
         * @return chargeType
         */
        public String getChargeType() {
            return this.chargeType;
        }

        /**
         * @return count
         */
        public Integer getCount() {
            return this.count;
        }

        /**
         * @return instanceName
         */
        public String getInstanceName() {
            return this.instanceName;
        }

        /**
         * @return lifecycle
         */
        public String getLifecycle() {
            return this.lifecycle;
        }

        /**
         * @return onePrice
         */
        public Double getOnePrice() {
            return this.onePrice;
        }

        /**
         * @return originalPrice
         */
        public Double getOriginalPrice() {
            return this.originalPrice;
        }

        /**
         * @return period
         */
        public Integer getPeriod() {
            return this.period;
        }

        /**
         * @return price
         */
        public Double getPrice() {
            return this.price;
        }

        /**
         * @return priceUnit
         */
        public String getPriceUnit() {
            return this.priceUnit;
        }

        /**
         * @return region
         */
        public String getRegion() {
            return this.region;
        }

        /**
         * @return remark
         */
        public String getRemark() {
            return this.remark;
        }

        /**
         * @return resourceCode
         */
        public String getResourceCode() {
            return this.resourceCode;
        }

        /**
         * @return specification
         */
        public String getSpecification() {
            return this.specification;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private String chargeType; 
            private Integer count; 
            private String instanceName; 
            private String lifecycle; 
            private Double onePrice; 
            private Double originalPrice; 
            private Integer period; 
            private Double price; 
            private String priceUnit; 
            private String region; 
            private String remark; 
            private String resourceCode; 
            private String specification; 
            private String type; 

            /**
             * <p>The billing method.</p>
             * 
             * <strong>example:</strong>
             * <p>PayAsYouGo</p>
             */
            public Builder chargeType(String chargeType) {
                this.chargeType = chargeType;
                return this;
            }

            /**
             * <p>The quantity.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder count(Integer count) {
                this.count = count;
                return this;
            }

            /**
             * <p>The name of the instance.</p>
             * 
             * <strong>example:</strong>
             * <p>ecs</p>
             */
            public Builder instanceName(String instanceName) {
                this.instanceName = instanceName;
                return this;
            }

            /**
             * <p>Resource Fill Labels.</p>
             * 
             * <strong>example:</strong>
             * <p>Create</p>
             */
            public Builder lifecycle(String lifecycle) {
                this.lifecycle = lifecycle;
                return this;
            }

            /**
             * <p>The unit price of the instance.</p>
             * 
             * <strong>example:</strong>
             * <p>0.01</p>
             */
            public Builder onePrice(Double onePrice) {
                this.onePrice = onePrice;
                return this;
            }

            /**
             * <p>The original price of the instance.</p>
             * 
             * <strong>example:</strong>
             * <p>3.570</p>
             */
            public Builder originalPrice(Double originalPrice) {
                this.originalPrice = originalPrice;
                return this;
            }

            /**
             * <p>The service duration.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder period(Integer period) {
                this.period = period;
                return this;
            }

            /**
             * <p>The total price.</p>
             * 
             * <strong>example:</strong>
             * <p>0.01</p>
             */
            public Builder price(Double price) {
                this.price = price;
                return this;
            }

            /**
             * <p>Unit: USD per hour</p>
             * 
             * <strong>example:</strong>
             * <p>The service duration.</p>
             */
            public Builder priceUnit(String priceUnit) {
                this.priceUnit = priceUnit;
                return this;
            }

            /**
             * <p>The region in which the instance resides.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou</p>
             */
            public Builder region(String region) {
                this.region = region;
                return this;
            }

            /**
             * <p>The error message that is returned when a price query fails.</p>
             * 
             * <strong>example:</strong>
             * <p>ecs.e3.large</p>
             */
            public Builder remark(String remark) {
                this.remark = remark;
                return this;
            }

            /**
             * <p>Product code</p>
             * 
             * <strong>example:</strong>
             * <p>ecs</p>
             */
            public Builder resourceCode(String resourceCode) {
                this.resourceCode = resourceCode;
                return this;
            }

            /**
             * <p>The instance type. This parameter indicates the information about the instance type. For example, 192.168.0.0/16 may be returned for a Virtual Private Cloud (VPC) instance, ecs.g5.large may be returned for an Elastic Compute Service (ECS) instance, and slb.s1.small may be returned for a Server Load Balancer (SLB) instance. If the resource does not have a specific type, an empty value is returned.</p>
             * 
             * <strong>example:</strong>
             * <p>The billing method.</p>
             */
            public Builder specification(String specification) {
                this.specification = specification;
                return this;
            }

            /**
             * <p>The creation mode. Valid values:<br>1: creates a new instance.<br>2: imports an instance.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public PriceList build() {
                return new PriceList(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetApplicationResponseBody} extends {@link TeaModel}
     *
     * <p>GetApplicationResponseBody</p>
     */
    public static class ResourceList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ChargeType")
        private String chargeType;

        @com.aliyun.core.annotation.NameInMap("Lifecycle")
        private String lifecycle;

        @com.aliyun.core.annotation.NameInMap("NodeLabel")
        private String nodeLabel;

        @com.aliyun.core.annotation.NameInMap("Remark")
        private String remark;

        @com.aliyun.core.annotation.NameInMap("ResourceCode")
        private String resourceCode;

        @com.aliyun.core.annotation.NameInMap("ResourceId")
        private String resourceId;

        @com.aliyun.core.annotation.NameInMap("ResourceName")
        private String resourceName;

        @com.aliyun.core.annotation.NameInMap("ResourceType")
        private String resourceType;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        private ResourceList(Builder builder) {
            this.chargeType = builder.chargeType;
            this.lifecycle = builder.lifecycle;
            this.nodeLabel = builder.nodeLabel;
            this.remark = builder.remark;
            this.resourceCode = builder.resourceCode;
            this.resourceId = builder.resourceId;
            this.resourceName = builder.resourceName;
            this.resourceType = builder.resourceType;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ResourceList create() {
            return builder().build();
        }

        /**
         * @return chargeType
         */
        public String getChargeType() {
            return this.chargeType;
        }

        /**
         * @return lifecycle
         */
        public String getLifecycle() {
            return this.lifecycle;
        }

        /**
         * @return nodeLabel
         */
        public String getNodeLabel() {
            return this.nodeLabel;
        }

        /**
         * @return remark
         */
        public String getRemark() {
            return this.remark;
        }

        /**
         * @return resourceCode
         */
        public String getResourceCode() {
            return this.resourceCode;
        }

        /**
         * @return resourceId
         */
        public String getResourceId() {
            return this.resourceId;
        }

        /**
         * @return resourceName
         */
        public String getResourceName() {
            return this.resourceName;
        }

        /**
         * @return resourceType
         */
        public String getResourceType() {
            return this.resourceType;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private String chargeType; 
            private String lifecycle; 
            private String nodeLabel; 
            private String remark; 
            private String resourceCode; 
            private String resourceId; 
            private String resourceName; 
            private String resourceType; 
            private String status; 

            /**
             * <p>The billing method.</p>
             * 
             * <strong>example:</strong>
             * <p>PayAsYouGo</p>
             */
            public Builder chargeType(String chargeType) {
                this.chargeType = chargeType;
                return this;
            }

            /**
             * <p>The resource tag.</p>
             * 
             * <strong>example:</strong>
             * <p>Create</p>
             */
            public Builder lifecycle(String lifecycle) {
                this.lifecycle = lifecycle;
                return this;
            }

            /**
             * NodeLabel.
             */
            public Builder nodeLabel(String nodeLabel) {
                this.nodeLabel = nodeLabel;
                return this;
            }

            /**
             * <p>The deployment result.</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;hostName&quot;:&quot;iZ2zehnzxqixu1pywsfbx1Z&quot;,&quot;memory&quot;:32768.0,&quot;creationTime&quot;:&quot;2021-09-28T11:23:46Z&quot;,&quot;instanceName&quot;:&quot;ecs&quot;,&quot;internetMaxBandwidthOut&quot;:0.0,&quot;description&quot;:&quot;&quot;,&quot;clusterId&quot;:&quot;&quot;,&quot;private_ip&quot;:&quot;192.168.0.247&quot;,&quot;instanceId&quot;:&quot;i-2zehnzxqixu1pywsfbx1&quot;,&quot;requestId&quot;:&quot;F1C64344-3723-51A0-855B-5F08B5634323&quot;,&quot;zoneId&quot;:&quot;cn-beijing-b&quot;,&quot;ioOptimized&quot;:&quot;optimized&quot;,&quot;id&quot;:&quot;i-2zehnzxqixu1pywsfbx1&quot;,&quot;instanceNetworkType&quot;:&quot;vpc&quot;,&quot;instanceChargeType&quot;:&quot;PostPaid&quot;,&quot;imageId&quot;:&quot;centos_8_4_x64_20G_alibase_20210824.vhd&quot;,&quot;serialNumber&quot;:&quot;cee246c4-38f3-4bf3-950b-c17e88ff6527&quot;,&quot;vlanId&quot;:&quot;&quot;,&quot;instanceType&quot;:&quot;ecs.e3.large&quot;,&quot;cpu&quot;:4.0,&quot;creditSpecification&quot;:&quot;&quot;,&quot;internetMaxBandwidthIn&quot;:-1.0,&quot;expiredTime&quot;:&quot;2099-12-31T15:59Z&quot;,&quot;internetChargeType&quot;:&quot;PayByTraffic&quot;,&quot;regionId&quot;:&quot;cn-beijing&quot;,&quot;refId&quot;:&quot;79224644_0&quot;,&quot;stoppedMode&quot;:&quot;Not-applicable&quot;,&quot;status&quot;:&quot;Running&quot;}</p>
             */
            public Builder remark(String remark) {
                this.remark = remark;
                return this;
            }

            /**
             * <p>The service code.</p>
             * 
             * <strong>example:</strong>
             * <p>ecs</p>
             */
            public Builder resourceCode(String resourceCode) {
                this.resourceCode = resourceCode;
                return this;
            }

            /**
             * <p>The instance ID.</p>
             * 
             * <strong>example:</strong>
             * <p>i-2zehnzxqixu1pywsfbx1</p>
             */
            public Builder resourceId(String resourceId) {
                this.resourceId = resourceId;
                return this;
            }

            /**
             * <p>The name of the instance.</p>
             * 
             * <strong>example:</strong>
             * <p>ecs</p>
             */
            public Builder resourceName(String resourceName) {
                this.resourceName = resourceName;
                return this;
            }

            /**
             * <p>The type of the resource.</p>
             * 
             * <strong>example:</strong>
             * <p>ecs</p>
             */
            public Builder resourceType(String resourceType) {
                this.resourceType = resourceType;
                return this;
            }

            /**
             * <p>The resource deployment result.</p>
             * 
             * <strong>example:</strong>
             * <p>Finish</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public ResourceList build() {
                return new ResourceList(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetApplicationResponseBody} extends {@link TeaModel}
     *
     * <p>GetApplicationResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ApplicationId")
        private String applicationId;

        @com.aliyun.core.annotation.NameInMap("Checklist")
        private java.util.List < Checklist> checklist;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("DeployPercent")
        private Double deployPercent;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("Error")
        private String error;

        @com.aliyun.core.annotation.NameInMap("ImageURL")
        private String imageURL;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("PriceList")
        private java.util.List < PriceList> priceList;

        @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
        private String resourceGroupId;

        @com.aliyun.core.annotation.NameInMap("ResourceList")
        private java.util.List < ResourceList> resourceList;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("TemplateId")
        private String templateId;

        private Data(Builder builder) {
            this.applicationId = builder.applicationId;
            this.checklist = builder.checklist;
            this.createTime = builder.createTime;
            this.deployPercent = builder.deployPercent;
            this.description = builder.description;
            this.error = builder.error;
            this.imageURL = builder.imageURL;
            this.name = builder.name;
            this.priceList = builder.priceList;
            this.resourceGroupId = builder.resourceGroupId;
            this.resourceList = builder.resourceList;
            this.status = builder.status;
            this.templateId = builder.templateId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return applicationId
         */
        public String getApplicationId() {
            return this.applicationId;
        }

        /**
         * @return checklist
         */
        public java.util.List < Checklist> getChecklist() {
            return this.checklist;
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return deployPercent
         */
        public Double getDeployPercent() {
            return this.deployPercent;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return error
         */
        public String getError() {
            return this.error;
        }

        /**
         * @return imageURL
         */
        public String getImageURL() {
            return this.imageURL;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return priceList
         */
        public java.util.List < PriceList> getPriceList() {
            return this.priceList;
        }

        /**
         * @return resourceGroupId
         */
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        /**
         * @return resourceList
         */
        public java.util.List < ResourceList> getResourceList() {
            return this.resourceList;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return templateId
         */
        public String getTemplateId() {
            return this.templateId;
        }

        public static final class Builder {
            private String applicationId; 
            private java.util.List < Checklist> checklist; 
            private String createTime; 
            private Double deployPercent; 
            private String description; 
            private String error; 
            private String imageURL; 
            private String name; 
            private java.util.List < PriceList> priceList; 
            private String resourceGroupId; 
            private java.util.List < ResourceList> resourceList; 
            private String status; 
            private String templateId; 

            /**
             * <p>App ID</p>
             * 
             * <strong>example:</strong>
             * <p>VVK605ZH00OA4MRT</p>
             */
            public Builder applicationId(String applicationId) {
                this.applicationId = applicationId;
                return this;
            }

            /**
             * <p>The resource tag.</p>
             */
            public Builder checklist(java.util.List < Checklist> checklist) {
                this.checklist = checklist;
                return this;
            }

            /**
             * <p>The time when the app was created</p>
             * 
             * <strong>example:</strong>
             * <p>2021-08-09 14:37:16</p>
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * DeployPercent.
             */
            public Builder deployPercent(Double deployPercent) {
                this.deployPercent = deployPercent;
                return this;
            }

            /**
             * <p>Application description</p>
             * 
             * <strong>example:</strong>
             * <p>remark</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The resource type.</p>
             * 
             * <strong>example:</strong>
             * <p>Success</p>
             */
            public Builder error(String error) {
                this.error = error;
                return this;
            }

            /**
             * <p>The URL of the image in the database.</p>
             * 
             * <strong>example:</strong>
             * <p>The details of the application.</p>
             */
            public Builder imageURL(String imageURL) {
                this.imageURL = imageURL;
                return this;
            }

            /**
             * <p>App name</p>
             * 
             * <strong>example:</strong>
             * <p>1411182597819805/sr-8DWU4RUS49NIDII0.png</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The billing results.</p>
             */
            public Builder priceList(java.util.List < PriceList> priceList) {
                this.priceList = priceList;
                return this;
            }

            /**
             * <p>The ID of the resource group to which the app belongs</p>
             * 
             * <strong>example:</strong>
             * <p>rg-aekzhfgmw4e6fwq</p>
             */
            public Builder resourceGroupId(String resourceGroupId) {
                this.resourceGroupId = resourceGroupId;
                return this;
            }

            /**
             * <p>The resource specification.</p>
             */
            public Builder resourceList(java.util.List < ResourceList> resourceList) {
                this.resourceList = resourceList;
                return this;
            }

            /**
             * <p>Verification passed</p>
             * 
             * <strong>example:</strong>
             * <p>Deployed_Success</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The ID of the template associated with the application</p>
             * 
             * <strong>example:</strong>
             * <p>FYS9VZ535U20V7HT</p>
             */
            public Builder templateId(String templateId) {
                this.templateId = templateId;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
