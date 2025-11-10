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
 * {@link DeleteUmodelCommonSchemaRefRequest} extends {@link RequestModel}
 *
 * <p>DeleteUmodelCommonSchemaRefRequest</p>
 */
public class DeleteUmodelCommonSchemaRefRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("workspace")
    @com.aliyun.core.annotation.Validation(required = true)
    private String workspace;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("group")
    @com.aliyun.core.annotation.Validation(required = true)
    private String group;

    private DeleteUmodelCommonSchemaRefRequest(Builder builder) {
        super(builder);
        this.workspace = builder.workspace;
        this.group = builder.group;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteUmodelCommonSchemaRefRequest create() {
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
     * @return group
     */
    public String getGroup() {
        return this.group;
    }

    public static final class Builder extends Request.Builder<DeleteUmodelCommonSchemaRefRequest, Builder> {
        private String workspace; 
        private String group; 

        private Builder() {
            super();
        } 

        private Builder(DeleteUmodelCommonSchemaRefRequest request) {
            super(request);
            this.workspace = request.workspace;
            this.group = request.group;
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
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>apm-common</p>
         */
        public Builder group(String group) {
            this.putQueryParameter("group", group);
            this.group = group;
            return this;
        }

        @Override
        public DeleteUmodelCommonSchemaRefRequest build() {
            return new DeleteUmodelCommonSchemaRefRequest(this);
        } 

    } 

}
