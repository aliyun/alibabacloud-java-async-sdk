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
 * {@link DeletePluginAttachmentRequest} extends {@link RequestModel}
 *
 * <p>DeletePluginAttachmentRequest</p>
 */
public class DeletePluginAttachmentRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("pluginAttachmentId")
    private String pluginAttachmentId;

    private DeletePluginAttachmentRequest(Builder builder) {
        super(builder);
        this.pluginAttachmentId = builder.pluginAttachmentId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeletePluginAttachmentRequest create() {
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

    public static final class Builder extends Request.Builder<DeletePluginAttachmentRequest, Builder> {
        private String pluginAttachmentId; 

        private Builder() {
            super();
        } 

        private Builder(DeletePluginAttachmentRequest request) {
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
        public DeletePluginAttachmentRequest build() {
            return new DeletePluginAttachmentRequest(this);
        } 

    } 

}
