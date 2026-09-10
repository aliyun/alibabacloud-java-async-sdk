// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.polardb20170801.models;

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
 * {@link DescribeAIDBClustersRequest} extends {@link RequestModel}
 *
 * <p>DescribeAIDBClustersRequest</p>
 */
public class DescribeAIDBClustersRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AiNodeType")
    private String aiNodeType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DBClusterDescription")
    private String DBClusterDescription;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DBClusterIds")
    private String DBClusterIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DBClusterStatus")
    private String DBClusterStatus;

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
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PayType")
    private String payType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Tag")
    private java.util.List<Tag> tag;

    private DescribeAIDBClustersRequest(Builder builder) {
        super(builder);
        this.aiNodeType = builder.aiNodeType;
        this.DBClusterDescription = builder.DBClusterDescription;
        this.DBClusterIds = builder.DBClusterIds;
        this.DBClusterStatus = builder.DBClusterStatus;
        this.ownerAccount = builder.ownerAccount;
        this.ownerId = builder.ownerId;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.payType = builder.payType;
        this.regionId = builder.regionId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.tag = builder.tag;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeAIDBClustersRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return aiNodeType
     */
    public String getAiNodeType() {
        return this.aiNodeType;
    }

    /**
     * @return DBClusterDescription
     */
    public String getDBClusterDescription() {
        return this.DBClusterDescription;
    }

    /**
     * @return DBClusterIds
     */
    public String getDBClusterIds() {
        return this.DBClusterIds;
    }

    /**
     * @return DBClusterStatus
     */
    public String getDBClusterStatus() {
        return this.DBClusterStatus;
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
     * @return payType
     */
    public String getPayType() {
        return this.payType;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
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
     * @return tag
     */
    public java.util.List<Tag> getTag() {
        return this.tag;
    }

    public static final class Builder extends Request.Builder<DescribeAIDBClustersRequest, Builder> {
        private String aiNodeType; 
        private String DBClusterDescription; 
        private String DBClusterIds; 
        private String DBClusterStatus; 
        private String ownerAccount; 
        private Long ownerId; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String payType; 
        private String regionId; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private java.util.List<Tag> tag; 

        private Builder() {
            super();
        } 

        private Builder(DescribeAIDBClustersRequest request) {
            super(request);
            this.aiNodeType = request.aiNodeType;
            this.DBClusterDescription = request.DBClusterDescription;
            this.DBClusterIds = request.DBClusterIds;
            this.DBClusterStatus = request.DBClusterStatus;
            this.ownerAccount = request.ownerAccount;
            this.ownerId = request.ownerId;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.payType = request.payType;
            this.regionId = request.regionId;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
            this.tag = request.tag;
        } 

        /**
         * <p>The node type. Multiple types are supported. Separate two values with a comma (,).</p>
         * <ul>
         * <li>vnode: managed by Kubernetes.</li>
         * <li>container: logon-enabled container.</li>
         * <li>maas: model service.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>vnode,container</p>
         */
        public Builder aiNodeType(String aiNodeType) {
            this.putQueryParameter("AiNodeType", aiNodeType);
            this.aiNodeType = aiNodeType;
            return this;
        }

        /**
         * <p>The cluster description. Fuzzy match is supported.</p>
         * 
         * <strong>example:</strong>
         * <p>pc-****************</p>
         */
        public Builder DBClusterDescription(String DBClusterDescription) {
            this.putQueryParameter("DBClusterDescription", DBClusterDescription);
            this.DBClusterDescription = DBClusterDescription;
            return this;
        }

        /**
         * <p>The cluster ID. Separate multiple cluster IDs with commas (,).</p>
         * 
         * <strong>example:</strong>
         * <p>pc-***************</p>
         */
        public Builder DBClusterIds(String DBClusterIds) {
            this.putQueryParameter("DBClusterIds", DBClusterIds);
            this.DBClusterIds = DBClusterIds;
            return this;
        }

        /**
         * <p>The cluster status. Valid values:</p>
         * <ul>
         * <li><strong>Creating</strong>: being created.</li>
         * <li><strong>Running</strong>: running.</li>
         * <li><strong>Deleting</strong>: being released.</li>
         * <li><strong>Rebooting</strong>: being restarted.</li>
         * <li><strong>DBNodeCreating</strong>: a node is being added (increase).</li>
         * <li><strong>DBNodeDeleting</strong>: a node is being deleted.</li>
         * <li><strong>ClassChanging</strong>: node specifications are being changed.</li>
         * <li><strong>NetAddressCreating</strong>: a network connectivity is being created.</li>
         * <li><strong>NetAddressDeleting</strong>: a network connectivity is being deleted.</li>
         * <li><strong>NetAddressModifying</strong>: a network connectivity is being modified. </li>
         * <li><strong>Deleted</strong>: released.</li>
         * </ul>
         * <ul>
         * <li><strong>ClassChanged</strong>: resources are being revoked after a decrease the quota operation.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Running</p>
         */
        public Builder DBClusterStatus(String DBClusterStatus) {
            this.putQueryParameter("DBClusterStatus", DBClusterStatus);
            this.DBClusterStatus = DBClusterStatus;
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
         * <p>The number of entries per page. Valid values: <strong>30</strong>, <strong>50</strong>, and <strong>100</strong>.</p>
         * <p>Default value: <strong>30</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>30</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The billing method. Valid values: </p>
         * <ul>
         * <li><strong>Postpaid</strong>: pay-as-you-go.</li>
         * <li><strong>Prepaid</strong>: subscription.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Prepaid</p>
         */
        public Builder payType(String payType) {
            this.putQueryParameter("PayType", payType);
            this.payType = payType;
            return this;
        }

        /**
         * <p>The region ID.</p>
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
        public Builder tag(java.util.List<Tag> tag) {
            this.putQueryParameter("Tag", tag);
            this.tag = tag;
            return this;
        }

        @Override
        public DescribeAIDBClustersRequest build() {
            return new DescribeAIDBClustersRequest(this);
        } 

    } 

    /**
     * 
     * {@link DescribeAIDBClustersRequest} extends {@link TeaModel}
     *
     * <p>DescribeAIDBClustersRequest</p>
     */
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

            private Builder() {
            } 

            private Builder(Tag model) {
                this.key = model.key;
                this.value = model.value;
            } 

            /**
             * <p>The tag key. You can filter the cluster list by tag. You can specify up to 20 tag pairs. The number n for each tag pair must be unique and must be a consecutive integer starting from 1. The value of Tag.n.Key corresponds to Tag.n.Value.</p>
             * 
             * <strong>example:</strong>
             * <p>testKey</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>The tag value that corresponds to the tag key.</p>
             * 
             * <strong>example:</strong>
             * <p>testValueData</p>
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
