// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iacservice20210806.models;

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
 * {@link ExecuteTerraformPlanResponseBody} extends {@link TeaModel}
 *
 * <p>ExecuteTerraformPlanResponseBody</p>
 */
public class ExecuteTerraformPlanResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("stateId")
    private String stateId;

    private ExecuteTerraformPlanResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.stateId = builder.stateId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ExecuteTerraformPlanResponseBody create() {
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
     * @return stateId
     */
    public String getStateId() {
        return this.stateId;
    }

    public static final class Builder {
        private String requestId; 
        private String stateId; 

        private Builder() {
        } 

        private Builder(ExecuteTerraformPlanResponseBody model) {
            this.requestId = model.requestId;
            this.stateId = model.stateId;
        } 

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>0D298375-F92F-5B65-82E4-EA68F02521F1</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * stateId.
         */
        public Builder stateId(String stateId) {
            this.stateId = stateId;
            return this;
        }

        public ExecuteTerraformPlanResponseBody build() {
            return new ExecuteTerraformPlanResponseBody(this);
        } 

    } 

}
