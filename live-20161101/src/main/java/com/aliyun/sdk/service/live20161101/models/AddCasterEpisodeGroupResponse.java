// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.live20161101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AddCasterEpisodeGroupResponse} extends {@link TeaModel}
 *
 * <p>AddCasterEpisodeGroupResponse</p>
 */
public class AddCasterEpisodeGroupResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private AddCasterEpisodeGroupResponseBody body;

    private AddCasterEpisodeGroupResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static AddCasterEpisodeGroupResponse create() {
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
    public AddCasterEpisodeGroupResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<AddCasterEpisodeGroupResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(AddCasterEpisodeGroupResponseBody body);

        @Override
        AddCasterEpisodeGroupResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<AddCasterEpisodeGroupResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private AddCasterEpisodeGroupResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(AddCasterEpisodeGroupResponse response) {
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
        public Builder body(AddCasterEpisodeGroupResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public AddCasterEpisodeGroupResponse build() {
            return new AddCasterEpisodeGroupResponse(this);
        } 

    } 

}
