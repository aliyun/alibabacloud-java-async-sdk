// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.workorder20200326.models;

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
 * {@link CreateTicketRequest} extends {@link RequestModel}
 *
 * <p>CreateTicketRequest</p>
 */
public class CreateTicketRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Category")
    @com.aliyun.core.annotation.Validation(required = true)
    private String category;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Content")
    @com.aliyun.core.annotation.Validation(required = true)
    private String content;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Email")
    @com.aliyun.core.annotation.Validation(required = true)
    private String email;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Language")
    private String language;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NotifyTimeRange")
    private String notifyTimeRange;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Phone")
    private String phone;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ProductCode")
    @com.aliyun.core.annotation.Validation(required = true)
    private String productCode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SecretContent")
    private String secretContent;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Title")
    private String title;

    private CreateTicketRequest(Builder builder) {
        super(builder);
        this.category = builder.category;
        this.content = builder.content;
        this.email = builder.email;
        this.language = builder.language;
        this.notifyTimeRange = builder.notifyTimeRange;
        this.phone = builder.phone;
        this.productCode = builder.productCode;
        this.secretContent = builder.secretContent;
        this.title = builder.title;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateTicketRequest create() {
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
     * @return content
     */
    public String getContent() {
        return this.content;
    }

    /**
     * @return email
     */
    public String getEmail() {
        return this.email;
    }

    /**
     * @return language
     */
    public String getLanguage() {
        return this.language;
    }

    /**
     * @return notifyTimeRange
     */
    public String getNotifyTimeRange() {
        return this.notifyTimeRange;
    }

    /**
     * @return phone
     */
    public String getPhone() {
        return this.phone;
    }

    /**
     * @return productCode
     */
    public String getProductCode() {
        return this.productCode;
    }

    /**
     * @return secretContent
     */
    public String getSecretContent() {
        return this.secretContent;
    }

    /**
     * @return title
     */
    public String getTitle() {
        return this.title;
    }

    public static final class Builder extends Request.Builder<CreateTicketRequest, Builder> {
        private String category; 
        private String content; 
        private String email; 
        private String language; 
        private String notifyTimeRange; 
        private String phone; 
        private String productCode; 
        private String secretContent; 
        private String title; 

        private Builder() {
            super();
        } 

        private Builder(CreateTicketRequest request) {
            super(request);
            this.category = request.category;
            this.content = request.content;
            this.email = request.email;
            this.language = request.language;
            this.notifyTimeRange = request.notifyTimeRange;
            this.phone = request.phone;
            this.productCode = request.productCode;
            this.secretContent = request.secretContent;
            this.title = request.title;
        } 

        /**
         * <p>This parameter is required.</p>
         */
        public Builder category(String category) {
            this.putQueryParameter("Category", category);
            this.category = category;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder content(String content) {
            this.putQueryParameter("Content", content);
            this.content = content;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="mailto:support@aliyun.com">support@aliyun.com</a></p>
         */
        public Builder email(String email) {
            this.putQueryParameter("Email", email);
            this.email = email;
            return this;
        }

        /**
         * Language.
         */
        public Builder language(String language) {
            this.putQueryParameter("Language", language);
            this.language = language;
            return this;
        }

        /**
         * NotifyTimeRange.
         */
        public Builder notifyTimeRange(String notifyTimeRange) {
            this.putQueryParameter("NotifyTimeRange", notifyTimeRange);
            this.notifyTimeRange = notifyTimeRange;
            return this;
        }

        /**
         * Phone.
         */
        public Builder phone(String phone) {
            this.putQueryParameter("Phone", phone);
            this.phone = phone;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ecs</p>
         */
        public Builder productCode(String productCode) {
            this.putQueryParameter("ProductCode", productCode);
            this.productCode = productCode;
            return this;
        }

        /**
         * SecretContent.
         */
        public Builder secretContent(String secretContent) {
            this.putQueryParameter("SecretContent", secretContent);
            this.secretContent = secretContent;
            return this;
        }

        /**
         * Title.
         */
        public Builder title(String title) {
            this.putQueryParameter("Title", title);
            this.title = title;
            return this;
        }

        @Override
        public CreateTicketRequest build() {
            return new CreateTicketRequest(this);
        } 

    } 

}
