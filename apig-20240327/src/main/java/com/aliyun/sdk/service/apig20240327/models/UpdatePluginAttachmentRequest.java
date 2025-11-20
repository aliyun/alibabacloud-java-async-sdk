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
 * {@link UpdatePluginAttachmentRequest} extends {@link RequestModel}
 *
 * <p>UpdatePluginAttachmentRequest</p>
 */
public class UpdatePluginAttachmentRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("pluginAttachmentId")
    private String pluginAttachmentId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("attachResourceIds")
    private java.util.List<String> attachResourceIds;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("enable")
    private Boolean enable;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("pluginConfig")
    private String pluginConfig;

    private UpdatePluginAttachmentRequest(Builder builder) {
        super(builder);
        this.pluginAttachmentId = builder.pluginAttachmentId;
        this.attachResourceIds = builder.attachResourceIds;
        this.enable = builder.enable;
        this.pluginConfig = builder.pluginConfig;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdatePluginAttachmentRequest create() {
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

    /**
     * @return attachResourceIds
     */
    public java.util.List<String> getAttachResourceIds() {
        return this.attachResourceIds;
    }

    /**
     * @return enable
     */
    public Boolean getEnable() {
        return this.enable;
    }

    /**
     * @return pluginConfig
     */
    public String getPluginConfig() {
        return this.pluginConfig;
    }

    public static final class Builder extends Request.Builder<UpdatePluginAttachmentRequest, Builder> {
        private String pluginAttachmentId; 
        private java.util.List<String> attachResourceIds; 
        private Boolean enable; 
        private String pluginConfig; 

        private Builder() {
            super();
        } 

        private Builder(UpdatePluginAttachmentRequest request) {
            super(request);
            this.pluginAttachmentId = request.pluginAttachmentId;
            this.attachResourceIds = request.attachResourceIds;
            this.enable = request.enable;
            this.pluginConfig = request.pluginConfig;
        } 

        /**
         * <p>The attachment ID.</p>
         * 
         * <strong>example:</strong>
         * <p>pa-cri2uq5lhtgkq0ldllj0</p>
         */
        public Builder pluginAttachmentId(String pluginAttachmentId) {
            this.putPathParameter("pluginAttachmentId", pluginAttachmentId);
            this.pluginAttachmentId = pluginAttachmentId;
            return this;
        }

        /**
         * <p>The IDs of the resources to which the plug-in is attached.</p>
         */
        public Builder attachResourceIds(java.util.List<String> attachResourceIds) {
            this.putBodyParameter("attachResourceIds", attachResourceIds);
            this.attachResourceIds = attachResourceIds;
            return this;
        }

        /**
         * <p>Specifies whether to enable the plug-in.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder enable(Boolean enable) {
            this.putBodyParameter("enable", enable);
            this.enable = enable;
            return this;
        }

        /**
         * <p>The Base64-encoded configurations of the plug-in.</p>
         * 
         * <strong>example:</strong>
         * <p>cHJlcGVuZDoKLSByb2xlOiBzeXN0ZW0KICBjb250ZW50OiDor7fkvb/nlKjoi7Hor63lm57nrZTpl67popgKYXBwZW5kOgotIHJvbGU6IHVzZXIKICBjb250ZW50OiDmr4/mrKHlm57nrZTlrozpl67popjvvIzlsJ3or5Xov5vooYzlj43pl64K</p>
         */
        public Builder pluginConfig(String pluginConfig) {
            this.putBodyParameter("pluginConfig", pluginConfig);
            this.pluginConfig = pluginConfig;
            return this;
        }

        @Override
        public UpdatePluginAttachmentRequest build() {
            return new UpdatePluginAttachmentRequest(this);
        } 

    } 

}
