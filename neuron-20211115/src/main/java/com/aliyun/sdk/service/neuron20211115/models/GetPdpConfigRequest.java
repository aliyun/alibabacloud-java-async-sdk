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
 * {@link GetPdpConfigRequest} extends {@link RequestModel}
 *
 * <p>GetPdpConfigRequest</p>
 */
public class GetPdpConfigRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("configId")
    private Long configId;

    private GetPdpConfigRequest(Builder builder) {
        super(builder);
        this.configId = builder.configId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetPdpConfigRequest create() {
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

    public static final class Builder extends Request.Builder<GetPdpConfigRequest, Builder> {
        private Long configId; 

        private Builder() {
            super();
        } 

        private Builder(GetPdpConfigRequest request) {
            super(request);
            this.configId = request.configId;
        } 

        /**
         * configId.
         */
        public Builder configId(Long configId) {
            this.putPathParameter("configId", configId);
            this.configId = configId;
            return this;
        }

        @Override
        public GetPdpConfigRequest build() {
            return new GetPdpConfigRequest(this);
        } 

    } 

}
