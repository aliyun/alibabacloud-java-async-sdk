// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ocr_api20210707.models;

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
 * {@link RecognizeExitEntryPermitToMainlandRequest} extends {@link RequestModel}
 *
 * <p>RecognizeExitEntryPermitToMainlandRequest</p>
 */
public class RecognizeExitEntryPermitToMainlandRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OutputFigure")
    private Boolean outputFigure;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Url")
    @com.aliyun.core.annotation.Validation(maxLength = 2048)
    private String url;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("body")
    private java.io.InputStream body;

    private RecognizeExitEntryPermitToMainlandRequest(Builder builder) {
        super(builder);
        this.outputFigure = builder.outputFigure;
        this.url = builder.url;
        this.body = builder.body;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RecognizeExitEntryPermitToMainlandRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return outputFigure
     */
    public Boolean getOutputFigure() {
        return this.outputFigure;
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

    public static final class Builder extends Request.Builder<RecognizeExitEntryPermitToMainlandRequest, Builder> {
        private Boolean outputFigure; 
        private String url; 
        private java.io.InputStream body; 

        private Builder() {
            super();
        } 

        private Builder(RecognizeExitEntryPermitToMainlandRequest request) {
            super(request);
            this.outputFigure = request.outputFigure;
            this.url = request.url;
            this.body = request.body;
        } 

        /**
         * OutputFigure.
         */
        public Builder outputFigure(Boolean outputFigure) {
            this.putQueryParameter("OutputFigure", outputFigure);
            this.outputFigure = outputFigure;
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
        public RecognizeExitEntryPermitToMainlandRequest build() {
            return new RecognizeExitEntryPermitToMainlandRequest(this);
        } 

    } 

}
