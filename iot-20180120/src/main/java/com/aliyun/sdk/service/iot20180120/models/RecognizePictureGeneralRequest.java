// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iot20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RecognizePictureGeneralRequest} extends {@link RequestModel}
 *
 * <p>RecognizePictureGeneralRequest</p>
 */
public class RecognizePictureGeneralRequest extends Request {
    @Query
    @NameInMap("Url")
    @Validation(required = true)
    private String url;

    private RecognizePictureGeneralRequest(Builder builder) {
        super(builder);
        this.url = builder.url;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RecognizePictureGeneralRequest create() {
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

    public static final class Builder extends Request.Builder<RecognizePictureGeneralRequest, Builder> {
        private String url; 

        private Builder() {
            super();
        } 

        private Builder(RecognizePictureGeneralRequest request) {
            super(request);
            this.url = request.url;
        } 

        /**
         * Url.
         */
        public Builder url(String url) {
            this.putQueryParameter("Url", url);
            this.url = url;
            return this;
        }

        @Override
        public RecognizePictureGeneralRequest build() {
            return new RecognizePictureGeneralRequest(this);
        } 

    } 

}
