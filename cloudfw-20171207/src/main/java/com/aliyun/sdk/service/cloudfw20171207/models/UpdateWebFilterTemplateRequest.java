// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudfw20171207.models;

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
 * {@link UpdateWebFilterTemplateRequest} extends {@link RequestModel}
 *
 * <p>UpdateWebFilterTemplateRequest</p>
 */
public class UpdateWebFilterTemplateRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Name")
    private String name;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Status")
    private String status;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("WebFilterTemplateId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String webFilterTemplateId;

    private UpdateWebFilterTemplateRequest(Builder builder) {
        super(builder);
        this.description = builder.description;
        this.name = builder.name;
        this.status = builder.status;
        this.webFilterTemplateId = builder.webFilterTemplateId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateWebFilterTemplateRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * @return webFilterTemplateId
     */
    public String getWebFilterTemplateId() {
        return this.webFilterTemplateId;
    }

    public static final class Builder extends Request.Builder<UpdateWebFilterTemplateRequest, Builder> {
        private String description; 
        private String name; 
        private String status; 
        private String webFilterTemplateId; 

        private Builder() {
            super();
        } 

        private Builder(UpdateWebFilterTemplateRequest request) {
            super(request);
            this.description = request.description;
            this.name = request.name;
            this.status = request.status;
            this.webFilterTemplateId = request.webFilterTemplateId;
        } 

        /**
         * <p>The description of the web filtering template. The description can be up to 128 characters in length. If this parameter is not specified, the original value is retained. If an empty string is specified, the description is cleared.</p>
         * 
         * <strong>example:</strong>
         * <p>Web filtering template for URL access control</p>
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * <p>The name of the web filtering template. The name must be 1 to 64 characters in length and can contain Chinese characters, English letters, digits, hyphens (-), underscores (_), and periods (.). It cannot contain spaces. If this parameter is not specified or is left empty, the original value is retained.</p>
         * 
         * <strong>example:</strong>
         * <p>Web filtering template 02</p>
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * <p>The status of the web filtering template. Valid values:</p>
         * <ul>
         * <li><strong>Enable</strong>: Enabled.</li>
         * <li><strong>Disable</strong>: Disabled.
         * If this parameter is not specified or is left empty, the original value is retained.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Disable</p>
         */
        public Builder status(String status) {
            this.putQueryParameter("Status", status);
            this.status = status;
            return this;
        }

        /**
         * <p>The ID of the web filtering template to be modified. The template must exist within the current Alibaba Cloud account.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>wft-3f2a9c1d4b5e6f70</p>
         */
        public Builder webFilterTemplateId(String webFilterTemplateId) {
            this.putQueryParameter("WebFilterTemplateId", webFilterTemplateId);
            this.webFilterTemplateId = webFilterTemplateId;
            return this;
        }

        @Override
        public UpdateWebFilterTemplateRequest build() {
            return new UpdateWebFilterTemplateRequest(this);
        } 

    } 

}
