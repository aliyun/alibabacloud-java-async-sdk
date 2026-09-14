// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.agentloop20260520.models;

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
 * {@link CreateEvaluatorResponseBody} extends {@link TeaModel}
 *
 * <p>CreateEvaluatorResponseBody</p>
 */
public class CreateEvaluatorResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("name")
    private String name;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("version")
    private String version;

    private CreateEvaluatorResponseBody(Builder builder) {
        this.name = builder.name;
        this.requestId = builder.requestId;
        this.version = builder.version;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateEvaluatorResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return version
     */
    public String getVersion() {
        return this.version;
    }

    public static final class Builder {
        private String name; 
        private String requestId; 
        private String version; 

        private Builder() {
        } 

        private Builder(CreateEvaluatorResponseBody model) {
            this.name = model.name;
            this.requestId = model.requestId;
            this.version = model.version;
        } 

        /**
         * <p>The evaluator name.</p>
         * 
         * <strong>example:</strong>
         * <p>trace_task_completion</p>
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>3FE4CD1E-FF41-56BE-B590-7A021D9C1524</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The version number that is created.</p>
         * 
         * <strong>example:</strong>
         * <p>1.0.0</p>
         */
        public Builder version(String version) {
            this.version = version;
            return this;
        }

        public CreateEvaluatorResponseBody build() {
            return new CreateEvaluatorResponseBody(this);
        } 

    } 

}
