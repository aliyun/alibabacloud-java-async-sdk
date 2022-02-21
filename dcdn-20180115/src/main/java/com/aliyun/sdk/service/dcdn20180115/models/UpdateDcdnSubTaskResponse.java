// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dcdn20180115.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateDcdnSubTaskResponse} extends {@link TeaModel}
 *
 * <p>UpdateDcdnSubTaskResponse</p>
 */
public class UpdateDcdnSubTaskResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private UpdateDcdnSubTaskResponseBody body;

    private UpdateDcdnSubTaskResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static UpdateDcdnSubTaskResponse create() {
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
    public UpdateDcdnSubTaskResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<UpdateDcdnSubTaskResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(UpdateDcdnSubTaskResponseBody body);

        @Override
        UpdateDcdnSubTaskResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<UpdateDcdnSubTaskResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private UpdateDcdnSubTaskResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(UpdateDcdnSubTaskResponse response) {
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
        public Builder body(UpdateDcdnSubTaskResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public UpdateDcdnSubTaskResponse build() {
            return new UpdateDcdnSubTaskResponse(this);
        } 

    } 

}
