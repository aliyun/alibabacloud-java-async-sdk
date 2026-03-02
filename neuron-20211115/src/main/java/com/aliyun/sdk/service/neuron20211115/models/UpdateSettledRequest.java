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
 * {@link UpdateSettledRequest} extends {@link RequestModel}
 *
 * <p>UpdateSettledRequest</p>
 */
public class UpdateSettledRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("id")
    private Long id;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("body")
    private SettledUpdateCmd body;

    private UpdateSettledRequest(Builder builder) {
        super(builder);
        this.id = builder.id;
        this.body = builder.body;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateSettledRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return id
     */
    public Long getId() {
        return this.id;
    }

    /**
     * @return body
     */
    public SettledUpdateCmd getBody() {
        return this.body;
    }

    public static final class Builder extends Request.Builder<UpdateSettledRequest, Builder> {
        private Long id; 
        private SettledUpdateCmd body; 

        private Builder() {
            super();
        } 

        private Builder(UpdateSettledRequest request) {
            super(request);
            this.id = request.id;
            this.body = request.body;
        } 

        /**
         * id.
         */
        public Builder id(Long id) {
            this.putPathParameter("id", id);
            this.id = id;
            return this;
        }

        /**
         * body.
         */
        public Builder body(SettledUpdateCmd body) {
            this.putBodyParameter("body", body);
            this.body = body;
            return this;
        }

        @Override
        public UpdateSettledRequest build() {
            return new UpdateSettledRequest(this);
        } 

    } 

}
