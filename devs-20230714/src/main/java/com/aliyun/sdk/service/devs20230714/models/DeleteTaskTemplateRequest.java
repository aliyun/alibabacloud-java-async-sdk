// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.devs20230714.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteTaskTemplateRequest} extends {@link RequestModel}
 *
 * <p>DeleteTaskTemplateRequest</p>
 */
public class DeleteTaskTemplateRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("name")
    private String name;

    private DeleteTaskTemplateRequest(Builder builder) {
        super(builder);
        this.name = builder.name;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteTaskTemplateRequest create() {
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

    public static final class Builder extends Request.Builder<DeleteTaskTemplateRequest, Builder> {
        private String name; 

        private Builder() {
            super();
        } 

        private Builder(DeleteTaskTemplateRequest request) {
            super(request);
            this.name = request.name;
        } 

        /**
         * name.
         */
        public Builder name(String name) {
            this.putPathParameter("name", name);
            this.name = name;
            return this;
        }

        @Override
        public DeleteTaskTemplateRequest build() {
            return new DeleteTaskTemplateRequest(this);
        } 

    } 

}
