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
 * {@link CompleteRegistrationPbcVersionRequest} extends {@link RequestModel}
 *
 * <p>CompleteRegistrationPbcVersionRequest</p>
 */
public class CompleteRegistrationPbcVersionRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("id")
    private Long id;

    private CompleteRegistrationPbcVersionRequest(Builder builder) {
        super(builder);
        this.id = builder.id;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CompleteRegistrationPbcVersionRequest create() {
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

    public static final class Builder extends Request.Builder<CompleteRegistrationPbcVersionRequest, Builder> {
        private Long id; 

        private Builder() {
            super();
        } 

        private Builder(CompleteRegistrationPbcVersionRequest request) {
            super(request);
            this.id = request.id;
        } 

        /**
         * id.
         */
        public Builder id(Long id) {
            this.putPathParameter("id", id);
            this.id = id;
            return this;
        }

        @Override
        public CompleteRegistrationPbcVersionRequest build() {
            return new CompleteRegistrationPbcVersionRequest(this);
        } 

    } 

}
