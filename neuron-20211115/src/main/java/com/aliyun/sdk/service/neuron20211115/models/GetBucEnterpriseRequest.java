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
 * {@link GetBucEnterpriseRequest} extends {@link RequestModel}
 *
 * <p>GetBucEnterpriseRequest</p>
 */
public class GetBucEnterpriseRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("enterpriseId")
    private Long enterpriseId;

    private GetBucEnterpriseRequest(Builder builder) {
        super(builder);
        this.enterpriseId = builder.enterpriseId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetBucEnterpriseRequest create() {
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

    public static final class Builder extends Request.Builder<GetBucEnterpriseRequest, Builder> {
        private Long enterpriseId; 

        private Builder() {
            super();
        } 

        private Builder(GetBucEnterpriseRequest request) {
            super(request);
            this.enterpriseId = request.enterpriseId;
        } 

        /**
         * enterpriseId.
         */
        public Builder enterpriseId(Long enterpriseId) {
            this.putPathParameter("enterpriseId", enterpriseId);
            this.enterpriseId = enterpriseId;
            return this;
        }

        @Override
        public GetBucEnterpriseRequest build() {
            return new GetBucEnterpriseRequest(this);
        } 

    } 

}
