// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.polardb20170801.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateParameterGroupResponseBody} extends {@link TeaModel}
 *
 * <p>CreateParameterGroupResponseBody</p>
 */
public class CreateParameterGroupResponseBody extends TeaModel {
    @NameInMap("ParameterGroupId")
    private String parameterGroupId;

    @NameInMap("RequestId")
    private String requestId;

    private CreateParameterGroupResponseBody(Builder builder) {
        this.parameterGroupId = builder.parameterGroupId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateParameterGroupResponseBody create() {
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
         * <p>
         * 
         * > You can call the [DescribeParameterGroups](~~207178~~) operation to query the details of all parameter templates of a specified region, such as the ID of a parameter template.
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

        public CreateParameterGroupResponseBody build() {
            return new CreateParameterGroupResponseBody(this);
        } 

    } 

}
