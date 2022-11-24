// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ocr_api20210707.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RecognizeIdcardRequest} extends {@link RequestModel}
 *
 * <p>RecognizeIdcardRequest</p>
 */
public class RecognizeIdcardRequest extends Request {
    @Query
    @NameInMap("OutputFigure")
    private Boolean outputFigure;

    @Query
    @NameInMap("OutputQualityInfo")
    private Boolean outputQualityInfo;

    @Query
    @NameInMap("Url")
    private String url;

    @Body
    @NameInMap("body")
    private java.io.InputStream body;

    private RecognizeIdcardRequest(Builder builder) {
        super(builder);
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
        private Boolean outputFigure; 
        private Boolean outputQualityInfo; 
        private String url; 
        private java.io.InputStream body; 

        private Builder() {
            super();
        } 

        private Builder(RecognizeIdcardRequest request) {
            super(request);
            this.outputFigure = request.outputFigure;
            this.outputQualityInfo = request.outputQualityInfo;
            this.url = request.url;
            this.body = request.body;
        } 

        /**
         * 是否需要图案检测功能，默认不需要
         */
        public Builder outputFigure(Boolean outputFigure) {
            this.putQueryParameter("OutputFigure", outputFigure);
            this.outputFigure = outputFigure;
            return this;
        }

        /**
         * 是否需要输出身份证质量检测信息
         */
        public Builder outputQualityInfo(Boolean outputQualityInfo) {
            this.putQueryParameter("OutputQualityInfo", outputQualityInfo);
            this.outputQualityInfo = outputQualityInfo;
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
        public RecognizeIdcardRequest build() {
            return new RecognizeIdcardRequest(this);
        } 

    } 

}
