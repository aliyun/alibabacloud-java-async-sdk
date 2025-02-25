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
         * <p>开/关呼叫能力状态‘0’：禁用‘1’：开启</p>
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
         * <p>客户uid</p>
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
         * <p>号码池key</p>
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
         * <p>是否透传来显为真实主叫：00-非透传：互相拨打时都显示工作号;10-透传：A客户为主叫时,B员工的来显为客户A号码;B员工为主叫时,A客户的来显为工作号;默认为 00</p>
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
         * <p>请求去重ID, reqId最大长度为20位,接入方需要保持原子性</p>
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
         * <p>顺振控制参数</p>
         */
        public Builder sequenceCalls(java.util.List<SequenceCalls> sequenceCalls) {
            String sequenceCallsShrink = shrink(sequenceCalls, "SequenceCalls", "json");
            this.putQueryParameter("SequenceCalls", sequenceCallsShrink);
            this.sequenceCalls = sequenceCalls;
            return this;
        }

        /**
         * <p>顺振模式：0-不顺振（默认）1-有条件顺振，先接续calledNo指定被叫，如果该被叫未能接通，再顺振sequenceCalls号码列表2-无条件顺振，不接续calledNo指定被叫，直接顺振sequenceCalls号码列表</p>
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
         * <p>开/关短信功能状态‘0’：禁用；‘1’：开启；</p>
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
         * <p>是否透传来显为真实用户0：不透传; 1：透传默认：0不透传</p>
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
         * <p>X号码</p>
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

            /**
             * <p>顺振提示音放音编号，格式如callNoPlayCode</p>
             * 
             * <strong>example:</strong>
             * <p>01</p>
             */
            public Builder sequenceCallNoPlayCode(String sequenceCallNoPlayCode) {
                this.sequenceCallNoPlayCode = sequenceCallNoPlayCode;
                return this;
            }

            /**
             * <p>顺振被叫号码</p>
             * 
             * <strong>example:</strong>
             * <p>18*******33</p>
             */
            public Builder sequenceCalledNo(String sequenceCalledNo) {
                this.sequenceCalledNo = sequenceCalledNo;
                return this;
            }

            /**
             * <p>接通后主被叫放音编号，格式如calledPlayCode</p>
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
