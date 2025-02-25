// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.facebody20191230.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteFaceDbRequest} extends {@link RequestModel}
 *
 * <p>DeleteFaceDbRequest</p>
 */
public class DeleteFaceDbRequest extends Request {
    @Body
    @NameInMap("Name")
    @Validation(required = true)
    private String name;

    private DeleteFaceDbRequest(Builder builder) {
        super(builder);
        this.name = builder.name;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteFaceDbRequest create() {
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

    public static final class Builder extends Request.Builder<DeleteFaceDbRequest, Builder> {
        private String name; 

        private Builder() {
            super();
        } 

        private Builder(DeleteFaceDbRequest request) {
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
        public DeleteFaceDbRequest build() {
            return new DeleteFaceDbRequest(this);
        } 

    } 

}
