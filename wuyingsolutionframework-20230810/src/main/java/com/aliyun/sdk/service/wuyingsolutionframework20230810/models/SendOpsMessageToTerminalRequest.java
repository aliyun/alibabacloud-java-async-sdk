// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.wuyingsolutionframework20230810.models;

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
 * {@link SendOpsMessageToTerminalRequest} extends {@link RequestModel}
 *
 * <p>SendOpsMessageToTerminalRequest</p>
 */
public class SendOpsMessageToTerminalRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MessageBody")
    private String messageBody;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OfficeRegionId")
    private String officeRegionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OpsAction")
    private String opsAction;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SerialNo")
    private String serialNo;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("WaitForAck")
    private Boolean waitForAck;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("WaitForMsg")
    private Boolean waitForMsg;

    private SendOpsMessageToTerminalRequest(Builder builder) {
        super(builder);
        this.messageBody = builder.messageBody;
        this.officeRegionId = builder.officeRegionId;
        this.opsAction = builder.opsAction;
        this.serialNo = builder.serialNo;
        this.waitForAck = builder.waitForAck;
        this.waitForMsg = builder.waitForMsg;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SendOpsMessageToTerminalRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return messageBody
     */
    public String getMessageBody() {
        return this.messageBody;
    }

    /**
     * @return officeRegionId
     */
    public String getOfficeRegionId() {
        return this.officeRegionId;
    }

    /**
     * @return opsAction
     */
    public String getOpsAction() {
        return this.opsAction;
    }

    /**
     * @return serialNo
     */
    public String getSerialNo() {
        return this.serialNo;
    }

    /**
     * @return waitForAck
     */
    public Boolean getWaitForAck() {
        return this.waitForAck;
    }

    /**
     * @return waitForMsg
     */
    public Boolean getWaitForMsg() {
        return this.waitForMsg;
    }

    public static final class Builder extends Request.Builder<SendOpsMessageToTerminalRequest, Builder> {
        private String messageBody; 
        private String officeRegionId; 
        private String opsAction; 
        private String serialNo; 
        private Boolean waitForAck; 
        private Boolean waitForMsg; 

        private Builder() {
            super();
        } 

        private Builder(SendOpsMessageToTerminalRequest request) {
            super(request);
            this.messageBody = request.messageBody;
            this.officeRegionId = request.officeRegionId;
            this.opsAction = request.opsAction;
            this.serialNo = request.serialNo;
            this.waitForAck = request.waitForAck;
            this.waitForMsg = request.waitForMsg;
        } 

        /**
         * MessageBody.
         */
        public Builder messageBody(String messageBody) {
            this.putQueryParameter("MessageBody", messageBody);
            this.messageBody = messageBody;
            return this;
        }

        /**
         * OfficeRegionId.
         */
        public Builder officeRegionId(String officeRegionId) {
            this.putQueryParameter("OfficeRegionId", officeRegionId);
            this.officeRegionId = officeRegionId;
            return this;
        }

        /**
         * OpsAction.
         */
        public Builder opsAction(String opsAction) {
            this.putQueryParameter("OpsAction", opsAction);
            this.opsAction = opsAction;
            return this;
        }

        /**
         * SerialNo.
         */
        public Builder serialNo(String serialNo) {
            this.putQueryParameter("SerialNo", serialNo);
            this.serialNo = serialNo;
            return this;
        }

        /**
         * WaitForAck.
         */
        public Builder waitForAck(Boolean waitForAck) {
            this.putQueryParameter("WaitForAck", waitForAck);
            this.waitForAck = waitForAck;
            return this;
        }

        /**
         * WaitForMsg.
         */
        public Builder waitForMsg(Boolean waitForMsg) {
            this.putQueryParameter("WaitForMsg", waitForMsg);
            this.waitForMsg = waitForMsg;
            return this;
        }

        @Override
        public SendOpsMessageToTerminalRequest build() {
            return new SendOpsMessageToTerminalRequest(this);
        } 

    } 

}
