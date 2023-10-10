// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cs20151215.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteKubernetesTriggerRequest} extends {@link RequestModel}
 *
 * <p>DeleteKubernetesTriggerRequest</p>
 */
public class DeleteKubernetesTriggerRequest extends Request {
    @Path
    @NameInMap("Id")
    @Validation(required = true)
    private String id;

    private DeleteKubernetesTriggerRequest(Builder builder) {
        super(builder);
        this.id = builder.id;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteKubernetesTriggerRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return id
     */
    public String getId() {
        return this.id;
    }

    public static final class Builder extends Request.Builder<DeleteKubernetesTriggerRequest, Builder> {
        private String id; 

        private Builder() {
            super();
        } 

        private Builder(DeleteKubernetesTriggerRequest request) {
            super(request);
            this.id = request.id;
        } 

        /**
         * The ID of the application trigger.
         */
        public Builder id(String id) {
            this.putPathParameter("Id", id);
            this.id = id;
            return this;
        }

        @Override
        public DeleteKubernetesTriggerRequest build() {
            return new DeleteKubernetesTriggerRequest(this);
        } 

    } 

}
