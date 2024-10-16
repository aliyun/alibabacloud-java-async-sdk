// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.umeng_push20220225.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link SendByAliasFileIdRequest} extends {@link RequestModel}
 *
 * <p>SendByAliasFileIdRequest</p>
 */
public class SendByAliasFileIdRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AliasType")
    private String aliasType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AndroidPayload")
    private AndroidPayload androidPayload;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ChannelProperties")
    private ChannelProperties channelProperties;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("FileId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String fileId;

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

    private SendByAliasFileIdRequest(Builder builder) {
        super(builder);
        this.aliasType = builder.aliasType;
        this.androidPayload = builder.androidPayload;
        this.channelProperties = builder.channelProperties;
        this.description = builder.description;
        this.fileId = builder.fileId;
        this.iosPayload = builder.iosPayload;
        this.policy = builder.policy;
        this.productionMode = builder.productionMode;
        this.receiptType = builder.receiptType;
        this.receiptUrl = builder.receiptUrl;
        this.thirdPartyId = builder.thirdPartyId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SendByAliasFileIdRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
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
     * @return fileId
     */
    public String getFileId() {
        return this.fileId;
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

    public static final class Builder extends Request.Builder<SendByAliasFileIdRequest, Builder> {
        private String aliasType; 
        private AndroidPayload androidPayload; 
        private ChannelProperties channelProperties; 
        private String description; 
        private String fileId; 
        private IosPayload iosPayload; 
        private Policy policy; 
        private Boolean productionMode; 
        private Integer receiptType; 
        private String receiptUrl; 
        private String thirdPartyId; 

        private Builder() {
            super();
        } 

        private Builder(SendByAliasFileIdRequest request) {
            super(request);
            this.aliasType = request.aliasType;
            this.androidPayload = request.androidPayload;
            this.channelProperties = request.channelProperties;
            this.description = request.description;
            this.fileId = request.fileId;
            this.iosPayload = request.iosPayload;
            this.policy = request.policy;
            this.productionMode = request.productionMode;
            this.receiptType = request.receiptType;
            this.receiptUrl = request.receiptUrl;
            this.thirdPartyId = request.thirdPartyId;
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
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>PF835431668603208261</p>
         */
        public Builder fileId(String fileId) {
            this.putBodyParameter("FileId", fileId);
            this.fileId = fileId;
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

        @Override
        public SendByAliasFileIdRequest build() {
            return new SendByAliasFileIdRequest(this);
        } 

    } 

}
