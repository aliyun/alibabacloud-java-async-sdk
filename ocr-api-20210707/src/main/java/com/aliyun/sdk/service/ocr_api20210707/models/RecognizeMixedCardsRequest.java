// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ocr_api20210707.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RecognizeMixedCardsRequest} extends {@link RequestModel}
 *
 * <p>RecognizeMixedCardsRequest</p>
 */
public class RecognizeMixedCardsRequest extends Request {
    @Query
    @NameInMap("Url")
    @Validation(required = true)
    private String url;

    private RecognizeMixedCardsRequest(Builder builder) {
        super(builder);
        this.url = builder.url;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RecognizeMixedCardsRequest create() {
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

    public static final class Builder extends Request.Builder<RecognizeMixedCardsRequest, Builder> {
        private String url; 

        private Builder() {
            super();
        } 

        private Builder(RecognizeMixedCardsRequest response) {
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
        public RecognizeMixedCardsRequest build() {
            return new RecognizeMixedCardsRequest(this);
        } 

    } 

}
