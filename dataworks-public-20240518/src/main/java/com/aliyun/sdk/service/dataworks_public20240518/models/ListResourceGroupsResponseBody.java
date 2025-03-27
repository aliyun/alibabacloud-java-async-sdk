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
 * {@link ListResourceGroupsResponseBody} extends {@link TeaModel}
 *
 * <p>ListResourceGroupsResponseBody</p>
 */
public class ListResourceGroupsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("PagingInfo")
    private PagingInfo pagingInfo;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private ListResourceGroupsResponseBody(Builder builder) {
        this.pagingInfo = builder.pagingInfo;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListResourceGroupsResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return pagingInfo
     */
    public PagingInfo getPagingInfo() {
        return this.pagingInfo;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private PagingInfo pagingInfo; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(ListResourceGroupsResponseBody model) {
            this.pagingInfo = model.pagingInfo;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * <p>The pagination information.</p>
         */
        public Builder pagingInfo(PagingInfo pagingInfo) {
            this.pagingInfo = pagingInfo;
            return this;
        }

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
             * <p>Tag Key</p>
             * 
             * <strong>example:</strong>
             * <p>Key</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>Tag Value</p>
             * 
             * <strong>example:</strong>
             * <p>Value</p>
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

            private Builder() {
            } 

            private Builder(Spec model) {
                this.amount = model.amount;
                this.standard = model.standard;
            } 

            /**
             * <p>Quantity</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder amount(Integer amount) {
                this.amount = amount;
                return this;
            }

            /**
             * <p>Specification details</p>
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
            this.aliyunResourceGroupId = builder.aliyunResourceGroupId;
            this.aliyunResourceTags = builder.aliyunResourceTags;
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
            private String aliyunResourceGroupId; 
            private java.util.List<AliyunResourceTags> aliyunResourceTags; 
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

            private Builder() {
            } 

            private Builder(ResourceGroupList model) {
                this.aliyunResourceGroupId = model.aliyunResourceGroupId;
                this.aliyunResourceTags = model.aliyunResourceTags;
                this.createTime = model.createTime;
                this.createUser = model.createUser;
                this.defaultVpcId = model.defaultVpcId;
                this.defaultVswicthId = model.defaultVswicthId;
                this.id = model.id;
                this.name = model.name;
                this.orderInstanceId = model.orderInstanceId;
                this.paymentType = model.paymentType;
                this.remark = model.remark;
                this.resourceGroupType = model.resourceGroupType;
                this.spec = model.spec;
                this.status = model.status;
            } 

            /**
             * <p>Alibaba Cloud Resource Group ID</p>
             * 
             * <strong>example:</strong>
             * <p>rg-aek2kqofrgXXXXX</p>
             */
            public Builder aliyunResourceGroupId(String aliyunResourceGroupId) {
                this.aliyunResourceGroupId = aliyunResourceGroupId;
                return this;
            }

            /**
             * <p>Alibaba Cloud tag list</p>
             */
            public Builder aliyunResourceTags(java.util.List<AliyunResourceTags> aliyunResourceTags) {
                this.aliyunResourceTags = aliyunResourceTags;
                return this;
            }

            /**
             * <p>The creation time, which is a 64-bit timestamp.</p>
             * 
             * <strong>example:</strong>
             * <p>1727055811000</p>
             */
            public Builder createTime(Long createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The ID of the user who created the resource group.</p>
             * 
             * <strong>example:</strong>
             * <p>11075500042XXXXX</p>
             */
            public Builder createUser(String createUser) {
                this.createUser = createUser;
                return this;
            }

            /**
             * <p>Default VPC ID bound to a common resource group</p>
             * 
             * <strong>example:</strong>
             * <p>vpc-m2et4f3oc8msfbccXXXXX</p>
             */
            public Builder defaultVpcId(String defaultVpcId) {
                this.defaultVpcId = defaultVpcId;
                return this;
            }

            /**
             * <p>The default switch ID bound to the common resource group.</p>
             * 
             * <strong>example:</strong>
             * <p>vsw-uf8usrhs7hjd9amsXXXXX</p>
             */
            public Builder defaultVswicthId(String defaultVswicthId) {
                this.defaultVswicthId = defaultVswicthId;
                return this;
            }

            /**
             * <p>Unique identifier of a resource group</p>
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
             * <p>The order instance ID of the resource group.</p>
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
             * <p>Remarks for resource groups</p>
             * 
             * <strong>example:</strong>
             * <p>Create a common resource group for common tasks</p>
             */
            public Builder remark(String remark) {
                this.remark = remark;
                return this;
            }

            /**
             * <p>The type of the resource group. Valid values:</p>
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
             * <p>Resource Group specifications</p>
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
             * <li>Creating: The resource group is being created.</li>
             * <li>CreateFailed: The resource group fails to be created.</li>
             * <li>Updating: The resource group is being scaled in or out, or the configurations of the resource group are being changed.</li>
             * <li>UpdateFailed: The resource group fails to be scaled out or upgraded.</li>
             * <li>Deleting: The resource group is being released or destroyed.</li>
             * <li>DeleteFailed: The resource group fails to be released or destroyed.</li>
             * <li>Timeout: The operations that are performed on the resource group time out.</li>
             * <li>Freezed: The resource group is frozen.</li>
             * <li>Starting: The resource group is being started.</li>
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
    /**
     * 
     * {@link ListResourceGroupsResponseBody} extends {@link TeaModel}
     *
     * <p>ListResourceGroupsResponseBody</p>
     */
    public static class PagingInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("PageNumber")
        private Integer pageNumber;

        @com.aliyun.core.annotation.NameInMap("PageSize")
        private Integer pageSize;

        @com.aliyun.core.annotation.NameInMap("ResourceGroupList")
        private java.util.List<ResourceGroupList> resourceGroupList;

        @com.aliyun.core.annotation.NameInMap("TotalCount")
        private Integer totalCount;

        private PagingInfo(Builder builder) {
            this.pageNumber = builder.pageNumber;
            this.pageSize = builder.pageSize;
            this.resourceGroupList = builder.resourceGroupList;
            this.totalCount = builder.totalCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PagingInfo create() {
            return builder().build();
        }

        /**
         * @return pageNumber
         */
        public Integer getPageNumber() {
            return this.pageNumber;
        }

        /**
         * @return pageSize
         */
        public Integer getPageSize() {
            return this.pageSize;
        }

        /**
         * @return resourceGroupList
         */
        public java.util.List<ResourceGroupList> getResourceGroupList() {
            return this.resourceGroupList;
        }

        /**
         * @return totalCount
         */
        public Integer getTotalCount() {
            return this.totalCount;
        }

        public static final class Builder {
            private Integer pageNumber; 
            private Integer pageSize; 
            private java.util.List<ResourceGroupList> resourceGroupList; 
            private Integer totalCount; 

            private Builder() {
            } 

            private Builder(PagingInfo model) {
                this.pageNumber = model.pageNumber;
                this.pageSize = model.pageSize;
                this.resourceGroupList = model.resourceGroupList;
                this.totalCount = model.totalCount;
            } 

            /**
             * <p>The page number.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder pageNumber(Integer pageNumber) {
                this.pageNumber = pageNumber;
                return this;
            }

            /**
             * <p>The number of entries per page.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder pageSize(Integer pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            /**
             * <p>The resource groups returned.</p>
             */
            public Builder resourceGroupList(java.util.List<ResourceGroupList> resourceGroupList) {
                this.resourceGroupList = resourceGroupList;
                return this;
            }

            /**
             * <p>All data entries</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder totalCount(Integer totalCount) {
                this.totalCount = totalCount;
                return this;
            }

            public PagingInfo build() {
                return new PagingInfo(this);
            } 

        } 

    }
}
