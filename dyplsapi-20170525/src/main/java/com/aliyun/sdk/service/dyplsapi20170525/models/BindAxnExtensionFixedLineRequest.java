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
 * {@link BindAxnExtensionFixedLineRequest} extends {@link RequestModel}
 *
 * <p>BindAxnExtensionFixedLineRequest</p>
 */
public class BindAxnExtensionFixedLineRequest extends Request {
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
    @com.aliyun.core.annotation.NameInMap("TelX")
    private String telX;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TelXext")
    private String telXext;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Ts")
    @com.aliyun.core.annotation.Validation(required = true)
    private String ts;

    private BindAxnExtensionFixedLineRequest(Builder builder) {
        super(builder);
        this.anucode = builder.anucode;
        this.anucodecalled = builder.anucodecalled;
        this.appId = builder.appId;
        this.areacode = builder.areacode;
        this.bindType = builder.bindType;
        this.expiration = builder.expiration;
        this.extraaxx = builder.extraaxx;
        this.orderId = builder.orderId;
        this.ownerId = builder.ownerId;
        this.remark = builder.remark;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.subts = builder.subts;
        this.tAnucodeConnect = builder.tAnucodeConnect;
        this.telA = builder.telA;
        this.telX = builder.telX;
        this.telXext = builder.telXext;
        this.ts = builder.ts;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static BindAxnExtensionFixedLineRequest create() {
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
     * @return telX
     */
    public String getTelX() {
        return this.telX;
    }

    /**
     * @return telXext
     */
    public String getTelXext() {
        return this.telXext;
    }

    /**
     * @return ts
     */
    public String getTs() {
        return this.ts;
    }

    public static final class Builder extends Request.Builder<BindAxnExtensionFixedLineRequest, Builder> {
        private String anucode; 
        private String anucodecalled; 
        private String appId; 
        private String areacode; 
        private String bindType; 
        private String expiration; 
        private Extraaxx extraaxx; 
        private String orderId; 
        private Long ownerId; 
        private String remark; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private String subts; 
        private String tAnucodeConnect; 
        private String telA; 
        private String telX; 
        private String telXext; 
        private String ts; 

        private Builder() {
            super();
        } 

        private Builder(BindAxnExtensionFixedLineRequest request) {
            super(request);
            this.anucode = request.anucode;
            this.anucodecalled = request.anucodecalled;
            this.appId = request.appId;
            this.areacode = request.areacode;
            this.bindType = request.bindType;
            this.expiration = request.expiration;
            this.extraaxx = request.extraaxx;
            this.orderId = request.orderId;
            this.ownerId = request.ownerId;
            this.remark = request.remark;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
            this.subts = request.subts;
            this.tAnucodeConnect = request.tAnucodeConnect;
            this.telA = request.telA;
            this.telX = request.telX;
            this.telXext = request.telXext;
            this.ts = request.ts;
        } 

        /**
         * <p>Caller-side ringtone code. This parameter is required for AXB scenarios. Must contain codes for 3 scenarios. Enter the codes in the order of &quot;B-&gt;X, A-&gt;X, other numbers-&gt;X&quot;, separated by commas.</p>
         * <blockquote>
         * <p>&quot;1,2,3&quot; indicates that the ringtone code for B-&gt;X is 1, for A-&gt;X is 2, and for other numbers-&gt;X is 3.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
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
         * <p>Called-side ringtone code after connection. Must contain codes for 2 scenarios. Enter the codes in the order of &quot;A as called party, B as called party&quot;, separated by commas.</p>
         * <blockquote>
         * <p>&quot;1,2&quot; indicates that the ringtone code when A is the called party is 1, and the ringtone code when B is the called party is 2.</p>
         * </blockquote>
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
         * <p>Number pool ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>FC10000016848****</p>
         */
        public Builder appId(String appId) {
            this.putQueryParameter("AppId", appId);
            this.appId = appId;
            return this;
        }

        /**
         * <p>Area code. Supports specifying the home location of the X number (specified city -&gt; provincial capital -&gt; nationwide routing). If no home location is specified, a number is randomly assigned nationwide.</p>
         * 
         * <strong>example:</strong>
         * <p>0571</p>
         */
        public Builder areacode(String areacode) {
            this.putQueryParameter("Areacode", areacode);
            this.areacode = areacode;
            return this;
        }

        /**
         * <p>Binding type. Valid values:</p>
         * <ul>
         * <li><p>mode101: Customer specifies the X number.</p>
         * </li>
         * <li><p>mode102: Platform assigns the X number.</p>
         * </li>
         * </ul>
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
         * <p>Expiration time. Unit: seconds. Valid values:</p>
         * <ul>
         * <li><p>0: Never expires.</p>
         * </li>
         * <li><p>Other values: When other values are specified, such as 60, the binding is valid for 60 seconds after the X number is successfully assigned. After 60 seconds, the binding is automatically released.</p>
         * </li>
         * </ul>
         * <p>This parameter is required.</p>
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
         * <p>Extension parameters.</p>
         */
        public Builder extraaxx(Extraaxx extraaxx) {
            String extraaxxShrink = shrink(extraaxx, "Extraaxx", "json");
            this.putQueryParameter("Extraaxx", extraaxxShrink);
            this.extraaxx = extraaxx;
            return this;
        }

        /**
         * <p>Unique identifier of the message request.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>123*******</p>
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
         * <p>External business extension field. This parameter is returned in call record receipt messages. Must not exceed 100 characters.</p>
         * 
         * <strong>example:</strong>
         * <p>19394</p>
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
         * <p>Binding time. Format: yyyyMMddHHmmss. Uses Beijing time, 24-hour clock.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>20161114143116</p>
         */
        public Builder subts(String subts) {
            this.putQueryParameter("Subts", subts);
            this.subts = subts;
            return this;
        }

        /**
         * <p>Caller-side ringtone code after connection. Must contain codes for 2 scenarios. Enter the codes in the order of &quot;A as called party, B as called party&quot;, separated by commas.</p>
         * <blockquote>
         * <p>&quot;1,2&quot; indicates that the caller-side ringtone code when A is the called party is 1, and the caller-side ringtone code when B is the called party is 2.</p>
         * </blockquote>
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
         * <p>The A number for the fixed-line AXN extension number.</p>
         * <blockquote>
         * <p>The A number can be set to a mobile number or a fixed-line number. Fixed-line numbers must include the area code, and no hyphen is needed between the area code and the number.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>Mobile: 182<strong><strong>2371
         * Fixed line: 0571</strong></strong>**36</p>
         */
        public Builder telA(String telA) {
            this.putQueryParameter("TelA", telA);
            this.telA = telA;
            return this;
        }

        /**
         * <p>The X number for the fixed-line AXN extension number. The X number is a privacy number that you have <a href="https://dyplsnext.console.aliyun.com/numberbuy">purchased</a> in the console.</p>
         * 
         * <strong>example:</strong>
         * <p>0571******23</p>
         */
        public Builder telX(String telX) {
            this.putQueryParameter("TelX", telX);
            this.telX = telX;
            return this;
        }

        /**
         * <p>Extension number. This parameter is required when the BindType parameter is set to mode101.</p>
         * 
         * <strong>example:</strong>
         * <p>1009</p>
         */
        public Builder telXext(String telXext) {
            this.putQueryParameter("TelXext", telXext);
            this.telXext = telXext;
            return this;
        }

        /**
         * <p>Business timestamp. Format: yyyyMMddHHmmssSSS. Uses Beijing time, 24-hour clock, accurate to milliseconds.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>20161114143116123</p>
         */
        public Builder ts(String ts) {
            this.putQueryParameter("Ts", ts);
            this.ts = ts;
            return this;
        }

        @Override
        public BindAxnExtensionFixedLineRequest build() {
            return new BindAxnExtensionFixedLineRequest(this);
        } 

    } 

    /**
     * 
     * {@link BindAxnExtensionFixedLineRequest} extends {@link TeaModel}
     *
     * <p>BindAxnExtensionFixedLineRequest</p>
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
             * <p>Callback control. When A calls through X, that is, A dials X as the caller. Valid values:</p>
             * <ul>
             * <li><p>0 (default): Cannot make outbound calls.</p>
             * </li>
             * <li><p>1: Connect to the most recent N number.</p>
             * </li>
             * <li><p>2: Call back the fixed number TelB.</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder callback(String callback) {
                this.callback = callback;
                return this;
            }

            /**
             * <p>Recording control. Valid values:</p>
             * <ul>
             * <li><p>0 (default): No recording.</p>
             * </li>
             * <li><p>1: Recording.</p>
             * </li>
             * </ul>
             * <blockquote>
             * <p>After you enable the call recording feature, you can play and download audio files in the call records. Recording files are billed at CNY 0.010/minute.</p>
             * </blockquote>
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
