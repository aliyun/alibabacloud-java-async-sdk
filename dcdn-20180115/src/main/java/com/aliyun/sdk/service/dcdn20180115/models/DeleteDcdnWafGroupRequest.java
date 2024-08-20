// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dcdn20180115.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteDcdnWafGroupRequest} extends {@link RequestModel}
 *
 * <p>DeleteDcdnWafGroupRequest</p>
 */
public class DeleteDcdnWafGroupRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Id")
    private Long id;

    private DeleteDcdnWafGroupRequest(Builder builder) {
        super(builder);
        this.id = builder.id;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteDcdnWafGroupRequest create() {
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

    public static final class Builder extends Request.Builder<DeleteDcdnWafGroupRequest, Builder> {
        private Long id; 

        private Builder() {
            super();
        } 

        private Builder(DeleteDcdnWafGroupRequest request) {
            super(request);
            this.id = request.id;
        } 

        /**
         * The ID of the custom WAF rule group.
         */
        public Builder id(Long id) {
            this.putBodyParameter("Id", id);
            this.id = id;
            return this;
        }

        @Override
        public DeleteDcdnWafGroupRequest build() {
            return new DeleteDcdnWafGroupRequest(this);
        } 

    } 

}
