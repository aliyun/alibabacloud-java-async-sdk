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
 * {@link ConfigXRequest} extends {@link RequestModel}
 *
 * <p>ConfigXRequest</p>
 */
public class ConfigXRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CallAbility")
    private String callAbility;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CallerParentId")
    private Long callerParentId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CustomerPoolKey")
    @com.aliyun.core.annotation.Validation(required = true)
    private String customerPoolKey;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("GNFlag")
    private String GNFlag;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ReqId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String reqId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SequenceCalls")
    private java.util.List<SequenceCalls> sequenceCalls;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SequenceMode")
    private String sequenceMode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SmsAbility")
    private String smsAbility;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SmsSignMode")
    private String smsSignMode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TelX")
    @com.aliyun.core.annotation.Validation(required = true)
    private String telX;

    private ConfigXRequest(Builder builder) {
        super(builder);
        this.callAbility = builder.callAbility;
        this.callerParentId = builder.callerParentId;
        this.customerPoolKey = builder.customerPoolKey;
        this.GNFlag = builder.GNFlag;
        this.ownerId = builder.ownerId;
        this.reqId = builder.reqId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.sequenceCalls = builder.sequenceCalls;
        this.sequenceMode = builder.sequenceMode;
        this.smsAbility = builder.smsAbility;
        this.smsSignMode = builder.smsSignMode;
        this.telX = builder.telX;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ConfigXRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return callAbility
     */
    public String getCallAbility() {
        return this.callAbility;
    }

    /**
     * @return callerParentId
     */
    public Long getCallerParentId() {
        return this.callerParentId;
    }

    /**
     * @return customerPoolKey
     */
    public String getCustomerPoolKey() {
        return this.customerPoolKey;
    }

    /**
     * @return GNFlag
     */
    public String getGNFlag() {
        return this.GNFlag;
    }

    /**
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
    }

    /**
     * @return reqId
     */
    public String getReqId() {
        return this.reqId;
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
     * @return sequenceCalls
     */
    public java.util.List<SequenceCalls> getSequenceCalls() {
        return this.sequenceCalls;
    }

    /**
     * @return sequenceMode
     */
    public String getSequenceMode() {
        return this.sequenceMode;
    }

    /**
     * @return smsAbility
     */
    public String getSmsAbility() {
        return this.smsAbility;
    }

    /**
     * @return smsSignMode
     */
    public String getSmsSignMode() {
        return this.smsSignMode;
    }

    /**
     * @return telX
     */
    public String getTelX() {
        return this.telX;
    }

    public static final class Builder extends Request.Builder<ConfigXRequest, Builder> {
        private String callAbility; 
        private Long callerParentId; 
        private String customerPoolKey; 
        private String GNFlag; 
        private Long ownerId; 
        private String reqId; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private java.util.List<SequenceCalls> sequenceCalls; 
        private String sequenceMode; 
        private String smsAbility; 
        private String smsSignMode; 
        private String telX; 

        private Builder() {
            super();
        } 

        private Builder(ConfigXRequest request) {
            super(request);
            this.callAbility = request.callAbility;
            this.callerParentId = request.callerParentId;
            this.customerPoolKey = request.customerPoolKey;
            this.GNFlag = request.GNFlag;
            this.ownerId = request.ownerId;
            this.reqId = request.reqId;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
            this.sequenceCalls = request.sequenceCalls;
            this.sequenceMode = request.sequenceMode;
            this.smsAbility = request.smsAbility;
            this.smsSignMode = request.smsSignMode;
            this.telX = request.telX;
        } 

        /**
         * <p>Specifies whether to enable the call capability. Valid values:</p>
         * <ul>
         * <li><p>0: Disable.</p>
         * </li>
         * <li><p>1: Enable.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder callAbility(String callAbility) {
            this.putQueryParameter("CallAbility", callAbility);
            this.callAbility = callAbility;
            return this;
        }

        /**
         * <p>The customer UID.</p>
         * 
         * <strong>example:</strong>
         * <p>1898871967585852</p>
         */
        public Builder callerParentId(Long callerParentId) {
            this.putQueryParameter("CallerParentId", callerParentId);
            this.callerParentId = callerParentId;
            return this;
        }

        /**
         * <p>The key of the number pool.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>FC5**********************a1a</p>
         */
        public Builder customerPoolKey(String customerPoolKey) {
            this.putQueryParameter("CustomerPoolKey", customerPoolKey);
            this.customerPoolKey = customerPoolKey;
            return this;
        }

        /**
         * <p>Specifies whether to pass through the caller ID to display the actual caller. Valid values:</p>
         * <ul>
         * <li><p>00: No pass-through. The work number is displayed when either party calls the other.</p>
         * </li>
         * <li><p>10: Pass-through. When Customer A is the caller, the caller ID displayed to Employee B is the number of Customer A. When Employee B is the caller, the caller ID displayed to Customer A is the work number.</p>
         * </li>
         * </ul>
         * <p>Default value: 00.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder GNFlag(String GNFlag) {
            this.putQueryParameter("GNFlag", GNFlag);
            this.GNFlag = GNFlag;
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
         * <p>The request deduplication ID. The maximum length of reqId is 20 characters. The caller must ensure atomicity.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>564**********879</p>
         */
        public Builder reqId(String reqId) {
            this.putQueryParameter("ReqId", reqId);
            this.reqId = reqId;
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
         * <p>The sequential ringing control parameters.</p>
         */
        public Builder sequenceCalls(java.util.List<SequenceCalls> sequenceCalls) {
            String sequenceCallsShrink = shrink(sequenceCalls, "SequenceCalls", "json");
            this.putQueryParameter("SequenceCalls", sequenceCallsShrink);
            this.sequenceCalls = sequenceCalls;
            return this;
        }

        /**
         * <p>The sequential ringing mode. Valid values:</p>
         * <ul>
         * <li><p>0: No sequential ringing. This is the default value.</p>
         * </li>
         * <li><p>1: Conditional sequential ringing. The system first connects to the callee specified by calledNo. If the callee cannot be connected, the system sequentially rings the numbers in the sequenceCalls list.</p>
         * </li>
         * <li><p>2: Unconditional sequential ringing. The system does not connect to the callee specified by calledNo and directly sequentially rings the numbers in the sequenceCalls list.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder sequenceMode(String sequenceMode) {
            this.putQueryParameter("SequenceMode", sequenceMode);
            this.sequenceMode = sequenceMode;
            return this;
        }

        /**
         * <p>Specifies whether to enable the SMS feature. Valid values:</p>
         * <ul>
         * <li><p>0: Disable.</p>
         * </li>
         * <li><p>1: Enable.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder smsAbility(String smsAbility) {
            this.putQueryParameter("SmsAbility", smsAbility);
            this.smsAbility = smsAbility;
            return this;
        }

        /**
         * <p>Specifies whether to pass through the SMS signature to display the actual user. Valid values:</p>
         * <ul>
         * <li><p>0: No pass-through.</p>
         * </li>
         * <li><p>1: Pass-through.</p>
         * </li>
         * </ul>
         * <p>Default value: 0.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder smsSignMode(String smsSignMode) {
            this.putQueryParameter("SmsSignMode", smsSignMode);
            this.smsSignMode = smsSignMode;
            return this;
        }

        /**
         * <p>The X number.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>17*******22</p>
         */
        public Builder telX(String telX) {
            this.putQueryParameter("TelX", telX);
            this.telX = telX;
            return this;
        }

        @Override
        public ConfigXRequest build() {
            return new ConfigXRequest(this);
        } 

    } 

    /**
     * 
     * {@link ConfigXRequest} extends {@link TeaModel}
     *
     * <p>ConfigXRequest</p>
     */
    public static class SequenceCalls extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("SequenceCallNoPlayCode")
        private String sequenceCallNoPlayCode;

        @com.aliyun.core.annotation.NameInMap("SequenceCalledNo")
        private String sequenceCalledNo;

        @com.aliyun.core.annotation.NameInMap("SequenceCalledPlayCode")
        private String sequenceCalledPlayCode;

        private SequenceCalls(Builder builder) {
            this.sequenceCallNoPlayCode = builder.sequenceCallNoPlayCode;
            this.sequenceCalledNo = builder.sequenceCalledNo;
            this.sequenceCalledPlayCode = builder.sequenceCalledPlayCode;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SequenceCalls create() {
            return builder().build();
        }

        /**
         * @return sequenceCallNoPlayCode
         */
        public String getSequenceCallNoPlayCode() {
            return this.sequenceCallNoPlayCode;
        }

        /**
         * @return sequenceCalledNo
         */
        public String getSequenceCalledNo() {
            return this.sequenceCalledNo;
        }

        /**
         * @return sequenceCalledPlayCode
         */
        public String getSequenceCalledPlayCode() {
            return this.sequenceCalledPlayCode;
        }

        public static final class Builder {
            private String sequenceCallNoPlayCode; 
            private String sequenceCalledNo; 
            private String sequenceCalledPlayCode; 

            private Builder() {
            } 

            private Builder(SequenceCalls model) {
                this.sequenceCallNoPlayCode = model.sequenceCallNoPlayCode;
                this.sequenceCalledNo = model.sequenceCalledNo;
                this.sequenceCalledPlayCode = model.sequenceCalledPlayCode;
            } 

            /**
             * <p>The playback code for the sequential ringing prompt tone. The format is the same as callNoPlayCode.</p>
             * 
             * <strong>example:</strong>
             * <p>01</p>
             */
            public Builder sequenceCallNoPlayCode(String sequenceCallNoPlayCode) {
                this.sequenceCallNoPlayCode = sequenceCallNoPlayCode;
                return this;
            }

            /**
             * <p>The callee number for sequential ringing.</p>
             * 
             * <strong>example:</strong>
             * <p>18*******33</p>
             */
            public Builder sequenceCalledNo(String sequenceCalledNo) {
                this.sequenceCalledNo = sequenceCalledNo;
                return this;
            }

            /**
             * <p>The playback code for the caller and callee after the call is connected. The format is the same as calledPlayCode.</p>
             * 
             * <strong>example:</strong>
             * <p>02</p>
             */
            public Builder sequenceCalledPlayCode(String sequenceCalledPlayCode) {
                this.sequenceCalledPlayCode = sequenceCalledPlayCode;
                return this;
            }

            public SequenceCalls build() {
                return new SequenceCalls(this);
            } 

        } 

    }
}
