// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20200518.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateManualDagResponseBody} extends {@link TeaModel}
 *
 * <p>CreateManualDagResponseBody</p>
 */
public class CreateManualDagResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DagId")
    private Long dagId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private CreateManualDagResponseBody(Builder builder) {
        this.dagId = builder.dagId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateManualDagResponseBody create() {
        return builder().build();
    }

    /**
     * @return dagId
     */
    public Long getDagId() {
        return this.dagId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Long dagId; 
        private String requestId; 

        /**
         * The ID of the DAG for the manually triggered workflow. You can call an operation with this parameter as a request parameter to query the details and states of the nodes in the manually triggered workflow.
         */
        public Builder dagId(Long dagId) {
            this.dagId = dagId;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CreateManualDagResponseBody build() {
            return new CreateManualDagResponseBody(this);
        } 

    } 

}
