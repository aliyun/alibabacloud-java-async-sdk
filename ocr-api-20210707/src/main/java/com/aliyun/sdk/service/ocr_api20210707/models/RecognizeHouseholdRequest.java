// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ocr_api20210707.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RecognizeHouseholdRequest} extends {@link RequestModel}
 *
 * <p>RecognizeHouseholdRequest</p>
 */
public class RecognizeHouseholdRequest extends Request {
    @Query
    @NameInMap("IsResidentPage")
    private Boolean isResidentPage;

    @Query
    @NameInMap("Url")
    @Validation(maxLength = 2048)
    private String url;

    @Body
    @NameInMap("body")
    private java.io.InputStream body;

    private RecognizeHouseholdRequest(Builder builder) {
        super(builder);
        this.isResidentPage = builder.isResidentPage;
        this.url = builder.url;
        this.body = builder.body;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RecognizeHouseholdRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return isResidentPage
     */
    public Boolean getIsResidentPage() {
        return this.isResidentPage;
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

    public static final class Builder extends Request.Builder<RecognizeHouseholdRequest, Builder> {
        private Boolean isResidentPage; 
        private String url; 
        private java.io.InputStream body; 

        private Builder() {
            super();
        } 

        private Builder(RecognizeHouseholdRequest request) {
            super(request);
            this.isResidentPage = request.isResidentPage;
            this.url = request.url;
            this.body = request.body;
        } 

        /**
         * IsResidentPage.
         */
        public Builder isResidentPage(Boolean isResidentPage) {
            this.putQueryParameter("IsResidentPage", isResidentPage);
            this.isResidentPage = isResidentPage;
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
        public RecognizeHouseholdRequest build() {
            return new RecognizeHouseholdRequest(this);
        } 

    } 

}
