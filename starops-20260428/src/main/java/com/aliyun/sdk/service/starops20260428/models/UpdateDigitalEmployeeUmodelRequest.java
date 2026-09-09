// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.starops20260428.models;

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
 * {@link UpdateDigitalEmployeeUmodelRequest} extends {@link RequestModel}
 *
 * <p>UpdateDigitalEmployeeUmodelRequest</p>
 */
public class UpdateDigitalEmployeeUmodelRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("name")
    @com.aliyun.core.annotation.Validation(required = true, maxLength = 64)
    private String name;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("description")
    @com.aliyun.core.annotation.Validation(required = true, maxLength = 4096)
    private String description;

    private UpdateDigitalEmployeeUmodelRequest(Builder builder) {
        super(builder);
        this.name = builder.name;
        this.description = builder.description;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateDigitalEmployeeUmodelRequest create() {
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

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    public static final class Builder extends Request.Builder<UpdateDigitalEmployeeUmodelRequest, Builder> {
        private String name; 
        private String description; 

        private Builder() {
            super();
        } 

        private Builder(UpdateDigitalEmployeeUmodelRequest request) {
            super(request);
            this.name = request.name;
            this.description = request.description;
        } 

        /**
         * <p>The name of the digital human whose UModel you want to update.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>sample-agent</p>
         */
        public Builder name(String name) {
            this.putPathParameter("name", name);
            this.name = name;
            return this;
        }

        /**
         * <p>The updated UModel description of the digital human.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>Sample description</p>
         */
        public Builder description(String description) {
            this.putBodyParameter("description", description);
            this.description = description;
            return this;
        }

        @Override
        public UpdateDigitalEmployeeUmodelRequest build() {
            return new UpdateDigitalEmployeeUmodelRequest(this);
        } 

    } 

}
