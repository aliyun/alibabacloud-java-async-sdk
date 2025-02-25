// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iacservice20210806.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DissociateParameterSetResponseBody} extends {@link TeaModel}
 *
 * <p>DissociateParameterSetResponseBody</p>
 */
public class DissociateParameterSetResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    private DissociateParameterSetResponseBody(Builder builder) {
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DissociateParameterSetResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String requestId; 

        /**
         * requestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DissociateParameterSetResponseBody build() {
            return new DissociateParameterSetResponseBody(this);
        } 

    } 

}
