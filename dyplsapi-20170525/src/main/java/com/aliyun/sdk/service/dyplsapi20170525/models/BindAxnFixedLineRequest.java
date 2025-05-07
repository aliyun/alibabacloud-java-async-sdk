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
 * {@link BindAxnFixedLineRequest} extends {@link RequestModel}
 *
 * <p>BindAxnFixedLineRequest</p>
 */
public class BindAxnFixedLineRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Anucode")
    @com.aliyun.core.annotation.Validation(required = true)
    private String anucode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Anucodecalled")
    private String anucodecalled;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AppId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String appId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Areacode")
    private String areacode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BindType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String bindType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Expiration")
    @com.aliyun.core.annotation.Validation(required = true)
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
    @com.aliyun.core.annotation.NameInMap("TelB")
    private String telB;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TelX")
    private String telX;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Ts")
    @com.aliyun.core.annotation.Validation(required = true)
    private String ts;

    private BindAxnFixedLineRequest(Builder builder) {
        super(builder);
        this.anucode = builder.anucode;
        this.anucodecalled = builder.anucodecalled;
        this.appId = builder.appId;
        this.areacode = builder.areacode;
        this.bindType = builder.bindType;
        this.expiration = builder.expiration;
        this.extra = builder.extra;
        this.orderId = builder.orderId;
        this.ownerId = builder.ownerId;
        this.remark = builder.remark;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.subts = builder.subts;
        this.tAnucodeConnect = builder.tAnucodeConnect;
        this.telA = builder.telA;
        this.telB = builder.telB;
        this.telX = builder.telX;
        this.ts = builder.ts;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static BindAxnFixedLineRequest create() {
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
     * @return areacode
     */
    public String getAreacode() {
        return this.areacode;
    }

    /**
     * @return bindType
     */
    public String getBindType() {
        return this.bindType;
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
     * @return telX
     */
    public String getTelX() {
        return this.telX;
    }

    /**
     * @return ts
     */
    public String getTs() {
        return this.ts;
    }

    public static final class Builder extends Request.Builder<BindAxnFixedLineRequest, Builder> {
        private String anucode; 
        private String anucodecalled; 
        private String appId; 
        private String areacode; 
        private String bindType; 
        private String expiration; 
        private Extra extra; 
        private String orderId; 
        private Long ownerId; 
        private String remark; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private String subts; 
        private String tAnucodeConnect; 
        private String telA; 
        private String telB; 
        private String telX; 
        private String ts; 

        private Builder() {
            super();
        } 

        private Builder(BindAxnFixedLineRequest request) {
            super(request);
            this.anucode = request.anucode;
            this.anucodecalled = request.anucodecalled;
            this.appId = request.appId;
            this.areacode = request.areacode;
            this.bindType = request.bindType;
            this.expiration = request.expiration;
            this.extra = request.extra;
            this.orderId = request.orderId;
            this.ownerId = request.ownerId;
            this.remark = request.remark;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
            this.subts = request.subts;
            this.tAnucodeConnect = request.tAnucodeConnect;
            this.telA = request.telA;
            this.telB = request.telB;
            this.telX = request.telX;
            this.ts = request.ts;
        } 

        /**
         * <p>放音编码必须包含3个场景的编码。按照“B-&gt;X,A-&gt;X,其他号码-&gt;X”的顺序填写编码，编码之间以逗号分隔。  比如：“1,2,3”表示B-&gt;X放音编号为1，A-&gt;X放音编号为2， 其他号码-&gt;X放音编号为3</p>
         * <p>This parameter is required.</p>
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
         * <p>去掉“0” 例如：北京（10）；在平台分配X号码模式中，平台从号码池中分配该地区的X号码，避免产生呼叫长途费</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder areacode(String areacode) {
            this.putQueryParameter("Areacode", areacode);
            this.areacode = areacode;
            return this;
        }

        /**
         * <p>绑定类型，值如下： mode101：客户携带X号码 mode102：平台分配X号码</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>mode101</p>
         */
        public Builder bindType(String bindType) {
            this.putQueryParameter("BindType", bindType);
            this.bindType = bindType;
            return this;
        }

        /**
         * <p>位：秒，必须为数字 0：不会自动解绑 非0：自动解绑周期</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>示例值</p>
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
         * <p>消息请求唯一标识</p>
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
         * <p>12444</p>
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
         * <p>接通后主叫侧放音编码  接通后主叫侧放音编码必须包含2个场景的编码。按照“A被叫,其他号码被叫”的顺序填写编码，编码之间以逗号分隔。  比如：“1,2”表示A号码为被叫时主叫侧的放音编号为1，其他号码被叫为被叫时主叫侧的放音编号为2</p>
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
         * <p>N号码</p>
         * 
         * <strong>example:</strong>
         * <p>15500002222</p>
         */
        public Builder telB(String telB) {
            this.putQueryParameter("TelB", telB);
            this.telB = telB;
            return this;
        }

        /**
         * <p>X号码； 平台分配号码模式下，该参数可不带，系统忽略该参数</p>
         * 
         * <strong>example:</strong>
         * <p>0571409312</p>
         */
        public Builder telX(String telX) {
            this.putQueryParameter("TelX", telX);
            this.telX = telX;
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
        public BindAxnFixedLineRequest build() {
            return new BindAxnFixedLineRequest(this);
        } 

    } 

    /**
     * 
     * {@link BindAxnFixedLineRequest} extends {@link TeaModel}
     *
     * <p>BindAxnFixedLineRequest</p>
     */
    public static class Extra extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Callback")
        private String callback;

        @com.aliyun.core.annotation.NameInMap("Callrecording")
        private String callrecording;

        private Extra(Builder builder) {
            this.callback = builder.callback;
            this.callrecording = builder.callrecording;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Extra create() {
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

            private Builder(Extra model) {
                this.callback = model.callback;
                this.callrecording = model.callrecording;
            } 

            /**
             * <p>A通过X呼叫，即A主叫X，仅下列值有效。默认是0。 0：不能外呼 1：接续最近的N号码 2：回拨固定号码：telB</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder callback(String callback) {
                this.callback = callback;
                return this;
            }

            /**
             * <p>仅下列值有效。默认是0（不开通录音功能）。 0：不录音 1：录音</p>
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
