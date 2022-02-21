// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rtc20180111.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeChannelParticipantsResponse} extends {@link TeaModel}
 *
 * <p>DescribeChannelParticipantsResponse</p>
 */
public class DescribeChannelParticipantsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeChannelParticipantsResponseBody body;

    private DescribeChannelParticipantsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeChannelParticipantsResponse create() {
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
    public DescribeChannelParticipantsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeChannelParticipantsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeChannelParticipantsResponseBody body);

        @Override
        DescribeChannelParticipantsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeChannelParticipantsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeChannelParticipantsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeChannelParticipantsResponse response) {
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
        public Builder body(DescribeChannelParticipantsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeChannelParticipantsResponse build() {
            return new DescribeChannelParticipantsResponse(this);
        } 

    } 

}
