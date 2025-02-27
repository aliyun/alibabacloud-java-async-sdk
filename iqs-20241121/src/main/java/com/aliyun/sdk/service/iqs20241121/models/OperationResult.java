// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iqs20241121.models;

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
 * {@link OperationResult} extends {@link TeaModel}
 *
 * <p>OperationResult</p>
 */
public class OperationResult extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("success")
    private Boolean success;

    private OperationResult(Builder builder) {
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static OperationResult create() {
        return builder().build();
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private Boolean success; 

        /**
         * success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public OperationResult build() {
            return new OperationResult(this);
        } 

    } 

}
