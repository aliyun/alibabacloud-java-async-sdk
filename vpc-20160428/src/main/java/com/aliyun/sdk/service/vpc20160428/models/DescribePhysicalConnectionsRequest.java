// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vpc20160428.models;

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
 * {@link DescribePhysicalConnectionsRequest} extends {@link RequestModel}
 *
 * <p>DescribePhysicalConnectionsRequest</p>
 */
public class DescribePhysicalConnectionsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    private String clientToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Filter")
    private java.util.List<Filter> filter;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IncludeReservationData")
    private Boolean includeReservationData;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerAccount")
    private String ownerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    @com.aliyun.core.annotation.Validation(maximum = 50, minimum = 1)
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
    private String resourceGroupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Tags")
    private java.util.List<Tags> tags;

    private DescribePhysicalConnectionsRequest(Builder builder) {
        super(builder);
        this.clientToken = builder.clientToken;
        this.filter = builder.filter;
        this.includeReservationData = builder.includeReservationData;
        this.ownerAccount = builder.ownerAccount;
        this.ownerId = builder.ownerId;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.regionId = builder.regionId;
        this.resourceGroupId = builder.resourceGroupId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.tags = builder.tags;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribePhysicalConnectionsRequest create() {
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
     * @return filter
     */
    public java.util.List<Filter> getFilter() {
        return this.filter;
    }

    /**
     * @return includeReservationData
     */
    public Boolean getIncludeReservationData() {
        return this.includeReservationData;
    }

    /**
     * @return ownerAccount
     */
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    /**
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
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
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return resourceGroupId
     */
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    /**
     * @return resourceOwnerAccount
     */
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    /**
     * @return resourceOwnerId
     */
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    /**
     * @return tags
     */
    public java.util.List<Tags> getTags() {
        return this.tags;
    }

    public static final class Builder extends Request.Builder<DescribePhysicalConnectionsRequest, Builder> {
        private String clientToken; 
        private java.util.List<Filter> filter; 
        private Boolean includeReservationData; 
        private String ownerAccount; 
        private Long ownerId; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String regionId; 
        private String resourceGroupId; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private java.util.List<Tags> tags; 

        private Builder() {
            super();
        } 

        private Builder(DescribePhysicalConnectionsRequest request) {
            super(request);
            this.clientToken = request.clientToken;
            this.filter = request.filter;
            this.includeReservationData = request.includeReservationData;
            this.ownerAccount = request.ownerAccount;
            this.ownerId = request.ownerId;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.regionId = request.regionId;
            this.resourceGroupId = request.resourceGroupId;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
            this.tags = request.tags;
        } 

        /**
         * <p>The client token that is used to ensure the idempotence of the request.</p>
         * <p>Generate a parameter value from your client to ensure uniqueness across different requests. ClientToken supports only ASCII characters.</p>
         * 
         * <strong>example:</strong>
         * <p>02fb3da4-130e-11e9-8e44-001</p>
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * <p>The list of filter conditions.</p>
         */
        public Builder filter(java.util.List<Filter> filter) {
            this.putQueryParameter("Filter", filter);
            this.filter = filter;
            return this;
        }

        /**
         * <p>Specifies whether to return order data that has not taken effect. Valid values:</p>
         * <ul>
         * <li><p><strong>true</strong>: Returns order data that has not taken effect.</p>
         * </li>
         * <li><p><strong>false</strong> (default): Does not return order data that has not taken effect.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder includeReservationData(Boolean includeReservationData) {
            this.putQueryParameter("IncludeReservationData", includeReservationData);
            this.includeReservationData = includeReservationData;
            return this;
        }

        /**
         * OwnerAccount.
         */
        public Builder ownerAccount(String ownerAccount) {
            this.putQueryParameter("OwnerAccount", ownerAccount);
            this.ownerAccount = ownerAccount;
            return this;
        }

        /**
         * OwnerId.
         */
        public Builder ownerId(Long ownerId) {
            this.putQueryParameter("OwnerId", ownerId);
            this.ownerId = ownerId;
            return this;
        }

        /**
         * <p>The page number of the list. Default value: <strong>1</strong>.</p>
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
         * <p>The number of entries per page in a paged query. Default value: <strong>10</strong>. Valid values: <strong>1</strong> to <strong>50</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The region ID of the Express Connect circuit. </p>
         * <p>You can call the <a href="https://help.aliyun.com/document_detail/36063.html">DescribeRegions</a> operation to query the region ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The ID of the resource group to which the Express Connect circuit belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>rg-aek2yvwibxr****</p>
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.putQueryParameter("ResourceGroupId", resourceGroupId);
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        /**
         * ResourceOwnerAccount.
         */
        public Builder resourceOwnerAccount(String resourceOwnerAccount) {
            this.putQueryParameter("ResourceOwnerAccount", resourceOwnerAccount);
            this.resourceOwnerAccount = resourceOwnerAccount;
            return this;
        }

        /**
         * ResourceOwnerId.
         */
        public Builder resourceOwnerId(Long resourceOwnerId) {
            this.putQueryParameter("ResourceOwnerId", resourceOwnerId);
            this.resourceOwnerId = resourceOwnerId;
            return this;
        }

        /**
         * <p>The list of tags.</p>
         */
        public Builder tags(java.util.List<Tags> tags) {
            this.putQueryParameter("Tags", tags);
            this.tags = tags;
            return this;
        }

        @Override
        public DescribePhysicalConnectionsRequest build() {
            return new DescribePhysicalConnectionsRequest(this);
        } 

    } 

    /**
     * 
     * {@link DescribePhysicalConnectionsRequest} extends {@link TeaModel}
     *
     * <p>DescribePhysicalConnectionsRequest</p>
     */
    public static class Filter extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Key")
        private String key;

        @com.aliyun.core.annotation.NameInMap("Value")
        private java.util.List<String> value;

        private Filter(Builder builder) {
            this.key = builder.key;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Filter create() {
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
        public java.util.List<String> getValue() {
            return this.value;
        }

        public static final class Builder {
            private String key; 
            private java.util.List<String> value; 

            private Builder() {
            } 

            private Builder(Filter model) {
                this.key = model.key;
                this.value = model.value;
            } 

            /**
             * <p>The filter condition. Valid values:</p>
             * <ul>
             * <li><p><strong>PhysicalConnectionId</strong>: the ID of the Express Connect circuit.</p>
             * </li>
             * <li><p><strong>AccessPointId</strong>: the ID of the access point.</p>
             * </li>
             * <li><p><strong>Type</strong>: the type of the Express Connect circuit. This filter condition supports only the filter value <strong>VPC</strong>.</p>
             * </li>
             * <li><p><strong>LineOperator</strong>: the carrier of the Express Connect circuit. This filter condition supports the following filter values:</p>
             * <ul>
             * <li><strong>CT</strong>: China Telecom.</li>
             * <li><strong>CU</strong>: China Unicom.</li>
             * <li><strong>CM</strong>: China shift.</li>
             * <li><strong>CO</strong>: Other carriers in the Chinese mainland. </li>
             * <li><strong>Equinix</strong>: Equinix.</li>
             * <li><strong>Other</strong>: Other carriers outside the Chinese mainland.</li>
             * </ul>
             * </li>
             * <li><p><strong>Spec</strong>: the specification of the Express Connect circuit. This filter condition supports the following filter values:</p>
             * <ul>
             * <li><strong>1G and below</strong>.</li>
             * <li><strong>10G</strong>.</li>
             * <li><strong>40G</strong>.</li>
             * <li><strong>100G</strong>.<blockquote>
             * <p> The <strong>40G</strong> and <strong>100G</strong> specifications are not available by default. Only users who have submitted an application to their account manager and received approval can use these filter values.</p>
             * </blockquote>
             * </li>
             * </ul>
             * </li>
             * <li><p><strong>Status</strong>: the status of the Express Connect circuit. This filter condition supports the following filter values:</p>
             * <ul>
             * <li><strong>Initial</strong>: pending application.</li>
             * <li><strong>Approved</strong>: approved.</li>
             * <li><strong>Allocating</strong>: allocating resources.</li>
             * <li><strong>Allocated</strong>: under construction.   </li>
             * <li><strong>Confirmed</strong>: pending user confirmation.   </li>
             * <li><strong>Enabled</strong>: enabled.</li>
             * <li><strong>Rejected</strong>: application rejected.</li>
             * <li><strong>Canceled</strong>: canceled.</li>
             * <li><strong>Allocation Failed</strong>: resource allocation failed.</li>
             * <li><strong>Terminating</strong>: stopping.</li>
             * <li><strong>Terminated</strong>: stopped.</li>
             * </ul>
             * </li>
             * <li><p><strong>Name</strong>: the name of the Express Connect circuit.</p>
             * </li>
             * <li><p><strong>ProductType</strong>: the type of the Express Connect circuit. Valid values:</p>
             * <ul>
             * <li><strong>VirtualPhysicalConnection</strong>: shared Express Connect circuit.</li>
             * <li><strong>PhysicalConnection</strong>: dedicated Express Connect circuit.</li>
             * </ul>
             * </li>
             * </ul>
             * <p>You can specify up to 5 filter conditions at a time. The filter conditions have an <strong>AND</strong> relationship. Results are returned only when all filter conditions are met.</p>
             * 
             * <strong>example:</strong>
             * <p>Name</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>The list of filter values.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder value(java.util.List<String> value) {
                this.value = value;
                return this;
            }

            public Filter build() {
                return new Filter(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribePhysicalConnectionsRequest} extends {@link TeaModel}
     *
     * <p>DescribePhysicalConnectionsRequest</p>
     */
    public static class Tags extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Key")
        private String key;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private Tags(Builder builder) {
            this.key = builder.key;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Tags create() {
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

            private Builder(Tags model) {
                this.key = model.key;
                this.value = model.value;
            } 

            /**
             * <p>The tag key of the resource. You can specify up to 20 tag keys. The tag key cannot be an empty string.</p>
             * <p>The tag key can be up to 64 characters in length and can contain digits, periods (.), underscores (_), and hyphens (-). It cannot start with <code>aliyun</code> or <code>acs:</code>, and cannot contain <code>http://</code> or <code>https://</code>.</p>
             * 
             * <strong>example:</strong>
             * <p>FinanceDept</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>The tag value of the resource. You can specify up to 20 tag values. The tag value can be an empty string.</p>
             * <p>The tag value can be up to 128 characters in length and can contain digits, periods (.), underscores (_), and hyphens (-). It cannot start with <code>aliyun</code> or <code>acs:</code>, and cannot contain <code>http://</code> or <code>https://</code>.</p>
             * 
             * <strong>example:</strong>
             * <p>FinanceJoshua</p>
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public Tags build() {
                return new Tags(this);
            } 

        } 

    }
}
