// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.csasedr20241122.models;

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
 * {@link GetClientRuleStrategyDetailRequest} extends {@link RequestModel}
 *
 * <p>GetClientRuleStrategyDetailRequest</p>
 */
public class GetClientRuleStrategyDetailRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Id")
    private Long id;

    private GetClientRuleStrategyDetailRequest(Builder builder) {
        super(builder);
        this.id = builder.id;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetClientRuleStrategyDetailRequest create() {
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

    public static final class Builder extends Request.Builder<GetClientRuleStrategyDetailRequest, Builder> {
        private Long id; 

        private Builder() {
            super();
        } 

        private Builder(GetClientRuleStrategyDetailRequest request) {
            super(request);
            this.id = request.id;
        } 

        /**
         * <p>The ID of the client rule policy. You can obtain the ID from the response of the create operation or the policy list.</p>
         * 
         * <strong>example:</strong>
         * <p>14808</p>
         */
        public Builder id(Long id) {
            this.putQueryParameter("Id", id);
            this.id = id;
            return this;
        }

        @Override
        public GetClientRuleStrategyDetailRequest build() {
            return new GetClientRuleStrategyDetailRequest(this);
        } 

    } 

}
