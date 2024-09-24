// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.nas20170626.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateDataFlowSubTaskResponseBody} extends {@link TeaModel}
 *
 * <p>CreateDataFlowSubTaskResponseBody</p>
 */
public class CreateDataFlowSubTaskResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DataFlowSubTaskId")
    private String dataFlowSubTaskId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private CreateDataFlowSubTaskResponseBody(Builder builder) {
        this.dataFlowSubTaskId = builder.dataFlowSubTaskId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateDataFlowSubTaskResponseBody create() {
        return builder().build();
    }

    /**
     * @return dataFlowSubTaskId
     */
    public String getDataFlowSubTaskId() {
        return this.dataFlowSubTaskId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String dataFlowSubTaskId; 
        private String requestId; 

        /**
         * DataFlowSubTaskId.
         */
        public Builder dataFlowSubTaskId(String dataFlowSubTaskId) {
            this.dataFlowSubTaskId = dataFlowSubTaskId;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CreateDataFlowSubTaskResponseBody build() {
            return new CreateDataFlowSubTaskResponseBody(this);
        } 

    } 

}
