// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.nas20170626.models;

import com.aliyun.sdk.gateway.pop.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
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
         * <p>The ID of the data streaming task.</p>
         * 
         * <strong>example:</strong>
         * <p>subTaskId-370kyfmyknxcyzw****</p>
         */
        public Builder dataFlowSubTaskId(String dataFlowSubTaskId) {
            this.dataFlowSubTaskId = dataFlowSubTaskId;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>A70BEE5D-76D3-49FB-B58F-1F398211A5C3</p>
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
