// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ocr_api20210707.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RecognizeInternationalBusinessLicenseRequest} extends {@link RequestModel}
 *
 * <p>RecognizeInternationalBusinessLicenseRequest</p>
 */
public class RecognizeInternationalBusinessLicenseRequest extends Request {
    @Query
    @NameInMap("Country")
    @Validation(required = true)
    private String country;

    @Query
    @NameInMap("Url")
    @Validation(maxLength = 2048)
    private String url;

    @Body
    @NameInMap("body")
    private java.io.InputStream body;

    private RecognizeInternationalBusinessLicenseRequest(Builder builder) {
        super(builder);
        this.country = builder.country;
        this.url = builder.url;
        this.body = builder.body;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RecognizeInternationalBusinessLicenseRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return country
     */
    public String getCountry() {
        return this.country;
    }

    /**
     * @return url
     */
    public String getUrl() {
        return this.url;
    }

    /**
     * @return body
     */
    public java.io.InputStream getBody() {
        return this.body;
    }

    public static final class Builder extends Request.Builder<RecognizeInternationalBusinessLicenseRequest, Builder> {
        private String country; 
        private String url; 
        private java.io.InputStream body; 

        private Builder() {
            super();
        } 

        private Builder(RecognizeInternationalBusinessLicenseRequest request) {
            super(request);
            this.country = request.country;
            this.url = request.url;
            this.body = request.body;
        } 

        /**
         * Country.
         */
        public Builder country(String country) {
            this.putQueryParameter("Country", country);
            this.country = country;
            return this;
        }

        /**
         * Url.
         */
        public Builder url(String url) {
            this.putQueryParameter("Url", url);
            this.url = url;
            return this;
        }

        /**
         * body.
         */
        public Builder body(java.io.InputStream body) {
            this.putBodyParameter("body", body);
            this.body = body;
            return this;
        }

        @Override
        public RecognizeInternationalBusinessLicenseRequest build() {
            return new RecognizeInternationalBusinessLicenseRequest(this);
        } 

    } 

}
