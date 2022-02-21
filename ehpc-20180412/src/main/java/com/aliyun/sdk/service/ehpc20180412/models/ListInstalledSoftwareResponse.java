// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ehpc20180412.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListInstalledSoftwareResponse} extends {@link TeaModel}
 *
 * <p>ListInstalledSoftwareResponse</p>
 */
public class ListInstalledSoftwareResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListInstalledSoftwareResponseBody body;

    private ListInstalledSoftwareResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListInstalledSoftwareResponse create() {
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
    public ListInstalledSoftwareResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListInstalledSoftwareResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListInstalledSoftwareResponseBody body);

        @Override
        ListInstalledSoftwareResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListInstalledSoftwareResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListInstalledSoftwareResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListInstalledSoftwareResponse response) {
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
        public Builder body(ListInstalledSoftwareResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListInstalledSoftwareResponse build() {
            return new ListInstalledSoftwareResponse(this);
        } 

    } 

}
