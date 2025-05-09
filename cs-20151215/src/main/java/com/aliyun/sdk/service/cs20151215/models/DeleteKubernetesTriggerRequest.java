// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cs20151215.models;

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
 * {@link DeleteKubernetesTriggerRequest} extends {@link RequestModel}
 *
 * <p>DeleteKubernetesTriggerRequest</p>
 */
public class DeleteKubernetesTriggerRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("Id")
    @com.aliyun.core.annotation.Validation(required = true)
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
         * <p>The ID of the application trigger.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>c5cdf7e3938bc4f8eb0e44b21a80f****</p>
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
