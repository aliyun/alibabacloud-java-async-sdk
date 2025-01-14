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
 * {@link GetResourceGroupResponseBody} extends {@link TeaModel}
 *
 * <p>GetResourceGroupResponseBody</p>
 */
public class GetResourceGroupResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("ResourceGroup")
    private ResourceGroup resourceGroup;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private GetResourceGroupResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.resourceGroup = builder.resourceGroup;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetResourceGroupResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return resourceGroup
     */
    public ResourceGroup getResourceGroup() {
        return this.resourceGroup;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String requestId; 
        private ResourceGroup resourceGroup; 
        private Boolean success; 

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The details about the resource group.</p>
         */
        public Builder resourceGroup(ResourceGroup resourceGroup) {
            this.resourceGroup = resourceGroup;
            return this;
        }

        /**
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public GetResourceGroupResponseBody build() {
            return new GetResourceGroupResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetResourceGroupResponseBody} extends {@link TeaModel}
     *
     * <p>GetResourceGroupResponseBody</p>
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

            public AliyunResourceTags build() {
                return new AliyunResourceTags(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetResourceGroupResponseBody} extends {@link TeaModel}
     *
     * <p>GetResourceGroupResponseBody</p>
     */
    public static class Spec extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Amount")
        private Integer amount;

        @com.aliyun.core.annotation.NameInMap("Standard")
        private String standard;

        private Spec(Builder builder) {
            this.amount = builder.amount;
            this.standard = builder.standard;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Spec create() {
            return builder().build();
        }

        /**
         * @return amount
         */
        public Integer getAmount() {
            return this.amount;
        }

        /**
         * @return standard
         */
        public String getStandard() {
            return this.standard;
        }

        public static final class Builder {
            private Integer amount; 
            private String standard; 

            /**
             * <p>The number of resources in the resource group.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder amount(Integer amount) {
                this.amount = amount;
                return this;
            }

            /**
             * Standard.
             */
            public Builder standard(String standard) {
                this.standard = standard;
                return this;
            }

            public Spec build() {
                return new Spec(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetResourceGroupResponseBody} extends {@link TeaModel}
     *
     * <p>GetResourceGroupResponseBody</p>
     */
    public static class ResourceGroup extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AliyunResourceGroupId")
        private String aliyunResourceGroupId;

        @com.aliyun.core.annotation.NameInMap("AliyunResourceTags")
        private java.util.List<AliyunResourceTags> aliyunResourceTags;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private Long createTime;

        @com.aliyun.core.annotation.NameInMap("CreateUser")
        private String createUser;

        @com.aliyun.core.annotation.NameInMap("DefaultVpcId")
        private String defaultVpcId;

        @com.aliyun.core.annotation.NameInMap("DefaultVswitchId")
        private String defaultVswitchId;

        @com.aliyun.core.annotation.NameInMap("Id")
        private String id;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("OrderInstanceId")
        private String orderInstanceId;

        @com.aliyun.core.annotation.NameInMap("PaymentType")
        private String paymentType;

        @com.aliyun.core.annotation.NameInMap("Remark")
        private String remark;

        @com.aliyun.core.annotation.NameInMap("ResourceGroupType")
        private String resourceGroupType;

        @com.aliyun.core.annotation.NameInMap("Spec")
        private Spec spec;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        private ResourceGroup(Builder builder) {
            this.aliyunResourceGroupId = builder.aliyunResourceGroupId;
            this.aliyunResourceTags = builder.aliyunResourceTags;
            this.createTime = builder.createTime;
            this.createUser = builder.createUser;
            this.defaultVpcId = builder.defaultVpcId;
            this.defaultVswitchId = builder.defaultVswitchId;
            this.id = builder.id;
            this.name = builder.name;
            this.orderInstanceId = builder.orderInstanceId;
            this.paymentType = builder.paymentType;
            this.remark = builder.remark;
            this.resourceGroupType = builder.resourceGroupType;
            this.spec = builder.spec;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ResourceGroup create() {
            return builder().build();
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
         * @return createTime
         */
        public Long getCreateTime() {
            return this.createTime;
        }

        /**
         * @return createUser
         */
        public String getCreateUser() {
            return this.createUser;
        }

        /**
         * @return defaultVpcId
         */
        public String getDefaultVpcId() {
            return this.defaultVpcId;
        }

        /**
         * @return defaultVswitchId
         */
        public String getDefaultVswitchId() {
            return this.defaultVswitchId;
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return orderInstanceId
         */
        public String getOrderInstanceId() {
            return this.orderInstanceId;
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
         * @return resourceGroupType
         */
        public String getResourceGroupType() {
            return this.resourceGroupType;
        }

        /**
         * @return spec
         */
        public Spec getSpec() {
            return this.spec;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private String aliyunResourceGroupId; 
            private java.util.List<AliyunResourceTags> aliyunResourceTags; 
            private Long createTime; 
            private String createUser; 
            private String defaultVpcId; 
            private String defaultVswitchId; 
            private String id; 
            private String name; 
            private String orderInstanceId; 
            private String paymentType; 
            private String remark; 
            private String resourceGroupType; 
            private Spec spec; 
            private String status; 

            /**
             * AliyunResourceGroupId.
             */
            public Builder aliyunResourceGroupId(String aliyunResourceGroupId) {
                this.aliyunResourceGroupId = aliyunResourceGroupId;
                return this;
            }

            /**
             * AliyunResourceTags.
             */
            public Builder aliyunResourceTags(java.util.List<AliyunResourceTags> aliyunResourceTags) {
                this.aliyunResourceTags = aliyunResourceTags;
                return this;
            }

            /**
             * CreateTime.
             */
            public Builder createTime(Long createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * CreateUser.
             */
            public Builder createUser(String createUser) {
                this.createUser = createUser;
                return this;
            }

            /**
             * DefaultVpcId.
             */
            public Builder defaultVpcId(String defaultVpcId) {
                this.defaultVpcId = defaultVpcId;
                return this;
            }

            /**
             * DefaultVswitchId.
             */
            public Builder defaultVswitchId(String defaultVswitchId) {
                this.defaultVswitchId = defaultVswitchId;
                return this;
            }

            /**
             * Id.
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * OrderInstanceId.
             */
            public Builder orderInstanceId(String orderInstanceId) {
                this.orderInstanceId = orderInstanceId;
                return this;
            }

            /**
             * PaymentType.
             */
            public Builder paymentType(String paymentType) {
                this.paymentType = paymentType;
                return this;
            }

            /**
             * Remark.
             */
            public Builder remark(String remark) {
                this.remark = remark;
                return this;
            }

            /**
             * <p>The type the resource group. Valid values:</p>
             * <ul>
             * <li>CommonV2: serverless resource group</li>
             * <li>ExclusiveDataIntegration: exclusive resource group for Data Integration</li>
             * <li>ExclusiveScheduler: exclusive resource group for scheduling</li>
             * <li>ExclusiveDataService: exclusive resource group for DataService Studio</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>CommonV2</p>
             */
            public Builder resourceGroupType(String resourceGroupType) {
                this.resourceGroupType = resourceGroupType;
                return this;
            }

            /**
             * <p>The specifications of the resource group.</p>
             */
            public Builder spec(Spec spec) {
                this.spec = spec;
                return this;
            }

            /**
             * <p>The status of the resource group. Valid values:</p>
             * <ul>
             * <li>Normal: The resource group is running or in use.</li>
             * <li>Stop: The resource group is expired.</li>
             * <li>Deleted: The resource group is released or destroyed.</li>
             * <li>Creating: The resource group is being started.</li>
             * <li>CreateFailed: The resource group fails to be started.</li>
             * <li>Updating: The resource group is being scaled in or out, or the configurations of the resource group are being changed.</li>
             * <li>UpdateFailed: The resource group fails to be scaled out or upgraded.</li>
             * <li>Deleting: The resource group is being released or destroyed.</li>
             * <li>DeleteFailed: The resource group fails to be released or destroyed.</li>
             * <li>Timeout: The operations that are performed on the resource group time out.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Normal</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public ResourceGroup build() {
                return new ResourceGroup(this);
            } 

        } 

    }
}
