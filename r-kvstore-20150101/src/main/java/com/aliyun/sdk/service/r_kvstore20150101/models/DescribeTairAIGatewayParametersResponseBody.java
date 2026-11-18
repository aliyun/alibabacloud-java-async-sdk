// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.r_kvstore20150101.models;

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
 * {@link DescribeTairAIGatewayParametersResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeTairAIGatewayParametersResponseBody</p>
 */
public class DescribeTairAIGatewayParametersResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    private String instanceId;

    @com.aliyun.core.annotation.NameInMap("Parameters")
    private Parameters parameters;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    private DescribeTairAIGatewayParametersResponseBody(Builder builder) {
        this.instanceId = builder.instanceId;
        this.parameters = builder.parameters;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeTairAIGatewayParametersResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return parameters
     */
    public Parameters getParameters() {
        return this.parameters;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private String instanceId; 
        private Parameters parameters; 
        private String requestId; 
        private Integer totalCount; 

        private Builder() {
        } 

        private Builder(DescribeTairAIGatewayParametersResponseBody model) {
            this.instanceId = model.instanceId;
            this.parameters = model.parameters;
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
        } 

        /**
         * <p>The instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>tg-bp1zxszhcgatnx****</p>
         */
        public Builder instanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }

        /**
         * Parameters.
         */
        public Builder parameters(Parameters parameters) {
            this.parameters = parameters;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>90B82DB7-FB28-4CC2-ADBF-1F8659F3****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The number of returned parameters.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeTairAIGatewayParametersResponseBody build() {
            return new DescribeTairAIGatewayParametersResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeTairAIGatewayParametersResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeTairAIGatewayParametersResponseBody</p>
     */
    public static class ParametersParameters extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ParameterName")
        private String parameterName;

        @com.aliyun.core.annotation.NameInMap("ParameterValue")
        private String parameterValue;

        private ParametersParameters(Builder builder) {
            this.parameterName = builder.parameterName;
            this.parameterValue = builder.parameterValue;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ParametersParameters create() {
            return builder().build();
        }

        /**
         * @return parameterName
         */
        public String getParameterName() {
            return this.parameterName;
        }

        /**
         * @return parameterValue
         */
        public String getParameterValue() {
            return this.parameterValue;
        }

        public static final class Builder {
            private String parameterName; 
            private String parameterValue; 

            private Builder() {
            } 

            private Builder(ParametersParameters model) {
                this.parameterName = model.parameterName;
                this.parameterValue = model.parameterValue;
            } 

            /**
             * ParameterName.
             */
            public Builder parameterName(String parameterName) {
                this.parameterName = parameterName;
                return this;
            }

            /**
             * ParameterValue.
             */
            public Builder parameterValue(String parameterValue) {
                this.parameterValue = parameterValue;
                return this;
            }

            public ParametersParameters build() {
                return new ParametersParameters(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeTairAIGatewayParametersResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeTairAIGatewayParametersResponseBody</p>
     */
    public static class Parameters extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Parameters")
        private java.util.List<ParametersParameters> parameters;

        private Parameters(Builder builder) {
            this.parameters = builder.parameters;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Parameters create() {
            return builder().build();
        }

        /**
         * @return parameters
         */
        public java.util.List<ParametersParameters> getParameters() {
            return this.parameters;
        }

        public static final class Builder {
            private java.util.List<ParametersParameters> parameters; 

            private Builder() {
            } 

            private Builder(Parameters model) {
                this.parameters = model.parameters;
            } 

            /**
             * Parameters.
             */
            public Builder parameters(java.util.List<ParametersParameters> parameters) {
                this.parameters = parameters;
                return this;
            }

            public Parameters build() {
                return new Parameters(this);
            } 

        } 

    }
}
