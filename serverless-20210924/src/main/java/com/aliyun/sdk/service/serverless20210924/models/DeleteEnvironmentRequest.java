// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.serverless20210924.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteEnvironmentRequest} extends {@link RequestModel}
 *
 * <p>DeleteEnvironmentRequest</p>
 */
public class DeleteEnvironmentRequest extends Request {
    @Path
    @NameInMap("name")
    private String name;

    private DeleteEnvironmentRequest(Builder builder) {
        super(builder);
        this.name = builder.name;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteEnvironmentRequest create() {
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

    public static final class Builder extends Request.Builder<DeleteEnvironmentRequest, Builder> {
        private String name; 

        private Builder() {
            super();
        } 

        private Builder(DeleteEnvironmentRequest request) {
            super(request);
            this.name = request.name;
        } 

        /**
         * A short description of struct
         */
        public Builder name(String name) {
            this.putPathParameter("name", name);
            this.name = name;
            return this;
        }

        @Override
        public DeleteEnvironmentRequest build() {
            return new DeleteEnvironmentRequest(this);
        } 

    } 

}
