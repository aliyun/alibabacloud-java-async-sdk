// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.tag20180828.models;

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
 * {@link ListSupportResourceTypesRequest} extends {@link RequestModel}
 *
 * <p>ListSupportResourceTypesRequest</p>
 */
public class ListSupportResourceTypesRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MaxResult")
    private Integer maxResult;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerAccount")
    private String ownerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ProductCode")
    private String productCode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceTye")
    private String resourceTye;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ShowItems")
    private Boolean showItems;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SupportCode")
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
         * <p>The number of entries to return on each page.</p>
         * <p>Maximum value: 1000. Default value: 50.</p>
         * 
         * <strong>example:</strong>
         * <p>50</p>
         */
        public Builder maxResult(Integer maxResult) {
            this.putQueryParameter("MaxResult", maxResult);
            this.maxResult = maxResult;
            return this;
        }

        /**
         * <p>The token that is used to start the next query.</p>
         * 
         * <strong>example:</strong>
         * <p>AAAAAYws9fJ0Ur4MGm/5OkDoW/Y3wDNwUdssyKODK****</p>
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
         * <p>The service code. This parameter specifies a filter condition for the query.</p>
         * <p>This parameter is obtained from the response.</p>
         * 
         * <strong>example:</strong>
         * <p>ecs</p>
         */
        public Builder productCode(String productCode) {
            this.putQueryParameter("ProductCode", productCode);
            this.productCode = productCode;
            return this;
        }

        /**
         * <p>The region ID.</p>
         * <p>For more information about region IDs, see <a href="https://help.aliyun.com/document_detail/2330902.html">Endpoints</a>.</p>
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
         * <p>The resource type. This parameter specifies a filter condition for the query.</p>
         * <p>This parameter is obtained from the response.</p>
         * 
         * <strong>example:</strong>
         * <p>instance</p>
         */
        public Builder resourceTye(String resourceTye) {
            this.putQueryParameter("ResourceTye", resourceTye);
            this.resourceTye = resourceTye;
            return this;
        }

        /**
         * <p>Specifies whether to return tag-related capability items. Valid values:</p>
         * <ul>
         * <li>true: The system returns tag-related capability items.</li>
         * <li>false (default value): The system does not return tag-related capability items.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder showItems(Boolean showItems) {
            this.putQueryParameter("ShowItems", showItems);
            this.showItems = showItems;
            return this;
        }

        /**
         * <p>The code of the tag-related capability item. This parameter specifies a filter condition for the query.</p>
         * <p>For more information, see <strong>Tag-related capability items</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>TAG_CONSOLE_SUPPORT</p>
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
