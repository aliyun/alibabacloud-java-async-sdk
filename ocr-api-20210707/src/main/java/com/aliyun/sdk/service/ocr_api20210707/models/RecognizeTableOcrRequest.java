// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ocr_api20210707.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RecognizeTableOcrRequest} extends {@link RequestModel}
 *
 * <p>RecognizeTableOcrRequest</p>
 */
public class RecognizeTableOcrRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IsHandWriting")
    private String isHandWriting;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("LineLess")
    private Boolean lineLess;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NeedRotate")
    private Boolean needRotate;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SkipDetection")
    private Boolean skipDetection;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Url")
    @com.aliyun.core.annotation.Validation(maxLength = 2048)
    private String url;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("body")
    private java.io.InputStream body;

    private RecognizeTableOcrRequest(Builder builder) {
        super(builder);
        this.isHandWriting = builder.isHandWriting;
        this.lineLess = builder.lineLess;
        this.needRotate = builder.needRotate;
        this.skipDetection = builder.skipDetection;
        this.url = builder.url;
        this.body = builder.body;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RecognizeTableOcrRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return isHandWriting
     */
    public String getIsHandWriting() {
        return this.isHandWriting;
    }

    /**
     * @return lineLess
     */
    public Boolean getLineLess() {
        return this.lineLess;
    }

    /**
     * @return needRotate
     */
    public Boolean getNeedRotate() {
        return this.needRotate;
    }

    /**
     * @return skipDetection
     */
    public Boolean getSkipDetection() {
        return this.skipDetection;
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

    public static final class Builder extends Request.Builder<RecognizeTableOcrRequest, Builder> {
        private String isHandWriting; 
        private Boolean lineLess; 
        private Boolean needRotate; 
        private Boolean skipDetection; 
        private String url; 
        private java.io.InputStream body; 

        private Builder() {
            super();
        } 

        private Builder(RecognizeTableOcrRequest request) {
            super(request);
            this.isHandWriting = request.isHandWriting;
            this.lineLess = request.lineLess;
            this.needRotate = request.needRotate;
            this.skipDetection = request.skipDetection;
            this.url = request.url;
            this.body = request.body;
        } 

        /**
         * IsHandWriting.
         */
        public Builder isHandWriting(String isHandWriting) {
            this.putQueryParameter("IsHandWriting", isHandWriting);
            this.isHandWriting = isHandWriting;
            return this;
        }

        /**
         * LineLess.
         */
        public Builder lineLess(Boolean lineLess) {
            this.putQueryParameter("LineLess", lineLess);
            this.lineLess = lineLess;
            return this;
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
         * SkipDetection.
         */
        public Builder skipDetection(Boolean skipDetection) {
            this.putQueryParameter("SkipDetection", skipDetection);
            this.skipDetection = skipDetection;
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
        public RecognizeTableOcrRequest build() {
            return new RecognizeTableOcrRequest(this);
        } 

    } 

}
