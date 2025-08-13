// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.xtee20210910.models;

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
 * {@link DescribeModelDetailsByIdResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeModelDetailsByIdResponseBody</p>
 */
public class DescribeModelDetailsByIdResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("ResultObject")
    private java.util.List<ResultObject> resultObject;

    private DescribeModelDetailsByIdResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.resultObject = builder.resultObject;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeModelDetailsByIdResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return resultObject
     */
    public java.util.List<ResultObject> getResultObject() {
        return this.resultObject;
    }

    public static final class Builder {
        private String requestId; 
        private java.util.List<ResultObject> resultObject; 

        private Builder() {
        } 

        private Builder(DescribeModelDetailsByIdResponseBody model) {
            this.requestId = model.requestId;
            this.resultObject = model.resultObject;
        } 

        /**
         * <p>Request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>A32FE941-35F2-5378-B37C-4B8FDB16F094</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Returned result information</p>
         */
        public Builder resultObject(java.util.List<ResultObject> resultObject) {
            this.resultObject = resultObject;
            return this;
        }

        public DescribeModelDetailsByIdResponseBody build() {
            return new DescribeModelDetailsByIdResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeModelDetailsByIdResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeModelDetailsByIdResponseBody</p>
     */
    public static class ResultObject extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("modelEffectEvaluation")
        private String modelEffectEvaluation;

        private ResultObject(Builder builder) {
            this.modelEffectEvaluation = builder.modelEffectEvaluation;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ResultObject create() {
            return builder().build();
        }

        /**
         * @return modelEffectEvaluation
         */
        public String getModelEffectEvaluation() {
            return this.modelEffectEvaluation;
        }

        public static final class Builder {
            private String modelEffectEvaluation; 

            private Builder() {
            } 

            private Builder(ResultObject model) {
                this.modelEffectEvaluation = model.modelEffectEvaluation;
            } 

            /**
             * <p>Model prediction result.</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;AUC&quot;:0.9895246624946594,&quot;Count&quot;:2489,&quot;DecisionMark&quot;:[0.0,0.0010000000474974513,0.05287817938420348,0.0]}</p>
             */
            public Builder modelEffectEvaluation(String modelEffectEvaluation) {
                this.modelEffectEvaluation = modelEffectEvaluation;
                return this;
            }

            public ResultObject build() {
                return new ResultObject(this);
            } 

        } 

    }
}
