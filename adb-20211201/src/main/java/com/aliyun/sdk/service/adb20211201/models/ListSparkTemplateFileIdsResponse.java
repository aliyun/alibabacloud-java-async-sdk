// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adb20211201.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListSparkTemplateFileIdsResponse} extends {@link TeaModel}
 *
 * <p>ListSparkTemplateFileIdsResponse</p>
 */
public class ListSparkTemplateFileIdsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListSparkTemplateFileIdsResponseBody body;

    private ListSparkTemplateFileIdsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListSparkTemplateFileIdsResponse create() {
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
    public ListSparkTemplateFileIdsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListSparkTemplateFileIdsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListSparkTemplateFileIdsResponseBody body);

        @Override
        ListSparkTemplateFileIdsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListSparkTemplateFileIdsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListSparkTemplateFileIdsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListSparkTemplateFileIdsResponse response) {
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
        public Builder body(ListSparkTemplateFileIdsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListSparkTemplateFileIdsResponse build() {
            return new ListSparkTemplateFileIdsResponse(this);
        } 

    } 

}
