// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dyplsapi20170525.models;

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
 * {@link QuerySubscriptionDetailRequest} extends {@link RequestModel}
 *
 * <p>QuerySubscriptionDetailRequest</p>
 */
public class QuerySubscriptionDetailRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PhoneNoX")
    @com.aliyun.core.annotation.Validation(required = true)
    private String phoneNoX;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PoolKey")
    private String poolKey;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ProductType")
    private String productType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SubsId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String subsId;

    private QuerySubscriptionDetailRequest(Builder builder) {
        super(builder);
        this.ownerId = builder.ownerId;
        this.phoneNoX = builder.phoneNoX;
        this.poolKey = builder.poolKey;
        this.productType = builder.productType;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.subsId = builder.subsId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QuerySubscriptionDetailRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
    }

    /**
     * @return phoneNoX
     */
    public String getPhoneNoX() {
        return this.phoneNoX;
    }

    /**
     * @return poolKey
     */
    public String getPoolKey() {
        return this.poolKey;
    }

    /**
     * @return productType
     */
    public String getProductType() {
        return this.productType;
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
     * @return subsId
     */
    public String getSubsId() {
        return this.subsId;
    }

    public static final class Builder extends Request.Builder<QuerySubscriptionDetailRequest, Builder> {
        private Long ownerId; 
        private String phoneNoX; 
        private String poolKey; 
        private String productType; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private String subsId; 

        private Builder() {
            super();
        } 

        private Builder(QuerySubscriptionDetailRequest request) {
            super(request);
            this.ownerId = request.ownerId;
            this.phoneNoX = request.phoneNoX;
            this.poolKey = request.poolKey;
            this.productType = request.productType;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
            this.subsId = request.subsId;
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
         * <p>The privacy number in the binding relationship, which is the X number.</p>
         * <p>Logon to the privacy protection console and go to the <a href="https://dyplsnext.console.aliyun.com/number/list">Number Management</a> page to obtain the X number. Alternatively, check the <strong>SecretNo</strong> in the response parameters when you invoke number binding API operations such as <a href="https://www.alibabacloud.com/help/en/pnp/developer-reference/api-dyplsapi-2017-05-25-bindaxb">BindAxb</a>.</p>
         * <blockquote>
         * <p>When specifying the X number, make sure it is associated with the <strong>SubsId</strong> parameter.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>139****1111</p>
         */
        public Builder phoneNoX(String phoneNoX) {
            this.putQueryParameter("PhoneNoX", phoneNoX);
            this.phoneNoX = phoneNoX;
            return this;
        }

        /**
         * <p>The key of the number pool.</p>
         * <p>Log on to the privacy protection console and go to the <a href="https://dyplsnext.console.aliyun.com/number-pool?spm=a2c4g.11186623.0.0.7e6449bbtiHP8m">Number Pool Management</a> page to obtain the <strong>Number Pool Key</strong>.</p>
         * <blockquote>
         * <p>This parameter is required when <strong>ProductType</strong> is left empty.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>FC10000012345****</p>
         */
        public Builder poolKey(String poolKey) {
            this.putQueryParameter("PoolKey", poolKey);
            this.poolKey = poolKey;
            return this;
        }

        /**
         * <p>The product type. Valid values:</p>
         * <ul>
         * <li><strong>AXB_170</strong></li>
         * <li><strong>AXN_170</strong></li>
         * <li><strong>AXN_95</strong></li>
         * <li><strong>AXN_EXTENSION_REUSE</strong></li>
         * </ul>
         * <blockquote>
         * <ul>
         * <li>This parameter is applicable to former Alibaba Dayu users. Alibaba Cloud users can ignore this parameter.</li>
         * <li>This parameter is required when <strong>PoolKey</strong> is left empty.</li>
         * </ul>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>AXB_170</p>
         */
        public Builder productType(String productType) {
            this.putQueryParameter("ProductType", productType);
            this.productType = productType;
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
         * <p>The binding relationship ID.</p>
         * <p>Logon to the privacy protection console, go to the <a href="https://dyplsnext.console.aliyun.com/number/list">Number Management</a> page, filter the numbers, and click <strong>Details</strong> to view the binding relationship ID. Alternatively, check the <strong>SubsId</strong> in the response parameters when you invoke number binding API operations such as <a href="https://www.alibabacloud.com/help/en/pnp/developer-reference/api-dyplsapi-2017-05-25-bindaxb">BindAxb</a>.</p>
         * <blockquote>
         * <p>When specifying the binding relationship ID, make sure it is associated with the <strong>PhoneNoX</strong> parameter.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>100000076879****</p>
         */
        public Builder subsId(String subsId) {
            this.putQueryParameter("SubsId", subsId);
            this.subsId = subsId;
            return this;
        }

        @Override
        public QuerySubscriptionDetailRequest build() {
            return new QuerySubscriptionDetailRequest(this);
        } 

    } 

}
