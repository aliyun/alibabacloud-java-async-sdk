// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.tag20180828.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListSupportResourceTypesRequest} extends {@link RequestModel}
 *
 * <p>ListSupportResourceTypesRequest</p>
 */
public class ListSupportResourceTypesRequest extends Request {
    @Query
    @NameInMap("MaxResult")
    private Integer maxResult;

    @Query
    @NameInMap("NextToken")
    private String nextToken;

    @Query
    @NameInMap("OwnerAccount")
    private String ownerAccount;

    @Query
    @NameInMap("OwnerId")
    private Long ownerId;

    @Query
    @NameInMap("ProductCode")
    private String productCode;

    @Query
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @Query
    @NameInMap("ResourceTye")
    private String resourceTye;

    @Query
    @NameInMap("ShowItems")
    private Boolean showItems;

    @Query
    @NameInMap("SupportCode")
    private String supportCode;

    private ListSupportResourceTypesRequest(Builder builder) {
        super(builder);
        this.maxResult = builder.maxResult;
        this.nextToken = builder.nextToken;
        this.ownerAccount = builder.ownerAccount;
        this.ownerId = builder.ownerId;
        this.productCode = builder.productCode;
        this.regionId = builder.regionId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceTye = builder.resourceTye;
        this.showItems = builder.showItems;
        this.supportCode = builder.supportCode;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListSupportResourceTypesRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return maxResult
     */
    public Integer getMaxResult() {
        return this.maxResult;
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
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
     * @return productCode
     */
    public String getProductCode() {
        return this.productCode;
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
     * @return resourceTye
     */
    public String getResourceTye() {
        return this.resourceTye;
    }

    /**
     * @return showItems
     */
    public Boolean getShowItems() {
        return this.showItems;
    }

    /**
     * @return supportCode
     */
    public String getSupportCode() {
        return this.supportCode;
    }

    public static final class Builder extends Request.Builder<ListSupportResourceTypesRequest, Builder> {
        private Integer maxResult; 
        private String nextToken; 
        private String ownerAccount; 
        private Long ownerId; 
        private String productCode; 
        private String regionId; 
        private String resourceOwnerAccount; 
        private String resourceTye; 
        private Boolean showItems; 
        private String supportCode; 

        private Builder() {
            super();
        } 

        private Builder(ListSupportResourceTypesRequest request) {
            super(request);
            this.maxResult = request.maxResult;
            this.nextToken = request.nextToken;
            this.ownerAccount = request.ownerAccount;
            this.ownerId = request.ownerId;
            this.productCode = request.productCode;
            this.regionId = request.regionId;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceTye = request.resourceTye;
            this.showItems = request.showItems;
            this.supportCode = request.supportCode;
        } 

        /**
         * The number of entries to return on each page.
         * <p>
         * 
         * Maximum value: 1000. Default value: 50.
         */
        public Builder maxResult(Integer maxResult) {
            this.putQueryParameter("MaxResult", maxResult);
            this.maxResult = maxResult;
            return this;
        }

        /**
         * The token that is used to start the next query.
         */
        public Builder nextToken(String nextToken) {
            this.putQueryParameter("NextToken", nextToken);
            this.nextToken = nextToken;
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
         * The service code. This parameter specifies a filter condition for the query.
         * <p>
         * 
         * For more information about service codes, see [Services that work with Tag](~~171455~~).
         */
        public Builder productCode(String productCode) {
            this.putQueryParameter("ProductCode", productCode);
            this.productCode = productCode;
            return this;
        }

        /**
         * The region ID.
         * <p>
         * 
         * For more information about the region ID, see [Endpoints](~~170112~~).
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
         * The resource type. This parameter specifies a filter condition for the query.
         * <p>
         * 
         * For more information about resource types, see [Services that work with Tag](~~171455~~).
         */
        public Builder resourceTye(String resourceTye) {
            this.putQueryParameter("ResourceTye", resourceTye);
            this.resourceTye = resourceTye;
            return this;
        }

        /**
         * Specifies whether to return tag-related capability items. Valid values:
         * <p>
         * 
         * *   true: The system returns tag-related capability items.
         * *   false (default value): The system does not return tag-related capability items.
         */
        public Builder showItems(Boolean showItems) {
            this.putQueryParameter("ShowItems", showItems);
            this.showItems = showItems;
            return this;
        }

        /**
         * The code of the tag-related capability item. This parameter specifies a filter condition for the query.
         */
        public Builder supportCode(String supportCode) {
            this.putQueryParameter("SupportCode", supportCode);
            this.supportCode = supportCode;
            return this;
        }

        @Override
        public ListSupportResourceTypesRequest build() {
            return new ListSupportResourceTypesRequest(this);
        } 

    } 

}
