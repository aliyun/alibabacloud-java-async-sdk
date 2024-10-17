// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.nas20170626.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link CreateDataFlowResponseBody} extends {@link TeaModel}
 *
 * <p>CreateDataFlowResponseBody</p>
 */
public class CreateDataFlowResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DataFlowId")
    private String dataFlowId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private CreateDataFlowResponseBody(Builder builder) {
        this.dataFlowId = builder.dataFlowId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateDataFlowResponseBody create() {
        return builder().build();
    }

    /**
     * @return dataFlowId
     */
    public String getDataFlowId() {
        return this.dataFlowId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String dataFlowId; 
        private String requestId; 

        /**
         * <p>The dataflow ID.</p>
         * 
         * <strong>example:</strong>
         * <p>dfid-194433a5be31****</p>
         */
        public Builder dataFlowId(String dataFlowId) {
            this.dataFlowId = dataFlowId;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>473469C7-AA6F-4DC5-B3DB-A3DC0D****3E</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CreateDataFlowResponseBody build() {
            return new CreateDataFlowResponseBody(this);
        } 

    } 

}
