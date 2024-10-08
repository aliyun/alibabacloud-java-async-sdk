// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.esa20240910.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DeleteScheduledPreloadExecutionRequest} extends {@link RequestModel}
 *
 * <p>DeleteScheduledPreloadExecutionRequest</p>
 */
public class DeleteScheduledPreloadExecutionRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Id")
    @com.aliyun.core.annotation.Validation(required = true)
    private String id;

    private DeleteScheduledPreloadExecutionRequest(Builder builder) {
        super(builder);
        this.id = builder.id;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteScheduledPreloadExecutionRequest create() {
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

    public static final class Builder extends Request.Builder<DeleteScheduledPreloadExecutionRequest, Builder> {
        private String id; 

        private Builder() {
            super();
        } 

        private Builder(DeleteScheduledPreloadExecutionRequest request) {
            super(request);
            this.id = request.id;
        } 

        /**
         * Id.
         */
        public Builder id(String id) {
            this.putQueryParameter("Id", id);
            this.id = id;
            return this;
        }

        @Override
        public DeleteScheduledPreloadExecutionRequest build() {
            return new DeleteScheduledPreloadExecutionRequest(this);
        } 

    } 

}
