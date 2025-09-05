// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.facebody20191230.models;

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
 * {@link CreateFaceDbRequest} extends {@link RequestModel}
 *
 * <p>CreateFaceDbRequest</p>
 */
public class CreateFaceDbRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Name")
    @com.aliyun.core.annotation.Validation(required = true)
    private String name;

    private CreateFaceDbRequest(Builder builder) {
        super(builder);
        this.name = builder.name;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateFaceDbRequest create() {
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

    public static final class Builder extends Request.Builder<CreateFaceDbRequest, Builder> {
        private String name; 

        private Builder() {
            super();
        } 

        private Builder(CreateFaceDbRequest request) {
            super(request);
            this.name = request.name;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>default</p>
         */
        public Builder name(String name) {
            this.putBodyParameter("Name", name);
            this.name = name;
            return this;
        }

        @Override
        public CreateFaceDbRequest build() {
            return new CreateFaceDbRequest(this);
        } 

    } 

}
