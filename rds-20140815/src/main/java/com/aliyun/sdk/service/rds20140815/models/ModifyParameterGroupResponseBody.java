// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rds20140815.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyParameterGroupResponseBody} extends {@link TeaModel}
 *
 * <p>ModifyParameterGroupResponseBody</p>
 */
public class ModifyParameterGroupResponseBody extends TeaModel {
    @NameInMap("ParameterGroupId")
    private String parameterGroupId;

    @NameInMap("RequestId")
    private String requestId;

    private ModifyParameterGroupResponseBody(Builder builder) {
        this.parameterGroupId = builder.parameterGroupId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyParameterGroupResponseBody create() {
        return builder().build();
    }

    /**
     * @return parameterGroupId
     */
    public String getParameterGroupId() {
        return this.parameterGroupId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String parameterGroupId; 
        private String requestId; 

        /**
         * ParameterGroupId.
         */
        public Builder parameterGroupId(String parameterGroupId) {
            this.parameterGroupId = parameterGroupId;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ModifyParameterGroupResponseBody build() {
            return new ModifyParameterGroupResponseBody(this);
        } 

    } 

}
