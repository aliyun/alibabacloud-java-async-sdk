// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aiccs20191015.models;

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
 * {@link HangupOperateRequest} extends {@link RequestModel}
 *
 * <p>HangupOperateRequest</p>
 */
public class HangupOperateRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CallId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String callId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ImmediateHangup")
    private Boolean immediateHangup;

    private HangupOperateRequest(Builder builder) {
        super(builder);
        this.callId = builder.callId;
        this.immediateHangup = builder.immediateHangup;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static HangupOperateRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return callId
     */
    public String getCallId() {
        return this.callId;
    }

    /**
     * @return immediateHangup
     */
    public Boolean getImmediateHangup() {
        return this.immediateHangup;
    }

    public static final class Builder extends Request.Builder<HangupOperateRequest, Builder> {
        private String callId; 
        private Boolean immediateHangup; 

        private Builder() {
            super();
        } 

        private Builder(HangupOperateRequest request) {
            super(request);
            this.callId = request.callId;
            this.immediateHangup = request.immediateHangup;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>147776727911^134522727911</p>
         */
        public Builder callId(String callId) {
            this.putQueryParameter("CallId", callId);
            this.callId = callId;
            return this;
        }

        /**
         * ImmediateHangup.
         */
        public Builder immediateHangup(Boolean immediateHangup) {
            this.putQueryParameter("ImmediateHangup", immediateHangup);
            this.immediateHangup = immediateHangup;
            return this;
        }

        @Override
        public HangupOperateRequest build() {
            return new HangupOperateRequest(this);
        } 

    } 

}
