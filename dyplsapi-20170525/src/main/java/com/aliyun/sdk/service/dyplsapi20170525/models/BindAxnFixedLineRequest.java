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
         * <p>The audio prompt codes for the caller side. The value must include codes for three scenarios. Specify the codes in the order of B-&gt;X, A-&gt;X, and other numbers-&gt;X, separated by commas.</p>
         * <blockquote>
         * <p>For example, 1,2,3 indicates that the audio prompt code for B-&gt;X is 1, the code for A-&gt;X is 2, and the code for other numbers-&gt;X is 3.</p>
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
         * <p>The audio prompt codes for the callee side. The value must include codes for two scenarios. Specify the codes in the order of A as the callee and other numbers as the callee, separated by commas.</p>
         * <blockquote>
         * <p>For example, 1,2 indicates that the audio prompt code when number A answers as the callee is 1, and the code when other numbers answer as the callee is 2.</p>
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
         * <p>The ID of the number pool.</p>
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
         * <p>The area code. You can specify the location of number X (specified city -&gt; provincial capital -&gt; national routing). If you do not specify the location, a number is randomly assigned nationwide.</p>
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
         * <p>The binding type. Valid values:</p>
         * <ul>
         * <li><p>mode101: The customer specifies number X.</p>
         * </li>
         * <li><p>mode102: The platform assigns number X.</p>
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
         * <p>The expiration time. Unit: seconds. Valid values:</p>
         * <ul>
         * <li><p>0: The binding never expires.</p>
         * </li>
         * <li><p>Other values: If you specify another value, such as 60, the binding is valid for 60 seconds after number X is successfully assigned. After 60 seconds, the binding is automatically unbound.</p>
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
         * <p>The extended parameters.</p>
         */
        public Builder extra(Extra extra) {
            String extraShrink = shrink(extra, "Extra", "json");
            this.putQueryParameter("Extra", extraShrink);
            this.extra = extra;
            return this;
        }

        /**
         * <p>The unique identifier of the message request.</p>
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
         * <p>The external business extension field. This parameter is returned in the call record receipt message. The value cannot exceed 100 characters in length.</p>
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
         * <p>The binding time. The format is yyyyMMddHHmmss. The time is in UTC+8 and uses the 24-hour clock.</p>
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
         * <p>The audio prompt codes for the caller side after the call is connected. The value must include codes for two scenarios. Specify the codes in the order of A as the callee and other numbers as the callee, separated by commas.</p>
         * <blockquote>
         * <p>For example, 1,2 indicates that the audio prompt code for the caller side when number A is the callee is 1, and the code for the caller side when other numbers are the callee is 2.</p>
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
         * <p>Number A of the fixed-line AXN privacy number.</p>
         * <blockquote>
         * <ul>
         * <li>Number A can be a mobile phone number or a fixed-line number. A fixed-line number must include the area code, and no hyphen is required between the area code and the number.</li>
         * <li>If your business requires modifying a bound number, you can call the <a href="https://api.aliyun.com/document/Dyplsapi/2017-05-25/UpdateAxnBindFixedLine">UpdateAxnBindFixedLine</a> operation to modify it.</li>
         * </ul>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>Mobile phone number: 182<strong><strong>2371
         * Fixed-line number: 0571</strong></strong>**36</p>
         */
        public Builder telA(String telA) {
            this.putQueryParameter("TelA", telA);
            this.telA = telA;
            return this;
        }

        /**
         * <p>Number N of the fixed-line AXN privacy number.</p>
         * 
         * <strong>example:</strong>
         * <p>155****2222</p>
         */
        public Builder telB(String telB) {
            this.putQueryParameter("TelB", telB);
            this.telB = telB;
            return this;
        }

        /**
         * <p>Number X of the fixed-line AXN privacy number. Number X is the privacy number that you have purchased in the console.</p>
         * <blockquote>
         * <p>This parameter is required in the mode where the customer specifies number X (that is, the BindType parameter is set to mode101).</p>
         * </blockquote>
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
         * <p>The business timestamp. The format is yyyyMMddHHmmssSSS. The time is in UTC+8 and uses the 24-hour clock, accurate to milliseconds.</p>
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
             * <p>The callback control. This applies when User A makes a call through number X, meaning User A calls number X. Valid values:</p>
             * <ul>
             * <li><p>0 (default): Outbound calls are not allowed.</p>
             * </li>
             * <li><p>1: Connects to the most recent number N.</p>
             * </li>
             * <li><p>2: Calls back the fixed number TelB.</p>
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
             * <p>The call recording control. Valid values:</p>
             * <ul>
             * <li><p>0 (default): Call recording is disabled.</p>
             * </li>
             * <li><p>1: Call recording is enabled.</p>
             * </li>
             * </ul>
             * <blockquote>
             * <p>After you enable call recording, you can play and download audio files in the call records. Audio files are billed at CNY 0.010 per minute.</p>
             * </blockquote>
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
