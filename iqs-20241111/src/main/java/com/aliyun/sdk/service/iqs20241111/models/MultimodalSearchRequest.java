// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iqs20241111.models;

import com.aliyun.sdk.gateway.pop.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link MultimodalSearchRequest} extends {@link RequestModel}
 *
 * <p>MultimodalSearchRequest</p>
 */
public class MultimodalSearchRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("body")
    private MultimodalSearchBody body;

    private MultimodalSearchRequest(Builder builder) {
        super(builder);
        this.body = builder.body;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static MultimodalSearchRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return body
     */
    public MultimodalSearchBody getBody() {
        return this.body;
    }

    public static final class Builder extends Request.Builder<MultimodalSearchRequest, Builder> {
        private MultimodalSearchBody body; 

        private Builder() {
            super();
        } 

        private Builder(MultimodalSearchRequest request) {
            super(request);
            this.body = request.body;
        } 

        /**
         * body.
         */
        public Builder body(MultimodalSearchBody body) {
            this.putBodyParameter("body", body);
            this.body = body;
            return this;
        }

        @Override
        public MultimodalSearchRequest build() {
            return new MultimodalSearchRequest(this);
        } 

    } 

}
