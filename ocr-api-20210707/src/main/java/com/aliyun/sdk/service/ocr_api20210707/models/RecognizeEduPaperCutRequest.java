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
 * {@link RecognizeEduPaperCutRequest} extends {@link RequestModel}
 *
 * <p>RecognizeEduPaperCutRequest</p>
 */
public class RecognizeEduPaperCutRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CutType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String cutType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ImageType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String imageType;

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

    private RecognizeEduPaperCutRequest(Builder builder) {
        super(builder);
        this.cutType = builder.cutType;
        this.imageType = builder.imageType;
        this.outputOricoord = builder.outputOricoord;
        this.subject = builder.subject;
        this.url = builder.url;
        this.body = builder.body;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RecognizeEduPaperCutRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return cutType
     */
    public String getCutType() {
        return this.cutType;
    }

    /**
     * @return imageType
     */
    public String getImageType() {
        return this.imageType;
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

    public static final class Builder extends Request.Builder<RecognizeEduPaperCutRequest, Builder> {
        private String cutType; 
        private String imageType; 
        private Boolean outputOricoord; 
        private String subject; 
        private String url; 
        private java.io.InputStream body; 

        private Builder() {
            super();
        } 

        private Builder(RecognizeEduPaperCutRequest request) {
            super(request);
            this.cutType = request.cutType;
            this.imageType = request.imageType;
            this.outputOricoord = request.outputOricoord;
            this.subject = request.subject;
            this.url = request.url;
            this.body = request.body;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>question：题目， answer：答案</p>
         */
        public Builder cutType(String cutType) {
            this.putQueryParameter("CutType", cutType);
            this.cutType = cutType;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>scan：扫描图， photo：实拍图</p>
         */
        public Builder imageType(String imageType) {
            this.putQueryParameter("ImageType", imageType);
            this.imageType = imageType;
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
        public RecognizeEduPaperCutRequest build() {
            return new RecognizeEduPaperCutRequest(this);
        } 

    } 

}
