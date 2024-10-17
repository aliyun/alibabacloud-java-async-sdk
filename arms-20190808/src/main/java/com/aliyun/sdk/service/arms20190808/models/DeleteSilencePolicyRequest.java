// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.arms20190808.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DeleteSilencePolicyRequest} extends {@link RequestModel}
 *
 * <p>DeleteSilencePolicyRequest</p>
 */
public class DeleteSilencePolicyRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Id")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long id;

    private DeleteSilencePolicyRequest(Builder builder) {
        super(builder);
        this.id = builder.id;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteSilencePolicyRequest create() {
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

    public static final class Builder extends Request.Builder<DeleteSilencePolicyRequest, Builder> {
        private Long id; 

        private Builder() {
            super();
        } 

        private Builder(DeleteSilencePolicyRequest request) {
            super(request);
            this.id = request.id;
        } 

        /**
         * <p>The ID of the silence policy.</p>
         * <p>For more information about how to obtain the ID of a silence policy, see <a href="https://help.aliyun.com/document_detail/2612383.html">ListSilencePolicies</a>.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1234</p>
         */
        public Builder id(Long id) {
            this.putQueryParameter("Id", id);
            this.id = id;
            return this;
        }

        @Override
        public DeleteSilencePolicyRequest build() {
            return new DeleteSilencePolicyRequest(this);
        } 

    } 

}
