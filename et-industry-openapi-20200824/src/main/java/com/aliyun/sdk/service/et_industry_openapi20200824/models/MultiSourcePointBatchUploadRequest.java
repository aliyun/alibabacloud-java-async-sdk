// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.et_industry_openapi20200824.models;

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
 * {@link MultiSourcePointBatchUploadRequest} extends {@link RequestModel}
 *
 * <p>MultiSourcePointBatchUploadRequest</p>
 */
public class MultiSourcePointBatchUploadRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("body")
    private java.util.Map<String, ?> body;

    private MultiSourcePointBatchUploadRequest(Builder builder) {
        super(builder);
        this.body = builder.body;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static MultiSourcePointBatchUploadRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return body
     */
    public java.util.Map<String, ?> getBody() {
        return this.body;
    }

    public static final class Builder extends Request.Builder<MultiSourcePointBatchUploadRequest, Builder> {
        private java.util.Map<String, ?> body; 

        private Builder() {
            super();
        } 

        private Builder(MultiSourcePointBatchUploadRequest request) {
            super(request);
            this.body = request.body;
        } 

        /**
         * body.
         */
        public Builder body(java.util.Map<String, ?> body) {
            this.putBodyParameter("body", body);
            this.body = body;
            return this;
        }

        @Override
        public MultiSourcePointBatchUploadRequest build() {
            return new MultiSourcePointBatchUploadRequest(this);
        } 

    } 

}
