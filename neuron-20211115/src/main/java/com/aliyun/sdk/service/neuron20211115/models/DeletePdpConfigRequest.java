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
 * {@link DeletePdpConfigRequest} extends {@link RequestModel}
 *
 * <p>DeletePdpConfigRequest</p>
 */
public class DeletePdpConfigRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("configId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long configId;

    private DeletePdpConfigRequest(Builder builder) {
        super(builder);
        this.configId = builder.configId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeletePdpConfigRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return configId
     */
    public Long getConfigId() {
        return this.configId;
    }

    public static final class Builder extends Request.Builder<DeletePdpConfigRequest, Builder> {
        private Long configId; 

        private Builder() {
            super();
        } 

        private Builder(DeletePdpConfigRequest request) {
            super(request);
            this.configId = request.configId;
        } 

        /**
         * <p>This parameter is required.</p>
         */
        public Builder configId(Long configId) {
            this.putPathParameter("configId", configId);
            this.configId = configId;
            return this;
        }

        @Override
        public DeletePdpConfigRequest build() {
            return new DeletePdpConfigRequest(this);
        } 

    } 

}
