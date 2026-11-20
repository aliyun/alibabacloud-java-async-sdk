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
 * {@link BindAxnRequest} extends {@link RequestModel}
 *
 * <p>BindAxnRequest</p>
 */
public class BindAxnRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ASRModelId")
    private String ASRModelId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ASRStatus")
    private Boolean ASRStatus;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CallDisplayType")
    private Integer callDisplayType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CallRestrict")
    private String callRestrict;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CallTimeout")
    @com.aliyun.core.annotation.Validation(maximum = 20, minimum = 5)
    private Integer callTimeout;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ExpectCity")
    private String expectCity;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Expiration")
    @com.aliyun.core.annotation.Validation(required = true)
    private String expiration;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Extend")
    private String extend;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IsRecordingEnabled")
    private Boolean isRecordingEnabled;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NoType")
    private String noType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OutId")
    private String outId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OutOrderId")
    private String outOrderId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PhoneNoA")
    @com.aliyun.core.annotation.Validation(required = true)
    private String phoneNoA;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PhoneNoB")
    private String phoneNoB;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PhoneNoX")
    private String phoneNoX;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PoolKey")
    private String poolKey;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RingConfig")
    private String ringConfig;

    private BindAxnRequest(Builder builder) {
        super(builder);
        this.ASRModelId = builder.ASRModelId;
        this.ASRStatus = builder.ASRStatus;
        this.callDisplayType = builder.callDisplayType;
        this.callRestrict = builder.callRestrict;
        this.callTimeout = builder.callTimeout;
        this.expectCity = builder.expectCity;
        this.expiration = builder.expiration;
        this.extend = builder.extend;
        this.isRecordingEnabled = builder.isRecordingEnabled;
        this.noType = builder.noType;
        this.outId = builder.outId;
        this.outOrderId = builder.outOrderId;
        this.ownerId = builder.ownerId;
        this.phoneNoA = builder.phoneNoA;
        this.phoneNoB = builder.phoneNoB;
        this.phoneNoX = builder.phoneNoX;
        this.poolKey = builder.poolKey;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.ringConfig = builder.ringConfig;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static BindAxnRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return ASRModelId
     */
    public String getASRModelId() {
        return this.ASRModelId;
    }

    /**
     * @return ASRStatus
     */
    public Boolean getASRStatus() {
        return this.ASRStatus;
    }

    /**
     * @return callDisplayType
     */
    public Integer getCallDisplayType() {
        return this.callDisplayType;
    }

    /**
     * @return callRestrict
     */
    public String getCallRestrict() {
        return this.callRestrict;
    }

    /**
     * @return callTimeout
     */
    public Integer getCallTimeout() {
        return this.callTimeout;
    }

    /**
     * @return expectCity
     */
    public String getExpectCity() {
        return this.expectCity;
    }

    /**
     * @return expiration
     */
    public String getExpiration() {
        return this.expiration;
    }

    /**
     * @return extend
     */
    public String getExtend() {
        return this.extend;
    }

    /**
     * @return isRecordingEnabled
     */
    public Boolean getIsRecordingEnabled() {
        return this.isRecordingEnabled;
    }

    /**
     * @return noType
     */
    public String getNoType() {
        return this.noType;
    }

    /**
     * @return outId
     */
    public String getOutId() {
        return this.outId;
    }

    /**
     * @return outOrderId
     */
    public String getOutOrderId() {
        return this.outOrderId;
    }

    /**
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
    }

    /**
     * @return phoneNoA
     */
    public String getPhoneNoA() {
        return this.phoneNoA;
    }

    /**
     * @return phoneNoB
     */
    public String getPhoneNoB() {
        return this.phoneNoB;
    }

    /**
     * @return phoneNoX
     */
    public String getPhoneNoX() {
        return this.phoneNoX;
    }

    /**
     * @return poolKey
     */
    public String getPoolKey() {
        return this.poolKey;
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
     * @return ringConfig
     */
    public String getRingConfig() {
        return this.ringConfig;
    }

    public static final class Builder extends Request.Builder<BindAxnRequest, Builder> {
        private String ASRModelId; 
        private Boolean ASRStatus; 
        private Integer callDisplayType; 
        private String callRestrict; 
        private Integer callTimeout; 
        private String expectCity; 
        private String expiration; 
        private String extend; 
        private Boolean isRecordingEnabled; 
        private String noType; 
        private String outId; 
        private String outOrderId; 
        private Long ownerId; 
        private String phoneNoA; 
        private String phoneNoB; 
        private String phoneNoX; 
        private String poolKey; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private String ringConfig; 

        private Builder() {
            super();
        } 

        private Builder(BindAxnRequest request) {
            super(request);
            this.ASRModelId = request.ASRModelId;
            this.ASRStatus = request.ASRStatus;
            this.callDisplayType = request.callDisplayType;
            this.callRestrict = request.callRestrict;
            this.callTimeout = request.callTimeout;
            this.expectCity = request.expectCity;
            this.expiration = request.expiration;
            this.extend = request.extend;
            this.isRecordingEnabled = request.isRecordingEnabled;
            this.noType = request.noType;
            this.outId = request.outId;
            this.outOrderId = request.outOrderId;
            this.ownerId = request.ownerId;
            this.phoneNoA = request.phoneNoA;
            this.phoneNoB = request.phoneNoB;
            this.phoneNoX = request.phoneNoX;
            this.poolKey = request.poolKey;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
            this.ringConfig = request.ringConfig;
        } 

        /**
         * <p>The ASR model ID. Valid values:</p>
         * <ul>
         * <li><p>7ee372834d2f4cc7ac0d0ab2d0ae1aac: General-Telephone-Mandarin Chinese model.</p>
         * </li>
         * <li><p>9b4afe3d224e4fa3bf963697113e2f77: General-Telephone-Cantonese model.</p>
         * </li>
         * <li><p>3655a6cb94764145a1f9a38a3c3b3b4b: General-Telephone-Regional accent model.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>7ee372834d2f4cc7ac0d0ab2d0ae1aac</p>
         */
        public Builder ASRModelId(String ASRModelId) {
            this.putQueryParameter("ASRModelId", ASRModelId);
            this.ASRModelId = ASRModelId;
            return this;
        }

        /**
         * <p>The ASR status. Valid values:</p>
         * <ul>
         * <li><strong>false</strong>: Disabled. This is the default value.</li>
         * <li><strong>true</strong>: Enabled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder ASRStatus(Boolean ASRStatus) {
            this.putQueryParameter("ASRStatus", ASRStatus);
            this.ASRStatus = ASRStatus;
            return this;
        }

        /**
         * <p>Resets the number display logic in the binding relationship. Set the value to <strong>1</strong>, which indicates that the intermediate Number X is displayed for both the caller and the callee.</p>
         * <blockquote>
         * <p>Due to carrier regulatory restrictions, the setting to display the real number during a call does not take effect.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder callDisplayType(Integer callDisplayType) {
            this.putQueryParameter("CallDisplayType", callDisplayType);
            this.callDisplayType = callDisplayType;
            return this;
        }

        /**
         * <p>The single-call restriction status. Valid values:</p>
         * <ul>
         * <li><strong>CONTROL_AX_DISABLE</strong>: Number A cannot call Number X.</li>
         * <li><strong>CONTROL_BX_DISABLE</strong>: Number B cannot call Number X.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>CONTROL_AX_DISABLE</p>
         */
        public Builder callRestrict(String callRestrict) {
            this.putQueryParameter("CallRestrict", callRestrict);
            this.callRestrict = callRestrict;
            return this;
        }

        /**
         * <p>The ring duration. Unit: seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder callTimeout(Integer callTimeout) {
            this.putQueryParameter("CallTimeout", callTimeout);
            this.callTimeout = callTimeout;
            return this;
        }

        /**
         * <p>The city specified for selecting Number X.</p>
         * <blockquote>
         * <ul>
         * <li>If no available numbers in the specified city exist in the current number pool, or if this parameter is not specified, a number from another city is randomly assigned from the current number pool as Number X.</li>
         * <li>If the <strong>Number X allocation mode</strong> is set to <strong>strict match mode</strong>, the system returns an allocation error when no eligible numbers are available.</li>
         * </ul>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>Shanghai</p>
         */
        public Builder expectCity(String expectCity) {
            this.putQueryParameter("ExpectCity", expectCity);
            this.expectCity = expectCity;
            return this;
        }

        /**
         * <p>The expiration time of the binding relationship. Unit: seconds.</p>
         * <blockquote>
         * <p>The expiration time must be at least 60 seconds later than the current time.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>2021-09-05 12:00:00</p>
         */
        public Builder expiration(String expiration) {
            this.putQueryParameter("Expiration", expiration);
            this.expiration = expiration;
            return this;
        }

        /**
         * Extend.
         */
        public Builder extend(String extend) {
            this.putQueryParameter("Extend", extend);
            this.extend = extend;
            return this;
        }

        /**
         * <p>Specifies whether to record all calls generated for this binding relationship. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: Records calls.</li>
         * <li><strong>false</strong>: Does not record calls. This is the default value.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder isRecordingEnabled(Boolean isRecordingEnabled) {
            this.putQueryParameter("IsRecordingEnabled", isRecordingEnabled);
            this.isRecordingEnabled = isRecordingEnabled;
            return this;
        }

        /**
         * <p>The number type.</p>
         * <blockquote>
         * <p>This parameter applies to former Alibaba Dayu customers. Alibaba Cloud users can ignore this parameter.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>AXB_170</p>
         */
        public Builder noType(String noType) {
            this.putQueryParameter("NoType", noType);
            this.noType = noType;
            return this;
        }

        /**
         * <p>The external business extension field. This parameter is returned in the call record receipt message.</p>
         * 
         * <strong>example:</strong>
         * <p>abcdef</p>
         */
        public Builder outId(String outId) {
            this.putQueryParameter("OutId", outId);
            this.outId = outId;
            return this;
        }

        /**
         * <p>The external business ID.</p>
         * 
         * <strong>example:</strong>
         * <p>34553330****</p>
         */
        public Builder outOrderId(String outOrderId) {
            this.putQueryParameter("OutOrderId", outOrderId);
            this.outOrderId = outOrderId;
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
         * <p>Number A of the AXN privacy number. Number A can be a mobile phone number or a landline number. If it is a landline number, the area code must be included, and no hyphen is required between the area code and the phone number.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>139****0000</p>
         */
        public Builder phoneNoA(String phoneNoA) {
            this.putQueryParameter("PhoneNoA", phoneNoA);
            this.phoneNoA = phoneNoA;
            return this;
        }

        /**
         * <p>Number B of the AXN privacy number.</p>
         * <p>Number B can be a mobile phone number or a landline number. If it is a landline number, the area code must be included, and no hyphen is required between the area code and the phone number.</p>
         * <blockquote>
         * <ul>
         * <li>When Number A dials Number X, the call is forwarded to Number B by default. If Number B is not set, the call cannot be connected.</li>
         * <li>When Number A dials Number X, the call is forwarded to Number B only when the <strong>callback mode for Number A</strong> is set to <strong>default mode</strong>. Otherwise, the call cannot be connected.</li>
         * <li>To modify the <strong>callback mode for Number A</strong>, go to <a href="https://dyplsnext.console.aliyun.com/number-pool?resType=1">Number Pool Management</a> &gt; filter <strong>AXN privacy number</strong> &gt; <strong>Number Pool Management</strong> &gt; <strong>Callback mode for Number A</strong> &gt; <strong>Adjust Configuration</strong>.</li>
         * <li>To update Number B, call the <a href="https://www.alibabacloud.com/help/en/pnp/developer-reference/api-dyplsapi-2017-05-25-updatesubscription">UpdateSubscription</a> operation.</li>
         * </ul>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>138****0000</p>
         */
        public Builder phoneNoB(String phoneNoB) {
            this.putQueryParameter("PhoneNoB", phoneNoB);
            this.phoneNoB = phoneNoB;
            return this;
        }

        /**
         * <p>Number X of the AXN privacy number.</p>
         * <p>Number X is a privacy number that you have <a href="https://dyplsnext.console.aliyun.com/numberbuy?spm=a2c4g.11186623.0.0.7e6449bbtiHP8m">purchased</a> in the console.</p>
         * <blockquote>
         * <p>If Number X is not specified, a number is randomly selected from the specified number pool based on the ExpectCity parameter as Number X.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>139****1111</p>
         */
        public Builder phoneNoX(String phoneNoX) {
            this.putQueryParameter("PhoneNoX", phoneNoX);
            this.phoneNoX = phoneNoX;
            return this;
        }

        /**
         * <p>The key of the number pool. You can obtain the <strong>number pool key</strong> on the <a href="https://dyplsnext.console.aliyun.com/number-pool?spm=a2c4g.11186623.0.0.7e6449bbtiHP8m">Number Pool Management</a> page in the Privacy Protection console.</p>
         * 
         * <strong>example:</strong>
         * <p>FC2256****</p>
         */
        public Builder poolKey(String poolKey) {
            this.putQueryParameter("PoolKey", poolKey);
            this.poolKey = poolKey;
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
         * <p>Sets the corporate color ringback tone (CRBT) played during a dial-up to Number X after the AXN privacy number is attached.</p>
         * <p>Specify the <strong>ringtone field</strong> and <strong>CRBT encoding</strong> for this parameter.</p>
         * <p><strong>Ringtone field</strong> valid values:</p>
         * <ul>
         * <li>AXNRing_AB: The ringtone Settings before Number A dials Number X and the call is connected (with a callback number) in AXN mode.</li>
         * <li>AXNRing_A: The ringtone Settings before Number A dials Number X and the call is connected (without a callback number) in AXN mode.</li>
         * <li>AXNRing_N: The ringtone Settings before Number N dials Number X and the call is connected in AXN mode.</li>
         * <li>AXNRing_A_PICKUP: The ringtone Settings after Number A dials Number X and the call is connected in AXN mode.</li>
         * <li>AXNRing_N_PICKUP: The ringtone Settings after Number N dials Number X and the call is connected in AXN mode.</li>
         * </ul>
         * <p><strong>CRBT encoding</strong>:</p>
         * <p>You can obtain the corporate CRBT encoding on the <a href="https://dyplsnext.console.aliyun.com/number-pool/ringtone?resType=1">Corporate CRBT Management</a> page in the Privacy Protection console.</p>
         * <p><strong>Example</strong>:</p>
         * <p>To set the ringtone played before Number A dials Number X and the call is connected (without a callback number), enter &quot;AXNRing_A&quot;: &quot;1000****1&quot;.</p>
         * <blockquote>
         * <p>The corporate CRBT configured at the attachment level takes precedence. If it is not set or does not take effect, the CRBT configured at the number pool level is used.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>{&quot;AXNRing_N&quot;:&quot;1000<strong><strong>1&quot;,&quot;AXNRing_A&quot;:&quot;1000</strong></strong>1&quot;}</p>
         */
        public Builder ringConfig(String ringConfig) {
            this.putQueryParameter("RingConfig", ringConfig);
            this.ringConfig = ringConfig;
            return this;
        }

        @Override
        public BindAxnRequest build() {
            return new BindAxnRequest(this);
        } 

    } 

}
