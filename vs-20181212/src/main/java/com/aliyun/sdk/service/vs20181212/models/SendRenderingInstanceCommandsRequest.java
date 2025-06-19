// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vs20181212.models;

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
 * {@link SendRenderingInstanceCommandsRequest} extends {@link RequestModel}
 *
 * <p>SendRenderingInstanceCommandsRequest</p>
 */
public class SendRenderingInstanceCommandsRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Commands")
    @com.aliyun.core.annotation.Validation(required = true)
    private String commands;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Mode")
    private String mode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RenderingInstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String renderingInstanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Timeout")
    @com.aliyun.core.annotation.Validation(maximum = 3600)
    private Integer timeout;

    private SendRenderingInstanceCommandsRequest(Builder builder) {
        super(builder);
        this.commands = builder.commands;
        this.mode = builder.mode;
        this.renderingInstanceId = builder.renderingInstanceId;
        this.timeout = builder.timeout;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SendRenderingInstanceCommandsRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return commands
     */
    public String getCommands() {
        return this.commands;
    }

    /**
     * @return mode
     */
    public String getMode() {
        return this.mode;
    }

    /**
     * @return renderingInstanceId
     */
    public String getRenderingInstanceId() {
        return this.renderingInstanceId;
    }

    /**
     * @return timeout
     */
    public Integer getTimeout() {
        return this.timeout;
    }

    public static final class Builder extends Request.Builder<SendRenderingInstanceCommandsRequest, Builder> {
        private String commands; 
        private String mode; 
        private String renderingInstanceId; 
        private Integer timeout; 

        private Builder() {
            super();
        } 

        private Builder(SendRenderingInstanceCommandsRequest request) {
            super(request);
            this.commands = request.commands;
            this.mode = request.mode;
            this.renderingInstanceId = request.renderingInstanceId;
            this.timeout = request.timeout;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>date;ls -l /tmp</p>
         */
        public Builder commands(String commands) {
            this.putBodyParameter("Commands", commands);
            this.commands = commands;
            return this;
        }

        /**
         * Mode.
         */
        public Builder mode(String mode) {
            this.putQueryParameter("Mode", mode);
            this.mode = mode;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>render-9f8c57355d224ad7beaf95e145f22111</p>
         */
        public Builder renderingInstanceId(String renderingInstanceId) {
            this.putQueryParameter("RenderingInstanceId", renderingInstanceId);
            this.renderingInstanceId = renderingInstanceId;
            return this;
        }

        /**
         * Timeout.
         */
        public Builder timeout(Integer timeout) {
            this.putQueryParameter("Timeout", timeout);
            this.timeout = timeout;
            return this;
        }

        @Override
        public SendRenderingInstanceCommandsRequest build() {
            return new SendRenderingInstanceCommandsRequest(this);
        } 

    } 

}
