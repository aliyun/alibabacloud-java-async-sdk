// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.umeng_push20220225.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link SendByFilterRequest} extends {@link RequestModel}
 *
 * <p>SendByFilterRequest</p>
 */
public class SendByFilterRequest extends Request {
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
    @com.aliyun.core.annotation.NameInMap("Filter")
    private String filter;

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

    private SendByFilterRequest(Builder builder) {
        super(builder);
        this.androidPayload = builder.androidPayload;
        this.androidShortPayload = builder.androidShortPayload;
        this.channelProperties = builder.channelProperties;
        this.description = builder.description;
        this.filter = builder.filter;
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

    public static SendByFilterRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
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
     * @return filter
     */
    public String getFilter() {
        return this.filter;
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

    public static final class Builder extends Request.Builder<SendByFilterRequest, Builder> {
        private AndroidPayload androidPayload; 
        private AndroidShortPayload androidShortPayload; 
        private ChannelProperties channelProperties; 
        private String description; 
        private String filter; 
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

        private Builder(SendByFilterRequest request) {
            super(request);
            this.androidPayload = request.androidPayload;
            this.androidShortPayload = request.androidShortPayload;
            this.channelProperties = request.channelProperties;
            this.description = request.description;
            this.filter = request.filter;
            this.iosPayload = request.iosPayload;
            this.policy = request.policy;
            this.productionMode = request.productionMode;
            this.receiptType = request.receiptType;
            this.receiptUrl = request.receiptUrl;
            this.thirdPartyId = request.thirdPartyId;
            this.callbackParams = request.callbackParams;
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
            this.putBodyParameter("AndroidShortPayload", androidShortPayload);
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
         * Filter.
         */
        public Builder filter(String filter) {
            this.putBodyParameter("Filter", filter);
            this.filter = filter;
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
        public SendByFilterRequest build() {
            return new SendByFilterRequest(this);
        } 

    } 

}
