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
 * {@link RecognizeIdcardRequest} extends {@link RequestModel}
 *
 * <p>RecognizeIdcardRequest</p>
 */
public class RecognizeIdcardRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Llm_rec")
    private Boolean llmRec;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OutputFigure")
    private Boolean outputFigure;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OutputQualityInfo")
    private Boolean outputQualityInfo;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Url")
    @com.aliyun.core.annotation.Validation(maxLength = 2048)
    private String url;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("body")
    private java.io.InputStream body;

    private RecognizeIdcardRequest(Builder builder) {
        super(builder);
        this.llmRec = builder.llmRec;
        this.outputFigure = builder.outputFigure;
        this.outputQualityInfo = builder.outputQualityInfo;
        this.url = builder.url;
        this.body = builder.body;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RecognizeIdcardRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return llmRec
     */
    public Boolean getLlmRec() {
        return this.llmRec;
    }

    /**
     * @return outputFigure
     */
    public Boolean getOutputFigure() {
        return this.outputFigure;
    }

    /**
     * @return outputQualityInfo
     */
    public Boolean getOutputQualityInfo() {
        return this.outputQualityInfo;
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

    public static final class Builder extends Request.Builder<RecognizeIdcardRequest, Builder> {
        private Boolean llmRec; 
        private Boolean outputFigure; 
        private Boolean outputQualityInfo; 
        private String url; 
        private java.io.InputStream body; 

        private Builder() {
            super();
        } 

        private Builder(RecognizeIdcardRequest request) {
            super(request);
            this.llmRec = request.llmRec;
            this.outputFigure = request.outputFigure;
            this.outputQualityInfo = request.outputQualityInfo;
            this.url = request.url;
            this.body = request.body;
        } 

        /**
         * Llm_rec.
         */
        public Builder llmRec(Boolean llmRec) {
            this.putQueryParameter("Llm_rec", llmRec);
            this.llmRec = llmRec;
            return this;
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
         * OutputQualityInfo.
         */
        public Builder outputQualityInfo(Boolean outputQualityInfo) {
            this.putQueryParameter("OutputQualityInfo", outputQualityInfo);
            this.outputQualityInfo = outputQualityInfo;
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
        public RecognizeIdcardRequest build() {
            return new RecognizeIdcardRequest(this);
        } 

    } 

}
