// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.live20161101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AddCasterEpisodeGroupContentResponse} extends {@link TeaModel}
 *
 * <p>AddCasterEpisodeGroupContentResponse</p>
 */
public class AddCasterEpisodeGroupContentResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private AddCasterEpisodeGroupContentResponseBody body;

    private AddCasterEpisodeGroupContentResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static AddCasterEpisodeGroupContentResponse create() {
        return new BuilderImpl().build();
    }

    @Override
    public Builder toBuilder() {
        return new BuilderImpl(this);
    }

    /**
     * @return headers
     */
    public java.util.Map < String, String > getHeaders() {
        return this.headers;
    }

    /**
     * @return body
     */
    public AddCasterEpisodeGroupContentResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<AddCasterEpisodeGroupContentResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(AddCasterEpisodeGroupContentResponseBody body);

        @Override
        AddCasterEpisodeGroupContentResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<AddCasterEpisodeGroupContentResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private AddCasterEpisodeGroupContentResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(AddCasterEpisodeGroupContentResponse response) {
            super(response);
            this.headers = response.headers;
            this.body = response.body;
        } 

        /**
         * headers.
         */
        @Override
        public Builder headers(java.util.Map < String, String > headers) {
            this.headers = headers;
            return this;
        }

        /**
         * body.
         */
        @Override
        public Builder body(AddCasterEpisodeGroupContentResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public AddCasterEpisodeGroupContentResponse build() {
            return new AddCasterEpisodeGroupContentResponse(this);
        } 

    } 

}
