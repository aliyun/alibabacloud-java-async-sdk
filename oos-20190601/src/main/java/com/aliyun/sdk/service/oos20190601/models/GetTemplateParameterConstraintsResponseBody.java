// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.oos20190601.models;

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
 * {@link GetTemplateParameterConstraintsResponseBody} extends {@link TeaModel}
 *
 * <p>GetTemplateParameterConstraintsResponseBody</p>
 */
public class GetTemplateParameterConstraintsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ParameterConstraints")
    private java.util.Map<String, ?> parameterConstraints;

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

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return parameterConstraints
     */
    public java.util.Map<String, ?> getParameterConstraints() {
        return this.parameterConstraints;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.Map<String, ?> parameterConstraints; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(GetTemplateParameterConstraintsResponseBody model) {
            this.parameterConstraints = model.parameterConstraints;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The constraints of the parameters.</p>
         * 
         * <strong>example:</strong>
         * <p>[
         *     {
         *       &quot;Type&quot;: &quot;String&quot;,
         *       &quot;AllowedValues&quot;: [
         *         &quot;ecs.n1.tiny&quot;,
         *         &quot;ecs.r8a.4xlarge&quot;,
         *         &quot;ecs.n2.xlarge&quot;,
         *         &quot;ecs.c7.2xlarge&quot;,
         *         &quot;ecs.c8i.4xlarge&quot;,
         *         &quot;ecs.g8i.48xlarge&quot;,
         *         &quot;ecs.c8a.4xlarge&quot;,
         *         &quot;ecs.i2.4xlarge&quot;,
         *         &quot;ecs.r8y.2xlarge&quot;
         *       ],
         *       &quot;AssociationParameterNames&quot;: [
         *         &quot;RegionId&quot;,
         *         &quot;zoneId&quot;
         *       ],
         *       &quot;ParameterKey&quot;: &quot;instanceType&quot;
         *     },
         *     {
         *       &quot;Type&quot;: &quot;String&quot;,
         *       &quot;AllowedValues&quot;: [],
         *       &quot;AssociationParameterNames&quot;: [
         *         &quot;RegionId&quot;,
         *         &quot;zoneId&quot;,
         *         &quot;InstanceType&quot;
         *       ],
         *       &quot;ParameterKey&quot;: &quot;systemDiskCategory&quot;
         *     }
         *   ]</p>
         */
        public Builder parameterConstraints(java.util.Map<String, ?> parameterConstraints) {
            this.parameterConstraints = parameterConstraints;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>CBEC8072-BEC2-478E-8EAE-E723BA79CF19</p>
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
