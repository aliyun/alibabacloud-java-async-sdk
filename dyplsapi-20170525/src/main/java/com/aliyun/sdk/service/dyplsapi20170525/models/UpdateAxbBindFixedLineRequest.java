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
 * {@link UpdateAxbBindFixedLineRequest} extends {@link RequestModel}
 *
 * <p>UpdateAxbBindFixedLineRequest</p>
 */
public class UpdateAxbBindFixedLineRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Anucode")
    private String anucode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Anucodecalled")
    private String anucodecalled;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AppId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String appId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Expiration")
    private String expiration;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Extra")
    private Extra extra;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OrderId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String orderId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Remark")
    private String remark;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SubId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String subId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Subts")
    @com.aliyun.core.annotation.Validation(required = true)
    private String subts;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TAnucodeConnect")
    private String tAnucodeConnect;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TelA")
    private String telA;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TelB")
    private String telB;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Ts")
    @com.aliyun.core.annotation.Validation(required = true)
    private String ts;

    private UpdateAxbBindFixedLineRequest(Builder builder) {
        super(builder);
        this.anucode = builder.anucode;
        this.anucodecalled = builder.anucodecalled;
        this.appId = builder.appId;
        this.expiration = builder.expiration;
        this.extra = builder.extra;
        this.orderId = builder.orderId;
        this.ownerId = builder.ownerId;
        this.remark = builder.remark;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.subId = builder.subId;
        this.subts = builder.subts;
        this.tAnucodeConnect = builder.tAnucodeConnect;
        this.telA = builder.telA;
        this.telB = builder.telB;
        this.ts = builder.ts;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateAxbBindFixedLineRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return anucode
     */
    public String getAnucode() {
        return this.anucode;
    }

    /**
     * @return anucodecalled
     */
    public String getAnucodecalled() {
        return this.anucodecalled;
    }

    /**
     * @return appId
     */
    public String getAppId() {
        return this.appId;
    }

    /**
     * @return expiration
     */
    public String getExpiration() {
        return this.expiration;
    }

    /**
     * @return extra
     */
    public Extra getExtra() {
        return this.extra;
    }

    /**
     * @return orderId
     */
    public String getOrderId() {
        return this.orderId;
    }

    /**
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
    }

    /**
     * @return remark
     */
    public String getRemark() {
        return this.remark;
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
     * @return subId
     */
    public String getSubId() {
        return this.subId;
    }

    /**
     * @return subts
     */
    public String getSubts() {
        return this.subts;
    }

    /**
     * @return tAnucodeConnect
     */
    public String getTAnucodeConnect() {
        return this.tAnucodeConnect;
    }

    /**
     * @return telA
     */
    public String getTelA() {
        return this.telA;
    }

    /**
     * @return telB
     */
    public String getTelB() {
        return this.telB;
    }

    /**
     * @return ts
     */
    public String getTs() {
        return this.ts;
    }

    public static final class Builder extends Request.Builder<UpdateAxbBindFixedLineRequest, Builder> {
        private String anucode; 
        private String anucodecalled; 
        private String appId; 
        private String expiration; 
        private Extra extra; 
        private String orderId; 
        private Long ownerId; 
        private String remark; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private String subId; 
        private String subts; 
        private String tAnucodeConnect; 
        private String telA; 
        private String telB; 
        private String ts; 

        private Builder() {
            super();
        } 

        private Builder(UpdateAxbBindFixedLineRequest request) {
            super(request);
            this.anucode = request.anucode;
            this.anucodecalled = request.anucodecalled;
            this.appId = request.appId;
            this.expiration = request.expiration;
            this.extra = request.extra;
            this.orderId = request.orderId;
            this.ownerId = request.ownerId;
            this.remark = request.remark;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
            this.subId = request.subId;
            this.subts = request.subts;
            this.tAnucodeConnect = request.tAnucodeConnect;
            this.telA = request.telA;
            this.telB = request.telB;
            this.ts = request.ts;
        } 

        /**
         * <p>主叫侧放音编码</p>
         * 
         * <strong>example:</strong>
         * <p>1,2,3</p>
         */
        public Builder anucode(String anucode) {
            this.putQueryParameter("Anucode", anucode);
            this.anucode = anucode;
            return this;
        }

        /**
         * <p>被叫侧放音编码</p>
         * 
         * <strong>example:</strong>
         * <p>1,2</p>
         */
        public Builder anucodecalled(String anucodecalled) {
            this.putQueryParameter("Anucodecalled", anucodecalled);
            this.anucodecalled = anucodecalled;
            return this;
        }

        /**
         * <p>应用id，请求和绑定时的appId必须一致</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ALPT_1234</p>
         */
        public Builder appId(String appId) {
            this.putQueryParameter("AppId", appId);
            this.appId = appId;
            return this;
        }

        /**
         * <p>过期时间,单位：秒，必须为数字 0：不会自动解绑 非0：自动解绑周期</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder expiration(String expiration) {
            this.putQueryParameter("Expiration", expiration);
            this.expiration = expiration;
            return this;
        }

        /**
         * <p>扩展参数</p>
         */
        public Builder extra(Extra extra) {
            String extraShrink = shrink(extra, "Extra", "json");
            this.putQueryParameter("Extra", extraShrink);
            this.extra = extra;
            return this;
        }

        /**
         * <p>消息请求标识</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1234567890</p>
         */
        public Builder orderId(String orderId) {
            this.putQueryParameter("OrderId", orderId);
            this.orderId = orderId;
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
         * <p>接入商自有字段，不能超过100个字符</p>
         * 
         * <strong>example:</strong>
         * <p>remark</p>
         */
        public Builder remark(String remark) {
            this.putQueryParameter("Remark", remark);
            this.remark = remark;
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
         * <p>绑定id</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>A100X558X0000400023</p>
         */
        public Builder subId(String subId) {
            this.putQueryParameter("SubId", subId);
            this.subId = subId;
            return this;
        }

        /**
         * <p>格式为yyyyMMddHHmmss。时间采用北京时间，24小时制。</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>20150920190126</p>
         */
        public Builder subts(String subts) {
            this.putQueryParameter("Subts", subts);
            this.subts = subts;
            return this;
        }

        /**
         * <p>接通后主叫侧的放音编码</p>
         * 
         * <strong>example:</strong>
         * <p>1,2</p>
         */
        public Builder tAnucodeConnect(String tAnucodeConnect) {
            this.putQueryParameter("TAnucodeConnect", tAnucodeConnect);
            this.tAnucodeConnect = tAnucodeConnect;
            return this;
        }

        /**
         * <p>真实号码，telA,telB不允许同时更新</p>
         * 
         * <strong>example:</strong>
         * <p>13900000000</p>
         */
        public Builder telA(String telA) {
            this.putQueryParameter("TelA", telA);
            this.telA = telA;
            return this;
        }

        /**
         * <p>对端号码，telA,telB不允许同时更新</p>
         * 
         * <strong>example:</strong>
         * <p>13005711234</p>
         */
        public Builder telB(String telB) {
            this.putQueryParameter("TelB", telB);
            this.telB = telB;
            return this;
        }

        /**
         * <p>业务时间戳，格式yyyyMMddHHmmssSSS，时间采用北京时间，24小时制，精确至毫秒</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>20161114143116001</p>
         */
        public Builder ts(String ts) {
            this.putQueryParameter("Ts", ts);
            this.ts = ts;
            return this;
        }

        @Override
        public UpdateAxbBindFixedLineRequest build() {
            return new UpdateAxbBindFixedLineRequest(this);
        } 

    } 

    /**
     * 
     * {@link UpdateAxbBindFixedLineRequest} extends {@link TeaModel}
     *
     * <p>UpdateAxbBindFixedLineRequest</p>
     */
    public static class Extra extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Callrecording")
        private String callrecording;

        private Extra(Builder builder) {
            this.callrecording = builder.callrecording;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Extra create() {
            return builder().build();
        }

        /**
         * @return callrecording
         */
        public String getCallrecording() {
            return this.callrecording;
        }

        public static final class Builder {
            private String callrecording; 

            private Builder() {
            } 

            private Builder(Extra model) {
                this.callrecording = model.callrecording;
            } 

            /**
             * <p>录音控制， 0：不录音 1：录音</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder callrecording(String callrecording) {
                this.callrecording = callrecording;
                return this;
            }

            public Extra build() {
                return new Extra(this);
            } 

        } 

    }
}
