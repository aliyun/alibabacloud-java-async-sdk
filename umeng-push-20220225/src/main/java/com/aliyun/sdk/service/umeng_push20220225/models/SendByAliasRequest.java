// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.umeng_push20220225.models;

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
 * {@link SendByAliasRequest} extends {@link RequestModel}
 *
 * <p>SendByAliasRequest</p>
 */
public class SendByAliasRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Alias")
    @com.aliyun.core.annotation.Validation(required = true)
    private String alias;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AliasType")
    private String aliasType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AndroidPayload")
    private AndroidPayload androidPayload;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AndroidShortPayload")
    private AndroidShortPayload androidShortPayload;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ChannelProperties")
    private ChannelProperties channelProperties;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("HarmonyPayload")
    private HarmonyPayload harmonyPayload;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("IosPayload")
    private IosPayload iosPayload;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Policy")
    private Policy policy;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ProductionMode")
    private Boolean productionMode;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ReceiptType")
    private Integer receiptType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ReceiptUrl")
    private String receiptUrl;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ThirdPartyId")
    private String thirdPartyId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("callbackParams")
    private String callbackParams;

    private SendByAliasRequest(Builder builder) {
        super(builder);
        this.alias = builder.alias;
        this.aliasType = builder.aliasType;
        this.androidPayload = builder.androidPayload;
        this.androidShortPayload = builder.androidShortPayload;
        this.channelProperties = builder.channelProperties;
        this.description = builder.description;
        this.harmonyPayload = builder.harmonyPayload;
        this.iosPayload = builder.iosPayload;
        this.policy = builder.policy;
        this.productionMode = builder.productionMode;
        this.receiptType = builder.receiptType;
        this.receiptUrl = builder.receiptUrl;
        this.thirdPartyId = builder.thirdPartyId;
        this.callbackParams = builder.callbackParams;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SendByAliasRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return alias
     */
    public String getAlias() {
        return this.alias;
    }

    /**
     * @return aliasType
     */
    public String getAliasType() {
        return this.aliasType;
    }

    /**
     * @return androidPayload
     */
    public AndroidPayload getAndroidPayload() {
        return this.androidPayload;
    }

    /**
     * @return androidShortPayload
     */
    public AndroidShortPayload getAndroidShortPayload() {
        return this.androidShortPayload;
    }

    /**
     * @return channelProperties
     */
    public ChannelProperties getChannelProperties() {
        return this.channelProperties;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return harmonyPayload
     */
    public HarmonyPayload getHarmonyPayload() {
        return this.harmonyPayload;
    }

    /**
     * @return iosPayload
     */
    public IosPayload getIosPayload() {
        return this.iosPayload;
    }

    /**
     * @return policy
     */
    public Policy getPolicy() {
        return this.policy;
    }

    /**
     * @return productionMode
     */
    public Boolean getProductionMode() {
        return this.productionMode;
    }

    /**
     * @return receiptType
     */
    public Integer getReceiptType() {
        return this.receiptType;
    }

    /**
     * @return receiptUrl
     */
    public String getReceiptUrl() {
        return this.receiptUrl;
    }

    /**
     * @return thirdPartyId
     */
    public String getThirdPartyId() {
        return this.thirdPartyId;
    }

    /**
     * @return callbackParams
     */
    public String getCallbackParams() {
        return this.callbackParams;
    }

    public static final class Builder extends Request.Builder<SendByAliasRequest, Builder> {
        private String alias; 
        private String aliasType; 
        private AndroidPayload androidPayload; 
        private AndroidShortPayload androidShortPayload; 
        private ChannelProperties channelProperties; 
        private String description; 
        private HarmonyPayload harmonyPayload; 
        private IosPayload iosPayload; 
        private Policy policy; 
        private Boolean productionMode; 
        private Integer receiptType; 
        private String receiptUrl; 
        private String thirdPartyId; 
        private String callbackParams; 

        private Builder() {
            super();
        } 

        private Builder(SendByAliasRequest request) {
            super(request);
            this.alias = request.alias;
            this.aliasType = request.aliasType;
            this.androidPayload = request.androidPayload;
            this.androidShortPayload = request.androidShortPayload;
            this.channelProperties = request.channelProperties;
            this.description = request.description;
            this.harmonyPayload = request.harmonyPayload;
            this.iosPayload = request.iosPayload;
            this.policy = request.policy;
            this.productionMode = request.productionMode;
            this.receiptType = request.receiptType;
            this.receiptUrl = request.receiptUrl;
            this.thirdPartyId = request.thirdPartyId;
            this.callbackParams = request.callbackParams;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        public Builder alias(String alias) {
            this.putBodyParameter("Alias", alias);
            this.alias = alias;
            return this;
        }

        /**
         * AliasType.
         */
        public Builder aliasType(String aliasType) {
            this.putBodyParameter("AliasType", aliasType);
            this.aliasType = aliasType;
            return this;
        }

        /**
         * AndroidPayload.
         */
        public Builder androidPayload(AndroidPayload androidPayload) {
            String androidPayloadShrink = shrink(androidPayload, "AndroidPayload", "json");
            this.putBodyParameter("AndroidPayload", androidPayloadShrink);
            this.androidPayload = androidPayload;
            return this;
        }

        /**
         * AndroidShortPayload.
         */
        public Builder androidShortPayload(AndroidShortPayload androidShortPayload) {
            String androidShortPayloadShrink = shrink(androidShortPayload, "AndroidShortPayload", "json");
            this.putBodyParameter("AndroidShortPayload", androidShortPayloadShrink);
            this.androidShortPayload = androidShortPayload;
            return this;
        }

        /**
         * ChannelProperties.
         */
        public Builder channelProperties(ChannelProperties channelProperties) {
            String channelPropertiesShrink = shrink(channelProperties, "ChannelProperties", "json");
            this.putBodyParameter("ChannelProperties", channelPropertiesShrink);
            this.channelProperties = channelProperties;
            return this;
        }

        /**
         * Description.
         */
        public Builder description(String description) {
            this.putBodyParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * HarmonyPayload.
         */
        public Builder harmonyPayload(HarmonyPayload harmonyPayload) {
            String harmonyPayloadShrink = shrink(harmonyPayload, "HarmonyPayload", "json");
            this.putBodyParameter("HarmonyPayload", harmonyPayloadShrink);
            this.harmonyPayload = harmonyPayload;
            return this;
        }

        /**
         * IosPayload.
         */
        public Builder iosPayload(IosPayload iosPayload) {
            String iosPayloadShrink = shrink(iosPayload, "IosPayload", "json");
            this.putBodyParameter("IosPayload", iosPayloadShrink);
            this.iosPayload = iosPayload;
            return this;
        }

        /**
         * Policy.
         */
        public Builder policy(Policy policy) {
            String policyShrink = shrink(policy, "Policy", "json");
            this.putBodyParameter("Policy", policyShrink);
            this.policy = policy;
            return this;
        }

        /**
         * ProductionMode.
         */
        public Builder productionMode(Boolean productionMode) {
            this.putBodyParameter("ProductionMode", productionMode);
            this.productionMode = productionMode;
            return this;
        }

        /**
         * ReceiptType.
         */
        public Builder receiptType(Integer receiptType) {
            this.putBodyParameter("ReceiptType", receiptType);
            this.receiptType = receiptType;
            return this;
        }

        /**
         * ReceiptUrl.
         */
        public Builder receiptUrl(String receiptUrl) {
            this.putBodyParameter("ReceiptUrl", receiptUrl);
            this.receiptUrl = receiptUrl;
            return this;
        }

        /**
         * ThirdPartyId.
         */
        public Builder thirdPartyId(String thirdPartyId) {
            this.putBodyParameter("ThirdPartyId", thirdPartyId);
            this.thirdPartyId = thirdPartyId;
            return this;
        }

        /**
         * callbackParams.
         */
        public Builder callbackParams(String callbackParams) {
            this.putBodyParameter("callbackParams", callbackParams);
            this.callbackParams = callbackParams;
            return this;
        }

        @Override
        public SendByAliasRequest build() {
            return new SendByAliasRequest(this);
        } 

    } 

}
