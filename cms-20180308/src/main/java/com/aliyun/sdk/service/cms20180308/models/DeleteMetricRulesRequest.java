// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20180308.models;

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
 * {@link DeleteMetricRulesRequest} extends {@link RequestModel}
 *
 * <p>DeleteMetricRulesRequest</p>
 */
public class DeleteMetricRulesRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Id")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<String> id;

    private DeleteMetricRulesRequest(Builder builder) {
        super(builder);
        this.id = builder.id;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteMetricRulesRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return id
     */
    public java.util.List<String> getId() {
        return this.id;
    }

    public static final class Builder extends Request.Builder<DeleteMetricRulesRequest, Builder> {
        private java.util.List<String> id; 

        private Builder() {
            super();
        } 

        private Builder(DeleteMetricRulesRequest request) {
            super(request);
            this.id = request.id;
        } 

        /**
         * <p>This parameter is required.</p>
         */
        public Builder id(java.util.List<String> id) {
            this.putQueryParameter("Id", id);
            this.id = id;
            return this;
        }

        @Override
        public DeleteMetricRulesRequest build() {
            return new DeleteMetricRulesRequest(this);
        } 

    } 

}
