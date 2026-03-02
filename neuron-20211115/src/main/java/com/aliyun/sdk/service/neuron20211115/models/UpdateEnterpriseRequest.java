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
 * {@link UpdateEnterpriseRequest} extends {@link RequestModel}
 *
 * <p>UpdateEnterpriseRequest</p>
 */
public class UpdateEnterpriseRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("enterpriseId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long enterpriseId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("body")
    @com.aliyun.core.annotation.Validation(required = true)
    private EnterpriseInfoUpdateCmd body;

    private UpdateEnterpriseRequest(Builder builder) {
        super(builder);
        this.enterpriseId = builder.enterpriseId;
        this.body = builder.body;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateEnterpriseRequest create() {
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

    /**
     * @return body
     */
    public EnterpriseInfoUpdateCmd getBody() {
        return this.body;
    }

    public static final class Builder extends Request.Builder<UpdateEnterpriseRequest, Builder> {
        private Long enterpriseId; 
        private EnterpriseInfoUpdateCmd body; 

        private Builder() {
            super();
        } 

        private Builder(UpdateEnterpriseRequest request) {
            super(request);
            this.enterpriseId = request.enterpriseId;
            this.body = request.body;
        } 

        /**
         * <p>This parameter is required.</p>
         */
        public Builder enterpriseId(Long enterpriseId) {
            this.putPathParameter("enterpriseId", enterpriseId);
            this.enterpriseId = enterpriseId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder body(EnterpriseInfoUpdateCmd body) {
            this.putBodyParameter("body", body);
            this.body = body;
            return this;
        }

        @Override
        public UpdateEnterpriseRequest build() {
            return new UpdateEnterpriseRequest(this);
        } 

    } 

}
