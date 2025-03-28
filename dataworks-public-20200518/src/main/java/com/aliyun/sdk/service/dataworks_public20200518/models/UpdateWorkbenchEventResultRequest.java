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
 * {@link UpdateWorkbenchEventResultRequest} extends {@link RequestModel}
 *
 * <p>UpdateWorkbenchEventResultRequest</p>
 */
public class UpdateWorkbenchEventResultRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CheckResult")
    @com.aliyun.core.annotation.Validation(required = true)
    private String checkResult;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CheckResultTip")
    private String checkResultTip;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ExtensionCode")
    @com.aliyun.core.annotation.Validation(required = true)
    private String extensionCode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MessageId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String messageId;

    private UpdateWorkbenchEventResultRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.checkResult = builder.checkResult;
        this.checkResultTip = builder.checkResultTip;
        this.extensionCode = builder.extensionCode;
        this.messageId = builder.messageId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateWorkbenchEventResultRequest create() {
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

    public static final class Builder extends Request.Builder<UpdateWorkbenchEventResultRequest, Builder> {
        private String regionId; 
        private String checkResult; 
        private String checkResultTip; 
        private String extensionCode; 
        private String messageId; 

        private Builder() {
            super();
        } 

        private Builder(UpdateWorkbenchEventResultRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.checkResult = request.checkResult;
            this.checkResultTip = request.checkResultTip;
            this.extensionCode = request.extensionCode;
            this.messageId = request.messageId;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-shanghai</p>
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The check result of the extension point event. Valid values: OK and Fail.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>FAIL</p>
         */
        public Builder checkResult(String checkResult) {
            this.putQueryParameter("CheckResult", checkResult);
            this.checkResult = checkResult;
            return this;
        }

        /**
         * <p>The cause of the check failure.</p>
         * 
         * <strong>example:</strong>
         * <p>SQL is too long</p>
         */
        public Builder checkResultTip(String checkResultTip) {
            this.putQueryParameter("CheckResultTip", checkResultTip);
            this.checkResultTip = checkResultTip;
            return this;
        }

        /**
         * <p>The code of the extension.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>58e95e2acd6f408e8707f1bf2591f9e9</p>
         */
        public Builder extensionCode(String extensionCode) {
            this.putQueryParameter("ExtensionCode", extensionCode);
            this.extensionCode = extensionCode;
            return this;
        }

        /**
         * <p>The ID of the message received when the related extension point event is triggered after you enable message subscription by using the OpenEvent module.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>03400b03-b721-4c34-8727-2d6884077091</p>
         */
        public Builder messageId(String messageId) {
            this.putQueryParameter("MessageId", messageId);
            this.messageId = messageId;
            return this;
        }

        @Override
        public UpdateWorkbenchEventResultRequest build() {
            return new UpdateWorkbenchEventResultRequest(this);
        } 

    } 

}
