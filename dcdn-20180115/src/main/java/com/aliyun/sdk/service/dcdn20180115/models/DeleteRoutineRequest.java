// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dcdn20180115.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteRoutineRequest} extends {@link RequestModel}
 *
 * <p>DeleteRoutineRequest</p>
 */
public class DeleteRoutineRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Name")
    @com.aliyun.core.annotation.Validation(required = true)
    private String name;

    private DeleteRoutineRequest(Builder builder) {
        super(builder);
        this.name = builder.name;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteRoutineRequest create() {
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

    public static final class Builder extends Request.Builder<DeleteRoutineRequest, Builder> {
        private String name; 

        private Builder() {
            super();
        } 

        private Builder(DeleteRoutineRequest request) {
            super(request);
            this.name = request.name;
        } 

        /**
         * The name of the routine. The name must be unique among the routines that belong to the same Alibaba Cloud account.
         */
        public Builder name(String name) {
            this.putBodyParameter("Name", name);
            this.name = name;
            return this;
        }

        @Override
        public DeleteRoutineRequest build() {
            return new DeleteRoutineRequest(this);
        } 

    } 

}
