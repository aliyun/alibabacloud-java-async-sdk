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
 * {@link PutAnnotationDataRequest} extends {@link RequestModel}
 *
 * <p>PutAnnotationDataRequest</p>
 */
public class PutAnnotationDataRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("datasetId")
    private String datasetId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("annotationdataId")
    private String annotationdataId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("mlDataParam")
    private MLDataParam mlDataParam;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("rawLog")
    private java.util.List<java.util.Map<String, String>> rawLog;

    private PutAnnotationDataRequest(Builder builder) {
        super(builder);
        this.datasetId = builder.datasetId;
        this.annotationdataId = builder.annotationdataId;
        this.mlDataParam = builder.mlDataParam;
        this.rawLog = builder.rawLog;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PutAnnotationDataRequest create() {
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

    /**
     * @return mlDataParam
     */
    public MLDataParam getMlDataParam() {
        return this.mlDataParam;
    }

    /**
     * @return rawLog
     */
    public java.util.List<java.util.Map<String, String>> getRawLog() {
        return this.rawLog;
    }

    public static final class Builder extends Request.Builder<PutAnnotationDataRequest, Builder> {
        private String datasetId; 
        private String annotationdataId; 
        private MLDataParam mlDataParam; 
        private java.util.List<java.util.Map<String, String>> rawLog; 

        private Builder() {
            super();
        } 

        private Builder(PutAnnotationDataRequest request) {
            super(request);
            this.datasetId = request.datasetId;
            this.annotationdataId = request.annotationdataId;
            this.mlDataParam = request.mlDataParam;
            this.rawLog = request.rawLog;
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
            this.putQueryParameter("annotationdataId", annotationdataId);
            this.annotationdataId = annotationdataId;
            return this;
        }

        /**
         * <p>The data structure of the request.</p>
         */
        public Builder mlDataParam(MLDataParam mlDataParam) {
            this.putBodyParameter("mlDataParam", mlDataParam);
            this.mlDataParam = mlDataParam;
            return this;
        }

        /**
         * <p>The raw log data.</p>
         */
        public Builder rawLog(java.util.List<java.util.Map<String, String>> rawLog) {
            this.putBodyParameter("rawLog", rawLog);
            this.rawLog = rawLog;
            return this;
        }

        @Override
        public PutAnnotationDataRequest build() {
            return new PutAnnotationDataRequest(this);
        } 

    } 

}
