// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.kms20160120.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteNetworkRuleRequest} extends {@link RequestModel}
 *
 * <p>DeleteNetworkRuleRequest</p>
 */
public class DeleteNetworkRuleRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Name")
    @com.aliyun.core.annotation.Validation(required = true)
    private String name;

    private DeleteNetworkRuleRequest(Builder builder) {
        super(builder);
        this.name = builder.name;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteNetworkRuleRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    public static final class Builder extends Request.Builder<DeleteNetworkRuleRequest, Builder> {
        private String name; 

        private Builder() {
            super();
        } 

        private Builder(DeleteNetworkRuleRequest request) {
            super(request);
            this.name = request.name;
        } 

        /**
         * The name of the network access rule that you want to delete.
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
            return this;
        }

        @Override
        public DeleteNetworkRuleRequest build() {
            return new DeleteNetworkRuleRequest(this);
        } 

    } 

}
