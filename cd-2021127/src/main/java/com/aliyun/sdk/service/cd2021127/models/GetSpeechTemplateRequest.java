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
 * {@link GetSpeechTemplateRequest} extends {@link RequestModel}
 *
 * <p>GetSpeechTemplateRequest</p>
 */
public class GetSpeechTemplateRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Type")
    @com.aliyun.core.annotation.Validation(required = true)
    private String type;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("country")
    private String country;

    private GetSpeechTemplateRequest(Builder builder) {
        super(builder);
        this.type = builder.type;
        this.country = builder.country;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetSpeechTemplateRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
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

    public static final class Builder extends Request.Builder<GetSpeechTemplateRequest, Builder> {
        private String type; 
        private String country; 

        private Builder() {
            super();
        } 

        private Builder(GetSpeechTemplateRequest request) {
            super(request);
            this.type = request.type;
            this.country = request.country;
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
        public GetSpeechTemplateRequest build() {
            return new GetSpeechTemplateRequest(this);
        } 

    } 

}
