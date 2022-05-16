// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.paiplugin20220112.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateUploadUrlRequest} extends {@link RequestModel}
 *
 * <p>UpdateUploadUrlRequest</p>
 */
public class UpdateUploadUrlRequest extends Request {
    @Body
    @NameInMap("Url")
    private String url;

    private UpdateUploadUrlRequest(Builder builder) {
        super(builder);
        this.url = builder.url;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateUploadUrlRequest create() {
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

    public static final class Builder extends Request.Builder<UpdateUploadUrlRequest, Builder> {
        private String url; 

        private Builder() {
            super();
        } 

        private Builder(UpdateUploadUrlRequest request) {
            super(request);
            this.url = request.url;
        } 

        /**
         * 可公开访问的地址。
         */
        public Builder url(String url) {
            this.putBodyParameter("Url", url);
            this.url = url;
            return this;
        }

        @Override
        public UpdateUploadUrlRequest build() {
            return new UpdateUploadUrlRequest(this);
        } 

    } 

}
