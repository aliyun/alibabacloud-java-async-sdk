// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ltl20190510.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListMPCoSPhaseResponse} extends {@link TeaModel}
 *
 * <p>ListMPCoSPhaseResponse</p>
 */
public class ListMPCoSPhaseResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListMPCoSPhaseResponseBody body;

    private ListMPCoSPhaseResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListMPCoSPhaseResponse create() {
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
    public ListMPCoSPhaseResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListMPCoSPhaseResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListMPCoSPhaseResponseBody body);

        @Override
        ListMPCoSPhaseResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListMPCoSPhaseResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListMPCoSPhaseResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListMPCoSPhaseResponse response) {
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
        public Builder body(ListMPCoSPhaseResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListMPCoSPhaseResponse build() {
            return new ListMPCoSPhaseResponse(this);
        } 

    } 

}
