// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudapi20160201.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link TagResourcesSystemTagsResponse} extends {@link TeaModel}
 *
 * <p>TagResourcesSystemTagsResponse</p>
 */
public class TagResourcesSystemTagsResponse extends Response {
    @NameInMap("headers")
    private java.util.Map < String, String > headers;

    @NameInMap("statusCode")
    private Integer statusCode;

    @NameInMap("body")
    private TagResourcesSystemTagsResponseBody body;

    private TagResourcesSystemTagsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static TagResourcesSystemTagsResponse create() {
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
     * @return statusCode
     */
    public Integer getStatusCode() {
        return this.statusCode;
    }

    /**
     * @return body
     */
    public TagResourcesSystemTagsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<TagResourcesSystemTagsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder statusCode(Integer statusCode);

        Builder body(TagResourcesSystemTagsResponseBody body);

        @Override
        TagResourcesSystemTagsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<TagResourcesSystemTagsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private Integer statusCode; 
        private TagResourcesSystemTagsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(TagResourcesSystemTagsResponse response) {
            super(response);
            this.headers = response.headers;
            this.statusCode = response.statusCode;
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
         * statusCode.
         */
        @Override
        public Builder statusCode(Integer statusCode) {
            this.statusCode = statusCode;
            return this;
        }

        /**
         * body.
         */
        @Override
        public Builder body(TagResourcesSystemTagsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public TagResourcesSystemTagsResponse build() {
            return new TagResourcesSystemTagsResponse(this);
        } 

    } 

}
