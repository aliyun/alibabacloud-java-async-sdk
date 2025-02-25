// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.esa20240910.models;

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
 * {@link CreatePageRequest} extends {@link RequestModel}
 *
 * <p>CreatePageRequest</p>
 */
public class CreatePageRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Content")
    private String content;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ContentType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String contentType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Name")
    @com.aliyun.core.annotation.Validation(required = true)
    private String name;

    private CreatePageRequest(Builder builder) {
        super(builder);
        this.content = builder.content;
        this.contentType = builder.contentType;
        this.description = builder.description;
        this.name = builder.name;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreatePageRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return content
     */
    public String getContent() {
        return this.content;
    }

    /**
     * @return contentType
     */
    public String getContentType() {
        return this.contentType;
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

    public static final class Builder extends Request.Builder<CreatePageRequest, Builder> {
        private String content; 
        private String contentType; 
        private String description; 
        private String name; 

        private Builder() {
            super();
        } 

        private Builder(CreatePageRequest request) {
            super(request);
            this.content = request.content;
            this.contentType = request.contentType;
            this.description = request.description;
            this.name = request.name;
        } 

        /**
         * <p>The Base64-encoded page content. Example: &quot;PGh0bWw+aGVsbG8gcGFnZTwvaHRtbD4=&quot;, which indicates &quot;hello page&quot;.</p>
         * 
         * <strong>example:</strong>
         * <p>PGh0bWw+aGVsbG8gcGFnZTwvaHRtbD4=</p>
         */
        public Builder content(String content) {
            this.putBodyParameter("Content", content);
            this.content = content;
            return this;
        }

        /**
         * <p>The Content-Type field in the HTTP header. Valid values:</p>
         * <ul>
         * <li>text/html</li>
         * <li>application/json</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>text/html</p>
         */
        public Builder contentType(String contentType) {
            this.putBodyParameter("ContentType", contentType);
            this.contentType = contentType;
            return this;
        }

        /**
         * <p>The description of the page.</p>
         * 
         * <strong>example:</strong>
         * <p>a custom deny page</p>
         */
        public Builder description(String description) {
            this.putBodyParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * <p>The name of the custom error page.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>example</p>
         */
        public Builder name(String name) {
            this.putBodyParameter("Name", name);
            this.name = name;
            return this;
        }

        @Override
        public CreatePageRequest build() {
            return new CreatePageRequest(this);
        } 

    } 

}
