// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.oosops20190601.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeletePublicPatchBaselineRequest} extends {@link RequestModel}
 *
 * <p>DeletePublicPatchBaselineRequest</p>
 */
public class DeletePublicPatchBaselineRequest extends Request {
    @Query
    @NameInMap("Name")
    @Validation(required = true)
    private String name;

    private DeletePublicPatchBaselineRequest(Builder builder) {
        super(builder);
        this.name = builder.name;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeletePublicPatchBaselineRequest create() {
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

    public static final class Builder extends Request.Builder<DeletePublicPatchBaselineRequest, Builder> {
        private String name; 

        private Builder() {
            super();
        } 

        private Builder(DeletePublicPatchBaselineRequest request) {
            super(request);
            this.name = request.name;
        } 

        /**
         * Name.
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
            return this;
        }

        @Override
        public DeletePublicPatchBaselineRequest build() {
            return new DeletePublicPatchBaselineRequest(this);
        } 

    } 

}
