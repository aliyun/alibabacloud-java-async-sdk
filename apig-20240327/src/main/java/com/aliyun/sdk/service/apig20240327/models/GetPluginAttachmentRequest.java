// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.apig20240327.models;

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
 * {@link GetPluginAttachmentRequest} extends {@link RequestModel}
 *
 * <p>GetPluginAttachmentRequest</p>
 */
public class GetPluginAttachmentRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("pluginAttachmentId")
    private String pluginAttachmentId;

    private GetPluginAttachmentRequest(Builder builder) {
        super(builder);
        this.pluginAttachmentId = builder.pluginAttachmentId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetPluginAttachmentRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return pluginAttachmentId
     */
    public String getPluginAttachmentId() {
        return this.pluginAttachmentId;
    }

    public static final class Builder extends Request.Builder<GetPluginAttachmentRequest, Builder> {
        private String pluginAttachmentId; 

        private Builder() {
            super();
        } 

        private Builder(GetPluginAttachmentRequest request) {
            super(request);
            this.pluginAttachmentId = request.pluginAttachmentId;
        } 

        /**
         * pluginAttachmentId.
         */
        public Builder pluginAttachmentId(String pluginAttachmentId) {
            this.putPathParameter("pluginAttachmentId", pluginAttachmentId);
            this.pluginAttachmentId = pluginAttachmentId;
            return this;
        }

        @Override
        public GetPluginAttachmentRequest build() {
            return new GetPluginAttachmentRequest(this);
        } 

    } 

}
