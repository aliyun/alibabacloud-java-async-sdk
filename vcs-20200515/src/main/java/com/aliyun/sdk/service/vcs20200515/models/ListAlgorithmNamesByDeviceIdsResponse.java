// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vcs20200515.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListAlgorithmNamesByDeviceIdsResponse} extends {@link TeaModel}
 *
 * <p>ListAlgorithmNamesByDeviceIdsResponse</p>
 */
public class ListAlgorithmNamesByDeviceIdsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListAlgorithmNamesByDeviceIdsResponseBody body;

    private ListAlgorithmNamesByDeviceIdsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListAlgorithmNamesByDeviceIdsResponse create() {
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
    public ListAlgorithmNamesByDeviceIdsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListAlgorithmNamesByDeviceIdsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListAlgorithmNamesByDeviceIdsResponseBody body);

        @Override
        ListAlgorithmNamesByDeviceIdsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListAlgorithmNamesByDeviceIdsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListAlgorithmNamesByDeviceIdsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListAlgorithmNamesByDeviceIdsResponse response) {
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
        public Builder body(ListAlgorithmNamesByDeviceIdsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListAlgorithmNamesByDeviceIdsResponse build() {
            return new ListAlgorithmNamesByDeviceIdsResponse(this);
        } 

    } 

}
