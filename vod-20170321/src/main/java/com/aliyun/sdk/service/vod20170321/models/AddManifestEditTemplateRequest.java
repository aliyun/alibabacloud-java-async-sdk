// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vod20170321.models;

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
 * {@link AddManifestEditTemplateRequest} extends {@link RequestModel}
 *
 * <p>AddManifestEditTemplateRequest</p>
 */
public class AddManifestEditTemplateRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Name")
    @com.aliyun.core.annotation.Validation(required = true)
    private String name;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Templates")
    private String templates;

    private AddManifestEditTemplateRequest(Builder builder) {
        super(builder);
        this.name = builder.name;
        this.templates = builder.templates;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AddManifestEditTemplateRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return templates
     */
    public String getTemplates() {
        return this.templates;
    }

    public static final class Builder extends Request.Builder<AddManifestEditTemplateRequest, Builder> {
        private String name; 
        private String templates; 

        private Builder() {
            super();
        } 

        private Builder(AddManifestEditTemplateRequest request) {
            super(request);
            this.name = request.name;
            this.templates = request.templates;
        } 

        /**
         * <p>The name of the template. Spaces are allowed.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>add-multilang-tracks</p>
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * <p>The video encoding configuration, such as <code>{&quot;Codec&quot;:&quot;H.264&quot;,&quot;Bitrate&quot;:&quot;5000000&quot;}</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;Codec&quot;:&quot;H.264&quot;,&quot;Bitrate&quot;:&quot;5000000&quot;}</p>
         */
        public Builder templates(String templates) {
            this.putQueryParameter("Templates", templates);
            this.templates = templates;
            return this;
        }

        @Override
        public AddManifestEditTemplateRequest build() {
            return new AddManifestEditTemplateRequest(this);
        } 

    } 

}
