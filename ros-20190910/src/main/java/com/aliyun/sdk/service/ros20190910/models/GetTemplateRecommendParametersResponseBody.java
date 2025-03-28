// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ros20190910.models;

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
 * {@link GetTemplateRecommendParametersResponseBody} extends {@link TeaModel}
 *
 * <p>GetTemplateRecommendParametersResponseBody</p>
 */
public class GetTemplateRecommendParametersResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RecommendParameterValues")
    private java.util.List<RecommendParameterValues> recommendParameterValues;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private GetTemplateRecommendParametersResponseBody(Builder builder) {
        this.recommendParameterValues = builder.recommendParameterValues;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetTemplateRecommendParametersResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return recommendParameterValues
     */
    public java.util.List<RecommendParameterValues> getRecommendParameterValues() {
        return this.recommendParameterValues;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List<RecommendParameterValues> recommendParameterValues; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(GetTemplateRecommendParametersResponseBody model) {
            this.recommendParameterValues = model.recommendParameterValues;
            this.requestId = model.requestId;
        } 

        /**
         * RecommendParameterValues.
         */
        public Builder recommendParameterValues(java.util.List<RecommendParameterValues> recommendParameterValues) {
            this.recommendParameterValues = recommendParameterValues;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetTemplateRecommendParametersResponseBody build() {
            return new GetTemplateRecommendParametersResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetTemplateRecommendParametersResponseBody} extends {@link TeaModel}
     *
     * <p>GetTemplateRecommendParametersResponseBody</p>
     */
    public static class RecommendParameterValues extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ParameterKey")
        private String parameterKey;

        @com.aliyun.core.annotation.NameInMap("RecommendValue")
        private String recommendValue;

        private RecommendParameterValues(Builder builder) {
            this.parameterKey = builder.parameterKey;
            this.recommendValue = builder.recommendValue;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RecommendParameterValues create() {
            return builder().build();
        }

        /**
         * @return parameterKey
         */
        public String getParameterKey() {
            return this.parameterKey;
        }

        /**
         * @return recommendValue
         */
        public String getRecommendValue() {
            return this.recommendValue;
        }

        public static final class Builder {
            private String parameterKey; 
            private String recommendValue; 

            private Builder() {
            } 

            private Builder(RecommendParameterValues model) {
                this.parameterKey = model.parameterKey;
                this.recommendValue = model.recommendValue;
            } 

            /**
             * ParameterKey.
             */
            public Builder parameterKey(String parameterKey) {
                this.parameterKey = parameterKey;
                return this;
            }

            /**
             * RecommendValue.
             */
            public Builder recommendValue(String recommendValue) {
                this.recommendValue = recommendValue;
                return this;
            }

            public RecommendParameterValues build() {
                return new RecommendParameterValues(this);
            } 

        } 

    }
}
