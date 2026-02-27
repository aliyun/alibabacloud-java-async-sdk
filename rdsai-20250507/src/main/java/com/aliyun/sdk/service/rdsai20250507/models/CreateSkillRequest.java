// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rdsai20250507.models;

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
 * {@link CreateSkillRequest} extends {@link RequestModel}
 *
 * <p>CreateSkillRequest</p>
 */
public class CreateSkillRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Content")
    private java.util.Map<String, ?> content;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Dbtypes")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<String> dbtypes;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Description")
    @com.aliyun.core.annotation.Validation(required = true)
    private String description;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Name")
    @com.aliyun.core.annotation.Validation(required = true)
    private String name;

    private CreateSkillRequest(Builder builder) {
        super(builder);
        this.content = builder.content;
        this.dbtypes = builder.dbtypes;
        this.description = builder.description;
        this.name = builder.name;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateSkillRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return content
     */
    public java.util.Map<String, ?> getContent() {
        return this.content;
    }

    /**
     * @return dbtypes
     */
    public java.util.List<String> getDbtypes() {
        return this.dbtypes;
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

    public static final class Builder extends Request.Builder<CreateSkillRequest, Builder> {
        private java.util.Map<String, ?> content; 
        private java.util.List<String> dbtypes; 
        private String description; 
        private String name; 

        private Builder() {
            super();
        } 

        private Builder(CreateSkillRequest request) {
            super(request);
            this.content = request.content;
            this.dbtypes = request.dbtypes;
            this.description = request.description;
            this.name = request.name;
        } 

        /**
         * Content.
         */
        public Builder content(java.util.Map<String, ?> content) {
            String contentShrink = shrink(content, "Content", "json");
            this.putQueryParameter("Content", contentShrink);
            this.content = content;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder dbtypes(java.util.List<String> dbtypes) {
            String dbtypesShrink = shrink(dbtypes, "Dbtypes", "json");
            this.putQueryParameter("Dbtypes", dbtypesShrink);
            this.dbtypes = dbtypes;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>query-optimization</p>
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
            return this;
        }

        @Override
        public CreateSkillRequest build() {
            return new CreateSkillRequest(this);
        } 

    } 

}
