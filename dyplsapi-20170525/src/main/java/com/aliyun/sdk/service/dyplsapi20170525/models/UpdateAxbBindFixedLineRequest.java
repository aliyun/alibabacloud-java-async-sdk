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
         * <p>The caller-side audio playback code. This parameter is required for the AXB privacy number service for landlines. The audio playback code must include codes for three scenarios. Specify the codes in the order of &quot;B-&gt;X, A-&gt;X, and other numbers-&gt;X&quot;, and separate the codes with commas.</p>
         * <blockquote>
         * <p>&quot;1,2,3&quot; indicates that the audio playback code for B-&gt;X is 1, the code for A-&gt;X is 2, and the code for other numbers-&gt;X is 3.</p>
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
         * <p>The callee-side audio playback code after the call is connected. The callee-side audio playback code must include codes for two scenarios. Specify the codes in the order of &quot;A as the callee and B as the callee&quot;, and separate the codes with commas.</p>
         * <blockquote>
         * <p>&quot;1,2&quot; indicates that the audio playback code when Number A answers as the callee is 1, and the code when Number B answers as the callee is 2.</p>
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
         * <li><p>0: The binding never expires.</p>
         * </li>
         * <li><p>Other values: If you specify another value, such as 60, the binding is valid for 60 seconds after Number X is allocated. After 60 seconds, the binding is automatically unbound.</p>
         * </li>
         * </ul>
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
         * <p>The extension parameters.</p>
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
         * <p>The binding ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>A100***************</p>
         */
        public Builder subId(String subId) {
            this.putQueryParameter("SubId", subId);
            this.subId = subId;
            return this;
        }

        /**
         * <p>The binding time. The format is yyyyMMddHHmmss. The time is in UTC+8 and uses the 24-hour format.</p>
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
         * <p>The caller-side audio playback code after the call is connected. The caller-side audio playback code after connection must include codes for two scenarios. Specify the codes in the order of &quot;A as the callee and B as the callee&quot;, and separate the codes with commas.</p>
         * <blockquote>
         * <p>&quot;1,2&quot; indicates that the caller-side audio playback code when Number A is the callee is 1, and the caller-side audio playback code when Number B is the callee is 2.</p>
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
         * <p>Sets Number A in the binding relationship.</p>
         * <blockquote>
         * <ul>
         * <li>Number A can be set to a mobile phone number or a landline number. If it is a landline number, you must add the area code. No hyphen is required between the area code and the number.</li>
         * <li>You cannot update TelA and TelB at the same time.</li>
         * </ul>
         * </blockquote>
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
         * <p>Sets Number B in the binding relationship.</p>
         * <blockquote>
         * <ul>
         * <li>Number B can be set to a mobile phone number or a landline number. If it is a landline number, you must add the area code. No hyphen is required between the area code and the number.</li>
         * <li>You cannot update TelA and TelB at the same time.</li>
         * </ul>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>Mobile phone number: 182<strong><strong>2371
         * Landline number: 0571</strong></strong>**36</p>
         */
        public Builder telB(String telB) {
            this.putQueryParameter("TelB", telB);
            this.telB = telB;
            return this;
        }

        /**
         * <p>The business timestamp. The format is yyyyMMddHHmmssSSS. The time is in UTC+8 and uses the 24-hour format. The precision is accurate to milliseconds.</p>
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
             * <p>The call recording control. Valid values:</p>
             * <ul>
             * <li><p>0 (default): Call recording is disabled.</p>
             * </li>
             * <li><p>1: Call recording is enabled.</p>
             * </li>
             * </ul>
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
