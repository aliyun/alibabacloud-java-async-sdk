// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ehpc20170714.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListPreferredEcsTypesResponse} extends {@link TeaModel}
 *
 * <p>ListPreferredEcsTypesResponse</p>
 */
public class ListPreferredEcsTypesResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListPreferredEcsTypesResponseBody body;

    private ListPreferredEcsTypesResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListPreferredEcsTypesResponse create() {
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
    public ListPreferredEcsTypesResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListPreferredEcsTypesResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListPreferredEcsTypesResponseBody body);

        @Override
        ListPreferredEcsTypesResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListPreferredEcsTypesResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListPreferredEcsTypesResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListPreferredEcsTypesResponse response) {
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
        public Builder body(ListPreferredEcsTypesResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListPreferredEcsTypesResponse build() {
            return new ListPreferredEcsTypesResponse(this);
        } 

    } 

}
