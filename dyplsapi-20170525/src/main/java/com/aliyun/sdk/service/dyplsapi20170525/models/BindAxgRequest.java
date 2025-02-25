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
 * {@link BindAxgRequest} extends {@link RequestModel}
 *
 * <p>BindAxgRequest</p>
 */
public class BindAxgRequest extends Request {
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
    @com.aliyun.core.annotation.NameInMap("GroupId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String groupId;

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

    private BindAxgRequest(Builder builder) {
        super(builder);
        this.ASRModelId = builder.ASRModelId;
        this.ASRStatus = builder.ASRStatus;
        this.callDisplayType = builder.callDisplayType;
        this.callRestrict = builder.callRestrict;
        this.expectCity = builder.expectCity;
        this.expiration = builder.expiration;
        this.groupId = builder.groupId;
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

    public static BindAxgRequest create() {
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
     * @return groupId
     */
    public String getGroupId() {
        return this.groupId;
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

    public static final class Builder extends Request.Builder<BindAxgRequest, Builder> {
        private String ASRModelId; 
        private Boolean ASRStatus; 
        private Integer callDisplayType; 
        private String callRestrict; 
        private String expectCity; 
        private String expiration; 
        private String groupId; 
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

        private Builder(BindAxgRequest request) {
            super(request);
            this.ASRModelId = request.ASRModelId;
            this.ASRStatus = request.ASRStatus;
            this.callDisplayType = request.callDisplayType;
            this.callRestrict = request.callRestrict;
            this.expectCity = request.expectCity;
            this.expiration = request.expiration;
            this.groupId = request.groupId;
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
         * <p>The ID of the ASR model.</p>
         * 
         * <strong>example:</strong>
         * <p>980abddb908f48e8b987cb2cd303****</p>
         */
        public Builder ASRModelId(String ASRModelId) {
            this.putQueryParameter("ASRModelId", ASRModelId);
            this.ASRModelId = ASRModelId;
            return this;
        }

        /**
         * <p>Specifies whether to enable automatic speech recognition (ASR). Valid values:</p>
         * <ul>
         * <li><strong>False</strong> (default): disables ASR.</li>
         * <li><strong>True</strong>: enables ASR.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>False</p>
         */
        public Builder ASRStatus(Boolean ASRStatus) {
            this.putQueryParameter("ASRStatus", ASRStatus);
            this.ASRStatus = ASRStatus;
            return this;
        }

        /**
         * <p>Re-sets the phone number display logic in the AXG binding. Fixed value: <strong>1</strong>, indicating that phone number X is displayed on both the calling phone and the called phone.</p>
         * <blockquote>
         * <p> Due to the regulatory restrictions imposed by carriers, the setting to display real phone numbers during calls does not take effect.</p>
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
         * <p>The status of call restrictions. Valid values:</p>
         * <ul>
         * <li><strong>CONTROL_AX_DISABLE</strong>: Phone number A cannot be used to call phone number X.</li>
         * <li><strong>CONTROL_BX_DISABLE</strong>: Phone number B cannot be used to call phone number X.</li>
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
         * <p>Specifies the city to which phone number X to be selected belongs.</p>
         * <ul>
         * <li>If no phone number for the specified city is available in the current phone number pool or this parameter is not specified, a phone number that belongs to another city is randomly selected from the current phone number pool and assigned as phone number X.</li>
         * <li>If Number X Assignment Mode is set to Strict Matching Mode and no phone number meets the requirement, the system displays an allocation error.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>hangzhou</p>
         */
        public Builder expectCity(String expectCity) {
            this.putQueryParameter("ExpectCity", expectCity);
            this.expectCity = expectCity;
            return this;
        }

        /**
         * <p>The expiration time of the AXG binding. The value is accurate to seconds.</p>
         * <blockquote>
         * <p> The expiration time must be more than 1 minute later than the time when you call this API operation.</p>
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
         * <p>The group ID in the AXG binding. You can view the group ID by using either of the following methods:</p>
         * <ul>
         * <li>On the <strong>Number Pool Management</strong> page in the <a href="https://dypls.console.aliyun.com/dypls.htm#/account">Phone Number Protection console</a>, filter AXG privacy numbers and click <strong>Number Group G Management</strong> to view the group IDs of number groups G.****</li>
         * <li>If the <a href="https://help.aliyun.com/document_detail/110250.html">CreateAxgGroup</a> operation is called to create number group G, the value of <strong>GroupId</strong> in the response of the CreateAxgGroup operation is specified as the value of the request parameter <strong>GroupId</strong> of the BindAxg operation.</li>
         * </ul>
         * <blockquote>
         * <p> Number group G must have one or more phone numbers.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1234</p>
         */
        public Builder groupId(String groupId) {
            this.putQueryParameter("GroupId", groupId);
            this.groupId = groupId;
            return this;
        }

        /**
         * <p>Specifies whether to record all calls made by the bound phone numbers.</p>
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
         * <p>The extension field for the external business. This parameter is returned in a call record receipt.</p>
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
         * <p>The ID of the external business.</p>
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
         * <p>Phone number A in the AXG binding. Phone number A can be set to a mobile phone number or a landline phone number. The landline phone number must be added with an area code, and no hyphen is required between the area code and the landline phone number.</p>
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
         * <p>Phone number B in the AXG binding. If phone number A is used to call phone number X, the call is forwarded to phone number B. If you need to update phone number B, call the <a href="https://help.aliyun.com/document_detail/110253.html">UpdateSubscription</a> operation.</p>
         * <p>Phone number B can be set to a mobile phone number or a landline phone number. The landline phone number must be added with an area code, and no hyphen is required between the area code and the landline phone number.</p>
         * 
         * <strong>example:</strong>
         * <p>139****0000</p>
         */
        public Builder phoneNoB(String phoneNoB) {
            this.putQueryParameter("PhoneNoB", phoneNoB);
            this.phoneNoB = phoneNoB;
            return this;
        }

        /**
         * <p>Phone number X in the AXG binding. If you do not specify this parameter, a random phone number is selected from the phone number pool based on the value of the <strong>ExpectCity</strong> parameter and is used as phone number X.</p>
         * <blockquote>
         * <p> Phone number X is the phone number that you purchased in the Phone Number Protection console or by using the <a href="https://help.aliyun.com/document_detail/110266.html">BuySecretNo</a> operation before you bind a phone number. Phone number X is used to forward calls.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>139****0000</p>
         */
        public Builder phoneNoX(String phoneNoX) {
            this.putQueryParameter("PhoneNoX", phoneNoX);
            this.phoneNoX = phoneNoX;
            return this;
        }

        /**
         * <p>The key of the phone number pool. Log on to the <a href="https://dypls.console.aliyun.com/dypls.htm#/account">Phone Number Protection console</a> and view the key of the phone number pool on the <strong>Number Pool Management</strong> page.</p>
         * 
         * <strong>example:</strong>
         * <p>FC123456</p>
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
         * <p>Sets the ringtone for enterprise Color Ring Back Tone (CRBT) in the AXG binding.</p>
         * <ul>
         * <li>Ringtone setting (with a callback number) when phone number A is used to call phone number X in the AXG binding: AXGRing_AB</li>
         * <li>Ringtone setting (without a callback number) when phone number A is used to call phone number X in the AXG binding: AXGRing_A</li>
         * <li>Ringtone setting when a phone number in number group G is used to call phone number X in the AXG binding: AXGRing_G</li>
         * <li>Enterprise CRBT codes: Enterprise CRBT codes can be queried in the Phone Number Protection console. You can choose <strong>Number Pool Management &gt; Enterprise CRBT Management</strong> to view and manage enterprise CRBT codes. You can also upload, delete, or perform other operations on enterprise CRBT codes.</li>
         * </ul>
         * <blockquote>
         * <p> The bound enterprise CRBTs are preferentially used. If no enterprise CRBT is set or the setting does not take effect, the enterprise CRBTs at the phone number pool level are used.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>{&quot;AXGRing_AB&quot;:&quot;100000001&quot;,&quot;AXGRing_A&quot;:&quot;100000002&quot;,&quot;AXGRing_G&quot;:&quot;100000003&quot;}</p>
         */
        public Builder ringConfig(String ringConfig) {
            this.putQueryParameter("RingConfig", ringConfig);
            this.ringConfig = ringConfig;
            return this;
        }

        @Override
        public BindAxgRequest build() {
            return new BindAxgRequest(this);
        } 

    } 

}
