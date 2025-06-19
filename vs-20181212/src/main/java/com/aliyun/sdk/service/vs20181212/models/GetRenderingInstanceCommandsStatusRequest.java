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
 * {@link GetRenderingInstanceCommandsStatusRequest} extends {@link RequestModel}
 *
 * <p>GetRenderingInstanceCommandsStatusRequest</p>
 */
public class GetRenderingInstanceCommandsStatusRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CmdId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String cmdId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RenderingInstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String renderingInstanceId;

    private GetRenderingInstanceCommandsStatusRequest(Builder builder) {
        super(builder);
        this.cmdId = builder.cmdId;
        this.renderingInstanceId = builder.renderingInstanceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetRenderingInstanceCommandsStatusRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return cmdId
     */
    public String getCmdId() {
        return this.cmdId;
    }

    /**
     * @return renderingInstanceId
     */
    public String getRenderingInstanceId() {
        return this.renderingInstanceId;
    }

    public static final class Builder extends Request.Builder<GetRenderingInstanceCommandsStatusRequest, Builder> {
        private String cmdId; 
        private String renderingInstanceId; 

        private Builder() {
            super();
        } 

        private Builder(GetRenderingInstanceCommandsStatusRequest request) {
            super(request);
            this.cmdId = request.cmdId;
            this.renderingInstanceId = request.renderingInstanceId;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cmd-81de027b66e442e99c1e0e09a16a0be5</p>
         */
        public Builder cmdId(String cmdId) {
            this.putQueryParameter("CmdId", cmdId);
            this.cmdId = cmdId;
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

        @Override
        public GetRenderingInstanceCommandsStatusRequest build() {
            return new GetRenderingInstanceCommandsStatusRequest(this);
        } 

    } 

}
