// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sddp20260120.models;

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
 * {@link ListDataAssetAccountsRequest} extends {@link RequestModel}
 *
 * <p>ListDataAssetAccountsRequest</p>
 */
public class ListDataAssetAccountsRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AccountName")
    private String accountName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AuthRole")
    private String authRole;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BizType")
    private String bizType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CurrentPage")
    private Integer currentPage;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ProductCode")
    private String productCode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ProductIds")
    private String productIds;

    private ListDataAssetAccountsRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.accountName = builder.accountName;
        this.authRole = builder.authRole;
        this.bizType = builder.bizType;
        this.currentPage = builder.currentPage;
        this.instanceId = builder.instanceId;
        this.lang = builder.lang;
        this.pageSize = builder.pageSize;
        this.productCode = builder.productCode;
        this.productIds = builder.productIds;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListDataAssetAccountsRequest create() {
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
     * @return accountName
     */
    public String getAccountName() {
        return this.accountName;
    }

    /**
     * @return authRole
     */
    public String getAuthRole() {
        return this.authRole;
    }

    /**
     * @return bizType
     */
    public String getBizType() {
        return this.bizType;
    }

    /**
     * @return currentPage
     */
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return lang
     */
    public String getLang() {
        return this.lang;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return productCode
     */
    public String getProductCode() {
        return this.productCode;
    }

    /**
     * @return productIds
     */
    public String getProductIds() {
        return this.productIds;
    }

    public static final class Builder extends Request.Builder<ListDataAssetAccountsRequest, Builder> {
        private String regionId; 
        private String accountName; 
        private String authRole; 
        private String bizType; 
        private Integer currentPage; 
        private String instanceId; 
        private String lang; 
        private Integer pageSize; 
        private String productCode; 
        private String productIds; 

        private Builder() {
            super();
        } 

        private Builder(ListDataAssetAccountsRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.accountName = request.accountName;
            this.authRole = request.authRole;
            this.bizType = request.bizType;
            this.currentPage = request.currentPage;
            this.instanceId = request.instanceId;
            this.lang = request.lang;
            this.pageSize = request.pageSize;
            this.productCode = request.productCode;
            this.productIds = request.productIds;
        } 

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * AccountName.
         */
        public Builder accountName(String accountName) {
            this.putQueryParameter("AccountName", accountName);
            this.accountName = accountName;
            return this;
        }

        /**
         * AuthRole.
         */
        public Builder authRole(String authRole) {
            this.putQueryParameter("AuthRole", authRole);
            this.authRole = authRole;
            return this;
        }

        /**
         * BizType.
         */
        public Builder bizType(String bizType) {
            this.putQueryParameter("BizType", bizType);
            this.bizType = bizType;
            return this;
        }

        /**
         * CurrentPage.
         */
        public Builder currentPage(Integer currentPage) {
            this.putQueryParameter("CurrentPage", currentPage);
            this.currentPage = currentPage;
            return this;
        }

        /**
         * InstanceId.
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * Lang.
         */
        public Builder lang(String lang) {
            this.putQueryParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * ProductCode.
         */
        public Builder productCode(String productCode) {
            this.putQueryParameter("ProductCode", productCode);
            this.productCode = productCode;
            return this;
        }

        /**
         * ProductIds.
         */
        public Builder productIds(String productIds) {
            this.putQueryParameter("ProductIds", productIds);
            this.productIds = productIds;
            return this;
        }

        @Override
        public ListDataAssetAccountsRequest build() {
            return new ListDataAssetAccountsRequest(this);
        } 

    } 

}
