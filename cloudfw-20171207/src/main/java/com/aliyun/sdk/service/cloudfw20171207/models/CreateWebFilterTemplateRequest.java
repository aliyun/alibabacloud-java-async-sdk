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
 * {@link CreateWebFilterTemplateRequest} extends {@link RequestModel}
 *
 * <p>CreateWebFilterTemplateRequest</p>
 */
public class CreateWebFilterTemplateRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Name")
    @com.aliyun.core.annotation.Validation(required = true)
    private String name;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Status")
    @com.aliyun.core.annotation.Validation(required = true)
    private String status;

    private CreateWebFilterTemplateRequest(Builder builder) {
        super(builder);
        this.description = builder.description;
        this.name = builder.name;
        this.status = builder.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateWebFilterTemplateRequest create() {
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

    public static final class Builder extends Request.Builder<CreateWebFilterTemplateRequest, Builder> {
        private String description; 
        private String name; 
        private String status; 

        private Builder() {
            super();
        } 

        private Builder(CreateWebFilterTemplateRequest request) {
            super(request);
            this.description = request.description;
            this.name = request.name;
            this.status = request.status;
        } 

        /**
         * <p>The description of the web filtering template. The description can be up to 128 characters in length and can be empty.</p>
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
         * <p>The name of the web filtering template. The name must be 1 to 64 characters in length and can contain Chinese characters, letters, digits, hyphens (-), underscores (_), and periods (.). It cannot contain spaces or be empty.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>WebFilterTemplate01</p>
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * <p>The status of the web filtering template. Valid values:</p>
         * <ul>
         * <li><strong>Enable</strong>: enabled.</li>
         * <li><strong>Disable</strong>: disabled.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>Enable</p>
         */
        public Builder status(String status) {
            this.putQueryParameter("Status", status);
            this.status = status;
            return this;
        }

        @Override
        public CreateWebFilterTemplateRequest build() {
            return new CreateWebFilterTemplateRequest(this);
        } 

    } 

}
