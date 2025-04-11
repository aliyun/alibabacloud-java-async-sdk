// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.fc20230330.models;

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
 * {@link DisableFunctionInvocationResponseBody} extends {@link TeaModel}
 *
 * <p>DisableFunctionInvocationResponseBody</p>
 */
public class DisableFunctionInvocationResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("success")
    private Boolean success;

    private DisableFunctionInvocationResponseBody(Builder builder) {
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DisableFunctionInvocationResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private Boolean success; 

        private Builder() {
        } 

        private Builder(DisableFunctionInvocationResponseBody model) {
            this.success = model.success;
        } 

        /**
         * <p>Indicates whether the request is successful.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public DisableFunctionInvocationResponseBody build() {
            return new DisableFunctionInvocationResponseBody(this);
        } 

    } 

}
