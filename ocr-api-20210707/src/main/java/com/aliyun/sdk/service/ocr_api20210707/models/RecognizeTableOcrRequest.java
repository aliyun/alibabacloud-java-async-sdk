// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ocr_api20210707.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RecognizeTableOcrRequest} extends {@link RequestModel}
 *
 * <p>RecognizeTableOcrRequest</p>
 */
public class RecognizeTableOcrRequest extends Request {
    @Query
    @NameInMap("LineLess")
    private Boolean lineLess;

    @Query
    @NameInMap("NeedRotate")
    private Boolean needRotate;

    @Query
    @NameInMap("SkipDetection")
    private Boolean skipDetection;

    @Query
    @NameInMap("Url")
    private String url;

    @Body
    @NameInMap("body")
    private java.io.InputStream body;

    private RecognizeTableOcrRequest(Builder builder) {
        super(builder);
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
            this.lineLess = request.lineLess;
            this.needRotate = request.needRotate;
            this.skipDetection = request.skipDetection;
            this.url = request.url;
            this.body = request.body;
        } 

        /**
         * 是否无线条
         */
        public Builder lineLess(Boolean lineLess) {
            this.putQueryParameter("LineLess", lineLess);
            this.lineLess = lineLess;
            return this;
        }

        /**
         * 是否需要自动旋转功能，默认需要
         */
        public Builder needRotate(Boolean needRotate) {
            this.putQueryParameter("NeedRotate", needRotate);
            this.needRotate = needRotate;
            return this;
        }

        /**
         * 是否跳过表格识别，如果没有检测到表格，可以设置"skip_detection":true
         */
        public Builder skipDetection(Boolean skipDetection) {
            this.putQueryParameter("SkipDetection", skipDetection);
            this.skipDetection = skipDetection;
            return this;
        }

        /**
         * 图片链接（长度不超 2048，不支持 base64）
         */
        public Builder url(String url) {
            this.putQueryParameter("Url", url);
            this.url = url;
            return this;
        }

        /**
         * 图片二进制字节流，最大10MB
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
