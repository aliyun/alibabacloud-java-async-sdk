// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sls20201230.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.sls.models.*;

/**
 * {@link MLDataParam} extends {@link TeaModel}
 *
 * <p>MLDataParam</p>
 */
public class MLDataParam extends TeaModel {
    @NameInMap("annotationdataId")
    private String annotationdataId;

    @NameInMap("annotations")
    private java.util.Map < String, MLDataParamAnnotationsValue > annotations;

    @NameInMap("config")
    private java.util.Map < String, String > config;

    @NameInMap("createTime")
    private Long createTime;

    @NameInMap("dataHash")
    private String dataHash;

    @NameInMap("datasetId")
    private String datasetId;

    @NameInMap("lastModifyTime")
    private Long lastModifyTime;

    @NameInMap("predictions")
    private java.util.Map < String, MLDataParamPredictionsValue > predictions;

    @NameInMap("value")
    private String value;

    @NameInMap("valueType")
    private String valueType;

    private MLDataParam(Builder builder) {
        this.annotationdataId = builder.annotationdataId;
        this.annotations = builder.annotations;
        this.config = builder.config;
        this.createTime = builder.createTime;
        this.dataHash = builder.dataHash;
        this.datasetId = builder.datasetId;
        this.lastModifyTime = builder.lastModifyTime;
        this.predictions = builder.predictions;
        this.value = builder.value;
        this.valueType = builder.valueType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static MLDataParam create() {
        return builder().build();
    }

    /**
     * @return annotationdataId
     */
    public String getAnnotationdataId() {
        return this.annotationdataId;
    }

    /**
     * @return annotations
     */
    public java.util.Map < String, MLDataParamAnnotationsValue > getAnnotations() {
        return this.annotations;
    }

    /**
     * @return config
     */
    public java.util.Map < String, String > getConfig() {
        return this.config;
    }

    /**
     * @return createTime
     */
    public Long getCreateTime() {
        return this.createTime;
    }

    /**
     * @return dataHash
     */
    public String getDataHash() {
        return this.dataHash;
    }

    /**
     * @return datasetId
     */
    public String getDatasetId() {
        return this.datasetId;
    }

    /**
     * @return lastModifyTime
     */
    public Long getLastModifyTime() {
        return this.lastModifyTime;
    }

    /**
     * @return predictions
     */
    public java.util.Map < String, MLDataParamPredictionsValue > getPredictions() {
        return this.predictions;
    }

    /**
     * @return value
     */
    public String getValue() {
        return this.value;
    }

    /**
     * @return valueType
     */
    public String getValueType() {
        return this.valueType;
    }

    public static final class Builder {
        private String annotationdataId; 
        private java.util.Map < String, MLDataParamAnnotationsValue > annotations; 
        private java.util.Map < String, String > config; 
        private Long createTime; 
        private String dataHash; 
        private String datasetId; 
        private Long lastModifyTime; 
        private java.util.Map < String, MLDataParamPredictionsValue > predictions; 
        private String value; 
        private String valueType; 

        /**
         * annotationdataId.
         */
        public Builder annotationdataId(String annotationdataId) {
            this.annotationdataId = annotationdataId;
            return this;
        }

        /**
         * annotations.
         */
        public Builder annotations(java.util.Map < String, MLDataParamAnnotationsValue > annotations) {
            this.annotations = annotations;
            return this;
        }

        /**
         * config.
         */
        public Builder config(java.util.Map < String, String > config) {
            this.config = config;
            return this;
        }

        /**
         * createTime.
         */
        public Builder createTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }

        /**
         * dataHash.
         */
        public Builder dataHash(String dataHash) {
            this.dataHash = dataHash;
            return this;
        }

        /**
         * datasetId.
         */
        public Builder datasetId(String datasetId) {
            this.datasetId = datasetId;
            return this;
        }

        /**
         * lastModifyTime.
         */
        public Builder lastModifyTime(Long lastModifyTime) {
            this.lastModifyTime = lastModifyTime;
            return this;
        }

        /**
         * predictions.
         */
        public Builder predictions(java.util.Map < String, MLDataParamPredictionsValue > predictions) {
            this.predictions = predictions;
            return this;
        }

        /**
         * value.
         */
        public Builder value(String value) {
            this.value = value;
            return this;
        }

        /**
         * valueType.
         */
        public Builder valueType(String valueType) {
            this.valueType = valueType;
            return this;
        }

        public MLDataParam build() {
            return new MLDataParam(this);
        } 

    } 

}
