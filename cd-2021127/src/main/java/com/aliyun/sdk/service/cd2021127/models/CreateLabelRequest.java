// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cd2021127.models;

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
 * {@link CreateLabelRequest} extends {@link RequestModel}
 *
 * <p>CreateLabelRequest</p>
 */
public class CreateLabelRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Category")
    @com.aliyun.core.annotation.Validation(required = true, maxLength = 32, minLength = 1)
    private String category;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Country")
    private String country;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Label")
    @com.aliyun.core.annotation.Validation(required = true, maxLength = 21, minLength = 1)
    private String label;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Title")
    @com.aliyun.core.annotation.Validation(required = true, maxLength = 32, minLength = 1)
    private String title;

    private CreateLabelRequest(Builder builder) {
        super(builder);
        this.category = builder.category;
        this.country = builder.country;
        this.label = builder.label;
        this.title = builder.title;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateLabelRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return category
     */
    public String getCategory() {
        return this.category;
    }

    /**
     * @return country
     */
    public String getCountry() {
        return this.country;
    }

    /**
     * @return label
     */
    public String getLabel() {
        return this.label;
    }

    /**
     * @return title
     */
    public String getTitle() {
        return this.title;
    }

    public static final class Builder extends Request.Builder<CreateLabelRequest, Builder> {
        private String category; 
        private String country; 
        private String label; 
        private String title; 

        private Builder() {
            super();
        } 

        private Builder(CreateLabelRequest request) {
            super(request);
            this.category = request.category;
            this.country = request.country;
            this.label = request.label;
            this.title = request.title;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>menu</p>
         */
        public Builder category(String category) {
            this.putBodyParameter("Category", category);
            this.category = category;
            return this;
        }

        /**
         * Country.
         */
        public Builder country(String country) {
            this.putBodyParameter("Country", country);
            this.country = country;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>MORNING</p>
         */
        public Builder label(String label) {
            this.putBodyParameter("Label", label);
            this.label = label;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>示例标题</p>
         */
        public Builder title(String title) {
            this.putBodyParameter("Title", title);
            this.title = title;
            return this;
        }

        @Override
        public CreateLabelRequest build() {
            return new CreateLabelRequest(this);
        } 

    } 

}
