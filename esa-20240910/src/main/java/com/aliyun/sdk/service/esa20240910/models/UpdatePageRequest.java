// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.esa20240910.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link UpdatePageRequest} extends {@link RequestModel}
 *
 * <p>UpdatePageRequest</p>
 */
public class UpdatePageRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Content")
    @com.aliyun.core.annotation.Validation(required = true)
    private String content;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ContentType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String contentType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Id")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long id;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Name")
    @com.aliyun.core.annotation.Validation(required = true)
    private String name;

    private UpdatePageRequest(Builder builder) {
        super(builder);
        this.content = builder.content;
        this.contentType = builder.contentType;
        this.description = builder.description;
        this.id = builder.id;
        this.name = builder.name;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdatePageRequest create() {
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
     * @return id
     */
    public Long getId() {
        return this.id;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    public static final class Builder extends Request.Builder<UpdatePageRequest, Builder> {
        private String content; 
        private String contentType; 
        private String description; 
        private Long id; 
        private String name; 

        private Builder() {
            super();
        } 

        private Builder(UpdatePageRequest request) {
            super(request);
            this.content = request.content;
            this.contentType = request.contentType;
            this.description = request.description;
            this.id = request.id;
            this.name = request.name;
        } 

        /**
         * <p>This parameter is required.</p>
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
         * Description.
         */
        public Builder description(String description) {
            this.putBodyParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>50000001</p>
         */
        public Builder id(Long id) {
            this.putBodyParameter("Id", id);
            this.id = id;
            return this;
        }

        /**
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
        public UpdatePageRequest build() {
            return new UpdatePageRequest(this);
        } 

    } 

}
