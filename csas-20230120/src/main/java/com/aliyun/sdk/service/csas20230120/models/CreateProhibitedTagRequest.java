// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.csas20230120.models;

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
 * {@link CreateProhibitedTagRequest} extends {@link RequestModel}
 *
 * <p>CreateProhibitedTagRequest</p>
 */
public class CreateProhibitedTagRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Name")
    @com.aliyun.core.annotation.Validation(required = true)
    private String name;

    private CreateProhibitedTagRequest(Builder builder) {
        super(builder);
        this.description = builder.description;
        this.name = builder.name;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateProhibitedTagRequest create() {
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

    public static final class Builder extends Request.Builder<CreateProhibitedTagRequest, Builder> {
        private String description; 
        private String name; 

        private Builder() {
            super();
        } 

        private Builder(CreateProhibitedTagRequest request) {
            super(request);
            this.description = request.description;
            this.name = request.name;
        } 

        /**
         * <p>The description of the disabled software tag. The description can be up to 128 characters in length and can contain letters, digits, spaces, periods (.), underscores (_), and hyphens (-). Chinese characters are supported. This parameter can be left empty.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        public Builder description(String description) {
            this.putBodyParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * <p>The name of the disabled software tag. Fuzzy match is supported. The name can be up to 128 characters in length and can contain letters, digits, periods (.), underscores (_), and hyphens (-). Chinese characters are supported. Spaces are not supported.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>autotest_616bcc13</p>
         */
        public Builder name(String name) {
            this.putBodyParameter("Name", name);
            this.name = name;
            return this;
        }

        @Override
        public CreateProhibitedTagRequest build() {
            return new CreateProhibitedTagRequest(this);
        } 

    } 

}
