// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.fnf20190315.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteFlowRequest} extends {@link RequestModel}
 *
 * <p>DeleteFlowRequest</p>
 */
public class DeleteFlowRequest extends Request {
    @Body
    @NameInMap("Name")
    @Validation(required = true)
    private String name;

    private DeleteFlowRequest(Builder builder) {
        super(builder);
        this.name = builder.name;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteFlowRequest create() {
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

    public static final class Builder extends Request.Builder<DeleteFlowRequest, Builder> {
        private String name; 

        private Builder() {
            super();
        } 

        private Builder(DeleteFlowRequest request) {
            super(request);
            this.name = request.name;
        } 

        /**
         * Name.
         */
        public Builder name(String name) {
            this.putBodyParameter("Name", name);
            this.name = name;
            return this;
        }

        @Override
        public DeleteFlowRequest build() {
            return new DeleteFlowRequest(this);
        } 

    } 

}
