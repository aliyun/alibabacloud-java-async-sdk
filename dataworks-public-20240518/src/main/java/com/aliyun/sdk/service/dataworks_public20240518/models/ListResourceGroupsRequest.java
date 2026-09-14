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
 * {@link ListResourceGroupsRequest} extends {@link RequestModel}
 *
 * <p>ListResourceGroupsRequest</p>
 */
public class ListResourceGroupsRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AliyunResourceGroupId")
    private String aliyunResourceGroupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AliyunResourceTags")
    private java.util.List<AliyunResourceTags> aliyunResourceTags;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Name")
    private String name;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PaymentType")
    private String paymentType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ProjectId")
    private Long projectId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceGroupTypes")
    private java.util.List<String> resourceGroupTypes;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SortBy")
    private String sortBy;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Statuses")
    private java.util.List<String> statuses;

    private ListResourceGroupsRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.aliyunResourceGroupId = builder.aliyunResourceGroupId;
        this.aliyunResourceTags = builder.aliyunResourceTags;
        this.name = builder.name;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.paymentType = builder.paymentType;
        this.projectId = builder.projectId;
        this.resourceGroupTypes = builder.resourceGroupTypes;
        this.sortBy = builder.sortBy;
        this.statuses = builder.statuses;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListResourceGroupsRequest create() {
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
     * @return name
     */
    public String getName() {
        return this.name;
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
     * @return paymentType
     */
    public String getPaymentType() {
        return this.paymentType;
    }

    /**
     * @return projectId
     */
    public Long getProjectId() {
        return this.projectId;
    }

    /**
     * @return resourceGroupTypes
     */
    public java.util.List<String> getResourceGroupTypes() {
        return this.resourceGroupTypes;
    }

    /**
     * @return sortBy
     */
    public String getSortBy() {
        return this.sortBy;
    }

    /**
     * @return statuses
     */
    public java.util.List<String> getStatuses() {
        return this.statuses;
    }

    public static final class Builder extends Request.Builder<ListResourceGroupsRequest, Builder> {
        private String regionId; 
        private String aliyunResourceGroupId; 
        private java.util.List<AliyunResourceTags> aliyunResourceTags; 
        private String name; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String paymentType; 
        private Long projectId; 
        private java.util.List<String> resourceGroupTypes; 
        private String sortBy; 
        private java.util.List<String> statuses; 

        private Builder() {
            super();
        } 

        private Builder(ListResourceGroupsRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.aliyunResourceGroupId = request.aliyunResourceGroupId;
            this.aliyunResourceTags = request.aliyunResourceTags;
            this.name = request.name;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.paymentType = request.paymentType;
            this.projectId = request.projectId;
            this.resourceGroupTypes = request.resourceGroupTypes;
            this.sortBy = request.sortBy;
            this.statuses = request.statuses;
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
         * <p>The Alibaba Cloud resource group ID.</p>
         * 
         * <strong>example:</strong>
         * <p>rg-aek2kqofrgXXXXX</p>
         */
        public Builder aliyunResourceGroupId(String aliyunResourceGroupId) {
            this.putQueryParameter("AliyunResourceGroupId", aliyunResourceGroupId);
            this.aliyunResourceGroupId = aliyunResourceGroupId;
            return this;
        }

        /**
         * <p>The list of Alibaba Cloud tags.</p>
         */
        public Builder aliyunResourceTags(java.util.List<AliyunResourceTags> aliyunResourceTags) {
            String aliyunResourceTagsShrink = shrink(aliyunResourceTags, "AliyunResourceTags", "json");
            this.putQueryParameter("AliyunResourceTags", aliyunResourceTagsShrink);
            this.aliyunResourceTags = aliyunResourceTags;
            return this;
        }

        /**
         * <p>The name of the resource group. Fuzzy search is supported.</p>
         * 
         * <strong>example:</strong>
         * <p>Resource</p>
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * <p>The page number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Integer pageNumber) {
            this.putQueryParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The page size.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The billing method of the resource group. Valid values include:</p>
         * <ul>
         * <li><p><code>PrePaid</code>: subscription.</p>
         * </li>
         * <li><p><code>PostPaid</code>: pay-as-you-go.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>PrePaid</p>
         */
        public Builder paymentType(String paymentType) {
            this.putQueryParameter("PaymentType", paymentType);
            this.paymentType = paymentType;
            return this;
        }

        /**
         * <p>The ID of the workspace.</p>
         * 
         * <strong>example:</strong>
         * <p>1000</p>
         */
        public Builder projectId(Long projectId) {
            this.putQueryParameter("ProjectId", projectId);
            this.projectId = projectId;
            return this;
        }

        /**
         * <p>The types of the resource groups to query. <strong>If this parameter is not specified, general-purpose resource groups are queried by default.</strong></p>
         */
        public Builder resourceGroupTypes(java.util.List<String> resourceGroupTypes) {
            String resourceGroupTypesShrink = shrink(resourceGroupTypes, "ResourceGroupTypes", "json");
            this.putQueryParameter("ResourceGroupTypes", resourceGroupTypesShrink);
            this.resourceGroupTypes = resourceGroupTypes;
            return this;
        }

        /**
         * <p>The sorting criterion for the results. The format is <code>FieldName SortOrder</code>. <code>SortOrder</code> can be <code>Asc</code> (ascending) or <code>Desc</code> (descending). If you do not specify <code>SortOrder</code>, the default is <code>Asc</code>. The following fields are supported:</p>
         * <ul>
         * <li><p><code>Id</code>: Resource group ID</p>
         * </li>
         * <li><p><code>Name</code>: Resource group name</p>
         * </li>
         * <li><p><code>Remark</code>: Resource group remarks</p>
         * </li>
         * <li><p><code>Type</code>: Resource group type</p>
         * </li>
         * <li><p><code>Status</code>: Resource group status</p>
         * </li>
         * <li><p><code>Spec</code>: Resource group specifications</p>
         * </li>
         * <li><p><code>CreateUser</code>: The user who created the resource group</p>
         * </li>
         * <li><p><code>CreateTime</code>: The time when the resource group was created</p>
         * </li>
         * </ul>
         * <p>Default value: <code>CreateTime Asc</code></p>
         * 
         * <strong>example:</strong>
         * <p>CreateTime Asc</p>
         */
        public Builder sortBy(String sortBy) {
            this.putQueryParameter("SortBy", sortBy);
            this.sortBy = sortBy;
            return this;
        }

        /**
         * <p>The statuses of the resource groups to query.</p>
         */
        public Builder statuses(java.util.List<String> statuses) {
            String statusesShrink = shrink(statuses, "Statuses", "json");
            this.putQueryParameter("Statuses", statusesShrink);
            this.statuses = statuses;
            return this;
        }

        @Override
        public ListResourceGroupsRequest build() {
            return new ListResourceGroupsRequest(this);
        } 

    } 

    /**
     * 
     * {@link ListResourceGroupsRequest} extends {@link TeaModel}
     *
     * <p>ListResourceGroupsRequest</p>
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
