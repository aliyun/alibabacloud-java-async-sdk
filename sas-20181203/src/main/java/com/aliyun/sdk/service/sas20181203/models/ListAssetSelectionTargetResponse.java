// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListAssetSelectionTargetResponse} extends {@link TeaModel}
 *
 * <p>ListAssetSelectionTargetResponse</p>
 */
public class ListAssetSelectionTargetResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListAssetSelectionTargetResponseBody body;

    private ListAssetSelectionTargetResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListAssetSelectionTargetResponse create() {
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
    public ListAssetSelectionTargetResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListAssetSelectionTargetResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListAssetSelectionTargetResponseBody body);

        @Override
        ListAssetSelectionTargetResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListAssetSelectionTargetResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListAssetSelectionTargetResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListAssetSelectionTargetResponse response) {
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
        public Builder body(ListAssetSelectionTargetResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListAssetSelectionTargetResponse build() {
            return new ListAssetSelectionTargetResponse(this);
        } 

    } 

}
