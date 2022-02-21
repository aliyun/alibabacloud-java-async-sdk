// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.acm20200206.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateNamespaceRequest} extends {@link RequestModel}
 *
 * <p>CreateNamespaceRequest</p>
 */
public class CreateNamespaceRequest extends Request {
    @Body
    @NameInMap("Name")
    @Validation(required = true)
    private String name;

    private CreateNamespaceRequest(Builder builder) {
        super(builder);
        this.name = builder.name;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateNamespaceRequest create() {
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

    public static final class Builder extends Request.Builder<CreateNamespaceRequest, Builder> {
        private String name; 

        private Builder() {
            super();
        } 

        private Builder(CreateNamespaceRequest response) {
            super(response);
            this.name = response.name;
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
        public CreateNamespaceRequest build() {
            return new CreateNamespaceRequest(this);
        } 

    } 

}
