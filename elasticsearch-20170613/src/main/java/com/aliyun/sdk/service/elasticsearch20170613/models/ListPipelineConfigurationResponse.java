// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.elasticsearch20170613.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListPipelineConfigurationResponse} extends {@link TeaModel}
 *
 * <p>ListPipelineConfigurationResponse</p>
 */
public class ListPipelineConfigurationResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListPipelineConfigurationResponseBody body;

    private ListPipelineConfigurationResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListPipelineConfigurationResponse create() {
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
    public ListPipelineConfigurationResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListPipelineConfigurationResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListPipelineConfigurationResponseBody body);

        @Override
        ListPipelineConfigurationResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListPipelineConfigurationResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListPipelineConfigurationResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListPipelineConfigurationResponse response) {
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
        public Builder body(ListPipelineConfigurationResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListPipelineConfigurationResponse build() {
            return new ListPipelineConfigurationResponse(this);
        } 

    } 

}
