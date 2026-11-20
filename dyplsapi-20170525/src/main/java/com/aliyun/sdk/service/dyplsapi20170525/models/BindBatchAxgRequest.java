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
 * {@link BindBatchAxgRequest} extends {@link RequestModel}
 *
 * <p>BindBatchAxgRequest</p>
 */
public class BindBatchAxgRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AxgBindList")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<AxgBindList> axgBindList;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PoolKey")
    private String poolKey;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    private BindBatchAxgRequest(Builder builder) {
        super(builder);
        this.axgBindList = builder.axgBindList;
        this.ownerId = builder.ownerId;
        this.poolKey = builder.poolKey;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static BindBatchAxgRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return axgBindList
     */
    public java.util.List<AxgBindList> getAxgBindList() {
        return this.axgBindList;
    }

    /**
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
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

    public static final class Builder extends Request.Builder<BindBatchAxgRequest, Builder> {
        private java.util.List<AxgBindList> axgBindList; 
        private Long ownerId; 
        private String poolKey; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 

        private Builder() {
            super();
        } 

        private Builder(BindBatchAxgRequest request) {
            super(request);
            this.axgBindList = request.axgBindList;
            this.ownerId = request.ownerId;
            this.poolKey = request.poolKey;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
        } 

        /**
         * <p>The list of AXG bindings.</p>
         * <p>This parameter is required.</p>
         */
        public Builder axgBindList(java.util.List<AxgBindList> axgBindList) {
            String axgBindListShrink = shrink(axgBindList, "AxgBindList", "json");
            this.putQueryParameter("AxgBindList", axgBindListShrink);
            this.axgBindList = axgBindList;
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
         * <p>The key of the number pool.</p>
         * <p>You can log on to the Phone Number Protection console and obtain the key on the <a href="https://dyplsnext.console.aliyun.com/number-pool">Number Pool Management</a> page.</p>
         * 
         * <strong>example:</strong>
         * <p>FC2235****</p>
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

        @Override
        public BindBatchAxgRequest build() {
            return new BindBatchAxgRequest(this);
        } 

    } 

    /**
     * 
     * {@link BindBatchAxgRequest} extends {@link TeaModel}
     *
     * <p>BindBatchAxgRequest</p>
     */
    public static class AxgBindList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ASRModelId")
        private String ASRModelId;

        @com.aliyun.core.annotation.NameInMap("ASRStatus")
        private Boolean ASRStatus;

        @com.aliyun.core.annotation.NameInMap("CallDisplayType")
        private Integer callDisplayType;

        @com.aliyun.core.annotation.NameInMap("CallRestrict")
        private String callRestrict;

        @com.aliyun.core.annotation.NameInMap("ExpectCity")
        private String expectCity;

        @com.aliyun.core.annotation.NameInMap("Expiration")
        private String expiration;

        @com.aliyun.core.annotation.NameInMap("GroupId")
        @com.aliyun.core.annotation.Validation(required = true)
        private String groupId;

        @com.aliyun.core.annotation.NameInMap("IsRecordingEnabled")
        private Boolean isRecordingEnabled;

        @com.aliyun.core.annotation.NameInMap("OutId")
        private String outId;

        @com.aliyun.core.annotation.NameInMap("OutOrderId")
        private String outOrderId;

        @com.aliyun.core.annotation.NameInMap("PhoneNoA")
        @com.aliyun.core.annotation.Validation(required = true)
        private String phoneNoA;

        @com.aliyun.core.annotation.NameInMap("PhoneNoB")
        private String phoneNoB;

        @com.aliyun.core.annotation.NameInMap("PhoneNoX")
        private String phoneNoX;

        @com.aliyun.core.annotation.NameInMap("RingConfig")
        private String ringConfig;

        private AxgBindList(Builder builder) {
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
            this.phoneNoA = builder.phoneNoA;
            this.phoneNoB = builder.phoneNoB;
            this.phoneNoX = builder.phoneNoX;
            this.ringConfig = builder.ringConfig;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AxgBindList create() {
            return builder().build();
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
         * @return ringConfig
         */
        public String getRingConfig() {
            return this.ringConfig;
        }

        public static final class Builder {
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
            private String phoneNoA; 
            private String phoneNoB; 
            private String phoneNoX; 
            private String ringConfig; 

            private Builder() {
            } 

            private Builder(AxgBindList model) {
                this.ASRModelId = model.ASRModelId;
                this.ASRStatus = model.ASRStatus;
                this.callDisplayType = model.callDisplayType;
                this.callRestrict = model.callRestrict;
                this.expectCity = model.expectCity;
                this.expiration = model.expiration;
                this.groupId = model.groupId;
                this.isRecordingEnabled = model.isRecordingEnabled;
                this.outId = model.outId;
                this.outOrderId = model.outOrderId;
                this.phoneNoA = model.phoneNoA;
                this.phoneNoB = model.phoneNoB;
                this.phoneNoX = model.phoneNoX;
                this.ringConfig = model.ringConfig;
            } 

            /**
             * <p>The ASR model ID. Valid values:</p>
             * <ul>
             * <li><p>The ID of the telephony model for Mandarin: 7ee372834d2f4cc7ac0d0ab2d0ae1aac</p>
             * </li>
             * <li><p>The ID of the telephony model for Cantonese: 9b4afe3d224e4fa3bf963697113e2f77</p>
             * </li>
             * <li><p>The ID of the telephony model for local accents: 3655a6cb94764145a1f9a38a3c3b3b4b</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>7ee372834d2f4cc7ac0d0ab2d0ae1aac</p>
             */
            public Builder ASRModelId(String ASRModelId) {
                this.ASRModelId = ASRModelId;
                return this;
            }

            /**
             * <p>The automatic speech recognition (ASR) status. Valid values:</p>
             * <ul>
             * <li><p><strong>false</strong> (default): The ASR feature is disabled.</p>
             * </li>
             * <li><p><strong>true</strong>: The ASR feature is enabled.</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder ASRStatus(Boolean ASRStatus) {
                this.ASRStatus = ASRStatus;
                return this;
            }

            /**
             * <p>Resets the number display logic for the binding. Set the value to <strong>1</strong>. This indicates that the intermediate number (Number X) is displayed to both the calling and called parties.</p>
             * <blockquote>
             * <p>Due to carrier regulations, the feature of displaying real numbers is not supported.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder callDisplayType(Integer callDisplayType) {
                this.callDisplayType = callDisplayType;
                return this;
            }

            /**
             * <p>The one-way call restriction. Valid values:</p>
             * <ul>
             * <li><p><strong>CONTROL_AX_DISABLE</strong>: Number A cannot call Number X.</p>
             * </li>
             * <li><p><strong>CONTROL_BX_DISABLE</strong>: Number B cannot call Number X.</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>CONTROL_AX_DISABLE</p>
             */
            public Builder callRestrict(String callRestrict) {
                this.callRestrict = callRestrict;
                return this;
            }

            /**
             * <p>The city to which Number X belongs.</p>
             * <blockquote>
             * <ul>
             * <li><p>If no numbers are available in the specified city, or if this parameter is not specified, a number from another city in the current number pool is randomly selected and used as Number X.</p>
             * </li>
             * <li><p>If <strong>Number X Assignment Mode</strong> is set to <strong>Strict Match Mode</strong> and no eligible number is found, an allocation error is reported.</p>
             * </li>
             * </ul>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>北京</p>
             */
            public Builder expectCity(String expectCity) {
                this.expectCity = expectCity;
                return this;
            }

            /**
             * <p>The expiration time of the binding. The value is accurate to seconds.</p>
             * <blockquote>
             * <ul>
             * <li><p>The expiration time must be more than 1 minute later than the current time.</p>
             * </li>
             * <li><p>This parameter is required.</p>
             * </li>
             * </ul>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>2022-07-11 01:05:15</p>
             */
            public Builder expiration(String expiration) {
                this.expiration = expiration;
                return this;
            }

            /**
             * <p>The group ID (GID) in the AXG binding.</p>
             * <p>You can view the GID in the following ways:</p>
             * <ul>
             * <li><p>Log on to the Phone Number Protection console. On the <a href="https://dyplsnext.console.aliyun.com/number-pool">Number Pool Management</a> page, select <strong>AXG Privacy Number</strong> and click <strong>G Number Group Management</strong> to view the GIDs of all G number groups.</p>
             * </li>
             * <li><p>If you use the <a href="https://help.aliyun.com/document_detail/110250.html">CreateAxgGroup</a> operation to create a G number group, the value of the <strong>GroupId</strong> parameter in the response is the GID.</p>
             * </li>
             * </ul>
             * <blockquote>
             * <p>The G number group must contain at least one phone number.</p>
             * </blockquote>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>200001234****</p>
             */
            public Builder groupId(String groupId) {
                this.groupId = groupId;
                return this;
            }

            /**
             * <p>Specifies whether to record all calls made in the binding. Valid values:</p>
             * <ul>
             * <li><p><strong>true</strong>: Call recording is enabled.</p>
             * </li>
             * <li><p><strong>false</strong> (default): Call recording is disabled.</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder isRecordingEnabled(Boolean isRecordingEnabled) {
                this.isRecordingEnabled = isRecordingEnabled;
                return this;
            }

            /**
             * <p>The extension field. This parameter is carried in call record messages.</p>
             * 
             * <strong>example:</strong>
             * <p>1***********0fd</p>
             */
            public Builder outId(String outId) {
                this.outId = outId;
                return this;
            }

            /**
             * <p>The external business ID.</p>
             * 
             * <strong>example:</strong>
             * <p>20***************677</p>
             */
            public Builder outOrderId(String outOrderId) {
                this.outOrderId = outOrderId;
                return this;
            }

            /**
             * <p>Number A in the AXG binding. Number A can be a mobile phone number or a landline number. If you use a landline number, add the area code, and do not add a hyphen between the area code and the landline number.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>139****0000</p>
             */
            public Builder phoneNoA(String phoneNoA) {
                this.phoneNoA = phoneNoA;
                return this;
            }

            /**
             * <p>Number B in the AXG binding.</p>
             * <p>Number B can be a mobile phone number or a landline number. If you use a landline number, add the area code, and do not add a hyphen between the area code and the landline number.</p>
             * <blockquote>
             * <ul>
             * <li><p>When Number A calls Number X, the call is transferred to Number B by default. If Number B is not specified, the call fails.</p>
             * </li>
             * <li><p>When Number A calls Number X, if <strong>A Callback Mode</strong> is set to <strong>Default Mode</strong>, the call is transferred to Number B. Otherwise, the call fails.</p>
             * </li>
             * <li><p>To modify <strong>A Callback Mode</strong>, on the <a href="https://dyplsnext.console.aliyun.com/number-pool?resType=1">Number Pool Management</a> page, select <strong>AXG Privacy Number</strong> and choose <strong>Pool Management</strong> &gt; <strong>A Callback Mode</strong> &gt; <strong>Adjust Configuration</strong>.</p>
             * </li>
             * <li><p>To update Number B, call the <a href="https://help.aliyun.com/zh/pnp/developer-reference/api-dyplsapi-2017-05-25-updatesubscription?spm=a2c4g.11186623.0.i16">UpdateSubscription</a> operation.</p>
             * </li>
             * </ul>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>138****0000</p>
             */
            public Builder phoneNoB(String phoneNoB) {
                this.phoneNoB = phoneNoB;
                return this;
            }

            /**
             * <p>Number X in the AXG binding.</p>
             * <p>Number X must be a <a href="https://dyplsnext.console.aliyun.com/numberbuy?spm=a2c4g.11186623.0.0.7e6449bbtiHP8m">purchased privacy number</a>. You can log on to the Phone Number Protection console, go to the <a href="https://dyplsnext.console.aliyun.com/number/list">Number Management</a> page, and then select <strong>AXG Privacy Number</strong> to obtain Number X.</p>
             * <blockquote>
             * <p>If you do not specify Number X, a random number is selected from the number pool based on the <strong>ExpectCity</strong> parameter and used as Number X.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>139****1111</p>
             */
            public Builder phoneNoX(String phoneNoX) {
                this.phoneNoX = phoneNoX;
                return this;
            }

            /**
             * <p>The corporate ringback tone (CRBT) that is played when Number X in an AXG binding is called.</p>
             * <p>You must specify the <strong>ringtone field</strong> and the <strong>CRBT code</strong>.</p>
             * <p>Valid values for the <strong>ringtone field</strong>:</p>
             * <ul>
             * <li><p><code>AXGRing_AB</code>: the ringtone for calls from Number A to Number X (with a callback number).</p>
             * </li>
             * <li><p><code>AXGRing_A</code>: the ringtone for calls from Number A to Number X (without a callback number).</p>
             * </li>
             * <li><p><code>AXGRing_G</code>: the ringtone for calls from a number in Group G to Number X.</p>
             * </li>
             * </ul>
             * <p><strong>CRBT code</strong>:</p>
             * <p>You can log on to the Phone Number Protection console and obtain the CRBT code on the <a href="https://dyplsnext.console.aliyun.com/number-pool/ringtone?resType=1">Corporate CRBT Management</a> page.</p>
             * <p><strong>Example</strong>:</p>
             * <p>To set the ringtone for calls from Number A to Number X (without a callback number), specify <code>&quot;AXGRing_A&quot;: &quot;1000****1&quot;</code>.</p>
             * <blockquote>
             * <p>The CRBT that is set at the binding level takes precedence over the CRBT that is set at the number pool level.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>{&quot;AXGRing_AB&quot;:&quot;1000<strong><strong>2&quot;,&quot;AXGRing_A&quot;:&quot;1000</strong></strong>1&quot;}</p>
             */
            public Builder ringConfig(String ringConfig) {
                this.ringConfig = ringConfig;
                return this;
            }

            public AxgBindList build() {
                return new AxgBindList(this);
            } 

        } 

    }
}
