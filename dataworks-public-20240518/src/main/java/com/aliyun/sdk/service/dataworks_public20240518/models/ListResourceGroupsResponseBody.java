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
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * ResourceGroupList.
         */
        public Builder resourceGroupList(java.util.List < ResourceGroupList> resourceGroupList) {
            this.resourceGroupList = resourceGroupList;
            return this;
        }

        /**
         * Success.
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
             * Amount.
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
             * DefaultVswicthId.
             */
            public Builder defaultVswicthId(String defaultVswicthId) {
                this.defaultVswicthId = defaultVswicthId;
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
             * ResourceGroupType.
             */
            public Builder resourceGroupType(String resourceGroupType) {
                this.resourceGroupType = resourceGroupType;
                return this;
            }

            /**
             * Spec.
             */
            public Builder spec(Spec spec) {
                this.spec = spec;
                return this;
            }

            /**
             * Status.
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
