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
 * {@link PreviewComponentCrdSchemaRequest} extends {@link RequestModel}
 *
 * <p>PreviewComponentCrdSchemaRequest</p>
 */
public class PreviewComponentCrdSchemaRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("body")
    private PreviewComponentCrdSchemaCmd body;

    private PreviewComponentCrdSchemaRequest(Builder builder) {
        super(builder);
        this.body = builder.body;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PreviewComponentCrdSchemaRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return body
     */
    public PreviewComponentCrdSchemaCmd getBody() {
        return this.body;
    }

    public static final class Builder extends Request.Builder<PreviewComponentCrdSchemaRequest, Builder> {
        private PreviewComponentCrdSchemaCmd body; 

        private Builder() {
            super();
        } 

        private Builder(PreviewComponentCrdSchemaRequest request) {
            super(request);
            this.body = request.body;
        } 

        /**
         * body.
         */
        public Builder body(PreviewComponentCrdSchemaCmd body) {
            this.putBodyParameter("body", body);
            this.body = body;
            return this;
        }

        @Override
        public PreviewComponentCrdSchemaRequest build() {
            return new PreviewComponentCrdSchemaRequest(this);
        } 

    } 

}
