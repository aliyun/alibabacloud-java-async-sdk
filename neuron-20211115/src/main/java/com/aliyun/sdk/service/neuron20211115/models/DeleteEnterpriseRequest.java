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
 * {@link DeleteEnterpriseRequest} extends {@link RequestModel}
 *
 * <p>DeleteEnterpriseRequest</p>
 */
public class DeleteEnterpriseRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("enterpriseId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long enterpriseId;

    private DeleteEnterpriseRequest(Builder builder) {
        super(builder);
        this.enterpriseId = builder.enterpriseId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteEnterpriseRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return enterpriseId
     */
    public Long getEnterpriseId() {
        return this.enterpriseId;
    }

    public static final class Builder extends Request.Builder<DeleteEnterpriseRequest, Builder> {
        private Long enterpriseId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteEnterpriseRequest request) {
            super(request);
            this.enterpriseId = request.enterpriseId;
        } 

        /**
         * <p>This parameter is required.</p>
         */
        public Builder enterpriseId(Long enterpriseId) {
            this.putPathParameter("enterpriseId", enterpriseId);
            this.enterpriseId = enterpriseId;
            return this;
        }

        @Override
        public DeleteEnterpriseRequest build() {
            return new DeleteEnterpriseRequest(this);
        } 

    } 

}
