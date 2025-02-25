// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ocr_api20210707.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link RecognizeEduPaperStructedRequest} extends {@link RequestModel}
 *
 * <p>RecognizeEduPaperStructedRequest</p>
 */
public class RecognizeEduPaperStructedRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NeedRotate")
    private Boolean needRotate;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OutputOricoord")
    private Boolean outputOricoord;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Subject")
    private String subject;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Url")
    @com.aliyun.core.annotation.Validation(maxLength = 2048)
    private String url;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("body")
    private java.io.InputStream body;

    private RecognizeEduPaperStructedRequest(Builder builder) {
        super(builder);
        this.needRotate = builder.needRotate;
        this.outputOricoord = builder.outputOricoord;
        this.subject = builder.subject;
        this.url = builder.url;
        this.body = builder.body;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RecognizeEduPaperStructedRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return needRotate
     */
    public Boolean getNeedRotate() {
        return this.needRotate;
    }

    /**
     * @return outputOricoord
     */
    public Boolean getOutputOricoord() {
        return this.outputOricoord;
    }

    /**
     * @return subject
     */
    public String getSubject() {
        return this.subject;
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

    public static final class Builder extends Request.Builder<RecognizeEduPaperStructedRequest, Builder> {
        private Boolean needRotate; 
        private Boolean outputOricoord; 
        private String subject; 
        private String url; 
        private java.io.InputStream body; 

        private Builder() {
            super();
        } 

        private Builder(RecognizeEduPaperStructedRequest request) {
            super(request);
            this.needRotate = request.needRotate;
            this.outputOricoord = request.outputOricoord;
            this.subject = request.subject;
            this.url = request.url;
            this.body = request.body;
        } 

        /**
         * NeedRotate.
         */
        public Builder needRotate(Boolean needRotate) {
            this.putQueryParameter("NeedRotate", needRotate);
            this.needRotate = needRotate;
            return this;
        }

        /**
         * OutputOricoord.
         */
        public Builder outputOricoord(Boolean outputOricoord) {
            this.putQueryParameter("OutputOricoord", outputOricoord);
            this.outputOricoord = outputOricoord;
            return this;
        }

        /**
         * Subject.
         */
        public Builder subject(String subject) {
            this.putQueryParameter("Subject", subject);
            this.subject = subject;
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
        public RecognizeEduPaperStructedRequest build() {
            return new RecognizeEduPaperStructedRequest(this);
        } 

    } 

}
