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
 * {@link DeleteDatasetRequest} extends {@link RequestModel}
 *
 * <p>DeleteDatasetRequest</p>
 */
public class DeleteDatasetRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("workspace")
    @com.aliyun.core.annotation.Validation(required = true, maxLength = 64, minLength = 2)
    private String workspace;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("datasetName")
    @com.aliyun.core.annotation.Validation(required = true, maxLength = 64, minLength = 2)
    private String datasetName;

    private DeleteDatasetRequest(Builder builder) {
        super(builder);
        this.workspace = builder.workspace;
        this.datasetName = builder.datasetName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteDatasetRequest create() {
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
     * @return datasetName
     */
    public String getDatasetName() {
        return this.datasetName;
    }

    public static final class Builder extends Request.Builder<DeleteDatasetRequest, Builder> {
        private String workspace; 
        private String datasetName; 

        private Builder() {
            super();
        } 

        private Builder(DeleteDatasetRequest request) {
            super(request);
            this.workspace = request.workspace;
            this.datasetName = request.datasetName;
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
         * <p>test_dataset</p>
         */
        public Builder datasetName(String datasetName) {
            this.putPathParameter("datasetName", datasetName);
            this.datasetName = datasetName;
            return this;
        }

        @Override
        public DeleteDatasetRequest build() {
            return new DeleteDatasetRequest(this);
        } 

    } 

}
