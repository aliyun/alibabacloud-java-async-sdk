// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20240518.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ListResourceGroupsResponseBody} extends {@link TeaModel}
 *
 * <p>ListResourceGroupsResponseBody</p>
 */
public class ListResourceGroupsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("ResourceGroupList")
    private java.util.List < ResourceGroupList> resourceGroupList;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private ListResourceGroupsResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.resourceGroupList = builder.resourceGroupList;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListResourceGroupsResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return resourceGroupList
     */
    public java.util.List < ResourceGroupList> getResourceGroupList() {
        return this.resourceGroupList;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String requestId; 
        private java.util.List < ResourceGroupList> resourceGroupList; 
        private Boolean success; 

        /**
         * <p>The request ID. You can use the ID to query logs and troubleshoot issues.</p>
         * 
         * <strong>example:</strong>
         * <p>6A6CBE87-9F91-1323-B680-E7A7065XXXXX</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The resource groups returned.</p>
         */
        public Builder resourceGroupList(java.util.List < ResourceGroupList> resourceGroupList) {
            this.resourceGroupList = resourceGroupList;
            return this;
        }

        /**
         * <p>Indicates whether the request was successful. Valid values: true and false.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public ListResourceGroupsResponseBody build() {
            return new ListResourceGroupsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListResourceGroupsResponseBody} extends {@link TeaModel}
     *
     * <p>ListResourceGroupsResponseBody</p>
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
             * <p>The details about the specifications.</p>
             * 
             * <strong>example:</strong>
             * <p>2CU</p>
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
     * {@link ListResourceGroupsResponseBody} extends {@link TeaModel}
     *
     * <p>ListResourceGroupsResponseBody</p>
     */
    public static class ResourceGroupList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private Long createTime;

        @com.aliyun.core.annotation.NameInMap("CreateUser")
        private String createUser;

        @com.aliyun.core.annotation.NameInMap("DefaultVpcId")
        private String defaultVpcId;

        @com.aliyun.core.annotation.NameInMap("DefaultVswicthId")
        private String defaultVswicthId;

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

        private ResourceGroupList(Builder builder) {
            this.createTime = builder.createTime;
            this.createUser = builder.createUser;
            this.defaultVpcId = builder.defaultVpcId;
            this.defaultVswicthId = builder.defaultVswicthId;
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

        public static ResourceGroupList create() {
            return builder().build();
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
         * @return defaultVswicthId
         */
        public String getDefaultVswicthId() {
            return this.defaultVswicthId;
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
            private Long createTime; 
            private String createUser; 
            private String defaultVpcId; 
            private String defaultVswicthId; 
            private String id; 
            private String name; 
            private String orderInstanceId; 
            private String paymentType; 
            private String remark; 
            private String resourceGroupType; 
            private Spec spec; 
            private String status; 

            /**
             * <p>The time when the resource group was created. The value is a 64-bit timestamp.</p>
             * 
             * <strong>example:</strong>
             * <p>1727055811000</p>
             */
            public Builder createTime(Long createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The ID of the account that is used to create the resource group.</p>
             * 
             * <strong>example:</strong>
             * <p>11075500042XXXXX</p>
             */
            public Builder createUser(String createUser) {
                this.createUser = createUser;
                return this;
            }

            /**
             * <p>The ID of the virtual private cloud (VPC) with which the resource group is associated by default.</p>
             * 
             * <strong>example:</strong>
             * <p>vpc-m2et4f3oc8msfbccXXXXX</p>
             */
            public Builder defaultVpcId(String defaultVpcId) {
                this.defaultVpcId = defaultVpcId;
                return this;
            }

            /**
             * <p>The ID of the vSwitch with which the resource group is associated by default.</p>
             * 
             * <strong>example:</strong>
             * <p>vsw-uf8usrhs7hjd9amsXXXXX</p>
             */
            public Builder defaultVswicthId(String defaultVswicthId) {
                this.defaultVswicthId = defaultVswicthId;
                return this;
            }

            /**
             * <p>The ID of the resource group.</p>
             * 
             * <strong>example:</strong>
             * <p>Serverless_res_group_524257424564736_6831777003XXXXX</p>
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * <p>The name of the resource group.</p>
             * 
             * <strong>example:</strong>
             * <p>common_resource_group</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The instance ID of the order that is used to create the resource group.</p>
             * 
             * <strong>example:</strong>
             * <p>c442b330-3b10-4584-959e-736e4edXXXXX</p>
             */
            public Builder orderInstanceId(String orderInstanceId) {
                this.orderInstanceId = orderInstanceId;
                return this;
            }

            /**
             * <p>The billing method of the resource group. Valid values: PrePaid and PostPaid. The value PrePaid indicates the subscription billing method, and the value PostPaid indicates the pay-as-you-go billing method.</p>
             * 
             * <strong>example:</strong>
             * <p>PrePaid</p>
             */
            public Builder paymentType(String paymentType) {
                this.paymentType = paymentType;
                return this;
            }

            /**
             * <p>The description of the resource group.</p>
             * 
             * <strong>example:</strong>
             * <p>创建用于普通任务的通用资源组</p>
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

            public ResourceGroupList build() {
                return new ResourceGroupList(this);
            } 

        } 

    }
}
