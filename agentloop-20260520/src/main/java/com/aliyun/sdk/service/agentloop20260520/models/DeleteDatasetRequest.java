// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.agentloop20260520.models;

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
    @com.aliyun.core.annotation.NameInMap("agentSpace")
    @com.aliyun.core.annotation.Validation(required = true, maxLength = 64, minLength = 2)
    private String agentSpace;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("datasetName")
    @com.aliyun.core.annotation.Validation(required = true, maxLength = 64, minLength = 2)
    private String datasetName;

    private DeleteDatasetRequest(Builder builder) {
        super(builder);
        this.agentSpace = builder.agentSpace;
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
     * @return agentSpace
     */
    public String getAgentSpace() {
        return this.agentSpace;
    }

    /**
     * @return datasetName
     */
    public String getDatasetName() {
        return this.datasetName;
    }

    public static final class Builder extends Request.Builder<DeleteDatasetRequest, Builder> {
        private String agentSpace; 
        private String datasetName; 

        private Builder() {
            super();
        } 

        private Builder(DeleteDatasetRequest request) {
            super(request);
            this.agentSpace = request.agentSpace;
            this.datasetName = request.datasetName;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>sop-agent</p>
         */
        public Builder agentSpace(String agentSpace) {
            this.putPathParameter("agentSpace", agentSpace);
            this.agentSpace = agentSpace;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>product_faq_dataset</p>
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
