// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iot20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RecognizeCarNumRequest} extends {@link RequestModel}
 *
 * <p>RecognizeCarNumRequest</p>
 */
public class RecognizeCarNumRequest extends Request {
    @Query
    @NameInMap("Url")
    private String url;

    private RecognizeCarNumRequest(Builder builder) {
        super(builder);
        this.url = builder.url;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RecognizeCarNumRequest create() {
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

    public static final class Builder extends Request.Builder<RecognizeCarNumRequest, Builder> {
        private String url; 

        private Builder() {
            super();
        } 

        private Builder(RecognizeCarNumRequest request) {
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
        public RecognizeCarNumRequest build() {
            return new RecognizeCarNumRequest(this);
        } 

    } 

}
