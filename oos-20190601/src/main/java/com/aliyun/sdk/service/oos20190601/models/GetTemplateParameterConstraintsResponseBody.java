// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.oos20190601.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link GetTemplateParameterConstraintsResponseBody} extends {@link TeaModel}
 *
 * <p>GetTemplateParameterConstraintsResponseBody</p>
 */
public class GetTemplateParameterConstraintsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ParameterConstraints")
    private java.util.Map < String, ? > parameterConstraints;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private GetTemplateParameterConstraintsResponseBody(Builder builder) {
        this.parameterConstraints = builder.parameterConstraints;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetTemplateParameterConstraintsResponseBody create() {
        return builder().build();
    }

    /**
     * @return parameterConstraints
     */
    public java.util.Map < String, ? > getParameterConstraints() {
        return this.parameterConstraints;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.Map < String, ? > parameterConstraints; 
        private String requestId; 

        /**
         * ParameterConstraints.
         */
        public Builder parameterConstraints(java.util.Map < String, ? > parameterConstraints) {
            this.parameterConstraints = parameterConstraints;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetTemplateParameterConstraintsResponseBody build() {
            return new GetTemplateParameterConstraintsResponseBody(this);
        } 

    } 

}
