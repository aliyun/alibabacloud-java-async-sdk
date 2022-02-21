// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ocr_api20210707.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RecognizeDoctypeRequest} extends {@link RequestModel}
 *
 * <p>RecognizeDoctypeRequest</p>
 */
public class RecognizeDoctypeRequest extends Request {
    @Query
    @NameInMap("Url")
    @Validation(required = true)
    private String url;

    private RecognizeDoctypeRequest(Builder builder) {
        super(builder);
        this.url = builder.url;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RecognizeDoctypeRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return url
     */
    public String getUrl() {
        return this.url;
    }

    public static final class Builder extends Request.Builder<RecognizeDoctypeRequest, Builder> {
        private String url; 

        private Builder() {
            super();
        } 

        private Builder(RecognizeDoctypeRequest response) {
            super(response);
            this.url = response.url;
        } 

        /**
         * 图片链接（长度不超 1014，不支持 base64）
         */
        public Builder url(String url) {
            this.putQueryParameter("Url", url);
            this.url = url;
            return this;
        }

        @Override
        public RecognizeDoctypeRequest build() {
            return new RecognizeDoctypeRequest(this);
        } 

    } 

}
