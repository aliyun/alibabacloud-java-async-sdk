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
 * {@link MLDataParamPredictionsValue} extends {@link TeaModel}
 *
 * <p>MLDataParamPredictionsValue</p>
 */
public class MLDataParamPredictionsValue extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("annotatedBy")
    private String annotatedBy;

    @com.aliyun.core.annotation.NameInMap("updateTime")
    private Long updateTime;

    @com.aliyun.core.annotation.NameInMap("results")
    private java.util.List<java.util.Map<String, String>> results;

    private MLDataParamPredictionsValue(Builder builder) {
        this.annotatedBy = builder.annotatedBy;
        this.updateTime = builder.updateTime;
        this.results = builder.results;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static MLDataParamPredictionsValue create() {
        return builder().build();
    }

    /**
     * @return annotatedBy
     */
    public String getAnnotatedBy() {
        return this.annotatedBy;
    }

    /**
     * @return updateTime
     */
    public Long getUpdateTime() {
        return this.updateTime;
    }

    /**
     * @return results
     */
    public java.util.List<java.util.Map<String, String>> getResults() {
        return this.results;
    }

    public static final class Builder {
        private String annotatedBy; 
        private Long updateTime; 
        private java.util.List<java.util.Map<String, String>> results; 

        /**
         * annotatedBy.
         */
        public Builder annotatedBy(String annotatedBy) {
            this.annotatedBy = annotatedBy;
            return this;
        }

        /**
         * updateTime.
         */
        public Builder updateTime(Long updateTime) {
            this.updateTime = updateTime;
            return this;
        }

        /**
         * results.
         */
        public Builder results(java.util.List<java.util.Map<String, String>> results) {
            this.results = results;
            return this;
        }

        public MLDataParamPredictionsValue build() {
            return new MLDataParamPredictionsValue(this);
        } 

    } 

}
