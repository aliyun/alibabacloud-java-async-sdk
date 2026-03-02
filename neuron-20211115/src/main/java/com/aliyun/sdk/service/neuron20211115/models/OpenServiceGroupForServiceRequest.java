// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.neuron20211115.models;

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
 * {@link OpenServiceGroupForServiceRequest} extends {@link RequestModel}
 *
 * <p>OpenServiceGroupForServiceRequest</p>
 */
public class OpenServiceGroupForServiceRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("body")
    private OpenServiceGroupForServiceCmd body;

    private OpenServiceGroupForServiceRequest(Builder builder) {
        super(builder);
        this.body = builder.body;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static OpenServiceGroupForServiceRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return body
     */
    public OpenServiceGroupForServiceCmd getBody() {
        return this.body;
    }

    public static final class Builder extends Request.Builder<OpenServiceGroupForServiceRequest, Builder> {
        private OpenServiceGroupForServiceCmd body; 

        private Builder() {
            super();
        } 

        private Builder(OpenServiceGroupForServiceRequest request) {
            super(request);
            this.body = request.body;
        } 

        /**
         * body.
         */
        public Builder body(OpenServiceGroupForServiceCmd body) {
            this.putBodyParameter("body", body);
            this.body = body;
            return this;
        }

        @Override
        public OpenServiceGroupForServiceRequest build() {
            return new OpenServiceGroupForServiceRequest(this);
        } 

    } 

}
