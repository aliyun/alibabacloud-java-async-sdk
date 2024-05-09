// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.btripopen20220520.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GroupDepartSaveResponse} extends {@link TeaModel}
 *
 * <p>GroupDepartSaveResponse</p>
 */
public class GroupDepartSaveResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("headers")
    private java.util.Map < String, String > headers;

    @com.aliyun.core.annotation.NameInMap("statusCode")
    private Integer statusCode;

    @com.aliyun.core.annotation.NameInMap("body")
    private GroupDepartSaveResponseBody body;

    private GroupDepartSaveResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static GroupDepartSaveResponse create() {
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
     * @return statusCode
     */
    public Integer getStatusCode() {
        return this.statusCode;
    }

    /**
     * @return body
     */
    public GroupDepartSaveResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GroupDepartSaveResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder statusCode(Integer statusCode);

        Builder body(GroupDepartSaveResponseBody body);

        @Override
        GroupDepartSaveResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GroupDepartSaveResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private Integer statusCode; 
        private GroupDepartSaveResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GroupDepartSaveResponse response) {
            super(response);
            this.headers = response.headers;
            this.statusCode = response.statusCode;
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
         * statusCode.
         */
        @Override
        public Builder statusCode(Integer statusCode) {
            this.statusCode = statusCode;
            return this;
        }

        /**
         * body.
         */
        @Override
        public Builder body(GroupDepartSaveResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GroupDepartSaveResponse build() {
            return new GroupDepartSaveResponse(this);
        } 

    } 

}
