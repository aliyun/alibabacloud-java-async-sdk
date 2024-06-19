// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.r_kvstore20150101.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateParameterGroupResponseBody} extends {@link TeaModel}
 *
 * <p>CreateParameterGroupResponseBody</p>
 */
public class CreateParameterGroupResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ParamGroupId")
    private String paramGroupId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private CreateParameterGroupResponseBody(Builder builder) {
        this.paramGroupId = builder.paramGroupId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateParameterGroupResponseBody create() {
        return builder().build();
    }

    /**
     * @return paramGroupId
     */
    public String getParamGroupId() {
        return this.paramGroupId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String paramGroupId; 
        private String requestId; 

        /**
         * ParamGroupId.
         */
        public Builder paramGroupId(String paramGroupId) {
            this.paramGroupId = paramGroupId;
            return this;
        }

        /**
         * RequestId.
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
