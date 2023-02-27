// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ccc20200701.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListRealtimeSkillGroupStatesResponse} extends {@link TeaModel}
 *
 * <p>ListRealtimeSkillGroupStatesResponse</p>
 */
public class ListRealtimeSkillGroupStatesResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListRealtimeSkillGroupStatesResponseBody body;

    private ListRealtimeSkillGroupStatesResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListRealtimeSkillGroupStatesResponse create() {
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
    public ListRealtimeSkillGroupStatesResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListRealtimeSkillGroupStatesResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListRealtimeSkillGroupStatesResponseBody body);

        @Override
        ListRealtimeSkillGroupStatesResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListRealtimeSkillGroupStatesResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListRealtimeSkillGroupStatesResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListRealtimeSkillGroupStatesResponse response) {
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
        public Builder body(ListRealtimeSkillGroupStatesResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListRealtimeSkillGroupStatesResponse build() {
            return new ListRealtimeSkillGroupStatesResponse(this);
        } 

    } 

}
