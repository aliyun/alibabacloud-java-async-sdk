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
 * {@link ExecuteTerraformApplyResponseBody} extends {@link TeaModel}
 *
 * <p>ExecuteTerraformApplyResponseBody</p>
 */
public class ExecuteTerraformApplyResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("stateId")
    private String stateId;

    private ExecuteTerraformApplyResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.stateId = builder.stateId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ExecuteTerraformApplyResponseBody create() {
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

        private Builder(ExecuteTerraformApplyResponseBody model) {
            this.requestId = model.requestId;
            this.stateId = model.stateId;
        } 

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>C896FE0A-1BEA-5D01-BFF4-B03B82B9CA3D</p>
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

        public ExecuteTerraformApplyResponseBody build() {
            return new ExecuteTerraformApplyResponseBody(this);
        } 

    } 

}
