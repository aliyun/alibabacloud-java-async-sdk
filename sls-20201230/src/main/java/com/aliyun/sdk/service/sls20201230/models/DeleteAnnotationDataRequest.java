// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sls20201230.models;

import com.aliyun.sdk.gateway.sls.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.sls.models.*;

/**
 * 
 * {@link DeleteAnnotationDataRequest} extends {@link RequestModel}
 *
 * <p>DeleteAnnotationDataRequest</p>
 */
public class DeleteAnnotationDataRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("datasetId")
    private String datasetId;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("annotationdataId")
    private String annotationdataId;

    private DeleteAnnotationDataRequest(Builder builder) {
        super(builder);
        this.datasetId = builder.datasetId;
        this.annotationdataId = builder.annotationdataId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteAnnotationDataRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return datasetId
     */
    public String getDatasetId() {
        return this.datasetId;
    }

    /**
     * @return annotationdataId
     */
    public String getAnnotationdataId() {
        return this.annotationdataId;
    }

    public static final class Builder extends Request.Builder<DeleteAnnotationDataRequest, Builder> {
        private String datasetId; 
        private String annotationdataId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteAnnotationDataRequest request) {
            super(request);
            this.datasetId = request.datasetId;
            this.annotationdataId = request.annotationdataId;
        } 

        /**
         * <p>The unique identifier of the dataset.</p>
         * 
         * <strong>example:</strong>
         * <p>cb8cc4eb51a85e823471cdb368fae9be</p>
         */
        public Builder datasetId(String datasetId) {
            this.putPathParameter("datasetId", datasetId);
            this.datasetId = datasetId;
            return this;
        }

        /**
         * <p>The unique identifier of the data.</p>
         * 
         * <strong>example:</strong>
         * <p>2156d560fc7c01420542df92cd6365ds</p>
         */
        public Builder annotationdataId(String annotationdataId) {
            this.putPathParameter("annotationdataId", annotationdataId);
            this.annotationdataId = annotationdataId;
            return this;
        }

        @Override
        public DeleteAnnotationDataRequest build() {
            return new DeleteAnnotationDataRequest(this);
        } 

    } 

}
