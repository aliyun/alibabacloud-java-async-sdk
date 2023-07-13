// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20190101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteMetricRulesRequest} extends {@link RequestModel}
 *
 * <p>DeleteMetricRulesRequest</p>
 */
public class DeleteMetricRulesRequest extends Request {
    @Query
    @NameInMap("Id")
    @Validation(required = true)
    private java.util.List < String > id;

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
    public java.util.List < String > getId() {
        return this.id;
    }

    public static final class Builder extends Request.Builder<DeleteMetricRulesRequest, Builder> {
        private java.util.List < String > id; 

        private Builder() {
            super();
        } 

        private Builder(DeleteMetricRulesRequest request) {
            super(request);
            this.id = request.id;
        } 

        /**
         * Id.
         */
        public Builder id(java.util.List < String > id) {
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
