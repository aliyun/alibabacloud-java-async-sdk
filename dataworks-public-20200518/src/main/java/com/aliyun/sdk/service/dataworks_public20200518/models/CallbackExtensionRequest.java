// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20200518.models;

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
 * {@link CallbackExtensionRequest} extends {@link RequestModel}
 *
 * <p>CallbackExtensionRequest</p>
 */
public class CallbackExtensionRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("CheckMessage")
    private String checkMessage;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("CheckResult")
    @com.aliyun.core.annotation.Validation(required = true)
    private String checkResult;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ExtensionCode")
    @com.aliyun.core.annotation.Validation(required = true)
    private String extensionCode;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("MessageId")
    @com.aliyun.core.annotation.Validation(required = true)
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
         * <p>The check message of the extension point event. If CheckResult is set to FAIL, you must provide the failure cause.</p>
         * 
         * <strong>example:</strong>
         * <p>The xxx rule is hit. Modify it and try again.</p>
         */
        public Builder checkMessage(String checkMessage) {
            this.putBodyParameter("CheckMessage", checkMessage);
            this.checkMessage = checkMessage;
            return this;
        }

        /**
         * <p>The check status of the extension point event. Valid values:</p>
         * <ul>
         * <li>OK: The event passes the check.</li>
         * <li>FAIL: The event fails to pass the check. You must check and handle the reported error at the earliest opportunity to ensure that your program is run as expected.</li>
         * <li>WARN: The event passes the check, but an alert is reported.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>FAIL</p>
         */
        public Builder checkResult(String checkResult) {
            this.putBodyParameter("CheckResult", checkResult);
            this.checkResult = checkResult;
            return this;
        }

        /**
         * <p>The unique code of the extension.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>8abcb91f-d266-4073-b907-2ed670378ed1</p>
         */
        public Builder extensionCode(String extensionCode) {
            this.putBodyParameter("ExtensionCode", extensionCode);
            this.extensionCode = extensionCode;
            return this;
        }

        /**
         * <p>The message ID in DataWorks OpenEvent. You can obtain the ID from a received message when an extension point event is triggered.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>03400b03-b721-4c34-8727-2d6884077091</p>
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
