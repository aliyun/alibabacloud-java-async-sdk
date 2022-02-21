// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.domain20180129.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AcknowledgeTaskResultResponseBody} extends {@link TeaModel}
 *
 * <p>AcknowledgeTaskResultResponseBody</p>
 */
public class AcknowledgeTaskResultResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Result")
    private Integer result;

    private AcknowledgeTaskResultResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.result = builder.result;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AcknowledgeTaskResultResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return result
     */
    public Integer getResult() {
        return this.result;
    }

    public static final class Builder {
        private String requestId; 
        private Integer result; 

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Result.
         */
        public Builder result(Integer result) {
            this.result = result;
            return this;
        }

        public AcknowledgeTaskResultResponseBody build() {
            return new AcknowledgeTaskResultResponseBody(this);
        } 

    } 

}
