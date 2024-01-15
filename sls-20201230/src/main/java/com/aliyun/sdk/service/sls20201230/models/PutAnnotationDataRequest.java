// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sls20201230.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.sls.models.*;

/**
 * {@link PutAnnotationDataRequest} extends {@link RequestModel}
 *
 * <p>PutAnnotationDataRequest</p>
 */
public class PutAnnotationDataRequest extends Request {
    @Path
    @NameInMap("datasetId")
    private String datasetId;

    @Query
    @NameInMap("annotationdataId")
    private String annotationdataId;

    @Body
    @NameInMap("mlDataParam")
    private MLDataParam mlDataParam;

    @Body
    @NameInMap("rawLog")
    private java.util.List < java.util.Map<String, String>> rawLog;

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
    public java.util.List < java.util.Map<String, String>> getRawLog() {
        return this.rawLog;
    }

    public static final class Builder extends Request.Builder<PutAnnotationDataRequest, Builder> {
        private String datasetId; 
        private String annotationdataId; 
        private MLDataParam mlDataParam; 
        private java.util.List < java.util.Map<String, String>> rawLog; 

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
         * The unique identifier of the dataset.
         */
        public Builder datasetId(String datasetId) {
            this.putPathParameter("datasetId", datasetId);
            this.datasetId = datasetId;
            return this;
        }

        /**
         * The unique identifier of the data.
         */
        public Builder annotationdataId(String annotationdataId) {
            this.putQueryParameter("annotationdataId", annotationdataId);
            this.annotationdataId = annotationdataId;
            return this;
        }

        /**
         * The data structure of the request.
         */
        public Builder mlDataParam(MLDataParam mlDataParam) {
            this.putBodyParameter("mlDataParam", mlDataParam);
            this.mlDataParam = mlDataParam;
            return this;
        }

        /**
         * The raw log data.
         */
        public Builder rawLog(java.util.List < java.util.Map<String, String>> rawLog) {
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
