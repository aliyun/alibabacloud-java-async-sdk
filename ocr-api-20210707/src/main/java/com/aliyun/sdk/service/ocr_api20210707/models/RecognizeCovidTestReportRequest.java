// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ocr_api20210707.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RecognizeCovidTestReportRequest} extends {@link RequestModel}
 *
 * <p>RecognizeCovidTestReportRequest</p>
 */
public class RecognizeCovidTestReportRequest extends Request {
    @Query
    @NameInMap("MultipleResult")
    private Boolean multipleResult;

    @Query
    @NameInMap("Url")
    @Validation(maxLength = 2048)
    private String url;

    @Body
    @NameInMap("body")
    private java.io.InputStream body;

    private RecognizeCovidTestReportRequest(Builder builder) {
        super(builder);
        this.multipleResult = builder.multipleResult;
        this.url = builder.url;
        this.body = builder.body;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RecognizeCovidTestReportRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return multipleResult
     */
    public Boolean getMultipleResult() {
        return this.multipleResult;
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

    public static final class Builder extends Request.Builder<RecognizeCovidTestReportRequest, Builder> {
        private Boolean multipleResult; 
        private String url; 
        private java.io.InputStream body; 

        private Builder() {
            super();
        } 

        private Builder(RecognizeCovidTestReportRequest request) {
            super(request);
            this.multipleResult = request.multipleResult;
            this.url = request.url;
            this.body = request.body;
        } 

        /**
         * MultipleResult.
         */
        public Builder multipleResult(Boolean multipleResult) {
            this.putQueryParameter("MultipleResult", multipleResult);
            this.multipleResult = multipleResult;
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
        public RecognizeCovidTestReportRequest build() {
            return new RecognizeCovidTestReportRequest(this);
        } 

    } 

}
