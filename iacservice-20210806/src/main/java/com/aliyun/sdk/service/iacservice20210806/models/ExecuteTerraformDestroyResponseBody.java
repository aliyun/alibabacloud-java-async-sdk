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
 * {@link ExecuteTerraformDestroyResponseBody} extends {@link TeaModel}
 *
 * <p>ExecuteTerraformDestroyResponseBody</p>
 */
public class ExecuteTerraformDestroyResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("stateId")
    private String stateId;

    private ExecuteTerraformDestroyResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.stateId = builder.stateId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ExecuteTerraformDestroyResponseBody create() {
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

        private Builder(ExecuteTerraformDestroyResponseBody model) {
            this.requestId = model.requestId;
            this.stateId = model.stateId;
        } 

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>BF72A6FB-B071-5F2E-A036-9D62545B962C</p>
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

        public ExecuteTerraformDestroyResponseBody build() {
            return new ExecuteTerraformDestroyResponseBody(this);
        } 

    } 

}
