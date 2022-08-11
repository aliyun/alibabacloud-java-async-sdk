// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20200518.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateIDEEventResultRequest} extends {@link RequestModel}
 *
 * <p>UpdateIDEEventResultRequest</p>
 */
public class UpdateIDEEventResultRequest extends Request {
    @Body
    @NameInMap("CheckResult")
    private String checkResult;

    @Body
    @NameInMap("CheckResultTip")
    private String checkResultTip;

    @Body
    @NameInMap("ExtensionCode")
    private String extensionCode;

    @Body
    @NameInMap("MessageId")
    private String messageId;

    @Host
    @NameInMap("RegionId")
    private String regionId;

    private UpdateIDEEventResultRequest(Builder builder) {
        super(builder);
        this.checkResult = builder.checkResult;
        this.checkResultTip = builder.checkResultTip;
        this.extensionCode = builder.extensionCode;
        this.messageId = builder.messageId;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateIDEEventResultRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return checkResult
     */
    public String getCheckResult() {
        return this.checkResult;
    }

    /**
     * @return checkResultTip
     */
    public String getCheckResultTip() {
        return this.checkResultTip;
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

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<UpdateIDEEventResultRequest, Builder> {
        private String checkResult; 
        private String checkResultTip; 
        private String extensionCode; 
        private String messageId; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(UpdateIDEEventResultRequest request) {
            super(request);
            this.checkResult = request.checkResult;
            this.checkResultTip = request.checkResultTip;
            this.extensionCode = request.extensionCode;
            this.messageId = request.messageId;
            this.regionId = request.regionId;
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
         * CheckResultTip.
         */
        public Builder checkResultTip(String checkResultTip) {
            this.putBodyParameter("CheckResultTip", checkResultTip);
            this.checkResultTip = checkResultTip;
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
         * 扩展点消息UUID
         */
        public Builder messageId(String messageId) {
            this.putBodyParameter("MessageId", messageId);
            this.messageId = messageId;
            return this;
        }

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public UpdateIDEEventResultRequest build() {
            return new UpdateIDEEventResultRequest(this);
        } 

    } 

}
