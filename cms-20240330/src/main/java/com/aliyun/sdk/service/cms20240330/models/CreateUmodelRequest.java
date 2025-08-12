// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20240330.models;

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
 * {@link CreateUmodelRequest} extends {@link RequestModel}
 *
 * <p>CreateUmodelRequest</p>
 */
public class CreateUmodelRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("workspace")
    @com.aliyun.core.annotation.Validation(required = true)
    private String workspace;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("description")
    private String description;

    private CreateUmodelRequest(Builder builder) {
        super(builder);
        this.workspace = builder.workspace;
        this.description = builder.description;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateUmodelRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return workspace
     */
    public String getWorkspace() {
        return this.workspace;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    public static final class Builder extends Request.Builder<CreateUmodelRequest, Builder> {
        private String workspace; 
        private String description; 

        private Builder() {
            super();
        } 

        private Builder(CreateUmodelRequest request) {
            super(request);
            this.workspace = request.workspace;
            this.description = request.description;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>workspace-test</p>
         */
        public Builder workspace(String workspace) {
            this.putPathParameter("workspace", workspace);
            this.workspace = workspace;
            return this;
        }

        /**
         * description.
         */
        public Builder description(String description) {
            this.putBodyParameter("description", description);
            this.description = description;
            return this;
        }

        @Override
        public CreateUmodelRequest build() {
            return new CreateUmodelRequest(this);
        } 

    } 

}
