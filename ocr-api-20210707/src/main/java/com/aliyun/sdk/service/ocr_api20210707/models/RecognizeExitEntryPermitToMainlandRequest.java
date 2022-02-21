// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ocr_api20210707.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RecognizeExitEntryPermitToMainlandRequest} extends {@link RequestModel}
 *
 * <p>RecognizeExitEntryPermitToMainlandRequest</p>
 */
public class RecognizeExitEntryPermitToMainlandRequest extends Request {
    @Query
    @NameInMap("OutputFigure")
    private Boolean outputFigure;

    @Query
    @NameInMap("Url")
    private String url;

    @Body
    @NameInMap("body")
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

        private Builder(RecognizeExitEntryPermitToMainlandRequest response) {
            super(response);
            this.outputFigure = response.outputFigure;
            this.url = response.url;
            this.body = response.body;
        } 

        /**
         * 图案坐标信息输出，针对结构化，如身份证人脸头像
         */
        public Builder outputFigure(Boolean outputFigure) {
            this.putQueryParameter("OutputFigure", outputFigure);
            this.outputFigure = outputFigure;
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
        public RecognizeExitEntryPermitToMainlandRequest build() {
            return new RecognizeExitEntryPermitToMainlandRequest(this);
        } 

    } 

}
