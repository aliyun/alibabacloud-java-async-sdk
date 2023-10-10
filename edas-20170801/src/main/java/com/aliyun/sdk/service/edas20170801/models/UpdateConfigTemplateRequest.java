// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.edas20170801.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateConfigTemplateRequest} extends {@link RequestModel}
 *
 * <p>UpdateConfigTemplateRequest</p>
 */
public class UpdateConfigTemplateRequest extends Request {
    @Body
    @NameInMap("Content")
    private String content;

    @Body
    @NameInMap("Description")
    private String description;

    @Body
    @NameInMap("Format")
    private String format;

    @Body
    @NameInMap("Id")
    private Long id;

    @Body
    @NameInMap("Name")
    private String name;

    private UpdateConfigTemplateRequest(Builder builder) {
        super(builder);
        this.content = builder.content;
        this.description = builder.description;
        this.format = builder.format;
        this.id = builder.id;
        this.name = builder.name;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateConfigTemplateRequest create() {
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
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return format
     */
    public String getFormat() {
        return this.format;
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

    public static final class Builder extends Request.Builder<UpdateConfigTemplateRequest, Builder> {
        private String content; 
        private String description; 
        private String format; 
        private Long id; 
        private String name; 

        private Builder() {
            super();
        } 

        private Builder(UpdateConfigTemplateRequest request) {
            super(request);
            this.content = request.content;
            this.description = request.description;
            this.format = request.format;
            this.id = request.id;
            this.name = request.name;
        } 

        /**
         * The content of the configuration template. The value must be in the format that is specified by the Format parameter.
         */
        public Builder content(String content) {
            this.putBodyParameter("Content", content);
            this.content = content;
            return this;
        }

        /**
         * The description of the configuration template. The description can be up to 255 characters in length.
         */
        public Builder description(String description) {
            this.putBodyParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * The data format of the configuration template. Valid values:
         * <p>
         * 
         * *   JSON: JSON format
         * *   XML: XML format
         * *   YAML: YAML format
         * *   Properties: .properties format
         * *   KeyValue: key-value pairs
         * *   Custom: custom format
         */
        public Builder format(String format) {
            this.putBodyParameter("Format", format);
            this.format = format;
            return this;
        }

        /**
         * The ID of the configuration template.
         */
        public Builder id(Long id) {
            this.putBodyParameter("Id", id);
            this.id = id;
            return this;
        }

        /**
         * The name of the configuration template. The name can be up to 64 characters in length.
         */
        public Builder name(String name) {
            this.putBodyParameter("Name", name);
            this.name = name;
            return this;
        }

        @Override
        public UpdateConfigTemplateRequest build() {
            return new UpdateConfigTemplateRequest(this);
        } 

    } 

}
