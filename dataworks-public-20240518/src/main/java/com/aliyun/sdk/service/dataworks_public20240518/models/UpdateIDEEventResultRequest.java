// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20240518.models;

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
 * {@link UpdateIDEEventResultRequest} extends {@link RequestModel}
 *
 * <p>UpdateIDEEventResultRequest</p>
 */
public class UpdateIDEEventResultRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("CheckResult")
    private String checkResult;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("CheckResultTip")
    private String checkResultTip;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ExtensionCode")
    private String extensionCode;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("MessageId")
    private String messageId;

    private UpdateIDEEventResultRequest(Builder builder) {
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

    public static UpdateIDEEventResultRequest create() {
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

    public static final class Builder extends Request.Builder<UpdateIDEEventResultRequest, Builder> {
        private String regionId; 
        private String checkResult; 
        private String checkResultTip; 
        private String extensionCode; 
        private String messageId; 

        private Builder() {
            super();
        } 

        private Builder(UpdateIDEEventResultRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.checkResult = request.checkResult;
            this.checkResultTip = request.checkResultTip;
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
         * <p>The check status of the extension for this extension point event. Valid values:</p>
         * <ul>
         * <li>OK: The extension check for this extension point event passed.</li>
         * <li>FAIL: The extension check for this extension point event failed. View and resolve the error promptly to avoid affecting the normal execution of subsequent programs.</li>
         * <li>WARN: The extension check for this extension point event passed, but warnings exist.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>OK</p>
         */
        public Builder checkResult(String checkResult) {
            this.putBodyParameter("CheckResult", checkResult);
            this.checkResult = checkResult;
            return this;
        }

        /**
         * <p>The summary of the check performed by the extension on this extension point event.
         * This information is displayed on your current development page. If the check has warnings or fails, you can use this summary to quickly identify the cause.</p>
         * 
         * <strong>example:</strong>
         * <p>Succeeded</p>
         */
        public Builder checkResultTip(String checkResultTip) {
            this.putBodyParameter("CheckResultTip", checkResultTip);
            this.checkResultTip = checkResultTip;
            return this;
        }

        /**
         * <p>The unique identifier of the extension.
         * You can log on to the <a href="https://workbench.data.aliyun.com/console">DataWorks console</a> and view the identifier on the Extensions tab of the Open Platform page.</p>
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
         * <p>The message ID of the DataWorks open message. After an extension point event is triggered, you can obtain the message ID from the received event message.</p>
         * <p>&lt;props=&quot;china&quot;&gt;For more information about the message format, see <a href="https://help.aliyun.com/document_detail/215367.html">Message format</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>8abcb91f-d266-4073-b907-2ed670378ed1</p>
         */
        public Builder messageId(String messageId) {
            this.putBodyParameter("MessageId", messageId);
            this.messageId = messageId;
            return this;
        }

        @Override
        public UpdateIDEEventResultRequest build() {
            return new UpdateIDEEventResultRequest(this);
        } 

    } 

}
