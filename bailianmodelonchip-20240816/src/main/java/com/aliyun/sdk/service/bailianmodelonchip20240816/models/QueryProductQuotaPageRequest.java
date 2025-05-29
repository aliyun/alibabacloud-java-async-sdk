// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.bailianmodelonchip20240816.models;

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
 * {@link QueryProductQuotaPageRequest} extends {@link RequestModel}
 *
 * <p>QueryProductQuotaPageRequest</p>
 */
public class QueryProductQuotaPageRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("pageIndex")
    private Integer pageIndex;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("pageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("productKey")
    private String productKey;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("productName")
    private String productName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("purchaseTimeEnd")
    private String purchaseTimeEnd;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("purchaseTimeStart")
    private String purchaseTimeStart;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("purchaseType")
    private Integer purchaseType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("tenantId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String tenantId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("userId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String userId;

    private QueryProductQuotaPageRequest(Builder builder) {
        super(builder);
        this.pageIndex = builder.pageIndex;
        this.pageSize = builder.pageSize;
        this.productKey = builder.productKey;
        this.productName = builder.productName;
        this.purchaseTimeEnd = builder.purchaseTimeEnd;
        this.purchaseTimeStart = builder.purchaseTimeStart;
        this.purchaseType = builder.purchaseType;
        this.tenantId = builder.tenantId;
        this.userId = builder.userId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryProductQuotaPageRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return pageIndex
     */
    public Integer getPageIndex() {
        return this.pageIndex;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return productKey
     */
    public String getProductKey() {
        return this.productKey;
    }

    /**
     * @return productName
     */
    public String getProductName() {
        return this.productName;
    }

    /**
     * @return purchaseTimeEnd
     */
    public String getPurchaseTimeEnd() {
        return this.purchaseTimeEnd;
    }

    /**
     * @return purchaseTimeStart
     */
    public String getPurchaseTimeStart() {
        return this.purchaseTimeStart;
    }

    /**
     * @return purchaseType
     */
    public Integer getPurchaseType() {
        return this.purchaseType;
    }

    /**
     * @return tenantId
     */
    public String getTenantId() {
        return this.tenantId;
    }

    /**
     * @return userId
     */
    public String getUserId() {
        return this.userId;
    }

    public static final class Builder extends Request.Builder<QueryProductQuotaPageRequest, Builder> {
        private Integer pageIndex; 
        private Integer pageSize; 
        private String productKey; 
        private String productName; 
        private String purchaseTimeEnd; 
        private String purchaseTimeStart; 
        private Integer purchaseType; 
        private String tenantId; 
        private String userId; 

        private Builder() {
            super();
        } 

        private Builder(QueryProductQuotaPageRequest request) {
            super(request);
            this.pageIndex = request.pageIndex;
            this.pageSize = request.pageSize;
            this.productKey = request.productKey;
            this.productName = request.productName;
            this.purchaseTimeEnd = request.purchaseTimeEnd;
            this.purchaseTimeStart = request.purchaseTimeStart;
            this.purchaseType = request.purchaseType;
            this.tenantId = request.tenantId;
            this.userId = request.userId;
        } 

        /**
         * pageIndex.
         */
        public Builder pageIndex(Integer pageIndex) {
            this.putBodyParameter("pageIndex", pageIndex);
            this.pageIndex = pageIndex;
            return this;
        }

        /**
         * pageSize.
         */
        public Builder pageSize(Integer pageSize) {
            this.putBodyParameter("pageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * productKey.
         */
        public Builder productKey(String productKey) {
            this.putBodyParameter("productKey", productKey);
            this.productKey = productKey;
            return this;
        }

        /**
         * productName.
         */
        public Builder productName(String productName) {
            this.putBodyParameter("productName", productName);
            this.productName = productName;
            return this;
        }

        /**
         * purchaseTimeEnd.
         */
        public Builder purchaseTimeEnd(String purchaseTimeEnd) {
            this.putBodyParameter("purchaseTimeEnd", purchaseTimeEnd);
            this.purchaseTimeEnd = purchaseTimeEnd;
            return this;
        }

        /**
         * purchaseTimeStart.
         */
        public Builder purchaseTimeStart(String purchaseTimeStart) {
            this.putBodyParameter("purchaseTimeStart", purchaseTimeStart);
            this.purchaseTimeStart = purchaseTimeStart;
            return this;
        }

        /**
         * purchaseType.
         */
        public Builder purchaseType(Integer purchaseType) {
            this.putBodyParameter("purchaseType", purchaseType);
            this.purchaseType = purchaseType;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>628103740287873</p>
         */
        public Builder tenantId(String tenantId) {
            this.putBodyParameter("tenantId", tenantId);
            this.tenantId = tenantId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>123456</p>
         */
        public Builder userId(String userId) {
            this.putBodyParameter("userId", userId);
            this.userId = userId;
            return this;
        }

        @Override
        public QueryProductQuotaPageRequest build() {
            return new QueryProductQuotaPageRequest(this);
        } 

    } 

}
