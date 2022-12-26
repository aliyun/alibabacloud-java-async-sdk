// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListCheckItemWarningMachineResponse} extends {@link TeaModel}
 *
 * <p>ListCheckItemWarningMachineResponse</p>
 */
public class ListCheckItemWarningMachineResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListCheckItemWarningMachineResponseBody body;

    private ListCheckItemWarningMachineResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListCheckItemWarningMachineResponse create() {
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
    public ListCheckItemWarningMachineResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListCheckItemWarningMachineResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListCheckItemWarningMachineResponseBody body);

        @Override
        ListCheckItemWarningMachineResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListCheckItemWarningMachineResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListCheckItemWarningMachineResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListCheckItemWarningMachineResponse response) {
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
        public Builder body(ListCheckItemWarningMachineResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListCheckItemWarningMachineResponse build() {
            return new ListCheckItemWarningMachineResponse(this);
        } 

    } 

}
