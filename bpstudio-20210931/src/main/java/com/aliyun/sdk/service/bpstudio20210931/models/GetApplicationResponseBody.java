// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.bpstudio20210931.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetApplicationResponseBody} extends {@link TeaModel}
 *
 * <p>GetApplicationResponseBody</p>
 */
public class GetApplicationResponseBody extends TeaModel {
    @NameInMap("Code")
    private Integer code;

    @NameInMap("Data")
    private Data data;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
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
    public Integer getCode() {
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
        private Integer code; 
        private Data data; 
        private String message; 
        private String requestId; 

        /**
         * The HTTP status code.
         */
        public Builder code(Integer code) {
            this.code = code;
            return this;
        }

        /**
         * The details of the application.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * The message returned for the request.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetApplicationResponseBody build() {
            return new GetApplicationResponseBody(this);
        } 

    } 

    public static class Checklist extends TeaModel {
        @NameInMap("Lifecycle")
        private String lifecycle;

        @NameInMap("Region")
        private String region;

        @NameInMap("Remark")
        private String remark;

        @NameInMap("ResourceCode")
        private String resourceCode;

        @NameInMap("ResourceName")
        private String resourceName;

        @NameInMap("Result")
        private String result;

        @NameInMap("Specification")
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
             * The resource tag.
             */
            public Builder lifecycle(String lifecycle) {
                this.lifecycle = lifecycle;
                return this;
            }

            /**
             * The ID of the region.
             */
            public Builder region(String region) {
                this.region = region;
                return this;
            }

            /**
             * The message returned for verification.
             */
            public Builder remark(String remark) {
                this.remark = remark;
                return this;
            }

            /**
             * The service code.
             */
            public Builder resourceCode(String resourceCode) {
                this.resourceCode = resourceCode;
                return this;
            }

            /**
             * The name of the instance.
             */
            public Builder resourceName(String resourceName) {
                this.resourceName = resourceName;
                return this;
            }

            /**
             * The verification result.
             */
            public Builder result(String result) {
                this.result = result;
                return this;
            }

            /**
             * The resource specification.
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
    public static class PriceList extends TeaModel {
        @NameInMap("ChargeType")
        private String chargeType;

        @NameInMap("Count")
        private Long count;

        @NameInMap("InstanceName")
        private String instanceName;

        @NameInMap("Lifecycle")
        private String lifecycle;

        @NameInMap("OnePrice")
        private Float onePrice;

        @NameInMap("OriginalPrice")
        private Float originalPrice;

        @NameInMap("Period")
        private Float period;

        @NameInMap("Price")
        private Float price;

        @NameInMap("PriceUnit")
        private String priceUnit;

        @NameInMap("Region")
        private String region;

        @NameInMap("Remark")
        private String remark;

        @NameInMap("ResourceCode")
        private String resourceCode;

        @NameInMap("Specification")
        private String specification;

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
        public Long getCount() {
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
        public Float getOnePrice() {
            return this.onePrice;
        }

        /**
         * @return originalPrice
         */
        public Float getOriginalPrice() {
            return this.originalPrice;
        }

        /**
         * @return period
         */
        public Float getPeriod() {
            return this.period;
        }

        /**
         * @return price
         */
        public Float getPrice() {
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

        public static final class Builder {
            private String chargeType; 
            private Long count; 
            private String instanceName; 
            private String lifecycle; 
            private Float onePrice; 
            private Float originalPrice; 
            private Float period; 
            private Float price; 
            private String priceUnit; 
            private String region; 
            private String remark; 
            private String resourceCode; 
            private String specification; 

            /**
             * The billing method.
             */
            public Builder chargeType(String chargeType) {
                this.chargeType = chargeType;
                return this;
            }

            /**
             * The quantity.
             */
            public Builder count(Long count) {
                this.count = count;
                return this;
            }

            /**
             * The name of the instance.
             */
            public Builder instanceName(String instanceName) {
                this.instanceName = instanceName;
                return this;
            }

            /**
             * The resource tag.
             */
            public Builder lifecycle(String lifecycle) {
                this.lifecycle = lifecycle;
                return this;
            }

            /**
             * The unit price.
             */
            public Builder onePrice(Float onePrice) {
                this.onePrice = onePrice;
                return this;
            }

            /**
             * The original price.
             */
            public Builder originalPrice(Float originalPrice) {
                this.originalPrice = originalPrice;
                return this;
            }

            /**
             * The service duration.
             */
            public Builder period(Float period) {
                this.period = period;
                return this;
            }

            /**
             * The total price.
             */
            public Builder price(Float price) {
                this.price = price;
                return this;
            }

            /**
             * The price unit.
             */
            public Builder priceUnit(String priceUnit) {
                this.priceUnit = priceUnit;
                return this;
            }

            /**
             * The ID of the region.
             */
            public Builder region(String region) {
                this.region = region;
                return this;
            }

            /**
             * The error message that is returned when a price query fails.
             */
            public Builder remark(String remark) {
                this.remark = remark;
                return this;
            }

            /**
             * The service code.
             */
            public Builder resourceCode(String resourceCode) {
                this.resourceCode = resourceCode;
                return this;
            }

            /**
             * The instance type.
             */
            public Builder specification(String specification) {
                this.specification = specification;
                return this;
            }

            public PriceList build() {
                return new PriceList(this);
            } 

        } 

    }
    public static class ResourceList extends TeaModel {
        @NameInMap("ChargeType")
        private String chargeType;

        @NameInMap("Lifecycle")
        private String lifecycle;

        @NameInMap("Remark")
        private String remark;

        @NameInMap("ResourceCode")
        private String resourceCode;

        @NameInMap("ResourceId")
        private String resourceId;

        @NameInMap("ResourceName")
        private String resourceName;

        @NameInMap("ResourceType")
        private String resourceType;

        @NameInMap("Status")
        private String status;

        private ResourceList(Builder builder) {
            this.chargeType = builder.chargeType;
            this.lifecycle = builder.lifecycle;
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
            private String remark; 
            private String resourceCode; 
            private String resourceId; 
            private String resourceName; 
            private String resourceType; 
            private String status; 

            /**
             * The billing method.
             */
            public Builder chargeType(String chargeType) {
                this.chargeType = chargeType;
                return this;
            }

            /**
             * The resource tag.
             */
            public Builder lifecycle(String lifecycle) {
                this.lifecycle = lifecycle;
                return this;
            }

            /**
             * The deployment result.
             */
            public Builder remark(String remark) {
                this.remark = remark;
                return this;
            }

            /**
             * The service code.
             */
            public Builder resourceCode(String resourceCode) {
                this.resourceCode = resourceCode;
                return this;
            }

            /**
             * The ID of the instance.
             */
            public Builder resourceId(String resourceId) {
                this.resourceId = resourceId;
                return this;
            }

            /**
             * The name of the instance.
             */
            public Builder resourceName(String resourceName) {
                this.resourceName = resourceName;
                return this;
            }

            /**
             * The resource type.
             */
            public Builder resourceType(String resourceType) {
                this.resourceType = resourceType;
                return this;
            }

            /**
             * The resource deployment result.
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
    public static class Data extends TeaModel {
        @NameInMap("ApplicationId")
        private String applicationId;

        @NameInMap("Checklist")
        private java.util.List < Checklist> checklist;

        @NameInMap("CreateTime")
        private String createTime;

        @NameInMap("Description")
        private String description;

        @NameInMap("Error")
        private String error;

        @NameInMap("ImageURL")
        private String imageURL;

        @NameInMap("Name")
        private String name;

        @NameInMap("PriceList")
        private java.util.List < PriceList> priceList;

        @NameInMap("ResourceGroupId")
        private String resourceGroupId;

        @NameInMap("ResourceList")
        private java.util.List < ResourceList> resourceList;

        @NameInMap("Status")
        private String status;

        @NameInMap("TemplateId")
        private String templateId;

        @NameInMap("TopoURL")
        private String topoURL;

        private Data(Builder builder) {
            this.applicationId = builder.applicationId;
            this.checklist = builder.checklist;
            this.createTime = builder.createTime;
            this.description = builder.description;
            this.error = builder.error;
            this.imageURL = builder.imageURL;
            this.name = builder.name;
            this.priceList = builder.priceList;
            this.resourceGroupId = builder.resourceGroupId;
            this.resourceList = builder.resourceList;
            this.status = builder.status;
            this.templateId = builder.templateId;
            this.topoURL = builder.topoURL;
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

        /**
         * @return topoURL
         */
        public String getTopoURL() {
            return this.topoURL;
        }

        public static final class Builder {
            private String applicationId; 
            private java.util.List < Checklist> checklist; 
            private String createTime; 
            private String description; 
            private String error; 
            private String imageURL; 
            private String name; 
            private java.util.List < PriceList> priceList; 
            private String resourceGroupId; 
            private java.util.List < ResourceList> resourceList; 
            private String status; 
            private String templateId; 
            private String topoURL; 

            /**
             * The ID of the application.
             */
            public Builder applicationId(String applicationId) {
                this.applicationId = applicationId;
                return this;
            }

            /**
             * The verification results returned.
             */
            public Builder checklist(java.util.List < Checklist> checklist) {
                this.checklist = checklist;
                return this;
            }

            /**
             * The time when the application was created.
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * The description of the application.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * The message returned for deployment.
             */
            public Builder error(String error) {
                this.error = error;
                return this;
            }

            /**
             * The URL of the image in the database.
             */
            public Builder imageURL(String imageURL) {
                this.imageURL = imageURL;
                return this;
            }

            /**
             * The name of the application.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * The billing results.
             */
            public Builder priceList(java.util.List < PriceList> priceList) {
                this.priceList = priceList;
                return this;
            }

            /**
             * The ID of the resource group to which the application belongs.
             */
            public Builder resourceGroupId(String resourceGroupId) {
                this.resourceGroupId = resourceGroupId;
                return this;
            }

            /**
             * The resources.
             */
            public Builder resourceList(java.util.List < ResourceList> resourceList) {
                this.resourceList = resourceList;
                return this;
            }

            /**
             * The status of the application.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * The ID of the template associated with the application.
             */
            public Builder templateId(String templateId) {
                this.templateId = templateId;
                return this;
            }

            /**
             * The URL of the application topology image.
             */
            public Builder topoURL(String topoURL) {
                this.topoURL = topoURL;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
