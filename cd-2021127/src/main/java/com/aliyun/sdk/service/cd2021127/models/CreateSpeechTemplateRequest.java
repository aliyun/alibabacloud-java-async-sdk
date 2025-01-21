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
 * {@link CreateSpeechTemplateRequest} extends {@link RequestModel}
 *
 * <p>CreateSpeechTemplateRequest</p>
 */
public class CreateSpeechTemplateRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Contents")
    @com.aliyun.core.annotation.Validation(required = true)
    private String contents;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Type")
    @com.aliyun.core.annotation.Validation(required = true)
    private String type;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("country")
    private String country;

    private CreateSpeechTemplateRequest(Builder builder) {
        super(builder);
        this.contents = builder.contents;
        this.type = builder.type;
        this.country = builder.country;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateSpeechTemplateRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return contents
     */
    public String getContents() {
        return this.contents;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    /**
     * @return country
     */
    public String getCountry() {
        return this.country;
    }

    public static final class Builder extends Request.Builder<CreateSpeechTemplateRequest, Builder> {
        private String contents; 
        private String type; 
        private String country; 

        private Builder() {
            super();
        } 

        private Builder(CreateSpeechTemplateRequest request) {
            super(request);
            this.contents = request.contents;
            this.type = request.type;
            this.country = request.country;
        } 

        /**
         * <p>This parameter is required.</p>
         */
        public Builder contents(String contents) {
            this.putBodyParameter("Contents", contents);
            this.contents = contents;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>marktest</p>
         */
        public Builder type(String type) {
            this.putBodyParameter("Type", type);
            this.type = type;
            return this;
        }

        /**
         * country.
         */
        public Builder country(String country) {
            this.putBodyParameter("country", country);
            this.country = country;
            return this;
        }

        @Override
        public CreateSpeechTemplateRequest build() {
            return new CreateSpeechTemplateRequest(this);
        } 

    } 

}
