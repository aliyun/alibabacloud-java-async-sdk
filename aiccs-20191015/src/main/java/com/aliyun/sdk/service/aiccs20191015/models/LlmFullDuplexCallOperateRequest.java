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
 * {@link LlmFullDuplexCallOperateRequest} extends {@link RequestModel}
 *
 * <p>LlmFullDuplexCallOperateRequest</p>
 */
public class LlmFullDuplexCallOperateRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CallId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String callId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Command")
    @com.aliyun.core.annotation.Validation(required = true)
    private String command;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Param")
    private String param;

    private LlmFullDuplexCallOperateRequest(Builder builder) {
        super(builder);
        this.callId = builder.callId;
        this.command = builder.command;
        this.param = builder.param;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static LlmFullDuplexCallOperateRequest create() {
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
     * @return command
     */
    public String getCommand() {
        return this.command;
    }

    /**
     * @return param
     */
    public String getParam() {
        return this.param;
    }

    public static final class Builder extends Request.Builder<LlmFullDuplexCallOperateRequest, Builder> {
        private String callId; 
        private String command; 
        private String param; 

        private Builder() {
            super();
        } 

        private Builder(LlmFullDuplexCallOperateRequest request) {
            super(request);
            this.callId = request.callId;
            this.command = request.command;
            this.param = request.param;
        } 

        /**
         * <p>通话的唯一回执 ID。可通过 llmSmartCallFullDuplex 接口获取。</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>示例值</p>
         */
        public Builder callId(String callId) {
            this.putQueryParameter("CallId", callId);
            this.callId = callId;
            return this;
        }

        /**
         * <p>动作指令：play / flush / hangup / sendDtmf</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>示例值</p>
         */
        public Builder command(String command) {
            this.putQueryParameter("Command", command);
            this.command = command;
            return this;
        }

        /**
         * <p>扩展参数，JSON 字符串。各 command 参数说明：</p>
         * 
         * <strong>example:</strong>
         * <p>示例值示例值</p>
         */
        public Builder param(String param) {
            this.putQueryParameter("Param", param);
            this.param = param;
            return this;
        }

        @Override
        public LlmFullDuplexCallOperateRequest build() {
            return new LlmFullDuplexCallOperateRequest(this);
        } 

    } 

}
