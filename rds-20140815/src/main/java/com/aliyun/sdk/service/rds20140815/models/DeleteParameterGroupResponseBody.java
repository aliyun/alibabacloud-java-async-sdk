// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rds20140815.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteParameterGroupResponseBody} extends {@link TeaModel}
 *
 * <p>DeleteParameterGroupResponseBody</p>
 */
public class DeleteParameterGroupResponseBody extends TeaModel {
    @NameInMap("ParameterGroupId")
    private String parameterGroupId;

    @NameInMap("RequestId")
    private String requestId;

    private DeleteParameterGroupResponseBody(Builder builder) {
        this.parameterGroupId = builder.parameterGroupId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteParameterGroupResponseBody create() {
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
         * The ID of the parameter template.
         */
        public Builder parameterGroupId(String parameterGroupId) {
            this.parameterGroupId = parameterGroupId;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DeleteParameterGroupResponseBody build() {
            return new DeleteParameterGroupResponseBody(this);
        } 

    } 

}
