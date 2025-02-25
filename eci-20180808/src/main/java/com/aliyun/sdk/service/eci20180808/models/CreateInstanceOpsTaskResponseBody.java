// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eci20180808.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link CreateInstanceOpsTaskResponseBody} extends {@link TeaModel}
 *
 * <p>CreateInstanceOpsTaskResponseBody</p>
 */
public class CreateInstanceOpsTaskResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Result")
    private String result;

    private CreateInstanceOpsTaskResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.result = builder.result;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateInstanceOpsTaskResponseBody create() {
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
    public String getResult() {
        return this.result;
    }

    public static final class Builder {
        private String requestId; 
        private String result; 

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>89945DD3-9072-47D0-A318-353284CFC7B</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The creation result of the O&amp;M task.</p>
         * 
         * <strong>example:</strong>
         * <p>Coredump settings has been configured successfully.</p>
         */
        public Builder result(String result) {
            this.result = result;
            return this;
        }

        public CreateInstanceOpsTaskResponseBody build() {
            return new CreateInstanceOpsTaskResponseBody(this);
        } 

    } 

}
