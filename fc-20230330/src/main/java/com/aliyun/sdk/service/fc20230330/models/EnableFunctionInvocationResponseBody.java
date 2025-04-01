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
 * {@link EnableFunctionInvocationResponseBody} extends {@link TeaModel}
 *
 * <p>EnableFunctionInvocationResponseBody</p>
 */
public class EnableFunctionInvocationResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("success")
    private Boolean success;

    private EnableFunctionInvocationResponseBody(Builder builder) {
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static EnableFunctionInvocationResponseBody create() {
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

        private Builder(EnableFunctionInvocationResponseBody model) {
            this.success = model.success;
        } 

        /**
         * success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public EnableFunctionInvocationResponseBody build() {
            return new EnableFunctionInvocationResponseBody(this);
        } 

    } 

}
