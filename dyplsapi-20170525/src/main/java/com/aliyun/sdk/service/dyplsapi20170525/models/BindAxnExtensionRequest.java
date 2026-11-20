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
 * {@link BindAxnExtensionRequest} extends {@link RequestModel}
 *
 * <p>BindAxnExtensionRequest</p>
 */
public class BindAxnExtensionRequest extends Request {
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
    @com.aliyun.core.annotation.NameInMap("Extension")
    private String extension;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IsRecordingEnabled")
    private Boolean isRecordingEnabled;

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

    private BindAxnExtensionRequest(Builder builder) {
        super(builder);
        this.ASRModelId = builder.ASRModelId;
        this.ASRStatus = builder.ASRStatus;
        this.callDisplayType = builder.callDisplayType;
        this.callRestrict = builder.callRestrict;
        this.expectCity = builder.expectCity;
        this.expiration = builder.expiration;
        this.extend = builder.extend;
        this.extension = builder.extension;
        this.isRecordingEnabled = builder.isRecordingEnabled;
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

    public static BindAxnExtensionRequest create() {
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
     * @return extension
     */
    public String getExtension() {
        return this.extension;
    }

    /**
     * @return isRecordingEnabled
     */
    public Boolean getIsRecordingEnabled() {
        return this.isRecordingEnabled;
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

    public static final class Builder extends Request.Builder<BindAxnExtensionRequest, Builder> {
        private String ASRModelId; 
        private Boolean ASRStatus; 
        private Integer callDisplayType; 
        private String callRestrict; 
        private String expectCity; 
        private String expiration; 
        private String extend; 
        private String extension; 
        private Boolean isRecordingEnabled; 
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

        private Builder(BindAxnExtensionRequest request) {
            super(request);
            this.ASRModelId = request.ASRModelId;
            this.ASRStatus = request.ASRStatus;
            this.callDisplayType = request.callDisplayType;
            this.callRestrict = request.callRestrict;
            this.expectCity = request.expectCity;
            this.expiration = request.expiration;
            this.extend = request.extend;
            this.extension = request.extension;
            this.isRecordingEnabled = request.isRecordingEnabled;
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
         * <li><p>General-Telephone-Mandarin Chinese model ID: 7ee372834d2f4cc7ac0d0ab2d0ae1aac</p>
         * </li>
         * <li><p>General-Telephone-Cantonese model ID: 9b4afe3d224e4fa3bf963697113e2f77</p>
         * </li>
         * <li><p>General-Telephone-Regional accent model ID: 3655a6cb94764145a1f9a38a3c3b3b4b</p>
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
         * <p>Resets the number display logic in the binding relationship. Set the value to <strong>1</strong>, which indicates that the intermediate number X is displayed for both the caller and the callee.</p>
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
         * <p>The call restriction status. Valid values:</p>
         * <ul>
         * <li><strong>CONTROL_AX_DISABLE</strong>: Number A cannot call number X.</li>
         * <li><strong>CONTROL_BX_DISABLE</strong>: Number B cannot call number X.</li>
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
         * <p>The city where you want to select number X.</p>
         * <blockquote>
         * <ul>
         * <li>If no available numbers exist in the specified city in the current number pool, or if this parameter is not specified, the system randomly assigns a number from another city in the current number pool as number X.</li>
         * <li>If the <strong>number X allocation mode</strong> is set to <strong>strict match mode</strong>, the system returns an allocation error when no eligible numbers are available.</li>
         * </ul>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>Beijing</p>
         */
        public Builder expectCity(String expectCity) {
            this.putQueryParameter("ExpectCity", expectCity);
            this.expectCity = expectCity;
            return this;
        }

        /**
         * <p>The expiration time of the binding relationship. The time is accurate to seconds.</p>
         * <blockquote>
         * <p>The expiration time must be at least 1 minute later than the current time.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>2019-09-05 12:00:00</p>
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
         * <p>The extension number of number X. The extension number must be 1 to 3 digits in length.</p>
         * <blockquote>
         * <p>If you specify an extension number, you must also specify number X. This means that both the Extension and PhoneNoX parameters must be specified.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>130</p>
         */
        public Builder extension(String extension) {
            this.putQueryParameter("Extension", extension);
            this.extension = extension;
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
         * <p>abcdef</p>
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
         * <p>The number A of the AXN extension number.
         * Number A can be a mobile phone number or a landline number. For a landline number, you must add the area code. Do not add a hyphen between the area code and the phone number.</p>
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
         * <p>The number B of the AXN extension number.</p>
         * <p>Number B can be a mobile phone number or a landline number. For a landline number, you must add the area code. Do not add a hyphen between the area code and the phone number.</p>
         * <blockquote>
         * <ul>
         * <li>When number A calls number X, the call is forwarded to number B by default. If number B is not specified, the call cannot be connected.</li>
         * <li>When number A calls number X, the call is forwarded to number B only when the <strong>callback mode for number A</strong> is set to <strong>default mode</strong>. If it is not set to <strong>default mode</strong>, the call cannot be connected.</li>
         * <li>To modify the <strong>callback mode for number A</strong>, go to <a href="https://dyplsnext.console.aliyun.com/number-pool?resType=1">Number Pool Management</a> &gt; filter by <strong>AXN Extension Number</strong> &gt; <strong>Number Pool Management</strong> &gt; <strong>Callback Mode for Number A</strong> &gt; <strong>Adjust Configuration</strong>.</li>
         * <li>To update number B, call the <a href="https://www.alibabacloud.com/help/en/pnp/developer-reference/api-dyplsapi-2017-05-25-updatesubscription">UpdateSubscription</a> operation.</li>
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
         * <p>The number X of the AXN extension number.</p>
         * <p>Number X is a privacy number that you have <a href="https://dyplsnext.console.aliyun.com/numberbuy?spm=a2c4g.11186623.0.0.7e6449bbtiHP8m">purchased</a> in the console.</p>
         * <blockquote>
         * <p>If you do not specify number X, the system randomly assigns a number from the specified number pool as number X based on the ExpectCity parameter.</p>
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
         * <p>The key of the number pool.</p>
         * <p>You can obtain the <strong>number pool key</strong> on the <a href="https://dyplsnext.console.aliyun.com/number-pool?spm=a2c4g.11186623.0.0.7e6449bbtiHP8m">Number Pool Management</a> page in the Privacy Protection console.</p>
         * 
         * <strong>example:</strong>
         * <p>FC10000011111****</p>
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
         * <p>Set the corporate ringback tone for dial-up to number X after the AXN extension number is bound.</p>
         * <p>Specify the <strong>ringtone field</strong> and <strong>ringback tone encoding</strong> for this parameter.</p>
         * <p>Valid values for the <strong>ringtone field</strong>:</p>
         * <ul>
         * <li>AXNRing_AB: The ringtone settings before number A calls number X and the call is connected (with a callback number) in the AXN extension number scenario.</li>
         * <li>AXNRing_A: The ringtone settings before number A calls number X and the call is connected (without a callback number) in the AXN extension number scenario.</li>
         * <li>AXNRing_N: The ringtone settings before the number on side N calls number X and the call is connected in the AXN extension number scenario.</li>
         * <li>AXNRing_A_PICKUP: The ringtone settings after number A calls number X and the call is connected in the AXN extension number scenario.</li>
         * <li>AXNRing_N_PICKUP: The ringtone settings after the number on side N calls number X and the call is connected in the AXN extension number scenario.</li>
         * </ul>
         * <p><strong>Ringback tone encoding</strong>:</p>
         * <p>You can obtain the corporate ringback tone encoding on the <a href="https://dyplsnext.console.aliyun.com/number-pool/ringtone?resType=1">Corporate Ringback Tone Management</a> page in the Privacy Protection console.</p>
         * <p><strong>Example</strong>:</p>
         * <p>To set the ringtone before number A calls number X and the call is connected (without a callback number), enter &quot;AXNRing_A&quot;: &quot;1000****1&quot;.</p>
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
        public BindAxnExtensionRequest build() {
            return new BindAxnExtensionRequest(this);
        } 

    } 

}
