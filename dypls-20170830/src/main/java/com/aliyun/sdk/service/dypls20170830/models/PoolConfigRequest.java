// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dypls20170830.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link PoolConfigRequest} extends {@link RequestModel}
 *
 * <p>PoolConfigRequest</p>
 */
public class PoolConfigRequest extends Request {
    @Query
    @NameInMap("BillId")
    @Validation(required = true)
    private String billId;

    @Query
    @NameInMap("CallbackType")
    private Integer callbackType;

    @Query
    @NameInMap("FrozenDay")
    private Integer frozenDay;

    @Query
    @NameInMap("NeedAllCallRecords")
    private Boolean needAllCallRecords;

    @Query
    @NameInMap("OpenSmsWhite")
    private Boolean openSmsWhite;

    @Query
    @NameInMap("OwnerId")
    private Long ownerId;

    @Query
    @NameInMap("PoolWarningLimit")
    private Integer poolWarningLimit;

    @Query
    @NameInMap("ProdCode")
    private String prodCode;

    @Query
    @NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @Query
    @NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @Query
    @NameInMap("SelectXMode")
    private String selectXMode;

    @Query
    @NameInMap("SmartSmsWhitelist")
    private String smartSmsWhitelist;

    @Query
    @NameInMap("SmsChannel")
    private String smsChannel;

    private PoolConfigRequest(Builder builder) {
        super(builder);
        this.billId = builder.billId;
        this.callbackType = builder.callbackType;
        this.frozenDay = builder.frozenDay;
        this.needAllCallRecords = builder.needAllCallRecords;
        this.openSmsWhite = builder.openSmsWhite;
        this.ownerId = builder.ownerId;
        this.poolWarningLimit = builder.poolWarningLimit;
        this.prodCode = builder.prodCode;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.selectXMode = builder.selectXMode;
        this.smartSmsWhitelist = builder.smartSmsWhitelist;
        this.smsChannel = builder.smsChannel;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PoolConfigRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return billId
     */
    public String getBillId() {
        return this.billId;
    }

    /**
     * @return callbackType
     */
    public Integer getCallbackType() {
        return this.callbackType;
    }

    /**
     * @return frozenDay
     */
    public Integer getFrozenDay() {
        return this.frozenDay;
    }

    /**
     * @return needAllCallRecords
     */
    public Boolean getNeedAllCallRecords() {
        return this.needAllCallRecords;
    }

    /**
     * @return openSmsWhite
     */
    public Boolean getOpenSmsWhite() {
        return this.openSmsWhite;
    }

    /**
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
    }

    /**
     * @return poolWarningLimit
     */
    public Integer getPoolWarningLimit() {
        return this.poolWarningLimit;
    }

    /**
     * @return prodCode
     */
    public String getProdCode() {
        return this.prodCode;
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
     * @return selectXMode
     */
    public String getSelectXMode() {
        return this.selectXMode;
    }

    /**
     * @return smartSmsWhitelist
     */
    public String getSmartSmsWhitelist() {
        return this.smartSmsWhitelist;
    }

    /**
     * @return smsChannel
     */
    public String getSmsChannel() {
        return this.smsChannel;
    }

    public static final class Builder extends Request.Builder<PoolConfigRequest, Builder> {
        private String billId; 
        private Integer callbackType; 
        private Integer frozenDay; 
        private Boolean needAllCallRecords; 
        private Boolean openSmsWhite; 
        private Long ownerId; 
        private Integer poolWarningLimit; 
        private String prodCode; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private String selectXMode; 
        private String smartSmsWhitelist; 
        private String smsChannel; 

        private Builder() {
            super();
        } 

        private Builder(PoolConfigRequest request) {
            super(request);
            this.billId = request.billId;
            this.callbackType = request.callbackType;
            this.frozenDay = request.frozenDay;
            this.needAllCallRecords = request.needAllCallRecords;
            this.openSmsWhite = request.openSmsWhite;
            this.ownerId = request.ownerId;
            this.poolWarningLimit = request.poolWarningLimit;
            this.prodCode = request.prodCode;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
            this.selectXMode = request.selectXMode;
            this.smartSmsWhitelist = request.smartSmsWhitelist;
            this.smsChannel = request.smsChannel;
        } 

        /**
         * BillId.
         */
        public Builder billId(String billId) {
            this.putQueryParameter("BillId", billId);
            this.billId = billId;
            return this;
        }

        /**
         * CallbackType.
         */
        public Builder callbackType(Integer callbackType) {
            this.putQueryParameter("CallbackType", callbackType);
            this.callbackType = callbackType;
            return this;
        }

        /**
         * FrozenDay.
         */
        public Builder frozenDay(Integer frozenDay) {
            this.putQueryParameter("FrozenDay", frozenDay);
            this.frozenDay = frozenDay;
            return this;
        }

        /**
         * NeedAllCallRecords.
         */
        public Builder needAllCallRecords(Boolean needAllCallRecords) {
            this.putQueryParameter("NeedAllCallRecords", needAllCallRecords);
            this.needAllCallRecords = needAllCallRecords;
            return this;
        }

        /**
         * OpenSmsWhite.
         */
        public Builder openSmsWhite(Boolean openSmsWhite) {
            this.putQueryParameter("OpenSmsWhite", openSmsWhite);
            this.openSmsWhite = openSmsWhite;
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
         * PoolWarningLimit.
         */
        public Builder poolWarningLimit(Integer poolWarningLimit) {
            this.putQueryParameter("PoolWarningLimit", poolWarningLimit);
            this.poolWarningLimit = poolWarningLimit;
            return this;
        }

        /**
         * ProdCode.
         */
        public Builder prodCode(String prodCode) {
            this.putQueryParameter("ProdCode", prodCode);
            this.prodCode = prodCode;
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
         * SelectXMode.
         */
        public Builder selectXMode(String selectXMode) {
            this.putQueryParameter("SelectXMode", selectXMode);
            this.selectXMode = selectXMode;
            return this;
        }

        /**
         * SmartSmsWhitelist.
         */
        public Builder smartSmsWhitelist(String smartSmsWhitelist) {
            this.putQueryParameter("SmartSmsWhitelist", smartSmsWhitelist);
            this.smartSmsWhitelist = smartSmsWhitelist;
            return this;
        }

        /**
         * SmsChannel.
         */
        public Builder smsChannel(String smsChannel) {
            this.putQueryParameter("SmsChannel", smsChannel);
            this.smsChannel = smsChannel;
            return this;
        }

        @Override
        public PoolConfigRequest build() {
            return new PoolConfigRequest(this);
        } 

    } 

}
