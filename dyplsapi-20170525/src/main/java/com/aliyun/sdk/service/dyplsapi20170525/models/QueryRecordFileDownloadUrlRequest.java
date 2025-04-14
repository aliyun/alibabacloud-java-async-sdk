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
 * {@link QueryRecordFileDownloadUrlRequest} extends {@link RequestModel}
 *
 * <p>QueryRecordFileDownloadUrlRequest</p>
 */
public class QueryRecordFileDownloadUrlRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CallId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String callId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CallTime")
    private String callTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

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

    private QueryRecordFileDownloadUrlRequest(Builder builder) {
        super(builder);
        this.callId = builder.callId;
        this.callTime = builder.callTime;
        this.ownerId = builder.ownerId;
        this.poolKey = builder.poolKey;
        this.productType = builder.productType;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryRecordFileDownloadUrlRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return callId
     */
    public String getCallId() {
        return this.callId;
    }

    /**
     * @return callTime
     */
    public String getCallTime() {
        return this.callTime;
    }

    /**
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
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

    public static final class Builder extends Request.Builder<QueryRecordFileDownloadUrlRequest, Builder> {
        private String callId; 
        private String callTime; 
        private Long ownerId; 
        private String poolKey; 
        private String productType; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 

        private Builder() {
            super();
        } 

        private Builder(QueryRecordFileDownloadUrlRequest request) {
            super(request);
            this.callId = request.callId;
            this.callTime = request.callTime;
            this.ownerId = request.ownerId;
            this.poolKey = request.poolKey;
            this.productType = request.productType;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
        } 

        /**
         * <p>The ID of the call record. Log on to the <a href="https://dypls.console.aliyun.com/dypls.htm#/account">Phone Number Protection console</a> and view <strong>Call Record ID</strong> on the <strong>Call Record Query</strong> page.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>abcedf1234</p>
         */
        public Builder callId(String callId) {
            this.putQueryParameter("CallId", callId);
            this.callId = callId;
            return this;
        }

        /**
         * <p>The call initiation time in the call record. Log on to the <a href="https://dypls.console.aliyun.com/dypls.htm#/account">Phone Number Protection console</a>. View <strong>Call Initiated At</strong> on the <strong>Call Record Query</strong> page, or view the call_time field in the Call Detail Record (CDR) receipt.</p>
         * 
         * <strong>example:</strong>
         * <p>2019-03-05 12:00:00</p>
         */
        public Builder callTime(String callTime) {
            this.putQueryParameter("CallTime", callTime);
            this.callTime = callTime;
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
         * <p>The key of the phone number pool. Log on to the <a href="https://dypls.console.aliyun.com/dypls.htm#/account">Phone Number Protection console</a> and view the key of the phone number pool on the <strong>Number Pool Management</strong> page.</p>
         * <blockquote>
         * <p> This parameter is required when <strong>ProductType</strong> is left empty.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>FC123456</p>
         */
        public Builder poolKey(String poolKey) {
            this.putQueryParameter("PoolKey", poolKey);
            this.poolKey = poolKey;
            return this;
        }

        /**
         * <p>The product type. Valid values:</p>
         * <ul>
         * <li><strong>AXB_170</strong>.</li>
         * <li><strong>AXN_170</strong>.</li>
         * <li><strong>AXN_95</strong>.</li>
         * <li><strong>AXN_EXTENSION_REUSE</strong></li>
         * </ul>
         * <blockquote>
         * </blockquote>
         * <ul>
         * <li><p>This parameter is applicable to the original key accounts of Alibaba Cloud. This parameter can be ignored for Alibaba Cloud users.</p>
         * </li>
         * <li><p>This parameter is required when <strong>PoolKey</strong> is left empty.</p>
         * </li>
         * </ul>
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

        @Override
        public QueryRecordFileDownloadUrlRequest build() {
            return new QueryRecordFileDownloadUrlRequest(this);
        } 

    } 

}
