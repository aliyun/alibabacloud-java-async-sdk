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
         * <p>The announcement code for the caller side. This parameter is required for the AXB service. It must contain codes for three scenarios. Specify the codes in the order of &quot;B-&gt;X, A-&gt;X, and other numbers-&gt;X&quot;, separated by commas.</p>
         * <blockquote>
         * <p>&quot;1,2,3&quot; indicates that the announcement code for B-&gt;X is 1, the announcement code for A-&gt;X is 2, and the announcement code for other numbers-&gt;X is 3.</p>
         * </blockquote>
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
         * <p>The announcement code for the callee side after the call is connected. It must contain codes for two scenarios. Specify the codes in the order of &quot;A as callee and B as callee&quot;, separated by commas.</p>
         * <blockquote>
         * <p>&quot;1,2&quot; indicates that the announcement code when number A answers as the callee is 1, and the announcement code when number B answers as the callee is 2.</p>
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
         * <p>The expiration time. Unit: seconds. Valid values:</p>
         * <ul>
         * <li><p>0: Never expires.</p>
         * </li>
         * <li><p>Other values: If you specify another value, such as 60, the binding is valid for 60 seconds after number X is allocated. After 60 seconds, the binding is automatically unbound.</p>
         * </li>
         * </ul>
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
         * <p>The extension parameters.</p>
         */
        public Builder extraaxx(Extraaxx extraaxx) {
            String extraaxxShrink = shrink(extraaxx, "Extraaxx", "json");
            this.putQueryParameter("Extraaxx", extraaxxShrink);
            this.extraaxx = extraaxx;
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
         * <p>The binding ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>GHX0*************************</p>
         */
        public Builder subId(String subId) {
            this.putQueryParameter("SubId", subId);
            this.subId = subId;
            return this;
        }

        /**
         * <p>The binding time. Format: yyyyMMddHHmmss. The time is in UTC+8 and uses the 24-hour format.</p>
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
         * <p>The announcement code for the caller side after the call is connected. It must contain codes for two scenarios. Specify the codes in the order of &quot;A as callee and B as callee&quot;, separated by commas.</p>
         * <blockquote>
         * <p>&quot;1,2&quot; indicates that the announcement code for the caller side when number A is the callee is 1, and the announcement code for the caller side when number B is the callee is 2.</p>
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
         * <p>The number A of the landline AXN extension.</p>
         * <blockquote>
         * <p>Number A can be set to a mobile phone number or a landline number. For a landline number, the area code must be included, and no hyphen is required between the area code and the number.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>Mobile phone number: 182<strong><strong>2371
         * Landline number: 0571</strong></strong>**36</p>
         */
        public Builder telA(String telA) {
            this.putQueryParameter("TelA", telA);
            this.telA = telA;
            return this;
        }

        /**
         * <p>The business timestamp. Format: yyyyMMddHHmmssSSS. The time is in UTC+8 and uses the 24-hour format, accurate to milliseconds.</p>
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
             * <p>The callback control. Number A calls through number X, which means number A is the caller and number X is the callee. Valid values:</p>
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
             * <li><p>0 (default): Does not record calls.</p>
             * </li>
             * <li><p>1: Records calls.</p>
             * </li>
             * </ul>
             * <blockquote>
             * <p>After the call recording feature is enabled, you can play and download voice files in the call records. Recording files are billed at CNY 0.010 per minute based on the call duration.</p>
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
