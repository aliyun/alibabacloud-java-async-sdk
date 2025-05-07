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
 * {@link UpdateAxnExtensionBindFixedLineRequest} extends {@link RequestModel}
 *
 * <p>UpdateAxnExtensionBindFixedLineRequest</p>
 */
public class UpdateAxnExtensionBindFixedLineRequest extends Request {
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
    @com.aliyun.core.annotation.NameInMap("Extraaxx")
    private Extraaxx extraaxx;

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
    @com.aliyun.core.annotation.Validation(required = true)
    private String telA;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Ts")
    @com.aliyun.core.annotation.Validation(required = true)
    private String ts;

    private UpdateAxnExtensionBindFixedLineRequest(Builder builder) {
        super(builder);
        this.anucode = builder.anucode;
        this.anucodecalled = builder.anucodecalled;
        this.appId = builder.appId;
        this.expiration = builder.expiration;
        this.extraaxx = builder.extraaxx;
        this.orderId = builder.orderId;
        this.ownerId = builder.ownerId;
        this.remark = builder.remark;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.subId = builder.subId;
        this.subts = builder.subts;
        this.tAnucodeConnect = builder.tAnucodeConnect;
        this.telA = builder.telA;
        this.ts = builder.ts;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateAxnExtensionBindFixedLineRequest create() {
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
     * @return extraaxx
     */
    public Extraaxx getExtraaxx() {
        return this.extraaxx;
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
     * @return ts
     */
    public String getTs() {
        return this.ts;
    }

    public static final class Builder extends Request.Builder<UpdateAxnExtensionBindFixedLineRequest, Builder> {
        private String anucode; 
        private String anucodecalled; 
        private String appId; 
        private String expiration; 
        private Extraaxx extraaxx; 
        private String orderId; 
        private Long ownerId; 
        private String remark; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private String subId; 
        private String subts; 
        private String tAnucodeConnect; 
        private String telA; 
        private String ts; 

        private Builder() {
            super();
        } 

        private Builder(UpdateAxnExtensionBindFixedLineRequest request) {
            super(request);
            this.anucode = request.anucode;
            this.anucodecalled = request.anucodecalled;
            this.appId = request.appId;
            this.expiration = request.expiration;
            this.extraaxx = request.extraaxx;
            this.orderId = request.orderId;
            this.ownerId = request.ownerId;
            this.remark = request.remark;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
            this.subId = request.subId;
            this.subts = request.subts;
            this.tAnucodeConnect = request.tAnucodeConnect;
            this.telA = request.telA;
            this.ts = request.ts;
        } 

        /**
         * <p>放音编码必须包含3个场景的编码。按照“B-&gt;X,A-&gt;X,其他号码-&gt;X”的顺序填写编码，编码之间以逗号分隔。  AXN分机号业务的放音编码,B-&gt;X和其他号码-&gt;X的编码一致  比如：“1,2,3”表示B-&gt;X放音编号为1，A-&gt;X放音编号为2， 其他号码-&gt;X放音编号为3</p>
         * 
         * <strong>example:</strong>
         * <p>10001,10002,10003</p>
         */
        public Builder anucode(String anucode) {
            this.putQueryParameter("Anucode", anucode);
            this.anucode = anucode;
            return this;
        }

        /**
         * <p>被叫侧放音编码  被叫放音编码必须包含2个场景的编码。按照“A被叫,其他号码被叫”的顺序填写编码，编码之间以逗号分隔。  比如：“1,2”表示A号码为被叫侧接听时的放音编号为1，其他号码为被叫侧接听时的放音编号为2</p>
         * 
         * <strong>example:</strong>
         * <p>10001,10002</p>
         */
        public Builder anucodecalled(String anucodecalled) {
            this.putQueryParameter("Anucodecalled", anucodecalled);
            this.anucodecalled = anucodecalled;
            return this;
        }

        /**
         * <p>业务id标识，由阿里云分配给客户侧</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>alitest</p>
         */
        public Builder appId(String appId) {
            this.putQueryParameter("AppId", appId);
            this.appId = appId;
            return this;
        }

        /**
         * <p>单位：秒，必须为数字 0：不会自动解绑 非0：自动解绑周期</p>
         * 
         * <strong>example:</strong>
         * <p>60</p>
         */
        public Builder expiration(String expiration) {
            this.putQueryParameter("Expiration", expiration);
            this.expiration = expiration;
            return this;
        }

        /**
         * <p>AXx的扩展参数项</p>
         */
        public Builder extraaxx(Extraaxx extraaxx) {
            String extraaxxShrink = shrink(extraaxx, "Extraaxx", "json");
            this.putQueryParameter("Extraaxx", extraaxxShrink);
            this.extraaxx = extraaxx;
            return this;
        }

        /**
         * <p>消息请求标识</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>12345dkwkd99d</p>
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
         * <p>接入商自有字段，最大100字符长度</p>
         * 
         * <strong>example:</strong>
         * <p>1233</p>
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
         * <p>可参考绑定响应</p>
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
         * <p>20250421141723098</p>
         */
        public Builder subts(String subts) {
            this.putQueryParameter("Subts", subts);
            this.subts = subts;
            return this;
        }

        /**
         * <p>接通后主叫侧放音编码  接通后主叫侧放音编码必须包含2个场景的编码。按照“A被叫,其他号码被叫”的顺序填写编码，编码之间以逗号分隔。  比如：“1,2”表示A号码为被叫时主叫侧的放音编号为1，其他号码为被叫时主叫侧的放音编号为2</p>
         * 
         * <strong>example:</strong>
         * <p>10001,10002</p>
         */
        public Builder tAnucodeConnect(String tAnucodeConnect) {
            this.putQueryParameter("TAnucodeConnect", tAnucodeConnect);
            this.tAnucodeConnect = tAnucodeConnect;
            return this;
        }

        /**
         * <p>A号码</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>15500001111</p>
         */
        public Builder telA(String telA) {
            this.putQueryParameter("TelA", telA);
            this.telA = telA;
            return this;
        }

        /**
         * <p>格式yyyyMMddHHmmssSSS，时间采用北京时间，24小时制，精确至毫秒</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>20250421141723098</p>
         */
        public Builder ts(String ts) {
            this.putQueryParameter("Ts", ts);
            this.ts = ts;
            return this;
        }

        @Override
        public UpdateAxnExtensionBindFixedLineRequest build() {
            return new UpdateAxnExtensionBindFixedLineRequest(this);
        } 

    } 

    /**
     * 
     * {@link UpdateAxnExtensionBindFixedLineRequest} extends {@link TeaModel}
     *
     * <p>UpdateAxnExtensionBindFixedLineRequest</p>
     */
    public static class Extraaxx extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Callback")
        private String callback;

        @com.aliyun.core.annotation.NameInMap("Callrecording")
        private String callrecording;

        private Extraaxx(Builder builder) {
            this.callback = builder.callback;
            this.callrecording = builder.callrecording;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Extraaxx create() {
            return builder().build();
        }

        /**
         * @return callback
         */
        public String getCallback() {
            return this.callback;
        }

        /**
         * @return callrecording
         */
        public String getCallrecording() {
            return this.callrecording;
        }

        public static final class Builder {
            private String callback; 
            private String callrecording; 

            private Builder() {
            } 

            private Builder(Extraaxx model) {
                this.callback = model.callback;
                this.callrecording = model.callrecording;
            } 

            /**
             * <p>可选。 A通过X呼叫，即A主叫X，仅下列值有效。默认是0。 0：不能外呼 1：接续最近的B号码</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder callback(String callback) {
                this.callback = callback;
                return this;
            }

            /**
             * <p>录音控制，仅下列值有效。默认是0（不开通录音功能）。 0：不录音 1：录音</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder callrecording(String callrecording) {
                this.callrecording = callrecording;
                return this;
            }

            public Extraaxx build() {
                return new Extraaxx(this);
            } 

        } 

    }
}
