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
 * {@link ReadPageBasicRequest} extends {@link RequestModel}
 *
 * <p>ReadPageBasicRequest</p>
 */
public class ReadPageBasicRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("body")
    private ReadPageBody body;

    private ReadPageBasicRequest(Builder builder) {
        super(builder);
        this.body = builder.body;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ReadPageBasicRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return body
     */
    public ReadPageBody getBody() {
        return this.body;
    }

    public static final class Builder extends Request.Builder<ReadPageBasicRequest, Builder> {
        private ReadPageBody body; 

        private Builder() {
            super();
        } 

        private Builder(ReadPageBasicRequest request) {
            super(request);
            this.body = request.body;
        } 

        /**
         * <p>post body</p>
         */
        public Builder body(ReadPageBody body) {
            this.putBodyParameter("body", body);
            this.body = body;
            return this;
        }

        @Override
        public ReadPageBasicRequest build() {
            return new ReadPageBasicRequest(this);
        } 

    } 

}
