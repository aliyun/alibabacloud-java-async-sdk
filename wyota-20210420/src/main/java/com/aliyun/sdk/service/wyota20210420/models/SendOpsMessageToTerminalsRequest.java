// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.wyota20210420.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SendOpsMessageToTerminalsRequest} extends {@link RequestModel}
 *
 * <p>SendOpsMessageToTerminalsRequest</p>
 */
public class SendOpsMessageToTerminalsRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Msg")
    private String msg;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("OpsAction")
    private String opsAction;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Uuids")
    private java.util.List < String > uuids;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("WaitForAck")
    private Boolean waitForAck;

    private SendOpsMessageToTerminalsRequest(Builder builder) {
        super(builder);
        this.msg = builder.msg;
        this.opsAction = builder.opsAction;
        this.uuids = builder.uuids;
        this.waitForAck = builder.waitForAck;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SendOpsMessageToTerminalsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return msg
     */
    public String getMsg() {
        return this.msg;
    }

    /**
     * @return opsAction
     */
    public String getOpsAction() {
        return this.opsAction;
    }

    /**
     * @return uuids
     */
    public java.util.List < String > getUuids() {
        return this.uuids;
    }

    /**
     * @return waitForAck
     */
    public Boolean getWaitForAck() {
        return this.waitForAck;
    }

    public static final class Builder extends Request.Builder<SendOpsMessageToTerminalsRequest, Builder> {
        private String msg; 
        private String opsAction; 
        private java.util.List < String > uuids; 
        private Boolean waitForAck; 

        private Builder() {
            super();
        } 

        private Builder(SendOpsMessageToTerminalsRequest request) {
            super(request);
            this.msg = request.msg;
            this.opsAction = request.opsAction;
            this.uuids = request.uuids;
            this.waitForAck = request.waitForAck;
        } 

        /**
         * Msg.
         */
        public Builder msg(String msg) {
            this.putBodyParameter("Msg", msg);
            this.msg = msg;
            return this;
        }

        /**
         * OpsAction.
         */
        public Builder opsAction(String opsAction) {
            this.putBodyParameter("OpsAction", opsAction);
            this.opsAction = opsAction;
            return this;
        }

        /**
         * Uuids.
         */
        public Builder uuids(java.util.List < String > uuids) {
            this.putBodyParameter("Uuids", uuids);
            this.uuids = uuids;
            return this;
        }

        /**
         * WaitForAck.
         */
        public Builder waitForAck(Boolean waitForAck) {
            this.putBodyParameter("WaitForAck", waitForAck);
            this.waitForAck = waitForAck;
            return this;
        }

        @Override
        public SendOpsMessageToTerminalsRequest build() {
            return new SendOpsMessageToTerminalsRequest(this);
        } 

    } 

}
