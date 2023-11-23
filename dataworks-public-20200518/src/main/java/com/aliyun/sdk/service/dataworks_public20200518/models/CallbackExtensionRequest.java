// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20200518.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CallbackExtensionRequest} extends {@link RequestModel}
 *
 * <p>CallbackExtensionRequest</p>
 */
public class CallbackExtensionRequest extends Request {
    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Body
    @NameInMap("CheckMessage")
    private String checkMessage;

    @Body
    @NameInMap("CheckResult")
    @Validation(required = true)
    private String checkResult;

    @Body
    @NameInMap("ExtensionCode")
    @Validation(required = true)
    private String extensionCode;

    @Body
    @NameInMap("MessageId")
    @Validation(required = true)
    private String messageId;

    private CallbackExtensionRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.checkMessage = builder.checkMessage;
        this.checkResult = builder.checkResult;
        this.extensionCode = builder.extensionCode;
        this.messageId = builder.messageId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CallbackExtensionRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return checkMessage
     */
    public String getCheckMessage() {
        return this.checkMessage;
    }

    /**
     * @return checkResult
     */
    public String getCheckResult() {
        return this.checkResult;
    }

    /**
     * @return extensionCode
     */
    public String getExtensionCode() {
        return this.extensionCode;
    }

    /**
     * @return messageId
     */
    public String getMessageId() {
        return this.messageId;
    }

    public static final class Builder extends Request.Builder<CallbackExtensionRequest, Builder> {
        private String regionId; 
        private String checkMessage; 
        private String checkResult; 
        private String extensionCode; 
        private String messageId; 

        private Builder() {
            super();
        } 

        private Builder(CallbackExtensionRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.checkMessage = request.checkMessage;
            this.checkResult = request.checkResult;
            this.extensionCode = request.extensionCode;
            this.messageId = request.messageId;
        } 

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * CheckMessage.
         */
        public Builder checkMessage(String checkMessage) {
            this.putBodyParameter("CheckMessage", checkMessage);
            this.checkMessage = checkMessage;
            return this;
        }

        /**
         * CheckResult.
         */
        public Builder checkResult(String checkResult) {
            this.putBodyParameter("CheckResult", checkResult);
            this.checkResult = checkResult;
            return this;
        }

        /**
         * ExtensionCode.
         */
        public Builder extensionCode(String extensionCode) {
            this.putBodyParameter("ExtensionCode", extensionCode);
            this.extensionCode = extensionCode;
            return this;
        }

        /**
         * MessageId.
         */
        public Builder messageId(String messageId) {
            this.putBodyParameter("MessageId", messageId);
            this.messageId = messageId;
            return this;
        }

        @Override
        public CallbackExtensionRequest build() {
            return new CallbackExtensionRequest(this);
        } 

    } 

}
