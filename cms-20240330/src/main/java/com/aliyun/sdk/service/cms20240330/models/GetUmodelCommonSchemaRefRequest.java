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
 * {@link GetUmodelCommonSchemaRefRequest} extends {@link RequestModel}
 *
 * <p>GetUmodelCommonSchemaRefRequest</p>
 */
public class GetUmodelCommonSchemaRefRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("workspace")
    @com.aliyun.core.annotation.Validation(required = true)
    private String workspace;

    private GetUmodelCommonSchemaRefRequest(Builder builder) {
        super(builder);
        this.workspace = builder.workspace;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetUmodelCommonSchemaRefRequest create() {
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

    public static final class Builder extends Request.Builder<GetUmodelCommonSchemaRefRequest, Builder> {
        private String workspace; 

        private Builder() {
            super();
        } 

        private Builder(GetUmodelCommonSchemaRefRequest request) {
            super(request);
            this.workspace = request.workspace;
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

        @Override
        public GetUmodelCommonSchemaRefRequest build() {
            return new GetUmodelCommonSchemaRefRequest(this);
        } 

    } 

}
